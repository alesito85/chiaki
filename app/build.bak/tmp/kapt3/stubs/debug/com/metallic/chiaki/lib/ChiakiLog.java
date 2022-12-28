package com.metallic.chiaki.lib;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\u0018\u0000 \u00172\u00020\u0001:\u0002\u0017\u0018BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00126\u0010\u0004\u001a2\u0012\u0013\u0012\u00110\u0003\u00a2\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00110\t\u00a2\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u0005\u00a2\u0006\u0002\u0010\fJ\u000e\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tJ\u000e\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tJ\u000e\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tJ\u0018\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\tH\u0002J\u000e\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tJ\u000e\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tRA\u0010\u0004\u001a2\u0012\u0013\u0012\u00110\u0003\u00a2\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00110\t\u00a2\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0019"}, d2 = {"Lcom/metallic/chiaki/lib/ChiakiLog;", "", "levelMask", "", "callback", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "level", "", "text", "", "(ILkotlin/jvm/functions/Function2;)V", "getCallback", "()Lkotlin/jvm/functions/Function2;", "getLevelMask", "()I", "d", "e", "i", "log", "v", "w", "Companion", "Level", "app_debug"})
public final class ChiakiLog {
    private final int levelMask = 0;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function2<java.lang.Integer, java.lang.String, kotlin.Unit> callback = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.metallic.chiaki.lib.ChiakiLog.Companion Companion = null;
    
    private final void log(int level, java.lang.String text) {
    }
    
    public final void d(@org.jetbrains.annotations.NotNull()
    java.lang.String text) {
    }
    
    public final void v(@org.jetbrains.annotations.NotNull()
    java.lang.String text) {
    }
    
    public final void i(@org.jetbrains.annotations.NotNull()
    java.lang.String text) {
    }
    
    public final void w(@org.jetbrains.annotations.NotNull()
    java.lang.String text) {
    }
    
    public final void e(@org.jetbrains.annotations.NotNull()
    java.lang.String text) {
    }
    
    public final int getLevelMask() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function2<java.lang.Integer, java.lang.String, kotlin.Unit> getCallback() {
        return null;
    }
    
    public ChiakiLog(int levelMask, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super java.lang.String, kotlin.Unit> callback) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f\u00a8\u0006\r"}, d2 = {"Lcom/metallic/chiaki/lib/ChiakiLog$Level;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "DEBUG", "VERBOSE", "INFO", "WARNING", "ERROR", "ALL", "app_debug"})
    public static enum Level {
        /*public static final*/ DEBUG /* = new DEBUG(0) */,
        /*public static final*/ VERBOSE /* = new VERBOSE(0) */,
        /*public static final*/ INFO /* = new INFO(0) */,
        /*public static final*/ WARNING /* = new WARNING(0) */,
        /*public static final*/ ERROR /* = new ERROR(0) */,
        /*public static final*/ ALL /* = new ALL(0) */;
        private final int value = 0;
        
        public final int getValue() {
            return 0;
        }
        
        Level(int value) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004\u00a8\u0006\b"}, d2 = {"Lcom/metallic/chiaki/lib/ChiakiLog$Companion;", "", "()V", "formatLog", "", "level", "", "text", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String formatLog(int level, @org.jetbrains.annotations.NotNull()
        java.lang.String text) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}