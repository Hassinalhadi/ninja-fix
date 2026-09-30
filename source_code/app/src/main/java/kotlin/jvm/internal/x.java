package kotlin.jvm.internal;

import ao.ad;
import com.google.maps.android.BuildConfig;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import je.InterfaceC1966e;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes2.dex */
public abstract class x {
    public static Collection alpha(Object obj) {
        if ((obj instanceof Yd.a) && !(obj instanceof Yd.b)) {
            hotel(obj, "kotlin.collections.MutableCollection");
            throw null;
        }
        try {
            return (Collection) obj;
        } catch (ClassCastException e) {
            Intrinsics.kilo(e, x.class.getName());
            throw e;
        }
    }

    public static List bravo(List list) {
        if ((list instanceof Yd.a) && !(list instanceof Yd.c)) {
            hotel(list, "kotlin.collections.MutableList");
            throw null;
        }
        return list;
    }

    public static Map charlie(Object obj) {
        if ((obj instanceof Yd.a) && !(obj instanceof Yd.e)) {
            hotel(obj, "kotlin.collections.MutableMap");
            throw null;
        }
        try {
            return (Map) obj;
        } catch (ClassCastException e) {
            Intrinsics.kilo(e, x.class.getName());
            throw e;
        }
    }

    public static Set delta(Object obj) {
        if ((obj instanceof Yd.a) && !(obj instanceof Yd.f)) {
            hotel(obj, "kotlin.collections.MutableSet");
            throw null;
        }
        try {
            return (Set) obj;
        } catch (ClassCastException e) {
            Intrinsics.kilo(e, x.class.getName());
            throw e;
        }
    }

    public static Object echo(int i4, Object obj) {
        if (obj != null && !foxtrot(i4, obj)) {
            hotel(obj, "kotlin.jvm.functions.Function" + i4);
            throw null;
        }
        return obj;
    }

    public static boolean foxtrot(int i4, Object obj) {
        int i5;
        if (obj instanceof kotlin.e) {
            if (obj instanceof g) {
                i5 = ((g) obj).getArity();
            } else if (obj instanceof Function0) {
                i5 = 0;
            } else if (obj instanceof Function1) {
                i5 = 1;
            } else if (obj instanceof Xd.l) {
                i5 = 2;
            } else if (obj instanceof Xd.m) {
                i5 = 3;
            } else if (obj instanceof Xd.n) {
                i5 = 4;
            } else if (obj instanceof Xd.o) {
                i5 = 5;
            } else if (obj instanceof Xd.p) {
                i5 = 6;
            } else if (obj instanceof Xd.q) {
                i5 = 7;
            } else if (obj instanceof Xd.r) {
                i5 = 8;
            } else if (obj instanceof Xd.s) {
                i5 = 9;
            } else if (obj instanceof Xd.a) {
                i5 = 10;
            } else if (obj instanceof Xd.b) {
                i5 = 11;
            } else {
                boolean z2 = obj instanceof InterfaceC1966e;
                if (z2) {
                    i5 = 12;
                } else if (obj instanceof Xd.c) {
                    i5 = 13;
                } else if (obj instanceof Xd.d) {
                    i5 = 14;
                } else if (obj instanceof Xd.e) {
                    i5 = 15;
                } else if (obj instanceof Xd.f) {
                    i5 = 16;
                } else if (obj instanceof Xd.g) {
                    i5 = 17;
                } else if (obj instanceof Xd.h) {
                    i5 = 18;
                } else if (obj instanceof Xd.i) {
                    i5 = 19;
                } else if (obj instanceof Xd.j) {
                    i5 = 20;
                } else if (obj instanceof Xd.k) {
                    i5 = 21;
                } else if (z2) {
                    i5 = 22;
                } else {
                    i5 = -1;
                }
            }
            if (i5 == i4) {
                return true;
            }
        }
        return false;
    }

    public static final Lf.h golf(Object[] array) {
        Intrinsics.echo(array, "array");
        return new Lf.h(array);
    }

    public static void hotel(Object obj, String str) {
        String name;
        if (obj == null) {
            name = BuildConfig.TRAVIS;
        } else {
            name = obj.getClass().getName();
        }
        ClassCastException classCastException = new ClassCastException(ad.amber(name, " cannot be cast to ", str));
        Intrinsics.kilo(classCastException, x.class.getName());
        throw classCastException;
    }
}
