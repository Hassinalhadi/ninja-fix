package bv;

/* loaded from: classes3.dex */
public abstract class au {
    public static final long[] alpha = {-9187201950435737345L, -1};

    static {
        new al(0);
    }

    public static final int alpha(int i4) {
        if (i4 == 7) {
            return 6;
        }
        return i4 - (i4 / 8);
    }

    public static final int bravo(int i4) {
        if (i4 == 0) {
            return 6;
        }
        return (i4 * 2) + 1;
    }

    public static final int charlie(int i4) {
        if (i4 > 0) {
            return (-1) >>> Integer.numberOfLeadingZeros(i4);
        }
        return 0;
    }

    public static final int delta(int i4) {
        if (i4 == 7) {
            return 8;
        }
        return ((i4 - 1) / 7) + i4;
    }
}
