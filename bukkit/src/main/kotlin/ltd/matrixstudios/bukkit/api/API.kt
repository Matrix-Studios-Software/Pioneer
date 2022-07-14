package ltd.matrixstudios.bukkit.api

import ltd.matrixstudios.bukkit.profiles.Profile
import ltd.matrixstudios.bukkit.profiles.ProfileManager
import java.util.UUID

object API {

    fun getProfile(uuid: UUID) : Profile?
    {
        return ProfileManager.get(uuid)
    }
}