package com.checkout.components.address;

import android.content.Context;
import com.checkout.address.di.AddressDIComponent;
import com.checkout.address.di.AddressStyleModule;
import com.checkout.address.di.AddressValidatorModule;
import com.checkout.address.di.RTLModule;
import com.checkout.address.di.ResourceModule;
import com.checkout.address.model.validation.contract.AddressValidator;
import com.checkout.address.utils.StyleUtils;
import com.checkout.address.validator.EmailFormatValidator;
import com.checkout.address.validator.LengthValidator;
import com.checkout.address.validator.PhoneFormatValidator;
import com.checkout.address.validator.RequiredValidator;
import com.checkout.components.interfaces.mapper.Mapper;
import com.checkout.components.interfaces.ui.ResourceProvider;
import com.checkout.components.interfaces.uicustomisation.designtoken.DesignTokens;
import com.checkout.components.ui.mapper.ButtonStyleToInternalStateMapper;
import com.checkout.components.ui.mapper.ContainerStyleToModifierMapper;
import com.checkout.components.ui.mapper.ImageStyleToComposableImageMapper;
import com.checkout.components.ui.mapper.InputFieldStyleToInputFieldStateMapper;
import com.checkout.components.ui.mapper.InputFieldStyleToViewStyleMapper;
import com.checkout.components.ui.mapper.TextLabelStyleToStateMapper;
import com.checkout.components.ui.mapper.TextLabelStyleToViewStyleMapper;
import com.checkout.components.ui.model.style.base.ButtonStyle;
import com.checkout.components.ui.model.style.view.InternalButtonViewStyle;
import com.checkout.components.ui.utils.CountryPickerStyleUtils;
import com.checkout.components.ui.utils.extensions.Utils;
import dagger.internal.InstanceFactory;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import s6.AbstractC2763s0;

/* loaded from: classes3.dex */
public final class L implements AddressDIComponent {

    /* renamed from: a, reason: collision with root package name */
    public final AddressStyleModule f3856a;

    /* renamed from: b, reason: collision with root package name */
    public final AddressValidatorModule f3857b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f3858c;

    /* renamed from: d, reason: collision with root package name */
    public final RTLModule f3859d;
    public final F e;

    /* renamed from: f, reason: collision with root package name */
    public final dagger.internal.d f3860f;

    /* renamed from: g, reason: collision with root package name */
    public final dagger.internal.b f3861g;

    /* renamed from: h, reason: collision with root package name */
    public final dagger.internal.b f3862h;

    /* renamed from: i, reason: collision with root package name */
    public final dagger.internal.d f3863i;

    /* renamed from: j, reason: collision with root package name */
    public final dagger.internal.b f3864j;

    /* renamed from: k, reason: collision with root package name */
    public final dagger.internal.d f3865k;

    /* renamed from: l, reason: collision with root package name */
    public final dagger.internal.d f3866l;

    /* renamed from: m, reason: collision with root package name */
    public final dagger.internal.d f3867m;

    /* renamed from: n, reason: collision with root package name */
    public final dagger.internal.d f3868n;

    /* renamed from: o, reason: collision with root package name */
    public final dagger.internal.d f3869o;

    public L(AddressStyleModule addressStyleModule, ResourceModule resourceModule, AddressValidatorModule addressValidatorModule, RTLModule rTLModule, Context context, Map map, DesignTokens designTokens) {
        this.f3856a = addressStyleModule;
        this.f3857b = addressValidatorModule;
        this.f3858c = context;
        this.f3859d = rTLModule;
        F f5 = new F(addressStyleModule, new I(addressStyleModule), new z(addressStyleModule));
        this.e = f5;
        dagger.internal.d bravo = dagger.internal.a.bravo(new E(addressStyleModule, new H(addressStyleModule), new C(addressStyleModule, new B(addressStyleModule))));
        this.f3860f = bravo;
        InstanceFactory alpha = InstanceFactory.alpha(context);
        this.f3861g = alpha;
        InstanceFactory bravo2 = InstanceFactory.bravo(map);
        this.f3862h = bravo2;
        dagger.internal.d bravo3 = dagger.internal.a.bravo(new P(resourceModule, alpha, bravo2));
        this.f3863i = bravo3;
        InstanceFactory bravo4 = InstanceFactory.bravo(designTokens);
        this.f3864j = bravo4;
        this.f3865k = dagger.internal.a.bravo(new C0884y(addressStyleModule, f5, bravo, bravo3, bravo4));
        dagger.internal.d bravo5 = dagger.internal.a.bravo(new O(resourceModule, alpha, bravo2));
        this.f3866l = bravo5;
        dagger.internal.d bravo6 = dagger.internal.a.bravo(new D(addressStyleModule, bravo4));
        this.f3867m = bravo6;
        dagger.internal.d bravo7 = dagger.internal.a.bravo(new A(addressStyleModule, bravo5, bravo4, bravo6));
        this.f3868n = bravo7;
        this.f3869o = dagger.internal.a.bravo(new G(addressStyleModule, bravo3, bravo4, bravo7, bravo6));
    }

    @Override // com.checkout.address.di.AddressDIComponent
    public final Mapper addressFieldMapper() {
        return (Mapper) this.f3865k.get();
    }

    @Override // com.checkout.address.di.AddressDIComponent
    public final AddressValidator addressValidator() {
        AddressValidatorModule addressValidatorModule = this.f3857b;
        ResourceProvider resourceProvider = (ResourceProvider) this.f3863i.get();
        Intrinsics.echo(resourceProvider, "resourceProvider");
        RequiredValidator requiredValidator = new RequiredValidator(resourceProvider);
        ResourceProvider resourceProvider2 = (ResourceProvider) this.f3863i.get();
        Intrinsics.echo(resourceProvider2, "resourceProvider");
        LengthValidator lengthValidator = new LengthValidator(resourceProvider2);
        EmailFormatValidator emailFormatValidator = this.f3857b.emailFormatValidator((ResourceProvider) this.f3863i.get());
        AbstractC2763s0.delta(emailFormatValidator);
        ResourceProvider resourceProvider3 = (ResourceProvider) this.f3863i.get();
        Intrinsics.echo(resourceProvider3, "resourceProvider");
        AddressValidator provideAddressValidator = addressValidatorModule.provideAddressValidator(requiredValidator, lengthValidator, emailFormatValidator, new PhoneFormatValidator(resourceProvider3));
        AbstractC2763s0.delta(provideAddressValidator);
        return provideAddressValidator;
    }

    @Override // com.checkout.address.di.AddressDIComponent
    public final Mapper buttonStateMapper() {
        return new ButtonStyleToInternalStateMapper(new TextLabelStyleToStateMapper());
    }

    @Override // com.checkout.address.di.AddressDIComponent
    public final Mapper buttonStyleMapper() {
        Mapper<ButtonStyle, InternalButtonViewStyle> provideButtonStyleMapper = this.f3856a.provideButtonStyleMapper(new TextLabelStyleToViewStyleMapper(), new ContainerStyleToModifierMapper());
        AbstractC2763s0.delta(provideButtonStyleMapper);
        return provideButtonStyleMapper;
    }

    @Override // com.checkout.address.di.AddressDIComponent
    public final CountryPickerStyleUtils countryPickerStyleUtils() {
        return (CountryPickerStyleUtils) this.f3868n.get();
    }

    @Override // com.checkout.address.di.AddressDIComponent
    public final Mapper inputFieldStateMapper() {
        return new InputFieldStyleToInputFieldStateMapper(new ImageStyleToComposableImageMapper());
    }

    @Override // com.checkout.address.di.AddressDIComponent
    public final Mapper inputFieldStyleMapper() {
        return new InputFieldStyleToViewStyleMapper(new TextLabelStyleToViewStyleMapper());
    }

    @Override // com.checkout.address.di.AddressDIComponent
    public final boolean isRTL() {
        RTLModule rTLModule = this.f3859d;
        Context context = this.f3858c;
        rTLModule.getClass();
        Intrinsics.echo(context, "context");
        return Utils.INSTANCE.isRtl(context);
    }

    @Override // com.checkout.address.di.AddressDIComponent
    public final ResourceProvider resourceProvider() {
        return (ResourceProvider) this.f3863i.get();
    }

    @Override // com.checkout.address.di.AddressDIComponent
    public final StyleUtils styleUtils() {
        return (StyleUtils) this.f3869o.get();
    }

    @Override // com.checkout.address.di.AddressDIComponent
    public final TextLabelStyleToStateMapper textLabelStateMapper() {
        return new TextLabelStyleToStateMapper();
    }

    @Override // com.checkout.address.di.AddressDIComponent
    public final Mapper textLabelViewStyleMapper() {
        return new TextLabelStyleToViewStyleMapper();
    }
}
