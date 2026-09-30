package vf;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class K extends Af.j implements aq, D {
    public P silver;

    @Override // vf.aq
    public final void dispose() {
        P india = india();
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = P.alpha;
            Object obj = atomicReferenceFieldUpdater.get(india);
            if (obj instanceof K) {
                if (obj == this) {
                    as asVar = ad.juliet;
                    while (!atomicReferenceFieldUpdater.compareAndSet(india, obj, asVar)) {
                        if (atomicReferenceFieldUpdater.get(india) != obj) {
                            break;
                        }
                    }
                    return;
                }
                return;
            }
            if (!(obj instanceof D) || ((D) obj).foxtrot() == null) {
                return;
            }
            while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = Af.j.alpha;
                Object obj2 = atomicReferenceFieldUpdater2.get(this);
                if (obj2 instanceof Af.o) {
                    Af.j jVar = ((Af.o) obj2).alpha;
                    return;
                }
                if (obj2 == this) {
                    return;
                }
                Intrinsics.charlie(obj2, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
                Af.j jVar2 = (Af.j) obj2;
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = Af.j.red;
                Af.o oVar = (Af.o) atomicReferenceFieldUpdater3.get(jVar2);
                if (oVar == null) {
                    oVar = new Af.o(jVar2);
                    atomicReferenceFieldUpdater3.set(jVar2, oVar);
                }
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj2, oVar)) {
                    if (atomicReferenceFieldUpdater2.get(this) != obj2) {
                        break;
                    }
                }
                jVar2.charlie();
                return;
            }
        }
    }

    @Override // vf.D
    public final boolean echo() {
        return true;
    }

    @Override // vf.D
    public final T foxtrot() {
        return null;
    }

    public I getParent() {
        return india();
    }

    public final P india() {
        P p4 = this.silver;
        if (p4 != null) {
            return p4;
        }
        Intrinsics.lima("job");
        throw null;
    }

    public abstract boolean juliet();

    public abstract void kilo(Throwable th);

    @Override // Af.j
    public final String toString() {
        return getClass().getSimpleName() + '@' + ad.romeo(this) + "[job@" + ad.romeo(india()) + ']';
    }
}
