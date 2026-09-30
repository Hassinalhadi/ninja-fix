package com.app.network.network.models;

import Qd.a;
import com.clevertap.android.sdk.Constants;
import delivery.samurai.android.R;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import s6.AbstractC2708l7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/app/network/network/models/PaymentType;", "", Constants.KEY_TYPE, "", "<init>", "(Ljava/lang/String;II)V", "getType", "()I", "CASH_ON_DELIVERY", "PREPAID", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PaymentType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ PaymentType[] $VALUES;
    public static final PaymentType CASH_ON_DELIVERY = new PaymentType("CASH_ON_DELIVERY", 0, R.string.payment_type_cash);
    public static final PaymentType PREPAID = new PaymentType("PREPAID", 1, R.string.payment_type_online);
    private final int type;

    private static final /* synthetic */ PaymentType[] $values() {
        return new PaymentType[]{CASH_ON_DELIVERY, PREPAID};
    }

    static {
        PaymentType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = AbstractC2708l7.bravo($values);
    }

    private PaymentType(String str, int i4, int i5) {
        this.type = i5;
    }

    @NotNull
    public static a getEntries() {
        return $ENTRIES;
    }

    public static PaymentType valueOf(String str) {
        return (PaymentType) Enum.valueOf(PaymentType.class, str);
    }

    public static PaymentType[] values() {
        return (PaymentType[]) $VALUES.clone();
    }

    public final int getType() {
        return this.type;
    }
}
