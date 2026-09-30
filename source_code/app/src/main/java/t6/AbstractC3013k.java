package t6;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: t6.k, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3013k {
    public static String alpha(int i4, int i5, String str) {
        if (i4 < 0) {
            return AbstractC3018l.bravo("%s (%s) must not be negative", str, Integer.valueOf(i4));
        }
        if (i5 >= 0) {
            return AbstractC3018l.bravo("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i4), Integer.valueOf(i5));
        }
        throw new IllegalArgumentException(ao.ad.zulu(i5, "negative size: "));
    }

    public static void bravo(int i4, int i5) {
        String bravo;
        if (i4 >= 0 && i4 < i5) {
            return;
        }
        if (i4 >= 0) {
            if (i5 >= 0) {
                bravo = AbstractC3018l.bravo("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i4), Integer.valueOf(i5));
            } else {
                throw new IllegalArgumentException(ao.ad.zulu(i5, "negative size: "));
            }
        } else {
            bravo = AbstractC3018l.bravo("%s (%s) must not be negative", "index", Integer.valueOf(i4));
        }
        throw new IndexOutOfBoundsException(bravo);
    }

    public static void charlie(int i4, int i5) {
        if (i4 >= 0 && i4 <= i5) {
        } else {
            throw new IndexOutOfBoundsException(alpha(i4, i5, "index"));
        }
    }

    public static void delta(int i4, int i5, int i10) {
        String alpha;
        if (i4 >= 0 && i5 >= i4 && i5 <= i10) {
            return;
        }
        if (i4 >= 0 && i4 <= i10) {
            if (i5 >= 0 && i5 <= i10) {
                alpha = AbstractC3018l.bravo("end index (%s) must not be less than start index (%s)", Integer.valueOf(i5), Integer.valueOf(i4));
            } else {
                alpha = alpha(i5, i10, "end index");
            }
        } else {
            alpha = alpha(i4, i10, "start index");
        }
        throw new IndexOutOfBoundsException(alpha);
    }

    public static androidx.lifecycle.Y echo(Class modelClass) {
        Intrinsics.echo(modelClass, "modelClass");
        try {
            Constructor declaredConstructor = modelClass.getDeclaredConstructor(null);
            if (Modifier.isPublic(declaredConstructor.getModifiers())) {
                try {
                    Object newInstance = declaredConstructor.newInstance(null);
                    Intrinsics.checkNotNull(newInstance);
                    return (androidx.lifecycle.Y) newInstance;
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(androidx.appcompat.widget.P0.blue(modelClass, "Cannot create an instance of "), e);
                } catch (InstantiationException e4) {
                    throw new RuntimeException(androidx.appcompat.widget.P0.blue(modelClass, "Cannot create an instance of "), e4);
                }
            }
            throw new RuntimeException(androidx.appcompat.widget.P0.blue(modelClass, "Cannot create an instance of "));
        } catch (NoSuchMethodException e5) {
            throw new RuntimeException(androidx.appcompat.widget.P0.blue(modelClass, "Cannot create an instance of "), e5);
        }
    }
}
