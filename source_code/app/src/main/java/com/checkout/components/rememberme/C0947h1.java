package com.checkout.components.rememberme;

import com.checkout.components.interfaces.mapper.Mapper;
import com.checkout.components.rememberme.di.StyleModule;
import com.checkout.components.ui.mapper.InputFieldStyleToInputFieldStateMapper;
import com.checkout.components.ui.mapper.TextLabelStyleToStateMapper;
import com.checkout.components.ui.model.state.InputComponentState;
import com.checkout.components.ui.model.style.base.InputComponentStyle;
import s6.AbstractC2763s0;

/* renamed from: com.checkout.components.rememberme.h1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0947h1 implements dagger.internal.b {

    /* renamed from: a, reason: collision with root package name */
    public final StyleModule f5941a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.d f5942b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.d f5943c;

    public C0947h1(StyleModule styleModule, dagger.internal.d dVar, dagger.internal.d dVar2) {
        this.f5941a = styleModule;
        this.f5942b = dVar;
        this.f5943c = dVar2;
    }

    @Override // Kd.a
    public final Object get() {
        Mapper<InputComponentStyle, InputComponentState> inputComponentStateMapper = this.f5941a.inputComponentStateMapper((TextLabelStyleToStateMapper) this.f5942b.get(), (InputFieldStyleToInputFieldStateMapper) this.f5943c.get());
        AbstractC2763s0.delta(inputComponentStateMapper);
        return inputComponentStateMapper;
    }
}
