package j2;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

/* renamed from: j2.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1938e {
    public static PackageInfo alpha(PackageManager packageManager, Context context) {
        return packageManager.getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
    }
}
