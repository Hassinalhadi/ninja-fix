package com.checkout.components.card.di.module;

import com.checkout.components.card.model.CardNumberComponentStyle;
import com.checkout.components.interfaces.ui.ResourceProvider;
import com.checkout.components.interfaces.uicustomisation.designtoken.DesignTokens;
import dagger.internal.b;
import dagger.internal.d;
import s6.AbstractC2763s0;

/* loaded from: classes3.dex */
public final class ComponentStyleModule_ProvideCardNumberStyleFactory implements b {

    /* renamed from: a, reason: collision with root package name */
    private final ComponentStyleModule f4124a;

    /* renamed from: b, reason: collision with root package name */
    private final d f4125b;

    /* renamed from: c, reason: collision with root package name */
    private final d f4126c;

    public ComponentStyleModule_ProvideCardNumberStyleFactory(ComponentStyleModule componentStyleModule, d dVar, d dVar2) {
        this.f4124a = componentStyleModule;
        this.f4125b = dVar;
        this.f4126c = dVar2;
    }

    public static ComponentStyleModule_ProvideCardNumberStyleFactory create(ComponentStyleModule componentStyleModule, d dVar, d dVar2) {
        return new ComponentStyleModule_ProvideCardNumberStyleFactory(componentStyleModule, dVar, dVar2);
    }

    public static CardNumberComponentStyle provideCardNumberStyle(ComponentStyleModule componentStyleModule, DesignTokens designTokens, ResourceProvider resourceProvider) {
        CardNumberComponentStyle provideCardNumberStyle = componentStyleModule.provideCardNumberStyle(designTokens, resourceProvider);
        AbstractC2763s0.delta(provideCardNumberStyle);
        return provideCardNumberStyle;
    }

    @Override // Kd.a
    public final CardNumberComponentStyle get() {
        CardNumberComponentStyle provideCardNumberStyle = this.f4124a.provideCardNumberStyle((DesignTokens) this.f4125b.get(), (ResourceProvider) this.f4126c.get());
        AbstractC2763s0.delta(provideCardNumberStyle);
        return provideCardNumberStyle;
    }
}
