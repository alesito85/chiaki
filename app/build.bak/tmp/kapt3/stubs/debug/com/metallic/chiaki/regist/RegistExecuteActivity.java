package com.metallic.chiaki.regist;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0014J\b\u0010\r\u001a\u00020\nH\u0014J\b\u0010\u000e\u001a\u00020\nH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/metallic/chiaki/regist/RegistExecuteActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "binding", "Lcom/metallic/chiaki/databinding/ActivityRegistExecuteBinding;", "dialog", "Landroidx/appcompat/app/AlertDialog;", "viewModel", "Lcom/metallic/chiaki/regist/RegistExecuteViewModel;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onStop", "showDuplicateDialog", "Companion", "app_debug"})
public final class RegistExecuteActivity extends androidx.appcompat.app.AppCompatActivity {
    private com.metallic.chiaki.regist.RegistExecuteViewModel viewModel;
    private com.metallic.chiaki.databinding.ActivityRegistExecuteBinding binding;
    private androidx.appcompat.app.AlertDialog dialog;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_REGIST_INFO = "regist_info";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_ASSIGN_MANUAL_HOST_ID = "assign_manual_host_id";
    public static final int RESULT_FAILED = android.app.Activity.RESULT_FIRST_USER;
    @org.jetbrains.annotations.NotNull()
    public static final com.metallic.chiaki.regist.RegistExecuteActivity.Companion Companion = null;
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected void onStop() {
    }
    
    private final void showDuplicateDialog() {
    }
    
    public RegistExecuteActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/metallic/chiaki/regist/RegistExecuteActivity$Companion;", "", "()V", "EXTRA_ASSIGN_MANUAL_HOST_ID", "", "EXTRA_REGIST_INFO", "RESULT_FAILED", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}