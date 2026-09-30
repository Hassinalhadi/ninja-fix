package androidx.compose.runtime;

import java.util.Iterator;

/* loaded from: classes3.dex */
public final class h0 implements Iterable, Yd.a {
    public final C0575g0 alpha;
    public final int purple;
    public final int red;

    public h0(C0575g0 c0575g0, int i4, int i5) {
        this.alpha = c0575g0;
        this.purple = i4;
        this.red = i5;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        C0575g0 c0575g0 = this.alpha;
        if (c0575g0.f3003a != this.red) {
            i0.foxtrot();
        }
        int i4 = this.purple;
        c0575g0.kilo(i4);
        return new aj(c0575g0, i4 + 1, i0.alpha(i4, c0575g0.alpha) + i4);
    }
}
