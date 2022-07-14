package ltd.matrixstudios.bukkit.contact

import okhttp3.Interceptor
import okhttp3.Response

class AuthSessionChecker: Interceptor {

    override fun intercept(chain: Interceptor.Chain): Response {
        val requestBuilder = chain
            .request()
            .newBuilder()
            .header("Content-Type", "application/json")
            .header("Pioneer-Key", "98pingIsAwesome!")

        return chain.proceed(requestBuilder.build())
    }

}