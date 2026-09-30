package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import com.airbnb.lottie.compose.LottieConstants;
import java.nio.charset.Charset;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class L extends AbstractC1431z {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f7428a = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, LottieConstants.IterateForever};
    public final int red;
    public final AbstractC1431z silver;
    public final AbstractC1431z teal;
    public final int white;
    public final int yellow;

    public L(AbstractC1431z abstractC1431z, AbstractC1431z abstractC1431z2) {
        this.silver = abstractC1431z;
        this.teal = abstractC1431z2;
        int hotel = abstractC1431z.hotel();
        this.white = hotel;
        this.red = abstractC1431z2.hotel() + hotel;
        this.yellow = Math.max(abstractC1431z.kilo(), abstractC1431z2.kilo()) + 1;
    }

    public static int yankee(int i4) {
        int[] iArr = f7428a;
        if (i4 >= 47) {
            return LottieConstants.IterateForever;
        }
        return iArr[i4];
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC1431z
    public final byte alpha(int i4) {
        AbstractC1431z.xray(i4, this.red);
        return bravo(i4);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC1431z
    public final byte bravo(int i4) {
        int i5 = this.white;
        if (i4 < i5) {
            return this.silver.bravo(i4);
        }
        return this.teal.bravo(i4 - i5);
    }

    public final boolean equals(Object obj) {
        boolean zulu;
        if (obj != this) {
            if (obj instanceof AbstractC1431z) {
                AbstractC1431z abstractC1431z = (AbstractC1431z) obj;
                int hotel = abstractC1431z.hotel();
                int i4 = this.red;
                if (i4 == hotel) {
                    if (i4 != 0) {
                        int i5 = this.alpha;
                        int i10 = abstractC1431z.alpha;
                        if (i5 == 0 || i10 == 0 || i5 == i10) {
                            Oe.y yVar = new Oe.y(this);
                            C1430y bravo = yVar.bravo();
                            Oe.y yVar2 = new Oe.y(abstractC1431z);
                            C1430y bravo2 = yVar2.bravo();
                            int i11 = 0;
                            int i12 = 0;
                            int i13 = 0;
                            while (true) {
                                int hotel2 = bravo.hotel() - i11;
                                int hotel3 = bravo2.hotel() - i12;
                                int min = Math.min(hotel2, hotel3);
                                if (i11 == 0) {
                                    zulu = bravo.zulu(bravo2, i12, min);
                                } else {
                                    zulu = bravo2.zulu(bravo, i11, min);
                                }
                                if (!zulu) {
                                    break;
                                }
                                i13 += min;
                                if (i13 >= i4) {
                                    if (i13 == i4) {
                                        return true;
                                    }
                                    throw new IllegalStateException();
                                }
                                if (min == hotel2) {
                                    bravo = yVar.bravo();
                                    i11 = 0;
                                } else {
                                    i11 += min;
                                }
                                if (min == hotel3) {
                                    bravo2 = yVar2.bravo();
                                    i12 = 0;
                                } else {
                                    i12 += min;
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

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC1431z
    public final int hotel() {
        return this.red;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC1431z
    public final void india(int i4, int i5, int i10, byte[] bArr) {
        int i11 = i4 + i10;
        AbstractC1431z abstractC1431z = this.silver;
        int i12 = this.white;
        if (i11 <= i12) {
            abstractC1431z.india(i4, i5, i10, bArr);
            return;
        }
        AbstractC1431z abstractC1431z2 = this.teal;
        if (i4 >= i12) {
            abstractC1431z2.india(i4 - i12, i5, i10, bArr);
            return;
        }
        int i13 = i12 - i4;
        abstractC1431z.india(i4, i5, i13, bArr);
        abstractC1431z2.india(0, i5 + i13, i10 - i13, bArr);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC1431z, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new K(this);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC1431z
    public final int kilo() {
        return this.yellow;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC1431z
    public final boolean lima() {
        if (this.red >= yankee(this.yellow)) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC1431z
    public final int mike(int i4, int i5, int i10) {
        int i11 = i5 + i10;
        AbstractC1431z abstractC1431z = this.silver;
        int i12 = this.white;
        if (i11 <= i12) {
            return abstractC1431z.mike(i4, i5, i10);
        }
        AbstractC1431z abstractC1431z2 = this.teal;
        if (i5 >= i12) {
            return abstractC1431z2.mike(i4, i5 - i12, i10);
        }
        int i13 = i12 - i5;
        return abstractC1431z2.mike(abstractC1431z.mike(i4, i5, i13), 0, i10 - i13);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC1431z
    public final int november(int i4, int i5, int i10) {
        int i11 = i5 + i10;
        AbstractC1431z abstractC1431z = this.silver;
        int i12 = this.white;
        if (i11 <= i12) {
            return abstractC1431z.november(i4, i5, i10);
        }
        AbstractC1431z abstractC1431z2 = this.teal;
        if (i5 >= i12) {
            return abstractC1431z2.november(i4, i5 - i12, i10);
        }
        int i13 = i12 - i5;
        return abstractC1431z2.november(abstractC1431z.november(i4, i5, i13), 0, i10 - i13);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC1431z
    public final AbstractC1431z oscar(int i4, int i5) {
        int i10 = this.red;
        int tango = AbstractC1431z.tango(i4, i5, i10);
        if (tango == 0) {
            return AbstractC1431z.purple;
        }
        if (tango == i10) {
            return this;
        }
        AbstractC1431z abstractC1431z = this.silver;
        int i11 = this.white;
        if (i5 <= i11) {
            return abstractC1431z.oscar(i4, i5);
        }
        AbstractC1431z abstractC1431z2 = this.teal;
        if (i4 >= i11) {
            return abstractC1431z2.oscar(i4 - i11, i5 - i11);
        }
        return new L(abstractC1431z.oscar(i4, abstractC1431z.hotel()), abstractC1431z2.oscar(0, i5 - i11));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC1431z
    public final String quebec(Charset charset) {
        byte[] bArr;
        int hotel = hotel();
        if (hotel == 0) {
            bArr = at.bravo;
        } else {
            byte[] bArr2 = new byte[hotel];
            india(0, 0, hotel, bArr2);
            bArr = bArr2;
        }
        return new String(bArr, charset);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC1431z
    public final void romeo(aa aaVar) {
        this.silver.romeo(aaVar);
        this.teal.romeo(aaVar);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC1431z
    public final boolean sierra() {
        int november = this.silver.november(0, 0, this.white);
        AbstractC1431z abstractC1431z = this.teal;
        if (abstractC1431z.november(november, 0, abstractC1431z.hotel()) != 0) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC1431z
    /* renamed from: uniform */
    public final AbstractC1428w iterator() {
        return new K(this);
    }
}
