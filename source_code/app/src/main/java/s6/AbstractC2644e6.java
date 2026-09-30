package s6;

import java.lang.reflect.Proxy;
import java.util.List;
import java.util.Map;
import ke.C2034b;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;

/* renamed from: s6.e6, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2644e6 {
    public static final Object alpha(Class annotationClass, Map map, List methods) {
        Intrinsics.echo(annotationClass, "annotationClass");
        Intrinsics.echo(methods, "methods");
        Lazy lazy = LazyKt.lazy(new je.ab(5, map));
        Object newProxyInstance = Proxy.newProxyInstance(annotationClass.getClassLoader(), new Class[]{annotationClass}, new C2034b(annotationClass, map, LazyKt.lazy(new Xa.f(17, annotationClass, map)), lazy, methods));
        Intrinsics.charlie(newProxyInstance, "null cannot be cast to non-null type T of kotlin.reflect.jvm.internal.calls.AnnotationConstructorCallerKt.createAnnotationInstance");
        return newProxyInstance;
    }

    public static final KSerializer bravo(KSerializer kSerializer) {
        if (kSerializer.getDescriptor().papa()) {
            return kSerializer;
        }
        return new Nf.aw(kSerializer);
    }
}
