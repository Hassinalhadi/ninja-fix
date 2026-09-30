package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0596c {
    public static final Class alpha;
    public static final boolean bravo;

    static {
        Class<?> cls;
        boolean z2;
        Class<?> cls2 = null;
        try {
            cls = Class.forName("libcore.io.Memory");
        } catch (Throwable unused) {
            cls = null;
        }
        alpha = cls;
        try {
            cls2 = Class.forName("org.robolectric.Robolectric");
        } catch (Throwable unused2) {
        }
        if (cls2 != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        bravo = z2;
    }

    public static boolean alpha() {
        if (alpha != null && !bravo) {
            return true;
        }
        return false;
    }
}
