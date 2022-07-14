package ltd.matrixstudios.api.profiles

import com.mongodb.client.model.Filters
import com.mongodb.client.model.UpdateOptions
import ltd.matrixstudios.api.PioneerData
import ltd.matrixstudios.api.serializers.GsonSerializer
import org.bson.Document
import java.util.UUID
import java.util.concurrent.TimeUnit

object ProfileManager {

    private val collection = PioneerData.mongoDatabase.getCollection("profiles")

    val profileCache = hashMapOf<UUID, Profile>()

    fun loadPlayerProfile(uuid: UUID, username: String) : Profile
    {
        if (profileCache.containsKey(uuid))
        {
            return profileCache[uuid]!!
        }

        if (collection.find(Filters.eq("_id", uuid.toString())).firstOrNull() != null)
        {
            val document = collection.find(Filters.eq("_id", uuid.toString())).first()

            val profile = GsonSerializer.GSON.fromJson(document.toJson(), Profile::class.java)

            profileCache[profile.uuid] = profile

            return profile
        }

        val lastResort = Profile(uuid, username, mutableListOf(username), mutableListOf(), System.currentTimeMillis(), System.currentTimeMillis(), TimeUnit.SECONDS.toMillis(1L))

        profileCache[lastResort.uuid] = lastResort

        insert(lastResort)

        return lastResort
    }

    fun insert(profile: Profile)
    {
        collection.updateOne(Filters.eq("_id", profile.uuid.toString()), Document("\$set", Document.parse(GsonSerializer.GSON.toJson(profile))), UpdateOptions().upsert(true))
     }

    fun delete(profile: Profile)
    {
        profileCache.remove(profile.uuid)

        collection.deleteOne(Filters.eq("_id", profile.uuid.toString()))
    }
}