package O0;

/* loaded from: classes3.dex */
public final class i {
    public static final i charlie = new i(f.charlie, 17);
    public final float alpha;
    public final int bravo;

    public i(float f5, int i4) {
        this.alpha = f5;
        this.bravo = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            float f5 = iVar.alpha;
            float f10 = f.bravo;
            if (Float.compare(this.alpha, f5) == 0 && this.bravo == iVar.bravo) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        float f5 = f.bravo;
        return ((Float.floatToIntBits(this.alpha) * 31) + this.bravo) * 31;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("LineHeightStyle(alignment=");
        sb2.append((Object) f.bravo(this.alpha));
        sb2.append(", trim=");
        int i4 = this.bravo;
        if (i4 == 1) {
            str = "LineHeightStyle.Trim.FirstLineTop";
        } else if (i4 == 16) {
            str = "LineHeightStyle.Trim.LastLineBottom";
        } else if (i4 == 17) {
            str = "LineHeightStyle.Trim.Both";
        } else if (i4 == 0) {
            str = "LineHeightStyle.Trim.None";
        } else {
            str = "Invalid";
        }
        sb2.append((Object) str);
        sb2.append(",mode=Mode(value=0))");
        return sb2.toString();
    }
}
