package t0;

import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import s6.J6;
import vf.C3207k;

/* loaded from: classes3.dex */
public final class at extends Pd.i implements Xd.l {
    public int alpha;
    public /* synthetic */ Object purple;
    public final /* synthetic */ au red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public at(au auVar, Nd.c cVar) {
        super(2, cVar);
        this.red = auVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        at atVar = new at(this.red, cVar);
        atVar.purple = obj;
        return atVar;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        ((at) create((C2909d0) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
        return Od.a.alpha;
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        int i4 = this.alpha;
        if (i4 != 0) {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.alpha(obj);
        } else {
            ResultKt.alpha(obj);
            C2909d0 c2909d0 = (C2909d0) this.purple;
            this.purple = c2909d0;
            au auVar = this.red;
            this.alpha = 1;
            C3207k c3207k = new C3207k(1, J6.delta(this));
            c3207k.tango();
            I0.ab abVar = auVar.purple;
            I0.v vVar = abVar.alpha;
            vVar.bravo();
            abVar.bravo.set(new I0.ag(abVar, vVar));
            c3207k.victor(new as(0, c2909d0, auVar));
            if (c3207k.sierra() == aVar) {
                return aVar;
            }
        }
        throw new KotlinNothingValueException();
    }
}
