package com.metallic.chiaki.settings;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001a\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\bH\u0016J\u001c\u0010\f\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016J\u001a\u0010\r\u001a\u00020\u000e2\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000f\u001a\u00020\bH\u0016J\u001a\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000f\u001a\u0004\u0018\u00010\nH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/metallic/chiaki/settings/DataStore;", "Landroidx/preference/PreferenceDataStore;", "preferences", "Lcom/metallic/chiaki/common/Preferences;", "(Lcom/metallic/chiaki/common/Preferences;)V", "getPreferences", "()Lcom/metallic/chiaki/common/Preferences;", "getBoolean", "", "key", "", "defValue", "getString", "putBoolean", "", "value", "putString", "app_debug"})
public final class DataStore extends androidx.preference.PreferenceDataStore {
    @org.jetbrains.annotations.NotNull()
    private final com.metallic.chiaki.common.Preferences preferences = null;
    
    @java.lang.Override()
    public boolean getBoolean(@org.jetbrains.annotations.Nullable()
    java.lang.String key, boolean defValue) {
        return false;
    }
    
    @java.lang.Override()
    public void putBoolean(@org.jetbrains.annotations.Nullable()
    java.lang.String key, boolean value) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.String getString(@org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.Nullable()
    java.lang.String defValue) {
        return null;
    }
    
    @java.lang.Override()
    public void putString(@org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.Nullable()
    java.lang.String value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.metallic.chiaki.common.Preferences getPreferences() {
        return null;
    }
    
    public DataStore(@org.jetbrains.annotations.NotNull()
    com.metallic.chiaki.common.Preferences preferences) {
        super();
    }
}