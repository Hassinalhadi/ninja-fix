package z7;

/* loaded from: classes2.dex */
public enum am implements com.google.crypto.tink.shaded.protobuf.z {
    UNKNOWN_KEYMATERIAL(0),
    SYMMETRIC(1),
    ASYMMETRIC_PRIVATE(2),
    ASYMMETRIC_PUBLIC(3),
    REMOTE(4),
    UNRECOGNIZED(-1);

    public final int alpha;

    am(int i4) {
        this.alpha = i4;
    }
}
