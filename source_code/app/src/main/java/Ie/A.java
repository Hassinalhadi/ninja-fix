package Ie;

/* loaded from: classes2.dex */
public enum A implements Oe.p {
    WARNING(0),
    ERROR(1),
    HIDDEN(2);

    public final int alpha;

    A(int i4) {
        this.alpha = i4;
    }

    @Override // Oe.p
    public final int alpha() {
        return this.alpha;
    }
}
