package ltd.matrixstudios.api.serializers

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.google.gson.LongSerializationPolicy

object GsonSerializer {

    val GSON: Gson = GsonBuilder()
        .setPrettyPrinting()
        .serializeNulls()
        .setLongSerializationPolicy(LongSerializationPolicy.STRING)
        .create()
}