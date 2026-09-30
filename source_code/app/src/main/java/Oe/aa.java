package Oe;

import com.airbnb.lottie.compose.LottieConstants;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class aa extends e {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f1881a;
    public final int purple;
    public final e red;
    public final e silver;
    public final int teal;
    public final int white;
    public int yellow = 0;

    static {
        ArrayList arrayList = new ArrayList();
        int i4 = 1;
        int i5 = 1;
        while (i4 > 0) {
            arrayList.add(Integer.valueOf(i4));
            int i10 = i5 + i4;
            i5 = i4;
            i4 = i10;
        }
        arrayList.add(Integer.valueOf(LottieConstants.IterateForever));
        f1881a = new int[arrayList.size()];
        int i11 = 0;
        while (true) {
            int[] iArr = f1881a;
            if (i11 < iArr.length) {
                iArr[i11] = ((Integer) arrayList.get(i11)).intValue();
                i11++;
            } else {
                return;
            }
        }
    }

    public aa(e eVar, e eVar2) {
        this.red = eVar;
        this.silver = eVar2;
        int size = eVar.size();
        this.teal = size;
        this.purple = eVar2.size() + size;
        this.white = Math.max(eVar.india(), eVar2.india()) + 1;
    }

    public final boolean equals(Object obj) {
        boolean uniform;
        int quebec;
        if (obj != this) {
            if (obj instanceof e) {
                e eVar = (e) obj;
                int size = eVar.size();
                int i4 = this.purple;
                if (i4 == size) {
                    if (i4 != 0) {
                        if (this.yellow == 0 || (quebec = eVar.quebec()) == 0 || this.yellow == quebec) {
                            y yVar = new y(this);
                            u alpha = yVar.alpha();
                            y yVar2 = new y(eVar);
                            u alpha2 = yVar2.alpha();
                            int i5 = 0;
                            int i10 = 0;
                            int i11 = 0;
                            while (true) {
                                int length = alpha.purple.length - i5;
                                int length2 = alpha2.purple.length - i10;
                                int min = Math.min(length, length2);
                                if (i5 == 0) {
                                    uniform = alpha.uniform(alpha2, i10, min);
                                } else {
                                    uniform = alpha2.uniform(alpha, i5, min);
                                }
                                if (!uniform) {
                                    break;
                                }
                                i11 += min;
                                if (i11 >= i4) {
                                    if (i11 == i4) {
                                        return true;
                                    }
                                    throw new IllegalStateException();
                                }
                                if (min == length) {
                                    alpha = yVar.alpha();
                                    i5 = 0;
                                } else {
                                    i5 += min;
                                }
                                if (min == length2) {
                                    alpha2 = yVar2.alpha();
                                    i10 = 0;
                                } else {
                                    i10 += min;
                                }
                            }
                        }
                    } else {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i4 = this.yellow;
        if (i4 == 0) {
            int i5 = this.purple;
            i4 = november(i5, 0, i5);
            if (i4 == 0) {
                i4 = 1;
            }
            this.yellow = i4;
        }
        return i4;
    }

    @Override // Oe.e
    public final void hotel(int i4, int i5, int i10, byte[] bArr) {
        int i11 = i4 + i10;
        e eVar = this.red;
        int i12 = this.teal;
        if (i11 <= i12) {
            eVar.hotel(i4, i5, i10, bArr);
            return;
        }
        e eVar2 = this.silver;
        if (i4 >= i12) {
            eVar2.hotel(i4 - i12, i5, i10, bArr);
            return;
        }
        int i13 = i12 - i4;
        eVar.hotel(i4, i5, i13, bArr);
        eVar2.hotel(0, i5 + i13, i10 - i13, bArr);
    }

    @Override // Oe.e
    public final int india() {
        return this.white;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new z(this);
    }

    @Override // Oe.e
    public final boolean kilo() {
        if (this.purple >= f1881a[this.white]) {
            return true;
        }
        return false;
    }

    @Override // Oe.e
    public final boolean lima() {
        int oscar = this.red.oscar(0, 0, this.teal);
        e eVar = this.silver;
        if (eVar.oscar(oscar, 0, eVar.size()) != 0) {
            return false;
        }
        return true;
    }

    @Override // Oe.e
    public final int november(int i4, int i5, int i10) {
        int i11 = i5 + i10;
        e eVar = this.red;
        int i12 = this.teal;
        if (i11 <= i12) {
            return eVar.november(i4, i5, i10);
        }
        e eVar2 = this.silver;
        if (i5 >= i12) {
            return eVar2.november(i4, i5 - i12, i10);
        }
        int i13 = i12 - i5;
        return eVar2.november(eVar.november(i4, i5, i13), 0, i10 - i13);
    }

    @Override // Oe.e
    public final int oscar(int i4, int i5, int i10) {
        int i11 = i5 + i10;
        e eVar = this.red;
        int i12 = this.teal;
        if (i11 <= i12) {
            return eVar.oscar(i4, i5, i10);
        }
        e eVar2 = this.silver;
        if (i5 >= i12) {
            return eVar2.oscar(i4, i5 - i12, i10);
        }
        int i13 = i12 - i5;
        return eVar2.oscar(eVar.oscar(i4, i5, i13), 0, i10 - i13);
    }

    @Override // Oe.e
    public final int quebec() {
        return this.yellow;
    }

    @Override // Oe.e
    public final String romeo() {
        byte[] bArr;
        int i4 = this.purple;
        if (i4 == 0) {
            bArr = q.alpha;
        } else {
            byte[] bArr2 = new byte[i4];
            hotel(0, 0, i4, bArr2);
            bArr = bArr2;
        }
        return new String(bArr, "UTF-8");
    }

    @Override // Oe.e
    public final int size() {
        return this.purple;
    }

    @Override // Oe.e
    public final void tango(OutputStream outputStream, int i4, int i5) {
        int i10 = i4 + i5;
        e eVar = this.red;
        int i11 = this.teal;
        if (i10 <= i11) {
            eVar.tango(outputStream, i4, i5);
            return;
        }
        e eVar2 = this.silver;
        if (i4 >= i11) {
            eVar2.tango(outputStream, i4 - i11, i5);
            return;
        }
        int i12 = i11 - i4;
        eVar.tango(outputStream, i4, i12);
        eVar2.tango(outputStream, 0, i5 - i12);
    }
}
