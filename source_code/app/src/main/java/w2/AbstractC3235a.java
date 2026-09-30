package w2;

import android.os.Trace;

/* renamed from: w2.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3235a {
    public static void alpha(int i4, String str) {
        Trace.beginAsyncSection(str, i4);
    }

    public static void bravo(int i4, String str) {
        Trace.endAsyncSection(str, i4);
    }

    public static boolean charlie() {
        return Trace.isEnabled();
    }

    public static void delta(int i4, String str) {
        Trace.setCounter(str, i4);
    }
}
