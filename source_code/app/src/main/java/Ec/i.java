package Ec;

import androidx.compose.runtime.C0564b;
import i.C1874w;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import yf.AbstractC3428A;
import yf.InterfaceC3439i;

/* loaded from: classes2.dex */
public final class i extends Pd.i implements Xd.l {
    public int alpha;
    public final /* synthetic */ C1874w purple;
    public final /* synthetic */ Function0 red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(C1874w c1874w, Function0 function0, Nd.c cVar) {
        super(2, cVar);
        this.purple = c1874w;
        this.red = function0;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new i(this.purple, this.red, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((i) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
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
            InterfaceC3439i lima = AbstractC3428A.lima(C0564b.bronze(new f(this.purple, 0)));
            g gVar = new g(this.red, 0);
            this.alpha = 1;
            Object collect = lima.collect(new C1.s(gVar, 1), this);
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
