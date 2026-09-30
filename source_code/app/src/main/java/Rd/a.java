package Rd;

import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class a {
    public static final Method alpha;
    public static final Method bravo;

    static {
        Method method;
        Method method2;
        Class<?> cls;
        Method[] methods = Throwable.class.getMethods();
        Intrinsics.checkNotNull(methods);
        int length = methods.length;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            method = null;
            if (i5 < length) {
                method2 = methods[i5];
                if (Intrinsics.areEqual(method2.getName(), "addSuppressed")) {
                    Class<?>[] parameterTypes = method2.getParameterTypes();
                    Intrinsics.delta(parameterTypes, "getParameterTypes(...)");
                    if (parameterTypes.length == 1) {
                        cls = parameterTypes[0];
                    } else {
                        cls = null;
                    }
                    if (Intrinsics.areEqual(cls, Throwable.class)) {
                        break;
                    }
                }
                i5++;
            } else {
                method2 = null;
                break;
            }
        }
        alpha = method2;
        int length2 = methods.length;
        while (true) {
            if (i4 >= length2) {
                break;
            }
            Method method3 = methods[i4];
            if (Intrinsics.areEqual(method3.getName(), "getSuppressed")) {
                method = method3;
                break;
            }
            i4++;
        }
        bravo = method;
    }
}
