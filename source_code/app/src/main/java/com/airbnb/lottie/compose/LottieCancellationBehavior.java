package com.airbnb.lottie.compose;

import Qd.a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import s6.AbstractC2708l7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/airbnb/lottie/compose/LottieCancellationBehavior;", "", "(Ljava/lang/String;I)V", "Immediately", "OnIterationFinish", "lottie-compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LottieCancellationBehavior {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ LottieCancellationBehavior[] $VALUES;
    public static final LottieCancellationBehavior Immediately = new LottieCancellationBehavior("Immediately", 0);
    public static final LottieCancellationBehavior OnIterationFinish = new LottieCancellationBehavior("OnIterationFinish", 1);

    private static final /* synthetic */ LottieCancellationBehavior[] $values() {
        return new LottieCancellationBehavior[]{Immediately, OnIterationFinish};
    }

    static {
        LottieCancellationBehavior[] $values = $values();
        $VALUES = $values;
        $ENTRIES = AbstractC2708l7.bravo($values);
    }

    private LottieCancellationBehavior(String str, int i4) {
    }

    @NotNull
    public static a getEntries() {
        return $ENTRIES;
    }

    public static LottieCancellationBehavior valueOf(String str) {
        return (LottieCancellationBehavior) Enum.valueOf(LottieCancellationBehavior.class, str);
    }

    public static LottieCancellationBehavior[] values() {
        return (LottieCancellationBehavior[]) $VALUES.clone();
    }
}
