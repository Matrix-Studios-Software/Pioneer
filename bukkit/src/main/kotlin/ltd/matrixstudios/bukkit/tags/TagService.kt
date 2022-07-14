package ltd.matrixstudios.bukkit.tags

import ltd.matrixstudios.bukkit.ranks.Rank
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path

interface TagService {

    @GET("tags/fetch")
    fun fetch() : Call<Collection<Tag>>

    @POST("tags/squash/{id}")
    fun squash(@Path("id") id: String) : Call<Void>

    @POST("tags/make/{id}")
    fun make(@Path("id") id: String) : Call<Void>

    @GET("tags/fetchWithId/{id}")
    fun fetchWithId(@Path("id") id: String) : Call<Tag>


}