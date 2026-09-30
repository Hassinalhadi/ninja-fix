package b0;

/* renamed from: b0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0712b {
    public static final long alpha;
    public static final long bravo;
    public static final long charlie;
    public static final long delta;
    public static final /* synthetic */ int echo = 0;

    static {
        long j5 = 3;
        long j6 = j5 << 32;
        alpha = (0 & 4294967295L) | j6;
        bravo = (1 & 4294967295L) | j6;
        charlie = j6 | (2 & 4294967295L);
        delta = (j5 & 4294967295L) | (4 << 32);
    }

    public static final boolean alpha(long j5, long j6) {
        if (j5 == j6) {
            return true;
        }
        return false;
    }

    public static String bravo(long j5) {
        if (alpha(j5, alpha)) {
            return "Rgb";
        }
        if (alpha(j5, bravo)) {
            return "Xyz";
        }
        if (alpha(j5, charlie)) {
            return "Lab";
        }
        if (alpha(j5, delta)) {
            return "Cmyk";
        }
        return "Unknown";
    }
}
