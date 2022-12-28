package com.metallic.chiaki.common;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u001f\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\'\u00a2\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH\'J\u0014\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\r0\fH\'J\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\u000f2\u0006\u0010\u0010\u001a\u00020\u0005H\'J\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u000f2\u0006\u0010\u0010\u001a\u00020\u0005H\'J\u0010\u0010\u0013\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH\'J\u0010\u0010\u0014\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH\'\u00a8\u0006\u0015"}, d2 = {"Lcom/metallic/chiaki/common/ManualHostDao;", "", "assignRegisteredHost", "Lio/reactivex/Completable;", "manualHostId", "", "registeredHostId", "(JLjava/lang/Long;)Lio/reactivex/Completable;", "delete", "host", "Lcom/metallic/chiaki/common/ManualHost;", "getAll", "Lio/reactivex/Flowable;", "", "getById", "Lio/reactivex/Single;", "id", "getByIdWithRegisteredHost", "Lcom/metallic/chiaki/common/ManualHostAndRegisteredHost;", "insert", "update", "app_debug"})
public abstract interface ManualHostDao {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM manual_host WHERE id = :id")
    public abstract io.reactivex.Single<com.metallic.chiaki.common.ManualHost> getById(long id);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT\n\t\t\tmanual_host.id as manual_host_id,\n\t\t\tmanual_host.host as manual_host_host,\n\t\t\tmanual_host.registered_host as manual_host_registered_host,\n\t\t\tregistered_host.*\n\t\tFROM manual_host LEFT OUTER JOIN registered_host ON manual_host.registered_host = registered_host.id WHERE manual_host.id = :id")
    public abstract io.reactivex.Single<com.metallic.chiaki.common.ManualHostAndRegisteredHost> getByIdWithRegisteredHost(long id);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM manual_host")
    public abstract io.reactivex.Flowable<java.util.List<com.metallic.chiaki.common.ManualHost>> getAll();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "UPDATE manual_host SET registered_host = :registeredHostId WHERE id = :manualHostId")
    public abstract io.reactivex.Completable assignRegisteredHost(long manualHostId, @org.jetbrains.annotations.Nullable()
    java.lang.Long registeredHostId);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Insert()
    public abstract io.reactivex.Completable insert(@org.jetbrains.annotations.NotNull()
    com.metallic.chiaki.common.ManualHost host);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Delete()
    public abstract io.reactivex.Completable delete(@org.jetbrains.annotations.NotNull()
    com.metallic.chiaki.common.ManualHost host);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Update()
    public abstract io.reactivex.Completable update(@org.jetbrains.annotations.NotNull()
    com.metallic.chiaki.common.ManualHost host);
}