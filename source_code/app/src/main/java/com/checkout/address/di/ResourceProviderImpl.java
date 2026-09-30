package com.checkout.address.di;

import android.content.Context;
import com.checkout.components.address.R;
import com.checkout.components.interfaces.localisation.ComponentTranslationKey;
import com.checkout.components.interfaces.ui.ResourceProvider;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\b\u0001\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u001a\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005j\u0004\u0018\u0001`\b¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\f\u001a\u00020\rH\u0016¨\u0006\u000e"}, d2 = {"Lcom/checkout/address/di/ResourceProviderImpl;", "Lcom/checkout/components/interfaces/ui/ResourceProvider;", "context", "Landroid/content/Context;", "translation", "", "Lcom/checkout/components/interfaces/localisation/ComponentTranslationKey;", "", "Lcom/checkout/components/interfaces/localisation/Translation;", "<init>", "(Landroid/content/Context;Ljava/util/Map;)V", "getTranslationKey", "resId", "", "address_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ResourceProviderImpl extends ResourceProvider {
    public static final int $stable = ResourceProvider.$stable;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ResourceProviderImpl(@NotNull Context context, @Nullable Map<ComponentTranslationKey, String> map) {
        super(context, map);
        Intrinsics.echo(context, "context");
    }

    @Override // com.checkout.components.interfaces.ui.ResourceProvider
    @Nullable
    public final ComponentTranslationKey getTranslationKey(int resId) {
        if (resId == R.string.cko_pay_button_confirm) {
            return ComponentTranslationKey.PayButtonConfirm;
        }
        if (resId == R.string.cko_form_last_name) {
            return ComponentTranslationKey.FormLastName;
        }
        if (resId == R.string.cko_form_first_name) {
            return ComponentTranslationKey.FormFirstName;
        }
        if (resId == R.string.cko_form_optional) {
            return ComponentTranslationKey.FormOptional;
        }
        if (resId == R.string.cko_form_exceed_character_limit) {
            return ComponentTranslationKey.FormExceedCharacterLimit;
        }
        if (resId == R.string.cko_form_email_format_invalid) {
            return ComponentTranslationKey.FormEmailFormatInvalid;
        }
        if (resId == R.string.cko_form_insufficient_characters) {
            return ComponentTranslationKey.FormInsufficientCharacters;
        }
        if (resId == com.checkout.components.ui.R.string.cko_form_required) {
            return ComponentTranslationKey.FormRequired;
        }
        if (resId == com.checkout.components.ui.R.string.cko_form_phone_number) {
            return ComponentTranslationKey.FormPhoneNumber;
        }
        if (resId == R.string.cko_form_add_address) {
            return ComponentTranslationKey.FormAddAddress;
        }
        if (resId == R.string.cko_form_billing_address) {
            return ComponentTranslationKey.FormBillingAddress;
        }
        if (resId == com.checkout.components.ui.R.string.cko_form_email) {
            return ComponentTranslationKey.FormEmail;
        }
        if (resId == R.string.cko_address_edit_address) {
            return ComponentTranslationKey.AddressEditAddress;
        }
        if (resId == R.string.cko_address_select_state) {
            return ComponentTranslationKey.AddressSelectState;
        }
        if (resId == R.string.cko_address_billing_add) {
            return ComponentTranslationKey.AddressBillingAdd;
        }
        if (resId == R.string.cko_address_address_line1) {
            return ComponentTranslationKey.AddressAddressLine1;
        }
        if (resId == R.string.cko_address_address_line2) {
            return ComponentTranslationKey.AddressAddressLine2;
        }
        if (resId == R.string.cko_address_city) {
            return ComponentTranslationKey.AddressCity;
        }
        if (resId == R.string.cko_address_state) {
            return ComponentTranslationKey.AddressState;
        }
        if (resId == R.string.cko_address_zip) {
            return ComponentTranslationKey.AddressZip;
        }
        if (resId == R.string.cko_form_address) {
            return ComponentTranslationKey.FormAddress;
        }
        if (resId == R.string.cko_address_country) {
            return ComponentTranslationKey.AddressCountry;
        }
        return null;
    }
}
