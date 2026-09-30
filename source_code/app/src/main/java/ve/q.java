package ve;

import bx.C0769g;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import pf.AbstractC2360j;
import t6.G2;
import t6.H2;

/* loaded from: classes2.dex */
public final class q extends u implements Ee.b, Ee.e {
    public final Class alpha;

    public q(Class klass) {
        Intrinsics.echo(klass, "klass");
        this.alpha = klass;
    }

    @Override // Ee.b
    public final C3193e alpha(Ne.c fqName) {
        Annotation[] declaredAnnotations;
        Intrinsics.echo(fqName, "fqName");
        Class cls = this.alpha;
        if (cls != null && (declaredAnnotations = cls.getDeclaredAnnotations()) != null) {
            return H2.bravo(declaredAnnotations, fqName);
        }
        return null;
    }

    public final List bravo() {
        Field[] declaredFields = this.alpha.getDeclaredFields();
        Intrinsics.delta(declaredFields, "klass.declaredFields");
        return AbstractC2360j.quebec(AbstractC2360j.oscar(AbstractC2360j.hotel(ArraysKt.tango(declaredFields), l.alpha), m.alpha));
    }

    public final Ne.c charlie() {
        return AbstractC3192d.alpha(this.alpha).bravo();
    }

    public final List delta() {
        Method[] declaredMethods = this.alpha.getDeclaredMethods();
        Intrinsics.delta(declaredMethods, "klass.declaredMethods");
        return AbstractC2360j.quebec(AbstractC2360j.oscar(AbstractC2360j.golf(ArraysKt.tango(declaredMethods), new C0769g(25, this)), p.alpha));
    }

    public final ArrayList echo() {
        Class clazz = this.alpha;
        Intrinsics.echo(clazz, "clazz");
        J2.n nVar = G2.alpha;
        Object[] objArr = null;
        if (nVar == null) {
            try {
                nVar = new J2.n(Class.class.getMethod("isSealed", null), Class.class.getMethod("getPermittedSubclasses", null), Class.class.getMethod("isRecord", null), Class.class.getMethod("getRecordComponents", null));
            } catch (NoSuchMethodException unused) {
                nVar = new J2.n(objArr, objArr, objArr, objArr);
            }
            G2.alpha = nVar;
        }
        Method method = (Method) nVar.silver;
        if (method != null) {
            objArr = (Object[]) method.invoke(clazz, null);
        }
        if (objArr == null) {
            objArr = new Object[0];
        }
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            arrayList.add(new ac(obj));
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof q) {
            if (Intrinsics.areEqual(this.alpha, ((q) obj).alpha)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean foxtrot() {
        Class clazz = this.alpha;
        Intrinsics.echo(clazz, "clazz");
        J2.n nVar = G2.alpha;
        Boolean bool = null;
        if (nVar == null) {
            try {
                nVar = new J2.n(Class.class.getMethod("isSealed", null), Class.class.getMethod("getPermittedSubclasses", null), Class.class.getMethod("isRecord", null), Class.class.getMethod("getRecordComponents", null));
            } catch (NoSuchMethodException unused) {
                nVar = new J2.n(bool, bool, bool, bool);
            }
            G2.alpha = nVar;
        }
        Method method = (Method) nVar.red;
        if (method != null) {
            Object invoke = method.invoke(clazz, null);
            Intrinsics.charlie(invoke, "null cannot be cast to non-null type kotlin.Boolean");
            bool = (Boolean) invoke;
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @Override // Ee.b
    public final Collection getAnnotations() {
        Annotation[] declaredAnnotations;
        Class cls = this.alpha;
        if (cls != null && (declaredAnnotations = cls.getDeclaredAnnotations()) != null) {
            return H2.charlie(declaredAnnotations);
        }
        return CollectionsKt.emptyList();
    }

    @Override // Ee.e
    public final ArrayList getTypeParameters() {
        TypeVariable[] typeParameters = this.alpha.getTypeParameters();
        Intrinsics.delta(typeParameters, "klass.typeParameters");
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable typeVariable : typeParameters) {
            arrayList.add(new ae(typeVariable));
        }
        return arrayList;
    }

    public final boolean golf() {
        Class clazz = this.alpha;
        Intrinsics.echo(clazz, "clazz");
        J2.n nVar = G2.alpha;
        Boolean bool = null;
        if (nVar == null) {
            try {
                nVar = new J2.n(Class.class.getMethod("isSealed", null), Class.class.getMethod("getPermittedSubclasses", null), Class.class.getMethod("isRecord", null), Class.class.getMethod("getRecordComponents", null));
            } catch (NoSuchMethodException unused) {
                nVar = new J2.n(bool, bool, bool, bool);
            }
            G2.alpha = nVar;
        }
        Method method = (Method) nVar.alpha;
        if (method != null) {
            Object invoke = method.invoke(clazz, null);
            Intrinsics.charlie(invoke, "null cannot be cast to non-null type kotlin.Boolean");
            bool = (Boolean) invoke;
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public final int hashCode() {
        return this.alpha.hashCode();
    }

    public final String toString() {
        return q.class.getName() + ": " + this.alpha;
    }
}
