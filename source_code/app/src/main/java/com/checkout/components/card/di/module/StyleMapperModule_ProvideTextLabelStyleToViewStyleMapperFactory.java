package com.checkout.components.card.di.module;

import com.checkout.components.interfaces.mapper.Mapper;
import com.checkout.components.ui.mapper.TextLabelStyleToViewStyleMapper;
import com.checkout.components.ui.model.style.base.TextLabelStyle;
import com.checkout.components.ui.model.style.view.TextLabelViewStyle;
import dagger.internal.b;

/* loaded from: classes3.dex */
public final class StyleMapperModule_ProvideTextLabelStyleToViewStyleMapperFactory implements b {

    /* renamed from: a, reason: collision with root package name */
    private final StyleMapperModule f4170a;

    public StyleMapperModule_ProvideTextLabelStyleToViewStyleMapperFactory(StyleMapperModule styleMapperModule) {
        this.f4170a = styleMapperModule;
    }

    public static StyleMapperModule_ProvideTextLabelStyleToViewStyleMapperFactory create(StyleMapperModule styleMapperModule) {
        return new StyleMapperModule_ProvideTextLabelStyleToViewStyleMapperFactory(styleMapperModule);
    }

    public static Mapper<TextLabelStyle, TextLabelViewStyle> provideTextLabelStyleToViewStyleMapper(StyleMapperModule styleMapperModule) {
        styleMapperModule.getClass();
        return new TextLabelStyleToViewStyleMapper();
    }

    @Override // Kd.a
    public final Mapper<TextLabelStyle, TextLabelViewStyle> get() {
        return provideTextLabelStyleToViewStyleMapper(this.f4170a);
    }

    @Override // Kd.a
    public final Object get() {
        return provideTextLabelStyleToViewStyleMapper(this.f4170a);
    }
}
