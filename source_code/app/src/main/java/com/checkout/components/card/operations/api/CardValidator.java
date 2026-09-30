package com.checkout.components.card.operations.api;

import com.checkout.components.interfaces.operations.ValidationResult;
import com.checkout.components.rememberme.utils.Constants;
import com.checkout.components.ui.model.CardScheme;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b`\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H&J\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH&J\u001c\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\r2\u0006\u0010\u000e\u001a\u00020\u0006H&J*\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032\u0006\u0010\u0010\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0006H&J*\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032\u0006\u0010\u0010\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0006H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0014À\u0006\u0001"}, d2 = {"Lcom/checkout/components/card/operations/api/CardValidator;", "", "validateExpiryDate", "Lcom/checkout/components/interfaces/operations/ValidationResult;", "", "month", "", "year", "validateCvv", Constants.CVV_TYPE, "cardScheme", "Lcom/checkout/components/ui/model/CardScheme;", "extractDateToMonthAndYear", "Lkotlin/Pair;", com.clevertap.android.sdk.Constants.KEY_DATE, "validateFullCardNumber", "cardNumber", "metadataScheme", "metadataSchemeLocal", "validatePartialCardNumber", "card_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface CardValidator {
    @NotNull
    Pair<String, String> extractDateToMonthAndYear(@NotNull String date);

    @NotNull
    ValidationResult<Unit> validateCvv(@NotNull String cvv, @NotNull CardScheme cardScheme);

    @NotNull
    ValidationResult<Unit> validateExpiryDate(@NotNull String month, @NotNull String year);

    @NotNull
    ValidationResult<CardScheme> validateFullCardNumber(@NotNull String cardNumber, @Nullable String metadataScheme, @Nullable String metadataSchemeLocal);

    @NotNull
    ValidationResult<CardScheme> validatePartialCardNumber(@NotNull String cardNumber, @Nullable String metadataScheme, @Nullable String metadataSchemeLocal);
}
