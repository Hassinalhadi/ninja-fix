package ve;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import pe.AbstractC2316H;
import pe.C2310B;
import pe.C2313E;
import t6.H2;
import te.C3118a;

/* loaded from: classes2.dex */
public abstract class y extends u implements Ee.b, Ee.c {
    @Override // Ee.b
    public final C3193e alpha(Ne.c fqName) {
        Intrinsics.echo(fqName, "fqName");
        Member bravo = bravo();
        Intrinsics.charlie(bravo, "null cannot be cast to non-null type java.lang.reflect.AnnotatedElement");
        Annotation[] declaredAnnotations = ((AnnotatedElement) bravo).getDeclaredAnnotations();
        if (declaredAnnotations != null) {
            return H2.bravo(declaredAnnotations, fqName);
        }
        return null;
    }

    public abstract Member bravo();

    public final Ne.f charlie() {
        Ne.f fVar;
        String name = bravo().getName();
        if (name != null) {
            fVar = Ne.f.echo(name);
        } else {
            fVar = null;
        }
        if (fVar == null) {
            return Ne.h.alpha;
        }
        return fVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0120  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ArrayList delta(Type[] typeArr, Annotation[][] annotationArr, boolean z2) {
        Method method;
        ArrayList arrayList;
        int i4;
        ad iVar;
        ad adVar;
        String str;
        boolean z10;
        gd.a aVar;
        ArrayList arrayList2 = new ArrayList(typeArr.length);
        C3189a c3189a = C3189a.alpha;
        Member member = bravo();
        Intrinsics.echo(member, "member");
        gd.a aVar2 = C3189a.bravo;
        Object obj = null;
        if (aVar2 == null) {
            synchronized (c3189a) {
                aVar2 = C3189a.bravo;
                if (aVar2 == null) {
                    Class<?> cls = member.getClass();
                    try {
                        aVar = new gd.a(10, cls.getMethod("getParameters", null), AbstractC3192d.delta(cls).loadClass("java.lang.reflect.Parameter").getMethod("getName", null));
                    } catch (NoSuchMethodException unused) {
                        aVar = new gd.a(10, obj, obj);
                    }
                    C3189a.bravo = aVar;
                    aVar2 = aVar;
                }
            }
        }
        Method method2 = (Method) aVar2.purple;
        if (method2 == null || (method = (Method) aVar2.red) == null) {
            arrayList = null;
        } else {
            Object invoke = method2.invoke(member, null);
            Intrinsics.charlie(invoke, "null cannot be cast to non-null type kotlin.Array<*>");
            Object[] objArr = (Object[]) invoke;
            arrayList = new ArrayList(objArr.length);
            for (Object obj2 : objArr) {
                Object invoke2 = method.invoke(obj2, null);
                Intrinsics.charlie(invoke2, "null cannot be cast to non-null type kotlin.String");
                arrayList.add((String) invoke2);
            }
        }
        if (arrayList != null) {
            i4 = arrayList.size() - typeArr.length;
        } else {
            i4 = 0;
        }
        int length = typeArr.length;
        for (int i5 = 0; i5 < length; i5++) {
            Type type = typeArr[i5];
            Intrinsics.echo(type, "type");
            boolean z11 = type instanceof Class;
            if (z11) {
                Class cls2 = (Class) type;
                if (cls2.isPrimitive()) {
                    adVar = new ab(cls2);
                    if (arrayList == null) {
                        str = (String) CollectionsKt.jade(i5 + i4, arrayList);
                        if (str == null) {
                            throw new IllegalStateException(("No parameter with index " + i5 + '+' + i4 + " (name=" + charlie() + " type=" + adVar + ") in " + this).toString());
                        }
                    } else {
                        str = null;
                    }
                    if (z2) {
                        z10 = true;
                        if (i5 == typeArr.length - 1) {
                            arrayList2.add(new af(adVar, annotationArr[i5], str, z10));
                        }
                    }
                    z10 = false;
                    arrayList2.add(new af(adVar, annotationArr[i5], str, z10));
                }
            }
            if (!(type instanceof GenericArrayType) && (!z11 || !((Class) type).isArray())) {
                if (type instanceof WildcardType) {
                    iVar = new ag((WildcardType) type);
                } else {
                    iVar = new s(type);
                }
            } else {
                iVar = new i(type);
            }
            adVar = iVar;
            if (arrayList == null) {
            }
            if (z2) {
            }
            z10 = false;
            arrayList2.add(new af(adVar, annotationArr[i5], str, z10));
        }
        return arrayList2;
    }

    public final AbstractC2316H echo() {
        int modifiers = bravo().getModifiers();
        if (Modifier.isPublic(modifiers)) {
            return C2313E.charlie;
        }
        if (Modifier.isPrivate(modifiers)) {
            return C2310B.charlie;
        }
        if (Modifier.isProtected(modifiers)) {
            if (Modifier.isStatic(modifiers)) {
                return te.c.charlie;
            }
            return te.b.charlie;
        }
        return C3118a.charlie;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof y) && Intrinsics.areEqual(bravo(), ((y) obj).bravo())) {
            return true;
        }
        return false;
    }

    @Override // Ee.b
    public final Collection getAnnotations() {
        Member bravo = bravo();
        Intrinsics.charlie(bravo, "null cannot be cast to non-null type java.lang.reflect.AnnotatedElement");
        Annotation[] declaredAnnotations = ((AnnotatedElement) bravo).getDeclaredAnnotations();
        if (declaredAnnotations != null) {
            return H2.charlie(declaredAnnotations);
        }
        return CollectionsKt.emptyList();
    }

    public final int hashCode() {
        return bravo().hashCode();
    }

    public final String toString() {
        return getClass().getName() + ": " + bravo();
    }
}
