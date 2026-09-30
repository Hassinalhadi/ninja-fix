package ve;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class i extends ad implements Ee.d {
    public final Type alpha;
    public final ad bravo;
    public final List charlie;

    /* JADX WARN: Multi-variable type inference failed */
    public i(Type type) {
        ad iVar;
        ad adVar;
        this.alpha = type;
        if (type instanceof GenericArrayType) {
            Type genericComponentType = ((GenericArrayType) type).getGenericComponentType();
            Intrinsics.delta(genericComponentType, "genericComponentType");
            boolean z2 = genericComponentType instanceof Class;
            if (z2) {
                Class cls = (Class) genericComponentType;
                if (cls.isPrimitive()) {
                    adVar = new ab(cls);
                    this.bravo = adVar;
                    this.charlie = CollectionsKt.emptyList();
                }
            }
            if (!(genericComponentType instanceof GenericArrayType) && (!z2 || !((Class) genericComponentType).isArray())) {
                if (genericComponentType instanceof WildcardType) {
                    iVar = new ag((WildcardType) genericComponentType);
                } else {
                    iVar = new s(genericComponentType);
                }
            } else {
                iVar = new i(genericComponentType);
            }
        } else {
            if (type instanceof Class) {
                Class cls2 = (Class) type;
                if (cls2.isArray()) {
                    Class<?> componentType = cls2.getComponentType();
                    Intrinsics.delta(componentType, "getComponentType()");
                    if (componentType.isPrimitive()) {
                        iVar = new ab(componentType);
                    } else if (!(componentType instanceof GenericArrayType) && !componentType.isArray()) {
                        if (componentType instanceof WildcardType) {
                            iVar = new ag((WildcardType) componentType);
                        } else {
                            iVar = new s(componentType);
                        }
                    } else {
                        iVar = new i(componentType);
                    }
                }
            }
            throw new IllegalArgumentException("Not an array type (" + type.getClass() + "): " + type);
        }
        adVar = iVar;
        this.bravo = adVar;
        this.charlie = CollectionsKt.emptyList();
    }

    @Override // ve.ad
    public final Type bravo() {
        return this.alpha;
    }

    @Override // Ee.b
    public final Collection getAnnotations() {
        return this.charlie;
    }
}
