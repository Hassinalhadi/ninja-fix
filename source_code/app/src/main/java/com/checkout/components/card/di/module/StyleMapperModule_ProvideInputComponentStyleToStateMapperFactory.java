package com.checkout.components.card.di.module;

import com.checkout.components.interfaces.mapper.Mapper;
import com.checkout.components.ui.model.state.InputComponentState;
import com.checkout.components.ui.model.state.InputFieldState;
import com.checkout.components.ui.model.state.TextLabelState;
import com.checkout.components.ui.model.style.base.InputComponentStyle;
import com.checkout.components.ui.model.style.base.InputFieldStyle;
import com.checkout.components.ui.model.style.base.TextLabelStyle;
import dagger.internal.b;
import dagger.internal.d;
import s6.AbstractC2763s0;

/* loaded from: classes3.dex */
public final class StyleMapperModule_ProvideInputComponentStyleToStateMapperFactory implements b {

    /* renamed from: a, reason: collision with root package name */
    private final StyleMapperModule f4162a;

    /* renamed from: b, reason: collision with root package name */
    private final d f4163b;

    /* renamed from: c, reason: collision with root package name */
    private final d f4164c;

    public StyleMapperModule_ProvideInputComponentStyleToStateMapperFactory(StyleMapperModule styleMapperModule, d dVar, d dVar2) {
        this.f4162a = styleMapperModule;
        this.f4163b = dVar;
        this.f4164c = dVar2;
    }

    public static StyleMapperModule_ProvideInputComponentStyleToStateMapperFactory create(StyleMapperModule styleMapperModule, d dVar, d dVar2) {
        return new StyleMapperModule_ProvideInputComponentStyleToStateMapperFactory(styleMapperModule, dVar, dVar2);
    }

    public static Mapper<InputComponentStyle, InputComponentState> provideInputComponentStyleToStateMapper(StyleMapperModule styleMapperModule, Mapper<TextLabelStyle, TextLabelState> mapper, Mapper<InputFieldStyle, InputFieldState> mapper2) {
        Mapper<InputComponentStyle, InputComponentState> provideInputComponentStyleToStateMapper = styleMapperModule.provideInputComponentStyleToStateMapper(mapper, mapper2);
        AbstractC2763s0.delta(provideInputComponentStyleToStateMapper);
        return provideInputComponentStyleToStateMapper;
    }

    @Override // Kd.a
    public final Mapper<InputComponentStyle, InputComponentState> get() {
        Mapper<InputComponentStyle, InputComponentState> provideInputComponentStyleToStateMapper = this.f4162a.provideInputComponentStyleToStateMapper((Mapper) this.f4163b.get(), (Mapper) this.f4164c.get());
        AbstractC2763s0.delta(provideInputComponentStyleToStateMapper);
        return provideInputComponentStyleToStateMapper;
    }
}
