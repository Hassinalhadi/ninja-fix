package androidx.compose.foundation.lazy.layout;

import android.os.Build;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class ay {
    public static final ax alpha;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        ax axVar;
        String lowerCase = Build.FINGERPRINT.toLowerCase(Locale.ROOT);
        Intrinsics.delta(lowerCase, "toLowerCase(...)");
        if (Intrinsics.areEqual(lowerCase, "robolectric")) {
            axVar = new Object();
        } else {
            axVar = null;
        }
        alpha = axVar;
    }
}
