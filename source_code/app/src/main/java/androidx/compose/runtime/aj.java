package androidx.compose.runtime;

import java.util.Iterator;

/* loaded from: classes3.dex */
public final class aj implements Iterator, Yd.a {
    public final /* synthetic */ int alpha = 0;
    public final C0575g0 purple;
    public final int red;
    public int silver;
    public int teal;

    public aj(C0575g0 c0575g0, int i4, int i5) {
        this.purple = c0575g0;
        this.red = i5;
        this.silver = i4;
        this.teal = c0575g0.f3003a;
        if (c0575g0.yellow) {
            i0.foxtrot();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.alpha) {
            case 0:
                if (this.silver < this.red) {
                    return true;
                }
                return false;
            default:
                throw null;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.alpha) {
            case 0:
                C0575g0 c0575g0 = this.purple;
                int i4 = c0575g0.f3003a;
                int i5 = this.teal;
                if (i4 != i5) {
                    i0.foxtrot();
                }
                int i10 = this.silver;
                this.silver = i0.alpha(i10, c0575g0.alpha) + i10;
                return new h0(c0575g0, i10, i5);
            default:
                throw null;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.alpha) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public aj(C0575g0 c0575g0, int i4, ak akVar, C0564b c0564b) {
        this.purple = c0575g0;
        this.red = i4;
        this.silver = c0575g0.f3003a;
    }
}
