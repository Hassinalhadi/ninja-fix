package com.checkout.address.validator;

import com.checkout.address.model.validation.FieldValidationRequest;
import com.checkout.address.model.validation.contract.AddressValidator;
import com.checkout.components.interfaces.model.AddressField;
import com.checkout.components.interfaces.operations.ValidationResult;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.ab;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/checkout/address/validator/AddressValidatorImpl;", "Lcom/checkout/address/model/validation/contract/AddressValidator;", "Lcom/checkout/address/validator/RequiredValidator;", "requiredValidator", "Lcom/checkout/address/validator/LengthValidator;", "lengthValidator", "Lcom/checkout/address/validator/EmailFormatValidator;", "emailFormatValidator", "Lcom/checkout/address/validator/PhoneFormatValidator;", "phoneFormatValidator", "<init>", "(Lcom/checkout/address/validator/RequiredValidator;Lcom/checkout/address/validator/LengthValidator;Lcom/checkout/address/validator/EmailFormatValidator;Lcom/checkout/address/validator/PhoneFormatValidator;)V", "Lcom/checkout/components/interfaces/model/AddressField;", "field", "", "inputValue", "Lcom/checkout/components/interfaces/operations/ValidationResult;", "", "validateField", "(Lcom/checkout/components/interfaces/model/AddressField;Ljava/lang/String;)Lcom/checkout/components/interfaces/operations/ValidationResult;", "address_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AddressValidatorImpl implements AddressValidator {
    public static final int $stable = 8;

    /* renamed from: a, reason: collision with root package name */
    private final LinkedHashMap f3839a;

    public AddressValidatorImpl(@NotNull RequiredValidator requiredValidator, @NotNull LengthValidator lengthValidator, @NotNull EmailFormatValidator emailFormatValidator, @NotNull PhoneFormatValidator phoneFormatValidator) {
        Intrinsics.echo(requiredValidator, "requiredValidator");
        Intrinsics.echo(lengthValidator, "lengthValidator");
        Intrinsics.echo(emailFormatValidator, "emailFormatValidator");
        Intrinsics.echo(phoneFormatValidator, "phoneFormatValidator");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f3839a = linkedHashMap;
        List juliet = ab.juliet(requiredValidator);
        linkedHashMap.put(AddressField.Email.class, new ValidationChain(CollectionsKt.a(juliet, CollectionsKt.listOf(lengthValidator, emailFormatValidator))));
        linkedHashMap.put(AddressField.Phone.class, new ValidationChain(CollectionsKt.a(juliet, CollectionsKt.listOf(lengthValidator, phoneFormatValidator))));
        linkedHashMap.put(AddressField.AddressLine1.class, new ValidationChain(CollectionsKt.a(juliet, ab.juliet(lengthValidator))));
        linkedHashMap.put(AddressField.AddressLine2.class, new ValidationChain(CollectionsKt.a(juliet, ab.juliet(lengthValidator))));
        linkedHashMap.put(AddressField.City.class, new ValidationChain(CollectionsKt.a(juliet, ab.juliet(lengthValidator))));
        linkedHashMap.put(AddressField.State.class, new ValidationChain(CollectionsKt.a(juliet, ab.juliet(lengthValidator))));
        linkedHashMap.put(AddressField.Zip.class, new ValidationChain(CollectionsKt.a(juliet, ab.juliet(lengthValidator))));
        linkedHashMap.put(AddressField.FirstName.class, new ValidationChain(CollectionsKt.a(juliet, ab.juliet(lengthValidator))));
        linkedHashMap.put(AddressField.LastName.class, new ValidationChain(CollectionsKt.a(juliet, ab.juliet(lengthValidator))));
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008a  */
    @Override // com.checkout.address.model.validation.contract.AddressValidator
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ValidationResult<Unit> validateField(@NotNull AddressField field, @NotNull String inputValue) {
        int i4;
        Integer num;
        Intrinsics.echo(field, "field");
        Intrinsics.echo(inputValue, "inputValue");
        ValidationChain validationChain = (ValidationChain) this.f3839a.get(field.getClass());
        if (validationChain == null) {
            return new ValidationResult.Success(Unit.INSTANCE);
        }
        Integer num2 = null;
        int i5 = 9;
        if (!(field instanceof AddressField.AddressLine1) && !(field instanceof AddressField.AddressLine2)) {
            int i10 = 50;
            if (!(field instanceof AddressField.City) && !(field instanceof AddressField.State)) {
                if (field instanceof AddressField.Zip) {
                    if (((AddressField.Zip) field).isNumberOnly()) {
                        i10 = 9;
                    }
                    i4 = Integer.valueOf(i10);
                } else if (!(field instanceof AddressField.FirstName) && !(field instanceof AddressField.LastName)) {
                    if (field instanceof AddressField.Email) {
                        i4 = 255;
                    } else if (field instanceof AddressField.Phone) {
                        i4 = 25;
                    } else {
                        num = null;
                        if (!(field instanceof AddressField.Phone)) {
                            num2 = 6;
                        } else if ((field instanceof AddressField.Zip) && ((AddressField.Zip) field).isNumberOnly()) {
                            int length = inputValue.length();
                            if (length < 5 || 6 > length || length >= 10) {
                                i5 = 5;
                            }
                            num2 = Integer.valueOf(i5);
                        }
                        return validationChain.validate(new FieldValidationRequest(inputValue, field, num, num2, field.getIsOptional()));
                    }
                } else {
                    i4 = 300;
                }
            } else {
                i4 = 50;
            }
        } else {
            i4 = 200;
        }
        num = i4;
        if (!(field instanceof AddressField.Phone)) {
        }
        return validationChain.validate(new FieldValidationRequest(inputValue, field, num, num2, field.getIsOptional()));
    }
}
