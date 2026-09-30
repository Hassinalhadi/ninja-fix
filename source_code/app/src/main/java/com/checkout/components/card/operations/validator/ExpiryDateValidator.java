package com.checkout.components.card.operations.validator;

import com.checkout.components.card.R;
import com.checkout.components.card.operations.model.ExpiryDate;
import com.checkout.components.card.operations.validator.contract.Validator;
import com.checkout.components.interfaces.operations.ValidationResult;
import com.checkout.components.interfaces.ui.ResourceProvider;
import com.checkout.components.ui.model.error.ValidationError;
import com.clevertap.android.sdk.db.Column;
import fe.C1713e;
import fe.C1715g;
import java.util.Calendar;
import java.util.Date;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.n;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.r;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\t2\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/checkout/components/card/operations/validator/ExpiryDateValidator;", "Lcom/checkout/components/card/operations/validator/contract/Validator;", "Lcom/checkout/components/card/operations/validator/ExpiryDateValidationRequest;", "", "Lcom/checkout/components/interfaces/ui/ResourceProvider;", "resourceProvider", "<init>", "(Lcom/checkout/components/interfaces/ui/ResourceProvider;)V", Column.DATA, "Lcom/checkout/components/interfaces/operations/ValidationResult;", "validate", "(Lcom/checkout/components/card/operations/validator/ExpiryDateValidationRequest;)Lcom/checkout/components/interfaces/operations/ValidationResult;", "card_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ExpiryDateValidator implements Validator<ExpiryDateValidationRequest, Unit> {
    public static final int $stable = 8;

    @Deprecated
    public static final int YEAR_LONG_DELTA = 2000;

    @Deprecated
    public static final int YEAR_LONG_FORMAT = 4;

    @Deprecated
    public static final int YEAR_SHORT_FORMAT = 2;

    /* renamed from: d */
    private static final C1715g f4384d = new C1713e(1, 12, 1);

    /* renamed from: a */
    private final ResourceProvider f4385a;

    /* renamed from: b */
    private final Lazy f4386b;

    /* renamed from: c */
    private final Calendar f4387c;

    public ExpiryDateValidator(@NotNull ResourceProvider resourceProvider) {
        Intrinsics.echo(resourceProvider, "resourceProvider");
        this.f4385a = resourceProvider;
        this.f4386b = LazyKt.lazy(new n(16, this));
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        this.f4387c = calendar;
    }

    public static final ValidationError a(ExpiryDateValidator expiryDateValidator) {
        return new ValidationError(ValidationError.INVALID_EXPIRY_DATE, expiryDateValidator.f4385a.getString(R.string.cko_card_expiry_date_incomplete));
    }

    public static /* synthetic */ ValidationError alpha(ExpiryDateValidator expiryDateValidator) {
        return a(expiryDateValidator);
    }

    @Override // com.checkout.components.card.operations.validator.contract.Validator
    @NotNull
    public final ValidationResult<Unit> validate(@NotNull ExpiryDateValidationRequest r62) {
        Intrinsics.echo(r62, "data");
        try {
            Integer tango = r.tango(r62.getMonth());
            if (tango != null && f4384d.alpha(tango.intValue())) {
                ExpiryDate expiryDate = new ExpiryDate(tango.intValue(), a(r62.getYear()));
                int month = expiryDate.getMonth();
                int year = expiryDate.getYear();
                int i4 = this.f4387c.get(1);
                int i5 = this.f4387c.get(2) + 1;
                if (year >= i4 && (year != i4 || month >= i5)) {
                    return new ValidationResult.Success(Unit.INSTANCE);
                }
                throw new ValidationError(ValidationError.EXPIRY_DATE_IN_PAST, this.f4385a.getString(R.string.cko_card_expiry_date_invalid));
            }
            throw ((ValidationError) this.f4386b.getValue());
        } catch (ValidationError e) {
            return new ValidationResult.Failure(e);
        }
    }

    private final int a(String str) {
        Integer tango = r.tango(str);
        if (tango != null) {
            if (tango.intValue() < 0) {
                tango = null;
            }
            if (tango != null) {
                int intValue = tango.intValue();
                String a6 = StringsKt.a(2, String.valueOf(this.f4387c.get(1)));
                if ((str.length() == 1 && Intrinsics.golf(StringsKt.crimson(str), StringsKt.crimson(a6)) < 0) || str.length() == 2) {
                    return intValue + 2000;
                }
                if (str.length() == 4) {
                    return intValue;
                }
                throw ((ValidationError) this.f4386b.getValue());
            }
        }
        throw ((ValidationError) this.f4386b.getValue());
    }
}
