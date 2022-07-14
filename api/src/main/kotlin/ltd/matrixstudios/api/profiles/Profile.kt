package ltd.matrixstudios.api.profiles

import java.util.UUID

data class Profile(
    val uuid: UUID,
    val username: String,
    val aliases: MutableList<String>,
    val friends: MutableList<String>,
    val firstJoined: Long,
    val lastJoined: Long,
    val cacheExpiry: Long
) {
}