package com.metallic.chiaki.regist;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\u000f8F\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011\u00a8\u0006\u0012"}, d2 = {"Lcom/metallic/chiaki/regist/ChiakiRxLog;", "", "levelMask", "", "(I)V", "accMutex", "Ljava/util/concurrent/locks/ReentrantLock;", "accSubject", "Lio/reactivex/subjects/BehaviorSubject;", "", "log", "Lcom/metallic/chiaki/lib/ChiakiLog;", "getLog", "()Lcom/metallic/chiaki/lib/ChiakiLog;", "logText", "Lio/reactivex/Observable;", "getLogText", "()Lio/reactivex/Observable;", "app_debug"})
public final class ChiakiRxLog {
    private final io.reactivex.subjects.BehaviorSubject<java.lang.String> accSubject = null;
    private final java.util.concurrent.locks.ReentrantLock accMutex = null;
    @org.jetbrains.annotations.NotNull()
    private final com.metallic.chiaki.lib.ChiakiLog log = null;
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<java.lang.String> getLogText() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.metallic.chiaki.lib.ChiakiLog getLog() {
        return null;
    }
    
    public ChiakiRxLog(int levelMask) {
        super();
    }
}