package com.checkout.components.address;

import com.checkout.address.di.AddressStyleModule;
import com.checkout.components.interfaces.uicustomisation.designtoken.DesignTokens;
import com.checkout.components.ui.utils.CountryPickerResourceProvider;
import com.checkout.components.ui.utils.CountryPickerStyleUtils;
import com.checkout.components.ui.utils.ScreenHeaderStyleUtils;
import s6.AbstractC2763s0;

/* loaded from: classes3.dex */
public final class A implements dagger.internal.b {

    /* renamed from: a, reason: collision with root package name */
    public final AddressStyleModule f3842a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.d f3843b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.d f3844c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.d f3845d;

    public A(AddressStyleModule addressStyleModule, dagger.internal.d dVar, dagger.internal.b bVar, dagger.internal.d dVar2) {
        this.f3842a = addressStyleModule;
        this.f3843b = dVar;
        this.f3844c = bVar;
        this.f3845d = dVar2;
    }

    @Override // Kd.a
    public final Object get() {
        CountryPickerStyleUtils provideCountryPickerStyleUtils = this.f3842a.provideCountryPickerStyleUtils((CountryPickerResourceProvider) this.f3843b.get(), (DesignTokens) this.f3844c.get(), (ScreenHeaderStyleUtils) this.f3845d.get());
        AbstractC2763s0.delta(provideCountryPickerStyleUtils);
        return provideCountryPickerStyleUtils;
    }
}
