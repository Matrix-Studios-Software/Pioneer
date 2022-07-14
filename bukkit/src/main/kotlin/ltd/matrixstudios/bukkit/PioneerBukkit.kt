package ltd.matrixstudios.bukkit

import co.aikar.commands.BukkitCommandManager
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.google.gson.LongSerializationPolicy
import ltd.matrixstudios.bukkit.contact.AuthSessionChecker
import ltd.matrixstudios.bukkit.context.ProfileContext
import ltd.matrixstudios.bukkit.context.RankContext
import ltd.matrixstudios.bukkit.grant.GrantService
import ltd.matrixstudios.bukkit.grant.commands.CGrantCommand
import ltd.matrixstudios.bukkit.grant.commands.GrantsCommand
import ltd.matrixstudios.bukkit.profiles.Profile
import ltd.matrixstudios.bukkit.profiles.ProfileManager
import ltd.matrixstudios.bukkit.profiles.ProfileService
import ltd.matrixstudios.bukkit.profiles.listeners.GeneralCreationListener
import ltd.matrixstudios.bukkit.profiles.sync.APIToServerSyncTask
import ltd.matrixstudios.bukkit.ranks.Rank
import ltd.matrixstudios.bukkit.ranks.RankHandler
import ltd.matrixstudios.bukkit.ranks.RankService
import ltd.matrixstudios.bukkit.ranks.commands.RankCommands
import ltd.matrixstudios.bukkit.tags.TagService
import ltd.matrixstudios.bukkit.tags.commands.TagCommands
import ltd.matrixstudios.bukkit.utils.menu.listener.MenuListener
import okhttp3.OkHttpClient
import org.bukkit.plugin.java.JavaPlugin
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create
import java.util.concurrent.TimeUnit

class PioneerBukkit : JavaPlugin() {

    val gson: Gson = GsonBuilder().setPrettyPrinting().serializeNulls().setLongSerializationPolicy(LongSerializationPolicy.STRING).create()

    val okHttpClient = OkHttpClient.Builder().addInterceptor(AuthSessionChecker()).build()

    val retrofit: Retrofit = Retrofit.Builder()
        .baseUrl("http://127.0.0.1:5772/api/")
        .client(okHttpClient)
        .addConverterFactory(
        GsonConverterFactory.create(gson)
    ).build()

    lateinit var rankService: RankService
    lateinit var profileService: ProfileService
    lateinit var grantService: GrantService
    lateinit var tagService: TagService

    companion object
    {
        lateinit var instance: PioneerBukkit
    }

    override fun onEnable() {
        instance = this

        loadServices()
        loadHandlers()
        registerCommands()
        registerListeners()
        runTasks()
    }

    fun runTasks()
    {
        (APIToServerSyncTask).runTaskTimerAsynchronously(this, 0L, TimeUnit.MINUTES.toMillis(1L))
    }

    fun registerListeners()
    {
        server.pluginManager.registerEvents(GeneralCreationListener(), this)
        server.pluginManager.registerEvents(MenuListener(), this)
    }

    fun registerCommands()
    {
        val commandHandler = BukkitCommandManager(
            this
        ).apply {
            this.commandContexts.registerContext(Rank::class.java, RankContext())
            this.commandContexts.registerContext(Profile::class.java, ProfileContext())

            this.registerCommand(RankCommands())
            this.registerCommand(CGrantCommand())
            this.registerCommand(GrantsCommand())
            this.registerCommand(TagCommands())
        }
    }

    fun loadHandlers()
    {
        RankHandler.loadIntoHashMap()
    }

    fun loadServices()
    {
        rankService = retrofit.create(RankService::class.java)
        profileService = retrofit.create(ProfileService::class.java)
        grantService = retrofit.create(GrantService::class.java)
        tagService = retrofit.create(TagService::class.java)
    }
}