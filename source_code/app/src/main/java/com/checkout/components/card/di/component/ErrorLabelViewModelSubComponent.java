package com.checkout.components.card.di.component;

import com.checkout.components.card.ui.component.errorlabel.ErrorLabelViewModel;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\ba\u0018\u00002\u00020\u0001:\u0001\u0006R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Lcom/checkout/components/card/di/component/ErrorLabelViewModelSubComponent;", "", "errorLabelViewModel", "Lcom/checkout/components/card/ui/component/errorlabel/ErrorLabelViewModel;", "getErrorLabelViewModel", "()Lcom/checkout/components/card/ui/component/errorlabel/ErrorLabelViewModel;", "Builder", "card_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface ErrorLabelViewModelSubComponent {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lcom/checkout/components/card/di/component/ErrorLabelViewModelSubComponent$Builder;", "", "build", "Lcom/checkout/components/card/di/component/ErrorLabelViewModelSubComponent;", "card_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public interface Builder {
        @NotNull
        ErrorLabelViewModelSubComponent build();
    }

    @NotNull
    ErrorLabelViewModel getErrorLabelViewModel();
}
