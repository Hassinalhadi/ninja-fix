package b;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class O extends Pd.i implements Xd.l {
    public Ef.a alpha;
    public Object purple;
    public Q red;
    public int silver;
    public /* synthetic */ Object teal;
    public final /* synthetic */ Q white;
    public final /* synthetic */ Pd.i yellow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public O(Q q4, Function1 function1, Nd.c cVar) {
        super(2, cVar);
        M m4 = M.alpha;
        this.white = q4;
        this.yellow = (Pd.i) function1;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [Pd.i, kotlin.jvm.functions.Function1] */
    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        ?? r12 = this.yellow;
        M m4 = M.alpha;
        O o5 = new O(this.white, r12, cVar);
        o5.teal = obj;
        return o5;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((O) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r5v4, types: [Ef.a] */
    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Q q4;
        ?? r32;
        N n5;
        Ef.c cVar;
        Ef.a aVar;
        Q q5;
        Throwable th;
        N n10;
        AtomicReference atomicReference;
        AtomicReference atomicReference2;
        Od.a aVar2 = Od.a.alpha;
        ?? r12 = this.silver;
        try {
            try {
                if (r12 != 0) {
                    if (r12 != 1) {
                        if (r12 == 2) {
                            q5 = (Q) this.purple;
                            aVar = this.alpha;
                            n10 = (N) this.teal;
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
                    Q q10 = this.red;
                    Function1 function1 = (Function1) this.purple;
                    ?? r5 = this.alpha;
                    n5 = (N) this.teal;
                    ResultKt.alpha(obj);
                    q4 = q10;
                    r32 = function1;
                    cVar = r5;
                } else {
                    ResultKt.alpha(obj);
                    Nd.f fVar = ((vf.ab) this.teal).charlie().get(vf.H.alpha);
                    Intrinsics.checkNotNull(fVar);
                    N n11 = new N(M.alpha, (vf.I) fVar);
                    q4 = this.white;
                    Q.alpha(q4, n11);
                    this.teal = n11;
                    Ef.c cVar2 = q4.bravo;
                    this.alpha = cVar2;
                    Pd.i iVar = this.yellow;
                    this.purple = iVar;
                    this.red = q4;
                    this.silver = 1;
                    if (cVar2.delta(this) != aVar2) {
                        r32 = iVar;
                        n5 = n11;
                        cVar = cVar2;
                    }
                    return aVar2;
                }
                this.teal = n5;
                this.alpha = aVar;
                this.purple = q4;
                this.red = null;
                this.silver = 2;
                Object invoke = r32.invoke(this);
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
            aVar = cVar;
        } catch (Throwable th4) {
            ((Ef.c) r12).foxtrot(null);
            throw th4;
        }
    }
}
