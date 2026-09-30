package bv;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class f implements Collection, Set, Yd.b, Yd.f {
    public int[] alpha = bw.a.alpha;
    public Object[] purple = bw.a.charlie;
    public int red;

    public f(int i4) {
        if (i4 > 0) {
            v.bravo(this, i4);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int i4;
        int charlie;
        int i5 = this.red;
        if (obj == null) {
            charlie = v.charlie(this, null, 0);
            i4 = 0;
        } else {
            int hashCode = obj.hashCode();
            i4 = hashCode;
            charlie = v.charlie(this, obj, hashCode);
        }
        if (charlie >= 0) {
            return false;
        }
        int i10 = ~charlie;
        int[] iArr = this.alpha;
        if (i5 >= iArr.length) {
            int i11 = 8;
            if (i5 >= 8) {
                i11 = (i5 >> 1) + i5;
            } else if (i5 < 4) {
                i11 = 4;
            }
            Object[] objArr = this.purple;
            v.bravo(this, i11);
            if (i5 == this.red) {
                int[] iArr2 = this.alpha;
                if (iArr2.length != 0) {
                    ArraysKt.black(0, iArr.length, iArr, iArr2, 6);
                    ArraysKt.beige(0, objArr.length, 6, objArr, this.purple);
                }
            } else {
                throw new ConcurrentModificationException();
            }
        }
        if (i10 < i5) {
            int[] iArr3 = this.alpha;
            int i12 = i10 + 1;
            ArraysKt.zulu(i12, i10, iArr3, iArr3, i5);
            Object[] objArr2 = this.purple;
            ArraysKt.yankee(i12, i10, i5, objArr2, objArr2);
        }
        int i13 = this.red;
        if (i5 == i13) {
            int[] iArr4 = this.alpha;
            if (i10 < iArr4.length) {
                iArr4[i10] = i4;
                this.purple[i10] = obj;
                this.red = i13 + 1;
                return true;
            }
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection elements) {
        Intrinsics.echo(elements, "elements");
        int size = elements.size() + this.red;
        int i4 = this.red;
        int[] iArr = this.alpha;
        boolean z2 = false;
        if (iArr.length < size) {
            Object[] objArr = this.purple;
            v.bravo(this, size);
            int i5 = this.red;
            if (i5 > 0) {
                ArraysKt.black(0, i5, iArr, this.alpha, 6);
                ArraysKt.beige(0, this.red, 6, objArr, this.purple);
            }
        }
        if (this.red == i4) {
            Iterator it = elements.iterator();
            while (it.hasNext()) {
                z2 |= add(it.next());
            }
            return z2;
        }
        throw new ConcurrentModificationException();
    }

    public final Object alpha(int i4) {
        int i5 = this.red;
        Object[] objArr = this.purple;
        Object obj = objArr[i4];
        if (i5 <= 1) {
            clear();
            return obj;
        }
        int i10 = i5 - 1;
        int[] iArr = this.alpha;
        int i11 = 8;
        if (iArr.length > 8 && i5 < iArr.length / 3) {
            if (i5 > 8) {
                i11 = i5 + (i5 >> 1);
            }
            v.bravo(this, i11);
            if (i4 > 0) {
                ArraysKt.black(0, i4, iArr, this.alpha, 6);
                ArraysKt.beige(0, i4, 6, objArr, this.purple);
            }
            if (i4 < i10) {
                int i12 = i4 + 1;
                ArraysKt.zulu(i4, i12, iArr, this.alpha, i5);
                ArraysKt.yankee(i4, i12, i5, objArr, this.purple);
            }
        } else {
            if (i4 < i10) {
                int i13 = i4 + 1;
                ArraysKt.zulu(i4, i13, iArr, iArr, i5);
                Object[] objArr2 = this.purple;
                ArraysKt.yankee(i4, i13, i5, objArr2, objArr2);
            }
            this.purple[i10] = null;
        }
        if (i5 == this.red) {
            this.red = i10;
            return obj;
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        if (this.red != 0) {
            this.alpha = bw.a.alpha;
            this.purple = bw.a.charlie;
            this.red = 0;
        }
        if (this.red == 0) {
        } else {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        int charlie;
        if (obj == null) {
            charlie = v.charlie(this, null, 0);
        } else {
            charlie = v.charlie(this, obj, obj.hashCode());
        }
        if (charlie < 0) {
            return false;
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection elements) {
        Intrinsics.echo(elements, "elements");
        Iterator it = elements.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set) || this.red != ((Set) obj).size()) {
            return false;
        }
        try {
            int i4 = this.red;
            for (int i5 = 0; i5 < i4; i5++) {
                if (!((Set) obj).contains(this.purple[i5])) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] iArr = this.alpha;
        int i4 = this.red;
        int i5 = 0;
        for (int i10 = 0; i10 < i4; i10++) {
            i5 += iArr[i10];
        }
        return i5;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        if (this.red <= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C0762a(this);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int charlie;
        if (obj == null) {
            charlie = v.charlie(this, null, 0);
        } else {
            charlie = v.charlie(this, obj, obj.hashCode());
        }
        if (charlie < 0) {
            return false;
        }
        alpha(charlie);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection elements) {
        Intrinsics.echo(elements, "elements");
        Iterator it = elements.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            z2 |= remove(it.next());
        }
        return z2;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection elements) {
        Intrinsics.echo(elements, "elements");
        boolean z2 = false;
        for (int i4 = this.red - 1; -1 < i4; i4--) {
            if (!CollectionsKt.bronze(elements, this.purple[i4])) {
                alpha(i4);
                z2 = true;
            }
        }
        return z2;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.red;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return ArraysKt.blue(0, this.purple, this.red);
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.red * 14);
        sb2.append('{');
        int i4 = this.red;
        for (int i5 = 0; i5 < i4; i5++) {
            if (i5 > 0) {
                sb2.append(", ");
            }
            Object obj = this.purple[i5];
            if (obj != this) {
                sb2.append(obj);
            } else {
                sb2.append("(this Set)");
            }
        }
        sb2.append('}');
        String sb3 = sb2.toString();
        Intrinsics.delta(sb3, "toString(...)");
        return sb3;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] array) {
        Intrinsics.echo(array, "array");
        int i4 = this.red;
        if (array.length < i4) {
            array = (Object[]) Array.newInstance(array.getClass().getComponentType(), i4);
        } else if (array.length > i4) {
            array[i4] = null;
        }
        ArraysKt.yankee(0, 0, this.red, this.purple, array);
        Intrinsics.checkNotNull(array);
        return array;
    }
}
