package Ud;

import com.google.mlkit.vision.barcode.common.Barcode;
import kotlin.collections.ArraysKt;

/* loaded from: classes2.dex */
public abstract class d {
    public static final byte[] alpha;
    public static final int[] bravo;
    public static final byte[] charlie;
    public static final int[] delta;

    static {
        byte[] bArr = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};
        alpha = bArr;
        int[] iArr = new int[Barcode.FORMAT_QR_CODE];
        ArraysKt.crimson(-1, iArr);
        iArr[61] = -2;
        int i4 = 0;
        int i5 = 0;
        int i10 = 0;
        while (i5 < 64) {
            iArr[bArr[i5]] = i10;
            i5++;
            i10++;
        }
        bravo = iArr;
        byte[] bArr2 = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};
        charlie = bArr2;
        int[] iArr2 = new int[Barcode.FORMAT_QR_CODE];
        ArraysKt.crimson(-1, iArr2);
        iArr2[61] = -2;
        int i11 = 0;
        while (i4 < 64) {
            iArr2[bArr2[i4]] = i11;
            i4++;
            i11++;
        }
        delta = iArr2;
    }
}
