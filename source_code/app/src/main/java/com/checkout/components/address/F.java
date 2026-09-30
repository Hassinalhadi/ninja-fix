package com.checkout.components.address;

import com.checkout.address.di.AddressStyleModule;
import com.checkout.components.interfaces.mapper.Mapper;
import com.checkout.components.ui.mapper.ContainerStyleToModifierMapper;
import com.checkout.components.ui.mapper.TextLabelStyleToViewStyleMapper;
import com.checkout.components.ui.model.style.base.InputComponentStyle;
import com.checkout.components.ui.model.style.view.InputComponentViewStyle;
import s6.AbstractC2763s0;

/* loaded from: classes3.dex */
public final class F implements dagger.internal.b {

    /* renamed from: a, reason: collision with root package name */
    public final AddressStyleModule f3849a;

    public F(AddressStyleModule addressStyleModule, I i4, z zVar) {
        this.f3849a = addressStyleModule;
    }

    @Override // Kd.a
    public final Object get() {
        Mapper<InputComponentStyle, InputComponentViewStyle> provideStyleMapper = this.f3849a.provideStyleMapper(new TextLabelStyleToViewStyleMapper(), new ContainerStyleToModifierMapper());
        AbstractC2763s0.delta(provideStyleMapper);
        return provideStyleMapper;
    }
}
