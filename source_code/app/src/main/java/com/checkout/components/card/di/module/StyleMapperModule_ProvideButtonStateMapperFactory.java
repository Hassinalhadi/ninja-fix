package com.checkout.components.card.di.module;

import com.checkout.components.interfaces.mapper.Mapper;
import com.checkout.components.ui.mapper.ButtonStyleToInternalStateMapper;
import com.checkout.components.ui.model.state.InternalButtonState;
import com.checkout.components.ui.model.state.TextLabelState;
import com.checkout.components.ui.model.style.base.ButtonStyle;
import com.checkout.components.ui.model.style.base.TextLabelStyle;
import dagger.internal.b;
import dagger.internal.d;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class StyleMapperModule_ProvideButtonStateMapperFactory implements b {

    /* renamed from: a, reason: collision with root package name */
    private final StyleMapperModule f4151a;

    /* renamed from: b, reason: collision with root package name */
    private final d f4152b;

    public StyleMapperModule_ProvideButtonStateMapperFactory(StyleMapperModule styleMapperModule, d dVar) {
        this.f4151a = styleMapperModule;
        this.f4152b = dVar;
    }

    public static StyleMapperModule_ProvideButtonStateMapperFactory create(StyleMapperModule styleMapperModule, d dVar) {
        return new StyleMapperModule_ProvideButtonStateMapperFactory(styleMapperModule, dVar);
    }

    public static Mapper<ButtonStyle, InternalButtonState> provideButtonStateMapper(StyleMapperModule styleMapperModule, Mapper<TextLabelStyle, TextLabelState> textLabelStateMapper) {
        styleMapperModule.getClass();
        Intrinsics.echo(textLabelStateMapper, "textLabelStateMapper");
        return new ButtonStyleToInternalStateMapper(textLabelStateMapper);
    }

    @Override // Kd.a
    public final Mapper<ButtonStyle, InternalButtonState> get() {
        return provideButtonStateMapper(this.f4151a, (Mapper) this.f4152b.get());
    }
}
