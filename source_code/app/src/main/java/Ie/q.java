package Ie;

/* loaded from: classes2.dex */
public enum q implements Oe.p {
    AT_MOST_ONCE(0),
    EXACTLY_ONCE(1),
    AT_LEAST_ONCE(2);

    public final int alpha;

    q(int i4) {
        this.alpha = i4;
    }

    @Override // Oe.p
    public final int alpha() {
        return this.alpha;
    }
}
