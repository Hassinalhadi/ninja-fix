package lf;

import java.util.Iterator;

/* renamed from: lf.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2078d implements Iterable, Yd.a {
    public AbstractC2075a alpha;

    public final boolean isEmpty() {
        if (this.alpha.alpha() == 0) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.alpha.iterator();
    }
}
