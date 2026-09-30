package com.checkout.components.address;

import com.checkout.address.di.AddressStyleModule;
import com.checkout.components.ui.mapper.ImageStyleToComposableImageMapper;
import com.checkout.components.ui.mapper.InputFieldStyleToInputFieldStateMapper;

/* loaded from: classes3.dex */
public final class C implements dagger.internal.b {
    public C(AddressStyleModule addressStyleModule, B b2) {
    }

    @Override // Kd.a
    public final Object get() {
        return new InputFieldStyleToInputFieldStateMapper(new ImageStyleToComposableImageMapper());
    }
}
