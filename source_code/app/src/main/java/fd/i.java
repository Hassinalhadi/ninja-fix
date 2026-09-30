package fd;

import ge.InterfaceC1772d;
import ge.w;
import ge.z;
import kotlin.jvm.internal.u;
import vf.aa;
import zd.C3509a;

/* loaded from: classes2.dex */
public abstract class i {
    public static final aa alpha = new aa("call-context");
    public static final C3509a bravo;

    static {
        w wVar;
        InterfaceC1772d bravo2 = u.alpha.bravo(cd.d.class);
        try {
            wVar = u.bravo(cd.d.class, z.charlie);
        } catch (Throwable unused) {
            wVar = null;
        }
        bravo = new C3509a("client-config", new Ed.a(bravo2, wVar));
    }
}
