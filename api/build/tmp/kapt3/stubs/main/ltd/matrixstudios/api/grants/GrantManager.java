package ltd.matrixstudios.api.grants;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR2\u0010\u0003\u001a&\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005 \u0006*\u0012\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lltd/matrixstudios/api/grants/GrantManager;", "", "()V", "collection", "Lcom/mongodb/client/MongoCollection;", "Lorg/bson/Document;", "kotlin.jvm.PlatformType", "collectByPlayer", "", "Lltd/matrixstudios/api/grants/Grant;", "target", "Ljava/util/UUID;", "insert", "", "grant", "api"})
public final class GrantManager {
    @org.jetbrains.annotations.NotNull()
    public static final ltd.matrixstudios.api.grants.GrantManager INSTANCE = null;
    private static final com.mongodb.client.MongoCollection<org.bson.Document> collection = null;
    
    private GrantManager() {
        super();
    }
    
    public final void insert(@org.jetbrains.annotations.NotNull()
    ltd.matrixstudios.api.grants.Grant grant) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Collection<ltd.matrixstudios.api.grants.Grant> collectByPlayer(@org.jetbrains.annotations.NotNull()
    java.util.UUID target) {
        return null;
    }
}