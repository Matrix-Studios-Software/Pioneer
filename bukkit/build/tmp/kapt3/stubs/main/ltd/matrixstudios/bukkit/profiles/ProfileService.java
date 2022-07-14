package ltd.matrixstudios.bukkit.profiles;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\'J\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\'J\u0014\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\n0\u0003H\'J.\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\u0014\b\u0001\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\rH\'J\u0018\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\'\u00a8\u0006\u0010"}, d2 = {"Lltd/matrixstudios/bukkit/profiles/ProfileService;", "", "byUUID", "Lretrofit2/Call;", "Lltd/matrixstudios/bukkit/profiles/Profile;", "uuid", "", "exists", "", "fetch", "", "load", "data", "", "squash", "Ljava/lang/Void;", "bukkit"})
public abstract interface ProfileService {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "profiles/fetch")
    public abstract retrofit2.Call<java.util.Collection<ltd.matrixstudios.bukkit.profiles.Profile>> fetch();
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmSuppressWildcards()
    @retrofit2.http.POST(value = "profiles/load/{id}")
    public abstract retrofit2.Call<ltd.matrixstudios.bukkit.profiles.Profile> load(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "id")
    java.lang.String uuid, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    java.util.Map<java.lang.String, java.lang.Object> data);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "profiles/byUUID/{id}")
    public abstract retrofit2.Call<ltd.matrixstudios.bukkit.profiles.Profile> byUUID(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "id")
    java.lang.String uuid);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "profiles/squash/{id}")
    public abstract retrofit2.Call<java.lang.Void> squash(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "id")
    java.lang.String uuid);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "profiles/exists/{id}")
    public abstract retrofit2.Call<java.lang.Boolean> exists(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "id")
    java.lang.String uuid);
}