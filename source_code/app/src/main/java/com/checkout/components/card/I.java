package com.checkout.components.card;

import com.checkout.components.card.ui.component.expirydate.ExpiryDateViewModel;
import com.checkout.components.card.ui.manager.PaymentStateManager;
import com.checkout.components.card.utils.extensions.CommonExtensionsKt;
import com.checkout.components.ui.model.style.view.InputComponentViewStyle;
import com.checkout.components.ui.model.style.view.InputFieldViewStyle;
import kotlin.Unit;
import n.aw;
import yf.InterfaceC3440j;

/* loaded from: classes3.dex */
public final class I implements InterfaceC3440j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ExpiryDateViewModel f3948a;

    public I(ExpiryDateViewModel expiryDateViewModel) {
        this.f3948a = expiryDateViewModel;
    }

    @Override // yf.InterfaceC3440j
    public final Object emit(Object obj, Nd.c cVar) {
        PaymentStateManager paymentStateManager;
        int i4;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        paymentStateManager = this.f3948a.f4507h;
        boolean isCvvFieldDisplayed = CommonExtensionsKt.isCvvFieldDisplayed(paymentStateManager.getDisplayCvvConfiguration(), booleanValue);
        ExpiryDateViewModel expiryDateViewModel = this.f3948a;
        InputComponentViewStyle style$card_standardRelease = expiryDateViewModel.getStyle$card_standardRelease();
        InputFieldViewStyle inputFieldStyle = this.f3948a.getStyle$card_standardRelease().getInputFieldStyle();
        aw keyboardOptions = this.f3948a.getStyle$card_standardRelease().getInputFieldStyle().getKeyboardOptions();
        if (isCvvFieldDisplayed) {
            i4 = 6;
        } else {
            i4 = 7;
        }
        expiryDateViewModel.updateStyle$card_standardRelease(InputComponentViewStyle.copy$default(style$card_standardRelease, InputFieldViewStyle.copy$default(inputFieldStyle, null, false, false, null, null, null, null, aw.alpha(keyboardOptions, 0, i4, 119), null, false, 0, 0, null, null, null, 32639, null), null, null, 6, null));
        return Unit.INSTANCE;
    }
}
