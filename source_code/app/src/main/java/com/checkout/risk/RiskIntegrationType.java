package com.checkout.risk;

import Qd.a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import s6.AbstractC2708l7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/checkout/risk/RiskIntegrationType;", "", com.clevertap.android.sdk.Constants.KEY_TYPE, "", "(Ljava/lang/String;ILjava/lang/String;)V", "getType", "()Ljava/lang/String;", "STANDALONE", "FRAMES", "Risk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RiskIntegrationType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ RiskIntegrationType[] $VALUES;

    @NotNull
    private final String type;
    public static final RiskIntegrationType STANDALONE = new RiskIntegrationType("STANDALONE", 0, "RiskAndroidStandalone");
    public static final RiskIntegrationType FRAMES = new RiskIntegrationType("FRAMES", 1, "RiskAndroidInFramesAndroid");

    private static final /* synthetic */ RiskIntegrationType[] $values() {
        return new RiskIntegrationType[]{STANDALONE, FRAMES};
    }

    static {
        RiskIntegrationType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = AbstractC2708l7.bravo($values);
    }

    private RiskIntegrationType(String str, int i4, String str2) {
        this.type = str2;
    }

    @NotNull
    public static a getEntries() {
        return $ENTRIES;
    }

    public static RiskIntegrationType valueOf(String str) {
        return (RiskIntegrationType) Enum.valueOf(RiskIntegrationType.class, str);
    }

    public static RiskIntegrationType[] values() {
        return (RiskIntegrationType[]) $VALUES.clone();
    }

    @NotNull
    public final String getType() {
        return this.type;
    }
}
