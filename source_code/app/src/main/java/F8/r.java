package F8;

import ao.ad;

/* loaded from: classes2.dex */
public final class r implements E8.e {
    public final String alpha;
    public final int bravo;

    public r(String str, int i4) {
        this.alpha = str;
        this.bravo = i4;
    }

    public final boolean alpha() {
        if (this.bravo != 0) {
            String trim = delta().trim();
            if (k.echo.matcher(trim).matches()) {
                return true;
            }
            if (k.foxtrot.matcher(trim).matches()) {
                return false;
            }
            throw new IllegalArgumentException(ad.gray("[Value: ", trim, "] cannot be converted to a boolean."));
        }
        return false;
    }

    public final double bravo() {
        if (this.bravo == 0) {
            return 0.0d;
        }
        String trim = delta().trim();
        try {
            return Double.valueOf(trim).doubleValue();
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(ad.gray("[Value: ", trim, "] cannot be converted to a double."), e);
        }
    }

    public final long charlie() {
        if (this.bravo == 0) {
            return 0L;
        }
        String trim = delta().trim();
        try {
            return Long.valueOf(trim).longValue();
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(ad.gray("[Value: ", trim, "] cannot be converted to a long."), e);
        }
    }

    public final String delta() {
        if (this.bravo == 0) {
            return "";
        }
        return this.alpha;
    }
}
