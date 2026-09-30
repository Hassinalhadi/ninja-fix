package P7;

import android.util.Log;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class e {
    public static void alpha(Function0 function0, Function0 function02) {
        if (!((Boolean) function0.invoke()).booleanValue()) {
            String str = (String) function02.invoke();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str, null);
            }
        }
    }
}
