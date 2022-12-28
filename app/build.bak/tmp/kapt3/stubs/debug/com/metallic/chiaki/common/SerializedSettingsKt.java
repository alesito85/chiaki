package com.metallic.chiaki.common;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 2, d1 = {"\u0000X\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001c\u0010\u0007\u001a\u0010\u0012\f\u0012\n \t*\u0004\u0018\u00010\u00010\u00010\b2\u0006\u0010\n\u001a\u00020\u000b\u001a\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f\u001a\u001e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015\u001a\u0010\u0010\u0016\u001a\n \t*\u0004\u0018\u00010\u00170\u0017H\u0002\u001a\u0014\u0010\u0018\u001a\u00020\u0019*\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0002\u001a0\u0010\u001d\u001a&\u0012\f\u0012\n \t*\u0004\u0018\u00010\u001c0\u001c \t*\u0012\u0012\f\u0012\n \t*\u0004\u0018\u00010\u001c0\u001c\u0018\u00010\u001e0\u001e*\u00020\u0017H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"}, d2 = {"FORMAT", "", "KEY_FORMAT", "KEY_SETTINGS", "KEY_VERSION", "VERSION", "", "exportAllSettings", "Lio/reactivex/Single;", "kotlin.jvm.PlatformType", "db", "Lcom/metallic/chiaki/common/AppDatabase;", "exportAndShareAllSettings", "Lio/reactivex/disposables/Disposable;", "activity", "Landroid/app/Activity;", "importSettingsFromUri", "", "uri", "Landroid/net/Uri;", "disposable", "Lio/reactivex/disposables/CompositeDisposable;", "moshi", "Lcom/squareup/moshi/Moshi;", "importCompletable", "Lio/reactivex/Completable;", "Lcom/metallic/chiaki/common/ImportDao;", "settings", "Lcom/metallic/chiaki/common/SerializedSettings;", "serializedSettingsAdapter", "Lcom/squareup/moshi/JsonAdapter;", "app_debug"})
public final class SerializedSettingsKt {
    private static final java.lang.String KEY_FORMAT = "format";
    private static final java.lang.String FORMAT = "chiaki-settings";
    private static final java.lang.String KEY_VERSION = "version";
    private static final int VERSION = 2;
    private static final java.lang.String KEY_SETTINGS = "settings";
    
    private static final com.squareup.moshi.Moshi moshi() {
        return null;
    }
    
    private static final com.squareup.moshi.JsonAdapter<com.metallic.chiaki.common.SerializedSettings> serializedSettingsAdapter(com.squareup.moshi.Moshi $this$serializedSettingsAdapter) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final io.reactivex.Single<java.lang.String> exportAllSettings(@org.jetbrains.annotations.NotNull()
    com.metallic.chiaki.common.AppDatabase db) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final io.reactivex.disposables.Disposable exportAndShareAllSettings(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity) {
        return null;
    }
    
    public static final void importSettingsFromUri(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity, @org.jetbrains.annotations.NotNull()
    android.net.Uri uri, @org.jetbrains.annotations.NotNull()
    io.reactivex.disposables.CompositeDisposable disposable) {
    }
    
    private static final io.reactivex.Completable importCompletable(com.metallic.chiaki.common.ImportDao $this$importCompletable, com.metallic.chiaki.common.SerializedSettings settings) {
        return null;
    }
}