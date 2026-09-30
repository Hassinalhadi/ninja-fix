package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import androidx.appcompat.widget.P0;
import com.airbnb.lottie.compose.LottieConstants;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
public final class ag extends r implements RandomAccess, aq {
    public static final ag silver = new ag(new float[0], 0, false);
    public float[] purple;
    public int red;

    public ag(float[] fArr, int i4, boolean z2) {
        super(z2);
        this.purple = fArr;
        this.red = i4;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i4, Object obj) {
        int i5;
        float floatValue = ((Float) obj).floatValue();
        alpha();
        if (i4 >= 0 && i4 <= (i5 = this.red)) {
            int i10 = i4 + 1;
            float[] fArr = this.purple;
            if (i5 < fArr.length) {
                System.arraycopy(fArr, i4, fArr, i10, i5 - i4);
            } else {
                float[] fArr2 = new float[P0.ivory(i5, 3, 2, 1)];
                System.arraycopy(fArr, 0, fArr2, 0, i4);
                System.arraycopy(this.purple, i4, fArr2, i10, this.red - i4);
                this.purple = fArr2;
            }
            this.purple[i4] = floatValue;
            this.red++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(A0.z.juliet("Index:", i4, this.red, ", Size:"));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.r, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        alpha();
        Charset charset = at.alpha;
        collection.getClass();
        if (!(collection instanceof ag)) {
            return super.addAll(collection);
        }
        ag agVar = (ag) collection;
        int i4 = agVar.red;
        if (i4 == 0) {
            return false;
        }
        int i5 = this.red;
        if (LottieConstants.IterateForever - i5 >= i4) {
            int i10 = i5 + i4;
            float[] fArr = this.purple;
            if (i10 > fArr.length) {
                this.purple = Arrays.copyOf(fArr, i10);
            }
            System.arraycopy(agVar.purple, 0, this.purple, this.red, agVar.red);
            this.red = i10;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final void bravo(float f5) {
        alpha();
        int i4 = this.red;
        float[] fArr = this.purple;
        if (i4 == fArr.length) {
            float[] fArr2 = new float[P0.ivory(i4, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i4);
            this.purple = fArr2;
        }
        float[] fArr3 = this.purple;
        int i5 = this.red;
        this.red = i5 + 1;
        fArr3[i5] = f5;
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
        } else {
            throw new IndexOutOfBoundsException(A0.z.juliet("Index:", i4, this.red, ", Size:"));
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.r, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ag)) {
            return super.equals(obj);
        }
        ag agVar = (ag) obj;
        if (this.red != agVar.red) {
            return false;
        }
        float[] fArr = agVar.purple;
        for (int i4 = 0; i4 < this.red; i4++) {
            if (Float.floatToIntBits(this.purple[i4]) != Float.floatToIntBits(fArr[i4])) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.as
    public final as foxtrot(int i4) {
        if (i4 >= this.red) {
            return new ag(Arrays.copyOf(this.purple, i4), this.red, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i4) {
        delta(i4);
        return Float.valueOf(this.purple[i4]);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.r, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i4 = 1;
        for (int i5 = 0; i5 < this.red; i5++) {
            i4 = (i4 * 31) + Float.floatToIntBits(this.purple[i5]);
        }
        return i4;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float floatValue = ((Float) obj).floatValue();
        int i4 = this.red;
        for (int i5 = 0; i5 < i4; i5++) {
            if (this.purple[i5] == floatValue) {
                return i5;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.r, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i4) {
        alpha();
        delta(i4);
        float[] fArr = this.purple;
        float f5 = fArr[i4];
        if (i4 < this.red - 1) {
            System.arraycopy(fArr, i4 + 1, fArr, i4, (r2 - i4) - 1);
        }
        this.red--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f5);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i4, int i5) {
        alpha();
        if (i5 >= i4) {
            float[] fArr = this.purple;
            System.arraycopy(fArr, i5, fArr, i4, this.red - i5);
            this.red -= i5 - i4;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i4, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        alpha();
        delta(i4);
        float[] fArr = this.purple;
        float f5 = fArr[i4];
        fArr[i4] = floatValue;
        return Float.valueOf(f5);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.red;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        bravo(((Float) obj).floatValue());
        return true;
    }
}
