package t6;

import android.content.Context;
import com.app.network.network.models.Captain;
import com.app.network.network.models.UserInfo;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import oe.C2233d;
import ue.AbstractC3159c;
import ve.AbstractC3192d;

/* renamed from: t6.w2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3075w2 {
    /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object, kotlin.Lazy] */
    public static Se.f alpha(Class cls) {
        int i4 = 0;
        while (cls.isArray()) {
            i4++;
            cls = cls.getComponentType();
            Intrinsics.delta(cls, "currentClass.componentType");
        }
        if (cls.isPrimitive()) {
            if (Intrinsics.areEqual(cls, Void.TYPE)) {
                return new Se.f(Ne.b.juliet(me.m.delta.golf()), i4);
            }
            me.j delta = Ve.c.bravo(cls.getName()).delta();
            Intrinsics.delta(delta, "get(currentClass.name).primitiveType");
            if (i4 > 0) {
                return new Se.f(Ne.b.juliet((Ne.c) delta.silver.getValue()), i4 - 1);
            }
            return new Se.f(Ne.b.juliet((Ne.c) delta.red.getValue()), i4);
        }
        Ne.b alpha = AbstractC3192d.alpha(cls);
        String str = C2233d.alpha;
        Ne.b bVar = (Ne.b) C2233d.hotel.get(alpha.bravo().india());
        if (bVar != null) {
            alpha = bVar;
        }
        return new Se.f(alpha, i4);
    }

    public static void bravo(Ge.l lVar, Annotation annotation, Class cls) {
        Method[] declaredMethods = cls.getDeclaredMethods();
        Intrinsics.delta(declaredMethods, "annotationType.declaredMethods");
        for (Method method : declaredMethods) {
            try {
                Object invoke = method.invoke(annotation, null);
                Intrinsics.checkNotNull(invoke);
                Ne.f echo = Ne.f.echo(method.getName());
                Class<?> cls2 = invoke.getClass();
                if (Intrinsics.areEqual(cls2, Class.class)) {
                    lVar.kilo(echo, alpha((Class) invoke));
                } else if (AbstractC3159c.alpha.contains(cls2)) {
                    lVar.echo(echo, invoke);
                } else {
                    List list = AbstractC3192d.alpha;
                    if (Enum.class.isAssignableFrom(cls2)) {
                        if (!cls2.isEnum()) {
                            cls2 = cls2.getEnclosingClass();
                        }
                        Intrinsics.delta(cls2, "if (clazz.isEnum) clazz else clazz.enclosingClass");
                        lVar.juliet(echo, AbstractC3192d.alpha(cls2), Ne.f.echo(((Enum) invoke).name()));
                    } else if (Annotation.class.isAssignableFrom(cls2)) {
                        Class<?>[] interfaces = cls2.getInterfaces();
                        Intrinsics.delta(interfaces, "clazz.interfaces");
                        Class annotationClass = (Class) ArraysKt.orange(interfaces);
                        Intrinsics.delta(annotationClass, "annotationClass");
                        Ge.l quebec = lVar.quebec(AbstractC3192d.alpha(annotationClass), echo);
                        if (quebec != null) {
                            bravo(quebec, (Annotation) invoke, annotationClass);
                        }
                    } else if (cls2.isArray()) {
                        Ge.m golf = lVar.golf(echo);
                        if (golf != null) {
                            Class<?> componentType = cls2.getComponentType();
                            if (componentType.isEnum()) {
                                Ne.b alpha = AbstractC3192d.alpha(componentType);
                                for (Object obj : (Object[]) invoke) {
                                    Intrinsics.charlie(obj, "null cannot be cast to non-null type kotlin.Enum<*>");
                                    golf.alpha(alpha, Ne.f.echo(((Enum) obj).name()));
                                }
                            } else if (Intrinsics.areEqual(componentType, Class.class)) {
                                for (Object obj2 : (Object[]) invoke) {
                                    Intrinsics.charlie(obj2, "null cannot be cast to non-null type java.lang.Class<*>");
                                    golf.echo(alpha((Class) obj2));
                                }
                            } else if (Annotation.class.isAssignableFrom(componentType)) {
                                for (Object obj3 : (Object[]) invoke) {
                                    Ge.l charlie = golf.charlie(AbstractC3192d.alpha(componentType));
                                    if (charlie != null) {
                                        Intrinsics.charlie(obj3, "null cannot be cast to non-null type kotlin.Annotation");
                                        bravo(charlie, (Annotation) obj3, componentType);
                                    }
                                }
                            } else {
                                for (Object obj4 : (Object[]) invoke) {
                                    golf.delta(obj4);
                                }
                            }
                            golf.bravo();
                        }
                    } else {
                        throw new UnsupportedOperationException("Unsupported annotation argument value (" + cls2 + "): " + invoke);
                    }
                }
            } catch (IllegalAccessException unused) {
            }
        }
        lVar.bravo();
    }

    public static final void charlie(String key, String value) {
        Intrinsics.echo(key, "key");
        Intrinsics.echo(value, "value");
        try {
            K7.b.alpha().echo(key, value);
        } catch (Exception unused) {
        }
    }

    public static final void delta(Context context, UserInfo userInfo) {
        Integer num;
        Captain captain;
        String str;
        Captain captain2;
        Intrinsics.echo(context, "context");
        try {
            K7.b alpha = K7.b.alpha();
            if (userInfo == null || (captain2 = userInfo.getCaptain()) == null || (num = captain2.getId()) == null) {
                UserInfo sierra = L9.d.sierra(context);
                if (sierra != null && (captain = sierra.getCaptain()) != null) {
                    num = captain.getId();
                } else {
                    num = null;
                }
            }
            if (num == null || (str = num.toString()) == null) {
                str = "";
            }
            O7.r rVar = alpha.alpha;
            rVar.oscar.alpha.alpha(new A8.g(14, rVar, str));
        } catch (Exception unused) {
        }
    }
}
