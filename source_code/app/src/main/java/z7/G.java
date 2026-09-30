package z7;

/* loaded from: classes2.dex */
public enum G implements com.google.crypto.tink.shaded.protobuf.z {
    UNKNOWN_PREFIX(0),
    TINK(1),
    LEGACY(2),
    RAW(3),
    CRUNCHY(4),
    UNRECOGNIZED(-1);

    public final int alpha;

    G(int i4) {
        this.alpha = i4;
    }

    public static G alpha(int i4) {
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 != 3) {
                        if (i4 != 4) {
                            return null;
                        }
                        return CRUNCHY;
                    }
                    return RAW;
                }
                return LEGACY;
            }
            return TINK;
        }
        return UNKNOWN_PREFIX;
    }

    public final int bravo() {
        if (this != UNRECOGNIZED) {
            return this.alpha;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
