package e9;

/* renamed from: e9.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC1641a {
    /* JADX INFO: Fake field, exist only in values array */
    TERMINATOR(new int[]{0, 0, 0}, 0),
    NUMERIC(new int[]{10, 12, 14}, 1),
    ALPHANUMERIC(new int[]{9, 11, 13}, 2),
    /* JADX INFO: Fake field, exist only in values array */
    STRUCTURED_APPEND(new int[]{0, 0, 0}, 3),
    BYTE(new int[]{8, 16, 16}, 4),
    /* JADX INFO: Fake field, exist only in values array */
    ECI(new int[]{0, 0, 0}, 7),
    KANJI(new int[]{8, 10, 12}, 8),
    /* JADX INFO: Fake field, exist only in values array */
    FNC1_FIRST_POSITION(new int[]{0, 0, 0}, 5),
    /* JADX INFO: Fake field, exist only in values array */
    FNC1_SECOND_POSITION(new int[]{0, 0, 0}, 9),
    /* JADX INFO: Fake field, exist only in values array */
    HANZI(new int[]{8, 10, 12}, 13);

    public final int[] alpha;
    public final int purple;

    EnumC1641a(int[] iArr, int i4) {
        this.alpha = iArr;
        this.purple = i4;
    }

    public final int alpha(C1642b c1642b) {
        char c3;
        int i4 = c1642b.alpha;
        if (i4 <= 9) {
            c3 = 0;
        } else if (i4 <= 26) {
            c3 = 1;
        } else {
            c3 = 2;
        }
        return this.alpha[c3];
    }
}
