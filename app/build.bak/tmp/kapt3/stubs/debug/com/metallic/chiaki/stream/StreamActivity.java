package com.metallic.chiaki.stream;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 62\u00020\u00012\u00020\u0002:\u00016B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0015\u001a\u00020\u0016H\u0002J\b\u0010\u0017\u001a\u00020\u0016H\u0002J\u0010\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\b\u0010\u001f\u001a\u00020\u0016H\u0002J\b\u0010 \u001a\u00020\u0016H\u0002J\u0010\u0010!\u001a\u00020\u00162\u0006\u0010\"\u001a\u00020#H\u0016J\u0012\u0010$\u001a\u00020\u00162\b\u0010%\u001a\u0004\u0018\u00010&H\u0014J\b\u0010\'\u001a\u00020\u0016H\u0014J\u0010\u0010(\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020)H\u0016J\b\u0010*\u001a\u00020\u0016H\u0014J\b\u0010+\u001a\u00020\u0016H\u0014J\u0010\u0010,\u001a\u00020\u00162\u0006\u0010-\u001a\u00020.H\u0016J\u0010\u0010/\u001a\u00020\u00162\u0006\u00100\u001a\u00020\u001cH\u0016J\b\u00101\u001a\u00020\u0016H\u0002J\b\u00102\u001a\u00020\u0016H\u0002J\u0010\u00103\u001a\u00020\u00162\u0006\u00104\u001a\u000205H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\"\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\b\u001a\u0004\u0018\u00010\t@BX\u0082\u000e\u00a2\u0006\b\n\u0000\"\u0004\b\u000b\u0010\fR\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u00067"}, d2 = {"Lcom/metallic/chiaki/stream/StreamActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Landroid/view/View$OnSystemUiVisibilityChangeListener;", "()V", "binding", "Lcom/metallic/chiaki/databinding/ActivityStreamBinding;", "controlsDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "value", "Landroid/app/AlertDialog;", "dialog", "setDialog", "(Landroid/app/AlertDialog;)V", "dialogContents", "Lcom/metallic/chiaki/stream/DialogContents;", "hideSystemUIRunnable", "Ljava/lang/Runnable;", "uiVisibilityHandler", "Landroid/os/Handler;", "viewModel", "Lcom/metallic/chiaki/stream/StreamViewModel;", "adjustStreamViewAspect", "", "adjustSurfaceViewAspect", "adjustTextureViewAspect", "textureView", "Landroid/view/TextureView;", "dispatchKeyEvent", "", "event", "Landroid/view/KeyEvent;", "hideOverlay", "hideSystemUI", "onAttachFragment", "fragment", "Landroidx/fragment/app/Fragment;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onGenericMotionEvent", "Landroid/view/MotionEvent;", "onPause", "onResume", "onSystemUiVisibilityChange", "visibility", "", "onWindowFocusChanged", "hasFocus", "reconnect", "showOverlay", "stateChanged", "state", "Lcom/metallic/chiaki/session/StreamState;", "Companion", "app_debug"})
public final class StreamActivity extends androidx.appcompat.app.AppCompatActivity implements android.view.View.OnSystemUiVisibilityChangeListener {
    private com.metallic.chiaki.stream.StreamViewModel viewModel;
    private com.metallic.chiaki.databinding.ActivityStreamBinding binding;
    private final android.os.Handler uiVisibilityHandler = null;
    private final io.reactivex.disposables.CompositeDisposable controlsDisposable = null;
    private final java.lang.Runnable hideSystemUIRunnable = null;
    private com.metallic.chiaki.stream.DialogContents dialogContents;
    private android.app.AlertDialog dialog;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_CONNECT_INFO = "connect_info";
    private static final long HIDE_UI_TIMEOUT_MS = 2000L;
    @org.jetbrains.annotations.NotNull()
    public static final com.metallic.chiaki.stream.StreamActivity.Companion Companion = null;
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onAttachFragment(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment fragment) {
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    @java.lang.Override()
    protected void onPause() {
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    private final void reconnect() {
    }
    
    @java.lang.Override()
    public void onSystemUiVisibilityChange(int visibility) {
    }
    
    private final void showOverlay() {
    }
    
    private final void hideOverlay() {
    }
    
    @java.lang.Override()
    public void onWindowFocusChanged(boolean hasFocus) {
    }
    
    private final void hideSystemUI() {
    }
    
    private final void setDialog(android.app.AlertDialog value) {
    }
    
    private final void stateChanged(com.metallic.chiaki.session.StreamState state) {
    }
    
    private final void adjustTextureViewAspect(android.view.TextureView textureView) {
    }
    
    private final void adjustSurfaceViewAspect() {
    }
    
    private final void adjustStreamViewAspect() {
    }
    
    @java.lang.Override()
    public boolean dispatchKeyEvent(@org.jetbrains.annotations.NotNull()
    android.view.KeyEvent event) {
        return false;
    }
    
    @java.lang.Override()
    public boolean onGenericMotionEvent(@org.jetbrains.annotations.NotNull()
    android.view.MotionEvent event) {
        return false;
    }
    
    public StreamActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/metallic/chiaki/stream/StreamActivity$Companion;", "", "()V", "EXTRA_CONNECT_INFO", "", "HIDE_UI_TIMEOUT_MS", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}