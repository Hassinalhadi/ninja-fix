package com.checkout.components.card;

import com.checkout.components.interfaces.model.TokenizationResult;
import kotlin.ResultKt;
import kotlin.Unit;

/* renamed from: com.checkout.components.card.i, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0893i extends Pd.i implements Xd.l {

    /* renamed from: a, reason: collision with root package name */
    public int f4196a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f4197b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Xd.l f4198c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0893i(Xd.l lVar, Nd.c cVar) {
        super(2, cVar);
        this.f4198c = lVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        C0893i c0893i = new C0893i(this.f4198c, cVar);
        c0893i.f4197b = obj;
        return c0893i;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        C0893i c0893i = new C0893i(this.f4198c, (Nd.c) obj2);
        c0893i.f4197b = (TokenizationResult) obj;
        return c0893i.invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        TokenizationResult tokenizationResult = (TokenizationResult) this.f4197b;
        Od.a aVar = Od.a.alpha;
        int i4 = this.f4196a;
        if (i4 != 0) {
            if (i4 == 1) {
                ResultKt.alpha(obj);
                return obj;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.alpha(obj);
        Xd.l lVar = this.f4198c;
        this.f4197b = null;
        this.f4196a = 1;
        Object invoke = lVar.invoke(tokenizationResult, this);
        if (invoke == aVar) {
            return aVar;
        }
        return invoke;
    }
}
