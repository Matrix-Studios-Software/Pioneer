package ltd.matrixstudios.bukkit.grant;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\u001e\n\u0000\bf\u0018\u00002\u00020\u0001J.\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\u0014\b\u0001\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\bH\'J\u001e\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\n0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\'\u00a8\u0006\u000b"}, d2 = {"Lltd/matrixstudios/bukkit/grant/GrantService;", "", "addTo", "Lretrofit2/Call;", "Lltd/matrixstudios/bukkit/grant/Grant;", "id", "", "data", "", "get", "", "bukkit"})
public abstract interface GrantService {
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmSuppressWildcards()
    @retrofit2.http.POST(value = "grants/addTo/{id}")
    public abstract retrofit2.Call<ltd.matrixstudios.bukkit.grant.Grant> addTo(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "id")
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    java.util.Map<java.lang.String, java.lang.Object> data);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "grants/getByTarget/{id}")
    public abstract retrofit2.Call<java.util.Collection<ltd.matrixstudios.bukkit.grant.Grant>> get(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "id")
    java.lang.String id);
}