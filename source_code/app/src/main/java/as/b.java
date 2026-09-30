package as;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class b {
    public final ab.d alpha;
    public final ComponentName bravo;

    public b(ab.d dVar, ComponentName componentName) {
        this.alpha = dVar;
        this.bravo = componentName;
    }

    public static String alpha(Context context, List list) {
        List<String> list2;
        PackageManager packageManager = context.getPackageManager();
        if (list == null) {
            list2 = new ArrayList();
        } else {
            list2 = list;
        }
        ResolveInfo resolveActivity = packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://")), 0);
        if (resolveActivity != null) {
            String str = resolveActivity.activityInfo.packageName;
            ArrayList arrayList = new ArrayList(list2.size() + 1);
            arrayList.add(str);
            if (list != null) {
                arrayList.addAll(list);
            }
            list2 = arrayList;
        }
        Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
        for (String str2 : list2) {
            intent.setPackage(str2);
            if (packageManager.resolveService(intent, 0) != null) {
                return str2;
            }
        }
        if (Build.VERSION.SDK_INT >= 30) {
            Log.w("CustomTabsClient", "Unable to find any Custom Tabs packages, you may need to add a <queries> element to your manifest. See the docs for CustomTabsClient#getPackageName.");
            return null;
        }
        return null;
    }

    public static boolean bravo(Context context, String str) {
        IntentFilter intentFilter;
        for (ResolveInfo resolveInfo : context.getPackageManager().queryIntentServices(new Intent("android.support.customtabs.action.CustomTabsService"), 64)) {
            ServiceInfo serviceInfo = resolveInfo.serviceInfo;
            if (serviceInfo != null && str.equals(serviceInfo.packageName) && (intentFilter = resolveInfo.filter) != null && intentFilter.hasCategory("androidx.browser.auth.category.AuthTab")) {
                return true;
            }
        }
        return false;
    }
}
