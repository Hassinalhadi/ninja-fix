package Y;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class c extends T.r implements e {
    public Function1 alpha;
    public x purple;

    @Override // Y.e
    public final void a(x xVar) {
        if (!Intrinsics.areEqual(this.purple, xVar)) {
            this.purple = xVar;
            this.alpha.invoke(xVar);
        }
    }
}
