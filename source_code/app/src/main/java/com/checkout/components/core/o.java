package com.checkout.components.core;

import com.checkout.components.interfaces.model.TokenizationResult;
import kotlin.ResultKt;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class o extends Pd.i implements Xd.l {

    /* renamed from: a, reason: collision with root package name */
    public int f4983a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f4984b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Xd.l f4985c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(Xd.l lVar, Nd.c cVar) {
        super(2, cVar);
        this.f4985c = lVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        o oVar = new o(this.f4985c, cVar);
        oVar.f4984b = obj;
        return oVar;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        o oVar = new o(this.f4985c, (Nd.c) obj2);
        oVar.f4984b = (TokenizationResult) obj;
        return oVar.invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        TokenizationResult tokenizationResult = (TokenizationResult) this.f4984b;
        Od.a aVar = Od.a.alpha;
        int i4 = this.f4983a;
        if (i4 != 0) {
            if (i4 == 1) {
                ResultKt.alpha(obj);
                return obj;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.alpha(obj);
        Xd.l lVar = this.f4985c;
        this.f4984b = null;
        this.f4983a = 1;
        Object invoke = lVar.invoke(tokenizationResult, this);
        if (invoke == aVar) {
            return aVar;
        }
        return invoke;
    }
}
