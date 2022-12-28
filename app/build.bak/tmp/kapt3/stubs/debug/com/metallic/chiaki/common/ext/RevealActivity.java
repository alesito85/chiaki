package com.metallic.chiaki.common.ext;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0002R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u000bX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\r\u00a8\u0006\u0015"}, d2 = {"Lcom/metallic/chiaki/common/ext/RevealActivity;", "", "revealIntent", "Landroid/content/Intent;", "getRevealIntent", "()Landroid/content/Intent;", "revealRootLayout", "Landroid/view/View;", "getRevealRootLayout", "()Landroid/view/View;", "revealWindow", "Landroid/view/Window;", "getRevealWindow", "()Landroid/view/Window;", "handleReveal", "", "revealActivity", "x", "", "y", "Companion", "app_debug"})
public abstract interface RevealActivity {
    @org.jetbrains.annotations.NotNull()
    public static final com.metallic.chiaki.common.ext.RevealActivity.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_REVEAL_X = "reveal_x";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_REVEAL_Y = "reveal_y";
    
    @org.jetbrains.annotations.NotNull()
    public abstract android.view.View getRevealRootLayout();
    
    @org.jetbrains.annotations.NotNull()
    public abstract android.content.Intent getRevealIntent();
    
    @org.jetbrains.annotations.NotNull()
    public abstract android.view.Window getRevealWindow();
    
    public abstract void handleReveal();
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 3)
    public final class DefaultImpls {
        
        private static void revealActivity(com.metallic.chiaki.common.ext.RevealActivity $this, int x, int y) {
        }
        
        public static void handleReveal(@org.jetbrains.annotations.NotNull()
        com.metallic.chiaki.common.ext.RevealActivity $this) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/metallic/chiaki/common/ext/RevealActivity$Companion;", "", "()V", "EXTRA_REVEAL_X", "", "EXTRA_REVEAL_Y", "app_debug"})
    public static final class Companion {
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String EXTRA_REVEAL_X = "reveal_x";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String EXTRA_REVEAL_Y = "reveal_y";
        
        private Companion() {
            super();
        }
    }
}