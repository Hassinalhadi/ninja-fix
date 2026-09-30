package Y3;

import bd.ExecutorC0748a;

/* loaded from: classes3.dex */
public abstract class f {
    public static final ExecutorC0748a alpha = new ExecutorC0748a(3);
    public static final ExecutorC0748a bravo = new ExecutorC0748a(4);

    public static void alpha(String str, boolean z2) {
        if (z2) {
        } else {
            throw new IllegalArgumentException(str);
        }
    }

    public static void bravo(Object obj) {
        charlie(obj, "Argument must not be null");
    }

    public static void charlie(Object obj, String str) {
        if (obj != null) {
        } else {
            throw new NullPointerException(str);
        }
    }
}
