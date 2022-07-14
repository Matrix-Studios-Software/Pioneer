package ltd.matrixstudios.bukkit.grant.commands

import co.aikar.commands.BaseCommand
import co.aikar.commands.annotation.CommandAlias
import co.aikar.commands.annotation.CommandPermission
import co.aikar.commands.annotation.Name
import ltd.matrixstudios.bukkit.grant.GrantManager
import ltd.matrixstudios.bukkit.grant.menu.GrantsMenu
import ltd.matrixstudios.bukkit.profiles.Profile
import org.bukkit.entity.Player

class GrantsCommand : BaseCommand() {

    @CommandAlias("grants|grantlookup")
    @CommandPermission("pioneer.grants")
    fun grants(player: Player, @Name("target")profile: Profile)
    {
        val grants = GrantManager.getGrantsForTarget(profile.uuid)

        GrantsMenu(player, grants).updateMenu()
    }
}