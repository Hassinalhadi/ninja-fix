package com.checkout.components.card.ui.component.address;

import com.checkout.components.card.ui.manager.PaymentStateManager;
import com.checkout.components.interfaces.component.AddressConfiguration;
import com.checkout.components.interfaces.localisation.ComponentTranslationKey;
import com.checkout.components.interfaces.mapper.Mapper;
import com.checkout.components.interfaces.ui.ResourceProvider;
import com.checkout.components.interfaces.uicustomisation.designtoken.DesignTokens;
import com.checkout.components.ui.model.state.TextLabelState;
import com.checkout.components.ui.model.style.base.TextLabelStyle;
import com.checkout.components.ui.model.style.view.TextLabelViewStyle;
import dagger.internal.b;
import dagger.internal.d;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes3.dex */
public final class AddressViewModel_Factory implements b {

    /* renamed from: a, reason: collision with root package name */
    private final d f4415a;

    /* renamed from: b, reason: collision with root package name */
    private final d f4416b;

    /* renamed from: c, reason: collision with root package name */
    private final d f4417c;

    /* renamed from: d, reason: collision with root package name */
    private final d f4418d;
    private final d e;

    /* renamed from: f, reason: collision with root package name */
    private final d f4419f;

    /* renamed from: g, reason: collision with root package name */
    private final d f4420g;

    /* renamed from: h, reason: collision with root package name */
    private final d f4421h;

    /* renamed from: i, reason: collision with root package name */
    private final d f4422i;

    public AddressViewModel_Factory(d dVar, d dVar2, d dVar3, d dVar4, d dVar5, d dVar6, d dVar7, d dVar8, d dVar9) {
        this.f4415a = dVar;
        this.f4416b = dVar2;
        this.f4417c = dVar3;
        this.f4418d = dVar4;
        this.e = dVar5;
        this.f4419f = dVar6;
        this.f4420g = dVar7;
        this.f4421h = dVar8;
        this.f4422i = dVar9;
    }

    public static AddressViewModel_Factory create(d dVar, d dVar2, d dVar3, d dVar4, d dVar5, d dVar6, d dVar7, d dVar8, d dVar9) {
        return new AddressViewModel_Factory(dVar, dVar2, dVar3, dVar4, dVar5, dVar6, dVar7, dVar8, dVar9);
    }

    public static AddressViewModel newInstance(AddressConfiguration addressConfiguration, Mapper<TextLabelStyle, TextLabelViewStyle> mapper, Mapper<TextLabelStyle, TextLabelState> mapper2, TextLabelStyle textLabelStyle, Locale locale, Map<ComponentTranslationKey, String> map, DesignTokens designTokens, PaymentStateManager paymentStateManager, ResourceProvider resourceProvider) {
        return new AddressViewModel(addressConfiguration, mapper, mapper2, textLabelStyle, locale, map, designTokens, paymentStateManager, resourceProvider);
    }

    @Override // Kd.a
    public final AddressViewModel get() {
        return new AddressViewModel((AddressConfiguration) this.f4415a.get(), (Mapper) this.f4416b.get(), (Mapper) this.f4417c.get(), (TextLabelStyle) this.f4418d.get(), (Locale) this.e.get(), (Map) this.f4419f.get(), (DesignTokens) this.f4420g.get(), (PaymentStateManager) this.f4421h.get(), (ResourceProvider) this.f4422i.get());
    }
}
