package ltd.matrixstudios.bukkit.pubsub;

import java.lang.System;

/**
 * @author Nopox
 * @since 2022-07-13
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\'\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\b2\u0012\u0010\u0010\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00120\u0011\"\u00020\u0012\u00a2\u0006\u0002\u0010\u0013J\u000e\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0016J\u0018\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0018\u001a\u00020\u0012R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f\u00a8\u0006\u0019"}, d2 = {"Lltd/matrixstudios/bukkit/pubsub/PubSubHandler;", "", "()V", "GSON", "Lcom/google/gson/Gson;", "getGSON", "()Lcom/google/gson/Gson;", "jedisPool", "Lredis/clients/jedis/JedisPool;", "getJedisPool", "()Lredis/clients/jedis/JedisPool;", "setJedisPool", "(Lredis/clients/jedis/JedisPool;)V", "create", "", "pool", "channels", "", "", "(Lredis/clients/jedis/JedisPool;[Ljava/lang/String;)V", "handle", "packet", "Lltd/matrixstudios/bukkit/pubsub/packet/JedisPacket;", "publish", "channel", "bukkit"})
public final class PubSubHandler {
    @org.jetbrains.annotations.NotNull()
    public static final ltd.matrixstudios.bukkit.pubsub.PubSubHandler INSTANCE = null;
    public static redis.clients.jedis.JedisPool jedisPool;
    @org.jetbrains.annotations.NotNull()
    private static final com.google.gson.Gson GSON = null;
    
    private PubSubHandler() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final redis.clients.jedis.JedisPool getJedisPool() {
        return null;
    }
    
    public final void setJedisPool(@org.jetbrains.annotations.NotNull()
    redis.clients.jedis.JedisPool p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.gson.Gson getGSON() {
        return null;
    }
    
    /**
     * Creates a new PubSubHandler
     *
     * @param [pool] The JedisPool to use for the PubSubHandler
     */
    public final void create(@org.jetbrains.annotations.NotNull()
    redis.clients.jedis.JedisPool pool, @org.jetbrains.annotations.NotNull()
    java.lang.String... channels) {
    }
    
    /**
     * Publishes a message to a channel
     */
    public final void publish(@org.jetbrains.annotations.NotNull()
    ltd.matrixstudios.bukkit.pubsub.packet.JedisPacket packet, @org.jetbrains.annotations.NotNull()
    java.lang.String channel) {
    }
    
    /**
     * Handles a packet
     *
     * @param [packet] The packet to handle
     */
    public final void handle(@org.jetbrains.annotations.NotNull()
    ltd.matrixstudios.bukkit.pubsub.packet.JedisPacket packet) {
    }
}