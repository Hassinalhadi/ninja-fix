package Jc;

import androidx.compose.runtime.C0564b;
import i.C1874w;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import vf.ab;
import yf.AbstractC3428A;
import yf.InterfaceC3439i;

/* loaded from: classes2.dex */
public final class n extends Pd.i implements Xd.l {
    public int alpha;
    public final /* synthetic */ C1874w purple;
    public final /* synthetic */ boolean red;
    public final /* synthetic */ boolean silver;
    public final /* synthetic */ Function0 teal;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(C1874w c1874w, boolean z2, boolean z10, Function0 function0, Nd.c cVar) {
        super(2, cVar);
        this.purple = c1874w;
        this.red = z2;
        this.silver = z10;
        this.teal = function0;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new n(this.purple, this.red, this.silver, this.teal, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((n) create((ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        int i4 = this.alpha;
        if (i4 != 0) {
            if (i4 == 1) {
                ResultKt.alpha(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.alpha(obj);
            InterfaceC3439i lima = AbstractC3428A.lima(C0564b.bronze(new Ec.f(this.purple, 2)));
            Ec.g gVar = new Ec.g(this.teal, 2);
            this.alpha = 1;
            Object collect = lima.collect(new m(gVar, this.red, this.silver), this);
            if (collect != aVar) {
                collect = Unit.INSTANCE;
            }
            if (collect == aVar) {
                return aVar;
            }
        }
        return Unit.INSTANCE;
    }
}
