package com.checkout.components.core.network.model.response;

import Qd.a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import s6.AbstractC2708l7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/checkout/components/core/network/model/response/DeclineReason;", "", "", "a", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "value", "NotEnoughFunds", "InvalidPaymentSessionData", "InvalidCustomerData", "MerchantMisconfiguration", "TryAgain", "core_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DeclineReason {
    public static final DeclineReason InvalidCustomerData;
    public static final DeclineReason InvalidPaymentSessionData;
    public static final DeclineReason MerchantMisconfiguration;
    public static final DeclineReason NotEnoughFunds;
    public static final DeclineReason TryAgain;

    /* renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ DeclineReason[] f4931b;

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ a f4932c;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String value;

    static {
        DeclineReason declineReason = new DeclineReason("NotEnoughFunds", 0, "not_enough_funds");
        NotEnoughFunds = declineReason;
        DeclineReason declineReason2 = new DeclineReason("InvalidPaymentSessionData", 1, "invalid_payment_session_data");
        InvalidPaymentSessionData = declineReason2;
        DeclineReason declineReason3 = new DeclineReason("InvalidCustomerData", 2, "invalid_customer_data");
        InvalidCustomerData = declineReason3;
        DeclineReason declineReason4 = new DeclineReason("MerchantMisconfiguration", 3, "merchant_misconfiguration");
        MerchantMisconfiguration = declineReason4;
        DeclineReason declineReason5 = new DeclineReason("TryAgain", 4, "try_again");
        TryAgain = declineReason5;
        DeclineReason[] declineReasonArr = {declineReason, declineReason2, declineReason3, declineReason4, declineReason5};
        f4931b = declineReasonArr;
        f4932c = AbstractC2708l7.bravo(declineReasonArr);
    }

    private DeclineReason(String str, int i4, String str2) {
        this.value = str2;
    }

    @NotNull
    public static a getEntries() {
        return f4932c;
    }

    public static DeclineReason valueOf(String str) {
        return (DeclineReason) Enum.valueOf(DeclineReason.class, str);
    }

    public static DeclineReason[] values() {
        return (DeclineReason[]) f4931b.clone();
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }
}
