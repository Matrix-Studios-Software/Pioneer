package ltd.matrixstudios.api.profiles;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\nJ\u000e\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\nJ\u0016\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0014R2\u0010\u0003\u001a&\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005 \u0006*\u0012\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0015"}, d2 = {"Lltd/matrixstudios/api/profiles/ProfileManager;", "", "()V", "collection", "Lcom/mongodb/client/MongoCollection;", "Lorg/bson/Document;", "kotlin.jvm.PlatformType", "profileCache", "Ljava/util/HashMap;", "Ljava/util/UUID;", "Lltd/matrixstudios/api/profiles/Profile;", "getProfileCache", "()Ljava/util/HashMap;", "delete", "", "profile", "insert", "loadPlayerProfile", "uuid", "username", "", "api"})
public final class ProfileManager {
    @org.jetbrains.annotations.NotNull()
    public static final ltd.matrixstudios.api.profiles.ProfileManager INSTANCE = null;
    private static final com.mongodb.client.MongoCollection<org.bson.Document> collection = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.util.HashMap<java.util.UUID, ltd.matrixstudios.api.profiles.Profile> profileCache = null;
    
    private ProfileManager() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.HashMap<java.util.UUID, ltd.matrixstudios.api.profiles.Profile> getProfileCache() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ltd.matrixstudios.api.profiles.Profile loadPlayerProfile(@org.jetbrains.annotations.NotNull()
    java.util.UUID uuid, @org.jetbrains.annotations.NotNull()
    java.lang.String username) {
        return null;
    }
    
    public final void insert(@org.jetbrains.annotations.NotNull()
    ltd.matrixstudios.api.profiles.Profile profile) {
    }
    
    public final void delete(@org.jetbrains.annotations.NotNull()
    ltd.matrixstudios.api.profiles.Profile profile) {
    }
}