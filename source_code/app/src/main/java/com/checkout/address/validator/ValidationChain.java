package com.checkout.address.validator;

import com.checkout.address.model.validation.FieldValidationRequest;
import com.checkout.address.model.validation.contract.FieldValidator;
import com.checkout.components.interfaces.operations.ValidationResult;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/checkout/address/validator/ValidationChain;", "", "", "Lcom/checkout/address/model/validation/contract/FieldValidator;", "validators", "<init>", "(Ljava/util/List;)V", "Lcom/checkout/address/model/validation/FieldValidationRequest;", "request", "Lcom/checkout/components/interfaces/operations/ValidationResult;", "", "validate", "(Lcom/checkout/address/model/validation/FieldValidationRequest;)Lcom/checkout/components/interfaces/operations/ValidationResult;", "address_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ValidationChain {
    public static final int $stable = 8;

    /* renamed from: a, reason: collision with root package name */
    private final List f3841a;

    public ValidationChain(@NotNull List<? extends FieldValidator> validators) {
        Intrinsics.echo(validators, "validators");
        this.f3841a = validators;
    }

    @NotNull
    public final ValidationResult<Unit> validate(@NotNull FieldValidationRequest request) {
        Intrinsics.echo(request, "request");
        Iterator it = this.f3841a.iterator();
        while (it.hasNext()) {
            ValidationResult<Unit> validate = ((FieldValidator) it.next()).validate(request);
            if (validate instanceof ValidationResult.Failure) {
                return validate;
            }
        }
        return new ValidationResult.Success(Unit.INSTANCE);
    }
}
