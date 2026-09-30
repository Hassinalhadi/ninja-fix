package O0;

import A0.z;
import a0.AbstractC0362p;
import a0.C0366t;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class n implements o {
    public static final n alpha = new Object();

    @Override // O0.o
    public final float alpha() {
        return Float.NaN;
    }

    @Override // O0.o
    public final long bravo() {
        int i4 = C0366t.lima;
        return C0366t.kilo;
    }

    @Override // O0.o
    public final o charlie(Function0 function0) {
        if (!Intrinsics.areEqual(this, alpha)) {
            return this;
        }
        return (o) function0.invoke();
    }

    @Override // O0.o
    public final /* synthetic */ o delta(o oVar) {
        return z.alpha(this, oVar);
    }

    @Override // O0.o
    public final AbstractC0362p echo() {
        return null;
    }
}
