package ltd.matrixstudios.api.grants

import com.mongodb.client.model.Filters
import com.mongodb.client.model.UpdateOptions
import ltd.matrixstudios.api.PioneerData
import ltd.matrixstudios.api.serializers.GsonSerializer
import org.bson.Document
import java.util.UUID

object GrantManager {

    private val collection = PioneerData.mongoDatabase.getCollection("grants")

    fun insert(grant: Grant)
    {
        collection.updateOne(Filters.eq("_id", grant.randomId.toString()), Document("\$set", Document.parse(GsonSerializer.GSON.toJson(grant))), UpdateOptions().upsert(true))
    }

    fun collectByPlayer(target: UUID) : Collection<Grant>
    {
        val grants = arrayListOf<Grant>()
        val sorted = collection.find(Filters.eq("target", target.toString()))

        for (document in sorted)
        {
            val parsed = GsonSerializer.GSON.fromJson(document.toJson(), Grant::class.java)

            grants.add(parsed)
        }

        return grants
    }
}