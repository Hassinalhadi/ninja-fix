package com.checkout.components.core.network.model.response;

import Qd.a;
import com.checkout.components.redirecthandler.RedirectDelegate;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import s6.AbstractC2708l7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/checkout/components/core/network/model/response/PaymentActionType;", "", "", "a", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "value", "Redirect", "ThreeDS", "core_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PaymentActionType {
    public static final PaymentActionType Redirect;
    public static final PaymentActionType ThreeDS;

    /* renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ PaymentActionType[] f4967b;

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ a f4968c;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String value;

    static {
        PaymentActionType paymentActionType = new PaymentActionType("Redirect", 0, "redirect");
        Redirect = paymentActionType;
        PaymentActionType paymentActionType2 = new PaymentActionType("ThreeDS", 1, RedirectDelegate.WIRE_VALUE_THREE_DS);
        ThreeDS = paymentActionType2;
        PaymentActionType[] paymentActionTypeArr = {paymentActionType, paymentActionType2};
        f4967b = paymentActionTypeArr;
        f4968c = AbstractC2708l7.bravo(paymentActionTypeArr);
    }

    private PaymentActionType(String str, int i4, String str2) {
        this.value = str2;
    }

    @NotNull
    public static a getEntries() {
        return f4968c;
    }

    public static PaymentActionType valueOf(String str) {
        return (PaymentActionType) Enum.valueOf(PaymentActionType.class, str);
    }

    public static PaymentActionType[] values() {
        return (PaymentActionType[]) f4967b.clone();
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }
}
