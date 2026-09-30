package ze;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.types.y;
import me.m;
import pe.InterfaceC2349y;
import se.aq;

/* loaded from: classes2.dex */
public final class d extends Lambda implements Function1 {
    public static final d alpha = new Lambda(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        y yVar;
        InterfaceC2349y module = (InterfaceC2349y) obj;
        Intrinsics.echo(module, "module");
        aq bravo = y6.e.bravo(c.bravo, module.juliet().india(m.tango));
        if (bravo != null) {
            yVar = bravo.getType();
        } else {
            yVar = null;
        }
        if (yVar == null) {
            return hf.i.charlie(hf.h.f12742v, new String[0]);
        }
        return yVar;
    }
}
