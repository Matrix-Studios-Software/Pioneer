package ltd.matrixstudios.bukkit.tags.commands

import co.aikar.commands.BaseCommand
import co.aikar.commands.annotation.CommandAlias
import co.aikar.commands.annotation.CommandPermission
import co.aikar.commands.annotation.Name
import co.aikar.commands.annotation.Subcommand
import ltd.matrixstudios.bukkit.PioneerBukkit
import ltd.matrixstudios.bukkit.ranks.RankHandler
import ltd.matrixstudios.bukkit.tags.TagHandler
import ltd.matrixstudios.bukkit.utils.Chat
import org.bukkit.command.CommandSender

@CommandAlias("tag")
@CommandPermission("pioneer.tags.admin")
class TagCommands : BaseCommand() {

    @Subcommand("create")
    fun create(sender: CommandSender, @Name("tagName") name: String)
    {
        if (TagHandler.exists(name))
        {
            sender.sendMessage(Chat.format("&cTag already exists!"))
            return
        }

        PioneerBukkit.instance.tagService.make(name).execute()
        TagHandler.recache(name.toLowerCase())

        sender.sendMessage(Chat.format("&eCreated a new tag with the name &f$name"))
    }

    @Subcommand("delete")
    fun delete(sender: CommandSender, @Name("tagName") name: String)
    {
        if (!TagHandler.exists(name))
        {
            sender.sendMessage(Chat.format("&cTag does not exist!"))
            return
        }

        PioneerBukkit.instance.tagService.squash(name).execute()
        TagHandler.tags.remove(name.toLowerCase())

        sender.sendMessage(Chat.format("&cDeleted tag &f$name"))
    }
}