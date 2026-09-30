package androidx.lifecycle;

import Jb.C0211t;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import wf.C3268e;

/* loaded from: classes3.dex */
public final class r extends Pd.i implements Xd.l {
    public int alpha;
    public /* synthetic */ Object purple;
    public final /* synthetic */ az red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(az azVar, Nd.c cVar) {
        super(2, cVar);
        this.red = azVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        r rVar = new r(this.red, cVar);
        rVar.purple = obj;
        return rVar;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        ((r) create((xf.r) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
        return Od.a.alpha;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.lifecycle.A] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        ?? r22 = this.alpha;
        az azVar = this.red;
        try {
        } catch (Throwable th) {
            th = th;
        }
        if (r22 != 0) {
            if (r22 != 1) {
                if (r22 != 2) {
                    if (r22 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Throwable th2 = (Throwable) this.purple;
                    ResultKt.alpha(obj);
                    throw th2;
                }
                A a6 = (A) this.purple;
                try {
                    ResultKt.alpha(obj);
                    throw new KotlinNothingValueException();
                } catch (Throwable th3) {
                    th = th3;
                    r22 = a6;
                    Throwable th4 = th;
                    Cf.e eVar = vf.ao.alpha;
                    Nd.h plus = Af.n.alpha.teal.plus(vf.U.alpha);
                    C0647q c0647q = new C0647q(azVar, r22, null);
                    this.purple = th4;
                    this.alpha = 3;
                    if (vf.ad.blue(plus, c0647q, this) == aVar) {
                        return aVar;
                    }
                    throw th4;
                }
            }
            A a8 = (A) this.purple;
            ResultKt.alpha(obj);
            r22 = a8;
        } else {
            ResultKt.alpha(obj);
            C0211t c0211t = new C0211t(2, (xf.r) this.purple);
            Cf.e eVar2 = vf.ao.alpha;
            C3268e c3268e = Af.n.alpha.teal;
            C0646p c0646p = new C0646p(azVar, c0211t, null);
            this.purple = c0211t;
            this.alpha = 1;
            r22 = c0211t;
            if (vf.ad.blue(c3268e, c0646p, this) == aVar) {
                return aVar;
            }
        }
        this.purple = r22;
        this.alpha = 2;
        vf.ad.india(this);
        return aVar;
    }
}
