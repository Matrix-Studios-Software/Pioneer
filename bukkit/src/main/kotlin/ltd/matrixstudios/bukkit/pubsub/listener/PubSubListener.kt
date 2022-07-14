package ltd.matrixstudios.bukkit.pubsub.listener

import ltd.matrixstudios.bukkit.PioneerBukkit
import ltd.matrixstudios.bukkit.pubsub.PubSubHandler
import ltd.matrixstudios.bukkit.pubsub.packet.JedisPacket
import org.bukkit.Bukkit
import redis.clients.jedis.JedisPubSub

/**
 * @author Nopox
 * @since 2022-07-13
 */
object PubSubListener : JedisPubSub() {
    
    override fun onMessage(channel: String, message: String) {
        val messageSpliced = message.split("::")

        val packetClass = Class.forName(messageSpliced[0])

        val packet = PubSubHandler.GSON.fromJson(messageSpliced[1], packetClass::class.java) as JedisPacket

        Bukkit.getScheduler().runTask(PioneerBukkit.instance) {
            PubSubHandler.handle(packet)
        }
    }
}