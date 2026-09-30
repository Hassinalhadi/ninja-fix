package O0;

import A0.z;
import a0.AbstractC0362p;
import a0.C0366t;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class c implements o {
    public final long alpha;

    public c(long j5) {
        this.alpha = j5;
        if (j5 != 16) {
            return;
        }
        J0.a.alpha("ColorStyle value must be specified, use TextForegroundStyle.Unspecified instead.");
    }

    @Override // O0.o
    public final float alpha() {
        return C0366t.delta(this.alpha);
    }

    @Override // O0.o
    public final long bravo() {
        return this.alpha;
    }

    @Override // O0.o
    public final o charlie(Function0 function0) {
        if (!Intrinsics.areEqual(this, n.alpha)) {
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

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof c) && C0366t.charlie(this.alpha, ((c) obj).alpha)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i4 = C0366t.lima;
        return kotlin.p.alpha(this.alpha);
    }

    public final String toString() {
        return "ColorStyle(value=" + ((Object) C0366t.india(this.alpha)) + ')';
    }
}
