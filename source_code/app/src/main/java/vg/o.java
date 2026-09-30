package vg;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class o extends e {
    public final Executor alpha;

    public o(Executor executor) {
        this.alpha = executor;
    }

    @Override // vg.e
    public final f get(Type type, Annotation[] annotationArr, at atVar) {
        Executor executor = null;
        if (e.getRawType(type) != d.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            Type golf = A.golf(0, (ParameterizedType) type);
            if (!A.lima(annotationArr, av.class)) {
                executor = this.alpha;
            }
            return new com.google.android.material.internal.ab(12, golf, executor);
        }
        throw new IllegalArgumentException("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
    }
}
