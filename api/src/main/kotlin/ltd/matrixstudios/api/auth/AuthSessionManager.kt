package ltd.matrixstudios.api.auth

import com.mongodb.client.model.Filters
import com.mongodb.client.model.UpdateOptions
import ltd.matrixstudios.api.PioneerData
import ltd.matrixstudios.api.serializers.GsonSerializer
import org.bson.Document
import java.util.*

object AuthSessionManager {

    private val collection = PioneerData.mongoDatabase.getCollection("authSessions")

    val sessions = hashMapOf<String, AuthSession>()

    fun load()
    {

        createDefaultKey()
        val items = arrayListOf<AuthSession>()
            .also { tokens ->
            for (document in collection.find())
            {
                tokens.add(GsonSerializer.GSON.fromJson(document.toJson(), AuthSession::class.java))
            }
        }

        items.forEach {
            sessions[it.name] = it
        }
    }

    fun createDefaultKey()
    {
        if (!sessions.containsKey("default"))
        {
            val key = AuthSession("default", "98pingIsAwesome!", mutableListOf("127.0.0.1", "localhost"))

            collection.updateOne(Filters.eq("_id", key.name), Document("\$set", Document.parse(GsonSerializer.GSON.toJson(key))), UpdateOptions().upsert(true))
        }
    }

    fun isAllowed(key: String) : Boolean
    {
        return sessions.values.firstOrNull { it.key.equals(key, ignoreCase = true) } != null
    }

}