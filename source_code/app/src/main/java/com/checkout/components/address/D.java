package com.checkout.components.address;

import com.checkout.address.di.AddressStyleModule;
import com.checkout.components.interfaces.uicustomisation.designtoken.DesignTokens;
import com.checkout.components.ui.utils.ScreenHeaderStyleUtils;

/* loaded from: classes3.dex */
public final class D implements dagger.internal.b {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.d f3846a;

    public D(AddressStyleModule addressStyleModule, dagger.internal.b bVar) {
        this.f3846a = bVar;
    }

    @Override // Kd.a
    public final Object get() {
        return new ScreenHeaderStyleUtils((DesignTokens) this.f3846a.get());
    }
}
