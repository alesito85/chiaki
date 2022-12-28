package com.metallic.chiaki.stream;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010&\u001a\u00020\'H\u0014J\u000e\u0010(\u001a\u00020\'2\u0006\u0010)\u001a\u00020\tJ\u000e\u0010*\u001a\u00020\'2\u0006\u0010)\u001a\u00020\tR\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0015\u001a\u00020\u0016\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\t0\u001a8F\u00a2\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u001d\u001a\u00020\u001e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010!\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0017\u0010$\u001a\b\u0012\u0004\u0012\u00020\t0\u001a8F\u00a2\u0006\u0006\u001a\u0004\b%\u0010\u001c\u00a8\u0006+"}, d2 = {"Lcom/metallic/chiaki/stream/StreamViewModel;", "Landroidx/lifecycle/ViewModel;", "application", "Landroid/app/Application;", "connectInfo", "Lcom/metallic/chiaki/lib/ConnectInfo;", "(Landroid/app/Application;Lcom/metallic/chiaki/lib/ConnectInfo;)V", "_onScreenControlsEnabled", "Landroidx/lifecycle/MutableLiveData;", "", "_session", "Lcom/metallic/chiaki/session/StreamSession;", "_touchpadOnlyEnabled", "getApplication", "()Landroid/app/Application;", "getConnectInfo", "()Lcom/metallic/chiaki/lib/ConnectInfo;", "input", "Lcom/metallic/chiaki/session/StreamInput;", "getInput", "()Lcom/metallic/chiaki/session/StreamInput;", "logManager", "Lcom/metallic/chiaki/common/LogManager;", "getLogManager", "()Lcom/metallic/chiaki/common/LogManager;", "onScreenControlsEnabled", "Landroidx/lifecycle/LiveData;", "getOnScreenControlsEnabled", "()Landroidx/lifecycle/LiveData;", "preferences", "Lcom/metallic/chiaki/common/Preferences;", "getPreferences", "()Lcom/metallic/chiaki/common/Preferences;", "session", "getSession", "()Lcom/metallic/chiaki/session/StreamSession;", "touchpadOnlyEnabled", "getTouchpadOnlyEnabled", "onCleared", "", "setOnScreenControlsEnabled", "enabled", "setTouchpadOnlyEnabled", "app_debug"})
public final class StreamViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.metallic.chiaki.common.Preferences preferences = null;
    @org.jetbrains.annotations.NotNull()
    private final com.metallic.chiaki.common.LogManager logManager = null;
    private com.metallic.chiaki.session.StreamSession _session;
    @org.jetbrains.annotations.NotNull()
    private final com.metallic.chiaki.session.StreamInput input = null;
    @org.jetbrains.annotations.NotNull()
    private final com.metallic.chiaki.session.StreamSession session = null;
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> _onScreenControlsEnabled;
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> _touchpadOnlyEnabled;
    @org.jetbrains.annotations.NotNull()
    private final android.app.Application application = null;
    @org.jetbrains.annotations.NotNull()
    private final com.metallic.chiaki.lib.ConnectInfo connectInfo = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.metallic.chiaki.common.Preferences getPreferences() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.metallic.chiaki.common.LogManager getLogManager() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.metallic.chiaki.session.StreamInput getInput() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.metallic.chiaki.session.StreamSession getSession() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getOnScreenControlsEnabled() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getTouchpadOnlyEnabled() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    public final void setOnScreenControlsEnabled(boolean enabled) {
    }
    
    public final void setTouchpadOnlyEnabled(boolean enabled) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.app.Application getApplication() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.metallic.chiaki.lib.ConnectInfo getConnectInfo() {
        return null;
    }
    
    public StreamViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application, @org.jetbrains.annotations.NotNull()
    com.metallic.chiaki.lib.ConnectInfo connectInfo) {
        super();
    }
}