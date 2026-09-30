package vg;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import okhttp3.internal.url._UrlKt;

/* loaded from: classes2.dex */
public final class ax implements GenericArrayType {
    public final Type alpha;

    public ax(Type type) {
        this.alpha = type;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof GenericArrayType) && A.echo(this, (GenericArrayType) obj)) {
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
        return A.tango(this.alpha) + _UrlKt.PATH_SEGMENT_ENCODE_SET_URI;
    }
}
