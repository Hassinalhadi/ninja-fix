package com.checkout.components.card;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* renamed from: com.checkout.components.card.k, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0895k extends Pd.i implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public int f4199a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Xd.l f4200b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CardComponent f4201c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0895k(Xd.l lVar, CardComponent cardComponent, Nd.c cVar) {
        super(1, cVar);
        this.f4200b = lVar;
        this.f4201c = cardComponent;
    }

    @Override // Pd.a
    public final Nd.c create(Nd.c cVar) {
        return new C0895k(this.f4200b, this.f4201c, cVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new C0895k(this.f4200b, this.f4201c, (Nd.c) obj).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        int i4 = this.f4199a;
        if (i4 != 0) {
            if (i4 == 1) {
                ResultKt.alpha(obj);
                return obj;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.alpha(obj);
        Xd.l lVar = this.f4200b;
        CardComponent cardComponent = this.f4201c;
        this.f4199a = 1;
        Object invoke = lVar.invoke(cardComponent, this);
        if (invoke == aVar) {
            return aVar;
        }
        return invoke;
    }
}
