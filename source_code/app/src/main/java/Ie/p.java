package Ie;

/* loaded from: classes2.dex */
public enum p implements Oe.p {
    RETURNS_CONSTANT(0),
    CALLS(1),
    RETURNS_NOT_NULL(2);

    public final int alpha;

    p(int i4) {
        this.alpha = i4;
    }

    @Override // Oe.p
    public final int alpha() {
        return this.alpha;
    }
}
