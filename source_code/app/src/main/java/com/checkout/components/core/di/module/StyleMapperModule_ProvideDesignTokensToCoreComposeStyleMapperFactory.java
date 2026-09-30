package com.checkout.components.core.di.module;

import com.checkout.components.core.mapper.DesignTokensToCoreComposeStyleMapper;
import com.checkout.components.core.ui.model.ComposeStyle;
import com.checkout.components.interfaces.mapper.Mapper;
import com.checkout.components.interfaces.uicustomisation.designtoken.DesignTokens;
import dagger.internal.b;

/* loaded from: classes3.dex */
public final class StyleMapperModule_ProvideDesignTokensToCoreComposeStyleMapperFactory implements b {

    /* renamed from: a, reason: collision with root package name */
    private final StyleMapperModule f4779a;

    public StyleMapperModule_ProvideDesignTokensToCoreComposeStyleMapperFactory(StyleMapperModule styleMapperModule) {
        this.f4779a = styleMapperModule;
    }

    public static StyleMapperModule_ProvideDesignTokensToCoreComposeStyleMapperFactory create(StyleMapperModule styleMapperModule) {
        return new StyleMapperModule_ProvideDesignTokensToCoreComposeStyleMapperFactory(styleMapperModule);
    }

    public static Mapper<DesignTokens, ComposeStyle> provideDesignTokensToCoreComposeStyleMapper(StyleMapperModule styleMapperModule) {
        styleMapperModule.getClass();
        return new DesignTokensToCoreComposeStyleMapper();
    }

    @Override // Kd.a
    public final Mapper<DesignTokens, ComposeStyle> get() {
        return provideDesignTokensToCoreComposeStyleMapper(this.f4779a);
    }

    @Override // Kd.a
    public final Object get() {
        return provideDesignTokensToCoreComposeStyleMapper(this.f4779a);
    }
}
