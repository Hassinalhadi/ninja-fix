package androidx.camera.core;

import androidx.appcompat.widget.P0;

/* loaded from: classes3.dex */
public final class t {
    public static final t charlie = new t(0, 0);
    public static final t delta = new t(1, 8);
    public static final t echo = new t(3, 10);
    public static final t foxtrot = new t(4, 10);
    public static final t golf = new t(5, 10);
    public static final t hotel = new t(6, 10);
    public static final t india = new t(6, 8);
    public final int alpha;
    public final int bravo;

    public t(int i4, int i5) {
        this.alpha = i4;
        this.bravo = i5;
    }

    public final boolean alpha() {
        if (bravo() && this.alpha != 1 && this.bravo == 10) {
            return true;
        }
        return false;
    }

    public final boolean bravo() {
        int i4 = this.alpha;
        if (i4 != 0 && i4 != 2 && this.bravo != 0) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof t) {
            t tVar = (t) obj;
            if (this.alpha == tVar.alpha && this.bravo == tVar.bravo) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.alpha ^ 1000003) * 1000003) ^ this.bravo;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("DynamicRange@");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("{encoding=");
        switch (this.alpha) {
            case 0:
                str = "UNSPECIFIED";
                break;
            case 1:
                str = "SDR";
                break;
            case 2:
                str = "HDR_UNSPECIFIED";
                break;
            case 3:
                str = "HLG";
                break;
            case 4:
                str = "HDR10";
                break;
            case 5:
                str = "HDR10_PLUS";
                break;
            case 6:
                str = "DOLBY_VISION";
                break;
            default:
                str = "<Unknown>";
                break;
        }
        sb2.append(str);
        sb2.append(", bitDepth=");
        return P0.cyan(sb2, this.bravo, "}");
    }
}
