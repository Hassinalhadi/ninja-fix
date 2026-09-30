package androidx.appcompat.widget;

/* renamed from: androidx.appcompat.widget.y0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0491y0 {
    public int alpha;
    public int bravo;
    public int charlie;
    public int delta;
    public int echo;
    public int foxtrot;
    public boolean golf;
    public boolean hotel;

    public final void alpha(int i4, int i5) {
        this.charlie = i4;
        this.delta = i5;
        this.hotel = true;
        if (this.golf) {
            if (i5 != Integer.MIN_VALUE) {
                this.alpha = i5;
            }
            if (i4 != Integer.MIN_VALUE) {
                this.bravo = i4;
                return;
            }
            return;
        }
        if (i4 != Integer.MIN_VALUE) {
            this.alpha = i4;
        }
        if (i5 != Integer.MIN_VALUE) {
            this.bravo = i5;
        }
    }
}
