package ltd.matrixstudios.bukkit.profiles

import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path

interface ProfileService {

    @GET("profiles/fetch")
    fun fetch() : Call<Collection<Profile>>

    @JvmSuppressWildcards
    @POST("profiles/load/{id}")
    fun load(@Path("id") uuid: String, @Body data: Map<String, Any>) : Call<Profile>

    @GET("profiles/byUUID/{id}")
    fun byUUID(@Path("id") uuid: String) : Call<Profile>

    @POST("profiles/squash/{id}")
    fun squash(@Path("id") uuid: String) : Call<Void>

    @GET("profiles/exists/{id}")
    fun exists(@Path("id") uuid: String) : Call<Boolean>

}