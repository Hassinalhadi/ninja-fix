package com.checkout.components.address;

import com.checkout.address.di.AddressStyleModule;
import com.checkout.components.ui.mapper.TextLabelStyleToViewStyleMapper;

/* loaded from: classes3.dex */
public final class I implements dagger.internal.b {
    public I(AddressStyleModule addressStyleModule) {
    }

    @Override // Kd.a
    public final Object get() {
        return new TextLabelStyleToViewStyleMapper();
    }
}
