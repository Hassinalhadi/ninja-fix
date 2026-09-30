package s6;

/* loaded from: classes2.dex */
public abstract class I4 implements F0.d {
    public abstract int alpha(int i4);

    public abstract int bravo(int i4);

    @Override // F0.d
    public int delta(int i4) {
        int alpha = alpha(i4);
        if (alpha == -1 || alpha(alpha) == -1) {
            return -1;
        }
        return alpha;
    }

    @Override // F0.d
    public int echo(int i4) {
        int bravo = bravo(i4);
        if (bravo == -1 || bravo(bravo) == -1) {
            return -1;
        }
        return bravo;
    }

    @Override // F0.d
    public int foxtrot(int i4) {
        return bravo(i4);
    }

    @Override // F0.d
    public int golf(int i4) {
        return alpha(i4);
    }
}
