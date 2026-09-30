package androidx.lifecycle;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* renamed from: androidx.lifecycle.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0636f {
    public static final C0636f charlie = new C0636f();
    public final HashMap alpha = new HashMap();
    public final HashMap bravo = new HashMap();

    public static void bravo(HashMap hashMap, C0635e c0635e, aa aaVar, Class cls) {
        aa aaVar2 = (aa) hashMap.get(c0635e);
        if (aaVar2 != null && aaVar != aaVar2) {
            throw new IllegalArgumentException("Method " + c0635e.bravo.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + aaVar2 + ", new value " + aaVar);
        }
        if (aaVar2 == null) {
            hashMap.put(c0635e, aaVar);
        }
    }

    public final C0634d alpha(Class cls, Method[] methodArr) {
        int i4;
        Class superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = this.alpha;
        if (superclass != null) {
            C0634d c0634d = (C0634d) hashMap2.get(superclass);
            if (c0634d == null) {
                c0634d = alpha(superclass, null);
            }
            hashMap.putAll(c0634d.bravo);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            C0634d c0634d2 = (C0634d) hashMap2.get(cls2);
            if (c0634d2 == null) {
                c0634d2 = alpha(cls2, null);
            }
            for (Map.Entry entry : c0634d2.bravo.entrySet()) {
                bravo(hashMap, (C0635e) entry.getKey(), (aa) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
            }
        }
        boolean z2 = false;
        for (Method method : methodArr) {
            B b2 = (B) method.getAnnotation(B.class);
            if (b2 != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length > 0) {
                    if (al.class.isAssignableFrom(parameterTypes[0])) {
                        i4 = 1;
                    } else {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                } else {
                    i4 = 0;
                }
                aa value = b2.value();
                if (parameterTypes.length > 1) {
                    if (aa.class.isAssignableFrom(parameterTypes[1])) {
                        if (value == aa.ON_ANY) {
                            i4 = 2;
                        } else {
                            throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                        }
                    } else {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                }
                if (parameterTypes.length <= 2) {
                    bravo(hashMap, new C0635e(method, i4), value, cls);
                    z2 = true;
                } else {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
            }
        }
        C0634d c0634d3 = new C0634d(hashMap);
        hashMap2.put(cls, c0634d3);
        this.bravo.put(cls, Boolean.valueOf(z2));
        return c0634d3;
    }
}
