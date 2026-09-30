package androidx.lifecycle;

import kotlin.ResultKt;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class ae extends Pd.i implements Xd.l {
    public int alpha;
    public final /* synthetic */ ag purple;
    public final /* synthetic */ Pd.i red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ae(ag agVar, Xd.l lVar, Nd.c cVar) {
        super(2, cVar);
        this.purple = agVar;
        this.red = (Pd.i) lVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Xd.l, Pd.i] */
    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new ae(this.purple, this.red, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((ae) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [Xd.l, Pd.i] */
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
            ac acVar = this.purple.alpha;
            this.alpha = 1;
            ab abVar = ab.alpha;
            Cf.e eVar = vf.ao.alpha;
            if (vf.ad.blue(Af.n.alpha.teal, new D(acVar, this.red, null), this) == aVar) {
                return aVar;
            }
        }
        return Unit.INSTANCE;
    }
}
