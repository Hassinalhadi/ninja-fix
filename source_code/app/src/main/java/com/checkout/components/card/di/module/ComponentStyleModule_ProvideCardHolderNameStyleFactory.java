package com.checkout.components.card.di.module;

import com.checkout.components.interfaces.component.CardConfiguration;
import com.checkout.components.interfaces.ui.ResourceProvider;
import com.checkout.components.interfaces.uicustomisation.designtoken.DesignTokens;
import com.checkout.components.ui.model.style.base.InputComponentStyle;
import dagger.internal.b;
import dagger.internal.d;
import s6.AbstractC2763s0;

/* loaded from: classes3.dex */
public final class ComponentStyleModule_ProvideCardHolderNameStyleFactory implements b {

    /* renamed from: a, reason: collision with root package name */
    private final ComponentStyleModule f4120a;

    /* renamed from: b, reason: collision with root package name */
    private final d f4121b;

    /* renamed from: c, reason: collision with root package name */
    private final d f4122c;

    /* renamed from: d, reason: collision with root package name */
    private final d f4123d;

    public ComponentStyleModule_ProvideCardHolderNameStyleFactory(ComponentStyleModule componentStyleModule, d dVar, d dVar2, d dVar3) {
        this.f4120a = componentStyleModule;
        this.f4121b = dVar;
        this.f4122c = dVar2;
        this.f4123d = dVar3;
    }

    public static ComponentStyleModule_ProvideCardHolderNameStyleFactory create(ComponentStyleModule componentStyleModule, d dVar, d dVar2, d dVar3) {
        return new ComponentStyleModule_ProvideCardHolderNameStyleFactory(componentStyleModule, dVar, dVar2, dVar3);
    }

    public static InputComponentStyle provideCardHolderNameStyle(ComponentStyleModule componentStyleModule, DesignTokens designTokens, ResourceProvider resourceProvider, CardConfiguration cardConfiguration) {
        InputComponentStyle provideCardHolderNameStyle = componentStyleModule.provideCardHolderNameStyle(designTokens, resourceProvider, cardConfiguration);
        AbstractC2763s0.delta(provideCardHolderNameStyle);
        return provideCardHolderNameStyle;
    }

    @Override // Kd.a
    public final InputComponentStyle get() {
        InputComponentStyle provideCardHolderNameStyle = this.f4120a.provideCardHolderNameStyle((DesignTokens) this.f4121b.get(), (ResourceProvider) this.f4122c.get(), (CardConfiguration) this.f4123d.get());
        AbstractC2763s0.delta(provideCardHolderNameStyle);
        return provideCardHolderNameStyle;
    }
}
