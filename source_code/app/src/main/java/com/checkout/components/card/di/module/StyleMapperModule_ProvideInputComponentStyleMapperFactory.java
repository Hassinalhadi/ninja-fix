package com.checkout.components.card.di.module;

import T.s;
import com.checkout.components.interfaces.mapper.Mapper;
import com.checkout.components.ui.model.style.base.ContainerStyle;
import com.checkout.components.ui.model.style.base.InputComponentStyle;
import com.checkout.components.ui.model.style.base.InputFieldStyle;
import com.checkout.components.ui.model.style.base.TextLabelStyle;
import com.checkout.components.ui.model.style.view.InputComponentViewStyle;
import com.checkout.components.ui.model.style.view.InputFieldViewStyle;
import com.checkout.components.ui.model.style.view.TextLabelViewStyle;
import dagger.internal.b;
import dagger.internal.d;
import s6.AbstractC2763s0;

/* loaded from: classes3.dex */
public final class StyleMapperModule_ProvideInputComponentStyleMapperFactory implements b {

    /* renamed from: a, reason: collision with root package name */
    private final StyleMapperModule f4158a;

    /* renamed from: b, reason: collision with root package name */
    private final d f4159b;

    /* renamed from: c, reason: collision with root package name */
    private final d f4160c;

    /* renamed from: d, reason: collision with root package name */
    private final d f4161d;

    public StyleMapperModule_ProvideInputComponentStyleMapperFactory(StyleMapperModule styleMapperModule, d dVar, d dVar2, d dVar3) {
        this.f4158a = styleMapperModule;
        this.f4159b = dVar;
        this.f4160c = dVar2;
        this.f4161d = dVar3;
    }

    public static StyleMapperModule_ProvideInputComponentStyleMapperFactory create(StyleMapperModule styleMapperModule, d dVar, d dVar2, d dVar3) {
        return new StyleMapperModule_ProvideInputComponentStyleMapperFactory(styleMapperModule, dVar, dVar2, dVar3);
    }

    public static Mapper<InputComponentStyle, InputComponentViewStyle> provideInputComponentStyleMapper(StyleMapperModule styleMapperModule, Mapper<TextLabelStyle, TextLabelViewStyle> mapper, Mapper<InputFieldStyle, InputFieldViewStyle> mapper2, Mapper<ContainerStyle, s> mapper3) {
        Mapper<InputComponentStyle, InputComponentViewStyle> provideInputComponentStyleMapper = styleMapperModule.provideInputComponentStyleMapper(mapper, mapper2, mapper3);
        AbstractC2763s0.delta(provideInputComponentStyleMapper);
        return provideInputComponentStyleMapper;
    }

    @Override // Kd.a
    public final Mapper<InputComponentStyle, InputComponentViewStyle> get() {
        Mapper<InputComponentStyle, InputComponentViewStyle> provideInputComponentStyleMapper = this.f4158a.provideInputComponentStyleMapper((Mapper) this.f4159b.get(), (Mapper) this.f4160c.get(), (Mapper) this.f4161d.get());
        AbstractC2763s0.delta(provideInputComponentStyleMapper);
        return provideInputComponentStyleMapper;
    }
}
