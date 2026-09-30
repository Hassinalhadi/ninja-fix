package Dd;

import kotlin.jvm.internal.Intrinsics;
import vf.ab;

/* loaded from: classes2.dex */
public abstract class f implements ab {
    public final Object alpha;

    public f(Object context) {
        Intrinsics.echo(context, "context");
        this.alpha = context;
    }

    public abstract Object alpha(Object obj, Pd.c cVar);

    public abstract Object bravo();

    public abstract Object delta(Nd.c cVar);

    public abstract Object echo(Nd.c cVar, Object obj);
}
