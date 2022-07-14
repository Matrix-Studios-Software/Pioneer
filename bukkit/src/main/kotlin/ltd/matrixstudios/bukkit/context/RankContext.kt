package ltd.matrixstudios.bukkit.context

import co.aikar.commands.BukkitCommandExecutionContext
import co.aikar.commands.InvalidCommandArgument
import co.aikar.commands.contexts.ContextResolver
import ltd.matrixstudios.bukkit.ranks.Rank
import ltd.matrixstudios.bukkit.ranks.RankHandler

class RankContext : ContextResolver<Rank, BukkitCommandExecutionContext> {

    override fun getContext(c: BukkitCommandExecutionContext?): Rank? {
        val firstArg = c!!.popFirstArg() ?: return null

        val rank = RankHandler.byRankId(firstArg)
            ?: throw InvalidCommandArgument("No rank by this name found")

        return rank
    }
}