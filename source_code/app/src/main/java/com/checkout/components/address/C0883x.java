package com.checkout.components.address;

import com.checkout.address.di.AddressStyleModule;
import com.checkout.components.interfaces.data.PrimitiveStateFlowRepository;
import s6.AbstractC2763s0;

/* renamed from: com.checkout.components.address.x, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0883x implements dagger.internal.b {

    /* renamed from: a, reason: collision with root package name */
    public final AddressStyleModule f3914a;

    public C0883x(AddressStyleModule addressStyleModule) {
        this.f3914a = addressStyleModule;
    }

    @Override // Kd.a
    public final Object get() {
        this.f3914a.getClass();
        PrimitiveStateFlowRepository create = PrimitiveStateFlowRepository.INSTANCE.create(null);
        AbstractC2763s0.delta(create);
        return create;
    }
}
