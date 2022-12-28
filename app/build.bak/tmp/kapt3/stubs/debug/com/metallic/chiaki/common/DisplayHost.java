package com.metallic.chiaki.common;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0012\u0010\u0003\u001a\u00020\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\u0006R\u0012\u0010\t\u001a\u00020\nX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\u000bR\u0011\u0010\f\u001a\u00020\n8F\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\u000bR\u0014\u0010\r\u001a\u0004\u0018\u00010\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012\u0082\u0001\u0002\u0013\u0014\u00a8\u0006\u0015"}, d2 = {"Lcom/metallic/chiaki/common/DisplayHost;", "", "()V", "host", "", "getHost", "()Ljava/lang/String;", "id", "getId", "isPS5", "", "()Z", "isRegistered", "name", "getName", "registeredHost", "Lcom/metallic/chiaki/common/RegisteredHost;", "getRegisteredHost", "()Lcom/metallic/chiaki/common/RegisteredHost;", "Lcom/metallic/chiaki/common/DiscoveredDisplayHost;", "Lcom/metallic/chiaki/common/ManualDisplayHost;", "app_debug"})
public abstract class DisplayHost {
    
    @org.jetbrains.annotations.Nullable()
    public abstract com.metallic.chiaki.common.RegisteredHost getRegisteredHost();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getHost();
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.String getName();
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.String getId();
    
    public abstract boolean isPS5();
    
    public final boolean isRegistered() {
        return false;
    }
    
    private DisplayHost() {
        super();
    }
}