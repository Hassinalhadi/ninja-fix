package J8;

import android.os.Build;
import kotlin.jvm.internal.Intrinsics;
import pe.AbstractC2327c;

/* renamed from: J8.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0187b {
    public final String alpha;
    public final C0186a bravo;

    public C0187b(String appId, C0186a c0186a) {
        String deviceModel = Build.MODEL;
        String osVersion = Build.VERSION.RELEASE;
        Intrinsics.echo(appId, "appId");
        Intrinsics.echo(deviceModel, "deviceModel");
        Intrinsics.echo(osVersion, "osVersion");
        this.alpha = appId;
        this.bravo = c0186a;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C0187b) {
                C0187b c0187b = (C0187b) obj;
                if (Intrinsics.areEqual(this.alpha, c0187b.alpha)) {
                    String str = Build.MODEL;
                    if (Intrinsics.areEqual(str, str) && Intrinsics.areEqual("2.1.2", "2.1.2")) {
                        String str2 = Build.VERSION.RELEASE;
                        if (!Intrinsics.areEqual(str2, str2) || !Intrinsics.areEqual(this.bravo, c0187b.bravo)) {
                            return false;
                        }
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.bravo.hashCode() + ((ac.LOG_ENVIRONMENT_PROD.hashCode() + AbstractC2327c.sierra((((Build.MODEL.hashCode() + (this.alpha.hashCode() * 31)) * 31) + 47595001) * 31, 31, Build.VERSION.RELEASE)) * 31);
    }

    public final String toString() {
        return "ApplicationInfo(appId=" + this.alpha + ", deviceModel=" + Build.MODEL + ", sessionSdkVersion=2.1.2, osVersion=" + Build.VERSION.RELEASE + ", logEnvironment=" + ac.LOG_ENVIRONMENT_PROD + ", androidAppInfo=" + this.bravo + ')';
    }
}
