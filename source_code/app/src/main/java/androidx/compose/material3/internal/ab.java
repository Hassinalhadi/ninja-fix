package androidx.compose.material3.internal;

import b.M;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import vf.H;
import vf.I;

/* loaded from: classes3.dex */
public final class ab extends Pd.i implements Xd.l {
    public Ef.a alpha;
    public Object purple;
    public ac red;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Pd.i f2979s;
    public int silver;
    public /* synthetic */ Object teal;
    public final /* synthetic */ M white;
    public final /* synthetic */ ac yellow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ab(M m4, ac acVar, Function1 function1, Nd.c cVar) {
        super(2, cVar);
        this.white = m4;
        this.yellow = acVar;
        this.f2979s = (Pd.i) function1;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [Pd.i, kotlin.jvm.functions.Function1] */
    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        ab abVar = new ab(this.white, this.yellow, this.f2979s, cVar);
        abVar.teal = obj;
        return abVar;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((ab) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r5v6, types: [Ef.a] */
    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        ac acVar;
        ?? r4;
        aa aaVar;
        Ef.c cVar;
        Ef.a aVar;
        ac acVar2;
        Throwable th;
        aa aaVar2;
        AtomicReference atomicReference;
        AtomicReference atomicReference2;
        Od.a aVar2 = Od.a.alpha;
        ?? r12 = this.silver;
        try {
            try {
                if (r12 != 0) {
                    if (r12 != 1) {
                        if (r12 == 2) {
                            acVar2 = (ac) this.purple;
                            aVar = this.alpha;
                            aaVar2 = (aa) this.teal;
                            try {
                                ResultKt.alpha(obj);
                                atomicReference2 = acVar2.alpha;
                                while (!atomicReference2.compareAndSet(aaVar2, null) && atomicReference2.get() == aaVar2) {
                                }
                                ((Ef.c) aVar).foxtrot(null);
                                return obj;
                            } catch (Throwable th2) {
                                th = th2;
                                atomicReference = acVar2.alpha;
                                while (!atomicReference.compareAndSet(aaVar2, null)) {
                                }
                                throw th;
                            }
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ac acVar3 = this.red;
                    Function1 function1 = (Function1) this.purple;
                    ?? r5 = this.alpha;
                    aaVar = (aa) this.teal;
                    ResultKt.alpha(obj);
                    acVar = acVar3;
                    r4 = function1;
                    cVar = r5;
                } else {
                    ResultKt.alpha(obj);
                    Nd.f fVar = ((vf.ab) this.teal).charlie().get(H.alpha);
                    Intrinsics.checkNotNull(fVar);
                    aa aaVar3 = new aa(this.white, (I) fVar);
                    while (true) {
                        acVar = this.yellow;
                        AtomicReference atomicReference3 = acVar.alpha;
                        aa aaVar4 = (aa) atomicReference3.get();
                        if (aaVar4 != null && aaVar3.alpha.compareTo(aaVar4.alpha) < 0) {
                            throw new CancellationException("Current mutation had a higher priority");
                        }
                        while (!atomicReference3.compareAndSet(aaVar4, aaVar3)) {
                            if (atomicReference3.get() != aaVar4) {
                                break;
                            }
                        }
                        if (aaVar4 != null) {
                            aaVar4.bravo.foxtrot(null);
                        }
                        this.teal = aaVar3;
                        Ef.c cVar2 = acVar.bravo;
                        this.alpha = cVar2;
                        Pd.i iVar = this.f2979s;
                        this.purple = iVar;
                        this.red = acVar;
                        this.silver = 1;
                        if (cVar2.delta(this) != aVar2) {
                            r4 = iVar;
                            aaVar = aaVar3;
                            cVar = cVar2;
                        }
                    }
                }
                this.teal = aaVar;
                this.alpha = aVar;
                this.purple = acVar;
                this.red = null;
                this.silver = 2;
                Object invoke = r4.invoke(this);
                if (invoke != aVar2) {
                    acVar2 = acVar;
                    obj = invoke;
                    aaVar2 = aaVar;
                    atomicReference2 = acVar2.alpha;
                    while (!atomicReference2.compareAndSet(aaVar2, null)) {
                    }
                    ((Ef.c) aVar).foxtrot(null);
                    return obj;
                }
                return aVar2;
            } catch (Throwable th3) {
                acVar2 = acVar;
                th = th3;
                aaVar2 = aaVar;
                atomicReference = acVar2.alpha;
                while (!atomicReference.compareAndSet(aaVar2, null) && atomicReference.get() == aaVar2) {
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
