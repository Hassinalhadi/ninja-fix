package g0;

import bx.C0769g;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public abstract class ad {
    public C0769g alpha;

    public abstract void alpha(c0.d dVar);

    public Function1 bravo() {
        return this.alpha;
    }

    public final void charlie() {
        Function1 bravo = bravo();
        if (bravo != null) {
            bravo.invoke(this);
        }
    }

    public void delta(C0769g c0769g) {
        this.alpha = c0769g;
    }
}
