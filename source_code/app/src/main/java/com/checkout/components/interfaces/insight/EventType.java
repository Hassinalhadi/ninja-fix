package com.checkout.components.interfaces.insight;

import Qd.a;
import androidx.annotation.Keep;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import s6.AbstractC2708l7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Keep
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/checkout/components/interfaces/insight/EventType;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "PRODUCT_EVENT", "LOG", "METRIC", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class EventType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ EventType[] $VALUES;

    @NotNull
    private final String value;
    public static final EventType PRODUCT_EVENT = new EventType("PRODUCT_EVENT", 0, "product_event");
    public static final EventType LOG = new EventType("LOG", 1, "log");
    public static final EventType METRIC = new EventType("METRIC", 2, "metric");

    private static final /* synthetic */ EventType[] $values() {
        return new EventType[]{PRODUCT_EVENT, LOG, METRIC};
    }

    static {
        EventType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = AbstractC2708l7.bravo($values);
    }

    private EventType(String str, int i4, String str2) {
        this.value = str2;
    }

    @NotNull
    public static a getEntries() {
        return $ENTRIES;
    }

    public static EventType valueOf(String str) {
        return (EventType) Enum.valueOf(EventType.class, str);
    }

    public static EventType[] values() {
        return (EventType[]) $VALUES.clone();
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }
}
