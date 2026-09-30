package z7;

/* loaded from: classes2.dex */
public enum ao implements com.google.crypto.tink.shaded.protobuf.z {
    UNKNOWN_STATUS(0),
    ENABLED(1),
    DISABLED(2),
    DESTROYED(3),
    UNRECOGNIZED(-1);

    public final int alpha;

    ao(int i4) {
        this.alpha = i4;
    }

    public final int alpha() {
        if (this != UNRECOGNIZED) {
            return this.alpha;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
