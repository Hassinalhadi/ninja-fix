package com.checkout.components.card;

import com.checkout.components.card.ui.component.cardnumber.CardNumberViewModel;
import com.checkout.components.interfaces.model.CardMetadata;
import com.checkout.components.ui.model.CardScheme;
import com.checkout.components.ui.model.style.base.ImageStyle;
import com.checkout.components.ui.utils.extensions.CardSchemeExtensionsKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import yf.InterfaceC3440j;
import yf.at;

/* loaded from: classes3.dex */
public final class A implements InterfaceC3440j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CardNumberViewModel f3919a;

    public A(CardNumberViewModel cardNumberViewModel) {
        this.f3919a = cardNumberViewModel;
    }

    @Override // yf.InterfaceC3440j
    public final Object emit(Object obj, Nd.c cVar) {
        CardScheme cardScheme;
        boolean z2;
        int collectionSizeOrDefault;
        yf.N n5;
        Object value;
        boolean z10;
        yf.N n10;
        Object value2;
        boolean z11;
        boolean z12;
        Float f5;
        String schemeLocal;
        String normalizeSchemeName;
        Pair pair = (Pair) obj;
        CardScheme cardScheme2 = (CardScheme) pair.first;
        CardMetadata cardMetadata = (CardMetadata) pair.second;
        ImageStyle imageStyle = new ImageStyle(null, null, new Integer(16), new Integer(30), null, null, null, null, 243, null);
        if (cardMetadata != null && (schemeLocal = cardMetadata.getSchemeLocal()) != null && (normalizeSchemeName = CardSchemeExtensionsKt.normalizeSchemeName(schemeLocal)) != null) {
            cardScheme = CardSchemeExtensionsKt.toCardScheme(normalizeSchemeName);
        } else {
            cardScheme = null;
        }
        if (cardScheme == CardScheme.MADA) {
            z2 = true;
        } else {
            z2 = false;
        }
        at cardSchemeIconImageStyles = this.f3919a.getCardSchemeIconImageStyles();
        List<CardScheme> supportedCardSchemeList = this.f3919a.getPaymentStateManager().getSupportedCardSchemeList();
        CardNumberViewModel cardNumberViewModel = this.f3919a;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(supportedCardSchemeList, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (CardScheme cardScheme3 : supportedCardSchemeList) {
            if (cardScheme3 != cardScheme2 && cardScheme2 != CardScheme.UNKNOWN && cardNumberViewModel.getPaymentStateManager().getSupportedCardSchemeList().size() > 3) {
                z11 = false;
            } else {
                z11 = true;
            }
            if (cardScheme3 == CardScheme.MADA && z2) {
                z12 = true;
            } else {
                z12 = false;
            }
            Integer imageId = cardScheme3.getImageId();
            if (!z11 && !z12) {
                f5 = new Float(0.2f);
            } else {
                f5 = null;
            }
            ArrayList arrayList2 = arrayList;
            arrayList2.add(ImageStyle.copy$default(imageStyle, imageId, null, null, null, null, f5, null, null, 222, null));
            arrayList = arrayList2;
            cardNumberViewModel = cardNumberViewModel;
        }
        yf.N n11 = (yf.N) cardSchemeIconImageStyles;
        n11.getClass();
        n11.juliet(null, arrayList);
        at isCvvRequiredScheme = this.f3919a.getPaymentStateManager().getIsCvvRequiredScheme();
        do {
            n5 = (yf.N) isCvvRequiredScheme;
            value = n5.getValue();
            ((Boolean) value).getClass();
            if (cardMetadata != null && (z2 || cardScheme2 == CardScheme.MADA)) {
                z10 = true;
            } else {
                z10 = false;
            }
        } while (!n5.hotel(value, Boolean.valueOf(z10)));
        at isCardSchemeValid = this.f3919a.getPaymentStateManager().getIsCardSchemeValid();
        CardNumberViewModel cardNumberViewModel2 = this.f3919a;
        do {
            n10 = (yf.N) isCardSchemeValid;
            value2 = n10.getValue();
            ((Boolean) value2).getClass();
        } while (!n10.hotel(value2, Boolean.valueOf(cardNumberViewModel2.getPaymentStateManager().getSupportedCardSchemeList().contains(cardScheme2))));
        return Unit.INSTANCE;
    }
}
