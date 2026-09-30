package av;

/* renamed from: av.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0683c {
    public final int alpha;
    public final int bravo;
    public final boolean charlie;
    public final boolean delta;

    public C0683c(int i4, int i5, boolean z2, boolean z10) {
        this.alpha = i4;
        this.bravo = i5;
        this.charlie = z2;
        this.delta = z10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0683c) {
            C0683c c0683c = (C0683c) obj;
            if (this.alpha == c0683c.alpha && this.bravo == c0683c.bravo && this.charlie == c0683c.charlie && this.delta == c0683c.delta) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i4;
        int i5 = (((this.alpha ^ 1000003) * 1000003) ^ this.bravo) * 1000003;
        int i10 = 1237;
        if (this.charlie) {
            i4 = 1231;
        } else {
            i4 = 1237;
        }
        int i11 = (i5 ^ i4) * 1000003;
        if (this.delta) {
            i10 = 1231;
        }
        return i11 ^ i10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FeatureSettings{cameraMode=");
        sb2.append(this.alpha);
        sb2.append(", requiredMaxBitDepth=");
        sb2.append(this.bravo);
        sb2.append(", previewStabilizationOn=");
        sb2.append(this.charlie);
        sb2.append(", ultraHdrOn=");
        return Q0.c.romeo(sb2, this.delta, "}");
    }
}
