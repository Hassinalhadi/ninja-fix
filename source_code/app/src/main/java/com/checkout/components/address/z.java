package com.checkout.components.address;

import com.checkout.address.di.AddressStyleModule;
import com.checkout.components.ui.mapper.ContainerStyleToModifierMapper;

/* loaded from: classes3.dex */
public final class z implements dagger.internal.b {
    public z(AddressStyleModule addressStyleModule) {
    }

    @Override // Kd.a
    public final Object get() {
        return new ContainerStyleToModifierMapper();
    }
}
