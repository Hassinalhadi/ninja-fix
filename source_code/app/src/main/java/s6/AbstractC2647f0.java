package s6;

import android.content.Context;
import android.content.SharedPreferences;
import g0.C1726f;

/* renamed from: s6.f0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2647f0 {
    public static C1726f alpha;

    public static SharedPreferences alpha(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return context.getSharedPreferences("com.google.firebase.messaging", 0);
    }
}
