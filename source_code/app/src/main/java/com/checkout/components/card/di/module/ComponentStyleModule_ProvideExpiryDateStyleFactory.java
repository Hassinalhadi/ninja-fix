package com.checkout.components.card.di.module;

import com.checkout.components.interfaces.ui.ResourceProvider;
import com.checkout.components.interfaces.uicustomisation.designtoken.DesignTokens;
import com.checkout.components.ui.model.style.base.InputComponentStyle;
import dagger.internal.b;
import dagger.internal.d;
import java.util.Locale;
import s6.AbstractC2763s0;

/* loaded from: classes3.dex */
public final class ComponentStyleModule_ProvideExpiryDateStyleFactory implements b {

    /* renamed from: a, reason: collision with root package name */
    private final ComponentStyleModule f4129a;

    /* renamed from: b, reason: collision with root package name */
    private final d f4130b;

    /* renamed from: c, reason: collision with root package name */
    private final d f4131c;

    /* renamed from: d, reason: collision with root package name */
    private final d f4132d;

    public ComponentStyleModule_ProvideExpiryDateStyleFactory(ComponentStyleModule componentStyleModule, d dVar, d dVar2, d dVar3) {
        this.f4129a = componentStyleModule;
        this.f4130b = dVar;
        this.f4131c = dVar2;
        this.f4132d = dVar3;
    }

    public static ComponentStyleModule_ProvideExpiryDateStyleFactory create(ComponentStyleModule componentStyleModule, d dVar, d dVar2, d dVar3) {
        return new ComponentStyleModule_ProvideExpiryDateStyleFactory(componentStyleModule, dVar, dVar2, dVar3);
    }

    public static InputComponentStyle provideExpiryDateStyle(ComponentStyleModule componentStyleModule, DesignTokens designTokens, ResourceProvider resourceProvider, Locale locale) {
        InputComponentStyle provideExpiryDateStyle = componentStyleModule.provideExpiryDateStyle(designTokens, resourceProvider, locale);
        AbstractC2763s0.delta(provideExpiryDateStyle);
        return provideExpiryDateStyle;
    }

    @Override // Kd.a
    public final InputComponentStyle get() {
        InputComponentStyle provideExpiryDateStyle = this.f4129a.provideExpiryDateStyle((DesignTokens) this.f4130b.get(), (ResourceProvider) this.f4131c.get(), (Locale) this.f4132d.get());
        AbstractC2763s0.delta(provideExpiryDateStyle);
        return provideExpiryDateStyle;
    }
}
