package com.metallic.chiaki.stream;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u001dR\u0014\u0010\u0007\u001a\u00020\b8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\nR\u0014\u0010\r\u001a\u00020\b8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\nR\u0014\u0010\u000f\u001a\u00020\u00108BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00108BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u0012R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0015\u001a\u00020\b8F\u00a2\u0006\u0006\u001a\u0004\b\u0016\u0010\nR\u0011\u0010\u0017\u001a\u00020\b8F\u00a2\u0006\u0006\u001a\u0004\b\u0018\u0010\nR\u0014\u0010\u0019\u001a\u00020\u00108BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001a\u0010\u0012\u00a8\u0006\u001e"}, d2 = {"Lcom/metallic/chiaki/stream/TextureViewTransform;", "", "videoProfile", "Lcom/metallic/chiaki/lib/ConnectVideoProfile;", "textureView", "Landroid/view/TextureView;", "(Lcom/metallic/chiaki/lib/ConnectVideoProfile;Landroid/view/TextureView;)V", "contentAspect", "", "getContentAspect", "()F", "contentHeight", "getContentHeight", "contentWidth", "getContentWidth", "normalResolution", "Lcom/metallic/chiaki/stream/Resolution;", "getNormalResolution", "()Lcom/metallic/chiaki/stream/Resolution;", "strechedResolution", "getStrechedResolution", "viewHeight", "getViewHeight", "viewWidth", "getViewWidth", "zoomedResolution", "getZoomedResolution", "resolutionFor", "mode", "Lcom/metallic/chiaki/stream/TransformMode;", "app_debug"})
public final class TextureViewTransform {
    private final com.metallic.chiaki.lib.ConnectVideoProfile videoProfile = null;
    private final android.view.TextureView textureView = null;
    
    private final float getContentWidth() {
        return 0.0F;
    }
    
    private final float getContentHeight() {
        return 0.0F;
    }
    
    public final float getViewWidth() {
        return 0.0F;
    }
    
    public final float getViewHeight() {
        return 0.0F;
    }
    
    private final float getContentAspect() {
        return 0.0F;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.metallic.chiaki.stream.Resolution resolutionFor(@org.jetbrains.annotations.NotNull()
    com.metallic.chiaki.stream.TransformMode mode) {
        return null;
    }
    
    private final com.metallic.chiaki.stream.Resolution getStrechedResolution() {
        return null;
    }
    
    private final com.metallic.chiaki.stream.Resolution getZoomedResolution() {
        return null;
    }
    
    private final com.metallic.chiaki.stream.Resolution getNormalResolution() {
        return null;
    }
    
    public TextureViewTransform(@org.jetbrains.annotations.NotNull()
    com.metallic.chiaki.lib.ConnectVideoProfile videoProfile, @org.jetbrains.annotations.NotNull()
    android.view.TextureView textureView) {
        super();
    }
}