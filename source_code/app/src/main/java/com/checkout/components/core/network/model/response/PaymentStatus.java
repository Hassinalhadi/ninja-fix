package com.checkout.components.core.network.model.response;

import Qd.a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import s6.AbstractC2708l7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\t\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/checkout/components/core/network/model/response/PaymentStatus;", "", "", "a", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "value", "ActionRequired", "Approved", "Declined", "core_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PaymentStatus {
    public static final PaymentStatus ActionRequired;
    public static final PaymentStatus Approved;
    public static final PaymentStatus Declined;

    /* renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ PaymentStatus[] f4974b;

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ a f4975c;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String value;

    static {
        PaymentStatus paymentStatus = new PaymentStatus("ActionRequired", 0, "Action Required");
        ActionRequired = paymentStatus;
        PaymentStatus paymentStatus2 = new PaymentStatus("Approved", 1, "Approved");
        Approved = paymentStatus2;
        PaymentStatus paymentStatus3 = new PaymentStatus("Declined", 2, "Declined");
        Declined = paymentStatus3;
        PaymentStatus[] paymentStatusArr = {paymentStatus, paymentStatus2, paymentStatus3};
        f4974b = paymentStatusArr;
        f4975c = AbstractC2708l7.bravo(paymentStatusArr);
    }

    private PaymentStatus(String str, int i4, String str2) {
        this.value = str2;
    }

    @NotNull
    public static a getEntries() {
        return f4975c;
    }

    public static PaymentStatus valueOf(String str) {
        return (PaymentStatus) Enum.valueOf(PaymentStatus.class, str);
    }

    public static PaymentStatus[] values() {
        return (PaymentStatus[]) f4974b.clone();
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }
}
