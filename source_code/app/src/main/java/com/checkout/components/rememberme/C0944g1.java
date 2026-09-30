package com.checkout.components.rememberme;

import com.checkout.components.rememberme.di.StyleModule;
import com.checkout.components.ui.mapper.ImageStyleToComposableImageMapper;

/* renamed from: com.checkout.components.rememberme.g1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0944g1 implements dagger.internal.b {

    /* renamed from: a, reason: collision with root package name */
    public final StyleModule f5934a;

    public C0944g1(StyleModule styleModule) {
        this.f5934a = styleModule;
    }

    @Override // Kd.a
    public final Object get() {
        this.f5934a.getClass();
        return new ImageStyleToComposableImageMapper();
    }
}
