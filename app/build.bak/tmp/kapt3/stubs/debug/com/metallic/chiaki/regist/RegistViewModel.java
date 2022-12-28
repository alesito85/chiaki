package com.metallic.chiaki.regist;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\bB\u0005\u00a2\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\t"}, d2 = {"Lcom/metallic/chiaki/regist/RegistViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "ps4Version", "Landroidx/lifecycle/MutableLiveData;", "Lcom/metallic/chiaki/regist/RegistViewModel$ConsoleVersion;", "getPs4Version", "()Landroidx/lifecycle/MutableLiveData;", "ConsoleVersion", "app_debug"})
public final class RegistViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.metallic.chiaki.regist.RegistViewModel.ConsoleVersion> ps4Version = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.metallic.chiaki.regist.RegistViewModel.ConsoleVersion> getPs4Version() {
        return null;
    }
    
    public RegistViewModel() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\b\u0003\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t\u00a8\u0006\n"}, d2 = {"Lcom/metallic/chiaki/regist/RegistViewModel$ConsoleVersion;", "", "(Ljava/lang/String;I)V", "isPS5", "", "()Z", "PS5", "PS4_GE_8", "PS4_GE_7", "PS4_LT_7", "app_debug"})
    public static enum ConsoleVersion {
        /*public static final*/ PS5 /* = new PS5() */,
        /*public static final*/ PS4_GE_8 /* = new PS4_GE_8() */,
        /*public static final*/ PS4_GE_7 /* = new PS4_GE_7() */,
        /*public static final*/ PS4_LT_7 /* = new PS4_LT_7() */;
        
        public final boolean isPS5() {
            return false;
        }
        
        ConsoleVersion() {
        }
    }
}