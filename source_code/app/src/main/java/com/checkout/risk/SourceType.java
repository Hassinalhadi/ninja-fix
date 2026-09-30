package com.checkout.risk;

import Qd.a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import s6.AbstractC2708l7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/checkout/risk/SourceType;", "", "rawValue", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getRawValue", "()Ljava/lang/String;", "CARD_TOKEN", "RISK_SDK", "Risk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SourceType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ SourceType[] $VALUES;
    public static final SourceType CARD_TOKEN = new SourceType("CARD_TOKEN", 0, "card_token");
    public static final SourceType RISK_SDK = new SourceType("RISK_SDK", 1, "riskandroid");

    @NotNull
    private final String rawValue;

    private static final /* synthetic */ SourceType[] $values() {
        return new SourceType[]{CARD_TOKEN, RISK_SDK};
    }

    static {
        SourceType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = AbstractC2708l7.bravo($values);
    }

    private SourceType(String str, int i4, String str2) {
        this.rawValue = str2;
    }

    @NotNull
    public static a getEntries() {
        return $ENTRIES;
    }

    public static SourceType valueOf(String str) {
        return (SourceType) Enum.valueOf(SourceType.class, str);
    }

    public static SourceType[] values() {
        return (SourceType[]) $VALUES.clone();
    }

    @NotNull
    public final String getRawValue() {
        return this.rawValue;
    }
}
