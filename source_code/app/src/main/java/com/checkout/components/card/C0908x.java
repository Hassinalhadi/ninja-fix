package com.checkout.components.card;

import com.checkout.components.card.operations.validator.CardTypeValidator;
import com.checkout.components.card.ui.component.cardnumber.CardNumberViewModel;
import com.checkout.components.interfaces.model.CardMetadata;
import com.checkout.components.ui.model.CardScheme;
import java.util.Map;
import kotlin.Unit;
import yf.InterfaceC3440j;
import yf.at;

/* renamed from: com.checkout.components.card.x, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0908x implements InterfaceC3440j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CardNumberViewModel f4611a;

    public C0908x(CardNumberViewModel cardNumberViewModel) {
        this.f4611a = cardNumberViewModel;
    }

    @Override // yf.InterfaceC3440j
    public final Object emit(Object obj, Nd.c cVar) {
        at atVar;
        at atVar2;
        yf.N n5;
        Object value;
        yf.N n10;
        Object value2;
        CardTypeValidator cardTypeValidator;
        CardMetadata cardMetadata = (CardMetadata) obj;
        atVar = this.f4611a.f4458t;
        ((yf.N) atVar).india(this.f4611a.getSchemeChoiceUiVisibilityUseCase().execute(cardMetadata));
        if (cardMetadata != null) {
            CardNumberViewModel cardNumberViewModel = this.f4611a;
            CardNumberViewModel.access$processCardBinChangedCallback(cardNumberViewModel, cardMetadata);
            cardTypeValidator = cardNumberViewModel.f4456r;
            cardTypeValidator.validate$card_standardRelease(cardMetadata);
        }
        atVar2 = this.f4611a.f4458t;
        if (((Map) ((yf.N) atVar2).getValue()).isEmpty()) {
            at preferredCardScheme = this.f4611a.getPaymentStateManager().getPreferredCardScheme();
            do {
                n10 = (yf.N) preferredCardScheme;
                value2 = n10.getValue();
            } while (!n10.hotel(value2, CardScheme.UNKNOWN));
        } else {
            at preferredCardScheme2 = this.f4611a.getPaymentStateManager().getPreferredCardScheme();
            do {
                n5 = (yf.N) preferredCardScheme2;
                value = n5.getValue();
            } while (!n5.hotel(value, CardScheme.CARTES_BANCAIRES));
        }
        return Unit.INSTANCE;
    }
}
