package ve;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;
import java.util.List;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class ag extends ad implements Ee.d {
    public final WildcardType alpha;
    public final List bravo = CollectionsKt.emptyList();

    public ag(WildcardType wildcardType) {
        this.alpha = wildcardType;
    }

    @Override // ve.ad
    public final Type bravo() {
        return this.alpha;
    }

    public final ad charlie() {
        WildcardType wildcardType = this.alpha;
        Type[] upperBounds = wildcardType.getUpperBounds();
        Type[] lowerBounds = wildcardType.getLowerBounds();
        if (upperBounds.length <= 1 && lowerBounds.length <= 1) {
            if (lowerBounds.length == 1) {
                Object orange = ArraysKt.orange(lowerBounds);
                Intrinsics.delta(orange, "lowerBounds.single()");
                Type type = (Type) orange;
                boolean z2 = type instanceof Class;
                if (z2) {
                    Class cls = (Class) type;
                    if (cls.isPrimitive()) {
                        return new ab(cls);
                    }
                }
                if (!(type instanceof GenericArrayType) && (!z2 || !((Class) type).isArray())) {
                    if (type instanceof WildcardType) {
                        return new ag((WildcardType) type);
                    }
                    return new s(type);
                }
                return new i(type);
            }
            if (upperBounds.length == 1) {
                Type ub2 = (Type) ArraysKt.orange(upperBounds);
                if (!Intrinsics.areEqual(ub2, Object.class)) {
                    Intrinsics.delta(ub2, "ub");
                    boolean z10 = ub2 instanceof Class;
                    if (z10) {
                        Class cls2 = (Class) ub2;
                        if (cls2.isPrimitive()) {
                            return new ab(cls2);
                        }
                    }
                    if (!(ub2 instanceof GenericArrayType) && (!z10 || !((Class) ub2).isArray())) {
                        if (ub2 instanceof WildcardType) {
                            return new ag((WildcardType) ub2);
                        }
                        return new s(ub2);
                    }
                    return new i(ub2);
                }
                return null;
            }
            return null;
        }
        throw new UnsupportedOperationException("Wildcard types with many bounds are not yet supported: " + wildcardType);
    }

    @Override // Ee.b
    public final Collection getAnnotations() {
        return this.bravo;
    }
}
