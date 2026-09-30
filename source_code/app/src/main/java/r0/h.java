package r0;

import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.ax;
import androidx.compose.runtime.t0;
import p0.AbstractC2264a;
import s6.J7;

/* loaded from: classes3.dex */
public final class h extends J7 {
    public final g alpha;
    public final ax bravo = C0564b.zulu(null);

    public h(g gVar) {
        this.alpha = gVar;
    }

    @Override // s6.J7
    public final boolean bravo(g gVar) {
        if (gVar == this.alpha) {
            return true;
        }
        return false;
    }

    @Override // s6.J7
    public final Object delta(g gVar) {
        if (gVar != this.alpha) {
            AbstractC2264a.bravo("Check failed.");
        }
        Object value = ((t0) this.bravo).getValue();
        if (value == null) {
            return null;
        }
        return value;
    }
}
