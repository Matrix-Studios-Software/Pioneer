package ltd.matrixstudios.api.serializers

import com.google.gson.JsonElement
import spark.ResponseTransformer

class JsonTransformer : ResponseTransformer {

    override fun render(model: Any?): String
    {
        return if (model is JsonElement)
        {
            model.toString()
        } else {
            GsonSerializer.GSON.toJson(model)
        }
    }

}