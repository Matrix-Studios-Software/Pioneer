package ltd.matrixstudios.api.ranks

import com.google.gson.JsonObject
import ltd.matrixstudios.api.serializers.GsonSerializer
import spark.Route
import spark.kotlin.halt

object RankRouting {

    val fetch = Route { request, response ->
        return@Route RankManager.ranks.values
    }

    val fetchWithId = Route { request, response ->
        val id = request.params(":id").toLowerCase()

        if (RankManager.rankById(id) == null)
        {
            return@Route halt(400, "Rank does not exist. Type in the id wrong?")
        }

        val rank = RankManager.rankById(id)!!

        rank
    }

    val make = Route { request, response ->
        val id = request.params(":id")

        if (RankManager.rankById(id) != null)
        {
            return@Route halt(400, "Rank already exists in the cache! Wrong id?")
        }

        val rank = RankManager.generateRank(id)

        RankManager.insert(rank)

        rank
    }

    val update = Route { request, response ->
        val rank = RankManager.rankById(request.params(":id")) ?: return@Route halt(404)

        var updated = false

        val body = GsonSerializer.GSON.fromJson(request.body(), JsonObject::class.java)


        if (body.has("addPermission")) {
            val permission = body["addPermission"].asString
            if (rank.permissions.contains(permission)) {
                return@Route halt(304, "Rank already has permission")
            }

            rank.permissions.add(permission)
            updated = true
        }

        if (body.has("removePermission")) {
            val permission = body["removePermission"].asString
            if (!rank.permissions.contains(permission)) {
                return@Route halt(304, "Rank doesn't have permission")
            }

            rank.permissions.remove(permission)
            updated = true
        }

        if (body.has("displayName")) {
            rank.displayName = body["displayName"].asString
            updated = true
        }

        if (body.has("color")) {
            rank.color = body["color"].asString
            updated = true
        }

        if (body.has("prefix")) {
            rank.prefix = body["prefix"].asString
            updated = true
        }

        if (body.has("default")) {
            rank.default = body["default"].asBoolean
            updated = true
        }

        if (body.has("visible")) {
            rank.visible = body["visible"].asBoolean
            updated = true
        }

        if (body.has("staff")) {
            rank.staffRank = body["staff"].asBoolean
            updated = true
        }

        if (updated)
        {
            RankManager.insert(rank)
        }

        rank
    }

    val squash = Route { request, response ->
        val id = request.params(":id")

        if (RankManager.rankById(id) == null)
        {
            return@Route halt(400, "Rank does not exist. Type in the id wrong?")
        }

        val rank = RankManager.rankById(id)!!

        RankManager.squash(rank)

        response.status(200)
        return@Route response
    }
}