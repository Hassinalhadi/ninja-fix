package com.checkout.components.rememberme;

import com.checkout.components.rememberme.di.StyleModule;
import com.checkout.components.ui.mapper.TextLabelStyleToViewStyleMapper;

/* renamed from: com.checkout.components.rememberme.p1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0971p1 implements dagger.internal.b {

    /* renamed from: a, reason: collision with root package name */
    public final StyleModule f6176a;

    public C0971p1(StyleModule styleModule) {
        this.f6176a = styleModule;
    }

    @Override // Kd.a
    public final Object get() {
        this.f6176a.getClass();
        return new TextLabelStyleToViewStyleMapper();
    }
}
