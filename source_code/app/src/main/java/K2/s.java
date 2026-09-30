package K2;

import A2.z;
import java.util.HashMap;

/* loaded from: classes3.dex */
public final class s {
    public static final String echo = z.golf("WorkTimer");
    public final B2.b alpha;
    public final HashMap bravo = new HashMap();
    public final HashMap charlie = new HashMap();
    public final Object delta = new Object();

    public s(B2.b bVar) {
        this.alpha = bVar;
    }

    public final void alpha(J2.j jVar) {
        synchronized (this.delta) {
            try {
                if (((r) this.bravo.remove(jVar)) != null) {
                    z.echo().alpha(echo, "Stopping timer for " + jVar);
                    this.charlie.remove(jVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
