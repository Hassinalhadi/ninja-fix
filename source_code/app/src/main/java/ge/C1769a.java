package ge;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.url._UrlKt;

/* renamed from: ge.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1769a implements GenericArrayType, Type {
    public final Type alpha;

    public C1769a(Type elementType) {
        Intrinsics.echo(elementType, "elementType");
        this.alpha = elementType;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof GenericArrayType) {
            if (Intrinsics.areEqual(this.alpha, ((GenericArrayType) obj).getGenericComponentType())) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // java.lang.reflect.GenericArrayType
    public final Type getGenericComponentType() {
        return this.alpha;
    }

    @Override // java.lang.reflect.Type
    public final String getTypeName() {
        return ah.alpha(this.alpha) + _UrlKt.PATH_SEGMENT_ENCODE_SET_URI;
    }

    public final int hashCode() {
        return this.alpha.hashCode();
    }

    public final String toString() {
        return getTypeName();
    }
}
