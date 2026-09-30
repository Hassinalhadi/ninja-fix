package pf;

import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: pf.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2357g implements InterfaceC2358h {
    public final InterfaceC2358h alpha;
    public final Function1 bravo;
    public final Function1 charlie;

    public C2357g(InterfaceC2358h sequence, Function1 transformer, Function1 function1) {
        Intrinsics.echo(sequence, "sequence");
        Intrinsics.echo(transformer, "transformer");
        this.alpha = sequence;
        this.bravo = transformer;
        this.charlie = function1;
    }

    @Override // pf.InterfaceC2358h
    public final Iterator iterator() {
        return new C2355e(this);
    }
}
