package ltd.matrixstudios.bukkit.grant.commands

import co.aikar.commands.BaseCommand
import co.aikar.commands.annotation.CommandAlias
import co.aikar.commands.annotation.CommandCompletion
import co.aikar.commands.annotation.CommandPermission
import co.aikar.commands.annotation.Name
import ltd.matrixstudios.bukkit.grant.Grant
import ltd.matrixstudios.bukkit.grant.GrantManager
import ltd.matrixstudios.bukkit.profiles.Profile
import ltd.matrixstudios.bukkit.ranks.Rank
import ltd.matrixstudios.bukkit.utils.Chat
import ltd.matrixstudios.bukkit.utils.TimeUtil
import org.bukkit.command.CommandSender
import java.util.*

class CGrantCommand : BaseCommand() {

    @CommandAlias("cgrant")
    @CommandPermission("alchemist.grants.admin")
    @CommandCompletion("@gameprofile")
    fun ogrant(
        sender: CommandSender,
        @Name("target") profile: Profile,
        @Name("rank") rank: Rank,
        @Name("duration") duration: String,
        @Name("reason") reason: String
    ) {

        val grant = Grant(
            UUID.randomUUID(),
            profile.uuid,
            GrantManager.getSenderUUID(sender),
            TimeUtil.parseTime(duration).toLong(),
            System.currentTimeMillis(),
            0L, reason, rank.id,
            null, null
        )

        GrantManager.addGrantToPlayer(profile.uuid, grant)

        sender.sendMessage(Chat.format("&aGranted " + profile.username + " the rank " + rank.color + rank.displayName))
    }
}