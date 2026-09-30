package Le;

import Oe.p;

/* loaded from: classes2.dex */
public enum h implements p {
    NONE(0),
    INTERNAL_TO_CLASS_ID(1),
    DESC_TO_CLASS_ID(2);

    public final int alpha;

    h(int i4) {
        this.alpha = i4;
    }

    @Override // Oe.p
    public final int alpha() {
        return this.alpha;
    }
}
