package hd;

import kotlin.jvm.internal.Intrinsics;
import od.C2226c;

/* loaded from: classes2.dex */
public final class al implements au {
    public final Xd.m alpha;
    public final au bravo;

    public al(Xd.m interceptor, au auVar) {
        Intrinsics.echo(interceptor, "interceptor");
        this.alpha = interceptor;
        this.bravo = auVar;
    }

    @Override // hd.au
    public final Object alpha(C2226c c2226c, Pd.c cVar) {
        return this.alpha.invoke(this.bravo, c2226c, cVar);
    }
}
