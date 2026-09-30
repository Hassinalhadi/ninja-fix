package Ld;

import A0.z;
import com.airbnb.lottie.compose.LottieConstants;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.collections.ArraysKt;
import kotlin.collections.ab;
import kotlin.jvm.internal.Intrinsics;
import s6.AbstractC2689j6;

/* loaded from: classes2.dex */
public final class c extends kotlin.collections.g implements RandomAccess, Serializable {
    public static final c silver;
    public Object[] alpha;
    public int purple;
    public boolean red;

    static {
        c cVar = new c(0);
        cVar.red = true;
        silver = cVar;
    }

    public c(int i4) {
        if (i4 >= 0) {
            this.alpha = new Object[i4];
            return;
        }
        throw new IllegalArgumentException("capacity must be non-negative.");
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        kilo();
        int i4 = this.purple;
        ((AbstractList) this).modCount++;
        lima(i4, 1);
        this.alpha[i4] = obj;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection elements) {
        Intrinsics.echo(elements, "elements");
        kilo();
        int size = elements.size();
        hotel(this.purple, elements, size);
        return size > 0;
    }

    @Override // kotlin.collections.g
    public final int alpha() {
        return this.purple;
    }

    @Override // kotlin.collections.g
    public final Object bravo(int i4) {
        kilo();
        int i5 = this.purple;
        if (i4 >= 0 && i4 < i5) {
            return mike(i4);
        }
        throw new IndexOutOfBoundsException(z.juliet("index: ", i4, i5, ", size: "));
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        kilo();
        november(0, this.purple);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof List) {
                if (AbstractC2689j6.alpha(this.alpha, 0, this.purple, (List) obj)) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i4) {
        int i5 = this.purple;
        if (i4 >= 0 && i4 < i5) {
            return this.alpha[i4];
        }
        throw new IndexOutOfBoundsException(z.juliet("index: ", i4, i5, ", size: "));
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i4;
        Object[] objArr = this.alpha;
        int i5 = this.purple;
        int i10 = 1;
        for (int i11 = 0; i11 < i5; i11++) {
            Object obj = objArr[i11];
            int i12 = i10 * 31;
            if (obj != null) {
                i4 = obj.hashCode();
            } else {
                i4 = 0;
            }
            i10 = i12 + i4;
        }
        return i10;
    }

    public final void hotel(int i4, Collection collection, int i5) {
        ((AbstractList) this).modCount++;
        lima(i4, i5);
        Iterator it = collection.iterator();
        for (int i10 = 0; i10 < i5; i10++) {
            this.alpha[i4 + i10] = it.next();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        for (int i4 = 0; i4 < this.purple; i4++) {
            if (Intrinsics.areEqual(this.alpha[i4], obj)) {
                return i4;
            }
        }
        return -1;
    }

    public final void india(int i4, Object obj) {
        ((AbstractList) this).modCount++;
        lima(i4, 1);
        this.alpha[i4] = obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        if (this.purple == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final void kilo() {
        if (!this.red) {
        } else {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        for (int i4 = this.purple - 1; i4 >= 0; i4--) {
            if (Intrinsics.areEqual(this.alpha[i4], obj)) {
                return i4;
            }
        }
        return -1;
    }

    public final void lima(int i4, int i5) {
        int i10 = this.purple + i5;
        if (i10 >= 0) {
            Object[] objArr = this.alpha;
            if (i10 > objArr.length) {
                int length = objArr.length;
                int i11 = length + (length >> 1);
                if (i11 - i10 < 0) {
                    i11 = i10;
                }
                if (i11 - 2147483639 > 0) {
                    if (i10 > 2147483639) {
                        i11 = LottieConstants.IterateForever;
                    } else {
                        i11 = 2147483639;
                    }
                }
                Object[] copyOf = Arrays.copyOf(objArr, i11);
                Intrinsics.delta(copyOf, "copyOf(...)");
                this.alpha = copyOf;
            }
            Object[] objArr2 = this.alpha;
            ArraysKt.yankee(i4 + i5, i4, this.purple, objArr2, objArr2);
            this.purple += i5;
            return;
        }
        throw new OutOfMemoryError();
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    public final Object mike(int i4) {
        ((AbstractList) this).modCount++;
        Object[] objArr = this.alpha;
        Object obj = objArr[i4];
        ArraysKt.yankee(i4, i4 + 1, this.purple, objArr, objArr);
        Object[] objArr2 = this.alpha;
        int i5 = this.purple - 1;
        Intrinsics.echo(objArr2, "<this>");
        objArr2[i5] = null;
        this.purple--;
        return obj;
    }

    public final void november(int i4, int i5) {
        if (i5 > 0) {
            ((AbstractList) this).modCount++;
        }
        Object[] objArr = this.alpha;
        ArraysKt.yankee(i4, i4 + i5, this.purple, objArr, objArr);
        Object[] objArr2 = this.alpha;
        int i10 = this.purple;
        AbstractC2689j6.delta(i10 - i5, objArr2, i10);
        this.purple -= i5;
    }

    public final int oscar(int i4, int i5, Collection collection, boolean z2) {
        int i10 = 0;
        int i11 = 0;
        while (i10 < i5) {
            int i12 = i4 + i10;
            if (collection.contains(this.alpha[i12]) == z2) {
                Object[] objArr = this.alpha;
                i10++;
                objArr[i11 + i4] = objArr[i12];
                i11++;
            } else {
                i10++;
            }
        }
        int i13 = i5 - i11;
        Object[] objArr2 = this.alpha;
        ArraysKt.yankee(i4 + i11, i5 + i4, this.purple, objArr2, objArr2);
        Object[] objArr3 = this.alpha;
        int i14 = this.purple;
        AbstractC2689j6.delta(i14 - i13, objArr3, i14);
        if (i13 > 0) {
            ((AbstractList) this).modCount++;
        }
        this.purple -= i13;
        return i13;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        kilo();
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            bravo(indexOf);
        }
        if (indexOf >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection elements) {
        Intrinsics.echo(elements, "elements");
        kilo();
        if (oscar(0, this.purple, elements, false) <= 0) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection elements) {
        Intrinsics.echo(elements, "elements");
        kilo();
        if (oscar(0, this.purple, elements, true) <= 0) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i4, Object obj) {
        kilo();
        int i5 = this.purple;
        if (i4 >= 0 && i4 < i5) {
            Object[] objArr = this.alpha;
            Object obj2 = objArr[i4];
            objArr[i4] = obj;
            return obj2;
        }
        throw new IndexOutOfBoundsException(z.juliet("index: ", i4, i5, ", size: "));
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i4, int i5) {
        ab.delta(i4, i5, this.purple);
        return new b(this.alpha, i4, i5 - i4, null, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] array) {
        Intrinsics.echo(array, "array");
        int length = array.length;
        int i4 = this.purple;
        if (length < i4) {
            Object[] copyOfRange = Arrays.copyOfRange(this.alpha, 0, i4, array.getClass());
            Intrinsics.delta(copyOfRange, "copyOfRange(...)");
            return copyOfRange;
        }
        ArraysKt.yankee(0, 0, i4, this.alpha, array);
        int i5 = this.purple;
        if (i5 < array.length) {
            array[i5] = null;
        }
        return array;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return AbstractC2689j6.bravo(this.alpha, 0, this.purple, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i4) {
        int i5 = this.purple;
        if (i4 >= 0 && i4 <= i5) {
            return new a(this, i4);
        }
        throw new IndexOutOfBoundsException(z.juliet("index: ", i4, i5, ", size: "));
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i4, Collection elements) {
        Intrinsics.echo(elements, "elements");
        kilo();
        int i5 = this.purple;
        if (i4 >= 0 && i4 <= i5) {
            int size = elements.size();
            hotel(i4, elements, size);
            return size > 0;
        }
        throw new IndexOutOfBoundsException(z.juliet("index: ", i4, i5, ", size: "));
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i4, Object obj) {
        kilo();
        int i5 = this.purple;
        if (i4 >= 0 && i4 <= i5) {
            ((AbstractList) this).modCount++;
            lima(i4, 1);
            this.alpha[i4] = obj;
            return;
        }
        throw new IndexOutOfBoundsException(z.juliet("index: ", i4, i5, ", size: "));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return ArraysKt.blue(0, this.alpha, this.purple);
    }
}
