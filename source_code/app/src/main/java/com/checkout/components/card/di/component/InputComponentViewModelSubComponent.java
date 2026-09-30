package com.checkout.components.card.di.component;

import com.checkout.components.card.di.CVVStyle;
import com.checkout.components.card.di.CardHolderNameStyle;
import com.checkout.components.card.di.CardNumberStyle;
import com.checkout.components.card.di.ExpiryDateStyle;
import com.checkout.components.card.ui.component.base.InputComponentViewModel;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\ba\u0018\u00002\u00020\u0001:\u0001\fR\u0014\u0010\u0002\u001a\u00020\u00038gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00038gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0014\u0010\b\u001a\u00020\u00038gX¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00038gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0001"}, d2 = {"Lcom/checkout/components/card/di/component/InputComponentViewModelSubComponent;", "", "cardNumberViewModel", "Lcom/checkout/components/card/ui/component/base/InputComponentViewModel;", "getCardNumberViewModel", "()Lcom/checkout/components/card/ui/component/base/InputComponentViewModel;", "cvvViewModel", "getCvvViewModel", "expiryDateViewModel", "getExpiryDateViewModel", "cardHolderNameViewModel", "getCardHolderNameViewModel", "Builder", "card_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface InputComponentViewModelSubComponent {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lcom/checkout/components/card/di/component/InputComponentViewModelSubComponent$Builder;", "", "build", "Lcom/checkout/components/card/di/component/InputComponentViewModelSubComponent;", "card_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public interface Builder {
        @NotNull
        InputComponentViewModelSubComponent build();
    }

    @CardHolderNameStyle
    @NotNull
    InputComponentViewModel getCardHolderNameViewModel();

    @CardNumberStyle
    @NotNull
    InputComponentViewModel getCardNumberViewModel();

    @CVVStyle
    @NotNull
    InputComponentViewModel getCvvViewModel();

    @ExpiryDateStyle
    @NotNull
    InputComponentViewModel getExpiryDateViewModel();
}
