package pf;

import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: pf.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2356f implements InterfaceC2358h {
    public final InterfaceC2358h alpha;
    public final boolean bravo;
    public final Function1 charlie;

    public C2356f(InterfaceC2358h interfaceC2358h, boolean z2, Function1 predicate) {
        Intrinsics.echo(predicate, "predicate");
        this.alpha = interfaceC2358h;
        this.bravo = z2;
        this.charlie = predicate;
    }

    @Override // pf.InterfaceC2358h
    public final Iterator iterator() {
        return new C2355e(this);
    }
}
