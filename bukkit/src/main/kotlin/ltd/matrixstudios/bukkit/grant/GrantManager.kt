package ltd.matrixstudios.bukkit.grant

import ltd.matrixstudios.bukkit.PioneerBukkit
import org.bukkit.command.CommandSender
import org.bukkit.entity.Player
import java.util.UUID

object GrantManager {

    fun getGrantsForTarget(target: UUID): Collection<Grant>
    {
        val grants = PioneerBukkit.instance.grantService.get(target.toString()).execute()

        if (grants.isSuccessful)
        {
            if (grants.body() != null)
            {
                return grants.body()!!
            }
        }

        return mutableListOf()
    }

    fun addGrantToPlayer(target: UUID, grant: Grant)
    {
        val body = mapOf<String, Any>(
            "reason" to grant.reason,
            "executor" to grant.executor,
            "duration" to grant.duration,
            "rank" to grant.rank
        )

        PioneerBukkit.instance.grantService.addTo(target.toString(), body).execute()

    }

    fun getSenderUUID(sender: CommandSender): UUID
    {
        if (sender is Player)
        {
            return sender.uniqueId
        } else return UUID.fromString("00000000-0000-0000-0000-000000000000")

    }
}