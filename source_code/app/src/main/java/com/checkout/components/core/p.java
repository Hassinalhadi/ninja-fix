package com.checkout.components.core;

import com.checkout.components.card.CardComponent;
import com.checkout.components.core.common.components.InternalCheckoutComponents;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class p extends Pd.i implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public Object f4986a;

    /* renamed from: b, reason: collision with root package name */
    public int f4987b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InternalCheckoutComponents f4988c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Xd.l f4989d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(InternalCheckoutComponents internalCheckoutComponents, Xd.l lVar, Nd.c cVar) {
        super(1, cVar);
        this.f4988c = internalCheckoutComponents;
        this.f4989d = lVar;
    }

    @Override // Pd.a
    public final Nd.c create(Nd.c cVar) {
        return new p(this.f4988c, this.f4989d, cVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new p(this.f4988c, this.f4989d, (Nd.c) obj).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        int i4 = this.f4987b;
        boolean z2 = true;
        if (i4 != 0) {
            if (i4 == 1) {
                ResultKt.alpha(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.alpha(obj);
            CardComponent access$getCardComponent = InternalCheckoutComponents.access$getCardComponent(this.f4988c);
            if (access$getCardComponent != null) {
                Xd.l lVar = this.f4989d;
                this.f4986a = null;
                this.f4987b = 1;
                obj = lVar.invoke(access$getCardComponent, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            return Boolean.valueOf(z2);
        }
        z2 = ((Boolean) obj).booleanValue();
        return Boolean.valueOf(z2);
    }
}
