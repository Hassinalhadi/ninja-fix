package androidx.work.impl.workers;

import A2.x;
import A2.y;
import A2.z;
import F2.n;
import J2.p;
import Xd.l;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import t6.AbstractC3008j;
import vf.Y;
import vf.ab;
import vf.ad;

/* loaded from: classes3.dex */
public final class d extends Pd.i implements l {
    public com.google.common.util.concurrent.e alpha;
    public Y purple;
    public int red;
    public /* synthetic */ Object silver;
    public final /* synthetic */ y teal;
    public final /* synthetic */ n white;
    public final /* synthetic */ p yellow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(y yVar, n nVar, p pVar, Nd.c cVar) {
        super(2, cVar);
        this.teal = yVar;
        this.white = nVar;
        this.yellow = pVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        d dVar = new d(this.teal, this.white, this.yellow, cVar);
        dVar.silver = obj;
        return dVar;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c7 A[Catch: all -> 0x008c, TRY_LEAVE, TryCatch #2 {all -> 0x008c, blocks: (B:44:0x006d, B:45:0x008b, B:15:0x008f, B:18:0x00b5, B:21:0x00bd, B:22:0x00c6, B:24:0x00c7, B:7:0x0019, B:8:0x0061, B:30:0x0050), top: B:2:0x000c, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b4  */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [vf.I] */
    /* JADX WARN: Type inference failed for: r1v5, types: [vf.I] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    @Override // Pd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CancellationException cancellationException;
        AtomicInteger atomicInteger;
        com.google.common.util.concurrent.e eVar;
        Od.a aVar = Od.a.alpha;
        ?? r12 = this.red;
        y yVar = this.teal;
        boolean z2 = true;
        try {
            try {
                if (r12 != 0) {
                    if (r12 == 1) {
                        Y y10 = this.purple;
                        eVar = this.alpha;
                        atomicInteger = (AtomicInteger) this.silver;
                        try {
                            ResultKt.alpha(obj);
                            r12 = y10;
                        } catch (CancellationException e) {
                            cancellationException = e;
                            String str = j.alpha;
                            z.echo().bravo(str, "Delegated worker " + yVar.getClass() + " was cancelled", cancellationException);
                            if (atomicInteger.get() != -256) {
                                z2 = false;
                            }
                            if (!eVar.isCancelled()) {
                                if (z2) {
                                    throw new ConstraintTrackingWorker.ConstraintUnsatisfiedException(atomicInteger.get());
                                }
                                throw cancellationException;
                            }
                            throw cancellationException;
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.alpha(obj);
                    ab abVar = (ab) this.silver;
                    AtomicInteger atomicInteger2 = new AtomicInteger(-256);
                    com.google.common.util.concurrent.e startWork = yVar.startWork();
                    Intrinsics.delta(startWork, "delegate.startWork()");
                    Y zulu = ad.zulu(abVar, null, null, new c(this.white, this.yellow, atomicInteger2, startWork, null), 3);
                    try {
                        this.silver = atomicInteger2;
                        this.alpha = startWork;
                        this.purple = zulu;
                        this.red = 1;
                        obj = AbstractC3008j.alpha(startWork, this);
                        if (obj == aVar) {
                            return aVar;
                        }
                        atomicInteger = atomicInteger2;
                        eVar = startWork;
                        r12 = zulu;
                    } catch (CancellationException e4) {
                        cancellationException = e4;
                        atomicInteger = atomicInteger2;
                        eVar = startWork;
                        String str2 = j.alpha;
                        z.echo().bravo(str2, "Delegated worker " + yVar.getClass() + " was cancelled", cancellationException);
                        if (atomicInteger.get() != -256) {
                        }
                        if (!eVar.isCancelled()) {
                        }
                    }
                }
                x xVar = (x) obj;
                r12.foxtrot(null);
                return xVar;
            } catch (Throwable th) {
                String str3 = j.alpha;
                z.echo().bravo(str3, "Delegated worker " + yVar.getClass() + " threw exception in startWork.", th);
                throw th;
            }
        } catch (Throwable th2) {
            r12.foxtrot(null);
            throw th2;
        }
    }
}
