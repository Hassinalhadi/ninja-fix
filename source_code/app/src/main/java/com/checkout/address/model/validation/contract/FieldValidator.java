package com.checkout.address.model.validation.contract;

import androidx.annotation.Keep;
import com.checkout.address.model.validation.FieldValidationRequest;
import com.checkout.components.interfaces.operations.ValidationResult;
import com.checkout.components.interfaces.ui.ResourceProvider;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b!\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\fH&R\u0014\u0010\u0002\u001a\u00020\u0003X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\r"}, d2 = {"Lcom/checkout/address/model/validation/contract/FieldValidator;", "", "resourceProvider", "Lcom/checkout/components/interfaces/ui/ResourceProvider;", "<init>", "(Lcom/checkout/components/interfaces/ui/ResourceProvider;)V", "getResourceProvider", "()Lcom/checkout/components/interfaces/ui/ResourceProvider;", "validate", "Lcom/checkout/components/interfaces/operations/ValidationResult;", "", "request", "Lcom/checkout/address/model/validation/FieldValidationRequest;", "address_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class FieldValidator {
    public static final int $stable = ResourceProvider.$stable;

    @NotNull
    private final ResourceProvider resourceProvider;

    public FieldValidator(@NotNull ResourceProvider resourceProvider) {
        Intrinsics.echo(resourceProvider, "resourceProvider");
        this.resourceProvider = resourceProvider;
    }

    @NotNull
    public final ResourceProvider getResourceProvider() {
        return this.resourceProvider;
    }

    @NotNull
    public abstract ValidationResult<Unit> validate(@NotNull FieldValidationRequest request);
}
