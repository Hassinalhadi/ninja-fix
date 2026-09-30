package C1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class at extends B {
    public final Throwable bravo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public at(int i4, Throwable readException) {
        super(i4);
        Intrinsics.echo(readException, "readException");
        this.bravo = readException;
    }
}
