package n;

import d.C1562z;
import kotlin.ResultKt;
import kotlin.Unit;
import s6.AbstractC2683j0;

/* renamed from: n.D, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2124D extends Pd.i implements Xd.l {
    public int alpha;
    public final /* synthetic */ m0.u purple;
    public final /* synthetic */ K red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2124D(m0.u uVar, K k6, Nd.c cVar) {
        super(2, cVar);
        this.purple = uVar;
        this.red = k6;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new C2124D(this.purple, this.red, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((C2124D) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [kotlin.jvm.internal.t, java.lang.Object] */
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
            K k6 = this.red;
            C2121A c2121a = new C2121A(k6, 0);
            C2122B c2122b = new C2122B(k6, 0);
            C2122B c2122b2 = new C2122B(k6, 1);
            bz.af afVar = new bz.af(16, k6);
            Cb.d dVar = new Cb.d(15, c2121a);
            Ya.c cVar = new Ya.c(28, c2122b);
            b.c0 c0Var = new b.c0(26);
            float f5 = d.ab.alpha;
            Object bravo = AbstractC2683j0.bravo(this.purple, new C1562z(c0Var, new Object(), null, dVar, afVar, c2122b2, cVar, null), this);
            if (bravo != obj2) {
                bravo = Unit.INSTANCE;
            }
            if (bravo != obj2) {
                bravo = Unit.INSTANCE;
            }
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
