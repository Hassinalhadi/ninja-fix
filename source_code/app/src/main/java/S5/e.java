package S5;

import android.os.Build;
import android.util.Log;
import com.google.android.gms.cloudmessaging.zzd;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class e extends ClassLoader {
    @Override // java.lang.ClassLoader
    public final Class loadClass(String str, boolean z2) {
        if (Objects.equals(str, "com.google.android.gms.iid.MessengerCompat")) {
            if (Log.isLoggable("CloudMessengerCompat", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("CloudMessengerCompat", 3))) {
                Log.d("CloudMessengerCompat", "Using renamed FirebaseIidMessengerCompat class");
                return zzd.class;
            }
            return zzd.class;
        }
        return super.loadClass(str, z2);
    }
}
