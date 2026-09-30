package tf;

import java.util.NoSuchElementException;

/* renamed from: tf.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3120b extends L.a {
    public final /* synthetic */ int silver = 1;
    public final Object teal;

    public C3120b(int i4, Object[] objArr, int i5) {
        super(i4, i5, 1);
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

    public C3120b(int i4, Object obj) {
        super(i4, 1, 1);
        this.teal = obj;
    }
}
