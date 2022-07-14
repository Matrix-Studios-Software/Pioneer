package ltd.matrixstudios.bukkit.profiles.listeners

import com.google.common.base.Stopwatch
import com.google.gson.JsonObject
import ltd.matrixstudios.bukkit.PioneerBukkit
import ltd.matrixstudios.bukkit.profiles.Profile
import ltd.matrixstudios.bukkit.profiles.ProfileManager
import org.apache.commons.lang.time.StopWatch
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.AsyncPlayerPreLoginEvent
import java.util.concurrent.TimeUnit

class GeneralCreationListener : Listener {

    @EventHandler
    fun asyncJoin(e: AsyncPlayerPreLoginEvent)
    {
        val uuid = e.uniqueId

        val startingTime = System.currentTimeMillis()

        ProfileManager.load(uuid, e.name)

        val profile = ProfileManager.profiles[uuid]

        println(profile!!.username)

        println("Profiles took ${System.currentTimeMillis() - startingTime}ms to create or recache the profile")
    }
}