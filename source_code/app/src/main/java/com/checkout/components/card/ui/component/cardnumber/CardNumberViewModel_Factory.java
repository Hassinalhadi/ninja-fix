package com.checkout.components.card.ui.component.cardnumber;

import T.s;
import com.checkout.components.card.model.CardNumberComponentStyle;
import com.checkout.components.card.operations.api.CardValidator;
import com.checkout.components.card.operations.network.repository.CardMetaDataRepository;
import com.checkout.components.card.operations.validator.CardTypeValidator;
import com.checkout.components.card.ui.manager.PaymentStateManager;
import com.checkout.components.interfaces.mapper.Mapper;
import com.checkout.components.interfaces.model.CallbackResult;
import com.checkout.components.interfaces.model.CardMetadata;
import com.checkout.components.interfaces.ui.ResourceProvider;
import com.checkout.components.interfaces.uicustomisation.designtoken.DesignTokens;
import com.checkout.components.interfaces.usecase.UseCase;
import com.checkout.components.ui.model.CardScheme;
import com.checkout.components.ui.model.state.InputComponentState;
import com.checkout.components.ui.model.state.TextLabelState;
import com.checkout.components.ui.model.style.base.ContainerStyle;
import com.checkout.components.ui.model.style.base.ImageStyle;
import com.checkout.components.ui.model.style.base.InputComponentStyle;
import com.checkout.components.ui.model.style.base.TextLabelStyle;
import com.checkout.components.ui.model.style.view.InputComponentViewStyle;
import com.checkout.components.ui.model.style.view.TextLabelViewStyle;
import dagger.internal.d;
import java.util.Locale;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class CardNumberViewModel_Factory implements dagger.internal.b {

    /* renamed from: a, reason: collision with root package name */
    private final d f4461a;

    /* renamed from: b, reason: collision with root package name */
    private final d f4462b;

    /* renamed from: c, reason: collision with root package name */
    private final d f4463c;

    /* renamed from: d, reason: collision with root package name */
    private final d f4464d;
    private final d e;

    /* renamed from: f, reason: collision with root package name */
    private final d f4465f;

    /* renamed from: g, reason: collision with root package name */
    private final d f4466g;

    /* renamed from: h, reason: collision with root package name */
    private final d f4467h;

    /* renamed from: i, reason: collision with root package name */
    private final d f4468i;

    /* renamed from: j, reason: collision with root package name */
    private final d f4469j;

    /* renamed from: k, reason: collision with root package name */
    private final d f4470k;

    /* renamed from: l, reason: collision with root package name */
    private final d f4471l;

    /* renamed from: m, reason: collision with root package name */
    private final d f4472m;

    /* renamed from: n, reason: collision with root package name */
    private final d f4473n;

    /* renamed from: o, reason: collision with root package name */
    private final d f4474o;

    /* renamed from: p, reason: collision with root package name */
    private final d f4475p;

    public CardNumberViewModel_Factory(d dVar, d dVar2, d dVar3, d dVar4, d dVar5, d dVar6, d dVar7, d dVar8, d dVar9, d dVar10, d dVar11, d dVar12, d dVar13, d dVar14, d dVar15, d dVar16) {
        this.f4461a = dVar;
        this.f4462b = dVar2;
        this.f4463c = dVar3;
        this.f4464d = dVar4;
        this.e = dVar5;
        this.f4465f = dVar6;
        this.f4466g = dVar7;
        this.f4467h = dVar8;
        this.f4468i = dVar9;
        this.f4469j = dVar10;
        this.f4470k = dVar11;
        this.f4471l = dVar12;
        this.f4472m = dVar13;
        this.f4473n = dVar14;
        this.f4474o = dVar15;
        this.f4475p = dVar16;
    }

    public static CardNumberViewModel_Factory create(d dVar, d dVar2, d dVar3, d dVar4, d dVar5, d dVar6, d dVar7, d dVar8, d dVar9, d dVar10, d dVar11, d dVar12, d dVar13, d dVar14, d dVar15, d dVar16) {
        return new CardNumberViewModel_Factory(dVar, dVar2, dVar3, dVar4, dVar5, dVar6, dVar7, dVar8, dVar9, dVar10, dVar11, dVar12, dVar13, dVar14, dVar15, dVar16);
    }

    public static CardNumberViewModel newInstance(Mapper<InputComponentStyle, InputComponentViewStyle> mapper, Mapper<InputComponentStyle, InputComponentState> mapper2, Mapper<TextLabelStyle, TextLabelViewStyle> mapper3, Mapper<TextLabelStyle, TextLabelState> mapper4, Mapper<ContainerStyle, s> mapper5, CardValidator cardValidator, PaymentStateManager paymentStateManager, CardNumberComponentStyle cardNumberComponentStyle, ResourceProvider resourceProvider, CardMetaDataRepository cardMetaDataRepository, UseCase<CardMetadata, Map<CardScheme, ImageStyle>> useCase, DesignTokens designTokens, Function0<Unit> function0, Function1<? super CardMetadata, ? extends CallbackResult> function1, Locale locale, CardTypeValidator cardTypeValidator) {
        return new CardNumberViewModel(mapper, mapper2, mapper3, mapper4, mapper5, cardValidator, paymentStateManager, cardNumberComponentStyle, resourceProvider, cardMetaDataRepository, useCase, designTokens, function0, function1, locale, cardTypeValidator);
    }

    @Override // Kd.a
    public final CardNumberViewModel get() {
        return new CardNumberViewModel((Mapper) this.f4461a.get(), (Mapper) this.f4462b.get(), (Mapper) this.f4463c.get(), (Mapper) this.f4464d.get(), (Mapper) this.e.get(), (CardValidator) this.f4465f.get(), (PaymentStateManager) this.f4466g.get(), (CardNumberComponentStyle) this.f4467h.get(), (ResourceProvider) this.f4468i.get(), (CardMetaDataRepository) this.f4469j.get(), (UseCase) this.f4470k.get(), (DesignTokens) this.f4471l.get(), (Function0) this.f4472m.get(), (Function1) this.f4473n.get(), (Locale) this.f4474o.get(), (CardTypeValidator) this.f4475p.get());
    }
}
