package kotlin.jvm.internal;

import androidx.appcompat.widget.P0;
import ao.ad;
import java.util.Arrays;
import kotlin.UninitializedPropertyAccessException;

/* loaded from: classes2.dex */
public class Intrinsics {
    public static boolean alpha(Float f5, float f10) {
        if (f5 != null && f5.floatValue() == f10) {
            return true;
        }
        return false;
    }

    public static boolean areEqual(Object obj, Object obj2) {
        if (obj == null) {
            if (obj2 == null) {
                return true;
            }
            return false;
        }
        return obj.equals(obj2);
    }

    public static void bravo(Object obj, String str) {
        if (obj != null) {
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException(str.concat(" must not be null"));
        kilo(illegalStateException, Intrinsics.class.getName());
        throw illegalStateException;
    }

    public static void charlie(Object obj, String str) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(str);
        kilo(nullPointerException, Intrinsics.class.getName());
        throw nullPointerException;
    }

    public static void checkNotNull(Object obj) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException();
        kilo(nullPointerException, Intrinsics.class.getName());
        throw nullPointerException;
    }

    public static void delta(Object obj, String str) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(P0.crimson(str, " must not be null"));
        kilo(nullPointerException, Intrinsics.class.getName());
        throw nullPointerException;
    }

    public static void echo(Object obj, String str) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(india(str));
        kilo(nullPointerException, Intrinsics.class.getName());
        throw nullPointerException;
    }

    public static void foxtrot(Object obj, String str) {
        if (obj != null) {
            return;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(india(str));
        kilo(illegalArgumentException, Intrinsics.class.getName());
        throw illegalArgumentException;
    }

    public static int golf(int i4, int i5) {
        if (i4 < i5) {
            return -1;
        }
        return i4 == i5 ? 0 : 1;
    }

    public static int hotel(long j5, long j6) {
        if (j5 < j6) {
            return -1;
        }
        return j5 == j6 ? 0 : 1;
    }

    public static String india(String str) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        String name = Intrinsics.class.getName();
        int i4 = 0;
        while (!stackTrace[i4].getClassName().equals(name)) {
            i4++;
        }
        while (stackTrace[i4].getClassName().equals(name)) {
            i4++;
        }
        StackTraceElement stackTraceElement = stackTrace[i4];
        StringBuilder india = av.q.india("Parameter specified as non-null is null: method ", stackTraceElement.getClassName(), ".", stackTraceElement.getMethodName(), ", parameter ");
        india.append(str);
        return india.toString();
    }

    public static void juliet() {
        throw new UnsupportedOperationException("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
    }

    public static void kilo(RuntimeException runtimeException, String str) {
        StackTraceElement[] stackTrace = runtimeException.getStackTrace();
        int length = stackTrace.length;
        int i4 = -1;
        for (int i5 = 0; i5 < length; i5++) {
            if (str.equals(stackTrace[i5].getClassName())) {
                i4 = i5;
            }
        }
        runtimeException.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i4 + 1, length));
    }

    public static void lima(String str) {
        UninitializedPropertyAccessException uninitializedPropertyAccessException = new UninitializedPropertyAccessException(ad.gray("lateinit property ", str, " has not been initialized"));
        kilo(uninitializedPropertyAccessException, Intrinsics.class.getName());
        throw uninitializedPropertyAccessException;
    }
}
