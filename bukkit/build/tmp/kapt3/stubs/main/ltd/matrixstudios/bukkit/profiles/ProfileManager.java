package ltd.matrixstudios.bukkit.profiles;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u0004\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\u000bJ\u0010\u0010\f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\r\u001a\u00020\u0005J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0005J\u0016\u0010\u0011\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u000bR\u001d\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u0014"}, d2 = {"Lltd/matrixstudios/bukkit/profiles/ProfileManager;", "", "()V", "profiles", "Ljava/util/HashMap;", "Ljava/util/UUID;", "Lltd/matrixstudios/bukkit/profiles/Profile;", "getProfiles", "()Ljava/util/HashMap;", "byName", "name", "", "get", "uuid", "isInCache", "", "id", "load", "", "username", "bukkit"})
public final class ProfileManager {
    @org.jetbrains.annotations.NotNull()
    public static final ltd.matrixstudios.bukkit.profiles.ProfileManager INSTANCE = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.util.HashMap<java.util.UUID, ltd.matrixstudios.bukkit.profiles.Profile> profiles = null;
    
    private ProfileManager() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.HashMap<java.util.UUID, ltd.matrixstudios.bukkit.profiles.Profile> getProfiles() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final ltd.matrixstudios.bukkit.profiles.Profile get(@org.jetbrains.annotations.NotNull()
    java.util.UUID uuid) {
        return null;
    }
    
    public final boolean isInCache(@org.jetbrains.annotations.NotNull()
    java.util.UUID id) {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final ltd.matrixstudios.bukkit.profiles.Profile byName(@org.jetbrains.annotations.NotNull()
    java.lang.String name) {
        return null;
    }
    
    public final void load(@org.jetbrains.annotations.NotNull()
    java.util.UUID uuid, @org.jetbrains.annotations.NotNull()
    java.lang.String username) {
    }
}