package vg;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* loaded from: classes2.dex */
public abstract class e {
    public static Type getParameterUpperBound(int i4, ParameterizedType parameterizedType) {
        return A.golf(i4, parameterizedType);
    }

    public static Class<?> getRawType(Type type) {
        return A.hotel(type);
    }

    public abstract f get(Type type, Annotation[] annotationArr, at atVar);
}
