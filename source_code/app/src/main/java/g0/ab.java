package g0;

/* loaded from: classes3.dex */
public abstract class ab {
    public final boolean alpha;
    public final boolean bravo;

    public ab(int i4) {
        boolean z2;
        if ((i4 & 1) != 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        boolean z10 = (i4 & 2) == 0;
        this.alpha = z2;
        this.bravo = z10;
    }
}
