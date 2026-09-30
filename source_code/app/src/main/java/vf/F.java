package vf;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.ResultKt;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class F extends Pd.i implements Xd.l {
    public /* synthetic */ Object alpha;
    public final /* synthetic */ B2.q purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(B2.q qVar, Nd.c cVar) {
        super(2, cVar);
        this.purple = qVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        F f5 = new F(this.purple, cVar);
        f5.alpha = obj;
        return f5;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((F) create((ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i4;
        Od.a aVar = Od.a.alpha;
        ResultKt.alpha(obj);
        Nd.h charlie = ((ab) this.alpha).charlie();
        B2.q qVar = this.purple;
        try {
            c0 c0Var = new c0();
            c0Var.white = ad.victor(ad.sierra(charlie), true, c0Var);
            try {
                do {
                    atomicIntegerFieldUpdater = c0.yellow;
                    i4 = atomicIntegerFieldUpdater.get(c0Var);
                    if (i4 != 0) {
                        if (i4 != 2 && i4 != 3) {
                            c0.mike(i4);
                            throw null;
                        }
                    }
                    return qVar.invoke();
                } while (!atomicIntegerFieldUpdater.compareAndSet(c0Var, i4, 0));
                return qVar.invoke();
            } finally {
                c0Var.lima();
            }
        } catch (InterruptedException e) {
            throw new CancellationException("Blocking call was interrupted due to parent cancellation").initCause(e);
        }
    }
}
