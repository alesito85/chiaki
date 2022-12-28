package com.metallic.chiaki.discovery;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\u0018\u0000 &2\u00020\u0001:\u0001&B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u001b\u001a\u00020\u001cJ\u0006\u0010\u001d\u001a\u00020\u001cJ\u0006\u0010\u001e\u001a\u00020\u001cJ\u001e\u0010\u001f\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0004J\b\u0010%\u001a\u00020\u001cH\u0002R$\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001d\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b8F\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b8F\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u000fR\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\'"}, d2 = {"Lcom/metallic/chiaki/discovery/DiscoveryManager;", "", "()V", "value", "", "active", "getActive", "()Z", "setActive", "(Z)V", "discoveredHosts", "Lio/reactivex/Observable;", "", "Lcom/metallic/chiaki/lib/DiscoveryHost;", "getDiscoveredHosts", "()Lio/reactivex/Observable;", "discoveredHostsSubjectDebounced", "Lio/reactivex/subjects/Subject;", "discoveredHostsSubjectRaw", "discoveryActive", "getDiscoveryActive", "discoveryActiveSubject", "discoveryService", "Lcom/metallic/chiaki/lib/DiscoveryService;", "disposable", "Lio/reactivex/disposables/CompositeDisposable;", "paused", "dispose", "", "pause", "resume", "sendWakeup", "host", "", "registKey", "", "ps5", "updateService", "Companion", "app_debug"})
public final class DiscoveryManager {
    private com.metallic.chiaki.lib.DiscoveryService discoveryService;
    private final io.reactivex.subjects.Subject<java.lang.Boolean> discoveryActiveSubject = null;
    private boolean active = false;
    private boolean paused = false;
    private final io.reactivex.disposables.CompositeDisposable disposable = null;
    private io.reactivex.subjects.Subject<java.util.List<com.metallic.chiaki.lib.DiscoveryHost>> discoveredHostsSubjectDebounced;
    private io.reactivex.subjects.Subject<java.util.List<com.metallic.chiaki.lib.DiscoveryHost>> discoveredHostsSubjectRaw;
    public static final long HOSTS_MAX = 16L;
    public static final long DROP_PINGS = 3L;
    public static final long PING_MS = 500L;
    public static final int PORT = 987;
    public static final long DEBOUNCE_EMPTY_MS = 1000L;
    @org.jetbrains.annotations.NotNull()
    public static final com.metallic.chiaki.discovery.DiscoveryManager.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<java.lang.Boolean> getDiscoveryActive() {
        return null;
    }
    
    public final boolean getActive() {
        return false;
    }
    
    public final void setActive(boolean value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<java.util.List<com.metallic.chiaki.lib.DiscoveryHost>> getDiscoveredHosts() {
        return null;
    }
    
    public final void resume() {
    }
    
    public final void pause() {
    }
    
    public final void dispose() {
    }
    
    public final void sendWakeup(@org.jetbrains.annotations.NotNull()
    java.lang.String host, @org.jetbrains.annotations.NotNull()
    byte[] registKey, boolean ps5) {
    }
    
    private final void updateService() {
    }
    
    public DiscoveryManager() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\u00020\u0006X\u0086T\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\n\u0002\u0010\u0007R\u0016\u0010\b\u001a\u00020\u0006X\u0086T\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\n\u0002\u0010\u0007R\u0016\u0010\t\u001a\u00020\u0006X\u0086T\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\n\u0002\u0010\u0007R\u000e\u0010\n\u001a\u00020\u000bX\u0086T\u00a2\u0006\u0002\n\u0000\u0082\u0002\b\n\u0002\b\u0019\n\u0002\b!\u00a8\u0006\f"}, d2 = {"Lcom/metallic/chiaki/discovery/DiscoveryManager$Companion;", "", "()V", "DEBOUNCE_EMPTY_MS", "", "DROP_PINGS", "Lkotlin/ULong;", "J", "HOSTS_MAX", "PING_MS", "PORT", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}