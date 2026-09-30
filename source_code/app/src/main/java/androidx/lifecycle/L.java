package androidx.lifecycle;

import kotlin.ResultKt;
import kotlin.Unit;
import wf.C3268e;

/* loaded from: classes3.dex */
public final class L extends Pd.i implements Xd.l {
    public int alpha;
    public /* synthetic */ Object purple;
    public final /* synthetic */ ac red;
    public final /* synthetic */ Pd.i silver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public L(ac acVar, Xd.l lVar, Nd.c cVar) {
        super(2, cVar);
        ab abVar = ab.alpha;
        this.red = acVar;
        this.silver = (Pd.i) lVar;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [Xd.l, Pd.i] */
    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        ab abVar = ab.alpha;
        L l10 = new L(this.red, this.silver, cVar);
        l10.purple = obj;
        return l10;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((L) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [Xd.l, Pd.i] */
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
            Cf.e eVar = vf.ao.alpha;
            C3268e c3268e = Af.n.alpha.teal;
            ?? r4 = this.silver;
            ab abVar2 = ab.alpha;
            K k6 = new K(this.red, abVar, r4, null);
            this.alpha = 1;
            if (vf.ad.blue(c3268e, k6, this) == aVar) {
                return aVar;
            }
        }
        return Unit.INSTANCE;
    }
}
