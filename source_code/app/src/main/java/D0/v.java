package D0;

/* loaded from: classes3.dex */
public final class v {
    public static final v bravo = new v(false);
    public final boolean alpha;

    public v() {
        this.alpha = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof v) {
            if (this.alpha == ((v) obj).alpha) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i4;
        if (this.alpha) {
            i4 = 1231;
        } else {
            i4 = 1237;
        }
        return i4 * 31;
    }

    public final String toString() {
        return Q0.c.romeo(new StringBuilder("PlatformParagraphStyle(includeFontPadding="), this.alpha, ", emojiSupportMatch=EmojiSupportMatch.Default)");
    }

    public v(boolean z2) {
        this.alpha = z2;
    }
}
