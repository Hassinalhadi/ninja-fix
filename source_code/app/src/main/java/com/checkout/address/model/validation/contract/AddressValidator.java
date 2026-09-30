package com.checkout.address.model.validation.contract;

import androidx.annotation.Keep;
import com.checkout.components.interfaces.model.AddressField;
import com.checkout.components.interfaces.operations.ValidationResult;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\ba\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, d2 = {"Lcom/checkout/address/model/validation/contract/AddressValidator;", "", "validateField", "Lcom/checkout/components/interfaces/operations/ValidationResult;", "", "field", "Lcom/checkout/components/interfaces/model/AddressField;", "inputValue", "", "address_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface AddressValidator {
    @NotNull
    ValidationResult<Unit> validateField(@NotNull AddressField field, @NotNull String inputValue);
}
