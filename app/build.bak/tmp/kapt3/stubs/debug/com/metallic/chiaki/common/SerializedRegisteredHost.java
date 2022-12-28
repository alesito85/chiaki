package com.metallic.chiaki.common;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004Bs\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\b\b\u0001\u0010\f\u001a\u00020\r\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\b\u0012\b\b\u0001\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0001\u0010\u0011\u001a\u00020\u0012\u0012\b\b\u0001\u0010\u0013\u001a\u00020\u0010\u00a2\u0006\u0002\u0010\u0014R\u0013\u0010\t\u001a\u0004\u0018\u00010\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\n\u001a\u0004\u0018\u00010\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0011\u0010\u0013\u001a\u00020\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0011\u001a\u00020\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u000f\u001a\u00020\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001bR\u0011\u0010\f\u001a\u00020\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\b\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0016R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010#\u00a8\u0006$"}, d2 = {"Lcom/metallic/chiaki/common/SerializedRegisteredHost;", "", "registeredHost", "Lcom/metallic/chiaki/common/RegisteredHost;", "(Lcom/metallic/chiaki/common/RegisteredHost;)V", "target", "Lcom/metallic/chiaki/lib/Target;", "apSsid", "", "apBssid", "apKey", "apName", "serverMac", "Lcom/metallic/chiaki/common/MacAddress;", "serverNickname", "rpRegistKey", "", "rpKeyType", "", "rpKey", "(Lcom/metallic/chiaki/lib/Target;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/metallic/chiaki/common/MacAddress;Ljava/lang/String;[BI[B)V", "getApBssid", "()Ljava/lang/String;", "getApKey", "getApName", "getApSsid", "getRpKey", "()[B", "getRpKeyType", "()I", "getRpRegistKey", "getServerMac", "()Lcom/metallic/chiaki/common/MacAddress;", "getServerNickname", "getTarget", "()Lcom/metallic/chiaki/lib/Target;", "app_debug"})
@com.squareup.moshi.JsonClass(generateAdapter = true)
public final class SerializedRegisteredHost {
    @org.jetbrains.annotations.NotNull()
    private final com.metallic.chiaki.lib.Target target = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String apSsid = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String apBssid = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String apKey = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String apName = null;
    @org.jetbrains.annotations.NotNull()
    private final com.metallic.chiaki.common.MacAddress serverMac = null;
    @org.jetbrains.annotations.Nullable()
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
    
    public SerializedRegisteredHost(@org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "target")
    com.metallic.chiaki.lib.Target target, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "ap_ssid")
    java.lang.String apSsid, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "ap_bssid")
    java.lang.String apBssid, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "ap_key")
    java.lang.String apKey, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "ap_name")
    java.lang.String apName, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "server_mac")
    com.metallic.chiaki.common.MacAddress serverMac, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "server_nickname")
    java.lang.String serverNickname, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "rp_regist_key")
    byte[] rpRegistKey, @com.squareup.moshi.Json(name = "rp_key_type")
    int rpKeyType, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "rp_key")
    byte[] rpKey) {
        super();
    }
    
    public SerializedRegisteredHost(@org.jetbrains.annotations.NotNull()
    com.metallic.chiaki.common.RegisteredHost registeredHost) {
        super();
    }
}