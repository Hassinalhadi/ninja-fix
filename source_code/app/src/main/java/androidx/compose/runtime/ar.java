package androidx.compose.runtime;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class ar implements G0 {
    public final Lazy alpha;

    public ar(Function0 function0) {
        this.alpha = LazyKt.lazy(function0);
    }

    @Override // androidx.compose.runtime.G0
    public final Object alpha(I i4) {
        return this.alpha.getValue();
    }
}
