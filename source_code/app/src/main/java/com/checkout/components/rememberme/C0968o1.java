package com.checkout.components.rememberme;

import com.checkout.components.rememberme.di.StyleModule;
import com.checkout.components.ui.mapper.TextLabelStyleToStateMapper;

/* renamed from: com.checkout.components.rememberme.o1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0968o1 implements dagger.internal.b {

    /* renamed from: a, reason: collision with root package name */
    public final StyleModule f6169a;

    public C0968o1(StyleModule styleModule) {
        this.f6169a = styleModule;
    }

    @Override // Kd.a
    public final Object get() {
        this.f6169a.getClass();
        return new TextLabelStyleToStateMapper();
    }
}
