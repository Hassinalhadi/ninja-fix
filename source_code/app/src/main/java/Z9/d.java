package Z9;

import Cb.ad;
import Yb.F;
import ca.o;
import g3.w;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class d implements w {
    public final o alpha;
    public final c bravo;

    public d(o oVar, c cVar) {
        this.alpha = oVar;
        this.bravo = cVar;
    }

    @Override // g3.w
    public final void alpha(String str, String payload, Function0 function0, Function1 function1) {
        Intrinsics.echo(payload, "payload");
        this.alpha.alpha(str, payload, new F(2, this, function0), new ad(27, this, function1));
    }
}
