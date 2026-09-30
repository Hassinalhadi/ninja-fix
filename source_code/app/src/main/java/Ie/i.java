package Ie;

/* loaded from: classes2.dex */
public enum i implements Oe.p {
    CLASS(0),
    INTERFACE(1),
    ENUM_CLASS(2),
    /* JADX INFO: Fake field, exist only in values array */
    ENUM_ENTRY(3),
    ANNOTATION_CLASS(4),
    /* JADX INFO: Fake field, exist only in values array */
    OBJECT(5),
    COMPANION_OBJECT(6);

    public final int alpha;

    i(int i4) {
        this.alpha = i4;
    }

    @Override // Oe.p
    public final int alpha() {
        return this.alpha;
    }
}
