package com.checkout.components.core;

import com.checkout.components.card.CardComponent;
import com.checkout.components.core.ui.FlowComponentViewRenderer;
import com.checkout.components.core.ui.model.FlowComponentConfig;
import com.checkout.components.interfaces.api.PaymentMethodComponent;
import com.checkout.components.interfaces.model.PaymentMethodName;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: com.checkout.components.core.j, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0920j extends Pd.i implements Xd.n {

    /* renamed from: a, reason: collision with root package name */
    public int f4808a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f4809b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ boolean f4810c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f4811d;
    public final /* synthetic */ FlowComponentViewRenderer e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0920j(FlowComponentViewRenderer flowComponentViewRenderer, Nd.c cVar) {
        super(4, cVar);
        this.e = flowComponentViewRenderer;
    }

    @Override // Xd.n
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        C0920j c0920j = new C0920j(this.e, (Nd.c) obj4);
        c0920j.f4809b = (String) obj;
        c0920j.f4810c = booleanValue;
        c0920j.f4811d = (Function0) obj3;
        return c0920j.invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        FlowComponentConfig flowComponentConfig;
        CardComponent cardComponent;
        String str = (String) this.f4809b;
        boolean z2 = this.f4810c;
        Function0<Unit> function0 = (Function0) this.f4811d;
        Od.a aVar = Od.a.alpha;
        int i4 = this.f4808a;
        if (i4 != 0) {
            if (i4 == 1) {
                ResultKt.alpha(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.alpha(obj);
            flowComponentConfig = this.e.f5035a;
            PaymentMethodComponent paymentMethodComponent = flowComponentConfig.getComponents$core_standardRelease().get(PaymentMethodName.INSTANCE.getCard());
            if (paymentMethodComponent instanceof CardComponent) {
                cardComponent = (CardComponent) paymentMethodComponent;
            } else {
                cardComponent = null;
            }
            if (cardComponent != null) {
                this.f4809b = null;
                this.f4811d = null;
                this.f4810c = z2;
                this.f4808a = 1;
                if (cardComponent.submitWithRememberMe(str, z2, function0, this) == aVar) {
                    return aVar;
                }
            }
        }
        return Unit.INSTANCE;
    }
}
