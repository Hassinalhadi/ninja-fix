package Oe;

import java.util.Iterator;

/* loaded from: classes2.dex */
public final class z implements Iterator {
    public final y alpha;
    public t purple;
    public int red;

    public z(aa aaVar) {
        y yVar = new y(aaVar);
        this.alpha = yVar;
        this.purple = new t(yVar.alpha());
        this.red = aaVar.purple;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.red > 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.purple.hasNext()) {
            this.purple = new t(this.alpha.alpha());
        }
        this.red--;
        return Byte.valueOf(this.purple.alpha());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
