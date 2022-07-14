package ltd.matrixstudios.bukkit.pubsub

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.google.gson.LongSerializationPolicy
import ltd.matrixstudios.bukkit.pubsub.listener.PubSubListener
import ltd.matrixstudios.bukkit.pubsub.packet.JedisPacket
import redis.clients.jedis.JedisPool

/**
 * @author Nopox
 * @since 2022-07-13
 */
object PubSubHandler {

    lateinit var jedisPool: JedisPool

    val GSON: Gson = GsonBuilder()
        .setPrettyPrinting()
        .serializeNulls()
        .setLongSerializationPolicy(LongSerializationPolicy.STRING)
        .create()

    /**
     * Creates a new PubSubHandler
     *
     * @param [pool] The JedisPool to use for the PubSubHandler
     */
    fun create(pool: JedisPool, vararg channels: String) {
        jedisPool = pool

        val pubSub = PubSubListener

        while (true) {
            jedisPool.resource.use {
                it.subscribe(pubSub, *channels)
                it.subscribe(pubSub, "Pioneer::Global")
            }
        }
    }

    /**
     * Publishes a message to a channel
     */
    fun publish(packet: JedisPacket, channel: String = "Pioneer::Global") {
        val s = java.lang.StringBuilder(packet.javaClass.name)

        val serializedPacket = GSON.toJson(packet)

        s.append("::${serializedPacket}")

        jedisPool.resource.use {
            it.publish(channel, s.toString())
        }
    }

    /**
     * Handles a packet
     *
     * @param [packet] The packet to handle
     */
    fun handle(packet: JedisPacket) {
        packet.onMessage()
    }
}