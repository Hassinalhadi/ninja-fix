package com.checkout.components.card.di.module;

import com.checkout.components.interfaces.uicustomisation.designtoken.DesignTokens;
import com.checkout.components.ui.model.style.base.TextLabelStyle;
import dagger.internal.b;
import dagger.internal.d;
import s6.AbstractC2763s0;

/* loaded from: classes3.dex */
public final class ComponentStyleModule_ProvideErrorLabelStyleFactory implements b {

    /* renamed from: a, reason: collision with root package name */
    private final ComponentStyleModule f4127a;

    /* renamed from: b, reason: collision with root package name */
    private final d f4128b;

    public ComponentStyleModule_ProvideErrorLabelStyleFactory(ComponentStyleModule componentStyleModule, d dVar) {
        this.f4127a = componentStyleModule;
        this.f4128b = dVar;
    }

    public static ComponentStyleModule_ProvideErrorLabelStyleFactory create(ComponentStyleModule componentStyleModule, d dVar) {
        return new ComponentStyleModule_ProvideErrorLabelStyleFactory(componentStyleModule, dVar);
    }

    public static TextLabelStyle provideErrorLabelStyle(ComponentStyleModule componentStyleModule, DesignTokens designTokens) {
        TextLabelStyle provideErrorLabelStyle = componentStyleModule.provideErrorLabelStyle(designTokens);
        AbstractC2763s0.delta(provideErrorLabelStyle);
        return provideErrorLabelStyle;
    }

    @Override // Kd.a
    public final TextLabelStyle get() {
        TextLabelStyle provideErrorLabelStyle = this.f4127a.provideErrorLabelStyle((DesignTokens) this.f4128b.get());
        AbstractC2763s0.delta(provideErrorLabelStyle);
        return provideErrorLabelStyle;
    }
}
