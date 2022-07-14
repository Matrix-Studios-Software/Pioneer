package ltd.matrixstudios.api.tags

import com.google.gson.JsonObject
import ltd.matrixstudios.api.ranks.RankManager
import ltd.matrixstudios.api.serializers.GsonSerializer
import spark.Route
import spark.kotlin.halt

object TagRouting {

    val fetch = Route { _, _ ->
        return@Route TagManager.tags.values
    }

    val fetchWithId = Route { request, _ ->
        val id = request.params(":id")

        if (TagManager.tagById(id) == null)
        {
            return@Route halt(400, "Tag does not exist. Type in the id wrong?")
        }

        val tag = TagManager.tagById(id)!!

        tag
    }

    val make = Route { request, _ ->
        val id = request.params(":id")

        if (TagManager.tagById(id) != null)
        {
            return@Route halt(400, "Tag already exists in the cache! Wrong id?")
        }

        val tag = TagManager.generateRank(id)

        TagManager.insert(tag)

        tag
    }

    val update = Route { request, _ ->
        val tag = TagManager.tagById(request.params(":id")) ?: return@Route halt(404)

        var updated = false

        val body = GsonSerializer.GSON.fromJson(request.body(), JsonObject::class.java)

        if (body.has("displayName")) {
            val displayName = body["displayName"].asString
            tag.displayName = displayName
            updated = true
        }

        if (body.has("position")) {
            val position = body["position"].asString
            tag.position = TagPosition.valueOf(position)
            updated = true
        }

        if (updated)
        {
            TagManager.insert(tag)
        }

        tag
    }

    val squash = Route { request, response ->
        val id = request.params(":id")

        if (TagManager.tagById(id) == null)
        {
            return@Route halt(400, "Tag does not exist. Type in the id wrong?")
        }

        val tag = TagManager.tagById(id)!!

        TagManager.squash(tag)

        response.status(200)
        return@Route response
    }
}