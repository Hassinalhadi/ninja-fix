package com.checkout.components.card.operations.model;

import Qd.a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import s6.AbstractC2708l7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002¨\u0006\u0003"}, d2 = {"Lcom/checkout/components/card/operations/model/LoggingEventIdentifiers;", "", "CARD_METADATA_RESPONSE_ERROR", "card_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LoggingEventIdentifiers {
    public static final LoggingEventIdentifiers CARD_METADATA_RESPONSE_ERROR;

    /* renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ LoggingEventIdentifiers[] f4275a;

    /* renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ a f4276b;

    static {
        LoggingEventIdentifiers loggingEventIdentifiers = new LoggingEventIdentifiers();
        CARD_METADATA_RESPONSE_ERROR = loggingEventIdentifiers;
        LoggingEventIdentifiers[] loggingEventIdentifiersArr = {loggingEventIdentifiers};
        f4275a = loggingEventIdentifiersArr;
        f4276b = AbstractC2708l7.bravo(loggingEventIdentifiersArr);
    }

    private LoggingEventIdentifiers() {
    }

    @NotNull
    public static a getEntries() {
        return f4276b;
    }

    public static LoggingEventIdentifiers valueOf(String str) {
        return (LoggingEventIdentifiers) Enum.valueOf(LoggingEventIdentifiers.class, str);
    }

    public static LoggingEventIdentifiers[] values() {
        return (LoggingEventIdentifiers[]) f4275a.clone();
    }
}
