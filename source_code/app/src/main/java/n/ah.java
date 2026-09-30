package n;

import kotlin.ResultKt;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class ah extends Pd.i implements Xd.l {
    public int alpha;
    public final /* synthetic */ m0.u purple;
    public final /* synthetic */ K red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ah(m0.u uVar, K k6, Nd.c cVar) {
        super(2, cVar);
        this.purple = uVar;
        this.red = k6;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new ah(this.purple, this.red, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((ah) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
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
            Object mike = vf.ad.mike(new C2125E(this.purple, this.red, null), this);
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
