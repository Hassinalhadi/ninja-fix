package com.checkout.components.card.di.component;

import com.checkout.components.card.di.module.StyleMapperModule;
import com.checkout.components.card.di.module.StyleMapperModule_ProvideContainerStyleToModifierMapperFactory;
import com.checkout.components.card.di.module.StyleMapperModule_ProvideImageStyleToComposableImageMapperFactory;
import com.checkout.components.card.di.module.StyleMapperModule_ProvideInputFieldStyleToStateMapperFactory;
import com.checkout.components.card.di.module.StyleMapperModule_ProvideInputFieldStyleToViewStyleMapperFactory;
import com.checkout.components.card.di.module.StyleMapperModule_ProvideTextLabelStyleToStateMapperFactory;
import com.checkout.components.card.di.module.StyleMapperModule_ProvideTextLabelStyleToViewStyleMapperFactory;
import com.checkout.components.card.model.CardNumberComponentStyle;
import com.checkout.components.card.operations.api.CardValidator;
import com.checkout.components.card.operations.network.repository.CardMetaDataRepository;
import com.checkout.components.card.operations.validator.CardTypeValidator;
import com.checkout.components.card.ui.component.base.InputComponentViewModel;
import com.checkout.components.card.ui.component.cardholdername.CardHolderNameViewModel;
import com.checkout.components.card.ui.component.cardnumber.CardNumberViewModel;
import com.checkout.components.card.ui.component.cvv.CVVViewModel;
import com.checkout.components.card.ui.component.expirydate.ExpiryDateViewModel;
import com.checkout.components.card.ui.manager.PaymentStateManager;
import com.checkout.components.card.ui.style.DefaultInputComponentStyle;
import com.checkout.components.interfaces.mapper.Mapper;
import com.checkout.components.interfaces.ui.ResourceProvider;
import com.checkout.components.interfaces.uicustomisation.designtoken.DesignTokens;
import com.checkout.components.interfaces.usecase.UseCase;
import com.checkout.components.ui.mapper.ContainerStyleToModifierMapper;
import com.checkout.components.ui.mapper.TextLabelStyleToStateMapper;
import com.checkout.components.ui.mapper.TextLabelStyleToViewStyleMapper;
import com.checkout.components.ui.model.state.InputComponentState;
import com.checkout.components.ui.model.state.TextLabelState;
import com.checkout.components.ui.model.style.base.InputComponentStyle;
import com.checkout.components.ui.model.style.base.TextLabelStyle;
import com.checkout.components.ui.model.style.view.InputComponentViewStyle;
import com.checkout.components.ui.model.style.view.TextLabelViewStyle;
import kotlin.jvm.internal.Intrinsics;
import s6.AbstractC2763s0;

/* loaded from: classes3.dex */
public final class n implements InputComponentViewModelSubComponent {

    /* renamed from: a, reason: collision with root package name */
    public final j f4100a;

    public n(j jVar) {
        this.f4100a = jVar;
    }

    @Override // com.checkout.components.card.di.component.InputComponentViewModelSubComponent
    public final InputComponentViewModel getCardHolderNameViewModel() {
        j jVar = this.f4100a;
        StyleMapperModule styleMapperModule = jVar.f4069c;
        Mapper<TextLabelStyle, TextLabelViewStyle> provideTextLabelStyleToViewStyleMapper = StyleMapperModule_ProvideTextLabelStyleToViewStyleMapperFactory.provideTextLabelStyleToViewStyleMapper(styleMapperModule);
        StyleMapperModule styleMapperModule2 = jVar.f4069c;
        Mapper<InputComponentStyle, InputComponentViewStyle> provideInputComponentStyleMapper = styleMapperModule.provideInputComponentStyleMapper(provideTextLabelStyleToViewStyleMapper, StyleMapperModule_ProvideInputFieldStyleToViewStyleMapperFactory.provideInputFieldStyleToViewStyleMapper(styleMapperModule2, StyleMapperModule_ProvideTextLabelStyleToViewStyleMapperFactory.provideTextLabelStyleToViewStyleMapper(styleMapperModule2)), StyleMapperModule_ProvideContainerStyleToModifierMapperFactory.provideContainerStyleToModifierMapper(jVar.f4069c));
        AbstractC2763s0.delta(provideInputComponentStyleMapper);
        StyleMapperModule styleMapperModule3 = jVar.f4069c;
        Mapper<TextLabelStyle, TextLabelState> provideTextLabelStyleToStateMapper = StyleMapperModule_ProvideTextLabelStyleToStateMapperFactory.provideTextLabelStyleToStateMapper(styleMapperModule3);
        StyleMapperModule styleMapperModule4 = jVar.f4069c;
        Mapper<InputComponentStyle, InputComponentState> provideInputComponentStyleToStateMapper = styleMapperModule3.provideInputComponentStyleToStateMapper(provideTextLabelStyleToStateMapper, StyleMapperModule_ProvideInputFieldStyleToStateMapperFactory.provideInputFieldStyleToStateMapper(styleMapperModule4, StyleMapperModule_ProvideImageStyleToComposableImageMapperFactory.provideImageStyleToComposableImageMapper(styleMapperModule4)));
        AbstractC2763s0.delta(provideInputComponentStyleToStateMapper);
        PaymentStateManager paymentStateManager = (PaymentStateManager) jVar.f4045F.get();
        InputComponentStyle provideCardHolderNameStyle = jVar.f4065a.provideCardHolderNameStyle(jVar.f4067b, (ResourceProvider) jVar.A.get(), jVar.f4084n);
        AbstractC2763s0.delta(provideCardHolderNameStyle);
        return new CardHolderNameViewModel(provideInputComponentStyleMapper, provideInputComponentStyleToStateMapper, paymentStateManager, provideCardHolderNameStyle, (ResourceProvider) jVar.A.get(), jVar.f4080j);
    }

    @Override // com.checkout.components.card.di.component.InputComponentViewModelSubComponent
    public final InputComponentViewModel getCardNumberViewModel() {
        j jVar = this.f4100a;
        StyleMapperModule styleMapperModule = jVar.f4069c;
        Mapper<TextLabelStyle, TextLabelViewStyle> provideTextLabelStyleToViewStyleMapper = StyleMapperModule_ProvideTextLabelStyleToViewStyleMapperFactory.provideTextLabelStyleToViewStyleMapper(styleMapperModule);
        StyleMapperModule styleMapperModule2 = jVar.f4069c;
        Mapper<InputComponentStyle, InputComponentViewStyle> provideInputComponentStyleMapper = styleMapperModule.provideInputComponentStyleMapper(provideTextLabelStyleToViewStyleMapper, StyleMapperModule_ProvideInputFieldStyleToViewStyleMapperFactory.provideInputFieldStyleToViewStyleMapper(styleMapperModule2, StyleMapperModule_ProvideTextLabelStyleToViewStyleMapperFactory.provideTextLabelStyleToViewStyleMapper(styleMapperModule2)), StyleMapperModule_ProvideContainerStyleToModifierMapperFactory.provideContainerStyleToModifierMapper(jVar.f4069c));
        AbstractC2763s0.delta(provideInputComponentStyleMapper);
        StyleMapperModule styleMapperModule3 = jVar.f4069c;
        Mapper<TextLabelStyle, TextLabelState> provideTextLabelStyleToStateMapper = StyleMapperModule_ProvideTextLabelStyleToStateMapperFactory.provideTextLabelStyleToStateMapper(styleMapperModule3);
        StyleMapperModule styleMapperModule4 = jVar.f4069c;
        Mapper<InputComponentStyle, InputComponentState> provideInputComponentStyleToStateMapper = styleMapperModule3.provideInputComponentStyleToStateMapper(provideTextLabelStyleToStateMapper, StyleMapperModule_ProvideInputFieldStyleToStateMapperFactory.provideInputFieldStyleToStateMapper(styleMapperModule4, StyleMapperModule_ProvideImageStyleToComposableImageMapperFactory.provideImageStyleToComposableImageMapper(styleMapperModule4)));
        AbstractC2763s0.delta(provideInputComponentStyleToStateMapper);
        TextLabelStyleToViewStyleMapper textLabelStyleToViewStyleMapper = new TextLabelStyleToViewStyleMapper();
        TextLabelStyleToStateMapper textLabelStyleToStateMapper = new TextLabelStyleToStateMapper();
        ContainerStyleToModifierMapper containerStyleToModifierMapper = new ContainerStyleToModifierMapper();
        CardValidator cardValidator = (CardValidator) jVar.B.get();
        PaymentStateManager paymentStateManager = (PaymentStateManager) jVar.f4045F.get();
        CardNumberComponentStyle provideCardNumberStyle = jVar.f4065a.provideCardNumberStyle(jVar.f4067b, (ResourceProvider) jVar.A.get());
        AbstractC2763s0.delta(provideCardNumberStyle);
        return new CardNumberViewModel(provideInputComponentStyleMapper, provideInputComponentStyleToStateMapper, textLabelStyleToViewStyleMapper, textLabelStyleToStateMapper, containerStyleToModifierMapper, cardValidator, paymentStateManager, provideCardNumberStyle, (ResourceProvider) jVar.A.get(), (CardMetaDataRepository) jVar.f4055P.get(), (UseCase) jVar.Q.get(), jVar.f4067b, jVar.f4080j, jVar.f4081k, jVar.f4082l, new CardTypeValidator(jVar.f4083m, (PaymentStateManager) jVar.f4045F.get(), (ResourceProvider) jVar.A.get()));
    }

    @Override // com.checkout.components.card.di.component.InputComponentViewModelSubComponent
    public final InputComponentViewModel getCvvViewModel() {
        j jVar = this.f4100a;
        StyleMapperModule styleMapperModule = jVar.f4069c;
        Mapper<TextLabelStyle, TextLabelViewStyle> provideTextLabelStyleToViewStyleMapper = StyleMapperModule_ProvideTextLabelStyleToViewStyleMapperFactory.provideTextLabelStyleToViewStyleMapper(styleMapperModule);
        StyleMapperModule styleMapperModule2 = jVar.f4069c;
        Mapper<InputComponentStyle, InputComponentViewStyle> provideInputComponentStyleMapper = styleMapperModule.provideInputComponentStyleMapper(provideTextLabelStyleToViewStyleMapper, StyleMapperModule_ProvideInputFieldStyleToViewStyleMapperFactory.provideInputFieldStyleToViewStyleMapper(styleMapperModule2, StyleMapperModule_ProvideTextLabelStyleToViewStyleMapperFactory.provideTextLabelStyleToViewStyleMapper(styleMapperModule2)), StyleMapperModule_ProvideContainerStyleToModifierMapperFactory.provideContainerStyleToModifierMapper(jVar.f4069c));
        AbstractC2763s0.delta(provideInputComponentStyleMapper);
        StyleMapperModule styleMapperModule3 = jVar.f4069c;
        Mapper<TextLabelStyle, TextLabelState> provideTextLabelStyleToStateMapper = StyleMapperModule_ProvideTextLabelStyleToStateMapperFactory.provideTextLabelStyleToStateMapper(styleMapperModule3);
        StyleMapperModule styleMapperModule4 = jVar.f4069c;
        Mapper<InputComponentStyle, InputComponentState> provideInputComponentStyleToStateMapper = styleMapperModule3.provideInputComponentStyleToStateMapper(provideTextLabelStyleToStateMapper, StyleMapperModule_ProvideInputFieldStyleToStateMapperFactory.provideInputFieldStyleToStateMapper(styleMapperModule4, StyleMapperModule_ProvideImageStyleToComposableImageMapperFactory.provideImageStyleToComposableImageMapper(styleMapperModule4)));
        AbstractC2763s0.delta(provideInputComponentStyleToStateMapper);
        CardValidator cardValidator = (CardValidator) jVar.B.get();
        PaymentStateManager paymentStateManager = (PaymentStateManager) jVar.f4045F.get();
        DesignTokens designTokens = jVar.f4067b;
        ResourceProvider resourceProvider = (ResourceProvider) jVar.A.get();
        Intrinsics.echo(resourceProvider, "resourceProvider");
        InputComponentStyle createCVVStyle = DefaultInputComponentStyle.INSTANCE.createCVVStyle(resourceProvider, designTokens);
        AbstractC2763s0.delta(createCVVStyle);
        return new CVVViewModel(provideInputComponentStyleMapper, provideInputComponentStyleToStateMapper, cardValidator, paymentStateManager, createCVVStyle, (ResourceProvider) jVar.A.get(), jVar.f4080j);
    }

    @Override // com.checkout.components.card.di.component.InputComponentViewModelSubComponent
    public final InputComponentViewModel getExpiryDateViewModel() {
        j jVar = this.f4100a;
        StyleMapperModule styleMapperModule = jVar.f4069c;
        Mapper<TextLabelStyle, TextLabelViewStyle> provideTextLabelStyleToViewStyleMapper = StyleMapperModule_ProvideTextLabelStyleToViewStyleMapperFactory.provideTextLabelStyleToViewStyleMapper(styleMapperModule);
        StyleMapperModule styleMapperModule2 = jVar.f4069c;
        Mapper<InputComponentStyle, InputComponentViewStyle> provideInputComponentStyleMapper = styleMapperModule.provideInputComponentStyleMapper(provideTextLabelStyleToViewStyleMapper, StyleMapperModule_ProvideInputFieldStyleToViewStyleMapperFactory.provideInputFieldStyleToViewStyleMapper(styleMapperModule2, StyleMapperModule_ProvideTextLabelStyleToViewStyleMapperFactory.provideTextLabelStyleToViewStyleMapper(styleMapperModule2)), StyleMapperModule_ProvideContainerStyleToModifierMapperFactory.provideContainerStyleToModifierMapper(jVar.f4069c));
        AbstractC2763s0.delta(provideInputComponentStyleMapper);
        StyleMapperModule styleMapperModule3 = jVar.f4069c;
        Mapper<TextLabelStyle, TextLabelState> provideTextLabelStyleToStateMapper = StyleMapperModule_ProvideTextLabelStyleToStateMapperFactory.provideTextLabelStyleToStateMapper(styleMapperModule3);
        StyleMapperModule styleMapperModule4 = jVar.f4069c;
        Mapper<InputComponentStyle, InputComponentState> provideInputComponentStyleToStateMapper = styleMapperModule3.provideInputComponentStyleToStateMapper(provideTextLabelStyleToStateMapper, StyleMapperModule_ProvideInputFieldStyleToStateMapperFactory.provideInputFieldStyleToStateMapper(styleMapperModule4, StyleMapperModule_ProvideImageStyleToComposableImageMapperFactory.provideImageStyleToComposableImageMapper(styleMapperModule4)));
        AbstractC2763s0.delta(provideInputComponentStyleToStateMapper);
        CardValidator cardValidator = (CardValidator) jVar.B.get();
        PaymentStateManager paymentStateManager = (PaymentStateManager) jVar.f4045F.get();
        InputComponentStyle provideExpiryDateStyle = jVar.f4065a.provideExpiryDateStyle(jVar.f4067b, (ResourceProvider) jVar.A.get(), jVar.f4082l);
        AbstractC2763s0.delta(provideExpiryDateStyle);
        return new ExpiryDateViewModel(provideInputComponentStyleMapper, provideInputComponentStyleToStateMapper, cardValidator, paymentStateManager, provideExpiryDateStyle, (ResourceProvider) jVar.A.get(), jVar.f4080j);
    }
}
