package com.checkout.components.rememberme;

import com.checkout.components.interfaces.mapper.Mapper;
import com.checkout.components.rememberme.di.StyleModule;
import com.checkout.components.ui.model.style.base.InputComponentStyle;
import com.checkout.components.ui.model.style.view.InputComponentViewStyle;
import s6.AbstractC2763s0;

/* renamed from: com.checkout.components.rememberme.i1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0950i1 implements dagger.internal.b {

    /* renamed from: a, reason: collision with root package name */
    public final StyleModule f5955a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.d f5956b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.d f5957c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.d f5958d;

    public C0950i1(StyleModule styleModule, dagger.internal.d dVar, dagger.internal.d dVar2, dagger.internal.d dVar3) {
        this.f5955a = styleModule;
        this.f5956b = dVar;
        this.f5957c = dVar2;
        this.f5958d = dVar3;
    }

    @Override // Kd.a
    public final Object get() {
        Mapper<InputComponentStyle, InputComponentViewStyle> inputComponentViewStyleMapper = this.f5955a.inputComponentViewStyleMapper((Mapper) this.f5956b.get(), (Mapper) this.f5957c.get(), (Mapper) this.f5958d.get());
        AbstractC2763s0.delta(inputComponentViewStyleMapper);
        return inputComponentViewStyleMapper;
    }
}
