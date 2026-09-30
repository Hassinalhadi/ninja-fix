package com.checkout.components.card;

import com.checkout.components.card.ui.component.errorlabel.ErrorLabelViewModel;
import com.checkout.components.card.ui.manager.PaymentStateManager;
import kotlin.ResultKt;
import kotlin.Unit;
import pe.AbstractC2327c;
import yf.at;

/* loaded from: classes3.dex */
public final class H extends Pd.i implements Xd.l {

    /* renamed from: a, reason: collision with root package name */
    public int f3946a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ErrorLabelViewModel f3947b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H(ErrorLabelViewModel errorLabelViewModel, Nd.c cVar) {
        super(2, cVar);
        this.f3947b = errorLabelViewModel;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new H(this.f3947b, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return new H(this.f3947b, (Nd.c) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        PaymentStateManager paymentStateManager;
        Od.a aVar = Od.a.alpha;
        int i4 = this.f3946a;
        if (i4 != 0) {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            throw AbstractC2327c.amber(obj);
        }
        ResultKt.alpha(obj);
        paymentStateManager = this.f3947b.f4494a;
        at uiPaymentErrorMessage = paymentStateManager.getUiPaymentErrorMessage();
        G g2 = new G(this.f3947b);
        this.f3946a = 1;
        ((yf.N) uiPaymentErrorMessage).collect(g2, this);
        return aVar;
    }
}
