package ltd.matrixstudios.api.grants

import ltd.matrixstudios.api.ranks.Rank
import ltd.matrixstudios.api.ranks.RankManager
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
        return RankManager.rankById(rank)
    }
}