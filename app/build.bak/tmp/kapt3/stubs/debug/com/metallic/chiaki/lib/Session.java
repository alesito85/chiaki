package com.metallic.chiaki.lib;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001,B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0006\u0010\u0016\u001a\u00020\u000fJ\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000bH\u0002J\b\u0010\u0017\u001a\u00020\u000fH\u0002J\u0010\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u0007H\u0002J\u001a\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0005H\u0002J\u0018\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020\u001cH\u0002J\u000e\u0010!\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020#J\u000e\u0010$\u001a\u00020\u000f2\u0006\u0010%\u001a\u00020\u0005J\u0010\u0010&\u001a\u00020\u000f2\b\u0010\'\u001a\u0004\u0018\u00010(J\u0006\u0010)\u001a\u00020*J\u0006\u0010+\u001a\u00020*R7\u0010\t\u001a\u001f\u0012\u0013\u0012\u00110\u000b\u00a2\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006-"}, d2 = {"Lcom/metallic/chiaki/lib/Session;", "", "connectInfo", "Lcom/metallic/chiaki/lib/ConnectInfo;", "logFile", "", "logVerbose", "", "(Lcom/metallic/chiaki/lib/ConnectInfo;Ljava/lang/String;Z)V", "eventCallback", "Lkotlin/Function1;", "Lcom/metallic/chiaki/lib/Event;", "Lkotlin/ParameterName;", "name", "event", "", "getEventCallback", "()Lkotlin/jvm/functions/Function1;", "setEventCallback", "(Lkotlin/jvm/functions/Function1;)V", "nativePtr", "", "dispose", "eventConnected", "eventLoginPinRequest", "pinIncorrect", "eventQuit", "reasonValue", "", "reasonString", "eventRumble", "left", "right", "setControllerState", "controllerState", "Lcom/metallic/chiaki/lib/ControllerState;", "setLoginPin", "pin", "setSurface", "surface", "Landroid/view/Surface;", "start", "Lcom/metallic/chiaki/lib/ErrorCode;", "stop", "EventCallback", "app_debug"})
public final class Session {
    private long nativePtr;
    @org.jetbrains.annotations.Nullable()
    private kotlin.jvm.functions.Function1<? super com.metallic.chiaki.lib.Event, kotlin.Unit> eventCallback;
    
    @org.jetbrains.annotations.Nullable()
    public final kotlin.jvm.functions.Function1<com.metallic.chiaki.lib.Event, kotlin.Unit> getEventCallback() {
        return null;
    }
    
    public final void setEventCallback(@org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function1<? super com.metallic.chiaki.lib.Event, kotlin.Unit> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.metallic.chiaki.lib.ErrorCode start() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.metallic.chiaki.lib.ErrorCode stop() {
        return null;
    }
    
    public final void dispose() {
    }
    
    private final void event(com.metallic.chiaki.lib.Event event) {
    }
    
    private final void eventConnected() {
    }
    
    private final void eventLoginPinRequest(boolean pinIncorrect) {
    }
    
    private final void eventQuit(int reasonValue, java.lang.String reasonString) {
    }
    
    private final void eventRumble(int left, int right) {
    }
    
    public final void setSurface(@org.jetbrains.annotations.Nullable()
    android.view.Surface surface) {
    }
    
    public final void setControllerState(@org.jetbrains.annotations.NotNull()
    com.metallic.chiaki.lib.ControllerState controllerState) {
    }
    
    public final void setLoginPin(@org.jetbrains.annotations.NotNull()
    java.lang.String pin) {
    }
    
    public Session(@org.jetbrains.annotations.NotNull()
    com.metallic.chiaki.lib.ConnectInfo connectInfo, @org.jetbrains.annotations.Nullable()
    java.lang.String logFile, boolean logVerbose) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/metallic/chiaki/lib/Session$EventCallback;", "", "sessionEvent", "", "event", "Lcom/metallic/chiaki/lib/Event;", "app_debug"})
    public static abstract interface EventCallback {
        
        public abstract void sessionEvent(@org.jetbrains.annotations.NotNull()
        com.metallic.chiaki.lib.Event event);
    }
}