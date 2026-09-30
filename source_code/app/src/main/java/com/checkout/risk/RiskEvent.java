package com.checkout.risk;

import Qd.a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import s6.AbstractC2708l7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/checkout/risk/RiskEvent;", "", "rawValue", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getRawValue", "()Ljava/lang/String;", "PUBLISH_DISABLED", "PUBLISHED", "PUBLISH_FAILURE", "COLLECTED", "LOAD_FAILURE", "Risk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RiskEvent {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ RiskEvent[] $VALUES;

    @NotNull
    private final String rawValue;
    public static final RiskEvent PUBLISH_DISABLED = new RiskEvent("PUBLISH_DISABLED", 0, "riskDataPublishDisabled");
    public static final RiskEvent PUBLISHED = new RiskEvent("PUBLISHED", 1, "riskDataPublished");
    public static final RiskEvent PUBLISH_FAILURE = new RiskEvent("PUBLISH_FAILURE", 2, "riskDataPublishFailure");
    public static final RiskEvent COLLECTED = new RiskEvent("COLLECTED", 3, "riskDataCollected");
    public static final RiskEvent LOAD_FAILURE = new RiskEvent("LOAD_FAILURE", 4, "riskLoadFailure");

    private static final /* synthetic */ RiskEvent[] $values() {
        return new RiskEvent[]{PUBLISH_DISABLED, PUBLISHED, PUBLISH_FAILURE, COLLECTED, LOAD_FAILURE};
    }

    static {
        RiskEvent[] $values = $values();
        $VALUES = $values;
        $ENTRIES = AbstractC2708l7.bravo($values);
    }

    private RiskEvent(String str, int i4, String str2) {
        this.rawValue = str2;
    }

    @NotNull
    public static a getEntries() {
        return $ENTRIES;
    }

    public static RiskEvent valueOf(String str) {
        return (RiskEvent) Enum.valueOf(RiskEvent.class, str);
    }

    public static RiskEvent[] values() {
        return (RiskEvent[]) $VALUES.clone();
    }

    @NotNull
    public final String getRawValue() {
        return this.rawValue;
    }
}
