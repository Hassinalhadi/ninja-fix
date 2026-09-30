package com.checkout.components.interfaces.component;

import com.checkout.components.interfaces.api.PaymentMethodComponent;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bç\u0080\u0001\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003J\u0015\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u0006H&¢\u0006\u0002\u0010\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lcom/checkout/components/interfaces/component/PaymentMethodComponentFactory;", "T", "Lcom/checkout/components/interfaces/api/PaymentMethodComponent;", "", "create", Constants.KEY_CONFIG, "Lcom/checkout/components/interfaces/component/PaymentMethodConfig;", "(Lcom/checkout/components/interfaces/component/PaymentMethodConfig;)Lcom/checkout/components/interfaces/api/PaymentMethodComponent;", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface PaymentMethodComponentFactory<T extends PaymentMethodComponent> {
    @NotNull
    T create(@NotNull PaymentMethodConfig config);
}
