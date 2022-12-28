package com.metallic.chiaki.touchcontrols;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 02\u00020\u0001:\u000201B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0014J\u0010\u0010#\u001a\u00020\n2\u0006\u0010$\u001a\u00020%H\u0016J%\u0010&\u001a\u00020\'2\u0006\u0010$\u001a\u00020%2\u0006\u0010(\u001a\u00020\u0007H\u0002\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\b)\u0010*J%\u0010+\u001a\u00020\'2\u0006\u0010$\u001a\u00020%2\u0006\u0010(\u001a\u00020\u0007H\u0002\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\b,\u0010*J\u0014\u0010-\u001a\u00020 2\n\u0010.\u001a\u00060\u0017R\u00020\u0000H\u0002J\b\u0010/\u001a\u00020 H\u0002R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f8F\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\b\u0012\u00060\u0017R\u00020\u00000\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0018\u0010\u001a\u001a\f\u0012\b\u0012\u00060\u0017R\u00020\u00000\u001bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\r0\u001eX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\b\n\u0002\b\u0019\n\u0002\b!\u00a8\u00062"}, d2 = {"Lcom/metallic/chiaki/touchcontrols/TouchpadView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "buttonHeld", "", "controllerState", "Lio/reactivex/Observable;", "Lcom/metallic/chiaki/lib/ControllerState;", "getControllerState", "()Lio/reactivex/Observable;", "drawableIdle", "Landroid/graphics/drawable/Drawable;", "drawablePressed", "haptics", "Lcom/metallic/chiaki/touchcontrols/ButtonHaptics;", "pointerTouches", "", "Lcom/metallic/chiaki/touchcontrols/TouchpadView$Touch;", "shortButtonPressLiftRunnable", "Ljava/lang/Runnable;", "shortPressingTouches", "", "state", "stateSubject", "Lio/reactivex/subjects/Subject;", "onDraw", "", "canvas", "Landroid/graphics/Canvas;", "onTouchEvent", "event", "Landroid/view/MotionEvent;", "touchX", "Lkotlin/UShort;", "index", "touchX-Mh2AYeg", "(Landroid/view/MotionEvent;I)S", "touchY", "touchY-Mh2AYeg", "triggerShortButtonPress", "touch", "triggerStateChanged", "Companion", "Touch", "app_debug"})
public final class TouchpadView extends android.view.View {
    private final com.metallic.chiaki.touchcontrols.ButtonHaptics haptics = null;
    private final android.graphics.drawable.Drawable drawableIdle = null;
    private final android.graphics.drawable.Drawable drawablePressed = null;
    private final com.metallic.chiaki.lib.ControllerState state = null;
    private final java.util.Map<java.lang.Integer, com.metallic.chiaki.touchcontrols.TouchpadView.Touch> pointerTouches = null;
    private final io.reactivex.subjects.Subject<com.metallic.chiaki.lib.ControllerState> stateSubject = null;
    private java.util.List<com.metallic.chiaki.touchcontrols.TouchpadView.Touch> shortPressingTouches;
    private final java.lang.Runnable shortButtonPressLiftRunnable = null;
    private boolean buttonHeld = false;
    private static final float BUTTON_PRESS_MAX_MOVE_DIST_DP = 32.0F;
    private static final long SHORT_BUTTON_PRESS_DURATION_MS = 200L;
    private static final long BUTTON_HOLD_DELAY_MS = 500L;
    @org.jetbrains.annotations.NotNull()
    public static final com.metallic.chiaki.touchcontrols.TouchpadView.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<com.metallic.chiaki.lib.ControllerState> getControllerState() {
        return null;
    }
    
    @java.lang.Override()
    protected void onDraw(@org.jetbrains.annotations.NotNull()
    android.graphics.Canvas canvas) {
    }
    
    @java.lang.Override()
    public boolean onTouchEvent(@org.jetbrains.annotations.NotNull()
    android.view.MotionEvent event) {
        return false;
    }
    
    private final void triggerShortButtonPress(com.metallic.chiaki.touchcontrols.TouchpadView.Touch touch) {
    }
    
    private final void triggerStateChanged() {
    }
    
    public TouchpadView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null);
    }
    
    public TouchpadView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    public TouchpadView(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B \u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u0005R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u000f\u001a\u00020\t8F\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u000bR\u0011\u0010\u0011\u001a\u00020\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0019\u0010\u0002\u001a\u00020\u0003\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016\u0082\u0002\b\n\u0002\b\u0019\n\u0002\b!\u00a8\u0006\u001c"}, d2 = {"Lcom/metallic/chiaki/touchcontrols/TouchpadView$Touch;", "", "stateId", "Lkotlin/UByte;", "startX", "", "startY", "(Lcom/metallic/chiaki/touchcontrols/TouchpadView;BFFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "lifted", "", "getLifted", "()Z", "setLifted", "(Z)V", "maxDist", "moveInsignificant", "getMoveInsignificant", "startButtonHoldRunnable", "Ljava/lang/Runnable;", "getStartButtonHoldRunnable", "()Ljava/lang/Runnable;", "getStateId-w2LRezQ", "()B", "B", "onMove", "", "x", "y", "app_debug"})
    public final class Touch {
        private boolean lifted = false;
        private float maxDist = 0.0F;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.Runnable startButtonHoldRunnable = null;
        private final byte stateId = 0;
        private final float startX = 0.0F;
        private final float startY = 0.0F;
        
        public final boolean getLifted() {
            return false;
        }
        
        public final void setLifted(boolean p0) {
        }
        
        public final boolean getMoveInsignificant() {
            return false;
        }
        
        public final void onMove(float x, float y) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.Runnable getStartButtonHoldRunnable() {
            return null;
        }
        
        private Touch(byte stateId, float startX, float startY) {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/metallic/chiaki/touchcontrols/TouchpadView$Companion;", "", "()V", "BUTTON_HOLD_DELAY_MS", "", "BUTTON_PRESS_MAX_MOVE_DIST_DP", "", "SHORT_BUTTON_PRESS_DURATION_MS", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}