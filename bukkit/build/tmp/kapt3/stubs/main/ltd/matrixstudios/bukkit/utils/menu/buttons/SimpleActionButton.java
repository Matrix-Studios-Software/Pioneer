package ltd.matrixstudios.bukkit.utils.menu.buttons;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0011\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012 \u0010\n\u001a\u001c\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000b\u00a2\u0006\u0002\u0010\u0010J\u0010\u0010\u0013\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\fH\u0016J\u0018\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0006\u0010\u001b\u001a\u00020\fH\u0016J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u001b\u001a\u00020\fH\u0016J\u0010\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\fH\u0016J \u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\u000eH\u0016R+\u0010\n\u001a\u001c\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a\u00a8\u0006 "}, d2 = {"Lltd/matrixstudios/bukkit/utils/menu/buttons/SimpleActionButton;", "Lltd/matrixstudios/bukkit/utils/menu/Button;", "material", "Lorg/bukkit/Material;", "description", "", "", "name", "data", "", "body", "Lkotlin/Function3;", "Lorg/bukkit/entity/Player;", "", "Lorg/bukkit/event/inventory/ClickType;", "", "(Lorg/bukkit/Material;Ljava/util/List;Ljava/lang/String;SLkotlin/jvm/functions/Function3;)V", "getBody", "()Lkotlin/jvm/functions/Function3;", "getData", "()S", "getDescription", "()Ljava/util/List;", "getMaterial", "()Lorg/bukkit/Material;", "getName", "()Ljava/lang/String;", "player", "getDisplayName", "onClick", "slot", "type", "bukkit"})
public final class SimpleActionButton extends ltd.matrixstudios.bukkit.utils.menu.Button {
    @org.jetbrains.annotations.NotNull()
    private final org.bukkit.Material material = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.String> description = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String name = null;
    private final short data = 0;
    @org.jetbrains.annotations.Nullable()
    private final kotlin.jvm.functions.Function3<org.bukkit.entity.Player, java.lang.Integer, org.bukkit.event.inventory.ClickType, kotlin.Unit> body = null;
    
    public SimpleActionButton(@org.jetbrains.annotations.NotNull()
    org.bukkit.Material material, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> description, @org.jetbrains.annotations.NotNull()
    java.lang.String name, short data, @org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function3<? super org.bukkit.entity.Player, ? super java.lang.Integer, ? super org.bukkit.event.inventory.ClickType, kotlin.Unit> body) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.bukkit.Material getMaterial() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getDescription() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    public final short getData() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final kotlin.jvm.functions.Function3<org.bukkit.entity.Player, java.lang.Integer, org.bukkit.event.inventory.ClickType, kotlin.Unit> getBody() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.bukkit.Material getMaterial(@org.jetbrains.annotations.NotNull()
    org.bukkit.entity.Player player) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.util.List<java.lang.String> getDescription(@org.jetbrains.annotations.NotNull()
    org.bukkit.entity.Player player) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.String getDisplayName(@org.jetbrains.annotations.NotNull()
    org.bukkit.entity.Player player) {
        return null;
    }
    
    @java.lang.Override()
    public short getData(@org.jetbrains.annotations.NotNull()
    org.bukkit.entity.Player player) {
        return 0;
    }
    
    @java.lang.Override()
    public void onClick(@org.jetbrains.annotations.NotNull()
    org.bukkit.entity.Player player, int slot, @org.jetbrains.annotations.NotNull()
    org.bukkit.event.inventory.ClickType type) {
    }
}