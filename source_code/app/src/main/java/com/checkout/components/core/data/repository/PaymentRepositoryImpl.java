package com.checkout.components.core.data.repository;

import B4.a;
import Nd.c;
import com.checkout.components.core.data.remote.PaymentSessionApi;
import com.checkout.components.core.domain.repository.PaymentRepository;
import com.checkout.components.core.network.model.request.PayPaymentSessionRequest;
import com.checkout.components.core.network.model.response.PayPaymentSessionResponse;
import com.checkout.components.interfaces.model.paymentsession.PaymentSession;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import vg.aq;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J6\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\r\u0010\u000eJ6\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000fH\u0096@¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/checkout/components/core/data/repository/PaymentRepositoryImpl;", "Lcom/checkout/components/core/domain/repository/PaymentRepository;", "Lcom/checkout/components/core/data/remote/PaymentSessionApi;", "api", "<init>", "(Lcom/checkout/components/core/data/remote/PaymentSessionApi;)V", "", "publicKey", "paymentSessionSecret", "paymentSessionId", "mobileSessionId", "Lvg/aq;", "Lcom/checkout/components/interfaces/model/paymentsession/PaymentSession;", "getPaymentSession", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LNd/c;)Ljava/lang/Object;", "Lcom/checkout/components/core/network/model/request/PayPaymentSessionRequest;", "body", "Lcom/checkout/components/core/network/model/response/PayPaymentSessionResponse;", "submitPaymentSession", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/checkout/components/core/network/model/request/PayPaymentSessionRequest;LNd/c;)Ljava/lang/Object;", "core_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PaymentRepositoryImpl implements PaymentRepository {
    public static final int $stable = 8;

    /* renamed from: a, reason: collision with root package name */
    private final PaymentSessionApi f4730a;

    public PaymentRepositoryImpl(@NotNull PaymentSessionApi api) {
        Intrinsics.echo(api, "api");
        this.f4730a = api;
    }

    @Override // com.checkout.components.core.domain.repository.PaymentRepository
    @Nullable
    public final Object getPaymentSession(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull c<? super aq<PaymentSession>> cVar) {
        return a.alpha(this.f4730a, null, str, str2, null, null, null, str3, str4, cVar, 57, null);
    }

    @Override // com.checkout.components.core.domain.repository.PaymentRepository
    @Nullable
    public final Object submitPaymentSession(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull PayPaymentSessionRequest payPaymentSessionRequest, @NotNull c<? super aq<PayPaymentSessionResponse>> cVar) {
        if (payPaymentSessionRequest instanceof PayPaymentSessionRequest.Card) {
            return a.charlie(this.f4730a, null, null, null, str, str2, null, str3, (PayPaymentSessionRequest.Card) payPaymentSessionRequest, cVar, 39, null);
        }
        if (payPaymentSessionRequest instanceof PayPaymentSessionRequest.GooglePay) {
            return a.delta(this.f4730a, null, null, null, str, str2, null, str3, (PayPaymentSessionRequest.GooglePay) payPaymentSessionRequest, cVar, 39, null);
        }
        if (payPaymentSessionRequest instanceof PayPaymentSessionRequest.RememberMe) {
            return a.echo(this.f4730a, null, null, null, str, str2, null, str3, (PayPaymentSessionRequest.RememberMe) payPaymentSessionRequest, cVar, 39, null);
        }
        if (payPaymentSessionRequest instanceof PayPaymentSessionRequest.Apm) {
            return a.bravo(this.f4730a, null, null, null, str, str2, null, str3, (PayPaymentSessionRequest.Apm) payPaymentSessionRequest, cVar, 39, null);
        }
        throw new NoWhenBranchMatchedException();
    }
}
