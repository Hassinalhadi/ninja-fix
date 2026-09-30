package com.checkout.address.di;

import com.checkout.address.model.validation.contract.AddressValidator;
import com.checkout.address.validator.AddressValidatorImpl;
import com.checkout.address.validator.EmailFormatValidator;
import com.checkout.address.validator.LengthValidator;
import com.checkout.address.validator.PhoneFormatValidator;
import com.checkout.address.validator.RequiredValidator;
import com.checkout.components.interfaces.ui.ResourceProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J(\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0007¨\u0006\u0010"}, d2 = {"Lcom/checkout/address/di/AddressValidatorModule;", "", "<init>", "()V", "requiredValidator", "Lcom/checkout/address/validator/RequiredValidator;", "resourceProvider", "Lcom/checkout/components/interfaces/ui/ResourceProvider;", "lengthValidator", "Lcom/checkout/address/validator/LengthValidator;", "emailFormatValidator", "Lcom/checkout/address/validator/EmailFormatValidator;", "phoneFormatValidator", "Lcom/checkout/address/validator/PhoneFormatValidator;", "provideAddressValidator", "Lcom/checkout/address/model/validation/contract/AddressValidator;", "address_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AddressValidatorModule {
    public static final int $stable = 0;

    @NotNull
    public final EmailFormatValidator emailFormatValidator(@NotNull ResourceProvider resourceProvider) {
        Intrinsics.echo(resourceProvider, "resourceProvider");
        return new EmailFormatValidator(null, resourceProvider, 1, null);
    }

    @NotNull
    public final LengthValidator lengthValidator(@NotNull ResourceProvider resourceProvider) {
        Intrinsics.echo(resourceProvider, "resourceProvider");
        return new LengthValidator(resourceProvider);
    }

    @NotNull
    public final PhoneFormatValidator phoneFormatValidator(@NotNull ResourceProvider resourceProvider) {
        Intrinsics.echo(resourceProvider, "resourceProvider");
        return new PhoneFormatValidator(resourceProvider);
    }

    @NotNull
    public final AddressValidator provideAddressValidator(@NotNull RequiredValidator requiredValidator, @NotNull LengthValidator lengthValidator, @NotNull EmailFormatValidator emailFormatValidator, @NotNull PhoneFormatValidator phoneFormatValidator) {
        Intrinsics.echo(requiredValidator, "requiredValidator");
        Intrinsics.echo(lengthValidator, "lengthValidator");
        Intrinsics.echo(emailFormatValidator, "emailFormatValidator");
        Intrinsics.echo(phoneFormatValidator, "phoneFormatValidator");
        return new AddressValidatorImpl(requiredValidator, lengthValidator, emailFormatValidator, phoneFormatValidator);
    }

    @NotNull
    public final RequiredValidator requiredValidator(@NotNull ResourceProvider resourceProvider) {
        Intrinsics.echo(resourceProvider, "resourceProvider");
        return new RequiredValidator(resourceProvider);
    }
}
