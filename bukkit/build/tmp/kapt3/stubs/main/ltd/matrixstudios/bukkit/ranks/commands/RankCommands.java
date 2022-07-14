package ltd.matrixstudios.bukkit.ranks.commands;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\bH\u0007\u00a8\u0006\t"}, d2 = {"Lltd/matrixstudios/bukkit/ranks/commands/RankCommands;", "Lco/aikar/commands/BaseCommand;", "()V", "create", "", "sender", "Lorg/bukkit/command/CommandSender;", "name", "", "bukkit"})
@co.aikar.commands.annotation.CommandPermission(value = "pioneer.ranks.admin")
@co.aikar.commands.annotation.CommandAlias(value = "rank")
public final class RankCommands extends co.aikar.commands.BaseCommand {
    
    public RankCommands() {
        super();
    }
    
    @co.aikar.commands.annotation.Subcommand(value = "create")
    public final void create(@org.jetbrains.annotations.NotNull()
    org.bukkit.command.CommandSender sender, @org.jetbrains.annotations.NotNull()
    @co.aikar.commands.annotation.Name(value = "rankName")
    java.lang.String name) {
    }
}