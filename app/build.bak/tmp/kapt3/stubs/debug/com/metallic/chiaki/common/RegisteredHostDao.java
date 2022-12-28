package com.metallic.chiaki.common;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\bg\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\'J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\'J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\'J\u0014\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\r0\u0003H\'J\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\u000f2\u0006\u0010\n\u001a\u00020\u000bH\'J\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0007\u001a\u00020\bH\'\u00a8\u0006\u0013"}, d2 = {"Lcom/metallic/chiaki/common/RegisteredHostDao;", "", "count", "Lio/reactivex/Flowable;", "", "delete", "Lio/reactivex/Completable;", "host", "Lcom/metallic/chiaki/common/RegisteredHost;", "deleteByMac", "mac", "Lcom/metallic/chiaki/common/MacAddress;", "getAll", "", "getByMac", "Lio/reactivex/Maybe;", "insert", "Lio/reactivex/Single;", "", "app_debug"})
public abstract interface RegisteredHostDao {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM registered_host")
    public abstract io.reactivex.Flowable<java.util.List<com.metallic.chiaki.common.RegisteredHost>> getAll();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM registered_host WHERE server_mac == :mac LIMIT 1")
    public abstract io.reactivex.Maybe<com.metallic.chiaki.common.RegisteredHost> getByMac(@org.jetbrains.annotations.NotNull()
    com.metallic.chiaki.common.MacAddress mac);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "DELETE FROM registered_host WHERE server_mac == :mac")
    public abstract io.reactivex.Completable deleteByMac(@org.jetbrains.annotations.NotNull()
    com.metallic.chiaki.common.MacAddress mac);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Delete()
    public abstract io.reactivex.Completable delete(@org.jetbrains.annotations.NotNull()
    com.metallic.chiaki.common.RegisteredHost host);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT COUNT(*) FROM registered_host")
    public abstract io.reactivex.Flowable<java.lang.Integer> count();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Insert()
    public abstract io.reactivex.Single<java.lang.Long> insert(@org.jetbrains.annotations.NotNull()
    com.metallic.chiaki.common.RegisteredHost host);
}