package com.metallic.chiaki.main;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001 BU\u0012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u00a2\u0006\u0002\u0010\nJ\b\u0010\u0017\u001a\u00020\u0018H\u0016J\u0018\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0018H\u0016J\u0018\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0018H\u0016R\u001d\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001d\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u001d\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR0\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u00102\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0010@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\f\u00a8\u0006!"}, d2 = {"Lcom/metallic/chiaki/main/DisplayHostRecyclerViewAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/metallic/chiaki/main/DisplayHostRecyclerViewAdapter$ViewHolder;", "clickCallback", "Lkotlin/Function1;", "Lcom/metallic/chiaki/common/DisplayHost;", "", "wakeupCallback", "editCallback", "deleteCallback", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "getClickCallback", "()Lkotlin/jvm/functions/Function1;", "getDeleteCallback", "getEditCallback", "value", "", "hosts", "getHosts", "()Ljava/util/List;", "setHosts", "(Ljava/util/List;)V", "getWakeupCallback", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "app_debug"})
public final class DisplayHostRecyclerViewAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.metallic.chiaki.main.DisplayHostRecyclerViewAdapter.ViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private java.util.List<? extends com.metallic.chiaki.common.DisplayHost> hosts;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function1<com.metallic.chiaki.common.DisplayHost, kotlin.Unit> clickCallback = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function1<com.metallic.chiaki.common.DisplayHost, kotlin.Unit> wakeupCallback = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function1<com.metallic.chiaki.common.DisplayHost, kotlin.Unit> editCallback = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function1<com.metallic.chiaki.common.DisplayHost, kotlin.Unit> deleteCallback = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.metallic.chiaki.common.DisplayHost> getHosts() {
        return null;
    }
    
    public final void setHosts(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.metallic.chiaki.common.DisplayHost> value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.metallic.chiaki.main.DisplayHostRecyclerViewAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.metallic.chiaki.main.DisplayHostRecyclerViewAdapter.ViewHolder holder, int position) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function1<com.metallic.chiaki.common.DisplayHost, kotlin.Unit> getClickCallback() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function1<com.metallic.chiaki.common.DisplayHost, kotlin.Unit> getWakeupCallback() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function1<com.metallic.chiaki.common.DisplayHost, kotlin.Unit> getEditCallback() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function1<com.metallic.chiaki.common.DisplayHost, kotlin.Unit> getDeleteCallback() {
        return null;
    }
    
    public DisplayHostRecyclerViewAdapter(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.metallic.chiaki.common.DisplayHost, kotlin.Unit> clickCallback, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.metallic.chiaki.common.DisplayHost, kotlin.Unit> wakeupCallback, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.metallic.chiaki.common.DisplayHost, kotlin.Unit> editCallback, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.metallic.chiaki.common.DisplayHost, kotlin.Unit> deleteCallback) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/metallic/chiaki/main/DisplayHostRecyclerViewAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/metallic/chiaki/databinding/ItemDisplayHostBinding;", "(Lcom/metallic/chiaki/databinding/ItemDisplayHostBinding;)V", "getBinding", "()Lcom/metallic/chiaki/databinding/ItemDisplayHostBinding;", "app_debug"})
    public static final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.metallic.chiaki.databinding.ItemDisplayHostBinding binding = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.metallic.chiaki.databinding.ItemDisplayHostBinding getBinding() {
            return null;
        }
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        com.metallic.chiaki.databinding.ItemDisplayHostBinding binding) {
            super(null);
        }
    }
}