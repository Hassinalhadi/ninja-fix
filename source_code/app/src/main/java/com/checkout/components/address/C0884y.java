package com.checkout.components.address;

import com.checkout.address.di.AddressStyleModule;
import com.checkout.address.model.AddressFieldItem;
import com.checkout.components.interfaces.mapper.Mapper;
import com.checkout.components.interfaces.model.AddressField;
import com.checkout.components.interfaces.ui.ResourceProvider;
import com.checkout.components.interfaces.uicustomisation.designtoken.DesignTokens;
import s6.AbstractC2763s0;

/* renamed from: com.checkout.components.address.y, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0884y implements dagger.internal.b {

    /* renamed from: a, reason: collision with root package name */
    public final AddressStyleModule f3915a;

    /* renamed from: b, reason: collision with root package name */
    public final F f3916b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.d f3917c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.d f3918d;
    public final dagger.internal.d e;

    public C0884y(AddressStyleModule addressStyleModule, F f5, dagger.internal.d dVar, dagger.internal.d dVar2, dagger.internal.b bVar) {
        this.f3915a = addressStyleModule;
        this.f3916b = f5;
        this.f3917c = dVar;
        this.f3918d = dVar2;
        this.e = bVar;
    }

    @Override // Kd.a
    public final Object get() {
        Mapper<AddressField, AddressFieldItem> provideAddressFieldMapper = this.f3915a.provideAddressFieldMapper((Mapper) this.f3916b.get(), (Mapper) this.f3917c.get(), (ResourceProvider) this.f3918d.get(), (DesignTokens) this.e.get());
        AbstractC2763s0.delta(provideAddressFieldMapper);
        return provideAddressFieldMapper;
    }
}
