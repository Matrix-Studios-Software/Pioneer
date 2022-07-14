package ltd.matrixstudios.api.ranks

data class Rank(
    val id: String,
    var displayName: String,
    val weight: Int,
    var staffRank: Boolean,
    var visible: Boolean,
    var default: Boolean,
    val requiresAuth: Boolean,
    var prefix: String,
    var color: String,
    val permissions: MutableList<String>,
    val inherits: MutableList<String>
) {
}