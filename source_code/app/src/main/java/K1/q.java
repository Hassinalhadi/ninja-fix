package K1;

/* loaded from: classes3.dex */
public final class q implements p {
    public final int alpha;
    public int purple = -1;
    public int red = -1;

    public q(int i4) {
        this.alpha = i4;
    }

    @Override // K1.p
    public final boolean k(CharSequence charSequence, int i4, int i5, y yVar) {
        int i10 = this.alpha;
        if (i4 <= i10 && i10 < i5) {
            this.purple = i4;
            this.red = i5;
            return false;
        }
        if (i5 > i10) {
            return false;
        }
        return true;
    }

    @Override // K1.p
    public final Object magenta() {
        return this;
    }
}
