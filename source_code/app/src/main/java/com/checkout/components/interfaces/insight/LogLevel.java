package com.checkout.components.interfaces.insight;

import Qd.a;
import androidx.annotation.Keep;
import com.checkout.components.redirecthandler.customtab.RedirectCustomTabEventLogger;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import s6.AbstractC2708l7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Keep
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/checkout/components/interfaces/insight/LogLevel;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "INFO", "ERROR", "WARN", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LogLevel {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ LogLevel[] $VALUES;

    @NotNull
    private final String value;
    public static final LogLevel INFO = new LogLevel("INFO", 0, com.clevertap.android.sdk.leanplum.Constants.INFO_PARAM);
    public static final LogLevel ERROR = new LogLevel("ERROR", 1, RedirectCustomTabEventLogger.RESULT_ERROR);
    public static final LogLevel WARN = new LogLevel("WARN", 2, "warn");

    private static final /* synthetic */ LogLevel[] $values() {
        return new LogLevel[]{INFO, ERROR, WARN};
    }

    static {
        LogLevel[] $values = $values();
        $VALUES = $values;
        $ENTRIES = AbstractC2708l7.bravo($values);
    }

    private LogLevel(String str, int i4, String str2) {
        this.value = str2;
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

    @NotNull
    public final String getValue() {
        return this.value;
    }
}
