package com.checkout.components.rememberme;

import com.checkout.components.rememberme.di.StyleModule;
import com.checkout.components.ui.mapper.ImageStyleToComposableImageMapper;
import com.checkout.components.ui.mapper.InputFieldStyleToInputFieldStateMapper;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.checkout.components.rememberme.j1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0953j1 implements dagger.internal.b {

    /* renamed from: a, reason: collision with root package name */
    public final StyleModule f5966a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.d f5967b;

    public C0953j1(StyleModule styleModule, dagger.internal.d dVar) {
        this.f5966a = styleModule;
        this.f5967b = dVar;
    }

    @Override // Kd.a
    public final Object get() {
        StyleModule styleModule = this.f5966a;
        ImageStyleToComposableImageMapper imageMapper = (ImageStyleToComposableImageMapper) this.f5967b.get();
        styleModule.getClass();
        Intrinsics.echo(imageMapper, "imageMapper");
        return new InputFieldStyleToInputFieldStateMapper(imageMapper);
    }
}
