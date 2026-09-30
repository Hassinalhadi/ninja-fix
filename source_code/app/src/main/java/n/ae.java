package n;

import k.C1990b;
import kotlin.ResultKt;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class ae extends Pd.i implements Xd.l {
    public int alpha;
    public final /* synthetic */ C1990b purple;
    public final /* synthetic */ I0.aa red;
    public final /* synthetic */ ax silver;
    public final /* synthetic */ e0 teal;
    public final /* synthetic */ I0.t white;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ae(C1990b c1990b, I0.aa aaVar, ax axVar, e0 e0Var, I0.t tVar, Nd.c cVar) {
        super(2, cVar);
        this.purple = c1990b;
        this.red = aaVar;
        this.silver = axVar;
        this.teal = e0Var;
        this.white = tVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new ae(this.purple, this.red, this.silver, this.teal, this.white, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((ae) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        long alpha;
        Z.c cVar;
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
            J j5 = this.silver.alpha;
            D0.ak akVar = this.teal.alpha;
            this.alpha = 1;
            int originalToTransformed = this.white.originalToTransformed(D0.am.echo(this.red.bravo));
            if (originalToTransformed < akVar.alpha.alpha.purple.length()) {
                cVar = akVar.bravo(originalToTransformed);
            } else if (originalToTransformed != 0) {
                cVar = akVar.bravo(originalToTransformed - 1);
            } else {
                alpha = P.alpha(j5.bravo, j5.golf, j5.hotel, P.alpha, 1);
                cVar = new Z.c(0.0f, 0.0f, 1.0f, (int) (alpha & 4294967295L));
            }
            Object alpha2 = this.purple.alpha(cVar, this);
            if (alpha2 != aVar) {
                alpha2 = Unit.INSTANCE;
            }
            if (alpha2 == aVar) {
                return aVar;
            }
        }
        return Unit.INSTANCE;
    }
}
