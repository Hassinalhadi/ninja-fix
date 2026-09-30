package com.checkout.components.card.di.component;

import com.checkout.components.card.ui.component.errorlabel.ErrorLabelViewModel;
import com.checkout.components.card.ui.manager.PaymentStateManager;
import com.checkout.components.interfaces.ui.ResourceProvider;
import com.checkout.components.ui.mapper.TextLabelStyleToStateMapper;
import com.checkout.components.ui.mapper.TextLabelStyleToViewStyleMapper;
import com.checkout.components.ui.model.style.base.TextLabelStyle;
import s6.AbstractC2763s0;

/* loaded from: classes3.dex */
public final class l implements ErrorLabelViewModelSubComponent {

    /* renamed from: a, reason: collision with root package name */
    public final j f4098a;

    public l(j jVar) {
        this.f4098a = jVar;
    }

    @Override // com.checkout.components.card.di.component.ErrorLabelViewModelSubComponent
    public final ErrorLabelViewModel getErrorLabelViewModel() {
        j jVar = this.f4098a;
        TextLabelStyle provideErrorLabelStyle = jVar.f4065a.provideErrorLabelStyle(jVar.f4067b);
        AbstractC2763s0.delta(provideErrorLabelStyle);
        return new ErrorLabelViewModel(provideErrorLabelStyle, new TextLabelStyleToViewStyleMapper(), new TextLabelStyleToStateMapper(), (PaymentStateManager) this.f4098a.f4045F.get(), (ResourceProvider) this.f4098a.A.get(), this.f4098a.f4079i);
    }
}
