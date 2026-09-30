package com.checkout.components.card.di.module;

import T.s;
import com.checkout.components.interfaces.mapper.Mapper;
import com.checkout.components.ui.mapper.ContainerStyleToModifierMapper;
import com.checkout.components.ui.model.style.base.ContainerStyle;
import dagger.internal.b;

/* loaded from: classes3.dex */
public final class StyleMapperModule_ProvideContainerStyleToModifierMapperFactory implements b {

    /* renamed from: a, reason: collision with root package name */
    private final StyleMapperModule f4156a;

    public StyleMapperModule_ProvideContainerStyleToModifierMapperFactory(StyleMapperModule styleMapperModule) {
        this.f4156a = styleMapperModule;
    }

    public static StyleMapperModule_ProvideContainerStyleToModifierMapperFactory create(StyleMapperModule styleMapperModule) {
        return new StyleMapperModule_ProvideContainerStyleToModifierMapperFactory(styleMapperModule);
    }

    public static Mapper<ContainerStyle, s> provideContainerStyleToModifierMapper(StyleMapperModule styleMapperModule) {
        styleMapperModule.getClass();
        return new ContainerStyleToModifierMapper();
    }

    @Override // Kd.a
    public final Mapper<ContainerStyle, s> get() {
        return provideContainerStyleToModifierMapper(this.f4156a);
    }

    @Override // Kd.a
    public final Object get() {
        return provideContainerStyleToModifierMapper(this.f4156a);
    }
}
