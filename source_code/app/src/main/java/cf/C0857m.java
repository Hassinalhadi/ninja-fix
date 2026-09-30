package cf;

import A2.aj;
import B9.K;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.List;
import je.N;
import je.Q;
import je.T;
import kotlin.Lazy;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import pe.InterfaceC2335k;

/* renamed from: cf.m, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0857m extends Lambda implements Function0 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Object purple;
    public final /* synthetic */ Object red;
    public final /* synthetic */ int silver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0857m(q qVar, Oe.l lVar, int i4, int i5) {
        super(0);
        this.alpha = i5;
        this.purple = qVar;
        this.red = lVar;
        this.silver = i4;
    }

    /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        List list;
        List list2;
        Type type;
        Class<?> cls;
        switch (this.alpha) {
            case 0:
                q qVar = (q) this.purple;
                aj alpha = qVar.alpha((InterfaceC2335k) qVar.alpha.charlie);
                if (alpha != null) {
                    list = CollectionsKt.z(((InterfaceC0845a) ((K) qVar.alpha.alpha).echo).delta(alpha, (Oe.l) this.red, this.silver));
                } else {
                    list = null;
                }
                if (list == null) {
                    return CollectionsKt.emptyList();
                }
                return list;
            case 1:
                q qVar2 = (q) this.purple;
                aj alpha2 = qVar2.alpha((InterfaceC2335k) qVar2.alpha.charlie);
                if (alpha2 != null) {
                    list2 = ((InterfaceC0845a) ((K) qVar2.alpha.alpha).echo).oscar(alpha2, (Oe.l) this.red, this.silver);
                } else {
                    list2 = null;
                }
                if (list2 == null) {
                    return CollectionsKt.emptyList();
                }
                return list2;
            default:
                N n5 = (N) this.purple;
                T t5 = n5.purple;
                if (t5 != null) {
                    type = (Type) t5.invoke();
                } else {
                    type = null;
                }
                if (type instanceof Class) {
                    Class cls2 = (Class) type;
                    if (cls2.isArray()) {
                        cls = cls2.getComponentType();
                    } else {
                        cls = Object.class;
                    }
                    Intrinsics.delta(cls, "{\n                      …                        }");
                    return cls;
                }
                boolean z2 = type instanceof GenericArrayType;
                int i4 = this.silver;
                if (z2) {
                    if (i4 == 0) {
                        Type genericComponentType = ((GenericArrayType) type).getGenericComponentType();
                        Intrinsics.delta(genericComponentType, "{\n                      …                        }");
                        return genericComponentType;
                    }
                    throw new Q("Array type has been queried for a non-0th argument: " + n5);
                }
                if (type instanceof ParameterizedType) {
                    Type type2 = (Type) ((List) this.red.getValue()).get(i4);
                    if (type2 instanceof WildcardType) {
                        WildcardType wildcardType = (WildcardType) type2;
                        Type[] lowerBounds = wildcardType.getLowerBounds();
                        Intrinsics.delta(lowerBounds, "argument.lowerBounds");
                        Type type3 = (Type) ArraysKt.gold(lowerBounds);
                        if (type3 == null) {
                            Type[] upperBounds = wildcardType.getUpperBounds();
                            Intrinsics.delta(upperBounds, "argument.upperBounds");
                            type2 = (Type) ArraysKt.fuchsia(upperBounds);
                        } else {
                            type2 = type3;
                        }
                    }
                    Intrinsics.delta(type2, "{\n                      …                        }");
                    return type2;
                }
                throw new Q("Non-generic type has been queried for arguments: " + n5);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0857m(N n5, int i4, Lazy lazy) {
        super(0);
        this.alpha = 2;
        this.purple = n5;
        this.silver = i4;
        this.red = lazy;
    }
}
