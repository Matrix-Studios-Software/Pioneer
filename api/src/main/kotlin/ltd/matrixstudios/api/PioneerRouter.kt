package ltd.matrixstudios.api

import ltd.matrixstudios.api.auth.AuthSession
import ltd.matrixstudios.api.auth.AuthSessionManager
import ltd.matrixstudios.api.profiles.ProfileRouting
import ltd.matrixstudios.api.ranks.RankRouting
import ltd.matrixstudios.api.serializers.JsonTransformer
import spark.Request
import spark.Response
import spark.ResponseTransformer
import spark.Spark.*

object PioneerRouter {

    val jsonTransformer: ResponseTransformer = JsonTransformer()

    fun route() {
        path("/api")
        {
            before("/*")
            { request, response ->
                handleRequest(request, response)
            }


            path("/ranks")
            {
                post("/make/:id", RankRouting.make, jsonTransformer)
                post("/squash/:id", RankRouting.squash, jsonTransformer)
                get("/fetch", RankRouting.fetch, jsonTransformer)
                get("/fetchWithId/:id", RankRouting.fetchWithId, jsonTransformer)
            }

            path("/profiles")
            {
                post("/load/:id", ProfileRouting.load , jsonTransformer)
                get("/fetch", ProfileRouting.fetch, jsonTransformer)
                post("/squash/:id", ProfileRouting.squash, jsonTransformer)
                get("/byUUID/:id", ProfileRouting.byUUID, jsonTransformer)
            }
        }

    }

    private fun handleRequest(request: Request, response: Response) {
        response.type("application/json")

        val apiKey = request.headers("Pioneer-Key")
        if (apiKey == null)
        {
            halt(401, "Missing API key")
        }

/*
        if (!AuthSessionManager.isAllowed(apiKey))
        {
            halt(401, "Not allowed on the auth session manager")
        }

        val authSession = AuthSessionManager.sessions[apiKey]!!

        if (authSession.allowedIps.isEmpty() || !authSession.allowedIps.contains(request.host()))
        {
            halt(401, "Not allowed on the auth session manager")
        }
*/

        if (request.contentType() != null && request.contentType() != "application/json" && request.contentType() != "application/json; charset=UTF-8")
        {
            println("Malformed content-type")
            halt(400, "Bad request")
        }
    }

    fun setupExceptionHandling() {
        after("/*") { request, response ->
            println(response.body())
            println(
                response.status()
                    .toString() + " " + request.requestMethod() + " " + request.url() + "/" + request.servletPath()
            )
        }

        exception(java.lang.Exception::class.java) { exception, request, response ->
            println("ERROR 500 " + request.pathInfo())
            exception.printStackTrace()
        }

        exception(Exception::class.java) { exception, request, response ->
            println("ERROR 500 " + request.pathInfo())
            exception.printStackTrace()
        }
    }

}