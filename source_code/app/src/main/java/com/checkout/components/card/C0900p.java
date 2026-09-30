package com.checkout.components.card;

import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;

/* renamed from: com.checkout.components.card.p, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0900p extends Pd.i implements Xd.l {

    /* renamed from: a, reason: collision with root package name */
    public int f4388a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f4389b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CardComponentViewRenderer f4390c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0900p(CardComponentViewRenderer cardComponentViewRenderer, Nd.c cVar) {
        super(2, cVar);
        this.f4390c = cardComponentViewRenderer;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        C0900p c0900p = new C0900p(this.f4390c, cVar);
        c0900p.f4389b = obj;
        return c0900p;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        C0900p c0900p = new C0900p(this.f4390c, (Nd.c) obj2);
        c0900p.f4389b = (String) obj;
        return c0900p.invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Object m67onSendCardMetaDataRequestgIAlus;
        String str = (String) this.f4389b;
        Od.a aVar = Od.a.alpha;
        int i4 = this.f4388a;
        if (i4 != 0) {
            if (i4 == 1) {
                ResultKt.alpha(obj);
                m67onSendCardMetaDataRequestgIAlus = ((Result) obj).alpha;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.alpha(obj);
            CardComponent cardComponent = this.f4390c.getCardComponent();
            this.f4389b = null;
            this.f4388a = 1;
            m67onSendCardMetaDataRequestgIAlus = cardComponent.m67onSendCardMetaDataRequestgIAlus(str, this);
            if (m67onSendCardMetaDataRequestgIAlus == aVar) {
                return aVar;
            }
        }
        return new Result(m67onSendCardMetaDataRequestgIAlus);
    }
}
