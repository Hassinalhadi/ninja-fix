package b;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class P extends Pd.i implements Xd.l {
    public Ef.a alpha;
    public Object purple;
    public Object red;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Q f3291s;
    public Q silver;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Pd.i f3292t;
    public int teal;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f3293u;
    public /* synthetic */ Object white;
    public final /* synthetic */ M yellow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public P(M m4, Q q4, Xd.l lVar, Object obj, Nd.c cVar) {
        super(2, cVar);
        this.yellow = m4;
        this.f3291s = q4;
        this.f3292t = (Pd.i) lVar;
        this.f3293u = obj;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [Xd.l, Pd.i] */
    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        P p4 = new P(this.yellow, this.f3291s, this.f3292t, this.f3293u, cVar);
        p4.white = obj;
        return p4;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((P) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [Xd.l] */
    /* JADX WARN: Type inference failed for: r5v7 */
    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Q q4;
        Object obj2;
        N n5;
        Ef.a aVar;
        ?? r5;
        Q q5;
        Throwable th;
        N n10;
        AtomicReference atomicReference;
        AtomicReference atomicReference2;
        Od.a aVar2 = Od.a.alpha;
        ?? r12 = this.teal;
        try {
            try {
                if (r12 != 0) {
                    if (r12 != 1) {
                        if (r12 == 2) {
                            q5 = (Q) this.purple;
                            aVar = this.alpha;
                            n10 = (N) this.white;
                            try {
                                ResultKt.alpha(obj);
                                atomicReference2 = q5.alpha;
                                while (!atomicReference2.compareAndSet(n10, null) && atomicReference2.get() == n10) {
                                }
                                ((Ef.c) aVar).foxtrot(null);
                                return obj;
                            } catch (Throwable th2) {
                                th = th2;
                                atomicReference = q5.alpha;
                                while (!atomicReference.compareAndSet(n10, null)) {
                                }
                                throw th;
                            }
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Q q10 = this.silver;
                    obj2 = this.red;
                    Xd.l lVar = (Xd.l) this.purple;
                    Ef.a aVar3 = this.alpha;
                    n5 = (N) this.white;
                    ResultKt.alpha(obj);
                    q4 = q10;
                    aVar = aVar3;
                    r5 = lVar;
                } else {
                    ResultKt.alpha(obj);
                    Nd.f fVar = ((vf.ab) this.white).charlie().get(vf.H.alpha);
                    Intrinsics.checkNotNull(fVar);
                    N n11 = new N(this.yellow, (vf.I) fVar);
                    q4 = this.f3291s;
                    Q.alpha(q4, n11);
                    this.white = n11;
                    Ef.c cVar = q4.bravo;
                    this.alpha = cVar;
                    Pd.i iVar = this.f3292t;
                    this.purple = iVar;
                    Object obj3 = this.f3293u;
                    this.red = obj3;
                    this.silver = q4;
                    this.teal = 1;
                    if (cVar.delta(this) != aVar2) {
                        obj2 = obj3;
                        n5 = n11;
                        aVar = cVar;
                        r5 = iVar;
                    }
                    return aVar2;
                }
                this.white = n5;
                this.alpha = aVar;
                this.purple = q4;
                this.red = null;
                this.silver = null;
                this.teal = 2;
                Object invoke = r5.invoke(obj2, this);
                if (invoke != aVar2) {
                    q5 = q4;
                    obj = invoke;
                    n10 = n5;
                    atomicReference2 = q5.alpha;
                    while (!atomicReference2.compareAndSet(n10, null)) {
                    }
                    ((Ef.c) aVar).foxtrot(null);
                    return obj;
                }
                return aVar2;
            } catch (Throwable th3) {
                q5 = q4;
                th = th3;
                n10 = n5;
                atomicReference = q5.alpha;
                while (!atomicReference.compareAndSet(n10, null) && atomicReference.get() == n10) {
                }
                throw th;
            }
        } catch (Throwable th4) {
            ((Ef.c) r12).foxtrot(null);
            throw th4;
        }
    }
}
