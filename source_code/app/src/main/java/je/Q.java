package je;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class Q extends Error {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q(String message) {
        super(message);
        Intrinsics.echo(message, "message");
    }
}
