package com.metallic.chiaki.manualconsole;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u001f2\u00020\u00012\u00020\u0002:\u0001\u001fB\u0005\u00a2\u0006\u0002\u0010\u0003J\u0012\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0014J\b\u0010\u001a\u001a\u00020\u0017H\u0002J\u0012\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\t8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\r8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00118VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006 "}, d2 = {"Lcom/metallic/chiaki/manualconsole/EditManualConsoleActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/metallic/chiaki/common/ext/RevealActivity;", "()V", "binding", "Lcom/metallic/chiaki/databinding/ActivityEditManualBinding;", "disposable", "Lio/reactivex/disposables/CompositeDisposable;", "revealIntent", "Landroid/content/Intent;", "getRevealIntent", "()Landroid/content/Intent;", "revealRootLayout", "Landroid/view/View;", "getRevealRootLayout", "()Landroid/view/View;", "revealWindow", "Landroid/view/Window;", "getRevealWindow", "()Landroid/view/Window;", "viewModel", "Lcom/metallic/chiaki/manualconsole/EditManualConsoleViewModel;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "saveHost", "titleForRegisteredHost", "", "registeredHost", "Lcom/metallic/chiaki/common/RegisteredHost;", "Companion", "app_debug"})
public final class EditManualConsoleActivity extends androidx.appcompat.app.AppCompatActivity implements com.metallic.chiaki.common.ext.RevealActivity {
    private com.metallic.chiaki.manualconsole.EditManualConsoleViewModel viewModel;
    private com.metallic.chiaki.databinding.ActivityEditManualBinding binding;
    private final io.reactivex.disposables.CompositeDisposable disposable = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_MANUAL_HOST_ID = "manual_host_id";
    @org.jetbrains.annotations.NotNull()
    public static final com.metallic.chiaki.manualconsole.EditManualConsoleActivity.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.content.Intent getRevealIntent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.View getRevealRootLayout() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.Window getRevealWindow() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final java.lang.String titleForRegisteredHost(com.metallic.chiaki.common.RegisteredHost registeredHost) {
        return null;
    }
    
    private final void saveHost() {
    }
    
    public EditManualConsoleActivity() {
        super();
    }
    
    public void handleReveal() {
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/metallic/chiaki/manualconsole/EditManualConsoleActivity$Companion;", "", "()V", "EXTRA_MANUAL_HOST_ID", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}