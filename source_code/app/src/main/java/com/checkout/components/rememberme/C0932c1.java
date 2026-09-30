package com.checkout.components.rememberme;

import com.checkout.components.interfaces.mapper.Mapper;
import com.checkout.components.rememberme.di.StyleModule;
import com.checkout.components.ui.mapper.ButtonStyleToInternalViewStyleMapper;
import s6.AbstractC2763s0;

/* renamed from: com.checkout.components.rememberme.c1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0932c1 implements dagger.internal.b {

    /* renamed from: a, reason: collision with root package name */
    public final StyleModule f5867a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.d f5868b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.d f5869c;

    public C0932c1(StyleModule styleModule, dagger.internal.d dVar, dagger.internal.d dVar2) {
        this.f5867a = styleModule;
        this.f5868b = dVar;
        this.f5869c = dVar2;
    }

    @Override // Kd.a
    public final Object get() {
        ButtonStyleToInternalViewStyleMapper buttonStyleToInternalStyleMapper = this.f5867a.buttonStyleToInternalStyleMapper((Mapper) this.f5868b.get(), (Mapper) this.f5869c.get());
        AbstractC2763s0.delta(buttonStyleToInternalStyleMapper);
        return buttonStyleToInternalStyleMapper;
    }
}
