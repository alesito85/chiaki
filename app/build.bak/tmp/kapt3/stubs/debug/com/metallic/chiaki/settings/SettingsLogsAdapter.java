package com.metallic.chiaki.settings;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001 B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\u0018\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0018H\u0016J\u0018\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0018H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R0\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR(\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"}, d2 = {"Lcom/metallic/chiaki/settings/SettingsLogsAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/metallic/chiaki/settings/SettingsLogsAdapter$ViewHolder;", "()V", "dateFormat", "Ljava/text/DateFormat;", "value", "", "Lcom/metallic/chiaki/common/LogFile;", "logFiles", "getLogFiles", "()Ljava/util/List;", "setLogFiles", "(Ljava/util/List;)V", "shareCallback", "Lkotlin/Function1;", "", "getShareCallback", "()Lkotlin/jvm/functions/Function1;", "setShareCallback", "(Lkotlin/jvm/functions/Function1;)V", "timeFormat", "Ljava/text/SimpleDateFormat;", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "app_debug"})
public final class SettingsLogsAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.metallic.chiaki.settings.SettingsLogsAdapter.ViewHolder> {
    @org.jetbrains.annotations.Nullable()
    private kotlin.jvm.functions.Function1<? super com.metallic.chiaki.common.LogFile, kotlin.Unit> shareCallback;
    private final java.text.DateFormat dateFormat = null;
    private final java.text.SimpleDateFormat timeFormat = null;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.metallic.chiaki.common.LogFile> logFiles;
    
    @org.jetbrains.annotations.Nullable()
    public final kotlin.jvm.functions.Function1<com.metallic.chiaki.common.LogFile, kotlin.Unit> getShareCallback() {
        return null;
    }
    
    public final void setShareCallback(@org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function1<? super com.metallic.chiaki.common.LogFile, kotlin.Unit> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.metallic.chiaki.common.LogFile> getLogFiles() {
        return null;
    }
    
    public final void setLogFiles(@org.jetbrains.annotations.NotNull()
    java.util.List<com.metallic.chiaki.common.LogFile> value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.metallic.chiaki.settings.SettingsLogsAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.metallic.chiaki.settings.SettingsLogsAdapter.ViewHolder holder, int position) {
    }
    
    public SettingsLogsAdapter() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/metallic/chiaki/settings/SettingsLogsAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/metallic/chiaki/databinding/ItemLogFileBinding;", "(Lcom/metallic/chiaki/databinding/ItemLogFileBinding;)V", "getBinding", "()Lcom/metallic/chiaki/databinding/ItemLogFileBinding;", "app_debug"})
    public static final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.metallic.chiaki.databinding.ItemLogFileBinding binding = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.metallic.chiaki.databinding.ItemLogFileBinding getBinding() {
            return null;
        }
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        com.metallic.chiaki.databinding.ItemLogFileBinding binding) {
            super(null);
        }
    }
}