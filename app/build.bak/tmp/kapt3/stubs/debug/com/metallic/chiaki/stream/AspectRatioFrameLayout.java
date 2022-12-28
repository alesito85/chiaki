package com.metallic.chiaki.stream;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u001b\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0017H\u0014R$\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR$\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u000e@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013\u00a8\u0006\u001a"}, d2 = {"Lcom/metallic/chiaki/stream/AspectRatioFrameLayout;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "value", "", "aspectRatio", "getAspectRatio", "()F", "setAspectRatio", "(F)V", "Lcom/metallic/chiaki/stream/TransformMode;", "mode", "getMode", "()Lcom/metallic/chiaki/stream/TransformMode;", "setMode", "(Lcom/metallic/chiaki/stream/TransformMode;)V", "onMeasure", "", "widthMeasureSpec", "", "heightMeasureSpec", "Companion", "app_debug"})
public final class AspectRatioFrameLayout extends android.widget.FrameLayout {
    private float aspectRatio = 0.0F;
    @org.jetbrains.annotations.NotNull()
    private com.metallic.chiaki.stream.TransformMode mode = com.metallic.chiaki.stream.TransformMode.FIT;
    private static final float MAX_ASPECT_RATIO_DEFORMATION_FRACTION = 0.01F;
    @org.jetbrains.annotations.NotNull()
    public static final com.metallic.chiaki.stream.AspectRatioFrameLayout.Companion Companion = null;
    
    public final float getAspectRatio() {
        return 0.0F;
    }
    
    public final void setAspectRatio(float value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.metallic.chiaki.stream.TransformMode getMode() {
        return null;
    }
    
    public final void setMode(@org.jetbrains.annotations.NotNull()
    com.metallic.chiaki.stream.TransformMode value) {
    }
    
    @java.lang.Override()
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
    }
    
    public AspectRatioFrameLayout(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    public AspectRatioFrameLayout(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/metallic/chiaki/stream/AspectRatioFrameLayout$Companion;", "", "()V", "MAX_ASPECT_RATIO_DEFORMATION_FRACTION", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}