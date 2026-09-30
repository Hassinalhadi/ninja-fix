package Wc;

import androidx.compose.ui.platform.ComposeView;
import com.checkout.components.core.CheckoutComponentsFactory;
import com.checkout.components.interfaces.api.CheckoutComponents;
import com.checkout.components.interfaces.api.PaymentMethodComponent;
import com.checkout.components.interfaces.component.CheckoutComponentConfiguration;
import com.checkout.components.interfaces.model.ComponentName;
import kotlin.ResultKt;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class f extends Pd.i implements Xd.l {
    public int alpha;
    public final /* synthetic */ CheckoutComponentConfiguration purple;
    public final /* synthetic */ l red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(CheckoutComponentConfiguration checkoutComponentConfiguration, l lVar, Nd.c cVar) {
        super(2, cVar);
        this.purple = checkoutComponentConfiguration;
        this.red = lVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new f(this.purple, this.red, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        int i4 = this.alpha;
        if (i4 != 0) {
            if (i4 == 1) {
                ResultKt.alpha(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.alpha(obj);
            CheckoutComponentsFactory checkoutComponentsFactory = new CheckoutComponentsFactory(this.purple);
            this.alpha = 1;
            obj = checkoutComponentsFactory.create(this);
            if (obj == aVar) {
                return aVar;
            }
        }
        PaymentMethodComponent alpha = M4.a.alpha((CheckoutComponents) obj, ComponentName.Flow.INSTANCE, null, 2, null);
        J2.t bronze = this.red.bronze();
        ((ComposeView) bronze.red).setContent(new P.d(new F4.c(alpha, 2), -2041367893, true));
        return Unit.INSTANCE;
    }
}
