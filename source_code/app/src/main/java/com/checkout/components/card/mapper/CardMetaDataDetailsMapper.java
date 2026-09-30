package com.checkout.components.card.mapper;

import com.checkout.components.card.operations.network.model.CardMetaDataResponse;
import com.checkout.components.interfaces.mapper.Mapper;
import com.checkout.components.interfaces.model.CardMetadata;
import com.checkout.components.ui.utils.extensions.CardSchemeExtensionsKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"Lcom/checkout/components/card/mapper/CardMetaDataDetailsMapper;", "Lcom/checkout/components/interfaces/mapper/Mapper;", "Lcom/checkout/components/card/operations/network/model/CardMetaDataResponse;", "Lcom/checkout/components/interfaces/model/CardMetadata;", "<init>", "()V", "map", "from", "card_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CardMetaDataDetailsMapper implements Mapper<CardMetaDataResponse, CardMetadata> {
    public static final int $stable = 0;

    @Override // com.checkout.components.interfaces.mapper.Mapper
    @NotNull
    public final CardMetadata map(@NotNull CardMetaDataResponse from) {
        ArrayList arrayList;
        int collectionSizeOrDefault;
        Intrinsics.echo(from, "from");
        String normalizeSchemeName = CardSchemeExtensionsKt.normalizeSchemeName(from.getScheme());
        String schemeLocal = from.getSchemeLocal();
        String cardType = from.getCardType();
        String cardCategory = from.getCardCategory();
        String currency = from.getCurrency();
        String issuer = from.getIssuer();
        String issuerCountry = from.getIssuerCountry();
        String issuerCountryName = from.getIssuerCountryName();
        String productId = from.getProductId();
        String subProductId = from.getSubProductId();
        String productType = from.getProductType();
        Boolean regulatedIndicator = from.getRegulatedIndicator();
        String bin = from.getBin();
        String binMax = from.getBinMax();
        List<String> localSchemes = from.getLocalSchemes();
        if (localSchemes != null) {
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(localSchemes, 10);
            arrayList = new ArrayList(collectionSizeOrDefault);
            for (Iterator it = localSchemes.iterator(); it.hasNext(); it = it) {
                arrayList.add(CardSchemeExtensionsKt.normalizeSchemeName((String) it.next()));
            }
        } else {
            arrayList = null;
        }
        return new CardMetadata(normalizeSchemeName, schemeLocal, cardType, cardCategory, currency, issuer, issuerCountry, issuerCountryName, productId, subProductId, productType, regulatedIndicator, bin, binMax, arrayList);
    }
}
