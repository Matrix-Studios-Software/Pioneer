package ltd.matrixstudios.bukkit.pubsub.listener;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016\u00a8\u0006\b"}, d2 = {"Lltd/matrixstudios/bukkit/pubsub/listener/PubSubListener;", "Lredis/clients/jedis/JedisPubSub;", "()V", "onMessage", "", "channel", "", "message", "bukkit"})
public final class PubSubListener extends redis.clients.jedis.JedisPubSub {
    @org.jetbrains.annotations.NotNull()
    public static final ltd.matrixstudios.bukkit.pubsub.listener.PubSubListener INSTANCE = null;
    
    private PubSubListener() {
        super();
    }
    
    @java.lang.Override()
    public void onMessage(@org.jetbrains.annotations.NotNull()
    java.lang.String channel, @org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
}