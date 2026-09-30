package com.checkout.components.interfaces.api;

import com.checkout.components.interfaces.annotations.CkoPublicApi;
import com.checkout.components.interfaces.component.ComponentOption;
import com.checkout.components.interfaces.localisation.Locale;
import com.checkout.components.interfaces.model.ComponentName;
import com.checkout.components.interfaces.model.PaymentMethodName;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bg\u0018\u00002\u00020\u0001J\u001c\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bH&J\u001c\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\f2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bH&J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0013À\u0006\u0001"}, d2 = {"Lcom/checkout/components/interfaces/api/CheckoutComponents;", "Lcom/checkout/components/interfaces/api/StandaloneComponentFactory;", "componentLocale", "Lcom/checkout/components/interfaces/localisation/Locale;", "getComponentLocale", "()Lcom/checkout/components/interfaces/localisation/Locale;", "create", "Lcom/checkout/components/interfaces/api/PaymentMethodComponent;", "componentName", "Lcom/checkout/components/interfaces/model/ComponentName$Flow;", "specificOptions", "Lcom/checkout/components/interfaces/component/ComponentOption;", "Lcom/checkout/components/interfaces/model/PaymentMethodName;", "handleActivityResult", "", "resultCode", "", "paymentData", "", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@CkoPublicApi
/* loaded from: classes3.dex */
public interface CheckoutComponents extends StandaloneComponentFactory {
    @NotNull
    PaymentMethodComponent create(@NotNull ComponentName.Flow componentName, @Nullable ComponentOption specificOptions);

    @NotNull
    PaymentMethodComponent create(@NotNull PaymentMethodName componentName, @Nullable ComponentOption specificOptions);

    @NotNull
    Locale getComponentLocale();

    /* renamed from: handleActivityResult */
    void mo83handleActivityResult(int resultCode, @NotNull String paymentData);
}
