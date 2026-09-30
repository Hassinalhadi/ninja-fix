package M;

import java.util.Iterator;

/* loaded from: classes3.dex */
public abstract class n implements Iterator, Yd.a {
    public Object[] alpha = m.echo.delta;
    public int purple;
    public int red;

    public final void alpha(int i4, Object[] objArr, int i5) {
        this.alpha = objArr;
        this.purple = i4;
        this.red = i5;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.red < this.purple) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
