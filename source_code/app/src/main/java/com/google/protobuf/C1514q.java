package com.google.protobuf;

import androidx.appcompat.widget.P0;
import com.airbnb.lottie.compose.LottieConstants;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.protobuf.q, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1514q extends AbstractC1499b implements r, RandomAccess, aq {
    public static final C1514q silver = new C1514q(new int[0], 0, false);
    public int[] purple;
    public int red;

    public C1514q(int[] iArr, int i4, boolean z2) {
        super(z2);
        this.purple = iArr;
        this.red = i4;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i4, Object obj) {
        int i5;
        int intValue = ((Integer) obj).intValue();
        alpha();
        if (i4 >= 0 && i4 <= (i5 = this.red)) {
            int[] iArr = this.purple;
            if (i5 < iArr.length) {
                System.arraycopy(iArr, i4, iArr, i4 + 1, i5 - i4);
            } else {
                int[] iArr2 = new int[P0.ivory(i5, 3, 2, 1)];
                System.arraycopy(iArr, 0, iArr2, 0, i4);
                System.arraycopy(this.purple, i4, iArr2, i4 + 1, this.red - i4);
                this.purple = iArr2;
            }
            this.purple[i4] = intValue;
            this.red++;
            ((AbstractList) this).modCount++;
            return;
        }
        StringBuilder sierra = Q0.c.sierra(i4, "Index:", ", Size:");
        sierra.append(this.red);
        throw new IndexOutOfBoundsException(sierra.toString());
    }

    @Override // com.google.protobuf.AbstractC1499b, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        alpha();
        Charset charset = AbstractC1517u.alpha;
        collection.getClass();
        if (!(collection instanceof C1514q)) {
            return super.addAll(collection);
        }
        C1514q c1514q = (C1514q) collection;
        int i4 = c1514q.red;
        if (i4 == 0) {
            return false;
        }
        int i5 = this.red;
        if (LottieConstants.IterateForever - i5 >= i4) {
            int i10 = i5 + i4;
            int[] iArr = this.purple;
            if (i10 > iArr.length) {
                this.purple = Arrays.copyOf(iArr, i10);
            }
            System.arraycopy(c1514q.purple, 0, this.purple, this.red, c1514q.red);
            this.red = i10;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final void bravo(int i4) {
        alpha();
        int i5 = this.red;
        int[] iArr = this.purple;
        if (i5 == iArr.length) {
            int[] iArr2 = new int[P0.ivory(i5, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i5);
            this.purple = iArr2;
        }
        int[] iArr3 = this.purple;
        int i10 = this.red;
        this.red = i10 + 1;
        iArr3[i10] = i4;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    public final void delta(int i4) {
        if (i4 >= 0 && i4 < this.red) {
            return;
        }
        StringBuilder sierra = Q0.c.sierra(i4, "Index:", ", Size:");
        sierra.append(this.red);
        throw new IndexOutOfBoundsException(sierra.toString());
    }

    @Override // com.google.protobuf.AbstractC1499b, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1514q)) {
            return super.equals(obj);
        }
        C1514q c1514q = (C1514q) obj;
        if (this.red != c1514q.red) {
            return false;
        }
        int[] iArr = c1514q.purple;
        for (int i4 = 0; i4 < this.red; i4++) {
            if (this.purple[i4] != iArr[i4]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i4) {
        return Integer.valueOf(hotel(i4));
    }

    @Override // com.google.protobuf.InterfaceC1516t
    public final InterfaceC1516t golf(int i4) {
        if (i4 >= this.red) {
            return new C1514q(Arrays.copyOf(this.purple, i4), this.red, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.AbstractC1499b, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i4 = 1;
        for (int i5 = 0; i5 < this.red; i5++) {
            i4 = (i4 * 31) + this.purple[i5];
        }
        return i4;
    }

    public final int hotel(int i4) {
        delta(i4);
        return this.purple[i4];
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int i4 = this.red;
        for (int i5 = 0; i5 < i4; i5++) {
            if (this.purple[i5] == intValue) {
                return i5;
            }
        }
        return -1;
    }

    @Override // com.google.protobuf.AbstractC1499b, java.util.AbstractList, java.util.List
    public final Object remove(int i4) {
        alpha();
        delta(i4);
        int[] iArr = this.purple;
        int i5 = iArr[i4];
        if (i4 < this.red - 1) {
            System.arraycopy(iArr, i4 + 1, iArr, i4, (r2 - i4) - 1);
        }
        this.red--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i5);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i4, int i5) {
        alpha();
        if (i5 >= i4) {
            int[] iArr = this.purple;
            System.arraycopy(iArr, i5, iArr, i4, this.red - i5);
            this.red -= i5 - i4;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i4, Object obj) {
        int intValue = ((Integer) obj).intValue();
        alpha();
        delta(i4);
        int[] iArr = this.purple;
        int i5 = iArr[i4];
        iArr[i4] = intValue;
        return Integer.valueOf(i5);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.red;
    }

    @Override // com.google.protobuf.AbstractC1499b, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        bravo(((Integer) obj).intValue());
        return true;
    }
}
