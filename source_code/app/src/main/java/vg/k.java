package vg;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* loaded from: classes2.dex */
public final class k extends e {
    @Override // vg.e
    public final f get(Type type, Annotation[] annotationArr, at atVar) {
        if (e.getRawType(type) != s1.af.kilo()) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            Type parameterUpperBound = e.getParameterUpperBound(0, (ParameterizedType) type);
            if (e.getRawType(parameterUpperBound) != aq.class) {
                return new i(0, parameterUpperBound);
            }
            if (parameterUpperBound instanceof ParameterizedType) {
                return new i(1, e.getParameterUpperBound(0, (ParameterizedType) parameterUpperBound));
            }
            throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
        }
        throw new IllegalStateException("CompletableFuture return type must be parameterized as CompletableFuture<Foo> or CompletableFuture<? extends Foo>");
    }
}
