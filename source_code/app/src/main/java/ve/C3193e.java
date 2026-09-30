package ve;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import t6.AbstractC3062u;

/* renamed from: ve.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3193e extends u {
    public final Annotation alpha;

    public C3193e(Annotation annotation) {
        Intrinsics.echo(annotation, "annotation");
        this.alpha = annotation;
    }

    public final ArrayList bravo() {
        f xVar;
        Annotation annotation = this.alpha;
        Method[] declaredMethods = AbstractC3062u.bravo(AbstractC3062u.alpha(annotation)).getDeclaredMethods();
        Intrinsics.delta(declaredMethods, "annotation.annotationClass.java.declaredMethods");
        ArrayList arrayList = new ArrayList(declaredMethods.length);
        for (Method method : declaredMethods) {
            Object invoke = method.invoke(annotation, null);
            Intrinsics.delta(invoke, "method.invoke(annotation)");
            Ne.f echo = Ne.f.echo(method.getName());
            Class<?> cls = invoke.getClass();
            List list = AbstractC3192d.alpha;
            if (Enum.class.isAssignableFrom(cls)) {
                xVar = new v(echo, (Enum) invoke);
            } else if (invoke instanceof Annotation) {
                xVar = new g(echo, (Annotation) invoke);
            } else if (invoke instanceof Object[]) {
                xVar = new h(echo, (Object[]) invoke);
            } else if (invoke instanceof Class) {
                xVar = new r(echo, (Class) invoke);
            } else {
                xVar = new x(echo, invoke);
            }
            arrayList.add(xVar);
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C3193e) {
            if (this.alpha == ((C3193e) obj).alpha) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return System.identityHashCode(this.alpha);
    }

    public final String toString() {
        return C3193e.class.getName() + ": " + this.alpha;
    }
}
