package c9;

import Q0.c;
import com.google.mlkit.vision.barcode.common.Barcode;

/* renamed from: c9.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0831a {
    public static final C0831a golf;
    public final int[] alpha;
    public final int[] bravo;
    public final C0832b charlie;
    public final int delta;
    public final int echo;
    public final int foxtrot;

    static {
        new C0831a(4201, 4096, 1);
        new C0831a(1033, Barcode.FORMAT_UPC_E, 1);
        new C0831a(67, 64, 1);
        new C0831a(19, 16, 1);
        golf = new C0831a(285, Barcode.FORMAT_QR_CODE, 0);
        new C0831a(301, Barcode.FORMAT_QR_CODE, 1);
    }

    public C0831a(int i4, int i5, int i10) {
        this.echo = i4;
        this.delta = i5;
        this.foxtrot = i10;
        this.alpha = new int[i5];
        this.bravo = new int[i5];
        int i11 = 1;
        for (int i12 = 0; i12 < i5; i12++) {
            this.alpha[i12] = i11;
            i11 *= 2;
            if (i11 >= i5) {
                i11 = (i11 ^ i4) & (i5 - 1);
            }
        }
        for (int i13 = 0; i13 < i5 - 1; i13++) {
            this.bravo[this.alpha[i13]] = i13;
        }
        this.charlie = new C0832b(this, new int[]{0});
    }

    public final int alpha(int i4, int i5) {
        if (i4 != 0 && i5 != 0) {
            int[] iArr = this.bravo;
            return this.alpha[(iArr[i4] + iArr[i5]) % (this.delta - 1)];
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GF(0x");
        sb2.append(Integer.toHexString(this.echo));
        sb2.append(',');
        return c.quebec(sb2, this.delta, ')');
    }
}
