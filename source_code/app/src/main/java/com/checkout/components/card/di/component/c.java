package com.checkout.components.card.di.component;

import android.content.Context;
import com.checkout.components.card.di.component.CardDIComponent;
import com.checkout.components.card.di.module.CardMetaDataNetworkModule;
import com.checkout.components.card.di.module.ComponentStyleModule;
import com.checkout.components.card.di.module.NetworkModule;
import com.checkout.components.card.di.module.PaymentModule;
import com.checkout.components.card.di.module.StyleMapperModule;
import com.checkout.components.card.di.module.TokenNetworkModule;
import com.checkout.components.card.di.module.ValidationModule;
import com.checkout.components.interfaces.Environment;
import com.checkout.components.interfaces.component.AddressConfiguration;
import com.checkout.components.interfaces.component.CardConfiguration;
import com.checkout.components.interfaces.component.PaymentButtonAction;
import com.checkout.components.interfaces.component.RememberMeConfiguration;
import com.checkout.components.interfaces.insight.LogDetails;
import com.checkout.components.interfaces.insight.Logger;
import com.checkout.components.interfaces.uicustomisation.designtoken.DesignTokens;
import com.checkout.components.rememberme.CheckoutRememberMe;
import com.checkout.components.ui.data.DisplayCvvRepository;
import com.checkout.components.ui.data.SupportedSchemesRepository;
import com.checkout.components.ui.data.SupportedTypesRepository;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import s6.AbstractC2763s0;
import yf.L;

/* loaded from: classes3.dex */
public final class c implements CardDIComponent.Builder {

    /* renamed from: a, reason: collision with root package name */
    public SupportedTypesRepository f4012a;

    /* renamed from: b, reason: collision with root package name */
    public SupportedSchemesRepository f4013b;

    /* renamed from: c, reason: collision with root package name */
    public DisplayCvvRepository f4014c;

    /* renamed from: d, reason: collision with root package name */
    public String f4015d;
    public String e;

    /* renamed from: f, reason: collision with root package name */
    public String f4016f;

    /* renamed from: g, reason: collision with root package name */
    public String f4017g;

    /* renamed from: h, reason: collision with root package name */
    public Context f4018h;

    /* renamed from: i, reason: collision with root package name */
    public Environment f4019i;

    /* renamed from: j, reason: collision with root package name */
    public Map f4020j;

    /* renamed from: k, reason: collision with root package name */
    public Xd.l f4021k;

    /* renamed from: l, reason: collision with root package name */
    public L f4022l;

    /* renamed from: m, reason: collision with root package name */
    public DesignTokens f4023m;

    /* renamed from: n, reason: collision with root package name */
    public LogDetails f4024n;

    /* renamed from: o, reason: collision with root package name */
    public Logger f4025o;

    /* renamed from: p, reason: collision with root package name */
    public Locale f4026p;

    /* renamed from: q, reason: collision with root package name */
    public CardConfiguration f4027q;

    /* renamed from: r, reason: collision with root package name */
    public PaymentButtonAction f4028r;

    /* renamed from: s, reason: collision with root package name */
    public Xd.l f4029s;

    /* renamed from: t, reason: collision with root package name */
    public Function1 f4030t;

    /* renamed from: u, reason: collision with root package name */
    public Function0 f4031u;

    /* renamed from: v, reason: collision with root package name */
    public Function1 f4032v;

    /* renamed from: w, reason: collision with root package name */
    public Function0 f4033w;

    /* renamed from: x, reason: collision with root package name */
    public Function1 f4034x;

    /* renamed from: y, reason: collision with root package name */
    public AddressConfiguration f4035y;

    /* renamed from: z, reason: collision with root package name */
    public CheckoutRememberMe f4036z;

    @Override // com.checkout.components.card.di.component.CardDIComponent.Builder
    public final CardDIComponent.Builder addressConfiguration(AddressConfiguration addressConfiguration) {
        this.f4035y = addressConfiguration;
        return this;
    }

    @Override // com.checkout.components.card.di.component.CardDIComponent.Builder
    public final CardDIComponent.Builder appearance(DesignTokens designTokens) {
        this.f4023m = designTokens;
        return this;
    }

    @Override // com.checkout.components.card.di.component.CardDIComponent.Builder
    public final CardDIComponent.Builder baseUrl(String str) {
        str.getClass();
        this.f4015d = str;
        return this;
    }

    @Override // com.checkout.components.card.di.component.CardDIComponent.Builder
    public final CardDIComponent build() {
        AbstractC2763s0.bravo(SupportedTypesRepository.class, this.f4012a);
        AbstractC2763s0.bravo(SupportedSchemesRepository.class, this.f4013b);
        AbstractC2763s0.bravo(DisplayCvvRepository.class, this.f4014c);
        AbstractC2763s0.bravo(String.class, this.f4015d);
        AbstractC2763s0.bravo(String.class, this.e);
        AbstractC2763s0.bravo(String.class, this.f4016f);
        AbstractC2763s0.bravo(String.class, this.f4017g);
        AbstractC2763s0.bravo(Context.class, this.f4018h);
        AbstractC2763s0.bravo(Environment.class, this.f4019i);
        AbstractC2763s0.bravo(Xd.l.class, this.f4021k);
        AbstractC2763s0.bravo(L.class, this.f4022l);
        AbstractC2763s0.bravo(LogDetails.class, this.f4024n);
        AbstractC2763s0.bravo(Logger.class, this.f4025o);
        AbstractC2763s0.bravo(Locale.class, this.f4026p);
        AbstractC2763s0.bravo(PaymentButtonAction.class, this.f4028r);
        AbstractC2763s0.bravo(Function0.class, this.f4031u);
        AbstractC2763s0.bravo(Function0.class, this.f4033w);
        return new j(new PaymentModule(), new TokenNetworkModule(), new StyleMapperModule(), new ValidationModule(), new ComponentStyleModule(), new NetworkModule(), new CardMetaDataNetworkModule(), this.f4012a, this.f4013b, this.f4014c, this.f4015d, this.e, this.f4016f, this.f4017g, this.f4018h, this.f4020j, this.f4021k, this.f4022l, this.f4023m, this.f4024n, this.f4025o, this.f4026p, this.f4027q, this.f4028r, this.f4029s, this.f4030t, this.f4031u, this.f4032v, this.f4033w, this.f4034x, this.f4035y, this.f4036z);
    }

    @Override // com.checkout.components.card.di.component.CardDIComponent.Builder
    public final CardDIComponent.Builder cagBaseUrl(String str) {
        str.getClass();
        this.e = str;
        return this;
    }

    @Override // com.checkout.components.card.di.component.CardDIComponent.Builder
    public final CardDIComponent.Builder cardConfiguration(CardConfiguration cardConfiguration) {
        this.f4027q = cardConfiguration;
        return this;
    }

    @Override // com.checkout.components.card.di.component.CardDIComponent.Builder
    public final CardDIComponent.Builder cardMetaDataBaseUrl(String str) {
        str.getClass();
        this.f4016f = str;
        return this;
    }

    @Override // com.checkout.components.card.di.component.CardDIComponent.Builder
    public final CardDIComponent.Builder context(Context context) {
        context.getClass();
        this.f4018h = context;
        return this;
    }

    @Override // com.checkout.components.card.di.component.CardDIComponent.Builder
    public final CardDIComponent.Builder displayCvvRepository(DisplayCvvRepository displayCvvRepository) {
        displayCvvRepository.getClass();
        this.f4014c = displayCvvRepository;
        return this;
    }

    @Override // com.checkout.components.card.di.component.CardDIComponent.Builder
    public final CardDIComponent.Builder environment(Environment environment) {
        environment.getClass();
        this.f4019i = environment;
        return this;
    }

    @Override // com.checkout.components.card.di.component.CardDIComponent.Builder
    public final CardDIComponent.Builder handlePayButtonTap(Function1 function1) {
        this.f4034x = function1;
        return this;
    }

    @Override // com.checkout.components.card.di.component.CardDIComponent.Builder
    public final CardDIComponent.Builder locale(Locale locale) {
        locale.getClass();
        this.f4026p = locale;
        return this;
    }

    @Override // com.checkout.components.card.di.component.CardDIComponent.Builder
    public final CardDIComponent.Builder logDetails(LogDetails logDetails) {
        logDetails.getClass();
        this.f4024n = logDetails;
        return this;
    }

    @Override // com.checkout.components.card.di.component.CardDIComponent.Builder
    public final CardDIComponent.Builder logger(Logger logger) {
        logger.getClass();
        this.f4025o = logger;
        return this;
    }

    @Override // com.checkout.components.card.di.component.CardDIComponent.Builder
    public final CardDIComponent.Builder onButtonClick(Function0 function0) {
        function0.getClass();
        this.f4033w = function0;
        return this;
    }

    @Override // com.checkout.components.card.di.component.CardDIComponent.Builder
    public final CardDIComponent.Builder onCardBinChanged(Function1 function1) {
        this.f4030t = function1;
        return this;
    }

    @Override // com.checkout.components.card.di.component.CardDIComponent.Builder
    public final CardDIComponent.Builder onChange(Function0 function0) {
        function0.getClass();
        this.f4031u = function0;
        return this;
    }

    @Override // com.checkout.components.card.di.component.CardDIComponent.Builder
    public final CardDIComponent.Builder onError(Function1 function1) {
        this.f4032v = function1;
        return this;
    }

    @Override // com.checkout.components.card.di.component.CardDIComponent.Builder
    public final CardDIComponent.Builder onTokenResult(Xd.l lVar) {
        lVar.getClass();
        this.f4021k = lVar;
        return this;
    }

    @Override // com.checkout.components.card.di.component.CardDIComponent.Builder
    public final CardDIComponent.Builder onTokenized(Xd.l lVar) {
        this.f4029s = lVar;
        return this;
    }

    @Override // com.checkout.components.card.di.component.CardDIComponent.Builder
    public final CardDIComponent.Builder paymentButtonAction(PaymentButtonAction paymentButtonAction) {
        paymentButtonAction.getClass();
        this.f4028r = paymentButtonAction;
        return this;
    }

    @Override // com.checkout.components.card.di.component.CardDIComponent.Builder
    public final CardDIComponent.Builder paymentStateFlow(L l10) {
        l10.getClass();
        this.f4022l = l10;
        return this;
    }

    @Override // com.checkout.components.card.di.component.CardDIComponent.Builder
    public final CardDIComponent.Builder publicKey(String str) {
        str.getClass();
        this.f4017g = str;
        return this;
    }

    @Override // com.checkout.components.card.di.component.CardDIComponent.Builder
    public final CardDIComponent.Builder rememberMe(CheckoutRememberMe checkoutRememberMe) {
        this.f4036z = checkoutRememberMe;
        return this;
    }

    @Override // com.checkout.components.card.di.component.CardDIComponent.Builder
    public final CardDIComponent.Builder rememberMeConfiguration(RememberMeConfiguration rememberMeConfiguration) {
        return this;
    }

    @Override // com.checkout.components.card.di.component.CardDIComponent.Builder
    public final CardDIComponent.Builder supportedSchemesRepository(SupportedSchemesRepository supportedSchemesRepository) {
        supportedSchemesRepository.getClass();
        this.f4013b = supportedSchemesRepository;
        return this;
    }

    @Override // com.checkout.components.card.di.component.CardDIComponent.Builder
    public final CardDIComponent.Builder supportedTypesRepository(SupportedTypesRepository supportedTypesRepository) {
        supportedTypesRepository.getClass();
        this.f4012a = supportedTypesRepository;
        return this;
    }

    @Override // com.checkout.components.card.di.component.CardDIComponent.Builder
    public final CardDIComponent.Builder translation(Map map) {
        this.f4020j = map;
        return this;
    }
}
