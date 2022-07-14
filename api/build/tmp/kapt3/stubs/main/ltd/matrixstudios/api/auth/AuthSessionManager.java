package ltd.matrixstudios.api.auth;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\tJ\u0006\u0010\u0012\u001a\u00020\u000eR2\u0010\u0003\u001a&\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005 \u0006*\u0012\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0013"}, d2 = {"Lltd/matrixstudios/api/auth/AuthSessionManager;", "", "()V", "collection", "Lcom/mongodb/client/MongoCollection;", "Lorg/bson/Document;", "kotlin.jvm.PlatformType", "sessions", "Ljava/util/HashMap;", "", "Lltd/matrixstudios/api/auth/AuthSession;", "getSessions", "()Ljava/util/HashMap;", "createDefaultKey", "", "isAllowed", "", "key", "load", "api"})
public final class AuthSessionManager {
    @org.jetbrains.annotations.NotNull()
    public static final ltd.matrixstudios.api.auth.AuthSessionManager INSTANCE = null;
    private static final com.mongodb.client.MongoCollection<org.bson.Document> collection = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.util.HashMap<java.lang.String, ltd.matrixstudios.api.auth.AuthSession> sessions = null;
    
    private AuthSessionManager() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.HashMap<java.lang.String, ltd.matrixstudios.api.auth.AuthSession> getSessions() {
        return null;
    }
    
    public final void load() {
    }
    
    public final void createDefaultKey() {
    }
    
    public final boolean isAllowed(@org.jetbrains.annotations.NotNull()
    java.lang.String key) {
        return false;
    }
}