package com.checkout.components.card.di.module;

import com.checkout.components.interfaces.mapper.Mapper;
import com.checkout.components.ui.mapper.ImageStyleToComposableImageMapper;
import com.checkout.components.ui.mapper.InputFieldStyleToInputFieldStateMapper;
import com.checkout.components.ui.model.state.InputFieldState;
import com.checkout.components.ui.model.style.base.InputFieldStyle;
import dagger.internal.b;
import dagger.internal.d;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class StyleMapperModule_ProvideInputFieldStyleToStateMapperFactory implements b {

    /* renamed from: a, reason: collision with root package name */
    private final StyleMapperModule f4165a;

    /* renamed from: b, reason: collision with root package name */
    private final d f4166b;

    public StyleMapperModule_ProvideInputFieldStyleToStateMapperFactory(StyleMapperModule styleMapperModule, d dVar) {
        this.f4165a = styleMapperModule;
        this.f4166b = dVar;
    }

    public static StyleMapperModule_ProvideInputFieldStyleToStateMapperFactory create(StyleMapperModule styleMapperModule, d dVar) {
        return new StyleMapperModule_ProvideInputFieldStyleToStateMapperFactory(styleMapperModule, dVar);
    }

    public static Mapper<InputFieldStyle, InputFieldState> provideInputFieldStyleToStateMapper(StyleMapperModule styleMapperModule, ImageStyleToComposableImageMapper imageMapper) {
        styleMapperModule.getClass();
        Intrinsics.echo(imageMapper, "imageMapper");
        return new InputFieldStyleToInputFieldStateMapper(imageMapper);
    }

    @Override // Kd.a
    public final Mapper<InputFieldStyle, InputFieldState> get() {
        return provideInputFieldStyleToStateMapper(this.f4165a, (ImageStyleToComposableImageMapper) this.f4166b.get());
    }
}
