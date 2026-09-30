package com.checkout.components.card.di.component;

import android.content.Context;
import com.checkout.components.card.di.module.CardMetaDataNetworkModule;
import com.checkout.components.card.di.module.CardMetaDataNetworkModule_ProvideCardMetaDataDetailsMapperFactory;
import com.checkout.components.card.di.module.CardMetaDataNetworkModule_ProvideCardMetaDataRepositoryFactory;
import com.checkout.components.card.di.module.ComponentStyleModule;
import com.checkout.components.card.di.module.ComponentStyleModule_ProvideCVVStyleFactory;
import com.checkout.components.card.di.module.ComponentStyleModule_ProvideCardHolderNameStyleFactory;
import com.checkout.components.card.di.module.ComponentStyleModule_ProvideCardNumberStyleFactory;
import com.checkout.components.card.di.module.ComponentStyleModule_ProvideExpiryDateStyleFactory;
import com.checkout.components.card.di.module.NetworkModule;
import com.checkout.components.card.di.module.NetworkModule_CagNetworkApiClientImplFactory;
import com.checkout.components.card.di.module.NetworkModule_ProvideMoshiFactory;
import com.checkout.components.card.di.module.NetworkModule_ProvideNetworkApiClientImplFactory;
import com.checkout.components.card.di.module.NetworkModule_ProvideOkHttpClientFactory;
import com.checkout.components.card.di.module.PaymentModule;
import com.checkout.components.card.di.module.PaymentModule_PaymentStateManagerFactory;
import com.checkout.components.card.di.module.StyleMapperModule;
import com.checkout.components.card.di.module.StyleMapperModule_ProvideContainerStyleToModifierMapperFactory;
import com.checkout.components.card.di.module.StyleMapperModule_ProvideImageStyleToComposableImageMapperFactory;
import com.checkout.components.card.di.module.StyleMapperModule_ProvideInputComponentStyleMapperFactory;
import com.checkout.components.card.di.module.StyleMapperModule_ProvideInputComponentStyleToStateMapperFactory;
import com.checkout.components.card.di.module.StyleMapperModule_ProvideInputFieldStyleToStateMapperFactory;
import com.checkout.components.card.di.module.StyleMapperModule_ProvideInputFieldStyleToViewStyleMapperFactory;
import com.checkout.components.card.di.module.StyleMapperModule_ProvideTextLabelStyleToStateMapperFactory;
import com.checkout.components.card.di.module.StyleMapperModule_ProvideTextLabelStyleToViewStyleMapperFactory;
import com.checkout.components.card.di.module.TokenNetworkModule;
import com.checkout.components.card.di.module.TokenNetworkModule_ProvideTokenDetailsResponseToTokenDetailsFactory;
import com.checkout.components.card.di.module.TokenNetworkModule_ProvideTokenRepositoryFactory;
import com.checkout.components.card.di.module.ValidationModule;
import com.checkout.components.card.di.module.ValidationModule_ProvideCardValidatorFactory;
import com.checkout.components.card.di.module.ValidationModule_ProvideResourceProviderFactory;
import com.checkout.components.card.di.module.ValidationModule_ProvideSchemeChoiceUiVisibilityUseCaseFactory;
import com.checkout.components.card.operations.PaymentOperationManager;
import com.checkout.components.card.operations.network.repository.CardMetaDataRepository;
import com.checkout.components.card.operations.validator.CardTypeValidator_Factory;
import com.checkout.components.card.ui.component.address.AddressViewModelFactory;
import com.checkout.components.card.ui.component.base.InputComponentViewModelFactory;
import com.checkout.components.card.ui.component.cardholdername.CardHolderNameViewModel_Factory;
import com.checkout.components.card.ui.component.cardnumber.CardNumberViewModel_Factory;
import com.checkout.components.card.ui.component.cvv.CVVViewModel_Factory;
import com.checkout.components.card.ui.component.errorlabel.ErrorLabelViewModel;
import com.checkout.components.card.ui.component.expirydate.ExpiryDateViewModel_Factory;
import com.checkout.components.card.ui.component.paybutton.PayButtonViewModel;
import com.checkout.components.card.ui.component.savecard.SaveCardContainerViewModelFactory;
import com.checkout.components.card.ui.manager.PaymentStateManager;
import com.checkout.components.interfaces.component.AddressConfiguration;
import com.checkout.components.interfaces.component.CardConfiguration;
import com.checkout.components.interfaces.component.PaymentButtonAction;
import com.checkout.components.interfaces.insight.LogDetails;
import com.checkout.components.interfaces.insight.Logger;
import com.checkout.components.interfaces.uicustomisation.designtoken.DesignTokens;
import com.checkout.components.rememberme.CheckoutRememberMe;
import com.checkout.components.ui.data.DisplayCvvRepository;
import com.checkout.components.ui.data.SupportedSchemesRepository;
import com.checkout.components.ui.data.SupportedTypesRepository;
import dagger.internal.InstanceFactory;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import yf.L;

/* loaded from: classes3.dex */
public final class j implements CardDIComponent {
    public final dagger.internal.d A;
    public final dagger.internal.d B;
    public final dagger.internal.b C;

    /* renamed from: D, reason: collision with root package name */
    public final dagger.internal.b f4043D;

    /* renamed from: E, reason: collision with root package name */
    public final dagger.internal.b f4044E;

    /* renamed from: F, reason: collision with root package name */
    public final dagger.internal.d f4045F;

    /* renamed from: G, reason: collision with root package name */
    public final dagger.internal.b f4046G;

    /* renamed from: H, reason: collision with root package name */
    public final ComponentStyleModule_ProvideCardNumberStyleFactory f4047H;

    /* renamed from: I, reason: collision with root package name */
    public final dagger.internal.d f4048I;

    /* renamed from: J, reason: collision with root package name */
    public final dagger.internal.d f4049J;

    /* renamed from: K, reason: collision with root package name */
    public final dagger.internal.b f4050K;

    /* renamed from: L, reason: collision with root package name */
    public final dagger.internal.b f4051L;

    /* renamed from: M, reason: collision with root package name */
    public final dagger.internal.d f4052M;

    /* renamed from: N, reason: collision with root package name */
    public final CardMetaDataNetworkModule_ProvideCardMetaDataDetailsMapperFactory f4053N;

    /* renamed from: O, reason: collision with root package name */
    public final dagger.internal.b f4054O;

    /* renamed from: P, reason: collision with root package name */
    public final dagger.internal.d f4055P;
    public final dagger.internal.d Q;

    /* renamed from: R, reason: collision with root package name */
    public final dagger.internal.b f4056R;

    /* renamed from: S, reason: collision with root package name */
    public final dagger.internal.b f4057S;

    /* renamed from: T, reason: collision with root package name */
    public final dagger.internal.b f4058T;

    /* renamed from: U, reason: collision with root package name */
    public final CardNumberViewModel_Factory f4059U;

    /* renamed from: V, reason: collision with root package name */
    public final CVVViewModel_Factory f4060V;

    /* renamed from: W, reason: collision with root package name */
    public final ExpiryDateViewModel_Factory f4061W;

    /* renamed from: X, reason: collision with root package name */
    public final CardHolderNameViewModel_Factory f4062X;

    /* renamed from: Y, reason: collision with root package name */
    public final f f4063Y;

    /* renamed from: Z, reason: collision with root package name */
    public final g f4064Z;

    /* renamed from: a, reason: collision with root package name */
    public final ComponentStyleModule f4065a;

    /* renamed from: a0, reason: collision with root package name */
    public final h f4066a0;

    /* renamed from: b, reason: collision with root package name */
    public final DesignTokens f4067b;

    /* renamed from: b0, reason: collision with root package name */
    public final i f4068b0;

    /* renamed from: c, reason: collision with root package name */
    public final StyleMapperModule f4069c;

    /* renamed from: c0, reason: collision with root package name */
    public final dagger.internal.b f4070c0;

    /* renamed from: d, reason: collision with root package name */
    public final PaymentButtonAction f4071d;

    /* renamed from: d0, reason: collision with root package name */
    public final dagger.internal.d f4072d0;
    public final Function0 e;

    /* renamed from: e0, reason: collision with root package name */
    public final dagger.internal.b f4073e0;

    /* renamed from: f, reason: collision with root package name */
    public final Function1 f4074f;

    /* renamed from: f0, reason: collision with root package name */
    public final dagger.internal.b f4075f0;

    /* renamed from: g, reason: collision with root package name */
    public final Function1 f4076g;

    /* renamed from: g0, reason: collision with root package name */
    public final dagger.internal.d f4077g0;

    /* renamed from: h, reason: collision with root package name */
    public final LogDetails f4078h;

    /* renamed from: i, reason: collision with root package name */
    public final CheckoutRememberMe f4079i;

    /* renamed from: j, reason: collision with root package name */
    public final Function0 f4080j;

    /* renamed from: k, reason: collision with root package name */
    public final Function1 f4081k;

    /* renamed from: l, reason: collision with root package name */
    public final Locale f4082l;

    /* renamed from: m, reason: collision with root package name */
    public final SupportedTypesRepository f4083m;

    /* renamed from: n, reason: collision with root package name */
    public final CardConfiguration f4084n;

    /* renamed from: o, reason: collision with root package name */
    public final AddressConfiguration f4085o;

    /* renamed from: p, reason: collision with root package name */
    public final Map f4086p;

    /* renamed from: q, reason: collision with root package name */
    public final j f4087q = this;

    /* renamed from: r, reason: collision with root package name */
    public final d f4088r = new d(this);

    /* renamed from: s, reason: collision with root package name */
    public final e f4089s = new e(this);

    /* renamed from: t, reason: collision with root package name */
    public final StyleMapperModule_ProvideTextLabelStyleToViewStyleMapperFactory f4090t;

    /* renamed from: u, reason: collision with root package name */
    public final StyleMapperModule_ProvideContainerStyleToModifierMapperFactory f4091u;

    /* renamed from: v, reason: collision with root package name */
    public final StyleMapperModule_ProvideInputComponentStyleMapperFactory f4092v;

    /* renamed from: w, reason: collision with root package name */
    public final StyleMapperModule_ProvideTextLabelStyleToStateMapperFactory f4093w;

    /* renamed from: x, reason: collision with root package name */
    public final StyleMapperModule_ProvideInputComponentStyleToStateMapperFactory f4094x;

    /* renamed from: y, reason: collision with root package name */
    public final dagger.internal.b f4095y;

    /* renamed from: z, reason: collision with root package name */
    public final dagger.internal.b f4096z;

    public j(PaymentModule paymentModule, TokenNetworkModule tokenNetworkModule, StyleMapperModule styleMapperModule, ValidationModule validationModule, ComponentStyleModule componentStyleModule, NetworkModule networkModule, CardMetaDataNetworkModule cardMetaDataNetworkModule, SupportedTypesRepository supportedTypesRepository, SupportedSchemesRepository supportedSchemesRepository, DisplayCvvRepository displayCvvRepository, String str, String str2, String str3, String str4, Context context, Map map, Xd.l lVar, L l10, DesignTokens designTokens, LogDetails logDetails, Logger logger, Locale locale, CardConfiguration cardConfiguration, PaymentButtonAction paymentButtonAction, Xd.l lVar2, Function1 function1, Function0 function0, Function1 function12, Function0 function02, Function1 function13, AddressConfiguration addressConfiguration, CheckoutRememberMe checkoutRememberMe) {
        this.f4065a = componentStyleModule;
        this.f4067b = designTokens;
        this.f4069c = styleMapperModule;
        this.f4071d = paymentButtonAction;
        this.e = function02;
        this.f4074f = function13;
        this.f4076g = function12;
        this.f4078h = logDetails;
        this.f4079i = checkoutRememberMe;
        this.f4080j = function0;
        this.f4081k = function1;
        this.f4082l = locale;
        this.f4083m = supportedTypesRepository;
        this.f4084n = cardConfiguration;
        this.f4085o = addressConfiguration;
        this.f4086p = map;
        StyleMapperModule_ProvideTextLabelStyleToViewStyleMapperFactory styleMapperModule_ProvideTextLabelStyleToViewStyleMapperFactory = new StyleMapperModule_ProvideTextLabelStyleToViewStyleMapperFactory(styleMapperModule);
        this.f4090t = styleMapperModule_ProvideTextLabelStyleToViewStyleMapperFactory;
        StyleMapperModule_ProvideInputFieldStyleToViewStyleMapperFactory styleMapperModule_ProvideInputFieldStyleToViewStyleMapperFactory = new StyleMapperModule_ProvideInputFieldStyleToViewStyleMapperFactory(styleMapperModule, styleMapperModule_ProvideTextLabelStyleToViewStyleMapperFactory);
        StyleMapperModule_ProvideContainerStyleToModifierMapperFactory styleMapperModule_ProvideContainerStyleToModifierMapperFactory = new StyleMapperModule_ProvideContainerStyleToModifierMapperFactory(styleMapperModule);
        this.f4091u = styleMapperModule_ProvideContainerStyleToModifierMapperFactory;
        StyleMapperModule_ProvideInputComponentStyleMapperFactory styleMapperModule_ProvideInputComponentStyleMapperFactory = new StyleMapperModule_ProvideInputComponentStyleMapperFactory(styleMapperModule, styleMapperModule_ProvideTextLabelStyleToViewStyleMapperFactory, styleMapperModule_ProvideInputFieldStyleToViewStyleMapperFactory, styleMapperModule_ProvideContainerStyleToModifierMapperFactory);
        this.f4092v = styleMapperModule_ProvideInputComponentStyleMapperFactory;
        StyleMapperModule_ProvideTextLabelStyleToStateMapperFactory styleMapperModule_ProvideTextLabelStyleToStateMapperFactory = new StyleMapperModule_ProvideTextLabelStyleToStateMapperFactory(styleMapperModule);
        this.f4093w = styleMapperModule_ProvideTextLabelStyleToStateMapperFactory;
        StyleMapperModule_ProvideInputComponentStyleToStateMapperFactory styleMapperModule_ProvideInputComponentStyleToStateMapperFactory = new StyleMapperModule_ProvideInputComponentStyleToStateMapperFactory(styleMapperModule, styleMapperModule_ProvideTextLabelStyleToStateMapperFactory, new StyleMapperModule_ProvideInputFieldStyleToStateMapperFactory(styleMapperModule, new StyleMapperModule_ProvideImageStyleToComposableImageMapperFactory(styleMapperModule)));
        this.f4094x = styleMapperModule_ProvideInputComponentStyleToStateMapperFactory;
        InstanceFactory alpha = InstanceFactory.alpha(supportedSchemesRepository);
        this.f4095y = alpha;
        InstanceFactory alpha2 = InstanceFactory.alpha(context);
        this.f4096z = alpha2;
        dagger.internal.d bravo = dagger.internal.a.bravo(new ValidationModule_ProvideResourceProviderFactory(validationModule, alpha2, InstanceFactory.bravo(map)));
        this.A = bravo;
        dagger.internal.d bravo2 = dagger.internal.a.bravo(new ValidationModule_ProvideCardValidatorFactory(validationModule, alpha, bravo));
        this.B = bravo2;
        InstanceFactory alpha3 = InstanceFactory.alpha(displayCvvRepository);
        this.C = alpha3;
        InstanceFactory alpha4 = InstanceFactory.alpha(l10);
        this.f4043D = alpha4;
        InstanceFactory bravo3 = InstanceFactory.bravo(cardConfiguration);
        this.f4044E = bravo3;
        dagger.internal.d bravo4 = dagger.internal.a.bravo(new PaymentModule_PaymentStateManagerFactory(paymentModule, alpha, alpha3, alpha4, bravo3));
        this.f4045F = bravo4;
        InstanceFactory bravo5 = InstanceFactory.bravo(designTokens);
        this.f4046G = bravo5;
        ComponentStyleModule_ProvideCardNumberStyleFactory componentStyleModule_ProvideCardNumberStyleFactory = new ComponentStyleModule_ProvideCardNumberStyleFactory(componentStyleModule, bravo5, bravo);
        this.f4047H = componentStyleModule_ProvideCardNumberStyleFactory;
        dagger.internal.d bravo6 = dagger.internal.a.bravo(new NetworkModule_ProvideOkHttpClientFactory(networkModule, InstanceFactory.alpha(str4)));
        this.f4048I = bravo6;
        dagger.internal.d bravo7 = dagger.internal.a.bravo(new NetworkModule_ProvideMoshiFactory(networkModule));
        this.f4049J = bravo7;
        InstanceFactory alpha5 = InstanceFactory.alpha(str);
        this.f4050K = alpha5;
        InstanceFactory alpha6 = InstanceFactory.alpha(str3);
        this.f4051L = alpha6;
        dagger.internal.d bravo8 = dagger.internal.a.bravo(new NetworkModule_ProvideNetworkApiClientImplFactory(networkModule, bravo6, bravo7, alpha5, alpha6));
        this.f4052M = bravo8;
        CardMetaDataNetworkModule_ProvideCardMetaDataDetailsMapperFactory cardMetaDataNetworkModule_ProvideCardMetaDataDetailsMapperFactory = new CardMetaDataNetworkModule_ProvideCardMetaDataDetailsMapperFactory(cardMetaDataNetworkModule);
        this.f4053N = cardMetaDataNetworkModule_ProvideCardMetaDataDetailsMapperFactory;
        InstanceFactory alpha7 = InstanceFactory.alpha(logger);
        this.f4054O = alpha7;
        dagger.internal.d bravo9 = dagger.internal.a.bravo(new CardMetaDataNetworkModule_ProvideCardMetaDataRepositoryFactory(cardMetaDataNetworkModule, bravo8, cardMetaDataNetworkModule_ProvideCardMetaDataDetailsMapperFactory, alpha7));
        this.f4055P = bravo9;
        dagger.internal.d bravo10 = dagger.internal.a.bravo(new ValidationModule_ProvideSchemeChoiceUiVisibilityUseCaseFactory(validationModule, alpha));
        this.Q = bravo10;
        InstanceFactory alpha8 = InstanceFactory.alpha(function0);
        this.f4056R = alpha8;
        InstanceFactory bravo11 = InstanceFactory.bravo(function1);
        this.f4057S = bravo11;
        InstanceFactory alpha9 = InstanceFactory.alpha(locale);
        this.f4058T = alpha9;
        this.f4059U = new CardNumberViewModel_Factory(styleMapperModule_ProvideInputComponentStyleMapperFactory, styleMapperModule_ProvideInputComponentStyleToStateMapperFactory, styleMapperModule_ProvideTextLabelStyleToViewStyleMapperFactory, styleMapperModule_ProvideTextLabelStyleToStateMapperFactory, styleMapperModule_ProvideContainerStyleToModifierMapperFactory, bravo2, bravo4, componentStyleModule_ProvideCardNumberStyleFactory, bravo, bravo9, bravo10, bravo5, alpha8, bravo11, alpha9, new CardTypeValidator_Factory(InstanceFactory.alpha(supportedTypesRepository), bravo4, bravo));
        this.f4060V = new CVVViewModel_Factory(styleMapperModule_ProvideInputComponentStyleMapperFactory, styleMapperModule_ProvideInputComponentStyleToStateMapperFactory, bravo2, bravo4, new ComponentStyleModule_ProvideCVVStyleFactory(componentStyleModule, bravo5, bravo), bravo, alpha8);
        this.f4061W = new ExpiryDateViewModel_Factory(styleMapperModule_ProvideInputComponentStyleMapperFactory, styleMapperModule_ProvideInputComponentStyleToStateMapperFactory, bravo2, bravo4, new ComponentStyleModule_ProvideExpiryDateStyleFactory(componentStyleModule, bravo5, bravo, alpha9), bravo, alpha8);
        this.f4062X = new CardHolderNameViewModel_Factory(styleMapperModule_ProvideInputComponentStyleMapperFactory, styleMapperModule_ProvideInputComponentStyleToStateMapperFactory, bravo4, new ComponentStyleModule_ProvideCardHolderNameStyleFactory(componentStyleModule, bravo5, bravo, bravo3), bravo, alpha8);
        this.f4063Y = new f(this);
        this.f4064Z = new g(this);
        this.f4066a0 = new h(this);
        this.f4068b0 = new i(this);
        InstanceFactory alpha10 = InstanceFactory.alpha(logDetails);
        this.f4070c0 = alpha10;
        dagger.internal.d bravo12 = dagger.internal.a.bravo(new NetworkModule_CagNetworkApiClientImplFactory(networkModule, bravo6, bravo7, InstanceFactory.alpha(str2), alpha6));
        this.f4072d0 = bravo12;
        InstanceFactory alpha11 = InstanceFactory.alpha(lVar);
        this.f4073e0 = alpha11;
        InstanceFactory bravo13 = InstanceFactory.bravo(function12);
        this.f4075f0 = bravo13;
        this.f4077g0 = dagger.internal.a.bravo(new TokenNetworkModule_ProvideTokenRepositoryFactory(tokenNetworkModule, alpha10, bravo8, bravo12, alpha7, alpha11, bravo13, InstanceFactory.bravo(lVar2), new TokenNetworkModule_ProvideTokenDetailsResponseToTokenDetailsFactory(tokenNetworkModule), bravo4));
    }

    @Override // com.checkout.components.card.di.component.CardDIComponent
    public final CardMetaDataRepository cardMetaDataRepository() {
        return (CardMetaDataRepository) this.f4055P.get();
    }

    @Override // com.checkout.components.card.di.component.CardDIComponent
    public final void inject(PayButtonViewModel.PayButtonFactory payButtonFactory) {
        payButtonFactory.subComponentProvider = this.f4088r;
    }

    @Override // com.checkout.components.card.di.component.CardDIComponent
    public final PaymentStateManager paymentStateManager() {
        return (PaymentStateManager) this.f4045F.get();
    }

    @Override // com.checkout.components.card.di.component.CardDIComponent
    public final void inject(ErrorLabelViewModel.ErrorLabelViewModelFactory errorLabelViewModelFactory) {
        errorLabelViewModelFactory.subComponentProvider = this.f4089s;
    }

    @Override // com.checkout.components.card.di.component.CardDIComponent
    public final void inject(InputComponentViewModelFactory inputComponentViewModelFactory) {
        inputComponentViewModelFactory.cardNumberViewModelProvider = this.f4059U;
        inputComponentViewModelFactory.cvvViewModelProvider = this.f4060V;
        inputComponentViewModelFactory.expiryDateViewModelProvider = this.f4061W;
        inputComponentViewModelFactory.cardHolderNameViewModelProvider = this.f4062X;
        inputComponentViewModelFactory.subComponentProvider = this.f4063Y;
    }

    @Override // com.checkout.components.card.di.component.CardDIComponent
    public final void inject(PaymentOperationManager.PaymentOperationManagerFactory paymentOperationManagerFactory) {
        paymentOperationManagerFactory.subComponentProvider = this.f4064Z;
    }

    @Override // com.checkout.components.card.di.component.CardDIComponent
    public final void inject(AddressViewModelFactory addressViewModelFactory) {
        addressViewModelFactory.subComponentProvider = this.f4066a0;
    }

    @Override // com.checkout.components.card.di.component.CardDIComponent
    public final void inject(SaveCardContainerViewModelFactory saveCardContainerViewModelFactory) {
        saveCardContainerViewModelFactory.subComponentProvider = this.f4068b0;
    }
}
