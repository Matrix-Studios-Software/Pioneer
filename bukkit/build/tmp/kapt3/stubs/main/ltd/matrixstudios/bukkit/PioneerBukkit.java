package ltd.matrixstudios.bukkit;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u0000 )2\u00020\u0001:\u0001)B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\"\u001a\u00020#J\u0006\u0010$\u001a\u00020#J\b\u0010%\u001a\u00020#H\u0016J\u0006\u0010&\u001a\u00020#J\u0006\u0010\'\u001a\u00020#J\u0006\u0010(\u001a\u00020#R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\r\u001a\n \u000f*\u0004\u0018\u00010\u000e0\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0013X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0019X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0011\u0010\u001e\u001a\u00020\u001f\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010!\u00a8\u0006*"}, d2 = {"Lltd/matrixstudios/bukkit/PioneerBukkit;", "Lorg/bukkit/plugin/java/JavaPlugin;", "()V", "grantService", "Lltd/matrixstudios/bukkit/grant/GrantService;", "getGrantService", "()Lltd/matrixstudios/bukkit/grant/GrantService;", "setGrantService", "(Lltd/matrixstudios/bukkit/grant/GrantService;)V", "gson", "Lcom/google/gson/Gson;", "getGson", "()Lcom/google/gson/Gson;", "okHttpClient", "Lokhttp3/OkHttpClient;", "kotlin.jvm.PlatformType", "getOkHttpClient", "()Lokhttp3/OkHttpClient;", "profileService", "Lltd/matrixstudios/bukkit/profiles/ProfileService;", "getProfileService", "()Lltd/matrixstudios/bukkit/profiles/ProfileService;", "setProfileService", "(Lltd/matrixstudios/bukkit/profiles/ProfileService;)V", "rankService", "Lltd/matrixstudios/bukkit/ranks/RankService;", "getRankService", "()Lltd/matrixstudios/bukkit/ranks/RankService;", "setRankService", "(Lltd/matrixstudios/bukkit/ranks/RankService;)V", "retrofit", "Lretrofit2/Retrofit;", "getRetrofit", "()Lretrofit2/Retrofit;", "loadHandlers", "", "loadServices", "onEnable", "registerCommands", "registerListeners", "runTasks", "Companion", "bukkit"})
public final class PioneerBukkit extends org.bukkit.plugin.java.JavaPlugin {
    @org.jetbrains.annotations.NotNull()
    private final com.google.gson.Gson gson = null;
    private final okhttp3.OkHttpClient okHttpClient = null;
    @org.jetbrains.annotations.NotNull()
    private final retrofit2.Retrofit retrofit = null;
    public ltd.matrixstudios.bukkit.ranks.RankService rankService;
    public ltd.matrixstudios.bukkit.profiles.ProfileService profileService;
    public ltd.matrixstudios.bukkit.grant.GrantService grantService;
    @org.jetbrains.annotations.NotNull()
    public static final ltd.matrixstudios.bukkit.PioneerBukkit.Companion Companion = null;
    public static ltd.matrixstudios.bukkit.PioneerBukkit instance;
    
    public PioneerBukkit() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.gson.Gson getGson() {
        return null;
    }
    
    public final okhttp3.OkHttpClient getOkHttpClient() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final retrofit2.Retrofit getRetrofit() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ltd.matrixstudios.bukkit.ranks.RankService getRankService() {
        return null;
    }
    
    public final void setRankService(@org.jetbrains.annotations.NotNull()
    ltd.matrixstudios.bukkit.ranks.RankService p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ltd.matrixstudios.bukkit.profiles.ProfileService getProfileService() {
        return null;
    }
    
    public final void setProfileService(@org.jetbrains.annotations.NotNull()
    ltd.matrixstudios.bukkit.profiles.ProfileService p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ltd.matrixstudios.bukkit.grant.GrantService getGrantService() {
        return null;
    }
    
    public final void setGrantService(@org.jetbrains.annotations.NotNull()
    ltd.matrixstudios.bukkit.grant.GrantService p0) {
    }
    
    @java.lang.Override()
    public void onEnable() {
    }
    
    public final void runTasks() {
    }
    
    public final void registerListeners() {
    }
    
    public final void registerCommands() {
    }
    
    public final void loadHandlers() {
    }
    
    public final void loadServices() {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Lltd/matrixstudios/bukkit/PioneerBukkit$Companion;", "", "()V", "instance", "Lltd/matrixstudios/bukkit/PioneerBukkit;", "getInstance", "()Lltd/matrixstudios/bukkit/PioneerBukkit;", "setInstance", "(Lltd/matrixstudios/bukkit/PioneerBukkit;)V", "bukkit"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ltd.matrixstudios.bukkit.PioneerBukkit getInstance() {
            return null;
        }
        
        public final void setInstance(@org.jetbrains.annotations.NotNull()
        ltd.matrixstudios.bukkit.PioneerBukkit p0) {
        }
    }
}