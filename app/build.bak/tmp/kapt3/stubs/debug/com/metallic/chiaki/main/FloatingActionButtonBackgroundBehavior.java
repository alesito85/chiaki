package com.metallic.chiaki.main;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u001f\b\u0007\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0018\u0010\u000b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\rH\u0002J \u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\nH\u0016J(\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\rH\u0014\u00a8\u0006\u0017"}, d2 = {"Lcom/metallic/chiaki/main/FloatingActionButtonBackgroundBehavior;", "Lcom/google/android/material/transformation/ExpandableTransformationBehavior;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "createCollapseAnimation", "Landroid/animation/Animator;", "child", "Landroid/view/View;", "createExpandAnimation", "currentlyAnimating", "", "layoutDependsOn", "parent", "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "dependency", "onCreateExpandedStateChangeAnimation", "Landroid/animation/AnimatorSet;", "expanded", "isAnimating", "Companion", "app_debug"})
public final class FloatingActionButtonBackgroundBehavior extends com.google.android.material.transformation.ExpandableTransformationBehavior {
    private static final long DURATION = 150L;
    @org.jetbrains.annotations.NotNull()
    public static final com.metallic.chiaki.main.FloatingActionButtonBackgroundBehavior.Companion Companion = null;
    
    @java.lang.Override()
    public boolean layoutDependsOn(@org.jetbrains.annotations.NotNull()
    androidx.coordinatorlayout.widget.CoordinatorLayout parent, @org.jetbrains.annotations.NotNull()
    android.view.View child, @org.jetbrains.annotations.NotNull()
    android.view.View dependency) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected android.animation.AnimatorSet onCreateExpandedStateChangeAnimation(@org.jetbrains.annotations.NotNull()
    android.view.View dependency, @org.jetbrains.annotations.NotNull()
    android.view.View child, boolean expanded, boolean isAnimating) {
        return null;
    }
    
    private final android.animation.Animator createExpandAnimation(android.view.View child, boolean currentlyAnimating) {
        return null;
    }
    
    private final android.animation.Animator createCollapseAnimation(android.view.View child) {
        return null;
    }
    
    public FloatingActionButtonBackgroundBehavior(@org.jetbrains.annotations.Nullable()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super();
    }
    
    public FloatingActionButtonBackgroundBehavior(@org.jetbrains.annotations.Nullable()
    android.content.Context context) {
        super();
    }
    
    public FloatingActionButtonBackgroundBehavior() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/metallic/chiaki/main/FloatingActionButtonBackgroundBehavior$Companion;", "", "()V", "DURATION", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}