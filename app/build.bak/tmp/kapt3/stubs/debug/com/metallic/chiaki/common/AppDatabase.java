package com.metallic.chiaki.common;

import java.lang.System;

@androidx.room.TypeConverters(value = {com.metallic.chiaki.common.Converters.class})
@androidx.room.Database(version = 2, entities = {com.metallic.chiaki.common.RegisteredHost.class, com.metallic.chiaki.common.ManualHost.class})
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\bH&\u00a8\u0006\t"}, d2 = {"Lcom/metallic/chiaki/common/AppDatabase;", "Landroidx/room/RoomDatabase;", "()V", "importDao", "Lcom/metallic/chiaki/common/ImportDao;", "manualHostDao", "Lcom/metallic/chiaki/common/ManualHostDao;", "registeredHostDao", "Lcom/metallic/chiaki/common/RegisteredHostDao;", "app_debug"})
public abstract class AppDatabase extends androidx.room.RoomDatabase {
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.metallic.chiaki.common.RegisteredHostDao registeredHostDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.metallic.chiaki.common.ManualHostDao manualHostDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.metallic.chiaki.common.ImportDao importDao();
    
    public AppDatabase() {
        super();
    }
}