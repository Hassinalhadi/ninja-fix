package Nd;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.k;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes2.dex */
public final class j implements c, Pd.d {
    public static final AtomicReferenceFieldUpdater purple = AtomicReferenceFieldUpdater.newUpdater(j.class, Object.class, "result");
    public final c alpha;

    @Nullable
    private volatile Object result;

    public j(c cVar, Od.a aVar) {
        this.alpha = cVar;
        this.result = aVar;
    }

    public final Object alpha() {
        Object obj = this.result;
        Od.a aVar = Od.a.purple;
        if (obj == aVar) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = purple;
            Od.a aVar2 = Od.a.alpha;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, aVar, aVar2)) {
                if (atomicReferenceFieldUpdater.get(this) != aVar) {
                    obj = this.result;
                }
            }
            return Od.a.alpha;
        }
        if (obj == Od.a.red) {
            return Od.a.alpha;
        }
        if (!(obj instanceof k)) {
            return obj;
        }
        throw ((k) obj).alpha;
    }

    @Override // Pd.d
    public final Pd.d getCallerFrame() {
        c cVar = this.alpha;
        if (cVar instanceof Pd.d) {
            return (Pd.d) cVar;
        }
        return null;
    }

    @Override // Nd.c
    public final h getContext() {
        return this.alpha.getContext();
    }

    @Override // Nd.c
    public final void resumeWith(Object obj) {
        while (true) {
            Object obj2 = this.result;
            Od.a aVar = Od.a.purple;
            if (obj2 == aVar) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = purple;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, aVar, obj)) {
                    if (atomicReferenceFieldUpdater.get(this) != aVar) {
                        break;
                    }
                }
                return;
            }
            Od.a aVar2 = Od.a.alpha;
            if (obj2 == aVar2) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = purple;
                Od.a aVar3 = Od.a.red;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, aVar2, aVar3)) {
                    if (atomicReferenceFieldUpdater2.get(this) != aVar2) {
                        break;
                    }
                }
                this.alpha.resumeWith(obj);
                return;
            }
            throw new IllegalStateException("Already resumed");
        }
    }

    public final String toString() {
        return "SafeContinuation for " + this.alpha;
    }

    public j(c cVar) {
        Od.a aVar = Od.a.purple;
        this.alpha = cVar;
        this.result = aVar;
    }
}
