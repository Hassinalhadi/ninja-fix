package E0;

import android.app.ApplicationExitInfo;
import android.os.ext.SdkExtensions;
import android.util.CloseGuard;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class e {
    public static /* bridge */ /* synthetic */ int alpha() {
        return SdkExtensions.getExtensionVersion(30);
    }

    public static /* bridge */ /* synthetic */ ApplicationExitInfo delta(Object obj) {
        return (ApplicationExitInfo) obj;
    }

    public static /* synthetic */ CloseGuard golf() {
        return new CloseGuard();
    }

    public static /* bridge */ /* synthetic */ CloseGuard hotel(Object obj) {
        return (CloseGuard) obj;
    }
}
