package com.metallic.chiaki.regist;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u001e2\u00020\u00012\u00020\u0002:\u0001\u001eB\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0014\u001a\u00020\u0015H\u0002J\"\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010\u001a\u001a\u0004\u0018\u00010\u0007H\u0014J\u0012\u0010\u001b\u001a\u00020\u00152\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00078VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u000b8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000f8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"}, d2 = {"Lcom/metallic/chiaki/regist/RegistActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/metallic/chiaki/common/ext/RevealActivity;", "()V", "binding", "Lcom/metallic/chiaki/databinding/ActivityRegistBinding;", "revealIntent", "Landroid/content/Intent;", "getRevealIntent", "()Landroid/content/Intent;", "revealRootLayout", "Landroid/view/View;", "getRevealRootLayout", "()Landroid/view/View;", "revealWindow", "Landroid/view/Window;", "getRevealWindow", "()Landroid/view/Window;", "viewModel", "Lcom/metallic/chiaki/regist/RegistViewModel;", "doRegist", "", "onActivityResult", "requestCode", "", "resultCode", "data", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "app_debug"})
public final class RegistActivity extends androidx.appcompat.app.AppCompatActivity implements com.metallic.chiaki.common.ext.RevealActivity {
    private com.metallic.chiaki.regist.RegistViewModel viewModel;
    private com.metallic.chiaki.databinding.ActivityRegistBinding binding;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_HOST = "regist_host";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_BROADCAST = "regist_broadcast";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_ASSIGN_MANUAL_HOST_ID = "assign_manual_host_id";
    private static final int PIN_LENGTH = 8;
    private static final int REQUEST_REGIST = 1;
    @org.jetbrains.annotations.NotNull()
    public static final com.metallic.chiaki.regist.RegistActivity.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.Window getRevealWindow() {
        return null;
    }
    
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
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void doRegist() {
    }
    
    @java.lang.Override()
    protected void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    public RegistActivity() {
        super();
    }
    
    public void handleReveal() {
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/metallic/chiaki/regist/RegistActivity$Companion;", "", "()V", "EXTRA_ASSIGN_MANUAL_HOST_ID", "", "EXTRA_BROADCAST", "EXTRA_HOST", "PIN_LENGTH", "", "REQUEST_REGIST", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}