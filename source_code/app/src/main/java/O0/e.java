package O0;

/* loaded from: classes3.dex */
public final class e {
    public static final int bravo = 66305;
    public static final int charlie = 66562;
    public final int alpha;

    public static String alpha(int i4) {
        String str;
        String str2;
        StringBuilder sb2 = new StringBuilder("LineBreak(strategy=");
        int i5 = i4 & 255;
        String str3 = "Invalid";
        if (i5 == 1) {
            str = "Strategy.Simple";
        } else if (i5 == 2) {
            str = "Strategy.HighQuality";
        } else if (i5 == 3) {
            str = "Strategy.Balanced";
        } else if (i5 != 0) {
            str = "Invalid";
        } else {
            str = "Strategy.Unspecified";
        }
        sb2.append((Object) str);
        sb2.append(", strictness=");
        int i10 = (i4 >> 8) & 255;
        if (i10 == 1) {
            str2 = "Strictness.None";
        } else if (i10 == 2) {
            str2 = "Strictness.Loose";
        } else if (i10 == 3) {
            str2 = "Strictness.Normal";
        } else if (i10 == 4) {
            str2 = "Strictness.Strict";
        } else if (i10 != 0) {
            str2 = "Invalid";
        } else {
            str2 = "Strictness.Unspecified";
        }
        sb2.append((Object) str2);
        sb2.append(", wordBreak=");
        int i11 = (i4 >> 16) & 255;
        if (i11 == 1) {
            str3 = "WordBreak.None";
        } else if (i11 == 2) {
            str3 = "WordBreak.Phrase";
        } else if (i11 == 0) {
            str3 = "WordBreak.Unspecified";
        }
        sb2.append((Object) str3);
        sb2.append(')');
        return sb2.toString();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            if (this.alpha != ((e) obj).alpha) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.alpha;
    }

    public final String toString() {
        return alpha(this.alpha);
    }
}
