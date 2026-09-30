package com.checkout.components.address;

import com.checkout.address.di.AddressStyleModule;
import com.checkout.components.ui.mapper.ImageStyleToComposableImageMapper;

/* loaded from: classes3.dex */
public final class B implements dagger.internal.b {
    public B(AddressStyleModule addressStyleModule) {
    }

    @Override // Kd.a
    public final Object get() {
        return new ImageStyleToComposableImageMapper();
    }
}
