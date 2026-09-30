package com.checkout.components.rememberme;

import com.checkout.components.interfaces.mapper.Mapper;
import com.checkout.components.rememberme.di.StyleModule;
import com.checkout.components.ui.mapper.InputFieldStyleToViewStyleMapper;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.checkout.components.rememberme.k1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0956k1 implements dagger.internal.b {

    /* renamed from: a, reason: collision with root package name */
    public final StyleModule f5981a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.d f5982b;

    public C0956k1(StyleModule styleModule, dagger.internal.d dVar) {
        this.f5981a = styleModule;
        this.f5982b = dVar;
    }

    @Override // Kd.a
    public final Object get() {
        StyleModule styleModule = this.f5981a;
        Mapper textLabelStyleMapper = (Mapper) this.f5982b.get();
        styleModule.getClass();
        Intrinsics.echo(textLabelStyleMapper, "textLabelStyleMapper");
        return new InputFieldStyleToViewStyleMapper(textLabelStyleMapper);
    }
}
