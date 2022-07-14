package ltd.matrixstudios.bukkit.profiles.sync

import ltd.matrixstudios.bukkit.PioneerBukkit
import ltd.matrixstudios.bukkit.profiles.ProfileManager
import ltd.matrixstudios.bukkit.profiles.ProfileService
import org.bukkit.scheduler.BukkitRunnable

object APIToServerSyncTask : BukkitRunnable() {

    var lastSynced = 0L

    override fun run() {
        val players = PioneerBukkit.instance.profileService.fetch().execute()

        if (players.isSuccessful && players.body() != null)
        {
            players.body()!!.forEach {
                ProfileManager.profiles[it.uuid] = it
            }
        }

        lastSynced = System.currentTimeMillis()
    }
}