package ltd.matrixstudios.bukkit.ranks

data class Rank(
    val id: String,
    val displayName: String,
    val weight: Int,
    val staffRank: Boolean,
    val visible: Boolean,
    val default: Boolean,
    val requiresAuth: Boolean,
    val prefix: String,
    val color: String,
    val permissions: MutableList<String>,
    val inherits: MutableList<String>
) {
}