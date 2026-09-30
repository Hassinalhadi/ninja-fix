package com.checkout.components.card.di.module;

import com.checkout.components.ui.mapper.ImageStyleToComposableImageMapper;
import dagger.internal.b;

/* loaded from: classes3.dex */
public final class StyleMapperModule_ProvideImageStyleToComposableImageMapperFactory implements b {

    /* renamed from: a, reason: collision with root package name */
    private final StyleMapperModule f4157a;

    public StyleMapperModule_ProvideImageStyleToComposableImageMapperFactory(StyleMapperModule styleMapperModule) {
        this.f4157a = styleMapperModule;
    }

    public static StyleMapperModule_ProvideImageStyleToComposableImageMapperFactory create(StyleMapperModule styleMapperModule) {
        return new StyleMapperModule_ProvideImageStyleToComposableImageMapperFactory(styleMapperModule);
    }

    public static ImageStyleToComposableImageMapper provideImageStyleToComposableImageMapper(StyleMapperModule styleMapperModule) {
        styleMapperModule.getClass();
        return new ImageStyleToComposableImageMapper();
    }

    @Override // Kd.a
    public final ImageStyleToComposableImageMapper get() {
        return provideImageStyleToComposableImageMapper(this.f4157a);
    }

    @Override // Kd.a
    public final Object get() {
        return provideImageStyleToComposableImageMapper(this.f4157a);
    }
}
