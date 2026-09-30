package hd;

import ge.InterfaceC1772d;
import h5.C1809a;
import id.C1915c;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import pd.AbstractC2304b;
import s6.AbstractC2742p5;
import zd.C3509a;

/* loaded from: classes2.dex */
public abstract class n {
    public static final C3509a alpha;
    public static final C3509a bravo;
    public static final Lazy charlie;
    public static final C1915c delta;

    static {
        ge.w wVar;
        InterfaceC1772d bravo2 = kotlin.jvm.internal.u.alpha.bravo(Unit.class);
        ge.w wVar2 = null;
        try {
            wVar = kotlin.jvm.internal.u.alpha(Unit.class);
        } catch (Throwable unused) {
            wVar = null;
        }
        alpha = new C3509a("SkipSaveBody", new Ed.a(bravo2, wVar));
        InterfaceC1772d bravo3 = kotlin.jvm.internal.u.alpha.bravo(Unit.class);
        try {
            wVar2 = kotlin.jvm.internal.u.alpha(Unit.class);
        } catch (Throwable unused2) {
        }
        bravo = new C3509a("ResponseBodySaved", new Ed.a(bravo3, wVar2));
        charlie = LazyKt.lazy(new C1809a(1));
        delta = AbstractC2742p5.alpha("SaveBody", new C1809a(7), new l(0));
        AbstractC2742p5.alpha("DoubleReceivePlugin", m.alpha, new l(1));
    }

    public static final rg.b alpha() {
        return (rg.b) charlie.getValue();
    }

    public static final boolean bravo(AbstractC2304b abstractC2304b) {
        Intrinsics.echo(abstractC2304b, "<this>");
        return abstractC2304b.bravo().beige().bravo(bravo);
    }
}
