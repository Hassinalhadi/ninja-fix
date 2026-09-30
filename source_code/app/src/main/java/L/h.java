package L;

import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
public final class h extends a {
    public final Object[] silver;
    public final k teal;

    public h(int i4, int i5, int i10, Object[] objArr, Object[] objArr2) {
        super(i4, i5, 0);
        this.silver = objArr2;
        int i11 = (i5 - 1) & (-32);
        this.teal = new k(objArr, i4 > i11 ? i11 : i4, i11, i10);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            k kVar = this.teal;
            if (kVar.hasNext()) {
                this.purple++;
                return kVar.next();
            }
            int i4 = this.purple;
            this.purple = i4 + 1;
            return this.silver[i4 - kVar.red];
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (hasPrevious()) {
            int i4 = this.purple;
            k kVar = this.teal;
            int i5 = kVar.red;
            if (i4 > i5) {
                int i10 = i4 - 1;
                this.purple = i10;
                return this.silver[i10 - i5];
            }
            this.purple = i4 - 1;
            return kVar.previous();
        }
        throw new NoSuchElementException();
    }
}
