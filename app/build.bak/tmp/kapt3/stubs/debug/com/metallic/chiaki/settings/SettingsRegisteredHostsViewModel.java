package com.metallic.chiaki.settings;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\fJ\b\u0010\u0015\u001a\u00020\u0013H\u0014R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R5\u0010\t\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\f \r*\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b0\u000b0\n8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0016"}, d2 = {"Lcom/metallic/chiaki/settings/SettingsRegisteredHostsViewModel;", "Landroidx/lifecycle/ViewModel;", "database", "Lcom/metallic/chiaki/common/AppDatabase;", "(Lcom/metallic/chiaki/common/AppDatabase;)V", "getDatabase", "()Lcom/metallic/chiaki/common/AppDatabase;", "disposable", "Lio/reactivex/disposables/CompositeDisposable;", "registeredHosts", "Landroidx/lifecycle/LiveData;", "", "Lcom/metallic/chiaki/common/RegisteredHost;", "kotlin.jvm.PlatformType", "getRegisteredHosts", "()Landroidx/lifecycle/LiveData;", "registeredHosts$delegate", "Lkotlin/Lazy;", "deleteHost", "", "host", "onCleared", "app_debug"})
public final class SettingsRegisteredHostsViewModel extends androidx.lifecycle.ViewModel {
    private final io.reactivex.disposables.CompositeDisposable disposable = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy registeredHosts$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final com.metallic.chiaki.common.AppDatabase database = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.metallic.chiaki.common.RegisteredHost>> getRegisteredHosts() {
        return null;
    }
    
    public final void deleteHost(@org.jetbrains.annotations.NotNull()
    com.metallic.chiaki.common.RegisteredHost host) {
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.metallic.chiaki.common.AppDatabase getDatabase() {
        return null;
    }
    
    public SettingsRegisteredHostsViewModel(@org.jetbrains.annotations.NotNull()
    com.metallic.chiaki.common.AppDatabase database) {
        super();
    }
}