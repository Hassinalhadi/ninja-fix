package com.checkout.components.card.utils;

import android.content.Context;
import com.checkout.components.card.R;
import com.checkout.components.interfaces.localisation.ComponentTranslationKey;
import com.checkout.components.interfaces.ui.ResourceProvider;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\b\u0001\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u001a\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005j\u0004\u0018\u0001`\b¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\f\u001a\u00020\rH\u0016¨\u0006\u000e"}, d2 = {"Lcom/checkout/components/card/utils/ResourceProviderImpl;", "Lcom/checkout/components/interfaces/ui/ResourceProvider;", "context", "Landroid/content/Context;", "translation", "", "Lcom/checkout/components/interfaces/localisation/ComponentTranslationKey;", "", "Lcom/checkout/components/interfaces/localisation/Translation;", "<init>", "(Landroid/content/Context;Ljava/util/Map;)V", "getTranslationKey", "resId", "", "card_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
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
        if (resId == R.string.cko_card) {
            return ComponentTranslationKey.Card;
        }
        if (resId == R.string.cko_card_holder_name) {
            return ComponentTranslationKey.CardHolderName;
        }
        if (resId == R.string.cko_card_number_invalid) {
            return ComponentTranslationKey.CardNumberInvalid;
        }
        if (resId == R.string.cko_card_number) {
            return ComponentTranslationKey.CardNumber;
        }
        if (resId == com.checkout.components.ui.R.string.cko_card_number_not_supported) {
            return ComponentTranslationKey.CardNumberNotSupported;
        }
        if (resId == com.checkout.components.ui.R.string.cko_card_type_not_supported) {
            return ComponentTranslationKey.CardTypeNotSupported;
        }
        if (resId == com.checkout.components.ui.R.string.cko_card_type_charge) {
            return ComponentTranslationKey.CardTypeCharge;
        }
        if (resId == com.checkout.components.ui.R.string.cko_card_type_credit) {
            return ComponentTranslationKey.CardTypeCredit;
        }
        if (resId == com.checkout.components.ui.R.string.cko_card_type_debit) {
            return ComponentTranslationKey.CardTypeDebit;
        }
        if (resId == com.checkout.components.ui.R.string.cko_card_type_deferred_debit) {
            return ComponentTranslationKey.CardTypeDeferredDebit;
        }
        if (resId == com.checkout.components.ui.R.string.cko_card_type_prepaid) {
            return ComponentTranslationKey.CardTypePrepaid;
        }
        if (resId == R.string.cko_card_expiry_date) {
            return ComponentTranslationKey.CardExpiryDate;
        }
        if (resId == R.string.cko_card_expiry_date_invalid) {
            return ComponentTranslationKey.CardExpiryDateInvalid;
        }
        if (resId == R.string.cko_card_expiry_date_incomplete) {
            return ComponentTranslationKey.CardExpiryDateIncomplete;
        }
        if (resId == R.string.cko_card_expiry_date_placeholder_month) {
            return ComponentTranslationKey.CardExpiryDatePlaceholderMonth;
        }
        if (resId == R.string.cko_card_expiry_date_placeholder_year) {
            return ComponentTranslationKey.CardExpiryDatePlaceholderYear;
        }
        if (resId == com.checkout.components.ui.R.string.cko_card_security_code_invalid) {
            return ComponentTranslationKey.CardSecurityCodeInvalid;
        }
        if (resId == com.checkout.components.ui.R.string.cko_card_security_code_placeholder) {
            return ComponentTranslationKey.CardSecurityCodePlaceholder;
        }
        if (resId == com.checkout.components.ui.R.string.cko_pay_button) {
            return ComponentTranslationKey.PayButtonPay;
        }
        if (resId == com.checkout.components.ui.R.string.cko_pay_button_payment_complete) {
            return ComponentTranslationKey.PayButtonPaymentComplete;
        }
        if (resId == com.checkout.components.ui.R.string.cko_pay_button_payment_processing) {
            return ComponentTranslationKey.PayButtonPaymentProcessing;
        }
        if (resId == com.checkout.components.ui.R.string.cko_form_required) {
            return ComponentTranslationKey.FormRequired;
        }
        if (resId == R.string.cko_card_address_use_shipping_as_billing) {
            return ComponentTranslationKey.CardAddressUseShippingAsBilling;
        }
        if (resId == R.string.cko_scheme_selection_header) {
            return ComponentTranslationKey.PreferredSchemeCta;
        }
        if (resId == R.string.cko_scheme_selection_description) {
            return ComponentTranslationKey.PreferredSchemeDescription;
        }
        return null;
    }
}
