package androidx.lifecycle;

import kotlin.ResultKt;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class D extends Pd.i implements Xd.l {
    public int alpha;
    public /* synthetic */ Object purple;
    public final /* synthetic */ ac red;
    public final /* synthetic */ Pd.i silver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public D(ac acVar, Xd.l lVar, Nd.c cVar) {
        super(2, cVar);
        ab abVar = ab.alpha;
        this.red = acVar;
        this.silver = (Pd.i) lVar;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [Xd.l, Pd.i] */
    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        ab abVar = ab.alpha;
        D d4 = new D(this.red, this.silver, cVar);
        d4.purple = obj;
        return d4;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((D) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r7v8, types: [Xd.l, Pd.i] */
    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        ad adVar;
        Od.a aVar = Od.a.alpha;
        int i4 = this.alpha;
        if (i4 != 0) {
            if (i4 == 1) {
                adVar = (ad) this.purple;
                try {
                    ResultKt.alpha(obj);
                } catch (Throwable th) {
                    th = th;
                    adVar.alpha();
                    throw th;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.alpha(obj);
            vf.I i5 = (vf.I) ((vf.ab) this.purple).charlie().get(vf.H.alpha);
            if (i5 != null) {
                C c3 = new C();
                ab abVar = ab.alpha;
                ad adVar2 = new ad(this.red, c3.purple, i5);
                try {
                    ?? r72 = this.silver;
                    this.purple = adVar2;
                    this.alpha = 1;
                    obj = vf.ad.blue(c3, r72, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                    adVar = adVar2;
                } catch (Throwable th2) {
                    th = th2;
                    adVar = adVar2;
                    adVar.alpha();
                    throw th;
                }
            } else {
                throw new IllegalStateException("when[State] methods should have a parent job");
            }
        }
        adVar.alpha();
        return obj;
    }
}
