package com.metallic.chiaki.touchcontrols;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0010\u0010%\u001a\u00020\u001e2\u0006\u0010&\u001a\u00020\'H\u0014J\u0010\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+H\u0016J\u0012\u0010,\u001a\u00020\u001e2\b\u0010-\u001a\u0004\u0018\u00010\nH\u0002R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0013\u001a\u00020\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R$\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\n@BX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR(\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001dX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u000e\u0010#\u001a\u00020$X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006."}, d2 = {"Lcom/metallic/chiaki/touchcontrols/AnalogStickView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "center", "Lcom/metallic/chiaki/touchcontrols/Vector;", "clipBoundsTmp", "Landroid/graphics/Rect;", "drawableBase", "Landroid/graphics/drawable/Drawable;", "drawableHandle", "handlePosition", "handleRadius", "", "radius", "getRadius", "()F", "value", "state", "getState", "()Lcom/metallic/chiaki/touchcontrols/Vector;", "setState", "(Lcom/metallic/chiaki/touchcontrols/Vector;)V", "stateChangedCallback", "Lkotlin/Function1;", "", "getStateChangedCallback", "()Lkotlin/jvm/functions/Function1;", "setStateChangedCallback", "(Lkotlin/jvm/functions/Function1;)V", "touchTracker", "Lcom/metallic/chiaki/touchcontrols/TouchTracker;", "onDraw", "canvas", "Landroid/graphics/Canvas;", "onTouchEvent", "", "event", "Landroid/view/MotionEvent;", "updateState", "position", "app_debug"})
public final class AnalogStickView extends android.view.View {
    private final float radius = 0.0F;
    private final float handleRadius = 0.0F;
    private final android.graphics.drawable.Drawable drawableBase = null;
    private final android.graphics.drawable.Drawable drawableHandle = null;
    @org.jetbrains.annotations.NotNull()
    private com.metallic.chiaki.touchcontrols.Vector state;
    @org.jetbrains.annotations.Nullable()
    private kotlin.jvm.functions.Function1<? super com.metallic.chiaki.touchcontrols.Vector, kotlin.Unit> stateChangedCallback;
    private final com.metallic.chiaki.touchcontrols.TouchTracker touchTracker = null;
    private com.metallic.chiaki.touchcontrols.Vector center;
    
    /**
     * Same as state, but scaled to the circle
     */
    private com.metallic.chiaki.touchcontrols.Vector handlePosition;
    private final android.graphics.Rect clipBoundsTmp = null;
    
    public final float getRadius() {
        return 0.0F;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.metallic.chiaki.touchcontrols.Vector getState() {
        return null;
    }
    
    private final void setState(com.metallic.chiaki.touchcontrols.Vector value) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final kotlin.jvm.functions.Function1<com.metallic.chiaki.touchcontrols.Vector, kotlin.Unit> getStateChangedCallback() {
        return null;
    }
    
    public final void setStateChangedCallback(@org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function1<? super com.metallic.chiaki.touchcontrols.Vector, kotlin.Unit> p0) {
    }
    
    @java.lang.Override()
    protected void onDraw(@org.jetbrains.annotations.NotNull()
    android.graphics.Canvas canvas) {
    }
    
    private final void updateState(com.metallic.chiaki.touchcontrols.Vector position) {
    }
    
    @java.lang.Override()
    public boolean onTouchEvent(@org.jetbrains.annotations.NotNull()
    android.view.MotionEvent event) {
        return false;
    }
    
    public AnalogStickView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null);
    }
    
    public AnalogStickView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    public AnalogStickView(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
}