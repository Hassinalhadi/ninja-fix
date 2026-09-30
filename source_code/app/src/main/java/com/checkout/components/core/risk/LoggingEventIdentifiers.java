package com.checkout.components.core.risk;

import Qd.a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import s6.AbstractC2708l7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/checkout/components/core/risk/LoggingEventIdentifiers;", "", "RISK_SDK_INITIALISATION_FAILED", "RISK_SDK_PUBLISH_DATA_ERROR", "RISK_SDK_PUBLISH_DATA_FAILED", "core_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LoggingEventIdentifiers {
    public static final LoggingEventIdentifiers RISK_SDK_INITIALISATION_FAILED;
    public static final LoggingEventIdentifiers RISK_SDK_PUBLISH_DATA_ERROR;
    public static final LoggingEventIdentifiers RISK_SDK_PUBLISH_DATA_FAILED;

    /* renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ LoggingEventIdentifiers[] f4994a;

    /* renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ a f4995b;

    static {
        LoggingEventIdentifiers loggingEventIdentifiers = new LoggingEventIdentifiers(0, "RISK_SDK_INITIALISATION_FAILED");
        RISK_SDK_INITIALISATION_FAILED = loggingEventIdentifiers;
        LoggingEventIdentifiers loggingEventIdentifiers2 = new LoggingEventIdentifiers(1, "RISK_SDK_PUBLISH_DATA_ERROR");
        RISK_SDK_PUBLISH_DATA_ERROR = loggingEventIdentifiers2;
        LoggingEventIdentifiers loggingEventIdentifiers3 = new LoggingEventIdentifiers(2, "RISK_SDK_PUBLISH_DATA_FAILED");
        RISK_SDK_PUBLISH_DATA_FAILED = loggingEventIdentifiers3;
        LoggingEventIdentifiers[] loggingEventIdentifiersArr = {loggingEventIdentifiers, loggingEventIdentifiers2, loggingEventIdentifiers3};
        f4994a = loggingEventIdentifiersArr;
        f4995b = AbstractC2708l7.bravo(loggingEventIdentifiersArr);
    }

    private LoggingEventIdentifiers(int i4, String str) {
    }

    @NotNull
    public static a getEntries() {
        return f4995b;
    }

    public static LoggingEventIdentifiers valueOf(String str) {
        return (LoggingEventIdentifiers) Enum.valueOf(LoggingEventIdentifiers.class, str);
    }

    public static LoggingEventIdentifiers[] values() {
        return (LoggingEventIdentifiers[]) f4994a.clone();
    }
}
