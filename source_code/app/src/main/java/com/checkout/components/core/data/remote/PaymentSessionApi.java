package com.checkout.components.core.data.remote;

import Nd.c;
import com.checkout.components.core.D;
import com.checkout.components.core.network.model.request.PayPaymentSessionRequest;
import com.checkout.components.core.network.model.response.PayPaymentSessionResponse;
import com.checkout.components.interfaces.model.paymentsession.PaymentSession;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import vg.aq;
import yg.a;
import yg.f;
import yg.i;
import yg.o;
import yg.s;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001eJf\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00022\b\b\u0003\u0010\u0006\u001a\u00020\u00022\b\b\u0003\u0010\u0007\u001a\u00020\u00022\b\b\u0003\u0010\b\u001a\u00020\u00022\b\b\u0001\u0010\t\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\u0002H§@¢\u0006\u0004\b\r\u0010\u000eJf\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u000b2\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0007\u001a\u00020\u00022\b\b\u0003\u0010\b\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00022\b\b\u0003\u0010\u0006\u001a\u00020\u00022\b\b\u0001\u0010\t\u001a\u00020\u00022\b\b\u0001\u0010\u0010\u001a\u00020\u000fH§@¢\u0006\u0004\b\u0012\u0010\u0013Jf\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00110\u000b2\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0007\u001a\u00020\u00022\b\b\u0003\u0010\b\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00022\b\b\u0003\u0010\u0006\u001a\u00020\u00022\b\b\u0001\u0010\t\u001a\u00020\u00022\b\b\u0001\u0010\u0010\u001a\u00020\u0014H§@¢\u0006\u0004\b\u0015\u0010\u0016Jf\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00110\u000b2\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0007\u001a\u00020\u00022\b\b\u0003\u0010\b\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00022\b\b\u0003\u0010\u0006\u001a\u00020\u00022\b\b\u0001\u0010\t\u001a\u00020\u00022\b\b\u0001\u0010\u0010\u001a\u00020\u0017H§@¢\u0006\u0004\b\u0018\u0010\u0019Jf\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00110\u000b2\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0007\u001a\u00020\u00022\b\b\u0003\u0010\b\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00022\b\b\u0003\u0010\u0006\u001a\u00020\u00022\b\b\u0001\u0010\t\u001a\u00020\u00022\b\b\u0001\u0010\u0010\u001a\u00020\u001aH§@¢\u0006\u0004\b\u001b\u0010\u001cø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001fÀ\u0006\u0001"}, d2 = {"Lcom/checkout/components/core/data/remote/PaymentSessionApi;", "", "", "contentType", "publicKey", "paymentSessionSecret", "ckoVersion", "ckoServiceName", "ckoServiceVersion", "paymentSessionId", "ckoMobileSessionId", "Lvg/aq;", "Lcom/checkout/components/interfaces/model/paymentsession/PaymentSession;", "getPaymentSession", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LNd/c;)Ljava/lang/Object;", "Lcom/checkout/components/core/network/model/request/PayPaymentSessionRequest$Card;", "body", "Lcom/checkout/components/core/network/model/response/PayPaymentSessionResponse;", "submitPaymentSessionByCard", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/checkout/components/core/network/model/request/PayPaymentSessionRequest$Card;LNd/c;)Ljava/lang/Object;", "Lcom/checkout/components/core/network/model/request/PayPaymentSessionRequest$GooglePay;", "submitPaymentSessionByGooglePay", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/checkout/components/core/network/model/request/PayPaymentSessionRequest$GooglePay;LNd/c;)Ljava/lang/Object;", "Lcom/checkout/components/core/network/model/request/PayPaymentSessionRequest$RememberMe;", "submitPaymentSessionByRememberMe", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/checkout/components/core/network/model/request/PayPaymentSessionRequest$RememberMe;LNd/c;)Ljava/lang/Object;", "Lcom/checkout/components/core/network/model/request/PayPaymentSessionRequest$Apm;", "submitPaymentSessionByApm", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/checkout/components/core/network/model/request/PayPaymentSessionRequest$Apm;LNd/c;)Ljava/lang/Object;", "Companion", "com/checkout/components/core/D", "core_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface PaymentSessionApi {
    public static final /* synthetic */ D Companion = D.f4617a;

    @f("/payment-sessions/{payment_session_id}")
    @Nullable
    Object getPaymentSession(@NotNull @i("Content-Type") String str, @NotNull @i("Authorization") String str2, @NotNull @i("cko-payment-session-secret") String str3, @NotNull @i("cko-version") String str4, @NotNull @i("Cko-Service-Name") String str5, @NotNull @i("Cko-Service-Version") String str6, @s("payment_session_id") @NotNull String str7, @NotNull @i("Cko-Mobile-Session-Id") String str8, @NotNull c<? super aq<PaymentSession>> cVar);

    @o("/payment-sessions/{id}/submit")
    @Nullable
    Object submitPaymentSessionByApm(@NotNull @i("Content-Type") String str, @NotNull @i("Cko-Service-Name") String str2, @NotNull @i("Cko-Service-Version") String str3, @NotNull @i("Authorization") String str4, @NotNull @i("cko-payment-session-secret") String str5, @NotNull @i("cko-version") String str6, @s("id") @NotNull String str7, @NotNull @a PayPaymentSessionRequest.Apm apm, @NotNull c<? super aq<PayPaymentSessionResponse>> cVar);

    @o("/payment-sessions/{id}/submit")
    @Nullable
    Object submitPaymentSessionByCard(@NotNull @i("Content-Type") String str, @NotNull @i("Cko-Service-Name") String str2, @NotNull @i("Cko-Service-Version") String str3, @NotNull @i("Authorization") String str4, @NotNull @i("cko-payment-session-secret") String str5, @NotNull @i("cko-version") String str6, @s("id") @NotNull String str7, @NotNull @a PayPaymentSessionRequest.Card card, @NotNull c<? super aq<PayPaymentSessionResponse>> cVar);

    @o("/payment-sessions/{id}/submit")
    @Nullable
    Object submitPaymentSessionByGooglePay(@NotNull @i("Content-Type") String str, @NotNull @i("Cko-Service-Name") String str2, @NotNull @i("Cko-Service-Version") String str3, @NotNull @i("Authorization") String str4, @NotNull @i("cko-payment-session-secret") String str5, @NotNull @i("cko-version") String str6, @s("id") @NotNull String str7, @NotNull @a PayPaymentSessionRequest.GooglePay googlePay, @NotNull c<? super aq<PayPaymentSessionResponse>> cVar);

    @o("/payment-sessions/{id}/submit")
    @Nullable
    Object submitPaymentSessionByRememberMe(@NotNull @i("Content-Type") String str, @NotNull @i("Cko-Service-Name") String str2, @NotNull @i("Cko-Service-Version") String str3, @NotNull @i("Authorization") String str4, @NotNull @i("cko-payment-session-secret") String str5, @NotNull @i("cko-version") String str6, @s("id") @NotNull String str7, @NotNull @a PayPaymentSessionRequest.RememberMe rememberMe, @NotNull c<? super aq<PayPaymentSessionResponse>> cVar);
}
