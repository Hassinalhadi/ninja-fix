package com.checkout.components.address;

import com.checkout.address.di.AddressStyleModule;
import com.checkout.components.ui.mapper.TextLabelStyleToStateMapper;

/* loaded from: classes3.dex */
public final class H implements dagger.internal.b {
    public H(AddressStyleModule addressStyleModule) {
    }

    @Override // Kd.a
    public final Object get() {
        return new TextLabelStyleToStateMapper();
    }
}
