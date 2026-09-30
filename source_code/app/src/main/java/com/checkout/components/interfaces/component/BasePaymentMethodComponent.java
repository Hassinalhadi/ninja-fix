package com.checkout.components.interfaces.component;

import androidx.annotation.Keep;
import com.checkout.components.interfaces.api.PaymentMethodComponent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0002\u001a\u00020\u0003X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/checkout/components/interfaces/component/BasePaymentMethodComponent;", "Lcom/checkout/components/interfaces/api/PaymentMethodComponent;", "componentCallback", "Lcom/checkout/components/interfaces/component/ComponentCallback;", "<init>", "(Lcom/checkout/components/interfaces/component/ComponentCallback;)V", "getComponentCallback", "()Lcom/checkout/components/interfaces/component/ComponentCallback;", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class BasePaymentMethodComponent implements PaymentMethodComponent {
    public static final int $stable = 8;

    @NotNull
    private final ComponentCallback componentCallback;

    public BasePaymentMethodComponent(@NotNull ComponentCallback componentCallback) {
        Intrinsics.echo(componentCallback, "componentCallback");
        this.componentCallback = componentCallback;
    }

    @NotNull
    public final ComponentCallback getComponentCallback() {
        return this.componentCallback;
    }
}
