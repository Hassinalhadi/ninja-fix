package t6;

/* loaded from: classes2.dex */
public abstract class aa {
    public static int alpha(int i4) {
        if (i4 != 1) {
            if (i4 == 2) {
                return 1;
            }
            if (i4 == 4) {
                return 2;
            }
            if (i4 != 8) {
                if (i4 == 16) {
                    return 4;
                }
                if (i4 != 32) {
                    if (i4 != 64) {
                        if (i4 != 128) {
                            if (i4 == 256) {
                                return 8;
                            }
                            if (i4 == 512) {
                                return 9;
                            }
                            throw new IllegalArgumentException(ao.ad.zulu(i4, "type needs to be >= FIRST and <= LAST, type="));
                        }
                        return 7;
                    }
                    return 6;
                }
                return 5;
            }
            return 3;
        }
        return 0;
    }

    public static final T.s bravo(T.s sVar, float f5) {
        if (f5 == 0.0f) {
            return sVar;
        }
        return androidx.compose.ui.graphics.a.charlie(sVar, 0.0f, 0.0f, f5, null, 524031);
    }
}
