package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
public final class V1 extends AbstractC1345l1 implements RandomAccess {
    public static final Object[] silver;
    public static final V1 teal;
    public Object[] purple;
    public int red;

    static {
        Object[] objArr = new Object[0];
        silver = objArr;
        teal = new V1(objArr, 0, false);
    }

    public V1(Object[] objArr, int i4, boolean z2) {
        super(z2);
        this.purple = objArr;
        this.red = i4;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i4, Object obj) {
        int i5;
        alpha();
        if (i4 >= 0 && i4 <= (i5 = this.red)) {
            int i10 = i4 + 1;
            Object[] objArr = this.purple;
            int length = objArr.length;
            if (i5 < length) {
                System.arraycopy(objArr, i4, objArr, i10, i5 - i4);
            } else {
                Object[] objArr2 = new Object[Math.max(((length * 3) / 2) + 1, 10)];
                System.arraycopy(this.purple, 0, objArr2, 0, i4);
                System.arraycopy(this.purple, i4, objArr2, i10, this.red - i4);
                this.purple = objArr2;
            }
            this.purple[i4] = obj;
            this.red++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(A0.z.juliet("Index:", i4, this.red, ", Size:"));
    }

    public final void bravo(int i4) {
        if (i4 >= 0 && i4 < this.red) {
        } else {
            throw new IndexOutOfBoundsException(A0.z.juliet("Index:", i4, this.red, ", Size:"));
        }
    }

    @Override // com.google.android.gms.internal.measurement.D1
    public final /* bridge */ /* synthetic */ D1 foxtrot(int i4) {
        Object[] copyOf;
        if (i4 >= this.red) {
            if (i4 == 0) {
                copyOf = silver;
            } else {
                copyOf = Arrays.copyOf(this.purple, i4);
            }
            return new V1(copyOf, this.red, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i4) {
        bravo(i4);
        return this.purple[i4];
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1345l1, java.util.AbstractList, java.util.List
    public final Object remove(int i4) {
        alpha();
        bravo(i4);
        Object[] objArr = this.purple;
        Object obj = objArr[i4];
        if (i4 < this.red - 1) {
            System.arraycopy(objArr, i4 + 1, objArr, i4, (r2 - i4) - 1);
        }
        this.red--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i4, Object obj) {
        alpha();
        bravo(i4);
        Object[] objArr = this.purple;
        Object obj2 = objArr[i4];
        objArr[i4] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.red;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        alpha();
        int i4 = this.red;
        int length = this.purple.length;
        if (i4 == length) {
            this.purple = Arrays.copyOf(this.purple, Math.max(((length * 3) / 2) + 1, 10));
        }
        Object[] objArr = this.purple;
        int i5 = this.red;
        this.red = i5 + 1;
        objArr[i5] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
