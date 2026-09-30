package je;

import g.C1718a;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import pe.AbstractC2340p;
import pe.InterfaceC2328d;
import pe.InterfaceC2335k;
import t6.AbstractC3080x2;
import t6.Y1;
import ve.AbstractC3192d;

/* loaded from: classes2.dex */
public abstract class af implements kotlin.jvm.internal.d {
    public static final Regex alpha = new Regex("<v#(\\d+)>");

    public static Method amber(Class cls, String str, Class[] clsArr, Class cls2) {
        try {
            Method declaredMethod = cls.getDeclaredMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
            if (Intrinsics.areEqual(declaredMethod.getReturnType(), cls2)) {
                return declaredMethod;
            }
            Method[] declaredMethods = cls.getDeclaredMethods();
            Intrinsics.delta(declaredMethods, "declaredMethods");
            for (Method method : declaredMethods) {
                if (Intrinsics.areEqual(method.getName(), str) && Intrinsics.areEqual(method.getReturnType(), cls2) && Arrays.equals(method.getParameterTypes(), clsArr)) {
                    return method;
                }
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    public static Method xray(Class cls, String str, Class[] clsArr, Class cls2, boolean z2) {
        Class bravo;
        Method xray;
        if (z2) {
            clsArr[0] = cls;
        }
        Method amber = amber(cls, str, clsArr, cls2);
        if (amber != null) {
            return amber;
        }
        Class superclass = cls.getSuperclass();
        if (superclass != null && (xray = xray(superclass, str, clsArr, cls2, z2)) != null) {
            return xray;
        }
        Class<?>[] interfaces = cls.getInterfaces();
        Intrinsics.delta(interfaces, "interfaces");
        for (Class<?> superInterface : interfaces) {
            Intrinsics.delta(superInterface, "superInterface");
            Method xray2 = xray(superInterface, str, clsArr, cls2, z2);
            if (xray2 != null) {
                return xray2;
            }
            if (z2 && (bravo = AbstractC3080x2.bravo(AbstractC3192d.delta(superInterface), superInterface.getName().concat("$DefaultImpls"))) != null) {
                clsArr[0] = superInterface;
                Method amber2 = amber(bravo, str, clsArr, cls2);
                if (amber2 != null) {
                    return amber2;
                }
            }
        }
        return null;
    }

    public static Constructor zulu(Class cls, ArrayList arrayList) {
        try {
            Class[] clsArr = (Class[]) arrayList.toArray(new Class[0]);
            return cls.getDeclaredConstructor((Class[]) Arrays.copyOf(clsArr, clsArr.length));
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    public final void oscar(ArrayList arrayList, String str, boolean z2) {
        ArrayList whiskey = whiskey(str);
        arrayList.addAll(whiskey);
        int size = (whiskey.size() + 31) / 32;
        for (int i4 = 0; i4 < size; i4++) {
            Class TYPE = Integer.TYPE;
            Intrinsics.delta(TYPE, "TYPE");
            arrayList.add(TYPE);
        }
        if (z2) {
            arrayList.remove(DefaultConstructorMarker.class);
            arrayList.add(DefaultConstructorMarker.class);
        } else {
            arrayList.add(Object.class);
        }
    }

    public final Method papa(String name, String desc) {
        Method xray;
        Intrinsics.echo(name, "name");
        Intrinsics.echo(desc, "desc");
        if (!Intrinsics.areEqual(name, "<init>")) {
            Class[] clsArr = (Class[]) whiskey(desc).toArray(new Class[0]);
            Class yankee = yankee(StringsKt.emerald(desc, ')', 0, 6) + 1, desc.length(), desc);
            Method xray2 = xray(uniform(), name, clsArr, yankee, false);
            if (xray2 != null) {
                return xray2;
            }
            if (uniform().isInterface() && (xray = xray(Object.class, name, clsArr, yankee, false)) != null) {
                return xray;
            }
            return null;
        }
        return null;
    }

    public abstract Collection quebec();

    public abstract Collection romeo(Ne.f fVar);

    public abstract pe.al sierra(int i4);

    /* JADX WARN: Removed duplicated region for block: B:16:0x005c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0020 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List tango(Xe.n scope, int i4) {
        r rVar;
        boolean z2;
        Intrinsics.echo(scope, "scope");
        com.google.android.material.datepicker.j.papa(i4, "belonginess");
        C1718a c1718a = new C1718a(this);
        Collection<InterfaceC2335k> alpha2 = Y1.alpha(scope, null, 3);
        ArrayList arrayList = new ArrayList();
        for (InterfaceC2335k interfaceC2335k : alpha2) {
            if (interfaceC2335k instanceof InterfaceC2328d) {
                InterfaceC2328d interfaceC2328d = (InterfaceC2328d) interfaceC2335k;
                if (!Intrinsics.areEqual(interfaceC2328d.getVisibility(), AbstractC2340p.hotel)) {
                    boolean z10 = false;
                    if (interfaceC2328d.november() != 2) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (i4 == 1) {
                        z10 = true;
                    }
                    if (z2 == z10) {
                        rVar = (r) interfaceC2335k.quebec(c1718a, Unit.INSTANCE);
                        if (rVar == null) {
                            arrayList.add(rVar);
                        }
                    }
                }
            }
            rVar = null;
            if (rVar == null) {
            }
        }
        return CollectionsKt.z(arrayList);
    }

    public Class uniform() {
        Class golf = golf();
        List list = AbstractC3192d.alpha;
        Intrinsics.echo(golf, "<this>");
        Class cls = (Class) AbstractC3192d.charlie.get(golf);
        if (cls == null) {
            return golf();
        }
        return cls;
    }

    public abstract Collection victor(Ne.f fVar);

    public final ArrayList whiskey(String str) {
        int emerald;
        ArrayList arrayList = new ArrayList();
        int i4 = 1;
        while (str.charAt(i4) != ')') {
            int i5 = i4;
            while (str.charAt(i5) == '[') {
                i5++;
            }
            char charAt = str.charAt(i5);
            if (StringsKt.black("VZCBSIFJD", charAt)) {
                emerald = i5 + 1;
            } else if (charAt == 'L') {
                emerald = StringsKt.emerald(str, ';', i4, 4) + 1;
            } else {
                throw new Q("Unknown type prefix in the method signature: ".concat(str));
            }
            arrayList.add(yankee(i4, emerald, str));
            i4 = emerald;
        }
        return arrayList;
    }

    public final Class yankee(int i4, int i5, String str) {
        char charAt = str.charAt(i4);
        if (charAt == 'L') {
            ClassLoader delta = AbstractC3192d.delta(golf());
            String substring = str.substring(i4 + 1, i5 - 1);
            Intrinsics.delta(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            Class<?> loadClass = delta.loadClass(kotlin.text.r.november(substring, '/', '.'));
            Intrinsics.delta(loadClass, "jClass.safeClassLoader.l…d - 1).replace('/', '.'))");
            return loadClass;
        }
        if (charAt == '[') {
            Class yankee = yankee(i4 + 1, i5, str);
            Ne.c cVar = a0.alpha;
            Intrinsics.echo(yankee, "<this>");
            return Array.newInstance((Class<?>) yankee, 0).getClass();
        }
        if (charAt == 'V') {
            Class TYPE = Void.TYPE;
            Intrinsics.delta(TYPE, "TYPE");
            return TYPE;
        }
        if (charAt == 'Z') {
            return Boolean.TYPE;
        }
        if (charAt == 'C') {
            return Character.TYPE;
        }
        if (charAt == 'B') {
            return Byte.TYPE;
        }
        if (charAt == 'S') {
            return Short.TYPE;
        }
        if (charAt == 'I') {
            return Integer.TYPE;
        }
        if (charAt == 'F') {
            return Float.TYPE;
        }
        if (charAt == 'J') {
            return Long.TYPE;
        }
        if (charAt == 'D') {
            return Double.TYPE;
        }
        throw new Q("Unknown type prefix in the method signature: ".concat(str));
    }
}
