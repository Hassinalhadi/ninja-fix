package kotlin;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class t implements Collection, Yd.a {
    public final short[] alpha;

    @Override // java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof s)) {
            return false;
        }
        short s3 = ((s) obj).alpha;
        short[] sArr = this.alpha;
        int length = sArr.length;
        int i4 = 0;
        while (true) {
            if (i4 < length) {
                if (s3 == sArr[i4]) {
                    break;
                }
                i4++;
            } else {
                i4 = -1;
                break;
            }
        }
        if (i4 < 0) {
            return false;
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection elements) {
        boolean z2;
        Intrinsics.echo(elements, "elements");
        Collection collection = elements;
        if (!collection.isEmpty()) {
            for (Object obj : collection) {
                if (obj instanceof s) {
                    short s3 = ((s) obj).alpha;
                    short[] sArr = this.alpha;
                    int length = sArr.length;
                    int i4 = 0;
                    while (true) {
                        if (i4 < length) {
                            if (s3 == sArr[i4]) {
                                break;
                            }
                            i4++;
                        } else {
                            i4 = -1;
                            break;
                        }
                    }
                    if (i4 >= 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                    }
                }
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (obj instanceof t) {
            if (!Intrinsics.areEqual(this.alpha, ((t) obj).alpha)) {
                return false;
            }
            return true;
        }
        return false;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return Arrays.hashCode(this.alpha);
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        if (this.alpha.length == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new Lf.h(5, this.alpha);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final int size() {
        return this.alpha.length;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return kotlin.jvm.internal.j.charlie(this);
    }

    public final String toString() {
        return "UShortArray(storage=" + Arrays.toString(this.alpha) + ')';
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] array) {
        Intrinsics.echo(array, "array");
        return kotlin.jvm.internal.j.delta(this, array);
    }
}
