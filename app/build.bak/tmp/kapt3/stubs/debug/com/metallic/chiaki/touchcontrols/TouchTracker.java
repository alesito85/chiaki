package com.metallic.chiaki.touchcontrols;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0016R(\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004@BX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\fR*\u0010\r\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013\u00a8\u0006\u0017"}, d2 = {"Lcom/metallic/chiaki/touchcontrols/TouchTracker;", "", "()V", "value", "Lcom/metallic/chiaki/touchcontrols/Vector;", "currentPosition", "getCurrentPosition", "()Lcom/metallic/chiaki/touchcontrols/Vector;", "setCurrentPosition", "(Lcom/metallic/chiaki/touchcontrols/Vector;)V", "pointerId", "", "Ljava/lang/Integer;", "positionChangedCallback", "Lkotlin/Function1;", "", "getPositionChangedCallback", "()Lkotlin/jvm/functions/Function1;", "setPositionChangedCallback", "(Lkotlin/jvm/functions/Function1;)V", "touchEvent", "event", "Landroid/view/MotionEvent;", "app_debug"})
public final class TouchTracker {
    @org.jetbrains.annotations.Nullable()
    private com.metallic.chiaki.touchcontrols.Vector currentPosition;
    @org.jetbrains.annotations.Nullable()
    private kotlin.jvm.functions.Function1<? super com.metallic.chiaki.touchcontrols.Vector, kotlin.Unit> positionChangedCallback;
    private java.lang.Integer pointerId;
    
    @org.jetbrains.annotations.Nullable()
    public final com.metallic.chiaki.touchcontrols.Vector getCurrentPosition() {
        return null;
    }
    
    private final void setCurrentPosition(com.metallic.chiaki.touchcontrols.Vector value) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final kotlin.jvm.functions.Function1<com.metallic.chiaki.touchcontrols.Vector, kotlin.Unit> getPositionChangedCallback() {
        return null;
    }
    
    public final void setPositionChangedCallback(@org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function1<? super com.metallic.chiaki.touchcontrols.Vector, kotlin.Unit> p0) {
    }
    
    public final void touchEvent(@org.jetbrains.annotations.NotNull()
    android.view.MotionEvent event) {
    }
    
    public TouchTracker() {
        super();
    }
}