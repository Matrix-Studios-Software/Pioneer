package ltd.matrixstudios.bukkit.profiles

import ltd.matrixstudios.bukkit.PioneerBukkit
import ltd.matrixstudios.bukkit.utils.Chat
import org.bukkit.Bukkit
import java.util.UUID

object ProfileManager {

    val profiles = hashMapOf<UUID, Profile>()


    fun isInCache(id: UUID) : Boolean
    {
        return profiles.containsKey(id)
    }

    fun load(uuid: UUID, username: String)
    {
        val data = mapOf<String, Any>("username" to username)

        val pendingExecution =  PioneerBukkit.instance.profileService.load(uuid.toString(), data).execute()

        if (pendingExecution.isSuccessful && pendingExecution.body() != null)
        {
            profiles[uuid] = pendingExecution.body()!!
        } else {
            val player = Bukkit.getPlayer(uuid)

            if (player != null && player.isOnline)
            {
                player.kickPlayer(Chat.format("&cThere was an issue loading your profile!"))
            }
        }
    }
}