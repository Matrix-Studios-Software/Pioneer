package ltd.matrixstudios.bukkit.grant

import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path

interface GrantService {

    @JvmSuppressWildcards
    @POST("grants/addTo/{id}")
    fun addTo(@Path("id") id: String, @Body data: Map<String, Any>) : Call<Grant>

    @GET("grants/getByTarget/{id}")
    fun get(@Path("id") id: String) : Call<Collection<Grant>>
}