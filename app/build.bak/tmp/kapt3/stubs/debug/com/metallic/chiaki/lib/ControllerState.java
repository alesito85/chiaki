package com.metallic.chiaki.lib;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\bV\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 }2\u00020\u0001:\u0001}B\u00cc\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0011\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001bJ\u0016\u0010M\u001a\u00020\u0003H\u00c6\u0003\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\bN\u0010%J\t\u0010O\u001a\u00020\u0011H\u00c6\u0003J\t\u0010P\u001a\u00020\u0011H\u00c6\u0003J\t\u0010Q\u001a\u00020\u0011H\u00c6\u0003J\t\u0010R\u001a\u00020\u0011H\u00c6\u0003J\t\u0010S\u001a\u00020\u0011H\u00c6\u0003J\t\u0010T\u001a\u00020\u0011H\u00c6\u0003J\t\u0010U\u001a\u00020\u0011H\u00c6\u0003J\t\u0010V\u001a\u00020\u0011H\u00c6\u0003J\t\u0010W\u001a\u00020\u0011H\u00c6\u0003J\t\u0010X\u001a\u00020\u0011H\u00c6\u0003J\u0016\u0010Y\u001a\u00020\u0005H\u00c6\u0003\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\bZ\u00100J\u0016\u0010[\u001a\u00020\u0005H\u00c6\u0003\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\b\\\u00100J\t\u0010]\u001a\u00020\bH\u00c6\u0003J\t\u0010^\u001a\u00020\bH\u00c6\u0003J\t\u0010_\u001a\u00020\bH\u00c6\u0003J\t\u0010`\u001a\u00020\bH\u00c6\u0003J\u0016\u0010a\u001a\u00020\u0005H\u00c2\u0003\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\bb\u00100J\u0014\u0010c\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u00c6\u0003\u00a2\u0006\u0002\u0010IJ\u00d7\u0001\u0010d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\u00052\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00112\b\b\u0002\u0010\u0015\u001a\u00020\u00112\b\b\u0002\u0010\u0016\u001a\u00020\u00112\b\b\u0002\u0010\u0017\u001a\u00020\u00112\b\b\u0002\u0010\u0018\u001a\u00020\u00112\b\b\u0002\u0010\u0019\u001a\u00020\u00112\b\b\u0002\u0010\u001a\u001a\u00020\u0011H\u00c6\u0001\u00f8\u0001\u0000\u00a2\u0006\u0004\be\u0010fJ\u0013\u0010g\u001a\u00020h2\b\u0010i\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010j\u001a\u00020kH\u0016J\u0011\u0010l\u001a\u00020\u00002\u0006\u0010m\u001a\u00020\u0000H\u0086\u0004J(\u0010n\u001a\u00020h2\u0006\u0010o\u001a\u00020\u00052\u0006\u0010p\u001a\u00020q2\u0006\u0010r\u001a\u00020q\u00f8\u0001\u0000\u00a2\u0006\u0004\bs\u0010tJ\"\u0010u\u001a\u0004\u0018\u00010\u00052\u0006\u0010p\u001a\u00020q2\u0006\u0010r\u001a\u00020q\u00f8\u0001\u0000\u00a2\u0006\u0004\bv\u0010wJ\u0018\u0010x\u001a\u00020y2\u0006\u0010o\u001a\u00020\u0005\u00f8\u0001\u0000\u00a2\u0006\u0004\bz\u00102J\t\u0010{\u001a\u00020|H\u00d6\u0001R\u001a\u0010\u0014\u001a\u00020\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0015\u001a\u00020\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u001d\"\u0004\b!\u0010\u001fR\u001a\u0010\u0016\u001a\u00020\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u001d\"\u0004\b#\u0010\u001fR\"\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0010\n\u0002\u0010(\u001a\u0004\b$\u0010%\"\u0004\b&\u0010\'R\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u001d\"\u0004\b*\u0010\u001fR\u001a\u0010\u0012\u001a\u00020\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u001d\"\u0004\b,\u0010\u001fR\u001a\u0010\u0013\u001a\u00020\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u001d\"\u0004\b.\u0010\u001fR\"\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0010\n\u0002\u00103\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u001a\u0010\t\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b8\u00105\"\u0004\b9\u00107R\u001a\u0010\u001a\u001a\u00020\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b:\u0010\u001d\"\u0004\b;\u0010\u001fR\u001a\u0010\u0017\u001a\u00020\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b<\u0010\u001d\"\u0004\b=\u0010\u001fR\u001a\u0010\u0018\u001a\u00020\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b>\u0010\u001d\"\u0004\b?\u0010\u001fR\u001a\u0010\u0019\u001a\u00020\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b@\u0010\u001d\"\u0004\bA\u0010\u001fR\"\u0010\u0006\u001a\u00020\u0005X\u0086\u000e\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0010\n\u0002\u00103\u001a\u0004\bB\u00100\"\u0004\bC\u00102R\u001a\u0010\n\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bD\u00105\"\u0004\bE\u00107R\u001a\u0010\u000b\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bF\u00105\"\u0004\bG\u00107R\u0016\u0010\f\u001a\u00020\u0005X\u0082\u000e\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\n\u0002\u00103R\"\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010L\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010K\u0082\u0002\b\n\u0002\b\u0019\n\u0002\b!\u00a8\u0006~"}, d2 = {"Lcom/metallic/chiaki/lib/ControllerState;", "", "buttons", "Lkotlin/UInt;", "l2State", "Lkotlin/UByte;", "r2State", "leftX", "", "leftY", "rightX", "rightY", "touchIdNext", "touches", "", "Lcom/metallic/chiaki/lib/ControllerTouch;", "gyroX", "", "gyroY", "gyroZ", "accelX", "accelY", "accelZ", "orientX", "orientY", "orientZ", "orientW", "(IBBSSSSB[Lcom/metallic/chiaki/lib/ControllerTouch;FFFFFFFFFFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getAccelX", "()F", "setAccelX", "(F)V", "getAccelY", "setAccelY", "getAccelZ", "setAccelZ", "getButtons-pVg5ArA", "()I", "setButtons-WZ4Q5Ns", "(I)V", "I", "getGyroX", "setGyroX", "getGyroY", "setGyroY", "getGyroZ", "setGyroZ", "getL2State-w2LRezQ", "()B", "setL2State-7apg3OU", "(B)V", "B", "getLeftX", "()S", "setLeftX", "(S)V", "getLeftY", "setLeftY", "getOrientW", "setOrientW", "getOrientX", "setOrientX", "getOrientY", "setOrientY", "getOrientZ", "setOrientZ", "getR2State-w2LRezQ", "setR2State-7apg3OU", "getRightX", "setRightX", "getRightY", "setRightY", "getTouches", "()[Lcom/metallic/chiaki/lib/ControllerTouch;", "setTouches", "([Lcom/metallic/chiaki/lib/ControllerTouch;)V", "[Lcom/metallic/chiaki/lib/ControllerTouch;", "component1", "component1-pVg5ArA", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component2-w2LRezQ", "component3", "component3-w2LRezQ", "component4", "component5", "component6", "component7", "component8", "component8-w2LRezQ", "component9", "copy", "copy-qEh_UDs", "(IBBSSSSB[Lcom/metallic/chiaki/lib/ControllerTouch;FFFFFFFFFF)Lcom/metallic/chiaki/lib/ControllerState;", "equals", "", "other", "hashCode", "", "or", "o", "setTouchPos", "id", "x", "Lkotlin/UShort;", "y", "setTouchPos-VPrPBkU", "(BSS)Z", "startTouch", "startTouch-5PvTz6A", "(SS)Lkotlin/UByte;", "stopTouch", "", "stopTouch-7apg3OU", "toString", "", "Companion", "app_debug"})
public final class ControllerState {
    private int buttons;
    private byte l2State;
    private byte r2State;
    private short leftX;
    private short leftY;
    private short rightX;
    private short rightY;
    private byte touchIdNext;
    @org.jetbrains.annotations.NotNull()
    private com.metallic.chiaki.lib.ControllerTouch[] touches;
    private float gyroX;
    private float gyroY;
    private float gyroZ;
    private float accelX;
    private float accelY;
    private float accelZ;
    private float orientX;
    private float orientY;
    private float orientZ;
    private float orientW;
    private static final int BUTTON_CROSS = 0;
    private static final int BUTTON_MOON = 0;
    private static final int BUTTON_BOX = 0;
    private static final int BUTTON_PYRAMID = 0;
    private static final int BUTTON_DPAD_LEFT = 0;
    private static final int BUTTON_DPAD_RIGHT = 0;
    private static final int BUTTON_DPAD_UP = 0;
    private static final int BUTTON_DPAD_DOWN = 0;
    private static final int BUTTON_L1 = 0;
    private static final int BUTTON_R1 = 0;
    private static final int BUTTON_L3 = 0;
    private static final int BUTTON_R3 = 0;
    private static final int BUTTON_OPTIONS = 0;
    private static final int BUTTON_SHARE = 0;
    private static final int BUTTON_TOUCHPAD = 0;
    private static final int BUTTON_PS = 0;
    private static final short TOUCHPAD_WIDTH = (short)1920;
    private static final short TOUCHPAD_HEIGHT = (short)942;
    @org.jetbrains.annotations.NotNull()
    public static final com.metallic.chiaki.lib.ControllerState.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.metallic.chiaki.lib.ControllerState or(@org.jetbrains.annotations.NotNull()
    com.metallic.chiaki.lib.ControllerState o) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    public final short getLeftX() {
        return 0;
    }
    
    public final void setLeftX(short p0) {
    }
    
    public final short getLeftY() {
        return 0;
    }
    
    public final void setLeftY(short p0) {
    }
    
    public final short getRightX() {
        return 0;
    }
    
    public final void setRightX(short p0) {
    }
    
    public final short getRightY() {
        return 0;
    }
    
    public final void setRightY(short p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.metallic.chiaki.lib.ControllerTouch[] getTouches() {
        return null;
    }
    
    public final void setTouches(@org.jetbrains.annotations.NotNull()
    com.metallic.chiaki.lib.ControllerTouch[] p0) {
    }
    
    public final float getGyroX() {
        return 0.0F;
    }
    
    public final void setGyroX(float p0) {
    }
    
    public final float getGyroY() {
        return 0.0F;
    }
    
    public final void setGyroY(float p0) {
    }
    
    public final float getGyroZ() {
        return 0.0F;
    }
    
    public final void setGyroZ(float p0) {
    }
    
    public final float getAccelX() {
        return 0.0F;
    }
    
    public final void setAccelX(float p0) {
    }
    
    public final float getAccelY() {
        return 0.0F;
    }
    
    public final void setAccelY(float p0) {
    }
    
    public final float getAccelZ() {
        return 0.0F;
    }
    
    public final void setAccelZ(float p0) {
    }
    
    public final float getOrientX() {
        return 0.0F;
    }
    
    public final void setOrientX(float p0) {
    }
    
    public final float getOrientY() {
        return 0.0F;
    }
    
    public final void setOrientY(float p0) {
    }
    
    public final float getOrientZ() {
        return 0.0F;
    }
    
    public final void setOrientZ(float p0) {
    }
    
    public final float getOrientW() {
        return 0.0F;
    }
    
    public final void setOrientW(float p0) {
    }
    
    private ControllerState(int buttons, byte l2State, byte r2State, short leftX, short leftY, short rightX, short rightY, byte touchIdNext, com.metallic.chiaki.lib.ControllerTouch[] touches, float gyroX, float gyroY, float gyroZ, float accelX, float accelY, float accelZ, float orientX, float orientY, float orientZ, float orientW) {
        super();
    }
    
    private ControllerState() {
        super();
    }
    
    public final short component4() {
        return 0;
    }
    
    public final short component5() {
        return 0;
    }
    
    public final short component6() {
        return 0;
    }
    
    public final short component7() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.metallic.chiaki.lib.ControllerTouch[] component9() {
        return null;
    }
    
    public final float component10() {
        return 0.0F;
    }
    
    public final float component11() {
        return 0.0F;
    }
    
    public final float component12() {
        return 0.0F;
    }
    
    public final float component13() {
        return 0.0F;
    }
    
    public final float component14() {
        return 0.0F;
    }
    
    public final float component15() {
        return 0.0F;
    }
    
    public final float component16() {
        return 0.0F;
    }
    
    public final float component17() {
        return 0.0F;
    }
    
    public final float component18() {
        return 0.0F;
    }
    
    public final float component19() {
        return 0.0F;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0019\u0010\u0003\u001a\u00020\u0004\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u00020\u0004\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u0019\u0010\n\u001a\u00020\u0004\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000b\u0010\u0006R\u0019\u0010\f\u001a\u00020\u0004\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\r\u0010\u0006R\u0019\u0010\u000e\u001a\u00020\u0004\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000f\u0010\u0006R\u0019\u0010\u0010\u001a\u00020\u0004\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0011\u0010\u0006R\u0019\u0010\u0012\u001a\u00020\u0004\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0013\u0010\u0006R\u0019\u0010\u0014\u001a\u00020\u0004\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0015\u0010\u0006R\u0019\u0010\u0016\u001a\u00020\u0004\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0017\u0010\u0006R\u0019\u0010\u0018\u001a\u00020\u0004\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0019\u0010\u0006R\u0019\u0010\u001a\u001a\u00020\u0004\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u001b\u0010\u0006R\u0019\u0010\u001c\u001a\u00020\u0004\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u001d\u0010\u0006R\u0019\u0010\u001e\u001a\u00020\u0004\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u001f\u0010\u0006R\u0019\u0010 \u001a\u00020\u0004\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b!\u0010\u0006R\u0019\u0010\"\u001a\u00020\u0004\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b#\u0010\u0006R\u0019\u0010$\u001a\u00020\u0004\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b%\u0010\u0006R\u001c\u0010&\u001a\u00020\'X\u0086D\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\n\n\u0002\u0010*\u001a\u0004\b(\u0010)R\u001c\u0010+\u001a\u00020\'X\u0086D\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\n\n\u0002\u0010*\u001a\u0004\b,\u0010)\u0082\u0002\b\n\u0002\b\u0019\n\u0002\b!\u00a8\u0006-"}, d2 = {"Lcom/metallic/chiaki/lib/ControllerState$Companion;", "", "()V", "BUTTON_BOX", "Lkotlin/UInt;", "getBUTTON_BOX-pVg5ArA", "()I", "I", "BUTTON_CROSS", "getBUTTON_CROSS-pVg5ArA", "BUTTON_DPAD_DOWN", "getBUTTON_DPAD_DOWN-pVg5ArA", "BUTTON_DPAD_LEFT", "getBUTTON_DPAD_LEFT-pVg5ArA", "BUTTON_DPAD_RIGHT", "getBUTTON_DPAD_RIGHT-pVg5ArA", "BUTTON_DPAD_UP", "getBUTTON_DPAD_UP-pVg5ArA", "BUTTON_L1", "getBUTTON_L1-pVg5ArA", "BUTTON_L3", "getBUTTON_L3-pVg5ArA", "BUTTON_MOON", "getBUTTON_MOON-pVg5ArA", "BUTTON_OPTIONS", "getBUTTON_OPTIONS-pVg5ArA", "BUTTON_PS", "getBUTTON_PS-pVg5ArA", "BUTTON_PYRAMID", "getBUTTON_PYRAMID-pVg5ArA", "BUTTON_R1", "getBUTTON_R1-pVg5ArA", "BUTTON_R3", "getBUTTON_R3-pVg5ArA", "BUTTON_SHARE", "getBUTTON_SHARE-pVg5ArA", "BUTTON_TOUCHPAD", "getBUTTON_TOUCHPAD-pVg5ArA", "TOUCHPAD_HEIGHT", "Lkotlin/UShort;", "getTOUCHPAD_HEIGHT-Mh2AYeg", "()S", "S", "TOUCHPAD_WIDTH", "getTOUCHPAD_WIDTH-Mh2AYeg", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}