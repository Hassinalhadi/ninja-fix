package R7;

/* loaded from: classes2.dex */
public final class I extends l0 {
    public final int alpha;
    public final String bravo;
    public final String charlie;
    public final boolean delta;

    public I(int i4, String str, String str2, boolean z2) {
        this.alpha = i4;
        this.bravo = str;
        this.charlie = str2;
        this.delta = z2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof l0) {
            l0 l0Var = (l0) obj;
            if (this.alpha == ((I) l0Var).alpha) {
                I i4 = (I) l0Var;
                if (this.bravo.equals(i4.bravo) && this.charlie.equals(i4.charlie) && this.delta == i4.delta) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i4;
        int hashCode = (((((this.alpha ^ 1000003) * 1000003) ^ this.bravo.hashCode()) * 1000003) ^ this.charlie.hashCode()) * 1000003;
        if (this.delta) {
            i4 = 1231;
        } else {
            i4 = 1237;
        }
        return hashCode ^ i4;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("OperatingSystem{platform=");
        sb2.append(this.alpha);
        sb2.append(", version=");
        sb2.append(this.bravo);
        sb2.append(", buildVersion=");
        sb2.append(this.charlie);
        sb2.append(", jailbroken=");
        return Q0.c.romeo(sb2, this.delta, "}");
    }
}
