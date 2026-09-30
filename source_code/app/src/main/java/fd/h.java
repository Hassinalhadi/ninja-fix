package fd;

import ge.InterfaceC1772d;
import ge.w;
import ge.z;
import hd.an;
import java.util.Arrays;
import java.util.Map;
import kotlin.collections.ab;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.v;
import s6.W4;
import zd.C3509a;

/* loaded from: classes2.dex */
public abstract class h {
    public static final C3509a alpha;

    static {
        w wVar;
        v vVar = u.alpha;
        InterfaceC1772d bravo = vVar.bravo(Map.class);
        try {
            wVar = vVar.delta(vVar.lima(vVar.bravo(Map.class), Arrays.asList(W4.bravo(u.bravo(g.class, z.charlie)), W4.bravo(u.alpha(Object.class))), false));
        } catch (Throwable unused) {
            wVar = null;
        }
        alpha = new C3509a("EngineCapabilities", new Ed.a(bravo, wVar));
        ab.oscar(an.alpha);
    }
}
