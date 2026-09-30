package K1;

import android.content.pm.PackageManager;
import android.content.pm.Signature;

/* loaded from: classes3.dex */
public final class c extends U8.a {
    @Override // U8.a
    public final Signature[] hotel(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }
}
