package com.checkout.components.core;

import com.checkout.components.core.risk.RiskManager;
import com.checkout.risk.PublishDataResult;
import com.checkout.risk.Risk;
import kotlin.ResultKt;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class L extends Pd.i implements Xd.l {

    /* renamed from: a, reason: collision with root package name */
    public int f4645a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ RiskManager f4646b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f4647c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L(RiskManager riskManager, String str, Nd.c cVar) {
        super(2, cVar);
        this.f4646b = riskManager;
        this.f4647c = str;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new L(this.f4646b, this.f4647c, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return new L(this.f4646b, this.f4647c, (Nd.c) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Risk risk;
        Od.a aVar = Od.a.alpha;
        int i4 = this.f4645a;
        if (i4 != 0) {
            if (i4 == 1) {
                ResultKt.alpha(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.alpha(obj);
            risk = this.f4646b.f5002d;
            if (risk != null) {
                String str = this.f4647c;
                this.f4645a = 1;
                obj = risk.publishData(str, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                return null;
            }
        }
        return (PublishDataResult) obj;
    }
}
