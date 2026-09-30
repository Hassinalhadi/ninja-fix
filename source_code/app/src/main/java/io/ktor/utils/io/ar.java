package io.ktor.utils.io;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class ar implements vf.ab {
    public final ag alpha;
    public final Nd.h purple;

    public ar(ag agVar, Nd.h coroutineContext) {
        Intrinsics.echo(coroutineContext, "coroutineContext");
        this.alpha = agVar;
        this.purple = coroutineContext;
    }

    @Override // vf.ab
    public final Nd.h charlie() {
        return this.purple;
    }
}
