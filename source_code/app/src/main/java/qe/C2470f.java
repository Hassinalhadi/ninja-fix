package qe;

import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import s6.E7;

/* renamed from: qe.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2470f implements InterfaceC2472h {
    @Override // qe.InterfaceC2472h
    public final boolean D(Ne.c cVar) {
        return E7.delta(this, cVar);
    }

    @Override // qe.InterfaceC2472h
    public final InterfaceC2466b gray(Ne.c fqName) {
        Intrinsics.echo(fqName, "fqName");
        return null;
    }

    @Override // qe.InterfaceC2472h
    public final boolean isEmpty() {
        return true;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return CollectionsKt.emptyList().iterator();
    }

    public final String toString() {
        return "EMPTY";
    }
}
