package com.checkout.components.card.di.module;

import com.checkout.components.interfaces.mapper.Mapper;
import com.checkout.components.ui.mapper.TextLabelStyleToStateMapper;
import com.checkout.components.ui.model.state.TextLabelState;
import com.checkout.components.ui.model.style.base.TextLabelStyle;
import dagger.internal.b;

/* loaded from: classes3.dex */
public final class StyleMapperModule_ProvideTextLabelStyleToStateMapperFactory implements b {

    /* renamed from: a, reason: collision with root package name */
    private final StyleMapperModule f4169a;

    public StyleMapperModule_ProvideTextLabelStyleToStateMapperFactory(StyleMapperModule styleMapperModule) {
        this.f4169a = styleMapperModule;
    }

    public static StyleMapperModule_ProvideTextLabelStyleToStateMapperFactory create(StyleMapperModule styleMapperModule) {
        return new StyleMapperModule_ProvideTextLabelStyleToStateMapperFactory(styleMapperModule);
    }

    public static Mapper<TextLabelStyle, TextLabelState> provideTextLabelStyleToStateMapper(StyleMapperModule styleMapperModule) {
        styleMapperModule.getClass();
        return new TextLabelStyleToStateMapper();
    }

    @Override // Kd.a
    public final Mapper<TextLabelStyle, TextLabelState> get() {
        return provideTextLabelStyleToStateMapper(this.f4169a);
    }

    @Override // Kd.a
    public final Object get() {
        return provideTextLabelStyleToStateMapper(this.f4169a);
    }
}
