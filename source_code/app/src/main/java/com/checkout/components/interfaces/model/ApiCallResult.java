package com.checkout.components.interfaces.model;

import androidx.annotation.Keep;
import com.checkout.components.interfaces.annotations.CkoPublicApi;
import com.checkout.components.interfaces.model.paymentsession.PaymentSessionSubmissionResult;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/checkout/components/interfaces/model/ApiCallResult;", "", "<init>", "()V", "Success", "Failure", "Lcom/checkout/components/interfaces/model/ApiCallResult$Failure;", "Lcom/checkout/components/interfaces/model/ApiCallResult$Success;", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@CkoPublicApi
/* loaded from: classes3.dex */
public abstract class ApiCallResult {
    public static final int $stable = 0;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/checkout/components/interfaces/model/ApiCallResult$Failure;", "Lcom/checkout/components/interfaces/model/ApiCallResult;", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Failure extends ApiCallResult {
        public static final int $stable = 0;

        @NotNull
        public static final Failure INSTANCE = new Failure();

        private Failure() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/checkout/components/interfaces/model/ApiCallResult$Success;", "Lcom/checkout/components/interfaces/model/ApiCallResult;", "Lcom/checkout/components/interfaces/model/paymentsession/PaymentSessionSubmissionResult;", "paymentSessionSubmissionResult", "<init>", "(Lcom/checkout/components/interfaces/model/paymentsession/PaymentSessionSubmissionResult;)V", "component1", "()Lcom/checkout/components/interfaces/model/paymentsession/PaymentSessionSubmissionResult;", Constants.COPY_TYPE, "(Lcom/checkout/components/interfaces/model/paymentsession/PaymentSessionSubmissionResult;)Lcom/checkout/components/interfaces/model/ApiCallResult$Success;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/checkout/components/interfaces/model/paymentsession/PaymentSessionSubmissionResult;", "getPaymentSessionSubmissionResult", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* data */ class Success extends ApiCallResult {
        public static final int $stable = 0;

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final PaymentSessionSubmissionResult paymentSessionSubmissionResult;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(@NotNull PaymentSessionSubmissionResult paymentSessionSubmissionResult) {
            super(null);
            Intrinsics.echo(paymentSessionSubmissionResult, "paymentSessionSubmissionResult");
            this.paymentSessionSubmissionResult = paymentSessionSubmissionResult;
        }

        public static Success copy$default(Success success, PaymentSessionSubmissionResult paymentSessionSubmissionResult, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                paymentSessionSubmissionResult = success.paymentSessionSubmissionResult;
            }
            success.getClass();
            Intrinsics.echo(paymentSessionSubmissionResult, "paymentSessionSubmissionResult");
            return new Success(paymentSessionSubmissionResult);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final PaymentSessionSubmissionResult getPaymentSessionSubmissionResult() {
            return this.paymentSessionSubmissionResult;
        }

        @NotNull
        public final Success copy(@NotNull PaymentSessionSubmissionResult paymentSessionSubmissionResult) {
            Intrinsics.echo(paymentSessionSubmissionResult, "paymentSessionSubmissionResult");
            return new Success(paymentSessionSubmissionResult);
        }

        public final boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Success) && Intrinsics.areEqual(this.paymentSessionSubmissionResult, ((Success) other).paymentSessionSubmissionResult);
        }

        @NotNull
        public final PaymentSessionSubmissionResult getPaymentSessionSubmissionResult() {
            return this.paymentSessionSubmissionResult;
        }

        public final int hashCode() {
            return this.paymentSessionSubmissionResult.hashCode();
        }

        @NotNull
        public final String toString() {
            return "Success(paymentSessionSubmissionResult=" + this.paymentSessionSubmissionResult + ")";
        }
    }

    public /* synthetic */ ApiCallResult(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private ApiCallResult() {
    }
}
