package com.checkout.components.rememberme;

import com.checkout.components.rememberme.di.RMStateManagerModule;
import com.checkout.components.rememberme.ui.manager.RMStateManagerImpl;

/* renamed from: com.checkout.components.rememberme.h0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0946h0 implements dagger.internal.b {

    /* renamed from: a, reason: collision with root package name */
    public final RMStateManagerModule f5940a;

    public C0946h0(RMStateManagerModule rMStateManagerModule) {
        this.f5940a = rMStateManagerModule;
    }

    @Override // Kd.a
    public final Object get() {
        this.f5940a.getClass();
        return new RMStateManagerImpl();
    }
}
