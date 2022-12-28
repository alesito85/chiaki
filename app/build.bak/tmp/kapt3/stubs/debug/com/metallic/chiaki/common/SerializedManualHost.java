package com.metallic.chiaki.common;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u000b"}, d2 = {"Lcom/metallic/chiaki/common/SerializedManualHost;", "", "host", "", "serverMac", "Lcom/metallic/chiaki/common/MacAddress;", "(Ljava/lang/String;Lcom/metallic/chiaki/common/MacAddress;)V", "getHost", "()Ljava/lang/String;", "getServerMac", "()Lcom/metallic/chiaki/common/MacAddress;", "app_debug"})
@com.squareup.moshi.JsonClass(generateAdapter = true)
public final class SerializedManualHost {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String host = null;
    @org.jetbrains.annotations.Nullable()
    private final com.metallic.chiaki.common.MacAddress serverMac = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getHost() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.metallic.chiaki.common.MacAddress getServerMac() {
        return null;
    }
    
    public SerializedManualHost(@org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "host")
    java.lang.String host, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "server_mac")
    com.metallic.chiaki.common.MacAddress serverMac) {
        super();
    }
}