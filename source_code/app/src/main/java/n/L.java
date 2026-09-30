package n;

import kotlin.ResultKt;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class L extends Pd.i implements Xd.l {
    public int alpha;
    public final /* synthetic */ w.k purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L(w.k kVar, Nd.c cVar) {
        super(2, cVar);
        this.purple = kVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new L(this.purple, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((L) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Object obj2 = Od.a.alpha;
        int i4 = this.alpha;
        if (i4 != 0) {
            if (i4 == 1) {
                ResultKt.alpha(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.alpha(obj);
            this.alpha = 1;
            w.k kVar = this.purple;
            kVar.getClass();
            Object mike = vf.ad.mike(new w.j(kVar, null), this);
            if (mike != obj2) {
                mike = Unit.INSTANCE;
            }
            if (mike == obj2) {
                return obj2;
            }
        }
        return Unit.INSTANCE;
    }
}
