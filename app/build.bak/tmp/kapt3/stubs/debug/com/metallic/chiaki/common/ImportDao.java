package com.metallic.chiaki.common;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u00002\u00020\u0001:\u0001\u0011B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0016\u0010\u0007\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\'J\u0016\u0010\u000b\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\f0\tH\'J\u001c\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\t2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\tH\'\u00a8\u0006\u0012"}, d2 = {"Lcom/metallic/chiaki/common/ImportDao;", "", "()V", "import", "", "settings", "Lcom/metallic/chiaki/common/SerializedSettings;", "insertManualHosts", "hosts", "", "Lcom/metallic/chiaki/common/ManualHost;", "insertRegisteredHosts", "Lcom/metallic/chiaki/common/RegisteredHost;", "registeredHostsByMac", "Lcom/metallic/chiaki/common/ImportDao$IdWithMac;", "macs", "Lcom/metallic/chiaki/common/MacAddress;", "IdWithMac", "app_debug"})
public abstract class ImportDao {
    
    @androidx.room.Insert()
    public abstract void insertRegisteredHosts(@org.jetbrains.annotations.NotNull()
    java.util.List<com.metallic.chiaki.common.RegisteredHost> hosts);
    
    @androidx.room.Insert()
    public abstract void insertManualHosts(@org.jetbrains.annotations.NotNull()
    java.util.List<com.metallic.chiaki.common.ManualHost> hosts);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT id, server_mac AS mac FROM registered_host WHERE server_mac IN (:macs)")
    public abstract java.util.List<com.metallic.chiaki.common.ImportDao.IdWithMac> registeredHostsByMac(@org.jetbrains.annotations.NotNull()
    java.util.List<com.metallic.chiaki.common.MacAddress> macs);
    
    public ImportDao() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u000b"}, d2 = {"Lcom/metallic/chiaki/common/ImportDao$IdWithMac;", "", "id", "", "mac", "Lcom/metallic/chiaki/common/MacAddress;", "(JLcom/metallic/chiaki/common/MacAddress;)V", "getId", "()J", "getMac", "()Lcom/metallic/chiaki/common/MacAddress;", "app_debug"})
    public static final class IdWithMac {
        private final long id = 0L;
        @org.jetbrains.annotations.NotNull()
        private final com.metallic.chiaki.common.MacAddress mac = null;
        
        public final long getId() {
            return 0L;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.metallic.chiaki.common.MacAddress getMac() {
            return null;
        }
        
        public IdWithMac(long id, @org.jetbrains.annotations.NotNull()
        com.metallic.chiaki.common.MacAddress mac) {
            super();
        }
    }
}