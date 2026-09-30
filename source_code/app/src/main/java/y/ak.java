package y;

import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.D0;
import bz.C0778c;
import kotlin.ResultKt;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class ak extends Pd.i implements Xd.l {
    public int alpha;
    public /* synthetic */ Object purple;
    public final /* synthetic */ D0 red;
    public final /* synthetic */ C0778c silver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ak(D0 d02, C0778c c0778c, Nd.c cVar) {
        super(2, cVar);
        this.red = d02;
        this.silver = c0778c;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        ak akVar = new ak(this.red, this.silver, cVar);
        akVar.purple = obj;
        return akVar;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((ak) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
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
            vf.ab abVar = (vf.ab) this.purple;
            C1.t bronze = C0564b.bronze(new x.j(3, this.red));
            E.e eVar = new E.e(8, this.silver, abVar);
            this.alpha = 1;
            if (bronze.collect(eVar, this) == aVar) {
                return aVar;
            }
        }
        return Unit.INSTANCE;
    }
}
