package com.google.protobuf;

import java.io.Serializable;

/* loaded from: classes2.dex */
public enum U {
    INT(0),
    LONG(0L),
    FLOAT(Float.valueOf(0.0f)),
    DOUBLE(Double.valueOf(0.0d)),
    BOOLEAN(Boolean.FALSE),
    STRING(""),
    BYTE_STRING(C1502e.red),
    ENUM(null),
    MESSAGE(null);

    public final Serializable alpha;

    U(Serializable serializable) {
        this.alpha = serializable;
    }
}
