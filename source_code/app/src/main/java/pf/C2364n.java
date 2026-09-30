package pf;

import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: pf.n, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2364n implements InterfaceC2358h {
    public final InterfaceC2358h alpha;
    public final Function1 bravo;

    public C2364n(InterfaceC2358h sequence, Function1 transformer) {
        Intrinsics.echo(sequence, "sequence");
        Intrinsics.echo(transformer, "transformer");
        this.alpha = sequence;
        this.bravo = transformer;
    }

    @Override // pf.InterfaceC2358h
    public final Iterator iterator() {
        return new C2363m(this);
    }
}
