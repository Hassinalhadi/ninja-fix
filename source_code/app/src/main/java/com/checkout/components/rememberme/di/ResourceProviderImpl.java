package com.checkout.components.rememberme.di;

import android.content.Context;
import com.checkout.components.interfaces.localisation.ComponentTranslationKey;
import com.checkout.components.interfaces.ui.ResourceProvider;
import com.checkout.components.ui.R;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\b\u0001\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u001a\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005j\u0004\u0018\u0001`\b¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\f\u001a\u00020\rH\u0016¨\u0006\u000e"}, d2 = {"Lcom/checkout/components/rememberme/di/ResourceProviderImpl;", "Lcom/checkout/components/interfaces/ui/ResourceProvider;", "context", "Landroid/content/Context;", "translation", "", "Lcom/checkout/components/interfaces/localisation/ComponentTranslationKey;", "", "Lcom/checkout/components/interfaces/localisation/Translation;", "<init>", "(Landroid/content/Context;Ljava/util/Map;)V", "getTranslationKey", "resId", "", "rememberme_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
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
        if (resId == R.string.cko_form_phone_number) {
            return ComponentTranslationKey.FormPhoneNumber;
        }
        if (resId == R.string.cko_form_email) {
            return ComponentTranslationKey.FormEmail;
        }
        if (resId == R.string.cko_card_number_not_supported) {
            return ComponentTranslationKey.CardNumberNotSupported;
        }
        if (resId == R.string.cko_pay_button) {
            return ComponentTranslationKey.PayButtonPay;
        }
        if (resId == R.string.cko_card_type_not_supported) {
            return ComponentTranslationKey.CardTypeNotSupported;
        }
        if (resId == R.string.cko_card_type_charge) {
            return ComponentTranslationKey.CardTypeCharge;
        }
        if (resId == R.string.cko_card_type_credit) {
            return ComponentTranslationKey.CardTypeCredit;
        }
        if (resId == R.string.cko_card_type_debit) {
            return ComponentTranslationKey.CardTypeDebit;
        }
        if (resId == R.string.cko_card_type_deferred_debit) {
            return ComponentTranslationKey.CardTypeDeferredDebit;
        }
        if (resId == R.string.cko_card_type_prepaid) {
            return ComponentTranslationKey.CardTypePrepaid;
        }
        if (resId == com.checkout.components.rememberme.R.string.cko_card_store_for_remember_me_cta) {
            return ComponentTranslationKey.CARD_STORE_FOR_REMEMBER_ME_CTA;
        }
        if (resId == com.checkout.components.rememberme.R.string.cko_remember_me_set_default) {
            return ComponentTranslationKey.REMEMBER_ME_SET_DEFAULT;
        }
        if (resId == com.checkout.components.rememberme.R.string.cko_remember_me_card) {
            return ComponentTranslationKey.REMEMBER_ME_CARD;
        }
        if (resId == com.checkout.components.rememberme.R.string.cko_tag_expired) {
            return ComponentTranslationKey.TAG_EXPIRED;
        }
        if (resId == com.checkout.components.rememberme.R.string.cko_tag_default) {
            return ComponentTranslationKey.TAG_DEFAULT;
        }
        if (resId == com.checkout.components.rememberme.R.string.cko_remember_me_logout) {
            return ComponentTranslationKey.REMEMBER_ME_LOGOUT;
        }
        if (resId == com.checkout.components.rememberme.R.string.cko_form_edit) {
            return ComponentTranslationKey.FORM_EDIT;
        }
        if (resId == com.checkout.components.rememberme.R.string.cko_remember_me_use_saved_method) {
            return ComponentTranslationKey.REMEMBER_ME_USE_SAVED_METHOD;
        }
        if (resId == com.checkout.components.rememberme.R.string.cko_remember_me_without_saved_method) {
            return ComponentTranslationKey.REMEMBER_ME_WITHOUT_SAVED_METHOD;
        }
        if (resId == com.checkout.components.rememberme.R.string.cko_remember_me_legal_text) {
            return ComponentTranslationKey.REMEMBER_ME_LEGAL_TEXT;
        }
        return null;
    }
}
