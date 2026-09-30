package hd;

import ge.InterfaceC1772d;
import kotlin.Unit;
import zd.C3509a;

/* loaded from: classes2.dex */
public abstract class f {
    public static final C3509a alpha;
    public static final rg.b bravo;

    static {
        ge.w wVar;
        InterfaceC1772d bravo2 = kotlin.jvm.internal.u.alpha.bravo(Unit.class);
        try {
            wVar = kotlin.jvm.internal.u.alpha(Unit.class);
        } catch (Throwable unused) {
            wVar = null;
        }
        alpha = new C3509a("ValidateMark", new Ed.a(bravo2, wVar));
        bravo = rg.d.bravo().bravo().alpha("io.ktor.client.plugins.DefaultResponseValidation");
    }
}
