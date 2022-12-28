package com.metallic.chiaki.main;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!J\b\u0010\"\u001a\u00020\u001fH\u0014R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR)\u0010\t\u001a\u0010\u0012\f\u0012\n \f*\u0004\u0018\u00010\u000b0\u000b0\n8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0011\u001a\u00020\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R5\u0010\u0015\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0017 \f*\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00160\u00160\n8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0019\u0010\u0010\u001a\u0004\b\u0018\u0010\u000eR\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d\u00a8\u0006#"}, d2 = {"Lcom/metallic/chiaki/main/MainViewModel;", "Landroidx/lifecycle/ViewModel;", "database", "Lcom/metallic/chiaki/common/AppDatabase;", "preferences", "Lcom/metallic/chiaki/common/Preferences;", "(Lcom/metallic/chiaki/common/AppDatabase;Lcom/metallic/chiaki/common/Preferences;)V", "getDatabase", "()Lcom/metallic/chiaki/common/AppDatabase;", "discoveryActive", "Landroidx/lifecycle/LiveData;", "", "kotlin.jvm.PlatformType", "getDiscoveryActive", "()Landroidx/lifecycle/LiveData;", "discoveryActive$delegate", "Lkotlin/Lazy;", "discoveryManager", "Lcom/metallic/chiaki/discovery/DiscoveryManager;", "getDiscoveryManager", "()Lcom/metallic/chiaki/discovery/DiscoveryManager;", "displayHosts", "", "Lcom/metallic/chiaki/common/DisplayHost;", "getDisplayHosts", "displayHosts$delegate", "disposable", "Lio/reactivex/disposables/CompositeDisposable;", "getPreferences", "()Lcom/metallic/chiaki/common/Preferences;", "deleteManualHost", "", "manualHost", "Lcom/metallic/chiaki/common/ManualHost;", "onCleared", "app_debug"})
public final class MainViewModel extends androidx.lifecycle.ViewModel {
    private final io.reactivex.disposables.CompositeDisposable disposable = null;
    @org.jetbrains.annotations.NotNull()
    private final com.metallic.chiaki.discovery.DiscoveryManager discoveryManager = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy displayHosts$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy discoveryActive$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final com.metallic.chiaki.common.AppDatabase database = null;
    @org.jetbrains.annotations.NotNull()
    private final com.metallic.chiaki.common.Preferences preferences = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.metallic.chiaki.discovery.DiscoveryManager getDiscoveryManager() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.metallic.chiaki.common.DisplayHost>> getDisplayHosts() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getDiscoveryActive() {
        return null;
    }
    
    public final void deleteManualHost(@org.jetbrains.annotations.NotNull()
    com.metallic.chiaki.common.ManualHost manualHost) {
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.metallic.chiaki.common.AppDatabase getDatabase() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.metallic.chiaki.common.Preferences getPreferences() {
        return null;
    }
    
    public MainViewModel(@org.jetbrains.annotations.NotNull()
    com.metallic.chiaki.common.AppDatabase database, @org.jetbrains.annotations.NotNull()
    com.metallic.chiaki.common.Preferences preferences) {
        super();
    }
}