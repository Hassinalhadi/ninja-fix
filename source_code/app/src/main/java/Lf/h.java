package Lf;

import Nf.C0265x;
import android.view.View;
import android.view.ViewGroup;
import bv.ax;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.UByte;
import kotlin.UInt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p;
import kotlin.s;
import pf.C2352b;

/* loaded from: classes2.dex */
public final class h implements Iterator, Yd.a {
    public final /* synthetic */ int alpha;
    public int purple;
    public final Object red;

    public /* synthetic */ h(int i4, Object obj) {
        this.alpha = i4;
        this.red = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        Iterator it;
        switch (this.alpha) {
            case 0:
                if (this.purple > 0) {
                    return true;
                }
                return false;
            case 1:
                if (this.purple < ((ax) this.red).golf()) {
                    return true;
                }
                return false;
            case 2:
                if (this.purple < ((byte[]) this.red).length) {
                    return true;
                }
                return false;
            case 3:
                if (this.purple < ((int[]) this.red).length) {
                    return true;
                }
                return false;
            case 4:
                if (this.purple < ((long[]) this.red).length) {
                    return true;
                }
                return false;
            case 5:
                if (this.purple < ((short[]) this.red).length) {
                    return true;
                }
                return false;
            case 6:
                if (this.purple < ((Object[]) this.red).length) {
                    return true;
                }
                return false;
            case 7:
                break;
            default:
                if (this.purple < ((ViewGroup) this.red).getChildCount()) {
                    return true;
                }
                return false;
        }
        while (true) {
            int i4 = this.purple;
            it = (Iterator) this.red;
            if (i4 > 0 && it.hasNext()) {
                it.next();
                this.purple--;
            }
        }
        return it.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Iterator it;
        switch (this.alpha) {
            case 0:
                C0265x c0265x = (C0265x) this.red;
                int i4 = this.purple;
                this.purple = i4 - 1;
                return c0265x.echo[c0265x.charlie - i4];
            case 1:
                int i5 = this.purple;
                this.purple = i5 + 1;
                return ((ax) this.red).hotel(i5);
            case 2:
                int i10 = this.purple;
                byte[] bArr = (byte[]) this.red;
                if (i10 < bArr.length) {
                    this.purple = i10 + 1;
                    return UByte.m208boximpl(UByte.m209constructorimpl(bArr[i10]));
                }
                throw new NoSuchElementException(String.valueOf(this.purple));
            case 3:
                int i11 = this.purple;
                int[] iArr = (int[]) this.red;
                if (i11 < iArr.length) {
                    this.purple = i11 + 1;
                    return new UInt(UInt.m210constructorimpl(iArr[i11]));
                }
                throw new NoSuchElementException(String.valueOf(this.purple));
            case 4:
                int i12 = this.purple;
                long[] jArr = (long[]) this.red;
                if (i12 < jArr.length) {
                    this.purple = i12 + 1;
                    return new p(jArr[i12]);
                }
                throw new NoSuchElementException(String.valueOf(this.purple));
            case 5:
                int i13 = this.purple;
                short[] sArr = (short[]) this.red;
                if (i13 < sArr.length) {
                    this.purple = i13 + 1;
                    return new s(sArr[i13]);
                }
                throw new NoSuchElementException(String.valueOf(this.purple));
            case 6:
                try {
                    Object[] objArr = (Object[]) this.red;
                    int i14 = this.purple;
                    this.purple = i14 + 1;
                    return objArr[i14];
                } catch (ArrayIndexOutOfBoundsException e) {
                    this.purple--;
                    throw new NoSuchElementException(e.getMessage());
                }
            case 7:
                break;
            default:
                int i15 = this.purple;
                this.purple = i15 + 1;
                View childAt = ((ViewGroup) this.red).getChildAt(i15);
                if (childAt != null) {
                    return childAt;
                }
                throw new IndexOutOfBoundsException();
        }
        while (true) {
            int i16 = this.purple;
            it = (Iterator) this.red;
            if (i16 > 0 && it.hasNext()) {
                it.next();
                this.purple--;
            }
        }
        return it.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.alpha) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 2:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 3:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 4:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 5:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 6:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 7:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                int i4 = this.purple - 1;
                this.purple = i4;
                ((ViewGroup) this.red).removeViewAt(i4);
                return;
        }
    }

    public h(Object[] array) {
        this.alpha = 6;
        Intrinsics.echo(array, "array");
        this.red = array;
    }

    public h(C0265x c0265x) {
        this.alpha = 0;
        this.red = c0265x;
        this.purple = c0265x.charlie;
    }

    public h(C2352b c2352b) {
        this.alpha = 7;
        this.red = c2352b.alpha.iterator();
        this.purple = c2352b.bravo;
    }
}
