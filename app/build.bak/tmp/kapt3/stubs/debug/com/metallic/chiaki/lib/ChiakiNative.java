package com.metallic.chiaki.lib;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0002\u0018\u0000 \u00032\u00020\u0001:\u0002\u0003\u0004B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0005"}, d2 = {"Lcom/metallic/chiaki/lib/ChiakiNative;", "", "()V", "Companion", "CreateResult", "app_debug"})
final class ChiakiNative {
    @org.jetbrains.annotations.NotNull()
    public static final com.metallic.chiaki.lib.ChiakiNative.Companion Companion = null;
    
    public ChiakiNative() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final native java.lang.String errorCodeToString(int value) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final native java.lang.String quitReasonToString(int value) {
        return null;
    }
    
    public static final native boolean quitReasonIsStopped(int value) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final native com.metallic.chiaki.lib.ConnectVideoProfile videoProfilePreset(int resolutionPreset, int fpsPreset, @org.jetbrains.annotations.NotNull()
    com.metallic.chiaki.lib.Codec codec) {
        return null;
    }
    
    public static final native void sessionCreate(@org.jetbrains.annotations.NotNull()
    com.metallic.chiaki.lib.ChiakiNative.CreateResult result, @org.jetbrains.annotations.NotNull()
    com.metallic.chiaki.lib.ConnectInfo connectInfo, @org.jetbrains.annotations.Nullable()
    java.lang.String logFile, boolean logVerbose, @org.jetbrains.annotations.NotNull()
    com.metallic.chiaki.lib.Session javaSession) {
    }
    
    public static final native void sessionFree(long ptr) {
    }
    
    public static final native int sessionStart(long ptr) {
        return 0;
    }
    
    public static final native int sessionStop(long ptr) {
        return 0;
    }
    
    public static final native int sessionJoin(long ptr) {
        return 0;
    }
    
    public static final native void sessionSetSurface(long ptr, @org.jetbrains.annotations.Nullable()
    android.view.Surface surface) {
    }
    
    public static final native void sessionSetControllerState(long ptr, @org.jetbrains.annotations.NotNull()
    com.metallic.chiaki.lib.ControllerState controllerState) {
    }
    
    public static final native void sessionSetLoginPin(long ptr, @org.jetbrains.annotations.NotNull()
    java.lang.String pin) {
    }
    
    public static final native void discoveryServiceCreate(@org.jetbrains.annotations.NotNull()
    com.metallic.chiaki.lib.ChiakiNative.CreateResult result, @org.jetbrains.annotations.NotNull()
    com.metallic.chiaki.lib.DiscoveryServiceOptions options, @org.jetbrains.annotations.NotNull()
    com.metallic.chiaki.lib.DiscoveryService javaService) {
    }
    
    public static final native void discoveryServiceFree(long ptr) {
    }
    
    public static final native void discoveryServiceWakeup(long ptr, @org.jetbrains.annotations.NotNull()
    java.lang.String host, long userCredential, boolean ps5) {
    }
    
    public static final native void registStart(@org.jetbrains.annotations.NotNull()
    com.metallic.chiaki.lib.ChiakiNative.CreateResult result, @org.jetbrains.annotations.NotNull()
    com.metallic.chiaki.lib.RegistInfo registInfo, @org.jetbrains.annotations.NotNull()
    com.metallic.chiaki.lib.ChiakiLog javaLog, @org.jetbrains.annotations.NotNull()
    com.metallic.chiaki.lib.Regist javaRegist) {
    }
    
    public static final native void registStop(long ptr) {
    }
    
    public static final native void registFree(long ptr) {
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u0018"}, d2 = {"Lcom/metallic/chiaki/lib/ChiakiNative$CreateResult;", "", "errorCode", "", "ptr", "", "(IJ)V", "getErrorCode", "()I", "setErrorCode", "(I)V", "getPtr", "()J", "setPtr", "(J)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "app_debug"})
    public static final class CreateResult {
        private int errorCode;
        private long ptr;
        
        public final int getErrorCode() {
            return 0;
        }
        
        public final void setErrorCode(int p0) {
        }
        
        public final long getPtr() {
            return 0L;
        }
        
        public final void setPtr(long p0) {
        }
        
        public CreateResult(int errorCode, long ptr) {
            super();
        }
        
        public final int component1() {
            return 0;
        }
        
        public final long component2() {
            return 0L;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.metallic.chiaki.lib.ChiakiNative.CreateResult copy(int errorCode, long ptr) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J!\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0087 J\u0011\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\rH\u0087 J)\u0010\u000e\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0013H\u0087 J\u0011\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0016H\u0087 J\u0011\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0016H\u0087 J\u0011\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0016H\u0087 J\u0011\u0010\u0019\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\rH\u0087 J)\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0087 J\u0011\u0010!\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\rH\u0087 J3\u0010\"\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u00102\u0006\u0010&\u001a\u00020\u00132\u0006\u0010\'\u001a\u00020(H\u0087 J\u0011\u0010)\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\rH\u0087 J\u0011\u0010*\u001a\u00020\u00162\u0006\u0010\f\u001a\u00020\rH\u0087 J\u0019\u0010+\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\r2\u0006\u0010,\u001a\u00020-H\u0087 J\u0019\u0010.\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\r2\u0006\u0010/\u001a\u00020\u0010H\u0087 J\u001b\u00100\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\r2\b\u00101\u001a\u0004\u0018\u000102H\u0087 J\u0011\u00103\u001a\u00020\u00162\u0006\u0010\f\u001a\u00020\rH\u0087 J\u0011\u00104\u001a\u00020\u00162\u0006\u0010\f\u001a\u00020\rH\u0087 J!\u00105\u001a\u0002062\u0006\u00107\u001a\u00020\u00162\u0006\u00108\u001a\u00020\u00162\u0006\u00109\u001a\u00020:H\u0087 \u00a8\u0006;"}, d2 = {"Lcom/metallic/chiaki/lib/ChiakiNative$Companion;", "", "()V", "discoveryServiceCreate", "", "result", "Lcom/metallic/chiaki/lib/ChiakiNative$CreateResult;", "options", "Lcom/metallic/chiaki/lib/DiscoveryServiceOptions;", "javaService", "Lcom/metallic/chiaki/lib/DiscoveryService;", "discoveryServiceFree", "ptr", "", "discoveryServiceWakeup", "host", "", "userCredential", "ps5", "", "errorCodeToString", "value", "", "quitReasonIsStopped", "quitReasonToString", "registFree", "registStart", "registInfo", "Lcom/metallic/chiaki/lib/RegistInfo;", "javaLog", "Lcom/metallic/chiaki/lib/ChiakiLog;", "javaRegist", "Lcom/metallic/chiaki/lib/Regist;", "registStop", "sessionCreate", "connectInfo", "Lcom/metallic/chiaki/lib/ConnectInfo;", "logFile", "logVerbose", "javaSession", "Lcom/metallic/chiaki/lib/Session;", "sessionFree", "sessionJoin", "sessionSetControllerState", "controllerState", "Lcom/metallic/chiaki/lib/ControllerState;", "sessionSetLoginPin", "pin", "sessionSetSurface", "surface", "Landroid/view/Surface;", "sessionStart", "sessionStop", "videoProfilePreset", "Lcom/metallic/chiaki/lib/ConnectVideoProfile;", "resolutionPreset", "fpsPreset", "codec", "Lcom/metallic/chiaki/lib/Codec;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String errorCodeToString(int value) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String quitReasonToString(int value) {
            return null;
        }
        
        public final boolean quitReasonIsStopped(int value) {
            return false;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.metallic.chiaki.lib.ConnectVideoProfile videoProfilePreset(int resolutionPreset, int fpsPreset, @org.jetbrains.annotations.NotNull()
        com.metallic.chiaki.lib.Codec codec) {
            return null;
        }
        
        public final void sessionCreate(@org.jetbrains.annotations.NotNull()
        com.metallic.chiaki.lib.ChiakiNative.CreateResult result, @org.jetbrains.annotations.NotNull()
        com.metallic.chiaki.lib.ConnectInfo connectInfo, @org.jetbrains.annotations.Nullable()
        java.lang.String logFile, boolean logVerbose, @org.jetbrains.annotations.NotNull()
        com.metallic.chiaki.lib.Session javaSession) {
        }
        
        public final void sessionFree(long ptr) {
        }
        
        public final int sessionStart(long ptr) {
            return 0;
        }
        
        public final int sessionStop(long ptr) {
            return 0;
        }
        
        public final int sessionJoin(long ptr) {
            return 0;
        }
        
        public final void sessionSetSurface(long ptr, @org.jetbrains.annotations.Nullable()
        android.view.Surface surface) {
        }
        
        public final void sessionSetControllerState(long ptr, @org.jetbrains.annotations.NotNull()
        com.metallic.chiaki.lib.ControllerState controllerState) {
        }
        
        public final void sessionSetLoginPin(long ptr, @org.jetbrains.annotations.NotNull()
        java.lang.String pin) {
        }
        
        public final void discoveryServiceCreate(@org.jetbrains.annotations.NotNull()
        com.metallic.chiaki.lib.ChiakiNative.CreateResult result, @org.jetbrains.annotations.NotNull()
        com.metallic.chiaki.lib.DiscoveryServiceOptions options, @org.jetbrains.annotations.NotNull()
        com.metallic.chiaki.lib.DiscoveryService javaService) {
        }
        
        public final void discoveryServiceFree(long ptr) {
        }
        
        public final void discoveryServiceWakeup(long ptr, @org.jetbrains.annotations.NotNull()
        java.lang.String host, long userCredential, boolean ps5) {
        }
        
        public final void registStart(@org.jetbrains.annotations.NotNull()
        com.metallic.chiaki.lib.ChiakiNative.CreateResult result, @org.jetbrains.annotations.NotNull()
        com.metallic.chiaki.lib.RegistInfo registInfo, @org.jetbrains.annotations.NotNull()
        com.metallic.chiaki.lib.ChiakiLog javaLog, @org.jetbrains.annotations.NotNull()
        com.metallic.chiaki.lib.Regist javaRegist) {
        }
        
        public final void registStop(long ptr) {
        }
        
        public final void registFree(long ptr) {
        }
        
        private Companion() {
            super();
        }
    }
}