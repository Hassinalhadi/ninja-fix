package A4;

import com.checkout.components.core.common.components.InternalCheckoutComponents;
import com.checkout.components.core.common.components.factory.DefaultCardComponentFactory;
import com.checkout.components.interfaces.model.ComponentName;
import com.checkout.components.rememberme.CheckoutRememberMe;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class b implements Function0 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ CheckoutRememberMe purple;

    public /* synthetic */ b(CheckoutRememberMe checkoutRememberMe, int i4) {
        this.alpha = i4;
        this.purple = checkoutRememberMe;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ComponentName a6;
        ComponentName b2;
        ComponentName a8;
        switch (this.alpha) {
            case 0:
                a6 = DefaultCardComponentFactory.a(this.purple);
                return a6;
            case 1:
                b2 = DefaultCardComponentFactory.b(this.purple);
                return b2;
            default:
                a8 = InternalCheckoutComponents.a(this.purple);
                return a8;
        }
    }
}
