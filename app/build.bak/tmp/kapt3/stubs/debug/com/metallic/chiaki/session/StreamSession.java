package com.metallic.chiaki.session;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u000e\u0010\'\u001a\u00020(2\u0006\u0010)\u001a\u00020*J\u000e\u0010+\u001a\u00020(2\u0006\u0010,\u001a\u00020-J\u0010\u0010.\u001a\u00020(2\u0006\u0010/\u001a\u000200H\u0002J\u0006\u00101\u001a\u00020(J\u0006\u00102\u001a\u00020(J\u000e\u00103\u001a\u00020(2\u0006\u00104\u001a\u000205J\u0006\u00106\u001a\u00020(R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\r0\u00198F\u00a2\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\"\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0017\u0010!\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00198F\u00a2\u0006\u0006\u001a\u0004\b\"\u0010\u001bR\u0010\u0010#\u001a\u0004\u0018\u00010$X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010%\u001a\u0004\u0018\u00010&X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u00067"}, d2 = {"Lcom/metallic/chiaki/session/StreamSession;", "", "connectInfo", "Lcom/metallic/chiaki/lib/ConnectInfo;", "logManager", "Lcom/metallic/chiaki/common/LogManager;", "logVerbose", "", "input", "Lcom/metallic/chiaki/session/StreamInput;", "(Lcom/metallic/chiaki/lib/ConnectInfo;Lcom/metallic/chiaki/common/LogManager;ZLcom/metallic/chiaki/session/StreamInput;)V", "_rumbleState", "Landroidx/lifecycle/MutableLiveData;", "Lcom/metallic/chiaki/lib/RumbleEvent;", "_state", "Lcom/metallic/chiaki/session/StreamState;", "getConnectInfo", "()Lcom/metallic/chiaki/lib/ConnectInfo;", "getInput", "()Lcom/metallic/chiaki/session/StreamInput;", "getLogManager", "()Lcom/metallic/chiaki/common/LogManager;", "getLogVerbose", "()Z", "rumbleState", "Landroidx/lifecycle/LiveData;", "getRumbleState", "()Landroidx/lifecycle/LiveData;", "<set-?>", "Lcom/metallic/chiaki/lib/Session;", "session", "getSession", "()Lcom/metallic/chiaki/lib/Session;", "state", "getState", "surface", "Landroid/view/Surface;", "surfaceTexture", "Landroid/graphics/SurfaceTexture;", "attachToSurfaceView", "", "surfaceView", "Landroid/view/SurfaceView;", "attachToTextureView", "textureView", "Landroid/view/TextureView;", "eventCallback", "event", "Lcom/metallic/chiaki/lib/Event;", "pause", "resume", "setLoginPin", "pin", "", "shutdown", "app_debug"})
public final class StreamSession {
    @org.jetbrains.annotations.Nullable()
    private com.metallic.chiaki.lib.Session session;
    private final androidx.lifecycle.MutableLiveData<com.metallic.chiaki.session.StreamState> _state = null;
    private final androidx.lifecycle.MutableLiveData<com.metallic.chiaki.lib.RumbleEvent> _rumbleState = null;
    private android.graphics.SurfaceTexture surfaceTexture;
    private android.view.Surface surface;
    @org.jetbrains.annotations.NotNull()
    private final com.metallic.chiaki.lib.ConnectInfo connectInfo = null;
    @org.jetbrains.annotations.NotNull()
    private final com.metallic.chiaki.common.LogManager logManager = null;
    private final boolean logVerbose = false;
    @org.jetbrains.annotations.NotNull()
    private final com.metallic.chiaki.session.StreamInput input = null;
    
    @org.jetbrains.annotations.Nullable()
    public final com.metallic.chiaki.lib.Session getSession() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.metallic.chiaki.session.StreamState> getState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.metallic.chiaki.lib.RumbleEvent> getRumbleState() {
        return null;
    }
    
    public final void shutdown() {
    }
    
    public final void pause() {
    }
    
    public final void resume() {
    }
    
    private final void eventCallback(com.metallic.chiaki.lib.Event event) {
    }
    
    public final void attachToSurfaceView(@org.jetbrains.annotations.NotNull()
    android.view.SurfaceView surfaceView) {
    }
    
    public final void attachToTextureView(@org.jetbrains.annotations.NotNull()
    android.view.TextureView textureView) {
    }
    
    public final void setLoginPin(@org.jetbrains.annotations.NotNull()
    java.lang.String pin) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.metallic.chiaki.lib.ConnectInfo getConnectInfo() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.metallic.chiaki.common.LogManager getLogManager() {
        return null;
    }
    
    public final boolean getLogVerbose() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.metallic.chiaki.session.StreamInput getInput() {
        return null;
    }
    
    public StreamSession(@org.jetbrains.annotations.NotNull()
    com.metallic.chiaki.lib.ConnectInfo connectInfo, @org.jetbrains.annotations.NotNull()
    com.metallic.chiaki.common.LogManager logManager, boolean logVerbose, @org.jetbrains.annotations.NotNull()
    com.metallic.chiaki.session.StreamInput input) {
        super();
    }
}