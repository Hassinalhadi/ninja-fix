package com.checkout.address.validator;

import android.util.Patterns;
import com.checkout.address.model.validation.FieldValidationRequest;
import com.checkout.address.model.validation.OperationsError;
import com.checkout.address.model.validation.contract.FieldValidator;
import com.checkout.components.interfaces.operations.ValidationResult;
import com.checkout.components.interfaces.ui.ResourceProvider;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/checkout/address/validator/EmailFormatValidator;", "Lcom/checkout/address/model/validation/contract/FieldValidator;", "Ljava/util/regex/Pattern;", "emailPattern", "Lcom/checkout/components/interfaces/ui/ResourceProvider;", "resourceProvider", "<init>", "(Ljava/util/regex/Pattern;Lcom/checkout/components/interfaces/ui/ResourceProvider;)V", "Lcom/checkout/address/model/validation/FieldValidationRequest;", "request", "Lcom/checkout/components/interfaces/operations/ValidationResult;", "", "validate", "(Lcom/checkout/address/model/validation/FieldValidationRequest;)Lcom/checkout/components/interfaces/operations/ValidationResult;", "address_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class EmailFormatValidator extends FieldValidator {
    public static final int $stable = 8;

    /* renamed from: a, reason: collision with root package name */
    private final Pattern f3840a;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ EmailFormatValidator(Pattern EMAIL_ADDRESS, ResourceProvider resourceProvider, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(EMAIL_ADDRESS, resourceProvider);
        if ((i4 & 1) != 0) {
            EMAIL_ADDRESS = Patterns.EMAIL_ADDRESS;
            Intrinsics.delta(EMAIL_ADDRESS, "EMAIL_ADDRESS");
        }
    }

    @Override // com.checkout.address.model.validation.contract.FieldValidator
    @NotNull
    public final ValidationResult<Unit> validate(@NotNull FieldValidationRequest request) {
        Intrinsics.echo(request, "request");
        if (StringsKt.gray(request.getInputValue())) {
            return new ValidationResult.Success(Unit.INSTANCE);
        }
        if (!this.f3840a.matcher(request.getInputValue()).matches()) {
            return new ValidationResult.Failure(new OperationsError.InvalidFormatEmailError(getResourceProvider()));
        }
        return new ValidationResult.Success(Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmailFormatValidator(@NotNull Pattern emailPattern, @NotNull ResourceProvider resourceProvider) {
        super(resourceProvider);
        Intrinsics.echo(emailPattern, "emailPattern");
        Intrinsics.echo(resourceProvider, "resourceProvider");
        this.f3840a = emailPattern;
    }
}
