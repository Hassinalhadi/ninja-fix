package com.checkout.components.address;

import com.checkout.address.di.AddressStyleModule;
import com.checkout.components.interfaces.mapper.Mapper;
import com.checkout.components.ui.mapper.TextLabelStyleToStateMapper;
import com.checkout.components.ui.model.state.InputComponentState;
import com.checkout.components.ui.model.style.base.InputComponentStyle;
import s6.AbstractC2763s0;

/* loaded from: classes3.dex */
public final class E implements dagger.internal.b {

    /* renamed from: a, reason: collision with root package name */
    public final AddressStyleModule f3847a;

    /* renamed from: b, reason: collision with root package name */
    public final C f3848b;

    public E(AddressStyleModule addressStyleModule, H h4, C c3) {
        this.f3847a = addressStyleModule;
        this.f3848b = c3;
    }

    @Override // Kd.a
    public final Object get() {
        Mapper<InputComponentStyle, InputComponentState> provideStateMapper = this.f3847a.provideStateMapper(new TextLabelStyleToStateMapper(), (Mapper) this.f3848b.get());
        AbstractC2763s0.delta(provideStateMapper);
        return provideStateMapper;
    }
}
