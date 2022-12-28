package com.metallic.chiaki.manualconsole;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0019\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR9\u0010\u000e\u001a \u0012\u001c\u0012\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0010 \u0011*\f\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0018\u00010\u000f0\u000f0\n8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0012\u0010\rR\"\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a\u00a8\u0006\u001f"}, d2 = {"Lcom/metallic/chiaki/manualconsole/EditManualConsoleViewModel;", "Landroidx/lifecycle/ViewModel;", "database", "Lcom/metallic/chiaki/common/AppDatabase;", "manualHostId", "", "(Lcom/metallic/chiaki/common/AppDatabase;Ljava/lang/Long;)V", "getDatabase", "()Lcom/metallic/chiaki/common/AppDatabase;", "existingHost", "Landroidx/lifecycle/LiveData;", "Lcom/metallic/chiaki/common/ManualHost;", "getExistingHost", "()Landroidx/lifecycle/LiveData;", "registeredHosts", "", "Lcom/metallic/chiaki/common/RegisteredHost;", "kotlin.jvm.PlatformType", "getRegisteredHosts", "registeredHosts$delegate", "Lkotlin/Lazy;", "selectedRegisteredHost", "Landroidx/lifecycle/MutableLiveData;", "getSelectedRegisteredHost", "()Landroidx/lifecycle/MutableLiveData;", "setSelectedRegisteredHost", "(Landroidx/lifecycle/MutableLiveData;)V", "saveHost", "Lio/reactivex/Completable;", "host", "", "app_debug"})
public final class EditManualConsoleViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy registeredHosts$delegate = null;
    @org.jetbrains.annotations.Nullable()
    private final androidx.lifecycle.LiveData<com.metallic.chiaki.common.ManualHost> existingHost = null;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.metallic.chiaki.common.RegisteredHost> selectedRegisteredHost;
    @org.jetbrains.annotations.NotNull()
    private final com.metallic.chiaki.common.AppDatabase database = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.metallic.chiaki.common.RegisteredHost>> getRegisteredHosts() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.lifecycle.LiveData<com.metallic.chiaki.common.ManualHost> getExistingHost() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.metallic.chiaki.common.RegisteredHost> getSelectedRegisteredHost() {
        return null;
    }
    
    public final void setSelectedRegisteredHost(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.metallic.chiaki.common.RegisteredHost> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Completable saveHost(@org.jetbrains.annotations.NotNull()
    java.lang.String host) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.metallic.chiaki.common.AppDatabase getDatabase() {
        return null;
    }
    
    public EditManualConsoleViewModel(@org.jetbrains.annotations.NotNull()
    com.metallic.chiaki.common.AppDatabase database, @org.jetbrains.annotations.Nullable()
    java.lang.Long manualHostId) {
        super();
    }
}