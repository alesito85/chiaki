package com.metallic.chiaki.session;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010$\u001a\u00020\u000fH\u0002J\u000e\u0010%\u001a\u00020\u001e2\u0006\u0010&\u001a\u00020\'J\u000e\u0010(\u001a\u00020\u000f2\u0006\u0010)\u001a\u00020*J\u000e\u0010+\u001a\u00020\u001e2\u0006\u0010&\u001a\u00020,R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n8F\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\fR(\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u000e\u0010\u001a\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010 \u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\n@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\f\"\u0004\b\"\u0010#\u00a8\u0006-"}, d2 = {"Lcom/metallic/chiaki/session/StreamInput;", "", "context", "Landroid/content/Context;", "preferences", "Lcom/metallic/chiaki/common/Preferences;", "(Landroid/content/Context;Lcom/metallic/chiaki/common/Preferences;)V", "getContext", "()Landroid/content/Context;", "controllerState", "Lcom/metallic/chiaki/lib/ControllerState;", "getControllerState", "()Lcom/metallic/chiaki/lib/ControllerState;", "controllerStateChangedCallback", "Lkotlin/Function1;", "", "getControllerStateChangedCallback", "()Lkotlin/jvm/functions/Function1;", "setControllerStateChangedCallback", "(Lkotlin/jvm/functions/Function1;)V", "keyControllerState", "motionControllerState", "motionLifecycleObserver", "Landroidx/lifecycle/LifecycleObserver;", "getPreferences", "()Lcom/metallic/chiaki/common/Preferences;", "sensorControllerState", "sensorEventListener", "Landroid/hardware/SensorEventListener;", "swapCrossMoon", "", "value", "touchControllerState", "getTouchControllerState", "setTouchControllerState", "(Lcom/metallic/chiaki/lib/ControllerState;)V", "controllerStateUpdated", "dispatchKeyEvent", "event", "Landroid/view/KeyEvent;", "observe", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "onGenericMotionEvent", "Landroid/view/MotionEvent;", "app_debug"})
public final class StreamInput {
    @org.jetbrains.annotations.Nullable()
    private kotlin.jvm.functions.Function1<? super com.metallic.chiaki.lib.ControllerState, kotlin.Unit> controllerStateChangedCallback;
    private final com.metallic.chiaki.lib.ControllerState sensorControllerState = null;
    private final com.metallic.chiaki.lib.ControllerState keyControllerState = null;
    private final com.metallic.chiaki.lib.ControllerState motionControllerState = null;
    @org.jetbrains.annotations.NotNull()
    private com.metallic.chiaki.lib.ControllerState touchControllerState;
    private final boolean swapCrossMoon = false;
    private final android.hardware.SensorEventListener sensorEventListener = null;
    private final androidx.lifecycle.LifecycleObserver motionLifecycleObserver = null;
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull()
    private final com.metallic.chiaki.common.Preferences preferences = null;
    
    @org.jetbrains.annotations.Nullable()
    public final kotlin.jvm.functions.Function1<com.metallic.chiaki.lib.ControllerState, kotlin.Unit> getControllerStateChangedCallback() {
        return null;
    }
    
    public final void setControllerStateChangedCallback(@org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function1<? super com.metallic.chiaki.lib.ControllerState, kotlin.Unit> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.metallic.chiaki.lib.ControllerState getControllerState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.metallic.chiaki.lib.ControllerState getTouchControllerState() {
        return null;
    }
    
    public final void setTouchControllerState(@org.jetbrains.annotations.NotNull()
    com.metallic.chiaki.lib.ControllerState value) {
    }
    
    public final void observe(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LifecycleOwner lifecycleOwner) {
    }
    
    private final void controllerStateUpdated() {
    }
    
    public final boolean dispatchKeyEvent(@org.jetbrains.annotations.NotNull()
    android.view.KeyEvent event) {
        return false;
    }
    
    public final boolean onGenericMotionEvent(@org.jetbrains.annotations.NotNull()
    android.view.MotionEvent event) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.metallic.chiaki.common.Preferences getPreferences() {
        return null;
    }
    
    public StreamInput(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.metallic.chiaki.common.Preferences preferences) {
        super();
    }
}