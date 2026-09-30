package com.google.crypto.tink.shaded.protobuf;

import androidx.appcompat.widget.P0;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
public final class ax extends AbstractC1484b implements RandomAccess {
    public static final ax silver;
    public Object[] purple;
    public int red;

    static {
        ax axVar = new ax(0, new Object[0]);
        silver = axVar;
        axVar.alpha = false;
    }

    public ax(int i4, Object[] objArr) {
        this.purple = objArr;
        this.red = i4;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1484b, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        alpha();
        int i4 = this.red;
        Object[] objArr = this.purple;
        if (i4 == objArr.length) {
            this.purple = Arrays.copyOf(objArr, ((i4 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.purple;
        int i5 = this.red;
        this.red = i5 + 1;
        objArr2[i5] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void bravo(int i4) {
        if (i4 >= 0 && i4 < this.red) {
            return;
        }
        StringBuilder sierra = Q0.c.sierra(i4, "Index:", ", Size:");
        sierra.append(this.red);
        throw new IndexOutOfBoundsException(sierra.toString());
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i4) {
        bravo(i4);
        return this.purple[i4];
    }

    @Override // com.google.crypto.tink.shaded.protobuf.aa
    public final aa golf(int i4) {
        if (i4 >= this.red) {
            return new ax(this.red, Arrays.copyOf(this.purple, i4));
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
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

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i4, Object obj) {
        int i5;
        alpha();
        if (i4 >= 0 && i4 <= (i5 = this.red)) {
            Object[] objArr = this.purple;
            if (i5 < objArr.length) {
                System.arraycopy(objArr, i4, objArr, i4 + 1, i5 - i4);
            } else {
                Object[] objArr2 = new Object[P0.ivory(i5, 3, 2, 1)];
                System.arraycopy(objArr, 0, objArr2, 0, i4);
                System.arraycopy(this.purple, i4, objArr2, i4 + 1, this.red - i4);
                this.purple = objArr2;
            }
            this.purple[i4] = obj;
            this.red++;
            ((AbstractList) this).modCount++;
            return;
        }
        StringBuilder sierra = Q0.c.sierra(i4, "Index:", ", Size:");
        sierra.append(this.red);
        throw new IndexOutOfBoundsException(sierra.toString());
    }
}
