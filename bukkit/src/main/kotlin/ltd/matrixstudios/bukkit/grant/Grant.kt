package ltd.matrixstudios.bukkit.grant

import ltd.matrixstudios.bukkit.ranks.Rank
import ltd.matrixstudios.bukkit.ranks.RankHandler
import java.util.UUID

data class Grant(
    val randomId: UUID,
    val target: UUID,
    val executor: UUID,
    val duration: Long,
    val addedAt: Long,
    val removedAt: Long?,
    val reason: String,
    val rank: String,
    val removedBy: UUID?,
    val removedReason: String?
) {

    fun getGrantedRank() : Rank?
    {
        return RankHandler.byRankId(rank)
    }
}