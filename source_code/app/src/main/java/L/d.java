package L;

import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
public final class d extends a {
    public final /* synthetic */ int silver = 1;
    public final Object teal;

    public d(int i4, Object[] objArr, int i5) {
        super(i4, i5, 0);
        this.teal = objArr;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.silver) {
            case 0:
                if (hasNext()) {
                    int i4 = this.purple;
                    this.purple = i4 + 1;
                    return ((Object[]) this.teal)[i4];
                }
                throw new NoSuchElementException();
            default:
                if (hasNext()) {
                    this.purple++;
                    return this.teal;
                }
                throw new NoSuchElementException();
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.silver) {
            case 0:
                if (hasPrevious()) {
                    int i4 = this.purple - 1;
                    this.purple = i4;
                    return ((Object[]) this.teal)[i4];
                }
                throw new NoSuchElementException();
            default:
                if (hasPrevious()) {
                    this.purple--;
                    return this.teal;
                }
                throw new NoSuchElementException();
        }
    }

    public d(int i4, Object obj) {
        super(i4, 1, 0);
        this.teal = obj;
    }
}
