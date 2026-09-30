package vf;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: vf.x, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3219x implements Nd.g {
    public final Function1 alpha;
    public final Nd.g purple;

    public C3219x(Nd.g baseKey, Function1 function1) {
        Intrinsics.echo(baseKey, "baseKey");
        this.alpha = function1;
        this.purple = baseKey instanceof C3219x ? ((C3219x) baseKey).purple : baseKey;
    }
}
