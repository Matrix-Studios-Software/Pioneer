package ltd.matrixstudios.bukkit.grant.menu;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0012B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007J\u001c\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r2\u0006\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0002\u001a\u00020\u0003H\u0016R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0013"}, d2 = {"Lltd/matrixstudios/bukkit/grant/menu/GrantsMenu;", "Lltd/matrixstudios/bukkit/utils/menu/pagination/PaginatedMenu;", "player", "Lorg/bukkit/entity/Player;", "grants", "", "Lltd/matrixstudios/bukkit/grant/Grant;", "(Lorg/bukkit/entity/Player;Ljava/util/Collection;)V", "getGrants", "()Ljava/util/Collection;", "getPlayer", "()Lorg/bukkit/entity/Player;", "getPagesButtons", "", "", "Lltd/matrixstudios/bukkit/utils/menu/Button;", "getTitle", "", "GrantsButton", "bukkit"})
public final class GrantsMenu extends ltd.matrixstudios.bukkit.utils.menu.pagination.PaginatedMenu {
    @org.jetbrains.annotations.NotNull()
    private final org.bukkit.entity.Player player = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.Collection<ltd.matrixstudios.bukkit.grant.Grant> grants = null;
    
    public GrantsMenu(@org.jetbrains.annotations.NotNull()
    org.bukkit.entity.Player player, @org.jetbrains.annotations.NotNull()
    java.util.Collection<ltd.matrixstudios.bukkit.grant.Grant> grants) {
        super(0, null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.bukkit.entity.Player getPlayer() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Collection<ltd.matrixstudios.bukkit.grant.Grant> getGrants() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.Map<java.lang.Integer, ltd.matrixstudios.bukkit.utils.menu.Button> getPagesButtons(@org.jetbrains.annotations.NotNull()
    org.bukkit.entity.Player player) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getTitle(@org.jetbrains.annotations.NotNull()
    org.bukkit.entity.Player player) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\n\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\nH\u0016J \u0010\u0011\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0017"}, d2 = {"Lltd/matrixstudios/bukkit/grant/menu/GrantsMenu$GrantsButton;", "Lltd/matrixstudios/bukkit/utils/menu/Button;", "grant", "Lltd/matrixstudios/bukkit/grant/Grant;", "(Lltd/matrixstudios/bukkit/grant/Grant;)V", "getGrant", "()Lltd/matrixstudios/bukkit/grant/Grant;", "getData", "", "player", "Lorg/bukkit/entity/Player;", "getDescription", "", "", "getDisplayName", "getMaterial", "Lorg/bukkit/Material;", "onClick", "", "slot", "", "type", "Lorg/bukkit/event/inventory/ClickType;", "bukkit"})
    public static final class GrantsButton extends ltd.matrixstudios.bukkit.utils.menu.Button {
        @org.jetbrains.annotations.NotNull()
        private final ltd.matrixstudios.bukkit.grant.Grant grant = null;
        
        public GrantsButton(@org.jetbrains.annotations.NotNull()
        ltd.matrixstudios.bukkit.grant.Grant grant) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ltd.matrixstudios.bukkit.grant.Grant getGrant() {
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
}