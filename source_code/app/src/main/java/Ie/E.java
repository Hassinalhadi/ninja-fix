package Ie;

/* loaded from: classes2.dex */
public enum E implements Oe.p {
    /* JADX INFO: Fake field, exist only in values array */
    INTERNAL(0),
    /* JADX INFO: Fake field, exist only in values array */
    PRIVATE(1),
    /* JADX INFO: Fake field, exist only in values array */
    PROTECTED(2),
    /* JADX INFO: Fake field, exist only in values array */
    PUBLIC(3),
    /* JADX INFO: Fake field, exist only in values array */
    PRIVATE_TO_THIS(4),
    /* JADX INFO: Fake field, exist only in values array */
    LOCAL(5);

    public final int alpha;

    E(int i4) {
        this.alpha = i4;
    }

    @Override // Oe.p
    public final int alpha() {
        return this.alpha;
    }
}
