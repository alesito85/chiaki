package com.metallic.chiaki.touchcontrols;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001*B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\u001f\u001a\u00020\u00122\u0006\u0010 \u001a\u00020!H\u0002J\u0010\u0010\"\u001a\u00020\u00182\u0006\u0010#\u001a\u00020$H\u0014J\u0010\u0010%\u001a\u00020&2\u0006\u0010\'\u001a\u00020(H\u0016J\u0012\u0010)\u001a\u00020\u00182\b\u0010 \u001a\u0004\u0018\u00010!H\u0002R\u000e\u0010\t\u001a\u00020\nX\u0082D\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\"\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R*\u0010\u0016\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006+"}, d2 = {"Lcom/metallic/chiaki/touchcontrols/DPadView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "deadzoneRadius", "", "dpadIdleDrawable", "Landroidx/vectordrawable/graphics/drawable/VectorDrawableCompat;", "dpadLeftDrawable", "dpadLeftUpDrawable", "haptics", "Lcom/metallic/chiaki/touchcontrols/ButtonHaptics;", "<set-?>", "Lcom/metallic/chiaki/touchcontrols/DPadView$Direction;", "state", "getState", "()Lcom/metallic/chiaki/touchcontrols/DPadView$Direction;", "stateChangeCallback", "Lkotlin/Function1;", "", "getStateChangeCallback", "()Lkotlin/jvm/functions/Function1;", "setStateChangeCallback", "(Lkotlin/jvm/functions/Function1;)V", "touchTracker", "Lcom/metallic/chiaki/touchcontrols/TouchTracker;", "directionForPosition", "position", "Lcom/metallic/chiaki/touchcontrols/Vector;", "onDraw", "canvas", "Landroid/graphics/Canvas;", "onTouchEvent", "", "event", "Landroid/view/MotionEvent;", "updateState", "Direction", "app_debug"})
public final class DPadView extends android.view.View {
    private final com.metallic.chiaki.touchcontrols.ButtonHaptics haptics = null;
    @org.jetbrains.annotations.Nullable()
    private com.metallic.chiaki.touchcontrols.DPadView.Direction state;
    @org.jetbrains.annotations.Nullable()
    private kotlin.jvm.functions.Function1<? super com.metallic.chiaki.touchcontrols.DPadView.Direction, kotlin.Unit> stateChangeCallback;
    
    /**
     * Radius (as a fraction of the entire DPad Radius)
     * to be used as a deadzone in the center on move events
     */
    private final float deadzoneRadius = 0.3F;
    private final androidx.vectordrawable.graphics.drawable.VectorDrawableCompat dpadIdleDrawable = null;
    private final androidx.vectordrawable.graphics.drawable.VectorDrawableCompat dpadLeftDrawable = null;
    private final androidx.vectordrawable.graphics.drawable.VectorDrawableCompat dpadLeftUpDrawable = null;
    private final com.metallic.chiaki.touchcontrols.TouchTracker touchTracker = null;
    
    @org.jetbrains.annotations.Nullable()
    public final com.metallic.chiaki.touchcontrols.DPadView.Direction getState() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final kotlin.jvm.functions.Function1<com.metallic.chiaki.touchcontrols.DPadView.Direction, kotlin.Unit> getStateChangeCallback() {
        return null;
    }
    
    public final void setStateChangeCallback(@org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function1<? super com.metallic.chiaki.touchcontrols.DPadView.Direction, kotlin.Unit> p0) {
    }
    
    @java.lang.Override()
    protected void onDraw(@org.jetbrains.annotations.NotNull()
    android.graphics.Canvas canvas) {
    }
    
    private final com.metallic.chiaki.touchcontrols.DPadView.Direction directionForPosition(com.metallic.chiaki.touchcontrols.Vector position) {
        return null;
    }
    
    private final void updateState(com.metallic.chiaki.touchcontrols.Vector position) {
    }
    
    @java.lang.Override()
    public boolean onTouchEvent(@org.jetbrains.annotations.NotNull()
    android.view.MotionEvent event) {
        return false;
    }
    
    public DPadView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null);
    }
    
    public DPadView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    public DPadView(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\b\u0003\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r\u00a8\u0006\u000e"}, d2 = {"Lcom/metallic/chiaki/touchcontrols/DPadView$Direction;", "", "(Ljava/lang/String;I)V", "isDiagonal", "", "()Z", "LEFT", "RIGHT", "UP", "DOWN", "LEFT_UP", "RIGHT_UP", "LEFT_DOWN", "RIGHT_DOWN", "app_debug"})
    public static enum Direction {
        /*public static final*/ LEFT /* = new LEFT() */,
        /*public static final*/ RIGHT /* = new RIGHT() */,
        /*public static final*/ UP /* = new UP() */,
        /*public static final*/ DOWN /* = new DOWN() */,
        /*public static final*/ LEFT_UP /* = new LEFT_UP() */,
        /*public static final*/ RIGHT_UP /* = new RIGHT_UP() */,
        /*public static final*/ LEFT_DOWN /* = new LEFT_DOWN() */,
        /*public static final*/ RIGHT_DOWN /* = new RIGHT_DOWN() */;
        
        public final boolean isDiagonal() {
            return false;
        }
        
        Direction() {
        }
    }
}