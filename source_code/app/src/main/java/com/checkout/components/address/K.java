package com.checkout.components.address;

import com.checkout.address.di.AddressButtonComponent;
import com.checkout.address.di.AddressStyleModule;
import com.checkout.components.interfaces.data.PrimitiveStateFlowRepository;
import com.checkout.components.interfaces.mapper.Mapper;
import com.checkout.components.ui.mapper.ImageStyleToComposableImageMapper;
import com.checkout.components.ui.mapper.InputFieldStyleToInputFieldStateMapper;
import com.checkout.components.ui.mapper.InputFieldStyleToViewStyleMapper;
import com.checkout.components.ui.mapper.TextLabelStyleToStateMapper;
import com.checkout.components.ui.mapper.TextLabelStyleToViewStyleMapper;

/* loaded from: classes3.dex */
public final class K implements AddressButtonComponent {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.d f3855a;

    public K(AddressStyleModule addressStyleModule) {
        this.f3855a = dagger.internal.a.bravo(new C0883x(addressStyleModule));
    }

    @Override // com.checkout.address.di.AddressButtonComponent
    public final PrimitiveStateFlowRepository errorMessageRepository() {
        return (PrimitiveStateFlowRepository) this.f3855a.get();
    }

    @Override // com.checkout.address.di.AddressButtonComponent
    public final Mapper inputFieldStateMapper() {
        return new InputFieldStyleToInputFieldStateMapper(new ImageStyleToComposableImageMapper());
    }

    @Override // com.checkout.address.di.AddressButtonComponent
    public final Mapper inputFieldStyleMapper() {
        return new InputFieldStyleToViewStyleMapper(new TextLabelStyleToViewStyleMapper());
    }

    @Override // com.checkout.address.di.AddressButtonComponent
    public final TextLabelStyleToStateMapper textLabelStateMapper() {
        return new TextLabelStyleToStateMapper();
    }

    @Override // com.checkout.address.di.AddressButtonComponent
    public final Mapper textLabelViewStyleMapper() {
        return new TextLabelStyleToViewStyleMapper();
    }
}
