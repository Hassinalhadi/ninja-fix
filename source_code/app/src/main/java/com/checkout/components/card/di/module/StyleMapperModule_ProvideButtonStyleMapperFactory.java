package com.checkout.components.card.di.module;

import T.s;
import com.checkout.components.interfaces.mapper.Mapper;
import com.checkout.components.ui.model.style.base.ButtonStyle;
import com.checkout.components.ui.model.style.base.ContainerStyle;
import com.checkout.components.ui.model.style.base.TextLabelStyle;
import com.checkout.components.ui.model.style.view.InternalButtonViewStyle;
import com.checkout.components.ui.model.style.view.TextLabelViewStyle;
import dagger.internal.b;
import dagger.internal.d;
import s6.AbstractC2763s0;

/* loaded from: classes3.dex */
public final class StyleMapperModule_ProvideButtonStyleMapperFactory implements b {

    /* renamed from: a, reason: collision with root package name */
    private final StyleMapperModule f4153a;

    /* renamed from: b, reason: collision with root package name */
    private final d f4154b;

    /* renamed from: c, reason: collision with root package name */
    private final d f4155c;

    public StyleMapperModule_ProvideButtonStyleMapperFactory(StyleMapperModule styleMapperModule, d dVar, d dVar2) {
        this.f4153a = styleMapperModule;
        this.f4154b = dVar;
        this.f4155c = dVar2;
    }

    public static StyleMapperModule_ProvideButtonStyleMapperFactory create(StyleMapperModule styleMapperModule, d dVar, d dVar2) {
        return new StyleMapperModule_ProvideButtonStyleMapperFactory(styleMapperModule, dVar, dVar2);
    }

    public static Mapper<ButtonStyle, InternalButtonViewStyle> provideButtonStyleMapper(StyleMapperModule styleMapperModule, Mapper<TextLabelStyle, TextLabelViewStyle> mapper, Mapper<ContainerStyle, s> mapper2) {
        Mapper<ButtonStyle, InternalButtonViewStyle> provideButtonStyleMapper = styleMapperModule.provideButtonStyleMapper(mapper, mapper2);
        AbstractC2763s0.delta(provideButtonStyleMapper);
        return provideButtonStyleMapper;
    }

    @Override // Kd.a
    public final Mapper<ButtonStyle, InternalButtonViewStyle> get() {
        Mapper<ButtonStyle, InternalButtonViewStyle> provideButtonStyleMapper = this.f4153a.provideButtonStyleMapper((Mapper) this.f4154b.get(), (Mapper) this.f4155c.get());
        AbstractC2763s0.delta(provideButtonStyleMapper);
        return provideButtonStyleMapper;
    }
}
