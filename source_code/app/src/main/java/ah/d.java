package ah;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class d {
    public final a alpha;
    public final ai.b bravo;

    public d(ai.b contract, a callback) {
        Intrinsics.echo(callback, "callback");
        Intrinsics.echo(contract, "contract");
        this.alpha = callback;
        this.bravo = contract;
    }
}
