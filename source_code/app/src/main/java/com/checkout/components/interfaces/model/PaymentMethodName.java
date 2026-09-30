package com.checkout.components.interfaces.model;

import com.checkout.components.interfaces.annotations.CkoPublicApi;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u000f¨\u0006\u0014"}, d2 = {"Lcom/checkout/components/interfaces/model/PaymentMethodName;", "Lcom/checkout/components/interfaces/model/ComponentName;", "", "value", "<init>", "(Ljava/lang/String;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getValue", "Companion", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@CkoPublicApi
/* loaded from: classes3.dex */
public final class PaymentMethodName implements ComponentName {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: b, reason: collision with root package name */
    private static final PaymentMethodName f5420b;

    /* renamed from: c, reason: collision with root package name */
    private static final PaymentMethodName f5421c;

    /* renamed from: d, reason: collision with root package name */
    private static final PaymentMethodName f5422d;
    private static final List e;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String value;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/checkout/components/interfaces/model/PaymentMethodName$Companion;", "", "Lcom/checkout/components/interfaces/model/PaymentMethodName;", "Card", "Lcom/checkout/components/interfaces/model/PaymentMethodName;", "getCard", "()Lcom/checkout/components/interfaces/model/PaymentMethodName;", "GooglePay", "getGooglePay", "RememberMe", "getRememberMe", "", "entries", "Ljava/util/List;", "getEntries", "()Ljava/util/List;", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        @NotNull
        public final PaymentMethodName getCard() {
            return PaymentMethodName.f5420b;
        }

        @NotNull
        public final List<PaymentMethodName> getEntries() {
            return PaymentMethodName.e;
        }

        @NotNull
        public final PaymentMethodName getGooglePay() {
            return PaymentMethodName.f5421c;
        }

        @NotNull
        public final PaymentMethodName getRememberMe() {
            return PaymentMethodName.f5422d;
        }
    }

    static {
        PaymentMethodName paymentMethodName = new PaymentMethodName("card");
        f5420b = paymentMethodName;
        PaymentMethodName paymentMethodName2 = new PaymentMethodName("googlepay");
        f5421c = paymentMethodName2;
        PaymentMethodName paymentMethodName3 = new PaymentMethodName("remember_me");
        f5422d = paymentMethodName3;
        e = CollectionsKt.listOf(paymentMethodName, paymentMethodName2, paymentMethodName3);
    }

    public PaymentMethodName(@NotNull String value) {
        Intrinsics.echo(value, "value");
        this.value = value;
    }

    public final boolean equals(@Nullable Object other) {
        if (this != other) {
            if (!(other instanceof PaymentMethodName) || !Intrinsics.areEqual(this.value, ((PaymentMethodName) other).value)) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override // com.checkout.components.interfaces.model.ComponentName
    @NotNull
    public final String getValue() {
        return this.value;
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    @NotNull
    public final String toString() {
        return this.value;
    }
}
