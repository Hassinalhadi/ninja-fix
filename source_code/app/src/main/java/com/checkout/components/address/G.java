package com.checkout.components.address;

import com.checkout.address.di.AddressStyleModule;
import com.checkout.address.utils.StyleUtils;
import com.checkout.components.interfaces.ui.ResourceProvider;
import com.checkout.components.interfaces.uicustomisation.designtoken.DesignTokens;
import com.checkout.components.ui.utils.CountryPickerStyleUtils;
import com.checkout.components.ui.utils.ScreenHeaderStyleUtils;
import s6.AbstractC2763s0;

/* loaded from: classes3.dex */
public final class G implements dagger.internal.b {

    /* renamed from: a, reason: collision with root package name */
    public final AddressStyleModule f3850a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.d f3851b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.d f3852c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.d f3853d;
    public final dagger.internal.d e;

    public G(AddressStyleModule addressStyleModule, dagger.internal.d dVar, dagger.internal.b bVar, dagger.internal.d dVar2, dagger.internal.d dVar3) {
        this.f3850a = addressStyleModule;
        this.f3851b = dVar;
        this.f3852c = bVar;
        this.f3853d = dVar2;
        this.e = dVar3;
    }

    @Override // Kd.a
    public final Object get() {
        StyleUtils provideStyleUtils = this.f3850a.provideStyleUtils((ResourceProvider) this.f3851b.get(), (DesignTokens) this.f3852c.get(), (CountryPickerStyleUtils) this.f3853d.get(), (ScreenHeaderStyleUtils) this.e.get());
        AbstractC2763s0.delta(provideStyleUtils);
        return provideStyleUtils;
    }
}
