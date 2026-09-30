package Ge;

import com.google.mlkit.vision.barcode.common.Barcode;

/* loaded from: classes2.dex */
public final class q {
    public static final q kilo = new q(false, false, false, false, false, new q(false, false, false, false, false, null, false, null, null, 1023), false, null, null, 988);
    public final boolean alpha;
    public final boolean bravo;
    public final boolean charlie;
    public final boolean delta;
    public final boolean echo;
    public final q foxtrot;
    public final boolean golf;
    public final q hotel;
    public final q india;
    public final boolean juliet;

    public q(boolean z2, boolean z10, boolean z11, boolean z12, boolean z13, q qVar, boolean z14, q qVar2, q qVar3, int i4) {
        z2 = (i4 & 1) != 0 ? true : z2;
        z10 = (i4 & 2) != 0 ? true : z10;
        z11 = (i4 & 4) != 0 ? false : z11;
        z12 = (i4 & 8) != 0 ? false : z12;
        z13 = (i4 & 16) != 0 ? false : z13;
        qVar = (i4 & 32) != 0 ? null : qVar;
        z14 = (i4 & 64) != 0 ? true : z14;
        qVar2 = (i4 & 128) != 0 ? qVar : qVar2;
        qVar3 = (i4 & Barcode.FORMAT_QR_CODE) != 0 ? qVar : qVar3;
        boolean z15 = (i4 & 512) == 0;
        this.alpha = z2;
        this.bravo = z10;
        this.charlie = z11;
        this.delta = z12;
        this.echo = z13;
        this.foxtrot = qVar;
        this.golf = z14;
        this.hotel = qVar2;
        this.india = qVar3;
        this.juliet = z15;
    }
}
