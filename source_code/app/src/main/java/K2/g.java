package K2;

import A2.z;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;

/* loaded from: classes3.dex */
public abstract class g {
    public static final String alpha = z.golf("PackageManagerHelper");

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0023, code lost:
    
        A2.z.echo().alpha(r2, "Skipping component enablement for ".concat(r8.getName()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0032, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void alpha(Context context, Class cls, boolean z2) {
        int i4;
        String str;
        String str2 = "disabled";
        String str3 = alpha;
        try {
            int componentEnabledSetting = context.getPackageManager().getComponentEnabledSetting(new ComponentName(context, cls.getName()));
            boolean z10 = false;
            if (componentEnabledSetting != 0 && componentEnabledSetting == 1) {
                z10 = true;
            }
            PackageManager packageManager = context.getPackageManager();
            ComponentName componentName = new ComponentName(context, cls.getName());
            if (z2) {
                i4 = 1;
            } else {
                i4 = 2;
            }
            packageManager.setComponentEnabledSetting(componentName, i4, 1);
            z echo = z.echo();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(cls.getName());
            sb2.append(" ");
            if (!z2) {
                str = "disabled";
            } else {
                str = "enabled";
            }
            sb2.append(str);
            echo.alpha(str3, sb2.toString());
        } catch (Exception e) {
            z echo2 = z.echo();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(cls.getName());
            sb3.append("could not be ");
            if (z2) {
                str2 = "enabled";
            }
            sb3.append(str2);
            echo2.bravo(str3, sb3.toString(), e);
        }
    }
}
