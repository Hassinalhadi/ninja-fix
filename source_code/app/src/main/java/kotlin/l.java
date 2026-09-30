package kotlin;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class l implements Lazy, Serializable {
    public static final AtomicReferenceFieldUpdater red = AtomicReferenceFieldUpdater.newUpdater(l.class, Object.class, "purple");
    public volatile Function0 alpha;
    public volatile Object purple;

    @Override // kotlin.Lazy
    public final boolean alpha() {
        if (this.purple != r.alpha) {
            return true;
        }
        return false;
    }

    @Override // kotlin.Lazy
    public final Object getValue() {
        Object obj = this.purple;
        r rVar = r.alpha;
        if (obj != rVar) {
            return obj;
        }
        Function0 function0 = this.alpha;
        if (function0 != null) {
            Object invoke = function0.invoke();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = red;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, rVar, invoke)) {
                if (atomicReferenceFieldUpdater.get(this) != rVar) {
                }
            }
            this.alpha = null;
            return invoke;
        }
        return this.purple;
    }

    public final String toString() {
        if (alpha()) {
            return String.valueOf(getValue());
        }
        return "Lazy value not initialized yet.";
    }
}
