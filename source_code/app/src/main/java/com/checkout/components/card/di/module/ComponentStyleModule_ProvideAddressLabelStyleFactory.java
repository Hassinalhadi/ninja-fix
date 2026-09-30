package com.checkout.components.card.di.module;

import com.checkout.components.interfaces.ui.ResourceProvider;
import com.checkout.components.interfaces.uicustomisation.designtoken.DesignTokens;
import com.checkout.components.ui.model.style.base.TextLabelStyle;
import dagger.internal.b;
import dagger.internal.d;
import s6.AbstractC2763s0;

/* loaded from: classes3.dex */
public final class ComponentStyleModule_ProvideAddressLabelStyleFactory implements b {

    /* renamed from: a, reason: collision with root package name */
    private final ComponentStyleModule f4114a;

    /* renamed from: b, reason: collision with root package name */
    private final d f4115b;

    /* renamed from: c, reason: collision with root package name */
    private final d f4116c;

    public ComponentStyleModule_ProvideAddressLabelStyleFactory(ComponentStyleModule componentStyleModule, d dVar, d dVar2) {
        this.f4114a = componentStyleModule;
        this.f4115b = dVar;
        this.f4116c = dVar2;
    }

    public static ComponentStyleModule_ProvideAddressLabelStyleFactory create(ComponentStyleModule componentStyleModule, d dVar, d dVar2) {
        return new ComponentStyleModule_ProvideAddressLabelStyleFactory(componentStyleModule, dVar, dVar2);
    }

    public static TextLabelStyle provideAddressLabelStyle(ComponentStyleModule componentStyleModule, DesignTokens designTokens, ResourceProvider resourceProvider) {
        TextLabelStyle provideAddressLabelStyle = componentStyleModule.provideAddressLabelStyle(designTokens, resourceProvider);
        AbstractC2763s0.delta(provideAddressLabelStyle);
        return provideAddressLabelStyle;
    }

    @Override // Kd.a
    public final TextLabelStyle get() {
        TextLabelStyle provideAddressLabelStyle = this.f4114a.provideAddressLabelStyle((DesignTokens) this.f4115b.get(), (ResourceProvider) this.f4116c.get());
        AbstractC2763s0.delta(provideAddressLabelStyle);
        return provideAddressLabelStyle;
    }
}
