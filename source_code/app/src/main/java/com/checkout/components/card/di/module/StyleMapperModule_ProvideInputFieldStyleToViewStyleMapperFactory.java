package com.checkout.components.card.di.module;

import com.checkout.components.interfaces.mapper.Mapper;
import com.checkout.components.ui.mapper.InputFieldStyleToViewStyleMapper;
import com.checkout.components.ui.model.style.base.InputFieldStyle;
import com.checkout.components.ui.model.style.base.TextLabelStyle;
import com.checkout.components.ui.model.style.view.InputFieldViewStyle;
import com.checkout.components.ui.model.style.view.TextLabelViewStyle;
import dagger.internal.b;
import dagger.internal.d;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class StyleMapperModule_ProvideInputFieldStyleToViewStyleMapperFactory implements b {

    /* renamed from: a, reason: collision with root package name */
    private final StyleMapperModule f4167a;

    /* renamed from: b, reason: collision with root package name */
    private final d f4168b;

    public StyleMapperModule_ProvideInputFieldStyleToViewStyleMapperFactory(StyleMapperModule styleMapperModule, d dVar) {
        this.f4167a = styleMapperModule;
        this.f4168b = dVar;
    }

    public static StyleMapperModule_ProvideInputFieldStyleToViewStyleMapperFactory create(StyleMapperModule styleMapperModule, d dVar) {
        return new StyleMapperModule_ProvideInputFieldStyleToViewStyleMapperFactory(styleMapperModule, dVar);
    }

    public static Mapper<InputFieldStyle, InputFieldViewStyle> provideInputFieldStyleToViewStyleMapper(StyleMapperModule styleMapperModule, Mapper<TextLabelStyle, TextLabelViewStyle> textLabelStyleMapper) {
        styleMapperModule.getClass();
        Intrinsics.echo(textLabelStyleMapper, "textLabelStyleMapper");
        return new InputFieldStyleToViewStyleMapper(textLabelStyleMapper);
    }

    @Override // Kd.a
    public final Mapper<InputFieldStyle, InputFieldViewStyle> get() {
        return provideInputFieldStyleToViewStyleMapper(this.f4167a, (Mapper) this.f4168b.get());
    }
}
