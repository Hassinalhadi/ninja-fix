package Af;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.Intrinsics;
import vf.ad;

/* loaded from: classes2.dex */
public class j {
    public static final /* synthetic */ AtomicReferenceFieldUpdater alpha = AtomicReferenceFieldUpdater.newUpdater(j.class, Object.class, "_next$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater purple = AtomicReferenceFieldUpdater.newUpdater(j.class, Object.class, "_prev$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater red = AtomicReferenceFieldUpdater.newUpdater(j.class, Object.class, "_removedRef$volatile");
    private volatile /* synthetic */ Object _next$volatile = this;
    private volatile /* synthetic */ Object _prev$volatile = this;
    private volatile /* synthetic */ Object _removedRef$volatile;

    public final boolean bravo(j jVar, int i4) {
        while (true) {
            j charlie = charlie();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = purple;
            if (charlie == null) {
                Object obj = atomicReferenceFieldUpdater.get(this);
                while (true) {
                    charlie = (j) obj;
                    if (!charlie.hotel()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(charlie);
                }
            }
            if (charlie instanceof h) {
                if ((((h) charlie).silver & i4) == 0 && charlie.bravo(jVar, i4)) {
                    return true;
                }
                return false;
            }
            atomicReferenceFieldUpdater.set(jVar, charlie);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = alpha;
            atomicReferenceFieldUpdater2.set(jVar, this);
            while (!atomicReferenceFieldUpdater2.compareAndSet(charlie, this, jVar)) {
                if (atomicReferenceFieldUpdater2.get(charlie) != this) {
                    break;
                }
            }
            jVar.delta(this);
            return true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0031, code lost:
    
        r6 = ((Af.o) r6).alpha;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0039, code lost:
    
        if (r5.compareAndSet(r4, r3, r6) == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0041, code lost:
    
        if (r5.get(r4) == r3) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final j charlie() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = purple;
            j jVar = (j) atomicReferenceFieldUpdater.get(this);
            j jVar2 = jVar;
            while (true) {
                j jVar3 = null;
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = alpha;
                    Object obj = atomicReferenceFieldUpdater2.get(jVar2);
                    if (obj == this) {
                        if (jVar == jVar2) {
                            return jVar2;
                        }
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, jVar, jVar2)) {
                            if (atomicReferenceFieldUpdater.get(this) != jVar) {
                                break;
                            }
                        }
                        return jVar2;
                    }
                    if (hotel()) {
                        return null;
                    }
                    if (obj instanceof o) {
                        if (jVar3 != null) {
                            break;
                        }
                        jVar2 = (j) atomicReferenceFieldUpdater.get(jVar2);
                    } else {
                        Intrinsics.charlie(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
                        jVar3 = jVar2;
                        jVar2 = (j) obj;
                    }
                }
                jVar2 = jVar3;
            }
        }
    }

    public final void delta(j jVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = purple;
            j jVar2 = (j) atomicReferenceFieldUpdater.get(jVar);
            if (alpha.get(this) != jVar) {
                return;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(jVar, jVar2, this)) {
                if (atomicReferenceFieldUpdater.get(jVar) != jVar2) {
                    break;
                }
            }
            if (hotel()) {
                jVar.charlie();
                return;
            }
            return;
        }
    }

    public final j golf() {
        o oVar;
        j jVar;
        Object obj = alpha.get(this);
        if (obj instanceof o) {
            oVar = (o) obj;
        } else {
            oVar = null;
        }
        if (oVar != null && (jVar = oVar.alpha) != null) {
            return jVar;
        }
        Intrinsics.charlie(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        return (j) obj;
    }

    public boolean hotel() {
        return alpha.get(this) instanceof o;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        int i4 = 0;
        sb2.append(new i(1, i4, ad.class, this, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;"));
        sb2.append('@');
        sb2.append(ad.romeo(this));
        return sb2.toString();
    }
}
