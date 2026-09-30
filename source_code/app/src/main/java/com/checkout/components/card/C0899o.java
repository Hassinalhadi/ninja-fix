package com.checkout.components.card;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: com.checkout.components.card.o, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0899o extends Pd.i implements Xd.n {

    /* renamed from: a, reason: collision with root package name */
    public int f4255a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f4256b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ boolean f4257c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f4258d;
    public final /* synthetic */ CardComponentViewRenderer e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0899o(CardComponentViewRenderer cardComponentViewRenderer, Nd.c cVar) {
        super(4, cVar);
        this.e = cardComponentViewRenderer;
    }

    @Override // Xd.n
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        C0899o c0899o = new C0899o(this.e, (Nd.c) obj4);
        c0899o.f4256b = (String) obj;
        c0899o.f4257c = booleanValue;
        c0899o.f4258d = (Function0) obj3;
        return c0899o.invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        String str = (String) this.f4256b;
        boolean z2 = this.f4257c;
        Function0<Unit> function0 = (Function0) this.f4258d;
        Od.a aVar = Od.a.alpha;
        int i4 = this.f4255a;
        if (i4 != 0) {
            if (i4 == 1) {
                ResultKt.alpha(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.alpha(obj);
            CardComponent cardComponent = this.e.getCardComponent();
            this.f4256b = null;
            this.f4258d = null;
            this.f4257c = z2;
            this.f4255a = 1;
            if (cardComponent.submitWithRememberMe(str, z2, function0, this) == aVar) {
                return aVar;
            }
        }
        return Unit.INSTANCE;
    }
}
