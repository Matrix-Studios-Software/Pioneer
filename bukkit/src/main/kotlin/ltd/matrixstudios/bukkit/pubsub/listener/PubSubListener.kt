package ltd.matrixstudios.bukkit.pubsub.listener

import ltd.matrixstudios.bukkit.PioneerBukkit
import ltd.matrixstudios.bukkit.pubsub.PubSubHandler
import ltd.matrixstudios.bukkit.pubsub.packet.JedisPacket
import org.bukkit.Bukkit
import redis.clients.jedis.JedisPubSub
import java.lang.reflect.Type

object PubSubListener : JedisPubSub() {

    override fun onMessage(channel: String, message: String)
    {
        val messageSpliced = message.split("::")

        val packetClass = Class.forName(messageSpliced[0])

        val packet = PubSubHandler.GSON.fromJson<JedisPacket>(messageSpliced[1], packetClass::class.java)

        Bukkit.getScheduler().runTask(PioneerBukkit.instance)
        {
            PubSubHandler.handle(packet)
        }
    }
}