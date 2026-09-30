package Pf;

import java.util.Iterator;
import kotlinx.serialization.KSerializer;

/* loaded from: classes2.dex */
public final class q implements Iterator, Yd.a {
    public final Of.d alpha;
    public final aa purple;
    public final KSerializer red;

    public q(Of.d dVar, aa aaVar, KSerializer kSerializer) {
        this.alpha = dVar;
        this.purple = aaVar;
        this.red = kSerializer;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.purple.whiskey() != 10) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        ag agVar = ag.red;
        KSerializer kSerializer = this.red;
        return new ab(this.alpha, agVar, this.purple, kSerializer.getDescriptor(), null).tango(kSerializer);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
