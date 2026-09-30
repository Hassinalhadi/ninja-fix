package com.checkout.components.card;

import F.C0103e2;
import androidx.compose.runtime.ax;
import kotlin.ResultKt;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class K extends Pd.i implements Xd.l {

    /* renamed from: a, reason: collision with root package name */
    public int f3951a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0103e2 f3952b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ax f3953c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K(C0103e2 c0103e2, ax axVar, Nd.c cVar) {
        super(2, cVar);
        this.f3952b = c0103e2;
        this.f3953c = axVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new K(this.f3952b, this.f3953c, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return new K(this.f3952b, this.f3953c, (Nd.c) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        int i4 = this.f3951a;
        if (i4 != 0) {
            if (i4 == 1) {
                ResultKt.alpha(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.alpha(obj);
            C0103e2 c0103e2 = this.f3952b;
            this.f3951a = 1;
            if (c0103e2.bravo(this) == aVar) {
                return aVar;
            }
        }
        this.f3953c.setValue(Boolean.FALSE);
        return Unit.INSTANCE;
    }
}
