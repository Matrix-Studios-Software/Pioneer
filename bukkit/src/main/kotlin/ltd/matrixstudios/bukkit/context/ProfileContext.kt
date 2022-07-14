package ltd.matrixstudios.bukkit.context

import co.aikar.commands.BukkitCommandExecutionContext
import co.aikar.commands.InvalidCommandArgument
import co.aikar.commands.contexts.ContextResolver
import ltd.matrixstudios.bukkit.PioneerBukkit
import ltd.matrixstudios.bukkit.profiles.Profile
import ltd.matrixstudios.bukkit.profiles.ProfileManager

class ProfileContext : ContextResolver<Profile, BukkitCommandExecutionContext> {

    override fun getContext(c: BukkitCommandExecutionContext?): Profile? {
        val firstArg = c!!.popFirstArg() ?: return null

        val profile = ProfileManager.byName(firstArg)

        return profile ?: throw InvalidCommandArgument("No profile was found")
    }
}