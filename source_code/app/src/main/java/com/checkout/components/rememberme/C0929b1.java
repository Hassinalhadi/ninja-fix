package com.checkout.components.rememberme;

import com.checkout.components.rememberme.di.StyleModule;
import com.checkout.components.ui.mapper.ButtonStyleToInternalStateMapper;
import com.checkout.components.ui.mapper.TextLabelStyleToStateMapper;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.checkout.components.rememberme.b1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0929b1 implements dagger.internal.b {

    /* renamed from: a, reason: collision with root package name */
    public final StyleModule f5858a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.d f5859b;

    public C0929b1(StyleModule styleModule, dagger.internal.d dVar) {
        this.f5858a = styleModule;
        this.f5859b = dVar;
    }

    @Override // Kd.a
    public final Object get() {
        StyleModule styleModule = this.f5858a;
        TextLabelStyleToStateMapper textLabelMapper = (TextLabelStyleToStateMapper) this.f5859b.get();
        styleModule.getClass();
        Intrinsics.echo(textLabelMapper, "textLabelMapper");
        return new ButtonStyleToInternalStateMapper(textLabelMapper);
    }
}
