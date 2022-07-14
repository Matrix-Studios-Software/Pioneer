package ltd.matrixstudios.api.tags

import com.mongodb.client.model.Filters
import com.mongodb.client.model.UpdateOptions
import ltd.matrixstudios.api.PioneerData
import ltd.matrixstudios.api.ranks.Rank
import ltd.matrixstudios.api.ranks.RankManager
import ltd.matrixstudios.api.serializers.GsonSerializer
import org.bson.Document

object TagManager {

    private val collection = PioneerData.mongoDatabase.getCollection("tags")

    val tags = hashMapOf<String, Tag>()

    fun load()
    {
        val items = arrayListOf<Tag>()
            .also { tags ->
                for (document in collection.find())
                {
                    tags.add(GsonSerializer.GSON.fromJson(document.toJson(), Tag::class.java))
                }
            }

        items.forEach {
            tags[it.id] = it
        }
    }

    fun tagById(id: String) : Tag?
    {
        return tags[id]
    }

    fun insert(tag: Tag)
    {
        tags[tag.id] = tag
        collection.updateOne(Filters.eq("_id", tag.id), Document("\$set", Document.parse(GsonSerializer.GSON.toJson(tag))), UpdateOptions().upsert(true))
    }

    fun squash(tag: Tag)
    {
        collection.deleteOne(Filters.eq("_id", tag.id))
        tags.remove(tag.id)
    }

    fun generateRank(id: String) : Tag
    {
        return Tag(id.toLowerCase(), id, TagPosition.PREFIX)
    }
}