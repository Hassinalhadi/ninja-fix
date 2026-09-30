package c1;

import java.util.Arrays;

/* renamed from: c1.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0809h {
    public int[] alpha;
    public int[] bravo;
    public int charlie;
    public int[] delta;
    public float[] echo;
    public int foxtrot;
    public int[] golf;
    public String[] hotel;
    public int india;
    public int[] juliet;
    public boolean[] kilo;
    public int lima;

    public final void alpha(float f5, int i4) {
        int i5 = this.foxtrot;
        int[] iArr = this.delta;
        if (i5 >= iArr.length) {
            this.delta = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.echo;
            this.echo = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.delta;
        int i10 = this.foxtrot;
        iArr2[i10] = i4;
        float[] fArr2 = this.echo;
        this.foxtrot = i10 + 1;
        fArr2[i10] = f5;
    }

    public final void bravo(int i4, int i5) {
        int i10 = this.charlie;
        int[] iArr = this.alpha;
        if (i10 >= iArr.length) {
            this.alpha = Arrays.copyOf(iArr, iArr.length * 2);
            int[] iArr2 = this.bravo;
            this.bravo = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.alpha;
        int i11 = this.charlie;
        iArr3[i11] = i4;
        int[] iArr4 = this.bravo;
        this.charlie = i11 + 1;
        iArr4[i11] = i5;
    }

    public final void charlie(int i4, String str) {
        int i5 = this.india;
        int[] iArr = this.golf;
        if (i5 >= iArr.length) {
            this.golf = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.hotel;
            this.hotel = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
        }
        int[] iArr2 = this.golf;
        int i10 = this.india;
        iArr2[i10] = i4;
        String[] strArr2 = this.hotel;
        this.india = i10 + 1;
        strArr2[i10] = str;
    }

    public final void delta(int i4, boolean z2) {
        int i5 = this.lima;
        int[] iArr = this.juliet;
        if (i5 >= iArr.length) {
            this.juliet = Arrays.copyOf(iArr, iArr.length * 2);
            boolean[] zArr = this.kilo;
            this.kilo = Arrays.copyOf(zArr, zArr.length * 2);
        }
        int[] iArr2 = this.juliet;
        int i10 = this.lima;
        iArr2[i10] = i4;
        boolean[] zArr2 = this.kilo;
        this.lima = i10 + 1;
        zArr2[i10] = z2;
    }
}
