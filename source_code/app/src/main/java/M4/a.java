package M4;

import com.checkout.components.interfaces.api.CheckoutComponents;
import com.checkout.components.interfaces.api.PaymentMethodComponent;
import com.checkout.components.interfaces.component.ComponentOption;
import com.checkout.components.interfaces.model.ComponentName;
import com.checkout.components.interfaces.model.PaymentMethodName;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class a {
    public static /* synthetic */ PaymentMethodComponent alpha(CheckoutComponents checkoutComponents, ComponentName.Flow flow, ComponentOption componentOption, int i4, Object obj) {
        if (obj == null) {
            if ((i4 & 2) != 0) {
                componentOption = null;
            }
            return checkoutComponents.create(flow, componentOption);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: create");
    }

    public static /* synthetic */ PaymentMethodComponent bravo(CheckoutComponents checkoutComponents, PaymentMethodName paymentMethodName, ComponentOption componentOption, int i4, Object obj) {
        if (obj == null) {
            if ((i4 & 2) != 0) {
                componentOption = null;
            }
            return checkoutComponents.create(paymentMethodName, componentOption);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: create");
    }
}
