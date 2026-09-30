package a0;

/* renamed from: a0.ad, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0344ad {
    public final int alpha;

    public final boolean equals(Object obj) {
        if (obj instanceof C0344ad) {
            if (this.alpha != ((C0344ad) obj).alpha) {
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
        int i4 = this.alpha;
        if (i4 == 0) {
            return "Argb8888";
        }
        if (i4 == 1) {
            return "Alpha8";
        }
        if (i4 == 2) {
            return "Rgb565";
        }
        if (i4 == 3) {
            return "F16";
        }
        if (i4 == 4) {
            return "Gpu";
        }
        return "Unknown";
    }
}
