package com.checkout.components.card.ui.component.savecard;

import androidx.lifecycle.T;
import androidx.lifecycle.Y;
import com.checkout.components.card.Z;
import com.checkout.components.card.ui.manager.PaymentStateManager;
import com.checkout.components.interfaces.component.RememberMeConfiguration;
import com.checkout.components.interfaces.model.Phone;
import com.checkout.components.interfaces.model.contact.Country;
import com.checkout.components.rememberme.CheckoutRememberMe;
import com.checkout.components.rememberme.model.CustomerInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import vf.ad;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lcom/checkout/components/card/ui/component/savecard/SaveCardContainerViewModel;", "Landroidx/lifecycle/Y;", "Lcom/checkout/components/rememberme/CheckoutRememberMe;", "rememberMe", "Lcom/checkout/components/card/ui/manager/PaymentStateManager;", "paymentStateManager", "<init>", "(Lcom/checkout/components/rememberme/CheckoutRememberMe;Lcom/checkout/components/card/ui/manager/PaymentStateManager;)V", "a", "Lcom/checkout/components/rememberme/CheckoutRememberMe;", "getRememberMe$card_standardRelease", "()Lcom/checkout/components/rememberme/CheckoutRememberMe;", "Lcom/checkout/components/rememberme/model/CustomerInfo;", "c", "Lcom/checkout/components/rememberme/model/CustomerInfo;", "getPrefilledData$card_standardRelease", "()Lcom/checkout/components/rememberme/model/CustomerInfo;", "prefilledData", "card_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SaveCardContainerViewModel extends Y {
    public static final int $stable = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final CheckoutRememberMe rememberMe;

    /* renamed from: b, reason: collision with root package name */
    private final PaymentStateManager f4544b;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final CustomerInfo prefilledData;

    public SaveCardContainerViewModel(@Nullable CheckoutRememberMe checkoutRememberMe, @NotNull PaymentStateManager paymentStateManager) {
        CustomerInfo customerInfo;
        RememberMeConfiguration configuration;
        RememberMeConfiguration.Data data;
        String str;
        String str2;
        Intrinsics.echo(paymentStateManager, "paymentStateManager");
        this.rememberMe = checkoutRememberMe;
        this.f4544b = paymentStateManager;
        if (checkoutRememberMe != null && (configuration = checkoutRememberMe.configuration()) != null && (data = configuration.getData()) != null) {
            String email = data.getEmail();
            Phone phone = data.getPhone();
            if (phone != null) {
                str = phone.getNumber();
            } else {
                str = null;
            }
            Country.Companion companion = Country.INSTANCE;
            Phone phone2 = data.getPhone();
            if (phone2 != null) {
                str2 = phone2.getCountryCode();
            } else {
                str2 = null;
            }
            customerInfo = new CustomerInfo(email, str, companion.fromDialingCode(str2 == null ? "" : str2, checkoutRememberMe.supportedCountries()));
        } else {
            customerInfo = null;
        }
        this.prefilledData = customerInfo;
        if (checkoutRememberMe != null) {
            ad.zulu(T.hotel(this), null, null, new Z(this, null), 3);
        }
    }

    @Nullable
    /* renamed from: getPrefilledData$card_standardRelease, reason: from getter */
    public final CustomerInfo getPrefilledData() {
        return this.prefilledData;
    }

    @Nullable
    /* renamed from: getRememberMe$card_standardRelease, reason: from getter */
    public final CheckoutRememberMe getRememberMe() {
        return this.rememberMe;
    }
}
