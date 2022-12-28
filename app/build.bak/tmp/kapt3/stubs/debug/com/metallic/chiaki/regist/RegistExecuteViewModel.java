package com.metallic.chiaki.regist;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001+B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u001f\u001a\u00020 H\u0014J\u0010\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020#H\u0002J\u0010\u0010$\u001a\u00020 2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002J\u0006\u0010%\u001a\u00020 J\u001d\u0010&\u001a\u00020 2\u0006\u0010\'\u001a\u00020(2\b\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0002\u0010)J\u0006\u0010*\u001a\u00020 R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\"\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00070\u00178F\u00a2\u0006\u0006\u001a\u0004\b\u001e\u0010\u001a\u00a8\u0006,"}, d2 = {"Lcom/metallic/chiaki/regist/RegistExecuteViewModel;", "Landroidx/lifecycle/ViewModel;", "database", "Lcom/metallic/chiaki/common/AppDatabase;", "(Lcom/metallic/chiaki/common/AppDatabase;)V", "_state", "Landroidx/lifecycle/MutableLiveData;", "Lcom/metallic/chiaki/regist/RegistExecuteViewModel$State;", "assignManualHostId", "", "Ljava/lang/Long;", "getDatabase", "()Lcom/metallic/chiaki/common/AppDatabase;", "disposable", "Lio/reactivex/disposables/CompositeDisposable;", "<set-?>", "Lcom/metallic/chiaki/lib/RegistHost;", "host", "getHost", "()Lcom/metallic/chiaki/lib/RegistHost;", "log", "Lcom/metallic/chiaki/regist/ChiakiRxLog;", "logText", "Landroidx/lifecycle/LiveData;", "", "getLogText", "()Landroidx/lifecycle/LiveData;", "regist", "Lcom/metallic/chiaki/lib/Regist;", "state", "getState", "onCleared", "", "registEvent", "event", "Lcom/metallic/chiaki/lib/RegistEvent;", "registSuccess", "saveHost", "start", "info", "Lcom/metallic/chiaki/lib/RegistInfo;", "(Lcom/metallic/chiaki/lib/RegistInfo;Ljava/lang/Long;)V", "stop", "State", "app_debug"})
public final class RegistExecuteViewModel extends androidx.lifecycle.ViewModel {
    private final androidx.lifecycle.MutableLiveData<com.metallic.chiaki.regist.RegistExecuteViewModel.State> _state = null;
    private final com.metallic.chiaki.regist.ChiakiRxLog log = null;
    private com.metallic.chiaki.lib.Regist regist;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.String> logText = null;
    private final io.reactivex.disposables.CompositeDisposable disposable = null;
    @org.jetbrains.annotations.Nullable()
    private com.metallic.chiaki.lib.RegistHost host;
    private java.lang.Long assignManualHostId;
    @org.jetbrains.annotations.NotNull()
    private final com.metallic.chiaki.common.AppDatabase database = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.metallic.chiaki.regist.RegistExecuteViewModel.State> getState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getLogText() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.metallic.chiaki.lib.RegistHost getHost() {
        return null;
    }
    
    public final void start(@org.jetbrains.annotations.NotNull()
    com.metallic.chiaki.lib.RegistInfo info, @org.jetbrains.annotations.Nullable()
    java.lang.Long assignManualHostId) {
    }
    
    public final void stop() {
    }
    
    private final void registEvent(com.metallic.chiaki.lib.RegistEvent event) {
    }
    
    private final void registSuccess(com.metallic.chiaki.lib.RegistHost host) {
    }
    
    public final void saveHost() {
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.metallic.chiaki.common.AppDatabase getDatabase() {
        return null;
    }
    
    public RegistExecuteViewModel(@org.jetbrains.annotations.NotNull()
    com.metallic.chiaki.common.AppDatabase database) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b\u00a8\u0006\t"}, d2 = {"Lcom/metallic/chiaki/regist/RegistExecuteViewModel$State;", "", "(Ljava/lang/String;I)V", "IDLE", "RUNNING", "STOPPED", "FAILED", "SUCCESSFUL", "SUCCESSFUL_DUPLICATE", "app_debug"})
    public static enum State {
        /*public static final*/ IDLE /* = new IDLE() */,
        /*public static final*/ RUNNING /* = new RUNNING() */,
        /*public static final*/ STOPPED /* = new STOPPED() */,
        /*public static final*/ FAILED /* = new FAILED() */,
        /*public static final*/ SUCCESSFUL /* = new SUCCESSFUL() */,
        /*public static final*/ SUCCESSFUL_DUPLICATE /* = new SUCCESSFUL_DUPLICATE() */;
        
        State() {
        }
    }
}