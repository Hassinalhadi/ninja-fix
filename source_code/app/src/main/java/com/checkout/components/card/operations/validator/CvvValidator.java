package com.checkout.components.card.operations.validator;

import com.checkout.components.card.operations.model.CvvValidationRequest;
import com.checkout.components.card.operations.validator.contract.Validator;
import com.checkout.components.interfaces.operations.ValidationResult;
import com.checkout.components.interfaces.ui.ResourceProvider;
import com.checkout.components.ui.R;
import com.checkout.components.ui.model.error.ValidationError;
import com.clevertap.android.sdk.db.Column;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\t2\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/checkout/components/card/operations/validator/CvvValidator;", "Lcom/checkout/components/card/operations/validator/contract/Validator;", "Lcom/checkout/components/card/operations/model/CvvValidationRequest;", "", "Lcom/checkout/components/interfaces/ui/ResourceProvider;", "resourceProvider", "<init>", "(Lcom/checkout/components/interfaces/ui/ResourceProvider;)V", Column.DATA, "Lcom/checkout/components/interfaces/operations/ValidationResult;", "validate", "(Lcom/checkout/components/card/operations/model/CvvValidationRequest;)Lcom/checkout/components/interfaces/operations/ValidationResult;", "card_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CvvValidator implements Validator<CvvValidationRequest, Unit> {
    public static final int $stable = ResourceProvider.$stable;

    /* renamed from: a, reason: collision with root package name */
    private final ResourceProvider f4381a;

    public CvvValidator(@NotNull ResourceProvider resourceProvider) {
        Intrinsics.echo(resourceProvider, "resourceProvider");
        this.f4381a = resourceProvider;
    }

    @Override // com.checkout.components.card.operations.validator.contract.Validator
    @NotNull
    public final ValidationResult<Unit> validate(@NotNull CvvValidationRequest data) {
        Intrinsics.echo(data, "data");
        if (data.getCardScheme().getCvvLength().contains(Integer.valueOf(data.getCvv().length()))) {
            String cvv = data.getCvv();
            for (int i4 = 0; i4 < cvv.length(); i4++) {
                if (Character.isDigit(cvv.charAt(i4))) {
                }
            }
            return new ValidationResult.Success(Unit.INSTANCE);
        }
        return new ValidationResult.Failure(new ValidationError(ValidationError.CVV_INVALID_LENGTH, this.f4381a.getString(R.string.cko_card_security_code_invalid)));
    }
}
