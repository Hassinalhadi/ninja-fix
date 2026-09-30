package androidx.lifecycle;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class ap {
    public static final HashMap alpha = new HashMap();
    public static final HashMap bravo = new HashMap();

    public static void alpha(Constructor constructor, ak akVar) {
        try {
            Object newInstance = constructor.newInstance(akVar);
            Intrinsics.checkNotNull(newInstance);
            if (newInstance == null) {
            } else {
                throw new ClassCastException();
            }
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e4) {
            throw new RuntimeException(e4);
        } catch (InvocationTargetException e5) {
            throw new RuntimeException(e5);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static int bravo(Class cls) {
        Constructor constructor;
        boolean z2;
        boolean z10;
        boolean z11;
        String str;
        int i4 = 1;
        HashMap hashMap = alpha;
        Integer num = (Integer) hashMap.get(cls);
        if (num != null) {
            return num.intValue();
        }
        if (cls.getCanonicalName() != null) {
            ArrayList arrayList = null;
            try {
                Package r4 = cls.getPackage();
                String className = cls.getCanonicalName();
                if (r4 != null) {
                    str = r4.getName();
                } else {
                    str = "";
                }
                Intrinsics.checkNotNull(str);
                if (str.length() != 0) {
                    Intrinsics.checkNotNull(className);
                    className = className.substring(str.length() + 1);
                    Intrinsics.delta(className, "substring(...)");
                }
                Intrinsics.checkNotNull(className);
                Intrinsics.echo(className, "className");
                String concat = kotlin.text.r.oscar(className, ".", "_").concat("_LifecycleAdapter");
                if (str.length() != 0) {
                    concat = str + '.' + concat;
                }
                constructor = Class.forName(concat).getDeclaredConstructor(cls);
                if (!constructor.isAccessible()) {
                    constructor.setAccessible(true);
                }
            } catch (ClassNotFoundException unused) {
                constructor = null;
            } catch (NoSuchMethodException e) {
                throw new RuntimeException(e);
            }
            HashMap hashMap2 = bravo;
            if (constructor != null) {
                hashMap2.put(cls, kotlin.collections.ab.juliet(constructor));
            } else {
                C0636f c0636f = C0636f.charlie;
                HashMap hashMap3 = c0636f.bravo;
                Boolean bool = (Boolean) hashMap3.get(cls);
                if (bool != null) {
                    z2 = bool.booleanValue();
                } else {
                    try {
                        Method[] declaredMethods = cls.getDeclaredMethods();
                        int length = declaredMethods.length;
                        int i5 = 0;
                        while (true) {
                            if (i5 < length) {
                                if (((B) declaredMethods[i5].getAnnotation(B.class)) != null) {
                                    c0636f.alpha(cls, declaredMethods);
                                    z2 = true;
                                    break;
                                }
                                i5++;
                            } else {
                                hashMap3.put(cls, Boolean.FALSE);
                                z2 = false;
                                break;
                            }
                        }
                    } catch (NoClassDefFoundError e4) {
                        throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e4);
                    }
                }
                if (!z2) {
                    Class superclass = cls.getSuperclass();
                    if (superclass != null && ak.class.isAssignableFrom(superclass)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        Intrinsics.checkNotNull(superclass);
                        if (bravo(superclass) != 1) {
                            Object obj = hashMap2.get(superclass);
                            Intrinsics.checkNotNull(obj);
                            arrayList = new ArrayList((Collection) obj);
                        }
                    }
                    Lf.h golf = kotlin.jvm.internal.x.golf(cls.getInterfaces());
                    while (true) {
                        if (golf.hasNext()) {
                            Class cls2 = (Class) golf.next();
                            if (cls2 != null && ak.class.isAssignableFrom(cls2)) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if (z11) {
                                Intrinsics.checkNotNull(cls2);
                                if (bravo(cls2) == 1) {
                                    break;
                                }
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                }
                                Object obj2 = hashMap2.get(cls2);
                                Intrinsics.checkNotNull(obj2);
                                arrayList.addAll((Collection) obj2);
                            }
                        } else if (arrayList != null) {
                            hashMap2.put(cls, arrayList);
                        }
                    }
                }
            }
            i4 = 2;
        }
        hashMap.put(cls, Integer.valueOf(i4));
        return i4;
    }
}
