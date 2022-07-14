package ltd.matrixstudios.bukkit.grant;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b \n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0002\u0010\u000fJ\t\u0010\u001f\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u000bH\u00c6\u0003J\t\u0010!\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\"\u001a\u00020\u0003H\u00c6\u0003J\t\u0010#\u001a\u00020\u0007H\u00c6\u0003J\t\u0010$\u001a\u00020\u0007H\u00c6\u0003J\u0010\u0010%\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001aJ\t\u0010&\u001a\u00020\u000bH\u00c6\u0003J\t\u0010\'\u001a\u00020\u000bH\u00c6\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003Jx\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000bH\u00c6\u0001\u00a2\u0006\u0002\u0010*J\u0013\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\b\u0010.\u001a\u0004\u0018\u00010/J\t\u00100\u001a\u000201H\u00d6\u0001J\t\u00102\u001a\u00020\u000bH\u00d6\u0001R\u0011\u0010\b\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\f\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0015\u0010\t\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0014R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0017R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0014\u00a8\u00063"}, d2 = {"Lltd/matrixstudios/bukkit/grant/Grant;", "", "randomId", "Ljava/util/UUID;", "target", "executor", "duration", "", "addedAt", "removedAt", "reason", "", "rank", "removedBy", "removedReason", "(Ljava/util/UUID;Ljava/util/UUID;Ljava/util/UUID;JJLjava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/util/UUID;Ljava/lang/String;)V", "getAddedAt", "()J", "getDuration", "getExecutor", "()Ljava/util/UUID;", "getRandomId", "getRank", "()Ljava/lang/String;", "getReason", "getRemovedAt", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getRemovedBy", "getRemovedReason", "getTarget", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/util/UUID;Ljava/util/UUID;Ljava/util/UUID;JJLjava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/util/UUID;Ljava/lang/String;)Lltd/matrixstudios/bukkit/grant/Grant;", "equals", "", "other", "getGrantedRank", "Lltd/matrixstudios/bukkit/ranks/Rank;", "hashCode", "", "toString", "bukkit"})
public final class Grant {
    @org.jetbrains.annotations.NotNull()
    private final java.util.UUID randomId = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.UUID target = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.UUID executor = null;
    private final long duration = 0L;
    private final long addedAt = 0L;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Long removedAt = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String reason = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String rank = null;
    @org.jetbrains.annotations.Nullable()
    private final java.util.UUID removedBy = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String removedReason = null;
    
    @org.jetbrains.annotations.NotNull()
    public final ltd.matrixstudios.bukkit.grant.Grant copy(@org.jetbrains.annotations.NotNull()
    java.util.UUID randomId, @org.jetbrains.annotations.NotNull()
    java.util.UUID target, @org.jetbrains.annotations.NotNull()
    java.util.UUID executor, long duration, long addedAt, @org.jetbrains.annotations.Nullable()
    java.lang.Long removedAt, @org.jetbrains.annotations.NotNull()
    java.lang.String reason, @org.jetbrains.annotations.NotNull()
    java.lang.String rank, @org.jetbrains.annotations.Nullable()
    java.util.UUID removedBy, @org.jetbrains.annotations.Nullable()
    java.lang.String removedReason) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public Grant(@org.jetbrains.annotations.NotNull()
    java.util.UUID randomId, @org.jetbrains.annotations.NotNull()
    java.util.UUID target, @org.jetbrains.annotations.NotNull()
    java.util.UUID executor, long duration, long addedAt, @org.jetbrains.annotations.Nullable()
    java.lang.Long removedAt, @org.jetbrains.annotations.NotNull()
    java.lang.String reason, @org.jetbrains.annotations.NotNull()
    java.lang.String rank, @org.jetbrains.annotations.Nullable()
    java.util.UUID removedBy, @org.jetbrains.annotations.Nullable()
    java.lang.String removedReason) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.UUID component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.UUID getRandomId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.UUID component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.UUID getTarget() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.UUID component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.UUID getExecutor() {
        return null;
    }
    
    public final long component4() {
        return 0L;
    }
    
    public final long getDuration() {
        return 0L;
    }
    
    public final long component5() {
        return 0L;
    }
    
    public final long getAddedAt() {
        return 0L;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getRemovedAt() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getReason() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getRank() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.UUID component9() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.UUID getRemovedBy() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getRemovedReason() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final ltd.matrixstudios.bukkit.ranks.Rank getGrantedRank() {
        return null;
    }
}