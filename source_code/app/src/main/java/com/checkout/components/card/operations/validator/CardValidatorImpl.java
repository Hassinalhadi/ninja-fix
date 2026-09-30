package com.checkout.components.card.operations.validator;

import com.checkout.components.card.model.CardNumberValidationRequest;
import com.checkout.components.card.operations.api.CardValidator;
import com.checkout.components.card.operations.model.CvvValidationRequest;
import com.checkout.components.card.operations.validator.contract.Validator;
import com.checkout.components.card.utils.constants.ExpiryDateConstantsKt;
import com.checkout.components.card.utils.extensions.StringExtensionsKt;
import com.checkout.components.interfaces.operations.ValidationResult;
import com.checkout.components.rememberme.utils.Constants;
import com.checkout.components.ui.model.CardScheme;
import com.checkout.components.ui.utils.extensions.CardSchemeExtensionsKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u0001BC\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0002¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J%\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u00102\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J#\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\u00182\u0006\u0010\u0017\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ1\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\t0\u00102\u0006\u0010\u001b\u001a\u00020\r2\b\u0010\u001c\u001a\u0004\u0018\u00010\r2\b\u0010\u001d\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ1\u0010 \u001a\b\u0012\u0004\u0012\u00020\t0\u00102\u0006\u0010\u001b\u001a\u00020\r2\b\u0010\u001c\u001a\u0004\u0018\u00010\r2\b\u0010\u001d\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b \u0010\u001f¨\u0006!"}, d2 = {"Lcom/checkout/components/card/operations/validator/CardValidatorImpl;", "Lcom/checkout/components/card/operations/api/CardValidator;", "Lcom/checkout/components/card/operations/validator/contract/Validator;", "Lcom/checkout/components/card/operations/validator/ExpiryDateValidationRequest;", "", "expiryDateValidator", "Lcom/checkout/components/card/operations/model/CvvValidationRequest;", "cvvValidator", "Lcom/checkout/components/card/model/CardNumberValidationRequest;", "Lcom/checkout/components/ui/model/CardScheme;", "cardNumberValidator", "<init>", "(Lcom/checkout/components/card/operations/validator/contract/Validator;Lcom/checkout/components/card/operations/validator/contract/Validator;Lcom/checkout/components/card/operations/validator/contract/Validator;)V", "", "month", "year", "Lcom/checkout/components/interfaces/operations/ValidationResult;", "validateExpiryDate", "(Ljava/lang/String;Ljava/lang/String;)Lcom/checkout/components/interfaces/operations/ValidationResult;", Constants.CVV_TYPE, "cardScheme", "validateCvv", "(Ljava/lang/String;Lcom/checkout/components/ui/model/CardScheme;)Lcom/checkout/components/interfaces/operations/ValidationResult;", com.clevertap.android.sdk.Constants.KEY_DATE, "Lkotlin/Pair;", "extractDateToMonthAndYear", "(Ljava/lang/String;)Lkotlin/Pair;", "cardNumber", "metadataScheme", "metadataSchemeLocal", "validateFullCardNumber", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/checkout/components/interfaces/operations/ValidationResult;", "validatePartialCardNumber", "card_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CardValidatorImpl implements CardValidator {
    public static final int $stable = 0;

    /* renamed from: a, reason: collision with root package name */
    private final Validator f4378a;

    /* renamed from: b, reason: collision with root package name */
    private final Validator f4379b;

    /* renamed from: c, reason: collision with root package name */
    private final Validator f4380c;

    public CardValidatorImpl(@NotNull Validator<ExpiryDateValidationRequest, Unit> expiryDateValidator, @NotNull Validator<CvvValidationRequest, Unit> cvvValidator, @NotNull Validator<CardNumberValidationRequest, CardScheme> cardNumberValidator) {
        Intrinsics.echo(expiryDateValidator, "expiryDateValidator");
        Intrinsics.echo(cvvValidator, "cvvValidator");
        Intrinsics.echo(cardNumberValidator, "cardNumberValidator");
        this.f4378a = expiryDateValidator;
        this.f4379b = cvvValidator;
        this.f4380c = cardNumberValidator;
    }

    @Override // com.checkout.components.card.operations.api.CardValidator
    @NotNull
    public final Pair<String, String> extractDateToMonthAndYear(@NotNull String date) {
        Pair pair;
        Intrinsics.echo(date, "date");
        if (!StringExtensionsKt.isSingleDigitMonthPrefix(date) && !StringExtensionsKt.isInvalidTeenMonthPrefix(date)) {
            pair = new Pair(StringsKt.yellow(2, date), StringExtensionsKt.dropSafe(date, 2, ExpiryDateConstantsKt.EXPIRY_DATE_PREFIX_ZERO));
        } else {
            pair = new Pair(ExpiryDateConstantsKt.EXPIRY_DATE_PREFIX_ZERO.concat(StringsKt.yellow(1, date)), StringExtensionsKt.dropSafe(date, 1, ExpiryDateConstantsKt.EXPIRY_DATE_PREFIX_ZERO));
        }
        return new Pair<>((String) pair.first, (String) pair.second);
    }

    @Override // com.checkout.components.card.operations.api.CardValidator
    @NotNull
    public final ValidationResult<Unit> validateCvv(@NotNull String cvv, @NotNull CardScheme cardScheme) {
        Intrinsics.echo(cvv, "cvv");
        Intrinsics.echo(cardScheme, "cardScheme");
        return this.f4379b.validate(new CvvValidationRequest(cvv, cardScheme));
    }

    @Override // com.checkout.components.card.operations.api.CardValidator
    @NotNull
    public final ValidationResult<Unit> validateExpiryDate(@NotNull String month, @NotNull String year) {
        Intrinsics.echo(month, "month");
        Intrinsics.echo(year, "year");
        return this.f4378a.validate(new ExpiryDateValidationRequest(month, year));
    }

    @Override // com.checkout.components.card.operations.api.CardValidator
    @NotNull
    public final ValidationResult<CardScheme> validateFullCardNumber(@NotNull String cardNumber, @Nullable String metadataScheme, @Nullable String metadataSchemeLocal) {
        CardScheme cardScheme;
        Intrinsics.echo(cardNumber, "cardNumber");
        Validator validator = this.f4380c;
        CardScheme cardScheme2 = null;
        if (metadataScheme != null) {
            cardScheme = CardSchemeExtensionsKt.toCardScheme(metadataScheme);
        } else {
            cardScheme = null;
        }
        if (metadataSchemeLocal != null) {
            cardScheme2 = CardSchemeExtensionsKt.toCardScheme(metadataSchemeLocal);
        }
        return validator.validate(new CardNumberValidationRequest(cardNumber, false, cardScheme, cardScheme2));
    }

    @Override // com.checkout.components.card.operations.api.CardValidator
    @NotNull
    public final ValidationResult<CardScheme> validatePartialCardNumber(@NotNull String cardNumber, @Nullable String metadataScheme, @Nullable String metadataSchemeLocal) {
        CardScheme cardScheme;
        Intrinsics.echo(cardNumber, "cardNumber");
        Validator validator = this.f4380c;
        CardScheme cardScheme2 = null;
        if (metadataScheme != null) {
            cardScheme = CardSchemeExtensionsKt.toCardScheme(metadataScheme);
        } else {
            cardScheme = null;
        }
        if (metadataSchemeLocal != null) {
            cardScheme2 = CardSchemeExtensionsKt.toCardScheme(metadataSchemeLocal);
        }
        return validator.validate(new CardNumberValidationRequest(cardNumber, true, cardScheme, cardScheme2));
    }
}
