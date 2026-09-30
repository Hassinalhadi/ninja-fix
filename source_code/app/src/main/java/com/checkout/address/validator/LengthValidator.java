package com.checkout.address.validator;

import com.checkout.address.model.validation.FieldValidationRequest;
import com.checkout.address.model.validation.OperationsError;
import com.checkout.address.model.validation.contract.FieldValidator;
import com.checkout.components.interfaces.operations.ValidationResult;
import com.checkout.components.interfaces.ui.ResourceProvider;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\nH\u0016¨\u0006\u000b"}, d2 = {"Lcom/checkout/address/validator/LengthValidator;", "Lcom/checkout/address/model/validation/contract/FieldValidator;", "resourceProvider", "Lcom/checkout/components/interfaces/ui/ResourceProvider;", "<init>", "(Lcom/checkout/components/interfaces/ui/ResourceProvider;)V", "validate", "Lcom/checkout/components/interfaces/operations/ValidationResult;", "", "request", "Lcom/checkout/address/model/validation/FieldValidationRequest;", "address_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LengthValidator extends FieldValidator {
    public static final int $stable = ResourceProvider.$stable;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LengthValidator(@NotNull ResourceProvider resourceProvider) {
        super(resourceProvider);
        Intrinsics.echo(resourceProvider, "resourceProvider");
    }

    @Override // com.checkout.address.model.validation.contract.FieldValidator
    @NotNull
    public final ValidationResult<Unit> validate(@NotNull FieldValidationRequest request) {
        int intValue;
        Intrinsics.echo(request, "request");
        if (StringsKt.gray(request.getInputValue())) {
            return new ValidationResult.Success(Unit.INSTANCE);
        }
        Integer maxLength = request.getMaxLength();
        if (maxLength != null && request.getInputValue().length() > (intValue = maxLength.intValue())) {
            return new ValidationResult.Failure(new OperationsError.MaxLengthError(getResourceProvider(), intValue));
        }
        Integer minLength = request.getMinLength();
        if (minLength != null) {
            if (request.getInputValue().length() < minLength.intValue()) {
                return new ValidationResult.Failure(new OperationsError.MinLengthError(getResourceProvider()));
            }
        }
        return new ValidationResult.Success(Unit.INSTANCE);
    }
}
