package com.checkout.components.card.di.module;

import com.checkout.components.card.ui.style.DefaultInputComponentStyle;
import com.checkout.components.interfaces.ui.ResourceProvider;
import com.checkout.components.interfaces.uicustomisation.designtoken.DesignTokens;
import com.checkout.components.ui.model.style.base.InputComponentStyle;
import dagger.internal.b;
import dagger.internal.d;
import kotlin.jvm.internal.Intrinsics;
import s6.AbstractC2763s0;

/* loaded from: classes3.dex */
public final class ComponentStyleModule_ProvideCVVStyleFactory implements b {

    /* renamed from: a, reason: collision with root package name */
    private final ComponentStyleModule f4117a;

    /* renamed from: b, reason: collision with root package name */
    private final d f4118b;

    /* renamed from: c, reason: collision with root package name */
    private final d f4119c;

    public ComponentStyleModule_ProvideCVVStyleFactory(ComponentStyleModule componentStyleModule, d dVar, d dVar2) {
        this.f4117a = componentStyleModule;
        this.f4118b = dVar;
        this.f4119c = dVar2;
    }

    public static ComponentStyleModule_ProvideCVVStyleFactory create(ComponentStyleModule componentStyleModule, d dVar, d dVar2) {
        return new ComponentStyleModule_ProvideCVVStyleFactory(componentStyleModule, dVar, dVar2);
    }

    public static InputComponentStyle provideCVVStyle(ComponentStyleModule componentStyleModule, DesignTokens designTokens, ResourceProvider resourceProvider) {
        componentStyleModule.getClass();
        Intrinsics.echo(resourceProvider, "resourceProvider");
        InputComponentStyle createCVVStyle = DefaultInputComponentStyle.INSTANCE.createCVVStyle(resourceProvider, designTokens);
        AbstractC2763s0.delta(createCVVStyle);
        return createCVVStyle;
    }

    @Override // Kd.a
    public final InputComponentStyle get() {
        return provideCVVStyle(this.f4117a, (DesignTokens) this.f4118b.get(), (ResourceProvider) this.f4119c.get());
    }
}
