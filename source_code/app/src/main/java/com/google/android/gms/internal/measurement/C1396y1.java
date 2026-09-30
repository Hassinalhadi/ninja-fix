package com.google.android.gms.internal.measurement;

import com.airbnb.lottie.compose.LottieConstants;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.measurement.y1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1396y1 extends AbstractC1345l1 implements RandomAccess, B1, T1 {
    public static final int[] silver;
    public static final C1396y1 teal;
    public int[] purple;
    public int red;

    static {
        int[] iArr = new int[0];
        silver = iArr;
        teal = new C1396y1(iArr, 0, false);
    }

    public C1396y1(int[] iArr, int i4, boolean z2) {
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
            int i10 = i4 + 1;
            int[] iArr = this.purple;
            int length = iArr.length;
            if (i5 < length) {
                System.arraycopy(iArr, i4, iArr, i10, i5 - i4);
            } else {
                int[] iArr2 = new int[Math.max(((length * 3) / 2) + 1, 10)];
                System.arraycopy(this.purple, 0, iArr2, 0, i4);
                System.arraycopy(this.purple, i4, iArr2, i10, this.red - i4);
                this.purple = iArr2;
            }
            this.purple[i4] = intValue;
            this.red++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(A0.z.juliet("Index:", i4, this.red, ", Size:"));
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1345l1, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        alpha();
        Charset charset = E1.alpha;
        collection.getClass();
        if (!(collection instanceof C1396y1)) {
            return super.addAll(collection);
        }
        C1396y1 c1396y1 = (C1396y1) collection;
        int i4 = c1396y1.red;
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
            System.arraycopy(c1396y1.purple, 0, this.purple, this.red, c1396y1.red);
            this.red = i10;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final int bravo(int i4) {
        india(i4);
        return this.purple[i4];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.D1
    /* renamed from: delta, reason: merged with bridge method [inline-methods] */
    public final C1396y1 foxtrot(int i4) {
        int[] copyOf;
        if (i4 >= this.red) {
            if (i4 == 0) {
                copyOf = silver;
            } else {
                copyOf = Arrays.copyOf(this.purple, i4);
            }
            return new C1396y1(copyOf, this.red, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1345l1, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1396y1)) {
            return super.equals(obj);
        }
        C1396y1 c1396y1 = (C1396y1) obj;
        if (this.red != c1396y1.red) {
            return false;
        }
        int[] iArr = c1396y1.purple;
        for (int i4 = 0; i4 < this.red; i4++) {
            if (this.purple[i4] != iArr[i4]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i4) {
        india(i4);
        return Integer.valueOf(this.purple[i4]);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1345l1, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i4 = 1;
        for (int i5 = 0; i5 < this.red; i5++) {
            i4 = (i4 * 31) + this.purple[i5];
        }
        return i4;
    }

    public final void hotel(int i4) {
        alpha();
        int i5 = this.red;
        int length = this.purple.length;
        if (i5 == length) {
            int[] iArr = new int[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.purple, 0, iArr, 0, this.red);
            this.purple = iArr;
        }
        int[] iArr2 = this.purple;
        int i10 = this.red;
        this.red = i10 + 1;
        iArr2[i10] = i4;
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

    public final void india(int i4) {
        if (i4 >= 0 && i4 < this.red) {
        } else {
            throw new IndexOutOfBoundsException(A0.z.juliet("Index:", i4, this.red, ", Size:"));
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1345l1, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i4) {
        alpha();
        india(i4);
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
    public final /* bridge */ /* synthetic */ Object set(int i4, Object obj) {
        int intValue = ((Integer) obj).intValue();
        alpha();
        india(i4);
        int[] iArr = this.purple;
        int i5 = iArr[i4];
        iArr[i4] = intValue;
        return Integer.valueOf(i5);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.red;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        hotel(((Integer) obj).intValue());
        return true;
    }
}
