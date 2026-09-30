package ge;

import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class ai implements WildcardType, Type {
    public static final ai red = new ai(null, null);
    public final Type alpha;
    public final Type purple;

    public ai(Type type, Type type2) {
        this.alpha = type;
        this.purple = type2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof WildcardType) {
            WildcardType wildcardType = (WildcardType) obj;
            if (Arrays.equals(getUpperBounds(), wildcardType.getUpperBounds()) && Arrays.equals(getLowerBounds(), wildcardType.getLowerBounds())) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getLowerBounds() {
        Type type = this.purple;
        if (type == null) {
            return new Type[0];
        }
        return new Type[]{type};
    }

    @Override // java.lang.reflect.Type
    public final String getTypeName() {
        Type type = this.purple;
        if (type != null) {
            return "? super " + ah.alpha(type);
        }
        Type type2 = this.alpha;
        if (type2 != null && !Intrinsics.areEqual(type2, Object.class)) {
            return "? extends " + ah.alpha(type2);
        }
        return "?";
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getUpperBounds() {
        Type type = this.alpha;
        if (type == null) {
            type = Object.class;
        }
        return new Type[]{type};
    }

    public final int hashCode() {
        return Arrays.hashCode(getUpperBounds()) ^ Arrays.hashCode(getLowerBounds());
    }

    public final String toString() {
        return getTypeName();
    }
}
