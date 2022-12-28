package com.metallic.chiaki.lib;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007\u00a2\u0006\u0002\u0010\nJ\u0006\u0010\u000f\u001a\u00020\tJ\u0010\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\bH\u0002J\u0006\u0010\u0011\u001a\u00020\tR\u001d\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/metallic/chiaki/lib/Regist;", "", "info", "Lcom/metallic/chiaki/lib/RegistInfo;", "log", "Lcom/metallic/chiaki/lib/ChiakiLog;", "callback", "Lkotlin/Function1;", "Lcom/metallic/chiaki/lib/RegistEvent;", "", "(Lcom/metallic/chiaki/lib/RegistInfo;Lcom/metallic/chiaki/lib/ChiakiLog;Lkotlin/jvm/functions/Function1;)V", "getCallback", "()Lkotlin/jvm/functions/Function1;", "nativePtr", "", "dispose", "event", "stop", "app_debug"})
public final class Regist {
    private long nativePtr;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function1<com.metallic.chiaki.lib.RegistEvent, kotlin.Unit> callback = null;
    
    public final void stop() {
    }
    
    public final void dispose() {
    }
    
    private final void event(com.metallic.chiaki.lib.RegistEvent event) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function1<com.metallic.chiaki.lib.RegistEvent, kotlin.Unit> getCallback() {
        return null;
    }
    
    public Regist(@org.jetbrains.annotations.NotNull()
    com.metallic.chiaki.lib.RegistInfo info, @org.jetbrains.annotations.NotNull()
    com.metallic.chiaki.lib.ChiakiLog log, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.metallic.chiaki.lib.RegistEvent, kotlin.Unit> callback) {
        super();
    }
}