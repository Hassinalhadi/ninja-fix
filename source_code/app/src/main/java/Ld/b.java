package Ld;

import A0.z;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.collections.ArraysKt;
import kotlin.collections.ab;
import kotlin.jvm.internal.Intrinsics;
import s6.AbstractC2689j6;

/* loaded from: classes2.dex */
public final class b extends kotlin.collections.g implements RandomAccess, Serializable {
    public Object[] alpha;
    public final int purple;
    public int red;
    public final b silver;
    public final c teal;

    public b(Object[] backing, int i4, int i5, b bVar, c root) {
        int i10;
        Intrinsics.echo(backing, "backing");
        Intrinsics.echo(root, "root");
        this.alpha = backing;
        this.purple = i4;
        this.red = i5;
        this.silver = bVar;
        this.teal = root;
        i10 = ((AbstractList) root).modCount;
        ((AbstractList) this).modCount = i10;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        lima();
        kilo();
        india(this.purple + this.red, obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection elements) {
        Intrinsics.echo(elements, "elements");
        lima();
        kilo();
        int size = elements.size();
        hotel(this.purple + this.red, elements, size);
        return size > 0;
    }

    @Override // kotlin.collections.g
    public final int alpha() {
        kilo();
        return this.red;
    }

    @Override // kotlin.collections.g
    public final Object bravo(int i4) {
        lima();
        kilo();
        int i5 = this.red;
        if (i4 >= 0 && i4 < i5) {
            return mike(this.purple + i4);
        }
        throw new IndexOutOfBoundsException(z.juliet("index: ", i4, i5, ", size: "));
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        lima();
        kilo();
        november(this.purple, this.red);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        kilo();
        if (obj != this) {
            if (obj instanceof List) {
                if (!AbstractC2689j6.alpha(this.alpha, this.purple, this.red, (List) obj)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i4) {
        kilo();
        int i5 = this.red;
        if (i4 >= 0 && i4 < i5) {
            return this.alpha[this.purple + i4];
        }
        throw new IndexOutOfBoundsException(z.juliet("index: ", i4, i5, ", size: "));
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i4;
        kilo();
        Object[] objArr = this.alpha;
        int i5 = this.red;
        int i10 = 1;
        for (int i11 = 0; i11 < i5; i11++) {
            Object obj = objArr[this.purple + i11];
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
        c cVar = this.teal;
        b bVar = this.silver;
        if (bVar != null) {
            bVar.hotel(i4, collection, i5);
        } else {
            c cVar2 = c.silver;
            cVar.hotel(i4, collection, i5);
        }
        this.alpha = cVar.alpha;
        this.red += i5;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        kilo();
        for (int i4 = 0; i4 < this.red; i4++) {
            if (Intrinsics.areEqual(this.alpha[this.purple + i4], obj)) {
                return i4;
            }
        }
        return -1;
    }

    public final void india(int i4, Object obj) {
        ((AbstractList) this).modCount++;
        c cVar = this.teal;
        b bVar = this.silver;
        if (bVar != null) {
            bVar.india(i4, obj);
        } else {
            c cVar2 = c.silver;
            cVar.india(i4, obj);
        }
        this.alpha = cVar.alpha;
        this.red++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        kilo();
        if (this.red == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final void kilo() {
        int i4;
        i4 = ((AbstractList) this.teal).modCount;
        if (i4 == ((AbstractList) this).modCount) {
        } else {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        kilo();
        for (int i4 = this.red - 1; i4 >= 0; i4--) {
            if (Intrinsics.areEqual(this.alpha[this.purple + i4], obj)) {
                return i4;
            }
        }
        return -1;
    }

    public final void lima() {
        if (!this.teal.red) {
        } else {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    public final Object mike(int i4) {
        Object mike;
        ((AbstractList) this).modCount++;
        b bVar = this.silver;
        if (bVar != null) {
            mike = bVar.mike(i4);
        } else {
            c cVar = c.silver;
            mike = this.teal.mike(i4);
        }
        this.red--;
        return mike;
    }

    public final void november(int i4, int i5) {
        if (i5 > 0) {
            ((AbstractList) this).modCount++;
        }
        b bVar = this.silver;
        if (bVar != null) {
            bVar.november(i4, i5);
        } else {
            c cVar = c.silver;
            this.teal.november(i4, i5);
        }
        this.red -= i5;
    }

    public final int oscar(int i4, int i5, Collection collection, boolean z2) {
        int oscar;
        b bVar = this.silver;
        if (bVar != null) {
            oscar = bVar.oscar(i4, i5, collection, z2);
        } else {
            c cVar = c.silver;
            oscar = this.teal.oscar(i4, i5, collection, z2);
        }
        if (oscar > 0) {
            ((AbstractList) this).modCount++;
        }
        this.red -= oscar;
        return oscar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        lima();
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
        lima();
        kilo();
        if (oscar(this.purple, this.red, elements, false) <= 0) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection elements) {
        Intrinsics.echo(elements, "elements");
        lima();
        kilo();
        if (oscar(this.purple, this.red, elements, true) > 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i4, Object obj) {
        lima();
        kilo();
        int i5 = this.red;
        if (i4 >= 0 && i4 < i5) {
            Object[] objArr = this.alpha;
            int i10 = this.purple;
            Object obj2 = objArr[i10 + i4];
            objArr[i10 + i4] = obj;
            return obj2;
        }
        throw new IndexOutOfBoundsException(z.juliet("index: ", i4, i5, ", size: "));
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i4, int i5) {
        ab.delta(i4, i5, this.red);
        return new b(this.alpha, this.purple + i4, i5 - i4, this, this.teal);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] array) {
        Intrinsics.echo(array, "array");
        kilo();
        int length = array.length;
        int i4 = this.red;
        int i5 = this.purple;
        if (length < i4) {
            Object[] copyOfRange = Arrays.copyOfRange(this.alpha, i5, i4 + i5, array.getClass());
            Intrinsics.delta(copyOfRange, "copyOfRange(...)");
            return copyOfRange;
        }
        ArraysKt.yankee(0, i5, i4 + i5, this.alpha, array);
        int i10 = this.red;
        if (i10 < array.length) {
            array[i10] = null;
        }
        return array;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        kilo();
        return AbstractC2689j6.bravo(this.alpha, this.purple, this.red, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i4) {
        kilo();
        int i5 = this.red;
        if (i4 >= 0 && i4 <= i5) {
            return new a(this, i4);
        }
        throw new IndexOutOfBoundsException(z.juliet("index: ", i4, i5, ", size: "));
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i4, Object obj) {
        lima();
        kilo();
        int i5 = this.red;
        if (i4 >= 0 && i4 <= i5) {
            india(this.purple + i4, obj);
            return;
        }
        throw new IndexOutOfBoundsException(z.juliet("index: ", i4, i5, ", size: "));
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i4, Collection elements) {
        Intrinsics.echo(elements, "elements");
        lima();
        kilo();
        int i5 = this.red;
        if (i4 >= 0 && i4 <= i5) {
            int size = elements.size();
            hotel(this.purple + i4, elements, size);
            return size > 0;
        }
        throw new IndexOutOfBoundsException(z.juliet("index: ", i4, i5, ", size: "));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        kilo();
        Object[] objArr = this.alpha;
        int i4 = this.red;
        int i5 = this.purple;
        return ArraysKt.blue(i5, objArr, i4 + i5);
    }
}
