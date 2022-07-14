package ltd.matrixstudios.api.grants

import com.google.gson.JsonObject
import ltd.matrixstudios.api.serializers.GsonSerializer
import spark.Route
import java.util.*

object GrantRouting {

    val addTo = Route { request, response ->
        val target = UUID.fromString(request.params(":id"))

        val body = GsonSerializer.GSON.fromJson(request.body()!!, JsonObject::class.java)

        val executor = body.get("executor").asString
        val duration = body.get("duration").asLong
        val reason = body.get("reason").asString
        val rank = body.get("rank").asString

        val grant = Grant(UUID.randomUUID(), target, UUID.fromString(executor), duration, System.currentTimeMillis(), 0L, reason, rank, null, null)

        GrantManager.insert(grant)

        return@Route grant
    }

    val getByTarget = Route { request, response ->
        val target = UUID.fromString(request.params(":id"))

        return@Route GrantManager.collectByPlayer(target)
    }
}