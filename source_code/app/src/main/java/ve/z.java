package ve;

import java.lang.annotation.Annotation;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class z extends y implements Ee.e {
    public final Method alpha;

    public z(Method member) {
        Intrinsics.echo(member, "member");
        this.alpha = member;
    }

    @Override // ve.y
    public final Member bravo() {
        return this.alpha;
    }

    public final ad foxtrot() {
        Type genericReturnType = this.alpha.getGenericReturnType();
        Intrinsics.delta(genericReturnType, "member.genericReturnType");
        boolean z2 = genericReturnType instanceof Class;
        if (z2) {
            Class cls = (Class) genericReturnType;
            if (cls.isPrimitive()) {
                return new ab(cls);
            }
        }
        if (!(genericReturnType instanceof GenericArrayType) && (!z2 || !((Class) genericReturnType).isArray())) {
            if (genericReturnType instanceof WildcardType) {
                return new ag((WildcardType) genericReturnType);
            }
            return new s(genericReturnType);
        }
        return new i(genericReturnType);
    }

    @Override // Ee.e
    public final ArrayList getTypeParameters() {
        TypeVariable<Method>[] typeParameters = this.alpha.getTypeParameters();
        Intrinsics.delta(typeParameters, "member.typeParameters");
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable<Method> typeVariable : typeParameters) {
            arrayList.add(new ae(typeVariable));
        }
        return arrayList;
    }

    public final List golf() {
        Method method = this.alpha;
        Type[] genericParameterTypes = method.getGenericParameterTypes();
        Intrinsics.delta(genericParameterTypes, "member.genericParameterTypes");
        Annotation[][] parameterAnnotations = method.getParameterAnnotations();
        Intrinsics.delta(parameterAnnotations, "member.parameterAnnotations");
        return delta(genericParameterTypes, parameterAnnotations, method.isVarArgs());
    }
}
