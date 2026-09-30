package com.checkout.components.rememberme.model;

import androidx.annotation.Keep;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import s6.AbstractC2708l7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Keep
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/checkout/components/rememberme/model/SelectedPaymentMethod;", "", "<init>", "(Ljava/lang/String;I)V", "SAVED_CARD", "ADD_CARD", "NONE", "rememberme_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SelectedPaymentMethod {
    private static final /* synthetic */ Qd.a $ENTRIES;
    private static final /* synthetic */ SelectedPaymentMethod[] $VALUES;
    public static final SelectedPaymentMethod SAVED_CARD = new SelectedPaymentMethod("SAVED_CARD", 0);
    public static final SelectedPaymentMethod ADD_CARD = new SelectedPaymentMethod("ADD_CARD", 1);
    public static final SelectedPaymentMethod NONE = new SelectedPaymentMethod("NONE", 2);

    private static final /* synthetic */ SelectedPaymentMethod[] $values() {
        return new SelectedPaymentMethod[]{SAVED_CARD, ADD_CARD, NONE};
    }

    static {
        SelectedPaymentMethod[] $values = $values();
        $VALUES = $values;
        $ENTRIES = AbstractC2708l7.bravo($values);
    }

    private SelectedPaymentMethod(String str, int i4) {
    }

    @NotNull
    public static Qd.a getEntries() {
        return $ENTRIES;
    }

    public static SelectedPaymentMethod valueOf(String str) {
        return (SelectedPaymentMethod) Enum.valueOf(SelectedPaymentMethod.class, str);
    }

    public static SelectedPaymentMethod[] values() {
        return (SelectedPaymentMethod[]) $VALUES.clone();
    }
}
