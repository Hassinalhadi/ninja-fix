package com.google.gson.internal;

import java.io.Serializable;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.Objects;
import okhttp3.internal.url._UrlKt;

/* loaded from: classes2.dex */
public final class c implements GenericArrayType, Serializable {
    public final Type alpha;

    public c(Type type) {
        Objects.requireNonNull(type);
        this.alpha = f.alpha(type);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof GenericArrayType) && f.echo(this, (GenericArrayType) obj)) {
            return true;
        }
        return false;
    }

    @Override // java.lang.reflect.GenericArrayType
    public final Type getGenericComponentType() {
        return this.alpha;
    }

    public final int hashCode() {
        return this.alpha.hashCode();
    }

    public final String toString() {
        return f.lima(this.alpha) + _UrlKt.PATH_SEGMENT_ENCODE_SET_URI;
    }
}
