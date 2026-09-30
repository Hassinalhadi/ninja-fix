package com.checkout.components.rememberme;

import com.checkout.components.interfaces.data.PrimitiveSharedFlowRepository;
import com.checkout.components.interfaces.data.PrimitiveStateFlowRepository;
import com.checkout.components.rememberme.utils.KMPRememberMeClickHandler;

/* loaded from: classes3.dex */
public final class G implements dagger.internal.b {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.d f5752a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.d f5753b;

    public G(dagger.internal.d dVar, dagger.internal.d dVar2) {
        this.f5752a = dVar;
        this.f5753b = dVar2;
    }

    @Override // Kd.a
    public final Object get() {
        return new KMPRememberMeClickHandler((PrimitiveStateFlowRepository) this.f5752a.get(), (PrimitiveSharedFlowRepository) this.f5753b.get());
    }
}
