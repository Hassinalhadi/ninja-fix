package bx;

import androidx.compose.runtime.C0564b;
import bz.V;
import bz.a0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class s implements V {
    public final a0 alpha;
    public T.f bravo;
    public final androidx.compose.runtime.ax charlie = C0564b.zulu(new Q0.m(0));
    public final bv.al delta;

    public s(a0 a0Var, T.f fVar) {
        this.alpha = a0Var;
        this.bravo = fVar;
        long[] jArr = bv.au.alpha;
        this.delta = new bv.al();
    }

    @Override // bz.V
    public final Object alpha() {
        return this.alpha.foxtrot().alpha();
    }

    @Override // bz.V
    public final boolean bravo(Object obj, Object obj2) {
        if (Intrinsics.areEqual(obj, alpha()) && Intrinsics.areEqual(obj2, charlie())) {
            return true;
        }
        return false;
    }

    @Override // bz.V
    public final Object charlie() {
        return this.alpha.foxtrot().charlie();
    }
}
