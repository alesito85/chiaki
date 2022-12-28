package com.metallic.chiaki.settings;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\r\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R)\u0010\u0007\u001a\u0010\u0012\f\u0012\n \n*\u0004\u0018\u00010\t0\t0\b8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R)\u0010\u0013\u001a\u0010\u0012\f\u0012\n \n*\u0004\u0018\u00010\t0\t0\b8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0015\u0010\u000e\u001a\u0004\b\u0014\u0010\f\u00a8\u0006\u0016"}, d2 = {"Lcom/metallic/chiaki/settings/SettingsViewModel;", "Landroidx/lifecycle/ViewModel;", "database", "Lcom/metallic/chiaki/common/AppDatabase;", "preferences", "Lcom/metallic/chiaki/common/Preferences;", "(Lcom/metallic/chiaki/common/AppDatabase;Lcom/metallic/chiaki/common/Preferences;)V", "bitrateAuto", "Landroidx/lifecycle/LiveData;", "", "kotlin.jvm.PlatformType", "getBitrateAuto", "()Landroidx/lifecycle/LiveData;", "bitrateAuto$delegate", "Lkotlin/Lazy;", "getDatabase", "()Lcom/metallic/chiaki/common/AppDatabase;", "getPreferences", "()Lcom/metallic/chiaki/common/Preferences;", "registeredHostsCount", "getRegisteredHostsCount", "registeredHostsCount$delegate", "app_debug"})
public final class SettingsViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy registeredHostsCount$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy bitrateAuto$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final com.metallic.chiaki.common.AppDatabase database = null;
    @org.jetbrains.annotations.NotNull()
    private final com.metallic.chiaki.common.Preferences preferences = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Integer> getRegisteredHostsCount() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Integer> getBitrateAuto() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.metallic.chiaki.common.AppDatabase getDatabase() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.metallic.chiaki.common.Preferences getPreferences() {
        return null;
    }
    
    public SettingsViewModel(@org.jetbrains.annotations.NotNull()
    com.metallic.chiaki.common.AppDatabase database, @org.jetbrains.annotations.NotNull()
    com.metallic.chiaki.common.Preferences preferences) {
        super();
    }
}