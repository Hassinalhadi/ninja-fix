package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.nio.charset.Charset;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.y, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1430y extends AbstractC1431z {
    public final byte[] red;

    public C1430y(byte[] bArr) {
        bArr.getClass();
        this.red = bArr;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC1431z
    public byte alpha(int i4) {
        return this.red[i4];
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC1431z
    public byte bravo(int i4) {
        return this.red[i4];
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if ((obj instanceof AbstractC1431z) && hotel() == ((AbstractC1431z) obj).hotel()) {
                if (hotel() == 0) {
                    return true;
                }
                if (obj instanceof C1430y) {
                    C1430y c1430y = (C1430y) obj;
                    int i4 = this.alpha;
                    int i5 = c1430y.alpha;
                    if (i4 == 0 || i5 == 0 || i4 == i5) {
                        return zulu(c1430y, 0, hotel());
                    }
                } else {
                    return obj.equals(this);
                }
            }
            return false;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC1431z
    public int hotel() {
        return this.red.length;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC1431z
    public void india(int i4, int i5, int i10, byte[] bArr) {
        System.arraycopy(this.red, i4, bArr, i5, i10);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC1431z
    public final int kilo() {
        return 0;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC1431z
    public final boolean lima() {
        return true;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC1431z
    public final int mike(int i4, int i5, int i10) {
        int yankee = yankee() + i5;
        Charset charset = at.alpha;
        for (int i11 = yankee; i11 < yankee + i10; i11++) {
            i4 = (i4 * 31) + this.red[i11];
        }
        return i4;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC1431z
    public final int november(int i4, int i5, int i10) {
        int yankee = yankee() + i5;
        X.alpha.getClass();
        return ah.charlie(i4, yankee, i10 + yankee, this.red);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC1431z
    public final AbstractC1431z oscar(int i4, int i5) {
        int tango = AbstractC1431z.tango(i4, i5, hotel());
        if (tango == 0) {
            return AbstractC1431z.purple;
        }
        return new C1429x(this.red, yankee() + i4, tango);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC1431z
    public final String quebec(Charset charset) {
        return new String(this.red, yankee(), hotel(), charset);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC1431z
    public final void romeo(aa aaVar) {
        aaVar.uniform(this.red, yankee(), hotel());
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC1431z
    public final boolean sierra() {
        int yankee = yankee();
        int hotel = hotel() + yankee;
        X.alpha.getClass();
        if (ah.charlie(0, yankee, hotel, this.red) != 0) {
            return false;
        }
        return true;
    }

    public int yankee() {
        return 0;
    }

    public final boolean zulu(C1430y c1430y, int i4, int i5) {
        if (i5 <= c1430y.hotel()) {
            if (i4 + i5 <= c1430y.hotel()) {
                int yankee = yankee() + i5;
                int yankee2 = yankee();
                int yankee3 = c1430y.yankee() + i4;
                while (yankee2 < yankee) {
                    if (this.red[yankee2] != c1430y.red[yankee3]) {
                        return false;
                    }
                    yankee2++;
                    yankee3++;
                }
                return true;
            }
            int hotel = c1430y.hotel();
            StringBuilder hotel2 = av.q.hotel(i4, i5, "Ran off end of other: ", ", ", ", ");
            hotel2.append(hotel);
            throw new IllegalArgumentException(hotel2.toString());
        }
        throw new IllegalArgumentException("Length too large: " + i5 + hotel());
    }
}
