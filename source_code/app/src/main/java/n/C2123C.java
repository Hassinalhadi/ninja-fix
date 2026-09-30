package n;

import kotlin.ResultKt;
import kotlin.Unit;
import s6.AbstractC2683j0;

/* renamed from: n.C, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2123C extends Pd.i implements Xd.l {
    public int alpha;
    public final /* synthetic */ m0.u purple;
    public final /* synthetic */ K red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2123C(m0.u uVar, K k6, Nd.c cVar) {
        super(2, cVar);
        this.purple = uVar;
        this.red = k6;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new C2123C(this.purple, this.red, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((C2123C) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
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
            Object bravo = AbstractC2683j0.bravo(this.purple, new F(this.red, null), this);
            if (bravo != obj2) {
                bravo = Unit.INSTANCE;
            }
            if (bravo == obj2) {
                return obj2;
            }
        }
        return Unit.INSTANCE;
    }
}
