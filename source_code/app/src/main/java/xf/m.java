package xf;

import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.jvm.internal.Intrinsics;
import vf.j0;

/* loaded from: classes2.dex */
public final class m extends Af.r {
    public final e echo;
    public final /* synthetic */ AtomicReferenceArray foxtrot;

    public m(long j5, m mVar, e eVar, int i4) {
        super(j5, mVar, i4);
        this.echo = eVar;
        this.foxtrot = new AtomicReferenceArray(g.bravo * 2);
    }

    @Override // Af.r
    public final int golf() {
        return g.bravo;
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0059, code lost:
    
        november(r5, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x005c, code lost:
    
        if (r0 == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x005e, code lost:
    
        kotlin.jvm.internal.Intrinsics.checkNotNull(r2);
        r2.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0064, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:?, code lost:
    
        return;
     */
    @Override // Af.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void hotel(int i4, Nd.h hVar) {
        boolean z2;
        Af.t tVar;
        int i5 = g.bravo;
        if (i4 >= i5) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            i4 -= i5;
        }
        this.foxtrot.get(i4 * 2);
        while (true) {
            Object lima = lima(i4);
            boolean z10 = lima instanceof j0;
            e eVar = this.echo;
            if (!z10 && !(lima instanceof v)) {
                if (lima == g.juliet || lima == g.kilo) {
                    break;
                }
                if (lima != g.golf && lima != g.foxtrot) {
                    if (lima != g.india && lima != g.delta && lima != g.lima) {
                        throw new IllegalStateException(("unexpected state: " + lima).toString());
                    }
                    return;
                }
            } else {
                if (z2) {
                    tVar = g.juliet;
                } else {
                    tVar = g.kilo;
                }
                if (kilo(i4, lima, tVar)) {
                    november(i4, null);
                    mike(i4, !z2);
                    if (z2) {
                        Intrinsics.checkNotNull(eVar);
                        eVar.getClass();
                        return;
                    }
                    return;
                }
            }
        }
    }

    public final boolean kilo(int i4, Object obj, Object obj2) {
        AtomicReferenceArray atomicReferenceArray = this.foxtrot;
        int i5 = (i4 * 2) + 1;
        while (!atomicReferenceArray.compareAndSet(i5, obj, obj2)) {
            if (atomicReferenceArray.get(i5) != obj) {
                return false;
            }
        }
        return true;
    }

    public final Object lima(int i4) {
        return this.foxtrot.get((i4 * 2) + 1);
    }

    public final void mike(int i4, boolean z2) {
        if (z2) {
            e eVar = this.echo;
            Intrinsics.checkNotNull(eVar);
            eVar.emerald((this.charlie * g.bravo) + i4);
        }
        india();
    }

    public final void november(int i4, Object obj) {
        this.foxtrot.set(i4 * 2, obj);
    }

    public final void oscar(int i4, Af.t tVar) {
        this.foxtrot.set((i4 * 2) + 1, tVar);
    }
}
