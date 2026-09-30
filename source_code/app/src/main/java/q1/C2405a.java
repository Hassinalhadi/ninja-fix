package q1;

/* renamed from: q1.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2405a {
    public static final byte[] echo = new byte[1792];
    public final CharSequence alpha;
    public final int bravo;
    public int charlie;
    public char delta;

    static {
        for (int i4 = 0; i4 < 1792; i4++) {
            echo[i4] = Character.getDirectionality(i4);
        }
    }

    public C2405a(CharSequence charSequence) {
        this.alpha = charSequence;
        this.bravo = charSequence.length();
    }

    public final byte alpha() {
        int i4 = this.charlie - 1;
        CharSequence charSequence = this.alpha;
        char charAt = charSequence.charAt(i4);
        this.delta = charAt;
        if (Character.isLowSurrogate(charAt)) {
            int codePointBefore = Character.codePointBefore(charSequence, this.charlie);
            this.charlie -= Character.charCount(codePointBefore);
            return Character.getDirectionality(codePointBefore);
        }
        this.charlie--;
        char c3 = this.delta;
        if (c3 < 1792) {
            return echo[c3];
        }
        return Character.getDirectionality(c3);
    }
}
