package com.checkout.components.card.di.component;

import com.checkout.components.card.ui.component.address.AddressViewModel;
import com.checkout.components.card.ui.manager.PaymentStateManager;
import com.checkout.components.interfaces.component.AddressConfiguration;
import com.checkout.components.interfaces.ui.ResourceProvider;
import com.checkout.components.ui.mapper.TextLabelStyleToStateMapper;
import com.checkout.components.ui.mapper.TextLabelStyleToViewStyleMapper;
import com.checkout.components.ui.model.style.base.TextLabelStyle;
import s6.AbstractC2763s0;

/* loaded from: classes3.dex */
public final class b implements AddressViewModelSubComponent {

    /* renamed from: a, reason: collision with root package name */
    public final j f4011a;

    public b(j jVar) {
        this.f4011a = jVar;
    }

    @Override // com.checkout.components.card.di.component.AddressViewModelSubComponent
    public final AddressViewModel getAddressViewModel() {
        AddressConfiguration addressConfiguration = this.f4011a.f4085o;
        TextLabelStyleToViewStyleMapper textLabelStyleToViewStyleMapper = new TextLabelStyleToViewStyleMapper();
        TextLabelStyleToStateMapper textLabelStyleToStateMapper = new TextLabelStyleToStateMapper();
        j jVar = this.f4011a;
        TextLabelStyle provideAddressLabelStyle = jVar.f4065a.provideAddressLabelStyle(jVar.f4067b, (ResourceProvider) jVar.A.get());
        AbstractC2763s0.delta(provideAddressLabelStyle);
        j jVar2 = this.f4011a;
        return new AddressViewModel(addressConfiguration, textLabelStyleToViewStyleMapper, textLabelStyleToStateMapper, provideAddressLabelStyle, jVar2.f4082l, jVar2.f4086p, jVar2.f4067b, (PaymentStateManager) jVar2.f4045F.get(), (ResourceProvider) this.f4011a.A.get());
    }
}
