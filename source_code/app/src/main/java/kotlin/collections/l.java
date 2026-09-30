package kotlin.collections;

import ao.ad;
import com.airbnb.lottie.compose.LottieConstants;
import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class l extends g {
    public static final Object[] silver = new Object[0];
    public int alpha;
    public Object[] purple;
    public int red;

    public l() {
        this.purple = silver;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i4, Object obj) {
        int i5;
        int i10 = this.red;
        if (i4 < 0 || i4 > i10) {
            throw new IndexOutOfBoundsException(A0.z.juliet("index: ", i4, i10, ", size: "));
        }
        if (i4 == i10) {
            addLast(obj);
            return;
        }
        if (i4 == 0) {
            addFirst(obj);
            return;
        }
        quebec();
        hotel(this.red + 1);
        int oscar = oscar(this.alpha + i4);
        int i11 = this.red;
        if (i4 < ((i11 + 1) >> 1)) {
            if (oscar == 0) {
                Object[] objArr = this.purple;
                Intrinsics.echo(objArr, "<this>");
                oscar = objArr.length;
            }
            int i12 = oscar - 1;
            int i13 = this.alpha;
            if (i13 == 0) {
                Object[] objArr2 = this.purple;
                Intrinsics.echo(objArr2, "<this>");
                i5 = objArr2.length - 1;
            } else {
                i5 = i13 - 1;
            }
            int i14 = this.alpha;
            if (i12 >= i14) {
                Object[] objArr3 = this.purple;
                objArr3[i5] = objArr3[i14];
                ArraysKt.yankee(i14, i14 + 1, i12 + 1, objArr3, objArr3);
            } else {
                Object[] objArr4 = this.purple;
                ArraysKt.yankee(i14 - 1, i14, objArr4.length, objArr4, objArr4);
                Object[] objArr5 = this.purple;
                objArr5[objArr5.length - 1] = objArr5[0];
                ArraysKt.yankee(0, 1, i12 + 1, objArr5, objArr5);
            }
            this.purple[i12] = obj;
            this.alpha = i5;
        } else {
            int oscar2 = oscar(i11 + this.alpha);
            if (oscar < oscar2) {
                Object[] objArr6 = this.purple;
                ArraysKt.yankee(oscar + 1, oscar, oscar2, objArr6, objArr6);
            } else {
                Object[] objArr7 = this.purple;
                ArraysKt.yankee(1, 0, oscar2, objArr7, objArr7);
                Object[] objArr8 = this.purple;
                objArr8[0] = objArr8[objArr8.length - 1];
                ArraysKt.yankee(oscar + 1, oscar, objArr8.length - 1, objArr8, objArr8);
            }
            this.purple[oscar] = obj;
        }
        this.red++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i4, Collection elements) {
        Intrinsics.echo(elements, "elements");
        int i5 = this.red;
        if (i4 >= 0 && i4 <= i5) {
            if (elements.isEmpty()) {
                return false;
            }
            if (i4 == this.red) {
                return addAll(elements);
            }
            quebec();
            hotel(elements.size() + this.red);
            int oscar = oscar(this.red + this.alpha);
            int oscar2 = oscar(this.alpha + i4);
            int size = elements.size();
            if (i4 < ((this.red + 1) >> 1)) {
                int i10 = this.alpha;
                int i11 = i10 - size;
                if (oscar2 < i10) {
                    Object[] objArr = this.purple;
                    ArraysKt.yankee(i11, i10, objArr.length, objArr, objArr);
                    if (size >= oscar2) {
                        Object[] objArr2 = this.purple;
                        ArraysKt.yankee(objArr2.length - size, 0, oscar2, objArr2, objArr2);
                    } else {
                        Object[] objArr3 = this.purple;
                        ArraysKt.yankee(objArr3.length - size, 0, size, objArr3, objArr3);
                        Object[] objArr4 = this.purple;
                        ArraysKt.yankee(0, size, oscar2, objArr4, objArr4);
                    }
                } else if (i11 >= 0) {
                    Object[] objArr5 = this.purple;
                    ArraysKt.yankee(i11, i10, oscar2, objArr5, objArr5);
                } else {
                    Object[] objArr6 = this.purple;
                    i11 += objArr6.length;
                    int i12 = oscar2 - i10;
                    int length = objArr6.length - i11;
                    if (length >= i12) {
                        ArraysKt.yankee(i11, i10, oscar2, objArr6, objArr6);
                    } else {
                        ArraysKt.yankee(i11, i10, i10 + length, objArr6, objArr6);
                        Object[] objArr7 = this.purple;
                        ArraysKt.yankee(0, this.alpha + length, oscar2, objArr7, objArr7);
                    }
                }
                this.alpha = i11;
                delta(mike(oscar2 - size), elements);
                return true;
            }
            int i13 = oscar2 + size;
            if (oscar2 < oscar) {
                int i14 = size + oscar;
                Object[] objArr8 = this.purple;
                if (i14 <= objArr8.length) {
                    ArraysKt.yankee(i13, oscar2, oscar, objArr8, objArr8);
                } else if (i13 >= objArr8.length) {
                    ArraysKt.yankee(i13 - objArr8.length, oscar2, oscar, objArr8, objArr8);
                } else {
                    int length2 = oscar - (i14 - objArr8.length);
                    ArraysKt.yankee(0, length2, oscar, objArr8, objArr8);
                    Object[] objArr9 = this.purple;
                    ArraysKt.yankee(i13, oscar2, length2, objArr9, objArr9);
                }
            } else {
                Object[] objArr10 = this.purple;
                ArraysKt.yankee(size, 0, oscar, objArr10, objArr10);
                Object[] objArr11 = this.purple;
                if (i13 >= objArr11.length) {
                    ArraysKt.yankee(i13 - objArr11.length, oscar2, objArr11.length, objArr11, objArr11);
                } else {
                    ArraysKt.yankee(0, objArr11.length - size, objArr11.length, objArr11, objArr11);
                    Object[] objArr12 = this.purple;
                    ArraysKt.yankee(i13, oscar2, objArr12.length - size, objArr12, objArr12);
                }
            }
            delta(oscar2, elements);
            return true;
        }
        throw new IndexOutOfBoundsException(A0.z.juliet("index: ", i4, i5, ", size: "));
    }

    public final void addFirst(Object obj) {
        quebec();
        hotel(this.red + 1);
        int i4 = this.alpha;
        if (i4 == 0) {
            Object[] objArr = this.purple;
            Intrinsics.echo(objArr, "<this>");
            i4 = objArr.length;
        }
        int i5 = i4 - 1;
        this.alpha = i5;
        this.purple[i5] = obj;
        this.red++;
    }

    public final void addLast(Object obj) {
        quebec();
        hotel(alpha() + 1);
        this.purple[oscar(alpha() + this.alpha)] = obj;
        this.red = alpha() + 1;
    }

    @Override // kotlin.collections.g
    public final int alpha() {
        return this.red;
    }

    @Override // kotlin.collections.g
    public final Object bravo(int i4) {
        int i5 = this.red;
        if (i4 >= 0 && i4 < i5) {
            if (i4 == CollectionsKt.ivory(this)) {
                return removeLast();
            }
            if (i4 == 0) {
                return removeFirst();
            }
            quebec();
            int oscar = oscar(this.alpha + i4);
            Object[] objArr = this.purple;
            Object obj = objArr[oscar];
            if (i4 < (this.red >> 1)) {
                int i10 = this.alpha;
                if (oscar >= i10) {
                    ArraysKt.yankee(i10 + 1, i10, oscar, objArr, objArr);
                } else {
                    ArraysKt.yankee(1, 0, oscar, objArr, objArr);
                    Object[] objArr2 = this.purple;
                    objArr2[0] = objArr2[objArr2.length - 1];
                    int i11 = this.alpha;
                    ArraysKt.yankee(i11 + 1, i11, objArr2.length - 1, objArr2, objArr2);
                }
                Object[] objArr3 = this.purple;
                int i12 = this.alpha;
                objArr3[i12] = null;
                this.alpha = kilo(i12);
            } else {
                int oscar2 = oscar(CollectionsKt.ivory(this) + this.alpha);
                if (oscar <= oscar2) {
                    Object[] objArr4 = this.purple;
                    ArraysKt.yankee(oscar, oscar + 1, oscar2 + 1, objArr4, objArr4);
                } else {
                    Object[] objArr5 = this.purple;
                    ArraysKt.yankee(oscar, oscar + 1, objArr5.length, objArr5, objArr5);
                    Object[] objArr6 = this.purple;
                    objArr6[objArr6.length - 1] = objArr6[0];
                    ArraysKt.yankee(0, 1, oscar2 + 1, objArr6, objArr6);
                }
                this.purple[oscar2] = null;
            }
            this.red--;
            return obj;
        }
        throw new IndexOutOfBoundsException(A0.z.juliet("index: ", i4, i5, ", size: "));
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            quebec();
            november(this.alpha, oscar(alpha() + this.alpha));
        }
        this.alpha = 0;
        this.red = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    public final void delta(int i4, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.purple.length;
        while (i4 < length && it.hasNext()) {
            this.purple[i4] = it.next();
            i4++;
        }
        int i5 = this.alpha;
        for (int i10 = 0; i10 < i5 && it.hasNext(); i10++) {
            this.purple[i10] = it.next();
        }
        this.red = collection.size() + this.red;
    }

    public final Object first() {
        if (!isEmpty()) {
            return this.purple[this.alpha];
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i4) {
        int alpha = alpha();
        if (i4 >= 0 && i4 < alpha) {
            return this.purple[oscar(this.alpha + i4)];
        }
        throw new IndexOutOfBoundsException(A0.z.juliet("index: ", i4, alpha, ", size: "));
    }

    public final void hotel(int i4) {
        if (i4 >= 0) {
            Object[] objArr = this.purple;
            if (i4 <= objArr.length) {
                return;
            }
            if (objArr == silver) {
                if (i4 < 10) {
                    i4 = 10;
                }
                this.purple = new Object[i4];
                return;
            }
            int length = objArr.length;
            int i5 = length + (length >> 1);
            if (i5 - i4 < 0) {
                i5 = i4;
            }
            if (i5 - 2147483639 > 0) {
                if (i4 > 2147483639) {
                    i5 = LottieConstants.IterateForever;
                } else {
                    i5 = 2147483639;
                }
            }
            Object[] objArr2 = new Object[i5];
            ArraysKt.yankee(0, this.alpha, objArr.length, objArr, objArr2);
            Object[] objArr3 = this.purple;
            int length2 = objArr3.length;
            int i10 = this.alpha;
            ArraysKt.yankee(length2 - i10, 0, i10, objArr3, objArr2);
            this.alpha = 0;
            this.purple = objArr2;
            return;
        }
        throw new IllegalStateException("Deque is too big.");
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i4;
        int oscar = oscar(alpha() + this.alpha);
        int i5 = this.alpha;
        if (i5 < oscar) {
            while (i5 < oscar) {
                if (Intrinsics.areEqual(obj, this.purple[i5])) {
                    i4 = this.alpha;
                } else {
                    i5++;
                }
            }
            return -1;
        }
        if (i5 >= oscar) {
            int length = this.purple.length;
            while (true) {
                if (i5 < length) {
                    if (Intrinsics.areEqual(obj, this.purple[i5])) {
                        i4 = this.alpha;
                        break;
                    }
                    i5++;
                } else {
                    for (int i10 = 0; i10 < oscar; i10++) {
                        if (Intrinsics.areEqual(obj, this.purple[i10])) {
                            i5 = i10 + this.purple.length;
                            i4 = this.alpha;
                        }
                    }
                    return -1;
                }
            }
        } else {
            return -1;
        }
        return i5 - i4;
    }

    public final Object india() {
        if (isEmpty()) {
            return null;
        }
        return this.purple[this.alpha];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        if (alpha() == 0) {
            return true;
        }
        return false;
    }

    public final int kilo(int i4) {
        Intrinsics.echo(this.purple, "<this>");
        if (i4 == r0.length - 1) {
            return 0;
        }
        return i4 + 1;
    }

    public final Object last() {
        if (!isEmpty()) {
            return this.purple[oscar(CollectionsKt.ivory(this) + this.alpha)];
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int length;
        int i4;
        int oscar = oscar(this.red + this.alpha);
        int i5 = this.alpha;
        if (i5 < oscar) {
            length = oscar - 1;
            if (i5 <= length) {
                while (!Intrinsics.areEqual(obj, this.purple[length])) {
                    if (length != i5) {
                        length--;
                    }
                }
                i4 = this.alpha;
                return length - i4;
            }
            return -1;
        }
        if (i5 > oscar) {
            int i10 = oscar - 1;
            while (true) {
                if (-1 < i10) {
                    if (Intrinsics.areEqual(obj, this.purple[i10])) {
                        length = i10 + this.purple.length;
                        i4 = this.alpha;
                        break;
                    }
                    i10--;
                } else {
                    Object[] objArr = this.purple;
                    Intrinsics.echo(objArr, "<this>");
                    length = objArr.length - 1;
                    int i11 = this.alpha;
                    if (i11 <= length) {
                        while (!Intrinsics.areEqual(obj, this.purple[length])) {
                            if (length != i11) {
                                length--;
                            }
                        }
                        i4 = this.alpha;
                    }
                }
            }
        }
        return -1;
    }

    public final Object lima() {
        if (isEmpty()) {
            return null;
        }
        return this.purple[oscar(CollectionsKt.ivory(this) + this.alpha)];
    }

    public final int mike(int i4) {
        if (i4 < 0) {
            return i4 + this.purple.length;
        }
        return i4;
    }

    public final void november(int i4, int i5) {
        if (i4 < i5) {
            ArraysKt.coral(i4, i5, null, this.purple);
            return;
        }
        Object[] objArr = this.purple;
        ArraysKt.coral(i4, objArr.length, null, objArr);
        ArraysKt.coral(0, i5, null, this.purple);
    }

    public final int oscar(int i4) {
        Object[] objArr = this.purple;
        if (i4 >= objArr.length) {
            return i4 - objArr.length;
        }
        return i4;
    }

    public final void quebec() {
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        bravo(indexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection elements) {
        int oscar;
        Intrinsics.echo(elements, "elements");
        boolean z2 = false;
        z2 = false;
        z2 = false;
        if (!isEmpty() && this.purple.length != 0) {
            int oscar2 = oscar(alpha() + this.alpha);
            int i4 = this.alpha;
            if (i4 < oscar2) {
                oscar = i4;
                while (i4 < oscar2) {
                    Object obj = this.purple[i4];
                    if (!elements.contains(obj)) {
                        this.purple[oscar] = obj;
                        oscar++;
                    } else {
                        z2 = true;
                    }
                    i4++;
                }
                ArraysKt.coral(oscar, oscar2, null, this.purple);
            } else {
                int length = this.purple.length;
                boolean z10 = false;
                int i5 = i4;
                while (i4 < length) {
                    Object[] objArr = this.purple;
                    Object obj2 = objArr[i4];
                    objArr[i4] = null;
                    if (!elements.contains(obj2)) {
                        this.purple[i5] = obj2;
                        i5++;
                    } else {
                        z10 = true;
                    }
                    i4++;
                }
                oscar = oscar(i5);
                for (int i10 = 0; i10 < oscar2; i10++) {
                    Object[] objArr2 = this.purple;
                    Object obj3 = objArr2[i10];
                    objArr2[i10] = null;
                    if (!elements.contains(obj3)) {
                        this.purple[oscar] = obj3;
                        oscar = kilo(oscar);
                    } else {
                        z10 = true;
                    }
                }
                z2 = z10;
            }
            if (z2) {
                quebec();
                this.red = mike(oscar - this.alpha);
            }
        }
        return z2;
    }

    public final Object removeFirst() {
        if (!isEmpty()) {
            quebec();
            Object[] objArr = this.purple;
            int i4 = this.alpha;
            Object obj = objArr[i4];
            objArr[i4] = null;
            this.alpha = kilo(i4);
            this.red = alpha() - 1;
            return obj;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    public final Object removeLast() {
        if (!isEmpty()) {
            quebec();
            int oscar = oscar(CollectionsKt.ivory(this) + this.alpha);
            Object[] objArr = this.purple;
            Object obj = objArr[oscar];
            objArr[oscar] = null;
            this.red = alpha() - 1;
            return obj;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i4, int i5) {
        ab.delta(i4, i5, this.red);
        int i10 = i5 - i4;
        if (i10 == 0) {
            return;
        }
        if (i10 == this.red) {
            clear();
            return;
        }
        if (i10 == 1) {
            bravo(i4);
            return;
        }
        quebec();
        if (i4 < this.red - i5) {
            int oscar = oscar(this.alpha + (i4 - 1));
            int oscar2 = oscar(this.alpha + (i5 - 1));
            while (i4 > 0) {
                int i11 = oscar + 1;
                int min = Math.min(i4, Math.min(i11, oscar2 + 1));
                Object[] objArr = this.purple;
                int i12 = oscar2 - min;
                int i13 = oscar - min;
                ArraysKt.yankee(i12 + 1, i13 + 1, i11, objArr, objArr);
                oscar = mike(i13);
                oscar2 = mike(i12);
                i4 -= min;
            }
            int oscar3 = oscar(this.alpha + i10);
            november(this.alpha, oscar3);
            this.alpha = oscar3;
        } else {
            int oscar4 = oscar(this.alpha + i5);
            int oscar5 = oscar(this.alpha + i4);
            int i14 = this.red;
            while (true) {
                i14 -= i5;
                if (i14 <= 0) {
                    break;
                }
                Object[] objArr2 = this.purple;
                i5 = Math.min(i14, Math.min(objArr2.length - oscar4, objArr2.length - oscar5));
                Object[] objArr3 = this.purple;
                int i15 = oscar4 + i5;
                ArraysKt.yankee(oscar5, oscar4, i15, objArr3, objArr3);
                oscar4 = oscar(i15);
                oscar5 = oscar(oscar5 + i5);
            }
            int oscar6 = oscar(this.red + this.alpha);
            november(mike(oscar6 - i10), oscar6);
        }
        this.red -= i10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection elements) {
        int oscar;
        Intrinsics.echo(elements, "elements");
        boolean z2 = false;
        z2 = false;
        z2 = false;
        if (!isEmpty() && this.purple.length != 0) {
            int oscar2 = oscar(alpha() + this.alpha);
            int i4 = this.alpha;
            if (i4 < oscar2) {
                oscar = i4;
                while (i4 < oscar2) {
                    Object obj = this.purple[i4];
                    if (elements.contains(obj)) {
                        this.purple[oscar] = obj;
                        oscar++;
                    } else {
                        z2 = true;
                    }
                    i4++;
                }
                ArraysKt.coral(oscar, oscar2, null, this.purple);
            } else {
                int length = this.purple.length;
                boolean z10 = false;
                int i5 = i4;
                while (i4 < length) {
                    Object[] objArr = this.purple;
                    Object obj2 = objArr[i4];
                    objArr[i4] = null;
                    if (elements.contains(obj2)) {
                        this.purple[i5] = obj2;
                        i5++;
                    } else {
                        z10 = true;
                    }
                    i4++;
                }
                oscar = oscar(i5);
                for (int i10 = 0; i10 < oscar2; i10++) {
                    Object[] objArr2 = this.purple;
                    Object obj3 = objArr2[i10];
                    objArr2[i10] = null;
                    if (elements.contains(obj3)) {
                        this.purple[oscar] = obj3;
                        oscar = kilo(oscar);
                    } else {
                        z10 = true;
                    }
                }
                z2 = z10;
            }
            if (z2) {
                quebec();
                this.red = mike(oscar - this.alpha);
            }
        }
        return z2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i4, Object obj) {
        int alpha = alpha();
        if (i4 >= 0 && i4 < alpha) {
            int oscar = oscar(this.alpha + i4);
            Object[] objArr = this.purple;
            Object obj2 = objArr[oscar];
            objArr[oscar] = obj;
            return obj2;
        }
        throw new IndexOutOfBoundsException(A0.z.juliet("index: ", i4, alpha, ", size: "));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[alpha()]);
    }

    public l(int i4) {
        Object[] objArr;
        if (i4 == 0) {
            objArr = silver;
        } else if (i4 > 0) {
            objArr = new Object[i4];
        } else {
            throw new IllegalArgumentException(ad.zulu(i4, "Illegal Capacity: "));
        }
        this.purple = objArr;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] array) {
        Intrinsics.echo(array, "array");
        int length = array.length;
        int i4 = this.red;
        if (length < i4) {
            Object newInstance = Array.newInstance(array.getClass().getComponentType(), i4);
            Intrinsics.charlie(newInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
            array = (Object[]) newInstance;
        }
        int oscar = oscar(this.red + this.alpha);
        int i5 = this.alpha;
        if (i5 < oscar) {
            ArraysKt.beige(i5, oscar, 2, this.purple, array);
        } else if (!isEmpty()) {
            Object[] objArr = this.purple;
            ArraysKt.yankee(0, this.alpha, objArr.length, objArr, array);
            Object[] objArr2 = this.purple;
            ArraysKt.yankee(objArr2.length - this.alpha, 0, oscar, objArr2, array);
        }
        int i10 = this.red;
        if (i10 < array.length) {
            array[i10] = null;
        }
        return array;
    }

    public l(aa aaVar) {
        Object[] delta = kotlin.jvm.internal.j.delta(aaVar, new Object[0]);
        this.purple = delta;
        this.red = delta.length;
        if (delta.length == 0) {
            this.purple = silver;
        }
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection elements) {
        Intrinsics.echo(elements, "elements");
        if (elements.isEmpty()) {
            return false;
        }
        quebec();
        hotel(elements.size() + alpha());
        delta(oscar(alpha() + this.alpha), elements);
        return true;
    }
}
