package com.checkout.components.card;

import com.checkout.components.card.ui.component.base.InputComponentViewModel;
import com.checkout.components.card.ui.manager.PaymentStateManager;
import com.checkout.components.interfaces.ui.ResourceProvider;
import kotlin.ResultKt;
import kotlin.Unit;
import pe.AbstractC2327c;
import vf.ab;
import yf.at;

/* loaded from: classes3.dex */
public final class O extends Pd.i implements Xd.l {

    /* renamed from: a, reason: collision with root package name */
    public int f3956a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PaymentStateManager f3957b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InputComponentViewModel f3958c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ResourceProvider f3959d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O(PaymentStateManager paymentStateManager, InputComponentViewModel inputComponentViewModel, ResourceProvider resourceProvider, Nd.c cVar) {
        super(2, cVar);
        this.f3957b = paymentStateManager;
        this.f3958c = inputComponentViewModel;
        this.f3959d = resourceProvider;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new O(this.f3957b, this.f3958c, this.f3959d, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((O) create((ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        int i4 = this.f3956a;
        if (i4 != 0) {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            throw AbstractC2327c.amber(obj);
        }
        ResultKt.alpha(obj);
        at isCardValidationTriggered = this.f3957b.getIsCardValidationTriggered();
        N n5 = new N(this.f3958c, this.f3959d);
        this.f3956a = 1;
        ((yf.N) isCardValidationTriggered).collect(n5, this);
        return aVar;
    }
}
