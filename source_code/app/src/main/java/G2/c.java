package G2;

import J2.p;
import kotlin.jvm.internal.Intrinsics;
import yf.AbstractC3428A;
import yf.C3433c;

/* loaded from: classes3.dex */
public abstract class c implements e {
    public final H2.f alpha;

    public c(H2.f tracker) {
        Intrinsics.echo(tracker, "tracker");
        this.alpha = tracker;
    }

    @Override // G2.e
    public final boolean alpha(p pVar) {
        if (charlie(pVar) && echo(this.alpha.alpha())) {
            return true;
        }
        return false;
    }

    @Override // G2.e
    public final C3433c bravo(A2.d constraints) {
        Intrinsics.echo(constraints, "constraints");
        return AbstractC3428A.india(new b(this, null));
    }

    public abstract int delta();

    public abstract boolean echo(Object obj);
}
