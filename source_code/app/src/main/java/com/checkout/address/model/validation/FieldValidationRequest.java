package com.checkout.address.model.validation;

import Q0.c;
import com.checkout.components.interfaces.model.AddressField;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\"\b\u0081\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015JF\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u000eJ\u0010\u0010\u0019\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001c\u001a\u00020\t2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\u0010R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010\u0012R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b'\u0010%\u001a\u0004\b(\u0010\u0012R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b\n\u0010\u0015¨\u0006+"}, d2 = {"Lcom/checkout/address/model/validation/FieldValidationRequest;", "", "", "inputValue", "Lcom/checkout/components/interfaces/model/AddressField;", "fieldType", "", "maxLength", "minLength", "", "isOptional", "<init>", "(Ljava/lang/String;Lcom/checkout/components/interfaces/model/AddressField;Ljava/lang/Integer;Ljava/lang/Integer;Z)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/checkout/components/interfaces/model/AddressField;", "component3", "()Ljava/lang/Integer;", "component4", "component5", "()Z", Constants.COPY_TYPE, "(Ljava/lang/String;Lcom/checkout/components/interfaces/model/AddressField;Ljava/lang/Integer;Ljava/lang/Integer;Z)Lcom/checkout/address/model/validation/FieldValidationRequest;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getInputValue", "b", "Lcom/checkout/components/interfaces/model/AddressField;", "getFieldType", "c", "Ljava/lang/Integer;", "getMaxLength", Constants.INAPP_DATA_TAG, "getMinLength", "e", "Z", "address_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class FieldValidationRequest {
    public static final int $stable = AddressField.$stable;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String inputValue;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final AddressField fieldType;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Integer maxLength;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Integer minLength;

    /* renamed from: e, reason: from kotlin metadata */
    private final boolean isOptional;

    public FieldValidationRequest(@NotNull String inputValue, @NotNull AddressField fieldType, @Nullable Integer num, @Nullable Integer num2, boolean z2) {
        Intrinsics.echo(inputValue, "inputValue");
        Intrinsics.echo(fieldType, "fieldType");
        this.inputValue = inputValue;
        this.fieldType = fieldType;
        this.maxLength = num;
        this.minLength = num2;
        this.isOptional = z2;
    }

    public static /* synthetic */ FieldValidationRequest copy$default(FieldValidationRequest fieldValidationRequest, String str, AddressField addressField, Integer num, Integer num2, boolean z2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = fieldValidationRequest.inputValue;
        }
        if ((i4 & 2) != 0) {
            addressField = fieldValidationRequest.fieldType;
        }
        if ((i4 & 4) != 0) {
            num = fieldValidationRequest.maxLength;
        }
        if ((i4 & 8) != 0) {
            num2 = fieldValidationRequest.minLength;
        }
        if ((i4 & 16) != 0) {
            z2 = fieldValidationRequest.isOptional;
        }
        boolean z10 = z2;
        Integer num3 = num;
        return fieldValidationRequest.copy(str, addressField, num3, num2, z10);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getInputValue() {
        return this.inputValue;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final AddressField getFieldType() {
        return this.fieldType;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Integer getMaxLength() {
        return this.maxLength;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final Integer getMinLength() {
        return this.minLength;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsOptional() {
        return this.isOptional;
    }

    @NotNull
    public final FieldValidationRequest copy(@NotNull String inputValue, @NotNull AddressField fieldType, @Nullable Integer maxLength, @Nullable Integer minLength, boolean isOptional) {
        Intrinsics.echo(inputValue, "inputValue");
        Intrinsics.echo(fieldType, "fieldType");
        return new FieldValidationRequest(inputValue, fieldType, maxLength, minLength, isOptional);
    }

    public final boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FieldValidationRequest)) {
            return false;
        }
        FieldValidationRequest fieldValidationRequest = (FieldValidationRequest) other;
        return Intrinsics.areEqual(this.inputValue, fieldValidationRequest.inputValue) && Intrinsics.areEqual(this.fieldType, fieldValidationRequest.fieldType) && Intrinsics.areEqual(this.maxLength, fieldValidationRequest.maxLength) && Intrinsics.areEqual(this.minLength, fieldValidationRequest.minLength) && this.isOptional == fieldValidationRequest.isOptional;
    }

    @NotNull
    public final AddressField getFieldType() {
        return this.fieldType;
    }

    @NotNull
    public final String getInputValue() {
        return this.inputValue;
    }

    @Nullable
    public final Integer getMaxLength() {
        return this.maxLength;
    }

    @Nullable
    public final Integer getMinLength() {
        return this.minLength;
    }

    public final int hashCode() {
        int hashCode = (this.fieldType.hashCode() + (this.inputValue.hashCode() * 31)) * 31;
        Integer num = this.maxLength;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.minLength;
        return (this.isOptional ? 1231 : 1237) + ((hashCode2 + (num2 != null ? num2.hashCode() : 0)) * 31);
    }

    public final boolean isOptional() {
        return this.isOptional;
    }

    @NotNull
    public final String toString() {
        String str = this.inputValue;
        AddressField addressField = this.fieldType;
        Integer num = this.maxLength;
        Integer num2 = this.minLength;
        boolean z2 = this.isOptional;
        StringBuilder sb2 = new StringBuilder("FieldValidationRequest(inputValue=");
        sb2.append(str);
        sb2.append(", fieldType=");
        sb2.append(addressField);
        sb2.append(", maxLength=");
        sb2.append(num);
        sb2.append(", minLength=");
        sb2.append(num2);
        sb2.append(", isOptional=");
        return c.romeo(sb2, z2, ")");
    }

    public /* synthetic */ FieldValidationRequest(String str, AddressField addressField, Integer num, Integer num2, boolean z2, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, addressField, (i4 & 4) != 0 ? null : num, (i4 & 8) != 0 ? null : num2, (i4 & 16) != 0 ? false : z2);
    }
}
