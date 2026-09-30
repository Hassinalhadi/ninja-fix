package com.checkout.components.rememberme;

import com.checkout.components.interfaces.uicustomisation.designtoken.DesignTokens;
import com.checkout.components.rememberme.di.StyleModule;
import com.checkout.components.ui.utils.ScreenHeaderStyleUtils;

/* renamed from: com.checkout.components.rememberme.m1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0962m1 implements dagger.internal.b {

    /* renamed from: a, reason: collision with root package name */
    public final StyleModule f6000a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.d f6001b;

    public C0962m1(StyleModule styleModule, dagger.internal.b bVar) {
        this.f6000a = styleModule;
        this.f6001b = bVar;
    }

    @Override // Kd.a
    public final Object get() {
        StyleModule styleModule = this.f6000a;
        DesignTokens designTokens = (DesignTokens) this.f6001b.get();
        styleModule.getClass();
        return new ScreenHeaderStyleUtils(designTokens);
    }
}
