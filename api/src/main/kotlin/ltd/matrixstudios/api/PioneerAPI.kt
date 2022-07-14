package ltd.matrixstudios.api

import ltd.matrixstudios.api.auth.AuthSessionManager
import ltd.matrixstudios.api.profiles.ProfileManager
import ltd.matrixstudios.api.ranks.RankManager
import ltd.matrixstudios.api.tags.TagManager
import spark.kotlin.ipAddress
import spark.kotlin.port

class PioneerAPI {

    companion object
    {
        @JvmStatic
        fun main(args: Array<String>) {
            startAPI()
        }

        fun startAPI() {
            port(5772)
            ipAddress("127.0.0.1")

            PioneerData.connect("mongodb://localhost:27017")

            AuthSessionManager.load()

            PioneerRouter.route()
            PioneerRouter.setupExceptionHandling()

            RankManager.load()
            TagManager.load()
        }
    }


}