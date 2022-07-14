package ltd.matrixstudios.bukkit.ranks;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H\'J\u001a\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00032\b\b\u0001\u0010\u0007\u001a\u00020\bH\'J\u0018\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\b\b\u0001\u0010\u0007\u001a\u00020\bH\'J\u0018\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\b\b\u0001\u0010\u0007\u001a\u00020\bH\'\u00a8\u0006\f"}, d2 = {"Lltd/matrixstudios/bukkit/ranks/RankService;", "", "fetch", "Lretrofit2/Call;", "", "Lltd/matrixstudios/bukkit/ranks/Rank;", "fetchWithId", "rankId", "", "make", "Ljava/lang/Void;", "squash", "bukkit"})
public abstract interface RankService {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "ranks/fetch")
    public abstract retrofit2.Call<java.util.Collection<ltd.matrixstudios.bukkit.ranks.Rank>> fetch();
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "ranks/squash/{id}")
    public abstract retrofit2.Call<java.lang.Void> squash(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "id")
    java.lang.String rankId);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "ranks/make/{id}")
    public abstract retrofit2.Call<java.lang.Void> make(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "id")
    java.lang.String rankId);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "ranks/fetchWithId/{id}")
    public abstract retrofit2.Call<ltd.matrixstudios.bukkit.ranks.Rank> fetchWithId(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "id")
    java.lang.String rankId);
}