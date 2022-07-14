package ltd.matrixstudios.api.profiles

import com.google.gson.JsonObject
import ltd.matrixstudios.api.serializers.GsonSerializer
import spark.Route
import spark.kotlin.halt
import java.util.*

object ProfileRouting {

    val byUUID = Route { request, response ->
        val id = request.params(":id")

        if (ProfileManager.profileCache[UUID.fromString(id)] == null)
        {
            return@Route halt(400, "Player is not cached!")
        }

        val profile = ProfileManager.profileCache[UUID.fromString(id)]

        profile
    }

    val fetch = Route { request, response ->
        return@Route ProfileManager.profileCache.values
    }

    val load = Route { request, response ->
        val id = request.params(":id")

        val body = GsonSerializer.GSON.fromJson(request.body()!!, JsonObject::class.java)

        val username = body.get("username").asString

        return@Route ProfileManager.loadPlayerProfile(UUID.fromString(id), username)
    }

    val squash = Route { request, response ->
        val id = UUID.fromString(request.params(":id"))

        if (ProfileManager.profileCache[id] == null)
        {
            return@Route halt(400, "Player is not cached!")
        }

        val profile = ProfileManager.profileCache[id]!!

        ProfileManager.delete(profile)

        null
    }
}