package com.checkout.components.rememberme.utils;

import com.checkout.components.interfaces.mapper.Mapper;
import com.checkout.components.interfaces.model.BillingAddress;
import com.checkout.components.interfaces.model.BillingAddressNetworkEntity;
import com.checkout.components.interfaces.model.Phone;
import com.checkout.components.interfaces.model.PhoneNetworkEntity;
import com.checkout.components.interfaces.model.TokenDetails;
import com.checkout.components.interfaces.model.TokenDetailsResponse;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"Lcom/checkout/components/rememberme/utils/TokenDetailsResponseToTokenDetails;", "Lcom/checkout/components/interfaces/mapper/Mapper;", "Lcom/checkout/components/interfaces/model/TokenDetailsResponse;", "Lcom/checkout/components/interfaces/model/TokenDetails;", "<init>", "()V", "map", "from", "rememberme_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TokenDetailsResponseToTokenDetails implements Mapper<TokenDetailsResponse, TokenDetails> {
    public static final int $stable = 0;

    @Override // com.checkout.components.interfaces.mapper.Mapper
    @NotNull
    public final TokenDetails map(@NotNull TokenDetailsResponse from) {
        int i4;
        Intrinsics.echo(from, "from");
        int expiryMonth = from.getExpiryMonth();
        int expiryYear = from.getExpiryYear();
        String last4 = from.getLast4();
        String bin = from.getBin();
        String type = from.getType();
        String token = from.getToken();
        String expiresOn = from.getExpiresOn();
        String scheme = from.getScheme();
        String schemeLocal = from.getSchemeLocal();
        String cardType = from.getCardType();
        String cardCategory = from.getCardCategory();
        String issuer = from.getIssuer();
        String issuerCountry = from.getIssuerCountry();
        String productId = from.getProductId();
        String productType = from.getProductType();
        BillingAddressNetworkEntity billingAddress = from.getBillingAddress();
        Phone phone = null;
        BillingAddress billingAddress2 = billingAddress != null ? new BillingAddress(billingAddress.getAddressLine1(), billingAddress.getAddressLine2(), billingAddress.getCity(), billingAddress.getState(), billingAddress.getZip(), billingAddress.getCountry()) : null;
        PhoneNetworkEntity phone2 = from.getPhone();
        if (phone2 != null) {
            i4 = expiryMonth;
            phone = new Phone(phone2.getCountryCode(), phone2.getNumber());
        } else {
            i4 = expiryMonth;
        }
        return new TokenDetails(i4, expiryYear, last4, bin, type, token, expiresOn, scheme, schemeLocal, cardType, cardCategory, issuer, issuerCountry, productId, productType, billingAddress2, phone, from.getName());
    }
}
