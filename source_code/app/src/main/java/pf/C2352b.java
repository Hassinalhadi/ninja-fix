package pf;

import java.util.Iterator;

/* renamed from: pf.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2352b implements InterfaceC2358h, InterfaceC2353c {
    public final InterfaceC2358h alpha;
    public final int bravo;

    public C2352b(InterfaceC2358h interfaceC2358h, int i4) {
        this.alpha = interfaceC2358h;
        this.bravo = i4;
        if (i4 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i4 + '.').toString());
    }

    @Override // pf.InterfaceC2353c
    public final InterfaceC2358h alpha(int i4) {
        int i5 = this.bravo + i4;
        if (i5 < 0) {
            return new C2352b(this, i4);
        }
        return new C2352b(this.alpha, i5);
    }

    @Override // pf.InterfaceC2358h
    public final Iterator iterator() {
        return new Lf.h(this);
    }
}
