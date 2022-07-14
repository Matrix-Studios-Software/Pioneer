package ltd.matrixstudios.api.auth

data class AuthSession(
    val name: String,
    val key: String,
    val allowedIps: MutableList<String>
) {
}