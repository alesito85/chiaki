package com.metallic.chiaki.lib;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u00014Bh\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ\t\u0010!\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u0016\u0010#\u001a\u00020\u0005H\u00c6\u0003\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\b$\u0010\u0016J\u000b\u0010%\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u0010\'\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u0087\u0001\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0007H\u00c6\u0001\u00f8\u0001\u0000\u00a2\u0006\u0004\b-\u0010.J\u0013\u0010/\u001a\u00020\u001a2\b\u00100\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00101\u001a\u000202H\u00d6\u0001J\t\u00103\u001a\u00020\u0007H\u00d6\u0001R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0019\u0010\u0004\u001a\u00020\u0005\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011R\u0011\u0010\u0019\u001a\u00020\u001a8F\u00a2\u0006\u0006\u001a\u0004\b\u0019\u0010\u001bR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0011R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u0011\u0082\u0002\b\n\u0002\b\u0019\n\u0002\b!\u00a8\u00065"}, d2 = {"Lcom/metallic/chiaki/lib/DiscoveryHost;", "", "state", "Lcom/metallic/chiaki/lib/DiscoveryHost$State;", "hostRequestPort", "Lkotlin/UShort;", "hostAddr", "", "systemVersion", "deviceDiscoveryProtocolVersion", "hostName", "hostType", "hostId", "runningAppTitleid", "runningAppName", "(Lcom/metallic/chiaki/lib/DiscoveryHost$State;SLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getDeviceDiscoveryProtocolVersion", "()Ljava/lang/String;", "getHostAddr", "getHostId", "getHostName", "getHostRequestPort-Mh2AYeg", "()S", "S", "getHostType", "isPS5", "", "()Z", "getRunningAppName", "getRunningAppTitleid", "getState", "()Lcom/metallic/chiaki/lib/DiscoveryHost$State;", "getSystemVersion", "component1", "component10", "component2", "component2-Mh2AYeg", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "copy-oouJ9ec", "(Lcom/metallic/chiaki/lib/DiscoveryHost$State;SLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/metallic/chiaki/lib/DiscoveryHost;", "equals", "other", "hashCode", "", "toString", "State", "app_debug"})
public final class DiscoveryHost {
    @org.jetbrains.annotations.NotNull()
    private final com.metallic.chiaki.lib.DiscoveryHost.State state = null;
    private final short hostRequestPort = 0;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String hostAddr = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String systemVersion = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String deviceDiscoveryProtocolVersion = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String hostName = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String hostType = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String hostId = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String runningAppTitleid = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String runningAppName = null;
    
    public final boolean isPS5() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.metallic.chiaki.lib.DiscoveryHost.State getState() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getHostAddr() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSystemVersion() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDeviceDiscoveryProtocolVersion() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getHostName() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getHostType() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getHostId() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getRunningAppTitleid() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getRunningAppName() {
        return null;
    }
    
    private DiscoveryHost(com.metallic.chiaki.lib.DiscoveryHost.State state, short hostRequestPort, java.lang.String hostAddr, java.lang.String systemVersion, java.lang.String deviceDiscoveryProtocolVersion, java.lang.String hostName, java.lang.String hostType, java.lang.String hostId, java.lang.String runningAppTitleid, java.lang.String runningAppName) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.metallic.chiaki.lib.DiscoveryHost.State component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component10() {
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
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005\u00a8\u0006\u0006"}, d2 = {"Lcom/metallic/chiaki/lib/DiscoveryHost$State;", "", "(Ljava/lang/String;I)V", "UNKNOWN", "READY", "STANDBY", "app_debug"})
    public static enum State {
        /*public static final*/ UNKNOWN /* = new UNKNOWN() */,
        /*public static final*/ READY /* = new READY() */,
        /*public static final*/ STANDBY /* = new STANDBY() */;
        
        State() {
        }
    }
}