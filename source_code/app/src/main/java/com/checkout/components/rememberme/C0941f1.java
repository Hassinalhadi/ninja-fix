package com.checkout.components.rememberme;

import com.checkout.components.interfaces.uicustomisation.designtoken.DesignTokens;
import com.checkout.components.rememberme.di.StyleModule;
import com.checkout.components.ui.utils.CountryPickerResourceProvider;
import com.checkout.components.ui.utils.CountryPickerStyleUtils;
import com.checkout.components.ui.utils.ScreenHeaderStyleUtils;
import s6.AbstractC2763s0;

/* renamed from: com.checkout.components.rememberme.f1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0941f1 implements dagger.internal.b {

    /* renamed from: a, reason: collision with root package name */
    public final StyleModule f5928a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.d f5929b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.d f5930c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.d f5931d;

    public C0941f1(StyleModule styleModule, dagger.internal.b bVar, dagger.internal.d dVar, dagger.internal.d dVar2) {
        this.f5928a = styleModule;
        this.f5929b = bVar;
        this.f5930c = dVar;
        this.f5931d = dVar2;
    }

    @Override // Kd.a
    public final Object get() {
        CountryPickerStyleUtils countryPickerStyleUtils = this.f5928a.countryPickerStyleUtils((DesignTokens) this.f5929b.get(), (CountryPickerResourceProvider) this.f5930c.get(), (ScreenHeaderStyleUtils) this.f5931d.get());
        AbstractC2763s0.delta(countryPickerStyleUtils);
        return countryPickerStyleUtils;
    }
}
