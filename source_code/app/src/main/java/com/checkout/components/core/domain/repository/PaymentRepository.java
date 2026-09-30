package com.checkout.components.core.domain.repository;

import Nd.c;
import com.checkout.components.core.network.model.request.PayPaymentSessionRequest;
import com.checkout.components.core.network.model.response.PayPaymentSessionResponse;
import com.checkout.components.interfaces.model.paymentsession.PaymentSession;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import vg.aq;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J6\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H¦@¢\u0006\u0004\b\t\u0010\nJ6\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH¦@¢\u0006\u0004\b\u000e\u0010\u000fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0010À\u0006\u0001"}, d2 = {"Lcom/checkout/components/core/domain/repository/PaymentRepository;", "", "", "publicKey", "paymentSessionSecret", "paymentSessionId", "mobileSessionId", "Lvg/aq;", "Lcom/checkout/components/interfaces/model/paymentsession/PaymentSession;", "getPaymentSession", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LNd/c;)Ljava/lang/Object;", "Lcom/checkout/components/core/network/model/request/PayPaymentSessionRequest;", "body", "Lcom/checkout/components/core/network/model/response/PayPaymentSessionResponse;", "submitPaymentSession", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/checkout/components/core/network/model/request/PayPaymentSessionRequest;LNd/c;)Ljava/lang/Object;", "core_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface PaymentRepository {
    @Nullable
    Object getPaymentSession(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull c<? super aq<PaymentSession>> cVar);

    @Nullable
    Object submitPaymentSession(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull PayPaymentSessionRequest payPaymentSessionRequest, @NotNull c<? super aq<PayPaymentSessionResponse>> cVar);
}
