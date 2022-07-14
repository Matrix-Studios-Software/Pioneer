package ltd.matrixstudios.bukkit.ranks.commands

import co.aikar.commands.BaseCommand
import co.aikar.commands.annotation.CommandAlias
import co.aikar.commands.annotation.CommandPermission
import co.aikar.commands.annotation.Name
import co.aikar.commands.annotation.Subcommand
import ltd.matrixstudios.bukkit.PioneerBukkit
import ltd.matrixstudios.bukkit.ranks.RankHandler
import ltd.matrixstudios.bukkit.utils.Chat
import org.bukkit.command.CommandSender

@CommandAlias("rank")
@CommandPermission("pioneer.ranks.admin")
class RankCommands : BaseCommand() {

    @Subcommand("create")
    fun create(sender: CommandSender, @Name("rankName") name: String)
    {
        if (RankHandler.exists(name))
        {
            sender.sendMessage(Chat.format("&cRank already exists!"))
            return
        }

        PioneerBukkit.instance.rankService.make(name).execute()
        RankHandler.recache(name.toLowerCase())

        sender.sendMessage(Chat.format("&eCreated a new rank with the name &f$name"))
    }
}