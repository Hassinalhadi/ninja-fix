package id;

import hd.au;
import kotlin.jvm.internal.Intrinsics;
import vf.ab;

/* loaded from: classes2.dex */
public final class f implements ab {
    public final au alpha;
    public final Nd.h purple;

    public f(au httpSendSender, Nd.h coroutineContext) {
        Intrinsics.echo(httpSendSender, "httpSendSender");
        Intrinsics.echo(coroutineContext, "coroutineContext");
        this.alpha = httpSendSender;
        this.purple = coroutineContext;
    }

    @Override // vf.ab
    public final Nd.h charlie() {
        return this.purple;
    }
}
