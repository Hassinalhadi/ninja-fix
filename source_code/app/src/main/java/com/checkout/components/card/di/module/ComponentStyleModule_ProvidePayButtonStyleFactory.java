package com.checkout.components.card.di.module;

import com.checkout.components.interfaces.ui.ResourceProvider;
import com.checkout.components.interfaces.uicustomisation.designtoken.DesignTokens;
import com.checkout.components.ui.model.style.base.ButtonStyle;
import dagger.internal.b;
import dagger.internal.d;
import s6.AbstractC2763s0;

/* loaded from: classes3.dex */
public final class ComponentStyleModule_ProvidePayButtonStyleFactory implements b {

    /* renamed from: a, reason: collision with root package name */
    private final ComponentStyleModule f4133a;

    /* renamed from: b, reason: collision with root package name */
    private final d f4134b;

    /* renamed from: c, reason: collision with root package name */
    private final d f4135c;

    public ComponentStyleModule_ProvidePayButtonStyleFactory(ComponentStyleModule componentStyleModule, d dVar, d dVar2) {
        this.f4133a = componentStyleModule;
        this.f4134b = dVar;
        this.f4135c = dVar2;
    }

    public static ComponentStyleModule_ProvidePayButtonStyleFactory create(ComponentStyleModule componentStyleModule, d dVar, d dVar2) {
        return new ComponentStyleModule_ProvidePayButtonStyleFactory(componentStyleModule, dVar, dVar2);
    }

    public static ButtonStyle providePayButtonStyle(ComponentStyleModule componentStyleModule, DesignTokens designTokens, ResourceProvider resourceProvider) {
        ButtonStyle providePayButtonStyle = componentStyleModule.providePayButtonStyle(designTokens, resourceProvider);
        AbstractC2763s0.delta(providePayButtonStyle);
        return providePayButtonStyle;
    }

    @Override // Kd.a
    public final ButtonStyle get() {
        ButtonStyle providePayButtonStyle = this.f4133a.providePayButtonStyle((DesignTokens) this.f4134b.get(), (ResourceProvider) this.f4135c.get());
        AbstractC2763s0.delta(providePayButtonStyle);
        return providePayButtonStyle;
    }
}
