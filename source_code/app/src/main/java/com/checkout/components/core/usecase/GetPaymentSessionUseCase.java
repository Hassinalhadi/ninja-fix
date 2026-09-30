package com.checkout.components.core.usecase;

import com.checkout.components.core.domain.repository.PaymentRepository;
import com.checkout.components.core.m;
import com.checkout.components.core.network.model.response.ErrorResponse;
import com.checkout.components.interfaces.error.CheckoutErrorCode;
import com.checkout.components.interfaces.model.paymentsession.PaymentSession;
import com.squareup.moshi.JsonAdapter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yf.InterfaceC3439i;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\b\u0007\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ<\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00100\u000f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\nH\u0086\u0002¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/checkout/components/core/usecase/GetPaymentSessionUseCase;", "Lcom/checkout/components/core/usecase/PaymentSessionUseCase;", "Lcom/checkout/components/interfaces/model/paymentsession/PaymentSession;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/checkout/components/core/network/model/response/ErrorResponse;", "errorResponseAdapter", "Lcom/checkout/components/core/domain/repository/PaymentRepository;", "repository", "<init>", "(Lcom/squareup/moshi/JsonAdapter;Lcom/checkout/components/core/domain/repository/PaymentRepository;)V", "", "publicKey", "paymentSessionId", "paymentSessionSecret", "mobileSessionId", "Lyf/i;", "Lcom/checkout/components/core/network/model/response/ResultWrapper;", "invoke", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lyf/i;", "core_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GetPaymentSessionUseCase extends PaymentSessionUseCase<PaymentSession> {
    public static final int $stable = 8;

    /* renamed from: b, reason: collision with root package name */
    private final PaymentRepository f5055b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetPaymentSessionUseCase(@NotNull JsonAdapter<ErrorResponse> errorResponseAdapter, @NotNull PaymentRepository repository) {
        super(errorResponseAdapter);
        Intrinsics.echo(errorResponseAdapter, "errorResponseAdapter");
        Intrinsics.echo(repository, "repository");
        this.f5055b = repository;
    }

    @NotNull
    public final InterfaceC3439i invoke(@NotNull String publicKey, @NotNull String paymentSessionId, @NotNull String paymentSessionSecret, @NotNull String mobileSessionId) {
        Intrinsics.echo(publicKey, "publicKey");
        Intrinsics.echo(paymentSessionId, "paymentSessionId");
        Intrinsics.echo(paymentSessionSecret, "paymentSessionSecret");
        Intrinsics.echo(mobileSessionId, "mobileSessionId");
        return invoke$core_standardRelease(CheckoutErrorCode.PAYMENT_SESSION_FAILED, new m(this, publicKey, paymentSessionSecret, paymentSessionId, mobileSessionId, null));
    }
}
