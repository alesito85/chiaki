package com.metallic.chiaki.common;

import java.lang.System;

@androidx.room.Entity(tableName = "registered_host")
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b \n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004Bi\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0012\u00a2\u0006\u0002\u0010\u0016J\t\u0010(\u001a\u00020\u0006H\u00c6\u0003J\t\u0010)\u001a\u00020\u0014H\u00c6\u0003J\t\u0010*\u001a\u00020\u0012H\u00c6\u0003J\t\u0010+\u001a\u00020\bH\u00c6\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\t\u00100\u001a\u00020\u000fH\u00c6\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\t\u00102\u001a\u00020\u0012H\u00c6\u0003J\u0081\u0001\u00103\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u0012H\u00c6\u0001J\u0013\u00104\u001a\u0002052\b\u00106\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u00107\u001a\u00020\u0014H\u0016J\t\u00108\u001a\u00020\nH\u00d6\u0001R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0018\u0010\f\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0018\u0010\r\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0018R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\u0015\u001a\u00020\u00128\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010\u0013\u001a\u00020\u00148\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0016\u0010\u0011\u001a\u00020\u00128\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001fR\u0016\u0010\u000e\u001a\u00020\u000f8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0018R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\'\u00a8\u00069"}, d2 = {"Lcom/metallic/chiaki/common/RegisteredHost;", "", "registHost", "Lcom/metallic/chiaki/lib/RegistHost;", "(Lcom/metallic/chiaki/lib/RegistHost;)V", "id", "", "target", "Lcom/metallic/chiaki/lib/Target;", "apSsid", "", "apBssid", "apKey", "apName", "serverMac", "Lcom/metallic/chiaki/common/MacAddress;", "serverNickname", "rpRegistKey", "", "rpKeyType", "", "rpKey", "(JLcom/metallic/chiaki/lib/Target;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/metallic/chiaki/common/MacAddress;Ljava/lang/String;[BI[B)V", "getApBssid", "()Ljava/lang/String;", "getApKey", "getApName", "getApSsid", "getId", "()J", "getRpKey", "()[B", "getRpKeyType", "()I", "getRpRegistKey", "getServerMac", "()Lcom/metallic/chiaki/common/MacAddress;", "getServerNickname", "getTarget", "()Lcom/metallic/chiaki/lib/Target;", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"})
public final class RegisteredHost {
    @androidx.room.PrimaryKey(autoGenerate = true)
    private final long id = 0L;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "target")
    private final com.metallic.chiaki.lib.Target target = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "ap_ssid")
    private final java.lang.String apSsid = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "ap_bssid")
    private final java.lang.String apBssid = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "ap_key")
    private final java.lang.String apKey = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "ap_name")
    private final java.lang.String apName = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "server_mac")
    private final com.metallic.chiaki.common.MacAddress serverMac = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "server_nickname")
    private final java.lang.String serverNickname = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "rp_regist_key", typeAffinity = androidx.room.ColumnInfo.BLOB)
    private final byte[] rpRegistKey = null;
    @androidx.room.ColumnInfo(name = "rp_key_type")
    private final int rpKeyType = 0;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "rp_key", typeAffinity = androidx.room.ColumnInfo.BLOB)
    private final byte[] rpKey = null;
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    public final long getId() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.metallic.chiaki.lib.Target getTarget() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getApSsid() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getApBssid() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getApKey() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getApName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.metallic.chiaki.common.MacAddress getServerMac() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getServerNickname() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final byte[] getRpRegistKey() {
        return null;
    }
    
    public final int getRpKeyType() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final byte[] getRpKey() {
        return null;
    }
    
    public RegisteredHost(long id, @org.jetbrains.annotations.NotNull()
    com.metallic.chiaki.lib.Target target, @org.jetbrains.annotations.Nullable()
    java.lang.String apSsid, @org.jetbrains.annotations.Nullable()
    java.lang.String apBssid, @org.jetbrains.annotations.Nullable()
    java.lang.String apKey, @org.jetbrains.annotations.Nullable()
    java.lang.String apName, @org.jetbrains.annotations.NotNull()
    com.metallic.chiaki.common.MacAddress serverMac, @org.jetbrains.annotations.Nullable()
    java.lang.String serverNickname, @org.jetbrains.annotations.NotNull()
    byte[] rpRegistKey, int rpKeyType, @org.jetbrains.annotations.NotNull()
    byte[] rpKey) {
        super();
    }
    
    public RegisteredHost(@org.jetbrains.annotations.NotNull()
    com.metallic.chiaki.lib.RegistHost registHost) {
        super();
    }
    
    public final long component1() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.metallic.chiaki.lib.Target component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.metallic.chiaki.common.MacAddress component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final byte[] component9() {
        return null;
    }
    
    public final int component10() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final byte[] component11() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.metallic.chiaki.common.RegisteredHost copy(long id, @org.jetbrains.annotations.NotNull()
    com.metallic.chiaki.lib.Target target, @org.jetbrains.annotations.Nullable()
    java.lang.String apSsid, @org.jetbrains.annotations.Nullable()
    java.lang.String apBssid, @org.jetbrains.annotations.Nullable()
    java.lang.String apKey, @org.jetbrains.annotations.Nullable()
    java.lang.String apName, @org.jetbrains.annotations.NotNull()
    com.metallic.chiaki.common.MacAddress serverMac, @org.jetbrains.annotations.Nullable()
    java.lang.String serverNickname, @org.jetbrains.annotations.NotNull()
    byte[] rpRegistKey, int rpKeyType, @org.jetbrains.annotations.NotNull()
    byte[] rpKey) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
}