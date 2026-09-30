package kotlin;

import java.io.Serializable;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class u implements Lazy, Serializable {
    public Function0 alpha;
    public Object purple;

    @Override // kotlin.Lazy
    public final boolean alpha() {
        if (this.purple != r.alpha) {
            return true;
        }
        return false;
    }

    @Override // kotlin.Lazy
    public final Object getValue() {
        if (this.purple == r.alpha) {
            Function0 function0 = this.alpha;
            Intrinsics.checkNotNull(function0);
            this.purple = function0.invoke();
            this.alpha = null;
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
