package com.metallic.chiaki.lib;

import java.lang.System;

@kotlinx.parcelize.Parcelize()
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0016\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0001+B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u00a2\u0006\u0002\u0010\rJ\t\u0010\u0019\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\u0007H\u00c6\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\t\u0010\u001e\u001a\u00020\fH\u00c6\u0003JI\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u00c6\u0001J\t\u0010 \u001a\u00020\fH\u00d6\u0001J\u0013\u0010!\u001a\u00020\u00072\b\u0010\"\u001a\u0004\u0018\u00010#H\u00d6\u0003J\t\u0010$\u001a\u00020\fH\u00d6\u0001J\t\u0010%\u001a\u00020\u0005H\u00d6\u0001J\u0019\u0010&\u001a\u00020\'2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\fH\u00d6\u0001R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018\u00a8\u0006,"}, d2 = {"Lcom/metallic/chiaki/lib/RegistInfo;", "Landroid/os/Parcelable;", "target", "Lcom/metallic/chiaki/lib/Target;", "host", "", "broadcast", "", "psnOnlineId", "psnAccountId", "", "pin", "", "(Lcom/metallic/chiaki/lib/Target;Ljava/lang/String;ZLjava/lang/String;[BI)V", "getBroadcast", "()Z", "getHost", "()Ljava/lang/String;", "getPin", "()I", "getPsnAccountId", "()[B", "getPsnOnlineId", "getTarget", "()Lcom/metallic/chiaki/lib/Target;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "app_debug"})
public final class RegistInfo implements android.os.Parcelable {
    @org.jetbrains.annotations.NotNull()
    private final com.metallic.chiaki.lib.Target target = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String host = null;
    private final boolean broadcast = false;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String psnOnlineId = null;
    @org.jetbrains.annotations.Nullable()
    private final byte[] psnAccountId = null;
    private final int pin = 0;
    public static final int ACCOUNT_ID_SIZE = 8;
    @org.jetbrains.annotations.NotNull()
    public static final com.metallic.chiaki.lib.RegistInfo.Companion Companion = null;
    public static final android.os.Parcelable.Creator<com.metallic.chiaki.lib.RegistInfo> CREATOR = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.metallic.chiaki.lib.Target getTarget() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getHost() {
        return null;
    }
    
    public final boolean getBroadcast() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPsnOnlineId() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final byte[] getPsnAccountId() {
        return null;
    }
    
    public final int getPin() {
        return 0;
    }
    
    public RegistInfo(@org.jetbrains.annotations.NotNull()
    com.metallic.chiaki.lib.Target target, @org.jetbrains.annotations.NotNull()
    java.lang.String host, boolean broadcast, @org.jetbrains.annotations.Nullable()
    java.lang.String psnOnlineId, @org.jetbrains.annotations.Nullable()
    byte[] psnAccountId, int pin) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.metallic.chiaki.lib.Target component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    public final boolean component3() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final byte[] component5() {
        return null;
    }
    
    public final int component6() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.metallic.chiaki.lib.RegistInfo copy(@org.jetbrains.annotations.NotNull()
    com.metallic.chiaki.lib.Target target, @org.jetbrains.annotations.NotNull()
    java.lang.String host, boolean broadcast, @org.jetbrains.annotations.Nullable()
    java.lang.String psnOnlineId, @org.jetbrains.annotations.Nullable()
    byte[] psnAccountId, int pin) {
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
    
    @java.lang.Override()
    public int describeContents() {
        return 0;
    }
    
    @java.lang.Override()
    public void writeToParcel(@org.jetbrains.annotations.NotNull()
    android.os.Parcel parcel, int flags) {
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 3)
    public static final class Creator implements android.os.Parcelable.Creator<com.metallic.chiaki.lib.RegistInfo> {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.metallic.chiaki.lib.RegistInfo[] newArray(int size) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.metallic.chiaki.lib.RegistInfo createFromParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel in) {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/metallic/chiaki/lib/RegistInfo$Companion;", "", "()V", "ACCOUNT_ID_SIZE", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}