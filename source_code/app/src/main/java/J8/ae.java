package J8;

import android.os.Build;
import android.os.Process;
import android.util.Base64;
import e6.AbstractC1630b;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class ae {
    public static final String alpha;
    public static final String bravo;

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0014, code lost:
    
        r0 = android.app.Application.getProcessName();
     */
    static {
        String bravo2;
        int i4 = Build.VERSION.SDK_INT;
        if (i4 > 33) {
            bravo2 = Process.myProcessName();
            Intrinsics.delta(bravo2, "myProcessName()");
        } else if ((i4 < 28 || bravo2 == null) && (bravo2 = AbstractC1630b.bravo()) == null) {
            bravo2 = "";
        }
        byte[] bytes = bravo2.getBytes(kotlin.text.a.alpha);
        Intrinsics.delta(bytes, "getBytes(...)");
        String encodeToString = Base64.encodeToString(bytes, 10);
        alpha = ao.ad.gray("firebase_session_", encodeToString, "_data");
        bravo = ao.ad.gray("firebase_session_", encodeToString, "_settings");
    }
}
