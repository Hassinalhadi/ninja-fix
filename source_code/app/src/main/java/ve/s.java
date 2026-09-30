package ve;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class s extends ad implements Ee.d {
    public final Type alpha;
    public final u bravo;

    public s(Type reflectType) {
        u qVar;
        Intrinsics.echo(reflectType, "reflectType");
        this.alpha = reflectType;
        if (reflectType instanceof Class) {
            qVar = new q((Class) reflectType);
        } else if (reflectType instanceof TypeVariable) {
            qVar = new ae((TypeVariable) reflectType);
        } else if (reflectType instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) reflectType).getRawType();
            Intrinsics.charlie(rawType, "null cannot be cast to non-null type java.lang.Class<*>");
            qVar = new q((Class) rawType);
        } else {
            throw new IllegalStateException("Not a classifier type (" + reflectType.getClass() + "): " + reflectType);
        }
        this.bravo = qVar;
    }

    @Override // ve.ad, Ee.b
    public final C3193e alpha(Ne.c fqName) {
        Intrinsics.echo(fqName, "fqName");
        return null;
    }

    @Override // ve.ad
    public final Type bravo() {
        return this.alpha;
    }

    public final ArrayList charlie() {
        int collectionSizeOrDefault;
        Ee.b bVar;
        Ee.b bVar2;
        List<Type> charlie = AbstractC3192d.charlie(this.alpha);
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(charlie, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (Type type : charlie) {
            Intrinsics.echo(type, "type");
            boolean z2 = type instanceof Class;
            if (z2) {
                Class cls = (Class) type;
                if (cls.isPrimitive()) {
                    bVar2 = new ab(cls);
                    arrayList.add(bVar2);
                }
            }
            if (!(type instanceof GenericArrayType) && (!z2 || !((Class) type).isArray())) {
                if (type instanceof WildcardType) {
                    bVar = new ag((WildcardType) type);
                } else {
                    bVar = new s(type);
                }
            } else {
                bVar = new i(type);
            }
            bVar2 = bVar;
            arrayList.add(bVar2);
        }
        return arrayList;
    }

    public final boolean delta() {
        boolean z2;
        Type type = this.alpha;
        if (type instanceof Class) {
            TypeVariable[] typeParameters = ((Class) type).getTypeParameters();
            Intrinsics.delta(typeParameters, "getTypeParameters()");
            if (typeParameters.length == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                return true;
            }
        }
        return false;
    }

    @Override // Ee.b
    public final Collection getAnnotations() {
        return CollectionsKt.emptyList();
    }
}
