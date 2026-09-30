package com.checkout.components.interfaces.component;

import com.checkout.components.interfaces.api.PaymentMethodComponent;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, d2 = {"Lcom/checkout/components/interfaces/component/ComponentProvider;", "", "componentName", "", "getComponentName", "()Ljava/lang/String;", "factory", "Lcom/checkout/components/interfaces/component/PaymentMethodComponentFactory;", "Lcom/checkout/components/interfaces/api/PaymentMethodComponent;", "getFactory", "()Lcom/checkout/components/interfaces/component/PaymentMethodComponentFactory;", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface ComponentProvider {
    @NotNull
    String getComponentName();

    @NotNull
    PaymentMethodComponentFactory<? extends PaymentMethodComponent> getFactory();
}
