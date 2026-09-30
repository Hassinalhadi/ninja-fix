package s6;

import g0.C1726f;

/* loaded from: classes2.dex */
public abstract class V {
    public static C1726f alpha;

    public static void alpha(Object obj, Object obj2) {
        if (obj != null) {
            if (obj2 != null) {
                return;
            }
            throw new NullPointerException("null value in entry: " + obj + "=null");
        }
        throw new NullPointerException(androidx.appcompat.widget.P0.bronze(obj2, "null key in entry: null="));
    }

    public static void bravo(int i4, String str) {
        if (i4 >= 0) {
            return;
        }
        throw new IllegalArgumentException(str + " cannot be negative but was: " + i4);
    }
}
