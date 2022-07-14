package ltd.matrixstudios.bukkit.ranks

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path

interface RankService {

    @GET("ranks/fetch")
    fun fetch() : Call<Collection<Rank>>

    @POST("ranks/squash/{id}")
    fun squash(@Path("id") rankId: String) : Call<Void>

    @POST("ranks/make/{id}")
    fun make(@Path("id") rankId: String) : Call<Void>

    @GET("ranks/fetchWithId/{id}")
    fun fetchWithId(@Path("id")rankId: String) : Call<Rank?>

}