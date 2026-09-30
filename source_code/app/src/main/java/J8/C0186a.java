package J8;

import android.os.Build;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import pe.AbstractC2327c;

/* renamed from: J8.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0186a {
    public final String alpha;
    public final String bravo;
    public final String charlie;
    public final ad delta;
    public final ArrayList echo;

    public C0186a(String str, String versionName, String appBuildVersion, ad adVar, ArrayList arrayList) {
        String deviceManufacturer = Build.MANUFACTURER;
        Intrinsics.echo(versionName, "versionName");
        Intrinsics.echo(appBuildVersion, "appBuildVersion");
        Intrinsics.echo(deviceManufacturer, "deviceManufacturer");
        this.alpha = str;
        this.bravo = versionName;
        this.charlie = appBuildVersion;
        this.delta = adVar;
        this.echo = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C0186a) {
                C0186a c0186a = (C0186a) obj;
                if (Intrinsics.areEqual(this.alpha, c0186a.alpha) && Intrinsics.areEqual(this.bravo, c0186a.bravo) && Intrinsics.areEqual(this.charlie, c0186a.charlie)) {
                    String str = Build.MANUFACTURER;
                    if (!Intrinsics.areEqual(str, str) || !Intrinsics.areEqual(this.delta, c0186a.delta) || !Intrinsics.areEqual(this.echo, c0186a.echo)) {
                        return false;
                    }
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.echo.hashCode() + ((this.delta.hashCode() + AbstractC2327c.sierra(AbstractC2327c.sierra(AbstractC2327c.sierra(this.alpha.hashCode() * 31, 31, this.bravo), 31, this.charlie), 31, Build.MANUFACTURER)) * 31);
    }

    public final String toString() {
        return "AndroidApplicationInfo(packageName=" + this.alpha + ", versionName=" + this.bravo + ", appBuildVersion=" + this.charlie + ", deviceManufacturer=" + Build.MANUFACTURER + ", currentProcessDetails=" + this.delta + ", appProcessDetails=" + this.echo + ')';
    }
}
