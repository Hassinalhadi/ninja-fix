package io.getunleash.android.util;

import Qd.a;
import com.airbnb.lottie.compose.LottieConstants;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import s6.AbstractC2708l7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lio/getunleash/android/util/LogLevel;", "", Constants.INAPP_PRIORITY, "", "<init>", "(Ljava/lang/String;II)V", "getPriority", "()I", "NONE", "ERROR", "WARN", "INFO", "DEBUG", "VERBOSE", "unleashandroidsdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class LogLevel {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ LogLevel[] $VALUES;
    private final int priority;
    public static final LogLevel NONE = new LogLevel("NONE", 0, LottieConstants.IterateForever);
    public static final LogLevel ERROR = new LogLevel("ERROR", 1, 6);
    public static final LogLevel WARN = new LogLevel("WARN", 2, 5);
    public static final LogLevel INFO = new LogLevel("INFO", 3, 4);
    public static final LogLevel DEBUG = new LogLevel("DEBUG", 4, 3);
    public static final LogLevel VERBOSE = new LogLevel("VERBOSE", 5, 2);

    private static final /* synthetic */ LogLevel[] $values() {
        return new LogLevel[]{NONE, ERROR, WARN, INFO, DEBUG, VERBOSE};
    }

    static {
        LogLevel[] $values = $values();
        $VALUES = $values;
        $ENTRIES = AbstractC2708l7.bravo($values);
    }

    private LogLevel(String str, int i4, int i5) {
        this.priority = i5;
    }

    @NotNull
    public static a getEntries() {
        return $ENTRIES;
    }

    public static LogLevel valueOf(String str) {
        return (LogLevel) Enum.valueOf(LogLevel.class, str);
    }

    public static LogLevel[] values() {
        return (LogLevel[]) $VALUES.clone();
    }

    public final int getPriority() {
        return this.priority;
    }
}
