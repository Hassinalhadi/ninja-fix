package bz;

import androidx.compose.animation.core.MutationInterruptedException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class aq extends Pd.i implements Xd.l {
    public Ef.a alpha;
    public Object purple;
    public ar red;
    public int silver;
    public /* synthetic */ Object teal;
    public final /* synthetic */ ar white;
    public final /* synthetic */ Pd.i yellow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public aq(ar arVar, Function1 function1, Nd.c cVar) {
        super(2, cVar);
        ao aoVar = ao.alpha;
        this.white = arVar;
        this.yellow = (Pd.i) function1;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [Pd.i, kotlin.jvm.functions.Function1] */
    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        ?? r12 = this.yellow;
        ao aoVar = ao.alpha;
        aq aqVar = new aq(this.white, r12, cVar);
        aqVar.teal = obj;
        return aqVar;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((aq) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r5v6, types: [Ef.a] */
    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        ar arVar;
        ?? r32;
        ap apVar;
        Ef.c cVar;
        Ef.a aVar;
        ar arVar2;
        Throwable th;
        ap apVar2;
        AtomicReference atomicReference;
        AtomicReference atomicReference2;
        Od.a aVar2 = Od.a.alpha;
        ?? r12 = this.silver;
        try {
            try {
                if (r12 != 0) {
                    if (r12 != 1) {
                        if (r12 == 2) {
                            arVar2 = (ar) this.purple;
                            aVar = this.alpha;
                            apVar2 = (ap) this.teal;
                            try {
                                ResultKt.alpha(obj);
                                atomicReference2 = arVar2.alpha;
                                while (!atomicReference2.compareAndSet(apVar2, null) && atomicReference2.get() == apVar2) {
                                }
                                ((Ef.c) aVar).foxtrot(null);
                                return obj;
                            } catch (Throwable th2) {
                                th = th2;
                                atomicReference = arVar2.alpha;
                                while (!atomicReference.compareAndSet(apVar2, null)) {
                                }
                                throw th;
                            }
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ar arVar3 = this.red;
                    Function1 function1 = (Function1) this.purple;
                    ?? r5 = this.alpha;
                    apVar = (ap) this.teal;
                    ResultKt.alpha(obj);
                    arVar = arVar3;
                    r32 = function1;
                    cVar = r5;
                } else {
                    ResultKt.alpha(obj);
                    Nd.f fVar = ((vf.ab) this.teal).charlie().get(vf.H.alpha);
                    Intrinsics.checkNotNull(fVar);
                    ao aoVar = ao.alpha;
                    ap apVar3 = new ap((vf.I) fVar);
                    while (true) {
                        arVar = this.white;
                        AtomicReference atomicReference3 = arVar.alpha;
                        ap apVar4 = (ap) atomicReference3.get();
                        if (apVar4 != null) {
                            ao aoVar2 = ao.alpha;
                            if (aoVar2.compareTo(aoVar2) < 0) {
                                throw new CancellationException("Current mutation had a higher priority");
                            }
                        }
                        while (!atomicReference3.compareAndSet(apVar4, apVar3)) {
                            if (atomicReference3.get() != apVar4) {
                                break;
                            }
                        }
                        if (apVar4 != null) {
                            apVar4.alpha.foxtrot(new MutationInterruptedException());
                        }
                        this.teal = apVar3;
                        Ef.c cVar2 = arVar.bravo;
                        this.alpha = cVar2;
                        Pd.i iVar = this.yellow;
                        this.purple = iVar;
                        this.red = arVar;
                        this.silver = 1;
                        if (cVar2.delta(this) != aVar2) {
                            r32 = iVar;
                            apVar = apVar3;
                            cVar = cVar2;
                        }
                    }
                }
                this.teal = apVar;
                this.alpha = aVar;
                this.purple = arVar;
                this.red = null;
                this.silver = 2;
                Object invoke = r32.invoke(this);
                if (invoke != aVar2) {
                    arVar2 = arVar;
                    obj = invoke;
                    apVar2 = apVar;
                    atomicReference2 = arVar2.alpha;
                    while (!atomicReference2.compareAndSet(apVar2, null)) {
                    }
                    ((Ef.c) aVar).foxtrot(null);
                    return obj;
                }
                return aVar2;
            } catch (Throwable th3) {
                arVar2 = arVar;
                th = th3;
                apVar2 = apVar;
                atomicReference = arVar2.alpha;
                while (!atomicReference.compareAndSet(apVar2, null) && atomicReference.get() == apVar2) {
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
