package V1;

import Nd.h;
import kotlin.jvm.internal.Intrinsics;
import vf.ab;
import vf.ad;

/* loaded from: classes3.dex */
public final class a implements AutoCloseable, ab {
    public final h alpha;

    public a(h coroutineContext) {
        Intrinsics.echo(coroutineContext, "coroutineContext");
        this.alpha = coroutineContext;
    }

    @Override // vf.ab
    public final h charlie() {
        return this.alpha;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        ad.juliet(this.alpha, null);
    }
}
