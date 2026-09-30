package com.checkout.components.rememberme;

import com.checkout.components.rememberme.di.StyleModule;
import com.checkout.components.ui.mapper.ContainerStyleToModifierMapper;

/* renamed from: com.checkout.components.rememberme.d1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0935d1 implements dagger.internal.b {

    /* renamed from: a, reason: collision with root package name */
    public final StyleModule f5875a;

    public C0935d1(StyleModule styleModule) {
        this.f5875a = styleModule;
    }

    @Override // Kd.a
    public final Object get() {
        this.f5875a.getClass();
        return new ContainerStyleToModifierMapper();
    }
}
