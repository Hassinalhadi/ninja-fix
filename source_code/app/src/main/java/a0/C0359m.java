package a0;

/* renamed from: a0.m, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0359m {
    public static String alpha(int i4) {
        if (i4 == 0) {
            return "Clear";
        }
        if (i4 == 1) {
            return "Src";
        }
        if (i4 == 2) {
            return "Dst";
        }
        if (i4 == 3) {
            return "SrcOver";
        }
        if (i4 == 4) {
            return "DstOver";
        }
        if (i4 == 5) {
            return "SrcIn";
        }
        if (i4 == 6) {
            return "DstIn";
        }
        if (i4 == 7) {
            return "SrcOut";
        }
        if (i4 == 8) {
            return "DstOut";
        }
        if (i4 == 9) {
            return "SrcAtop";
        }
        if (i4 == 10) {
            return "DstAtop";
        }
        if (i4 == 11) {
            return "Xor";
        }
        if (i4 == 12) {
            return "Plus";
        }
        if (i4 == 13) {
            return "Modulate";
        }
        if (i4 == 14) {
            return "Screen";
        }
        if (i4 == 15) {
            return "Overlay";
        }
        if (i4 == 16) {
            return "Darken";
        }
        if (i4 == 17) {
            return "Lighten";
        }
        if (i4 == 18) {
            return "ColorDodge";
        }
        if (i4 == 19) {
            return "ColorBurn";
        }
        if (i4 == 20) {
            return "HardLight";
        }
        if (i4 == 21) {
            return "Softlight";
        }
        if (i4 == 22) {
            return "Difference";
        }
        if (i4 == 23) {
            return "Exclusion";
        }
        if (i4 == 24) {
            return "Multiply";
        }
        if (i4 == 25) {
            return "Hue";
        }
        if (i4 == 26) {
            return "Saturation";
        }
        if (i4 == 27) {
            return "Color";
        }
        if (i4 == 28) {
            return "Luminosity";
        }
        return "Unknown";
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0359m)) {
            return false;
        }
        ((C0359m) obj).getClass();
        return true;
    }

    public final int hashCode() {
        return 3;
    }

    public final String toString() {
        return alpha(3);
    }
}
