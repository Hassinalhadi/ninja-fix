package com.checkout.components.card.di.component;

import com.checkout.components.card.operations.tokenisation.repository.TokenRepository;
import com.checkout.components.card.ui.component.paybutton.PayButtonViewModel;
import com.checkout.components.card.ui.manager.PaymentStateManager;
import com.checkout.components.interfaces.mapper.Mapper;
import com.checkout.components.interfaces.ui.ResourceProvider;
import com.checkout.components.ui.mapper.ButtonStyleToInternalStateMapper;
import com.checkout.components.ui.mapper.ContainerStyleToModifierMapper;
import com.checkout.components.ui.mapper.TextLabelStyleToStateMapper;
import com.checkout.components.ui.mapper.TextLabelStyleToViewStyleMapper;
import com.checkout.components.ui.model.style.base.ButtonStyle;
import com.checkout.components.ui.model.style.view.InternalButtonViewStyle;
import s6.AbstractC2763s0;

/* loaded from: classes3.dex */
public final class p implements PayButtonViewModelSubComponent {

    /* renamed from: a, reason: collision with root package name */
    public final j f4102a;

    public p(j jVar) {
        this.f4102a = jVar;
    }

    @Override // com.checkout.components.card.di.component.PayButtonViewModelSubComponent
    public final PayButtonViewModel getPayButtonViewModel() {
        j jVar = this.f4102a;
        ButtonStyle providePayButtonStyle = jVar.f4065a.providePayButtonStyle(jVar.f4067b, (ResourceProvider) jVar.A.get());
        AbstractC2763s0.delta(providePayButtonStyle);
        Mapper<ButtonStyle, InternalButtonViewStyle> provideButtonStyleMapper = this.f4102a.f4069c.provideButtonStyleMapper(new TextLabelStyleToViewStyleMapper(), new ContainerStyleToModifierMapper());
        AbstractC2763s0.delta(provideButtonStyleMapper);
        ButtonStyleToInternalStateMapper buttonStyleToInternalStateMapper = new ButtonStyleToInternalStateMapper(new TextLabelStyleToStateMapper());
        PaymentStateManager paymentStateManager = (PaymentStateManager) this.f4102a.f4045F.get();
        TokenRepository tokenRepository = (TokenRepository) this.f4102a.f4077g0.get();
        ResourceProvider resourceProvider = (ResourceProvider) this.f4102a.A.get();
        j jVar2 = this.f4102a;
        return new PayButtonViewModel(providePayButtonStyle, provideButtonStyleMapper, buttonStyleToInternalStateMapper, paymentStateManager, tokenRepository, resourceProvider, jVar2.f4071d, jVar2.e, jVar2.f4074f, jVar2.f4076g, jVar2.f4078h);
    }
}
