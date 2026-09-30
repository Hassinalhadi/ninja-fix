package androidx.compose.runtime;

import java.util.Iterator;

/* loaded from: classes3.dex */
public final class C0 implements Iterable, Yd.a {
    public final C0575g0 alpha;
    public final int purple;
    public final C0564b red;

    public C0(C0575g0 c0575g0, int i4, ak akVar, C0564b c0564b) {
        this.alpha = c0575g0;
        this.purple = i4;
        this.red = c0564b;
        akVar.getClass();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new aj(this.alpha, this.purple, null, this.red);
    }
}
