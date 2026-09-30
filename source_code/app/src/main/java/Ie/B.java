package Ie;

/* loaded from: classes2.dex */
public enum B implements Oe.p {
    LANGUAGE_VERSION(0),
    COMPILER_VERSION(1),
    API_VERSION(2);

    public final int alpha;

    B(int i4) {
        this.alpha = i4;
    }

    @Override // Oe.p
    public final int alpha() {
        return this.alpha;
    }
}
