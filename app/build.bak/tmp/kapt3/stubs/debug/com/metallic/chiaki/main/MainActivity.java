package com.metallic.chiaki.main;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0002J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\rH\u0002J\u0010\u0010\u000e\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\rH\u0002J\u0010\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0010\u0010\u0012\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\rH\u0002J\b\u0010\u0013\u001a\u00020\nH\u0016J\u0012\u0010\u0014\u001a\u00020\n2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0014J\u0010\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u0010\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u0006H\u0016J\b\u0010\u001c\u001a\u00020\nH\u0014J\b\u0010\u001d\u001a\u00020\nH\u0014J\b\u0010\u001e\u001a\u00020\nH\u0002J\u0018\u0010\u001f\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u0011H\u0002J\b\u0010!\u001a\u00020\nH\u0002J\u0010\u0010\"\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\rH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006#"}, d2 = {"Lcom/metallic/chiaki/main/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "binding", "Lcom/metallic/chiaki/databinding/ActivityMainBinding;", "discoveryMenuItem", "Landroid/view/MenuItem;", "viewModel", "Lcom/metallic/chiaki/main/MainViewModel;", "addManualConsole", "", "deleteHost", "host", "Lcom/metallic/chiaki/common/DisplayHost;", "editHost", "expandFloatingActionButton", "expand", "", "hostTriggered", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "onOptionsItemSelected", "item", "onStart", "onStop", "showRegistration", "updateDiscoveryMenuItem", "active", "updateEmptyInfo", "wakeupHost", "app_debug"})
public final class MainActivity extends androidx.appcompat.app.AppCompatActivity {
    private com.metallic.chiaki.main.MainViewModel viewModel;
    private com.metallic.chiaki.databinding.ActivityMainBinding binding;
    private android.view.MenuItem discoveryMenuItem;
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void updateEmptyInfo() {
    }
    
    private final void expandFloatingActionButton(boolean expand) {
    }
    
    @java.lang.Override()
    protected void onStart() {
    }
    
    @java.lang.Override()
    protected void onStop() {
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    @java.lang.Override()
    public boolean onCreateOptionsMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu) {
        return false;
    }
    
    private final void updateDiscoveryMenuItem(android.view.MenuItem item, boolean active) {
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    private final void addManualConsole() {
    }
    
    private final void showRegistration() {
    }
    
    private final void hostTriggered(com.metallic.chiaki.common.DisplayHost host) {
    }
    
    private final void wakeupHost(com.metallic.chiaki.common.DisplayHost host) {
    }
    
    private final void editHost(com.metallic.chiaki.common.DisplayHost host) {
    }
    
    private final void deleteHost(com.metallic.chiaki.common.DisplayHost host) {
    }
    
    public MainActivity() {
        super();
    }
}