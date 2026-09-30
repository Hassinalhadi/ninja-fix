package I0;

/* loaded from: classes3.dex */
public final class n {
    public final int alpha;

    public static String alpha(int i4) {
        if (i4 == 0) {
            return "Unspecified";
        }
        if (i4 == 1) {
            return "Text";
        }
        if (i4 == 2) {
            return "Ascii";
        }
        if (i4 == 3) {
            return "Number";
        }
        if (i4 == 4) {
            return "Phone";
        }
        if (i4 == 5) {
            return "Uri";
        }
        if (i4 == 6) {
            return "Email";
        }
        if (i4 == 7) {
            return "Password";
        }
        if (i4 == 8) {
            return "NumberPassword";
        }
        if (i4 == 9) {
            return "Decimal";
        }
        return "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof n) {
            if (this.alpha != ((n) obj).alpha) {
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
