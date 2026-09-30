package Af;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class c {
    public static final /* synthetic */ AtomicReferenceFieldUpdater alpha = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_next$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater bravo = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_prev$volatile");
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ Object _prev$volatile;

    public c(r rVar) {
        this._prev$volatile = rVar;
    }

    public final void bravo() {
        bravo.set(this, null);
    }

    public final c charlie() {
        Object obj = alpha.get(this);
        if (obj == b.alpha) {
            return null;
        }
        return (c) obj;
    }

    public abstract boolean delta();

    public final void echo() {
        c cVar;
        c charlie;
        if (charlie() == null) {
            return;
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = bravo;
            c cVar2 = (c) atomicReferenceFieldUpdater.get(this);
            while (cVar2 != null && cVar2.delta()) {
                cVar2 = (c) atomicReferenceFieldUpdater.get(cVar2);
            }
            c charlie2 = charlie();
            Intrinsics.checkNotNull(charlie2);
            while (charlie2.delta() && (charlie = charlie2.charlie()) != null) {
                charlie2 = charlie;
            }
            while (true) {
                Object obj = atomicReferenceFieldUpdater.get(charlie2);
                if (((c) obj) == null) {
                    cVar = null;
                } else {
                    cVar = cVar2;
                }
                while (!atomicReferenceFieldUpdater.compareAndSet(charlie2, obj, cVar)) {
                    if (atomicReferenceFieldUpdater.get(charlie2) != obj) {
                        break;
                    }
                }
            }
            if (cVar2 != null) {
                alpha.set(cVar2, charlie2);
            }
            if (!charlie2.delta() || charlie2.charlie() == null) {
                if (cVar2 == null || !cVar2.delta()) {
                    return;
                }
            }
        }
    }
}
