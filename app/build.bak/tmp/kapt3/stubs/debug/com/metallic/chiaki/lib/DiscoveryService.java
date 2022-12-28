package com.metallic.chiaki.lib;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B8\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012)\u0010\u0004\u001a%\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\fJ\u0006\u0010\u0011\u001a\u00020\u000bJ\u001b\u0010\u0012\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u0013H\u0002\u00a2\u0006\u0002\u0010\u0014R4\u0010\u0004\u001a%\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/metallic/chiaki/lib/DiscoveryService;", "", "options", "Lcom/metallic/chiaki/lib/DiscoveryServiceOptions;", "callback", "Lkotlin/Function1;", "", "Lcom/metallic/chiaki/lib/DiscoveryHost;", "Lkotlin/ParameterName;", "name", "hosts", "", "(Lcom/metallic/chiaki/lib/DiscoveryServiceOptions;Lkotlin/jvm/functions/Function1;)V", "getCallback", "()Lkotlin/jvm/functions/Function1;", "nativePtr", "", "dispose", "hostsUpdated", "", "([Lcom/metallic/chiaki/lib/DiscoveryHost;)V", "Companion", "app_debug"})
public final class DiscoveryService {
    private long nativePtr;
    @org.jetbrains.annotations.Nullable()
    private final kotlin.jvm.functions.Function1<java.util.List<com.metallic.chiaki.lib.DiscoveryHost>, kotlin.Unit> callback = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.metallic.chiaki.lib.DiscoveryService.Companion Companion = null;
    
    public final void dispose() {
    }
    
    private final void hostsUpdated(com.metallic.chiaki.lib.DiscoveryHost[] hosts) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final kotlin.jvm.functions.Function1<java.util.List<com.metallic.chiaki.lib.DiscoveryHost>, kotlin.Unit> getCallback() {
        return null;
    }
    
    public DiscoveryService(@org.jetbrains.annotations.NotNull()
    com.metallic.chiaki.lib.DiscoveryServiceOptions options, @org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function1<? super java.util.List<com.metallic.chiaki.lib.DiscoveryHost>, kotlin.Unit> callback) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J2\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f\u00f8\u0001\u0000\u00a2\u0006\u0004\b\r\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000f"}, d2 = {"Lcom/metallic/chiaki/lib/DiscoveryService$Companion;", "", "()V", "wakeup", "", "service", "Lcom/metallic/chiaki/lib/DiscoveryService;", "host", "", "userCredential", "Lkotlin/ULong;", "ps5", "", "wakeup-pw_jGAI", "(Lcom/metallic/chiaki/lib/DiscoveryService;Ljava/lang/String;JZ)V", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}