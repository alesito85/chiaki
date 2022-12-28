package com.metallic.chiaki.touchcontrols;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\r\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048F\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R \u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\tX\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\"\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R$\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0005@DX\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\tX\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u000b\u00a8\u0006\u001b"}, d2 = {"Lcom/metallic/chiaki/touchcontrols/TouchControlsFragment;", "Landroidx/fragment/app/Fragment;", "()V", "controllerState", "Lio/reactivex/Observable;", "Lcom/metallic/chiaki/lib/ControllerState;", "getControllerState", "()Lio/reactivex/Observable;", "controllerStateProxy", "Lio/reactivex/subjects/Subject;", "getControllerStateProxy", "()Lio/reactivex/subjects/Subject;", "onScreenControlsEnabled", "Landroidx/lifecycle/LiveData;", "", "getOnScreenControlsEnabled", "()Landroidx/lifecycle/LiveData;", "setOnScreenControlsEnabled", "(Landroidx/lifecycle/LiveData;)V", "value", "ownControllerState", "getOwnControllerState", "()Lcom/metallic/chiaki/lib/ControllerState;", "setOwnControllerState", "(Lcom/metallic/chiaki/lib/ControllerState;)V", "ownControllerStateSubject", "getOwnControllerStateSubject", "app_debug"})
public abstract class TouchControlsFragment extends androidx.fragment.app.Fragment {
    @org.jetbrains.annotations.NotNull()
    private com.metallic.chiaki.lib.ControllerState ownControllerState;
    @org.jetbrains.annotations.NotNull()
    private final io.reactivex.subjects.Subject<com.metallic.chiaki.lib.ControllerState> ownControllerStateSubject = null;
    @org.jetbrains.annotations.NotNull()
    private final io.reactivex.subjects.Subject<io.reactivex.Observable<com.metallic.chiaki.lib.ControllerState>> controllerStateProxy = null;
    @org.jetbrains.annotations.Nullable()
    private androidx.lifecycle.LiveData<java.lang.Boolean> onScreenControlsEnabled;
    
    @org.jetbrains.annotations.NotNull()
    protected final com.metallic.chiaki.lib.ControllerState getOwnControllerState() {
        return null;
    }
    
    protected final void setOwnControllerState(@org.jetbrains.annotations.NotNull()
    com.metallic.chiaki.lib.ControllerState value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final io.reactivex.subjects.Subject<com.metallic.chiaki.lib.ControllerState> getOwnControllerStateSubject() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final io.reactivex.subjects.Subject<io.reactivex.Observable<com.metallic.chiaki.lib.ControllerState>> getControllerStateProxy() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<com.metallic.chiaki.lib.ControllerState> getControllerState() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getOnScreenControlsEnabled() {
        return null;
    }
    
    public final void setOnScreenControlsEnabled(@org.jetbrains.annotations.Nullable()
    androidx.lifecycle.LiveData<java.lang.Boolean> p0) {
    }
    
    public TouchControlsFragment() {
        super();
    }
}