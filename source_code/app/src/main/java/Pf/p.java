package Pf;

import java.util.Iterator;
import kotlinx.serialization.KSerializer;

/* loaded from: classes2.dex */
public final class p implements Iterator, Yd.a {
    public final Of.d alpha;
    public final aa purple;
    public final KSerializer red;
    public boolean silver = true;
    public boolean teal;

    public p(Of.d dVar, aa aaVar, KSerializer kSerializer) {
        this.alpha = dVar;
        this.purple = aaVar;
        this.red = kSerializer;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        String str;
        if (this.teal) {
            return false;
        }
        aa aaVar = this.purple;
        if (aaVar.whiskey() == 9) {
            this.teal = true;
            aaVar.golf((byte) 9);
            if (aaVar.whiskey() == 10) {
                return false;
            }
            if (aaVar.whiskey() != 8) {
                aaVar.papa();
                return false;
            }
            a.romeo(aaVar, "There is a start of the new array after the one parsed to sequence. ARRAY_WRAPPED mode doesn't merge consecutive arrays.\nIf you need to parse a stream of arrays, please use WHITESPACE_SEPARATED mode instead.", 0, null, 6);
            throw null;
        }
        if (aaVar.whiskey() != 10 || this.teal) {
            return true;
        }
        String romeo = r.romeo((byte) 9);
        int i4 = aaVar.alpha;
        int i5 = i4 - 1;
        c cVar = aaVar.golf;
        if (i4 != cVar.purple && i5 >= 0) {
            str = String.valueOf(cVar.alpha[i5]);
        } else {
            str = "EOF";
        }
        a.romeo(aaVar, av.q.golf("Expected ", romeo, ", but had '", str, "' instead"), i5, null, 4);
        throw null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        boolean z2 = this.silver;
        aa aaVar = this.purple;
        if (z2) {
            this.silver = false;
        } else {
            aaVar.hotel(',');
        }
        ag agVar = ag.red;
        KSerializer kSerializer = this.red;
        return new ab(this.alpha, agVar, aaVar, kSerializer.getDescriptor(), null).tango(kSerializer);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
