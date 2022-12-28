package com.metallic.chiaki.common;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004H\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u000bH\u0007J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\nH\u0007\u00a8\u0006\u000e"}, d2 = {"Lcom/metallic/chiaki/common/Converters;", "", "()V", "macFromValue", "Lcom/metallic/chiaki/common/MacAddress;", "v", "", "macToValue", "addr", "targetFromValue", "Lcom/metallic/chiaki/lib/Target;", "", "targetToValue", "target", "app_debug"})
final class Converters {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.TypeConverter()
    public final com.metallic.chiaki.common.MacAddress macFromValue(long v) {
        return null;
    }
    
    @androidx.room.TypeConverter()
    public final long macToValue(@org.jetbrains.annotations.NotNull()
    com.metallic.chiaki.common.MacAddress addr) {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.TypeConverter()
    public final com.metallic.chiaki.lib.Target targetFromValue(int v) {
        return null;
    }
    
    @androidx.room.TypeConverter()
    public final int targetToValue(@org.jetbrains.annotations.NotNull()
    com.metallic.chiaki.lib.Target target) {
        return 0;
    }
    
    public Converters() {
        super();
    }
}