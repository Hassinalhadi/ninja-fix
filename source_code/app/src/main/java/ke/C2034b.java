package ke;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import je.Q;
import kotlin.Lazy;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import t6.AbstractC3062u;

/* renamed from: ke.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2034b implements InvocationHandler {
    public final Class alpha;
    public final Map bravo;
    public final Lazy charlie;
    public final Lazy delta;
    public final List echo;

    public C2034b(Class cls, Map map, Lazy lazy, Lazy lazy2, List list) {
        this.alpha = cls;
        this.bravo = map;
        this.charlie = lazy;
        this.delta = lazy2;
        this.echo = list;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        Annotation annotation;
        Class cls;
        boolean areEqual;
        boolean z2;
        Class annotationClass = this.alpha;
        Intrinsics.echo(annotationClass, "$annotationClass");
        Map map = this.bravo;
        Lazy toString$delegate = this.charlie;
        Intrinsics.echo(toString$delegate, "$toString$delegate");
        Lazy hashCode$delegate = this.delta;
        Intrinsics.echo(hashCode$delegate, "$hashCode$delegate");
        List<Method> methods = this.echo;
        Intrinsics.echo(methods, "$methods");
        String name = method.getName();
        if (name != null) {
            int hashCode = name.hashCode();
            if (hashCode != -1776922004) {
                if (hashCode != 147696667) {
                    if (hashCode == 1444986633 && name.equals("annotationType")) {
                        return annotationClass;
                    }
                } else if (name.equals("hashCode")) {
                    return Integer.valueOf(((Number) hashCode$delegate.getValue()).intValue());
                }
            } else if (name.equals("toString")) {
                return (String) toString$delegate.getValue();
            }
        }
        boolean z10 = false;
        if (Intrinsics.areEqual(name, "equals") && objArr != null && objArr.length == 1) {
            Object orange = ArraysKt.orange(objArr);
            if (orange instanceof Annotation) {
                annotation = (Annotation) orange;
            } else {
                annotation = null;
            }
            if (annotation != null) {
                cls = AbstractC3062u.bravo(AbstractC3062u.alpha(annotation));
            } else {
                cls = null;
            }
            if (Intrinsics.areEqual(cls, annotationClass)) {
                if (!methods.isEmpty()) {
                    for (Method method2 : methods) {
                        Object obj2 = map.get(method2.getName());
                        Object invoke = method2.invoke(orange, null);
                        if (obj2 instanceof boolean[]) {
                            Intrinsics.charlie(invoke, "null cannot be cast to non-null type kotlin.BooleanArray");
                            areEqual = Arrays.equals((boolean[]) obj2, (boolean[]) invoke);
                        } else if (obj2 instanceof char[]) {
                            Intrinsics.charlie(invoke, "null cannot be cast to non-null type kotlin.CharArray");
                            areEqual = Arrays.equals((char[]) obj2, (char[]) invoke);
                        } else if (obj2 instanceof byte[]) {
                            Intrinsics.charlie(invoke, "null cannot be cast to non-null type kotlin.ByteArray");
                            areEqual = Arrays.equals((byte[]) obj2, (byte[]) invoke);
                        } else if (obj2 instanceof short[]) {
                            Intrinsics.charlie(invoke, "null cannot be cast to non-null type kotlin.ShortArray");
                            areEqual = Arrays.equals((short[]) obj2, (short[]) invoke);
                        } else if (obj2 instanceof int[]) {
                            Intrinsics.charlie(invoke, "null cannot be cast to non-null type kotlin.IntArray");
                            areEqual = Arrays.equals((int[]) obj2, (int[]) invoke);
                        } else if (obj2 instanceof float[]) {
                            Intrinsics.charlie(invoke, "null cannot be cast to non-null type kotlin.FloatArray");
                            areEqual = Arrays.equals((float[]) obj2, (float[]) invoke);
                        } else if (obj2 instanceof long[]) {
                            Intrinsics.charlie(invoke, "null cannot be cast to non-null type kotlin.LongArray");
                            areEqual = Arrays.equals((long[]) obj2, (long[]) invoke);
                        } else if (obj2 instanceof double[]) {
                            Intrinsics.charlie(invoke, "null cannot be cast to non-null type kotlin.DoubleArray");
                            areEqual = Arrays.equals((double[]) obj2, (double[]) invoke);
                        } else if (obj2 instanceof Object[]) {
                            Intrinsics.charlie(invoke, "null cannot be cast to non-null type kotlin.Array<*>");
                            areEqual = Arrays.equals((Object[]) obj2, (Object[]) invoke);
                        } else {
                            areEqual = Intrinsics.areEqual(obj2, invoke);
                        }
                        if (!areEqual) {
                            z2 = false;
                            break;
                        }
                    }
                }
                z2 = true;
                if (z2) {
                    z10 = true;
                }
            }
            return Boolean.valueOf(z10);
        }
        if (map.containsKey(name)) {
            return map.get(name);
        }
        StringBuilder sb2 = new StringBuilder("Method is not supported: ");
        sb2.append(method);
        sb2.append(" (args: ");
        if (objArr == null) {
            objArr = new Object[0];
        }
        sb2.append(ArraysKt.b(objArr));
        sb2.append(')');
        throw new Q(sb2.toString());
    }
}
