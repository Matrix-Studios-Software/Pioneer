package ltd.matrixstudios.api.ranks

import com.mongodb.client.model.Filters
import com.mongodb.client.model.UpdateOptions
import ltd.matrixstudios.api.PioneerAPI
import ltd.matrixstudios.api.PioneerData
import ltd.matrixstudios.api.auth.AuthSession
import ltd.matrixstudios.api.auth.AuthSessionManager
import ltd.matrixstudios.api.serializers.GsonSerializer
import org.bson.Document

object RankManager {

    private val collection = PioneerData.mongoDatabase.getCollection("ranks")

    val ranks = hashMapOf<String, Rank>()

    fun load()
    {
        val items = arrayListOf<Rank>()
            .also { ranks ->
                for (document in collection.find())
                {
                    ranks.add(GsonSerializer.GSON.fromJson(document.toJson(), Rank::class.java))
                }
            }

        items.forEach {
            ranks[it.id] = it
        }
    }

    fun rankById(id: String) : Rank?
    {
        return ranks[id]
    }

    fun insert(rank: Rank)
    {
        ranks[rank.id] = rank
        collection.updateOne(Filters.eq("_id", rank.id), Document("\$set", Document.parse(GsonSerializer.GSON.toJson(rank))), UpdateOptions().upsert(true))
    }

    fun squash(rank: Rank)
    {
        collection.deleteOne(Filters.eq("_id", rank.id))
        ranks.remove(rank.id)
    }

    fun generateRank(id: String) : Rank
    {
        return Rank(id.toLowerCase(), id, 1, false, true, false, false, "&7", "&7", arrayListOf(), arrayListOf())
    }


}