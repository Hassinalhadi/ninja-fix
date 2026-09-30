package Oe;

import androidx.datastore.preferences.protobuf.C0599f;
import com.google.android.gms.internal.measurement.C1361p1;
import com.google.crypto.tink.shaded.protobuf.AbstractC1490h;
import com.google.protobuf.C1502e;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class t implements Iterator {
    public final /* synthetic */ int alpha = 0;
    public int purple = 0;
    public final int red;
    public final /* synthetic */ Iterable silver;

    public t(C1361p1 c1361p1) {
        this.silver = c1361p1;
        this.red = c1361p1.delta();
    }

    public byte alpha() {
        try {
            byte[] bArr = ((u) this.silver).purple;
            int i4 = this.purple;
            this.purple = i4 + 1;
            return bArr[i4];
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new NoSuchElementException(e.getMessage());
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.alpha) {
            case 0:
                if (this.purple < this.red) {
                    return true;
                }
                return false;
            case 1:
                if (this.purple < this.red) {
                    return true;
                }
                return false;
            case 2:
                if (this.purple < this.red) {
                    return true;
                }
                return false;
            case 3:
                if (this.purple < this.red) {
                    return true;
                }
                return false;
            default:
                if (this.purple < this.red) {
                    return true;
                }
                return false;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.alpha) {
            case 0:
                return Byte.valueOf(alpha());
            case 1:
                int i4 = this.purple;
                if (i4 < this.red) {
                    this.purple = i4 + 1;
                    return Byte.valueOf(((C0599f) this.silver).kilo(i4));
                }
                throw new NoSuchElementException();
            case 2:
                int i5 = this.purple;
                if (i5 < this.red) {
                    this.purple = i5 + 1;
                    return Byte.valueOf(((C1361p1) this.silver).bravo(i5));
                }
                throw new NoSuchElementException();
            case 3:
                int i10 = this.purple;
                if (i10 < this.red) {
                    this.purple = i10 + 1;
                    return Byte.valueOf(((AbstractC1490h) this.silver).india(i10));
                }
                throw new NoSuchElementException();
            default:
                int i11 = this.purple;
                if (i11 < this.red) {
                    this.purple = i11 + 1;
                    return Byte.valueOf(((C1502e) this.silver).hotel(i11));
                }
                throw new NoSuchElementException();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.alpha) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            case 2:
                throw new UnsupportedOperationException();
            case 3:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    public t(C1502e c1502e) {
        this.silver = c1502e;
        this.red = c1502e.size();
    }

    public t(C0599f c0599f) {
        this.silver = c0599f;
        this.red = c0599f.size();
    }

    public t(AbstractC1490h abstractC1490h) {
        this.silver = abstractC1490h;
        this.red = abstractC1490h.size();
    }

    public t(u uVar) {
        this.silver = uVar;
        this.red = uVar.purple.length;
    }
}
