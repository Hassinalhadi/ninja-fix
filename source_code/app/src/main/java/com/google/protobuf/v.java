package com.google.protobuf;

import java.io.Serializable;

/* loaded from: classes2.dex */
public enum v {
    VOID(Void.class, null),
    INT(Integer.class, 0),
    LONG(Long.class, 0L),
    FLOAT(Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.class, Double.valueOf(0.0d)),
    BOOLEAN(Boolean.class, Boolean.FALSE),
    STRING(String.class, ""),
    BYTE_STRING(C1502e.class, C1502e.red),
    ENUM(Integer.class, null),
    MESSAGE(Object.class, null);

    public final Serializable alpha;

    v(Class cls, Serializable serializable) {
        this.alpha = serializable;
    }
}
