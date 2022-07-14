package ltd.matrixstudios.bukkit.grant;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\n2\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\r\u00a8\u0006\u000e"}, d2 = {"Lltd/matrixstudios/bukkit/grant/GrantManager;", "", "()V", "addGrantToPlayer", "", "target", "Ljava/util/UUID;", "grant", "Lltd/matrixstudios/bukkit/grant/Grant;", "getGrantsForTarget", "", "getSenderUUID", "sender", "Lorg/bukkit/command/CommandSender;", "bukkit"})
public final class GrantManager {
    @org.jetbrains.annotations.NotNull()
    public static final ltd.matrixstudios.bukkit.grant.GrantManager INSTANCE = null;
    
    private GrantManager() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Collection<ltd.matrixstudios.bukkit.grant.Grant> getGrantsForTarget(@org.jetbrains.annotations.NotNull()
    java.util.UUID target) {
        return null;
    }
    
    public final void addGrantToPlayer(@org.jetbrains.annotations.NotNull()
    java.util.UUID target, @org.jetbrains.annotations.NotNull()
    ltd.matrixstudios.bukkit.grant.Grant grant) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.UUID getSenderUUID(@org.jetbrains.annotations.NotNull()
    org.bukkit.command.CommandSender sender) {
        return null;
    }
}