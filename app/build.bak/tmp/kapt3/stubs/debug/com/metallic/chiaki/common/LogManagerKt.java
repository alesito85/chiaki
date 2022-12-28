package com.metallic.chiaki.common;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 2, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u0014\u0010\u0006\u001a\u00020\u0001X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\fX\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"baseDirName", "", "dateFormat", "Ljava/text/SimpleDateFormat;", "filePostfix", "filePrefix", "fileProviderAuthority", "getFileProviderAuthority", "()Ljava/lang/String;", "fileRegex", "Lkotlin/text/Regex;", "keepLogFilesCount", "", "app_debug"})
public final class LogManagerKt {
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String fileProviderAuthority = "com.metallic.chiaki.fileprovider";
    private static final java.lang.String baseDirName = "session_logs";
    private static final java.text.SimpleDateFormat dateFormat = null;
    private static final java.lang.String filePrefix = "chiaki_session_";
    private static final java.lang.String filePostfix = ".log";
    private static final kotlin.text.Regex fileRegex = null;
    private static final int keepLogFilesCount = 5;
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String getFileProviderAuthority() {
        return null;
    }
}