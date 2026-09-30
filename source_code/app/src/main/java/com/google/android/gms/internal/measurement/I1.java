package com.google.android.gms.internal.measurement;

import com.airbnb.lottie.compose.LottieConstants;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
public final class I1 extends AbstractC1345l1 implements RandomAccess, C1, T1 {
    public static final long[] silver;
    public static final I1 teal;
    public long[] purple;
    public int red;

    static {
        long[] jArr = new long[0];
        silver = jArr;
        teal = new I1(jArr, 0, false);
    }

    public I1(long[] jArr, int i4, boolean z2) {
        super(z2);
        this.purple = jArr;
        this.red = i4;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i4, Object obj) {
        int i5;
        long longValue = ((Long) obj).longValue();
        alpha();
        if (i4 >= 0 && i4 <= (i5 = this.red)) {
            int i10 = i4 + 1;
            long[] jArr = this.purple;
            int length = jArr.length;
            if (i5 < length) {
                System.arraycopy(jArr, i4, jArr, i10, i5 - i4);
            } else {
                long[] jArr2 = new long[Math.max(((length * 3) / 2) + 1, 10)];
                System.arraycopy(this.purple, 0, jArr2, 0, i4);
                System.arraycopy(this.purple, i4, jArr2, i10, this.red - i4);
                this.purple = jArr2;
            }
            this.purple[i4] = longValue;
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
        if (!(collection instanceof I1)) {
            return super.addAll(collection);
        }
        I1 i12 = (I1) collection;
        int i4 = i12.red;
        if (i4 == 0) {
            return false;
        }
        int i5 = this.red;
        if (LottieConstants.IterateForever - i5 >= i4) {
            int i10 = i5 + i4;
            long[] jArr = this.purple;
            if (i10 > jArr.length) {
                this.purple = Arrays.copyOf(jArr, i10);
            }
            System.arraycopy(i12.purple, 0, this.purple, this.red, i12.red);
            this.red = i10;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final long bravo(int i4) {
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
    public final I1 foxtrot(int i4) {
        long[] copyOf;
        if (i4 >= this.red) {
            if (i4 == 0) {
                copyOf = silver;
            } else {
                copyOf = Arrays.copyOf(this.purple, i4);
            }
            return new I1(copyOf, this.red, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1345l1, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof I1)) {
            return super.equals(obj);
        }
        I1 i12 = (I1) obj;
        if (this.red != i12.red) {
            return false;
        }
        long[] jArr = i12.purple;
        for (int i4 = 0; i4 < this.red; i4++) {
            if (this.purple[i4] != jArr[i4]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i4) {
        india(i4);
        return Long.valueOf(this.purple[i4]);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1345l1, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i4 = 1;
        for (int i5 = 0; i5 < this.red; i5++) {
            long j5 = this.purple[i5];
            Charset charset = E1.alpha;
            i4 = (i4 * 31) + ((int) (j5 ^ (j5 >>> 32)));
        }
        return i4;
    }

    public final void hotel(long j5) {
        alpha();
        int i4 = this.red;
        int length = this.purple.length;
        if (i4 == length) {
            long[] jArr = new long[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.purple, 0, jArr, 0, this.red);
            this.purple = jArr;
        }
        long[] jArr2 = this.purple;
        int i5 = this.red;
        this.red = i5 + 1;
        jArr2[i5] = j5;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int i4 = this.red;
        for (int i5 = 0; i5 < i4; i5++) {
            if (this.purple[i5] == longValue) {
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
        long[] jArr = this.purple;
        long j5 = jArr[i4];
        if (i4 < this.red - 1) {
            System.arraycopy(jArr, i4 + 1, jArr, i4, (r3 - i4) - 1);
        }
        this.red--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j5);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i4, int i5) {
        alpha();
        if (i5 >= i4) {
            long[] jArr = this.purple;
            System.arraycopy(jArr, i5, jArr, i4, this.red - i5);
            this.red -= i5 - i4;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i4, Object obj) {
        long longValue = ((Long) obj).longValue();
        alpha();
        india(i4);
        long[] jArr = this.purple;
        long j5 = jArr[i4];
        jArr[i4] = longValue;
        return Long.valueOf(j5);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.red;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        hotel(((Long) obj).longValue());
        return true;
    }
}
