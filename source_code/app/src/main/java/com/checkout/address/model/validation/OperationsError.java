package com.checkout.address.model.validation;

import com.checkout.components.address.R;
import com.checkout.components.interfaces.error.model.BaseOperationsError;
import com.checkout.components.interfaces.ui.ResourceProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/checkout/address/model/validation/OperationsError;", "Lcom/checkout/components/interfaces/error/model/BaseOperationsError;", "RequiredFieldError", "MaxLengthError", "MinLengthError", "InvalidFormatEmailError", "Lcom/checkout/address/model/validation/OperationsError$InvalidFormatEmailError;", "Lcom/checkout/address/model/validation/OperationsError$MaxLengthError;", "Lcom/checkout/address/model/validation/OperationsError$MinLengthError;", "Lcom/checkout/address/model/validation/OperationsError$RequiredFieldError;", "address_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class OperationsError extends BaseOperationsError {
    public static final int $stable = BaseOperationsError.$stable;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/checkout/address/model/validation/OperationsError$InvalidFormatEmailError;", "Lcom/checkout/address/model/validation/OperationsError;", "resourceProvider", "Lcom/checkout/components/interfaces/ui/ResourceProvider;", "<init>", "(Lcom/checkout/components/interfaces/ui/ResourceProvider;)V", "address_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class InvalidFormatEmailError extends OperationsError {
        public static final int $stable = BaseOperationsError.$stable;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InvalidFormatEmailError(@NotNull ResourceProvider resourceProvider) {
            super(resourceProvider.getString(R.string.cko_form_email_format_invalid), null);
            Intrinsics.echo(resourceProvider, "resourceProvider");
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/checkout/address/model/validation/OperationsError$MaxLengthError;", "Lcom/checkout/address/model/validation/OperationsError;", "resourceProvider", "Lcom/checkout/components/interfaces/ui/ResourceProvider;", "maxLength", "", "<init>", "(Lcom/checkout/components/interfaces/ui/ResourceProvider;I)V", "address_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class MaxLengthError extends OperationsError {
        public static final int $stable = BaseOperationsError.$stable;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MaxLengthError(@NotNull ResourceProvider resourceProvider, int i4) {
            super(resourceProvider.getString(R.string.cko_form_exceed_character_limit, String.valueOf(i4)), null);
            Intrinsics.echo(resourceProvider, "resourceProvider");
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/checkout/address/model/validation/OperationsError$MinLengthError;", "Lcom/checkout/address/model/validation/OperationsError;", "resourceProvider", "Lcom/checkout/components/interfaces/ui/ResourceProvider;", "<init>", "(Lcom/checkout/components/interfaces/ui/ResourceProvider;)V", "address_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class MinLengthError extends OperationsError {
        public static final int $stable = BaseOperationsError.$stable;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MinLengthError(@NotNull ResourceProvider resourceProvider) {
            super(resourceProvider.getString(R.string.cko_form_insufficient_characters), null);
            Intrinsics.echo(resourceProvider, "resourceProvider");
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/checkout/address/model/validation/OperationsError$RequiredFieldError;", "Lcom/checkout/address/model/validation/OperationsError;", "resourceProvider", "Lcom/checkout/components/interfaces/ui/ResourceProvider;", "<init>", "(Lcom/checkout/components/interfaces/ui/ResourceProvider;)V", "address_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class RequiredFieldError extends OperationsError {
        public static final int $stable = BaseOperationsError.$stable;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RequiredFieldError(@NotNull ResourceProvider resourceProvider) {
            super(resourceProvider.getString(com.checkout.components.ui.R.string.cko_form_required), null);
            Intrinsics.echo(resourceProvider, "resourceProvider");
        }
    }

    public OperationsError(String str, DefaultConstructorMarker defaultConstructorMarker) {
        super(str);
    }
}
