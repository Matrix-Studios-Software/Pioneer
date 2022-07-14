package ltd.matrixstudios.bukkit.utils.menu.navigation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0013B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0001\u00a2\u0006\u0002\u0010\u0007J\u001c\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u0003H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u00a8\u0006\u0014"}, d2 = {"Lltd/matrixstudios/bukkit/utils/menu/navigation/PageNavigationMenu;", "Lltd/matrixstudios/bukkit/utils/menu/pagination/PaginatedMenu;", "player", "Lorg/bukkit/entity/Player;", "maxPages", "", "menu", "(Lorg/bukkit/entity/Player;ILltd/matrixstudios/bukkit/utils/menu/pagination/PaginatedMenu;)V", "getMaxPages", "()I", "getMenu", "()Lltd/matrixstudios/bukkit/utils/menu/pagination/PaginatedMenu;", "getPlayer", "()Lorg/bukkit/entity/Player;", "getPagesButtons", "", "Lltd/matrixstudios/bukkit/utils/menu/Button;", "getTitle", "", "PageNavigationButton", "bukkit"})
public final class PageNavigationMenu extends ltd.matrixstudios.bukkit.utils.menu.pagination.PaginatedMenu {
    @org.jetbrains.annotations.NotNull()
    private final org.bukkit.entity.Player player = null;
    private final int maxPages = 0;
    @org.jetbrains.annotations.NotNull()
    private final ltd.matrixstudios.bukkit.utils.menu.pagination.PaginatedMenu menu = null;
    
    public PageNavigationMenu(@org.jetbrains.annotations.NotNull()
    org.bukkit.entity.Player player, int maxPages, @org.jetbrains.annotations.NotNull()
    ltd.matrixstudios.bukkit.utils.menu.pagination.PaginatedMenu menu) {
        super(0, null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.bukkit.entity.Player getPlayer() {
        return null;
    }
    
    public final int getMaxPages() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ltd.matrixstudios.bukkit.utils.menu.pagination.PaginatedMenu getMenu() {
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
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\n\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0018\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00102\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\u000eH\u0016J \u0010\u0015\u001a\u00020\u00162\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0019H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u001a"}, d2 = {"Lltd/matrixstudios/bukkit/utils/menu/navigation/PageNavigationMenu$PageNavigationButton;", "Lltd/matrixstudios/bukkit/utils/menu/Button;", "page", "", "menu", "Lltd/matrixstudios/bukkit/utils/menu/pagination/PaginatedMenu;", "(ILltd/matrixstudios/bukkit/utils/menu/pagination/PaginatedMenu;)V", "getMenu", "()Lltd/matrixstudios/bukkit/utils/menu/pagination/PaginatedMenu;", "getPage", "()I", "getData", "", "player", "Lorg/bukkit/entity/Player;", "getDescription", "", "", "getDisplayName", "getMaterial", "Lorg/bukkit/Material;", "onClick", "", "slot", "type", "Lorg/bukkit/event/inventory/ClickType;", "bukkit"})
    public static final class PageNavigationButton extends ltd.matrixstudios.bukkit.utils.menu.Button {
        private final int page = 0;
        @org.jetbrains.annotations.NotNull()
        private final ltd.matrixstudios.bukkit.utils.menu.pagination.PaginatedMenu menu = null;
        
        public PageNavigationButton(int page, @org.jetbrains.annotations.NotNull()
        ltd.matrixstudios.bukkit.utils.menu.pagination.PaginatedMenu menu) {
            super();
        }
        
        public final int getPage() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ltd.matrixstudios.bukkit.utils.menu.pagination.PaginatedMenu getMenu() {
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