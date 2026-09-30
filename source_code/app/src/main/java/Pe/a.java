package Pe;

/* loaded from: classes2.dex */
public enum a {
    NO_ARGUMENTS(3),
    /* JADX INFO: Fake field, exist only in values array */
    UNLESS_EMPTY(2),
    /* JADX INFO: Fake field, exist only in values array */
    ALWAYS_PARENTHESIZED(true, true);

    public final boolean alpha;
    public final boolean purple;

    /* synthetic */ a(int i4) {
        this((i4 & 1) == 0, false);
    }

    a(boolean z2, boolean z10) {
        this.alpha = z2;
        this.purple = z10;
    }
}
