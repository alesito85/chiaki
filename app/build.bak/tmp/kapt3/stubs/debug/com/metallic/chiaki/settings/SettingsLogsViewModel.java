package com.metallic.chiaki.settings;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\bJ\b\u0010\u0012\u001a\u00020\u0010H\u0002R\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001d\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\f8F\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u0013"}, d2 = {"Lcom/metallic/chiaki/settings/SettingsLogsViewModel;", "Landroidx/lifecycle/ViewModel;", "logManager", "Lcom/metallic/chiaki/common/LogManager;", "(Lcom/metallic/chiaki/common/LogManager;)V", "_sessionLogs", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/metallic/chiaki/common/LogFile;", "getLogManager", "()Lcom/metallic/chiaki/common/LogManager;", "sessionLogs", "Landroidx/lifecycle/LiveData;", "getSessionLogs", "()Landroidx/lifecycle/LiveData;", "deleteLog", "", "file", "updateLogs", "app_debug"})
public final class SettingsLogsViewModel extends androidx.lifecycle.ViewModel {
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.metallic.chiaki.common.LogFile>> _sessionLogs = null;
    @org.jetbrains.annotations.NotNull()
    private final com.metallic.chiaki.common.LogManager logManager = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.metallic.chiaki.common.LogFile>> getSessionLogs() {
        return null;
    }
    
    private final void updateLogs() {
    }
    
    public final void deleteLog(@org.jetbrains.annotations.NotNull()
    com.metallic.chiaki.common.LogFile file) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.metallic.chiaki.common.LogManager getLogManager() {
        return null;
    }
    
    public SettingsLogsViewModel(@org.jetbrains.annotations.NotNull()
    com.metallic.chiaki.common.LogManager logManager) {
        super();
    }
}