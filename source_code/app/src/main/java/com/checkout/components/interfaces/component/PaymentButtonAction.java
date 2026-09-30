package com.checkout.components.interfaces.component;

import androidx.annotation.Keep;
import com.checkout.components.interfaces.annotations.CkoPublicApi;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import s6.AbstractC2708l7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Keep
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/checkout/components/interfaces/component/PaymentButtonAction;", "", "<init>", "(Ljava/lang/String;I)V", "PAYMENT", "TOKENIZE", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@CkoPublicApi
/* loaded from: classes3.dex */
public final class PaymentButtonAction {
    private static final /* synthetic */ Qd.a $ENTRIES;
    private static final /* synthetic */ PaymentButtonAction[] $VALUES;
    public static final PaymentButtonAction PAYMENT = new PaymentButtonAction("PAYMENT", 0);
    public static final PaymentButtonAction TOKENIZE = new PaymentButtonAction("TOKENIZE", 1);

    private static final /* synthetic */ PaymentButtonAction[] $values() {
        return new PaymentButtonAction[]{PAYMENT, TOKENIZE};
    }

    static {
        PaymentButtonAction[] $values = $values();
        $VALUES = $values;
        $ENTRIES = AbstractC2708l7.bravo($values);
    }

    private PaymentButtonAction(String str, int i4) {
    }

    @NotNull
    public static Qd.a getEntries() {
        return $ENTRIES;
    }

    public static PaymentButtonAction valueOf(String str) {
        return (PaymentButtonAction) Enum.valueOf(PaymentButtonAction.class, str);
    }

    public static PaymentButtonAction[] values() {
        return (PaymentButtonAction[]) $VALUES.clone();
    }
}
