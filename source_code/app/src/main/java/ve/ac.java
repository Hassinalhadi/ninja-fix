package ve;

import java.lang.reflect.Member;
import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;
import t6.F2;

/* loaded from: classes2.dex */
public final class ac extends y {
    public final Object alpha;

    public ac(Object recordComponent) {
        Intrinsics.echo(recordComponent, "recordComponent");
        this.alpha = recordComponent;
    }

    @Override // ve.y
    public final Member bravo() {
        Object recordComponent = this.alpha;
        Intrinsics.echo(recordComponent, "recordComponent");
        com.google.android.play.core.integrity.k kVar = F2.alpha;
        Method method = null;
        if (kVar == null) {
            Class<?> cls = recordComponent.getClass();
            try {
                kVar = new com.google.android.play.core.integrity.k(11, cls.getMethod("getType", null), cls.getMethod("getAccessor", null));
            } catch (NoSuchMethodException unused) {
                kVar = new com.google.android.play.core.integrity.k(11, method, method);
            }
            F2.alpha = kVar;
        }
        Method method2 = (Method) kVar.red;
        if (method2 != null) {
            Object invoke = method2.invoke(recordComponent, null);
            Intrinsics.charlie(invoke, "null cannot be cast to non-null type java.lang.reflect.Method");
            method = (Method) invoke;
        }
        if (method != null) {
            return method;
        }
        throw new NoSuchMethodError("Can't find `getAccessor` method");
    }

    public final Ee.d foxtrot() {
        Object recordComponent = this.alpha;
        Intrinsics.echo(recordComponent, "recordComponent");
        com.google.android.play.core.integrity.k kVar = F2.alpha;
        Class cls = null;
        if (kVar == null) {
            Class<?> cls2 = recordComponent.getClass();
            try {
                kVar = new com.google.android.play.core.integrity.k(11, cls2.getMethod("getType", null), cls2.getMethod("getAccessor", null));
            } catch (NoSuchMethodException unused) {
                kVar = new com.google.android.play.core.integrity.k(11, cls, cls);
            }
            F2.alpha = kVar;
        }
        Method method = (Method) kVar.purple;
        if (method != null) {
            Object invoke = method.invoke(recordComponent, null);
            Intrinsics.charlie(invoke, "null cannot be cast to non-null type java.lang.Class<*>");
            cls = (Class) invoke;
        }
        if (cls != null) {
            return new s(cls);
        }
        throw new NoSuchMethodError("Can't find `getType` method");
    }
}
