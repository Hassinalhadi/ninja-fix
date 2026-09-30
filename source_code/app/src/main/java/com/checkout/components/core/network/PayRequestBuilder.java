package com.checkout.components.core.network;

import com.checkout.components.core.network.model.request.CardMetadata;
import com.checkout.components.core.network.model.request.InternalPlatform;
import com.checkout.components.core.network.model.request.PayPaymentSessionRequest;
import com.checkout.components.core.network.model.request.Processing;
import com.checkout.components.core.network.model.request.RedirectContext;
import com.checkout.components.core.network.model.request.RememberMeSource;
import com.checkout.components.core.network.model.request.Risk;
import com.checkout.components.core.network.model.request.SessionMetaData;
import com.checkout.components.core.network.model.request.Source;
import com.checkout.components.interfaces.model.PayRequestPayload;
import com.checkout.components.redirecthandler.customtab.RedirectConfig;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/checkout/components/core/network/PayRequestBuilder;", "", "<init>", "()V", "Lcom/checkout/components/interfaces/model/PayRequestPayload;", "payload", "Lcom/checkout/components/core/network/model/request/PayPaymentSessionRequest;", "build", "(Lcom/checkout/components/interfaces/model/PayRequestPayload;)Lcom/checkout/components/core/network/model/request/PayPaymentSessionRequest;", "core_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PayRequestBuilder {
    public static final int $stable = 0;

    private static RedirectContext a(String str) {
        if (str == null) {
            return null;
        }
        if (StringsKt.gray(str)) {
            str = null;
        }
        if (str == null) {
            return null;
        }
        return new RedirectContext(RedirectConfig.SCHEME, RedirectConfig.HOST, str);
    }

    @NotNull
    public final PayPaymentSessionRequest build(@NotNull PayRequestPayload payload) {
        Processing processing;
        CardMetadata cardMetadata;
        Intrinsics.echo(payload, "payload");
        Risk risk = null;
        if (payload instanceof PayRequestPayload.RememberMe) {
            PayRequestPayload.RememberMe rememberMe = (PayRequestPayload.RememberMe) payload;
            RememberMeSource rememberMeSource = new RememberMeSource(rememberMe.getToken(), rememberMe.getTokenReference(), rememberMe.getStoreForFutureUse(), null, rememberMe.getCvvToken(), 8, null);
            String bin = rememberMe.getBin();
            if (bin != null) {
                cardMetadata = new CardMetadata(bin);
            } else {
                cardMetadata = null;
            }
            String deviceSessionId = rememberMe.getDeviceSessionId();
            if (deviceSessionId != null) {
                risk = new Risk(deviceSessionId);
            }
            return new PayPaymentSessionRequest.RememberMe(cardMetadata, null, new SessionMetaData(new InternalPlatform("CheckoutAndroidComponents", "2.1.0"), a(rememberMe.getAppIdentifier())), rememberMeSource, null, risk, 18, null);
        }
        if (payload instanceof PayRequestPayload.GooglePay) {
            PayRequestPayload.GooglePay googlePay = (PayRequestPayload.GooglePay) payload;
            PayPaymentSessionRequest.GooglePay.GooglePayMetadata googlePayMetadata = new PayPaymentSessionRequest.GooglePay.GooglePayMetadata(googlePay.getPublicKey());
            Source source = new Source(googlePay.getToken(), null, null, 6, null);
            SessionMetaData sessionMetaData = new SessionMetaData(new InternalPlatform("CheckoutAndroidComponents", "2.1.0"), a(googlePay.getAppIdentifier()));
            String deviceSessionId2 = googlePay.getDeviceSessionId();
            if (deviceSessionId2 != null) {
                risk = new Risk(deviceSessionId2);
            }
            return new PayPaymentSessionRequest.GooglePay(googlePayMetadata, sessionMetaData, null, source, null, risk, 20, null);
        }
        if (payload instanceof PayRequestPayload.Card) {
            PayRequestPayload.Card card = (PayRequestPayload.Card) payload;
            CardMetadata cardMetadata2 = new CardMetadata(card.getCardTokenDetails().getBin());
            Source source2 = new Source(card.getCardTokenDetails().getToken(), card.getCardTokenDetails().getBillingAddress(), card.getCardTokenDetails().getPhone());
            SessionMetaData sessionMetaData2 = new SessionMetaData(new InternalPlatform("CheckoutAndroidComponents", "2.1.0"), a(card.getAppIdentifier()));
            String preferredScheme = card.getCardTokenDetails().getPreferredScheme();
            if (preferredScheme != null) {
                processing = new Processing(preferredScheme);
            } else {
                processing = null;
            }
            String deviceSessionId3 = card.getDeviceSessionId();
            if (deviceSessionId3 != null) {
                risk = new Risk(deviceSessionId3);
            }
            return new PayPaymentSessionRequest.Card(cardMetadata2, sessionMetaData2, processing, source2, null, risk, 16, null);
        }
        if (payload instanceof PayRequestPayload.Apm) {
            PayRequestPayload.Apm apm = (PayRequestPayload.Apm) payload;
            String type = apm.getType();
            Map<String, Object> fields = apm.getFields();
            SessionMetaData sessionMetaData3 = new SessionMetaData(new InternalPlatform("CheckoutAndroidComponents", "2.1.0"), a(apm.getAppIdentifier()));
            String deviceSessionId4 = apm.getDeviceSessionId();
            if (deviceSessionId4 != null) {
                risk = new Risk(deviceSessionId4);
            }
            return new PayPaymentSessionRequest.Apm(type, fields, sessionMetaData3, risk);
        }
        throw new NoWhenBranchMatchedException();
    }
}
