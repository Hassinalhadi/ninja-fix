package androidx.datastore.preferences.protobuf;

import java.io.Serializable;

/* loaded from: classes3.dex */
public enum L {
    INT(0),
    LONG(0L),
    FLOAT(Float.valueOf(0.0f)),
    DOUBLE(Double.valueOf(0.0d)),
    BOOLEAN(Boolean.FALSE),
    STRING(""),
    BYTE_STRING(C0599f.red),
    ENUM(null),
    MESSAGE(null);

    public final Serializable alpha;

    L(Serializable serializable) {
        this.alpha = serializable;
    }
}
