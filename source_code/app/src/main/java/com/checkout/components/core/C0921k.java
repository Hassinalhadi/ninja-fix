package com.checkout.components.core;

import com.checkout.components.card.CardComponent;
import com.checkout.components.core.ui.FlowComponentViewRenderer;
import com.checkout.components.core.ui.model.FlowComponentConfig;
import com.checkout.components.interfaces.api.PaymentMethodComponent;
import com.checkout.components.interfaces.model.PaymentMethodName;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;

/* renamed from: com.checkout.components.core.k, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0921k extends Pd.i implements Xd.l {

    /* renamed from: a, reason: collision with root package name */
    public int f4812a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f4813b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ FlowComponentViewRenderer f4814c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0921k(FlowComponentViewRenderer flowComponentViewRenderer, Nd.c cVar) {
        super(2, cVar);
        this.f4814c = flowComponentViewRenderer;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        C0921k c0921k = new C0921k(this.f4814c, cVar);
        c0921k.f4813b = obj;
        return c0921k;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        C0921k c0921k = new C0921k(this.f4814c, (Nd.c) obj2);
        c0921k.f4813b = (String) obj;
        return c0921k.invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        FlowComponentConfig flowComponentConfig;
        CardComponent cardComponent;
        Object m67onSendCardMetaDataRequestgIAlus;
        String str = (String) this.f4813b;
        Od.a aVar = Od.a.alpha;
        int i4 = this.f4812a;
        if (i4 != 0) {
            if (i4 == 1) {
                ResultKt.alpha(obj);
                m67onSendCardMetaDataRequestgIAlus = ((Result) obj).alpha;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.alpha(obj);
            flowComponentConfig = this.f4814c.f5035a;
            PaymentMethodComponent paymentMethodComponent = flowComponentConfig.getComponents$core_standardRelease().get(PaymentMethodName.INSTANCE.getCard());
            if (paymentMethodComponent instanceof CardComponent) {
                cardComponent = (CardComponent) paymentMethodComponent;
            } else {
                cardComponent = null;
            }
            if (cardComponent == null) {
                return null;
            }
            this.f4813b = null;
            this.f4812a = 1;
            m67onSendCardMetaDataRequestgIAlus = cardComponent.m67onSendCardMetaDataRequestgIAlus(str, this);
            if (m67onSendCardMetaDataRequestgIAlus == aVar) {
                return aVar;
            }
        }
        return new Result(m67onSendCardMetaDataRequestgIAlus);
    }
}
