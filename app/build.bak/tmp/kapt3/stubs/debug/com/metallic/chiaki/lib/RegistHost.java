package com.metallic.chiaki.lib;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BX\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\n\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010J\t\u0010 \u001a\u00020\u0003H\u00c6\u0003J\t\u0010!\u001a\u00020\nH\u00c6\u0003J\t\u0010\"\u001a\u00020\u0005H\u00c6\u0003J\t\u0010#\u001a\u00020\u0005H\u00c6\u0003J\t\u0010$\u001a\u00020\u0005H\u00c6\u0003J\t\u0010%\u001a\u00020\u0005H\u00c6\u0003J\t\u0010&\u001a\u00020\nH\u00c6\u0003J\t\u0010\'\u001a\u00020\u0005H\u00c6\u0003J\t\u0010(\u001a\u00020\nH\u00c6\u0003J\u0016\u0010)\u001a\u00020\u000eH\u00c6\u0003\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\b*\u0010\u0019Jw\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\nH\u00c6\u0001\u00f8\u0001\u0000\u00a2\u0006\u0004\b,\u0010-J\u0013\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00101\u001a\u000202H\u00d6\u0001J\t\u00103\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\b\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0011\u0010\u000f\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\r\u001a\u00020\u000e\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\f\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0017R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0017R\u0011\u0010\u000b\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f\u0082\u0002\b\n\u0002\b\u0019\n\u0002\b!\u00a8\u00064"}, d2 = {"Lcom/metallic/chiaki/lib/RegistHost;", "", "target", "Lcom/metallic/chiaki/lib/Target;", "apSsid", "", "apBssid", "apKey", "apName", "serverMac", "", "serverNickname", "rpRegistKey", "rpKeyType", "Lkotlin/UInt;", "rpKey", "(Lcom/metallic/chiaki/lib/Target;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[BLjava/lang/String;[BI[BLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getApBssid", "()Ljava/lang/String;", "getApKey", "getApName", "getApSsid", "getRpKey", "()[B", "getRpKeyType-pVg5ArA", "()I", "I", "getRpRegistKey", "getServerMac", "getServerNickname", "getTarget", "()Lcom/metallic/chiaki/lib/Target;", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component9-pVg5ArA", "copy", "copy-9xgIoZs", "(Lcom/metallic/chiaki/lib/Target;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[BLjava/lang/String;[BI[B)Lcom/metallic/chiaki/lib/RegistHost;", "equals", "", "other", "hashCode", "", "toString", "app_debug"})
public final class RegistHost {
    @org.jetbrains.annotations.NotNull()
    private final com.metallic.chiaki.lib.Target target = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String apSsid = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String apBssid = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String apKey = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String apName = null;
    @org.jetbrains.annotations.NotNull()
    private final byte[] serverMac = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String serverNickname = null;
    @org.jetbrains.annotations.NotNull()
    private final byte[] rpRegistKey = null;
    private final int rpKeyType = 0;
    @org.jetbrains.annotations.NotNull()
    private final byte[] rpKey = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.metallic.chiaki.lib.Target getTarget() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getApSsid() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getApBssid() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getApKey() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getApName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final byte[] getServerMac() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getServerNickname() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final byte[] getRpRegistKey() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final byte[] getRpKey() {
        return null;
    }
    
    private RegistHost(com.metallic.chiaki.lib.Target target, java.lang.String apSsid, java.lang.String apBssid, java.lang.String apKey, java.lang.String apName, byte[] serverMac, java.lang.String serverNickname, byte[] rpRegistKey, int rpKeyType, byte[] rpKey) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.metallic.chiaki.lib.Target component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final byte[] component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final byte[] component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final byte[] component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}