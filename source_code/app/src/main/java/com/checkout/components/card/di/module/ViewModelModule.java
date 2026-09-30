package com.checkout.components.card.di.module;

import com.checkout.components.card.di.CVVStyle;
import com.checkout.components.card.di.CardHolderNameStyle;
import com.checkout.components.card.di.CardNumberStyle;
import com.checkout.components.card.di.ExpiryDateStyle;
import com.checkout.components.card.ui.component.base.InputComponentViewModel;
import com.checkout.components.card.ui.component.cardholdername.CardHolderNameViewModel;
import com.checkout.components.card.ui.component.cardnumber.CardNumberViewModel;
import com.checkout.components.card.ui.component.cvv.CVVViewModel;
import com.checkout.components.card.ui.component.expirydate.ExpiryDateViewModel;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b!\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H'J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\tH'J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u000bH'J\u0010\u0010\f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\rH'¨\u0006\u000e"}, d2 = {"Lcom/checkout/components/card/di/module/ViewModelModule;", "", "<init>", "()V", "bindCardNumberViewModel", "Lcom/checkout/components/card/ui/component/base/InputComponentViewModel;", "viewModel", "Lcom/checkout/components/card/ui/component/cardnumber/CardNumberViewModel;", "bindCVVViewModel", "Lcom/checkout/components/card/ui/component/cvv/CVVViewModel;", "bindExpiryDateViewModel", "Lcom/checkout/components/card/ui/component/expirydate/ExpiryDateViewModel;", "bindCardHolderNameViewModel", "Lcom/checkout/components/card/ui/component/cardholdername/CardHolderNameViewModel;", "card_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class ViewModelModule {
    public static final int $stable = 0;

    @CVVStyle
    @NotNull
    public abstract InputComponentViewModel bindCVVViewModel(@NotNull CVVViewModel viewModel);

    @CardHolderNameStyle
    @NotNull
    public abstract InputComponentViewModel bindCardHolderNameViewModel(@NotNull CardHolderNameViewModel viewModel);

    @CardNumberStyle
    @NotNull
    public abstract InputComponentViewModel bindCardNumberViewModel(@NotNull CardNumberViewModel viewModel);

    @ExpiryDateStyle
    @NotNull
    public abstract InputComponentViewModel bindExpiryDateViewModel(@NotNull ExpiryDateViewModel viewModel);
}
