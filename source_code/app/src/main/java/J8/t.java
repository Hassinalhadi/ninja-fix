package J8;

import android.app.ActivityManager;
import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class t {
    public static final u alpha = new u(0);
    public static final u bravo = new u(1);
    public static final G1.f charlie = new G1.f("session_id");

    public static ArrayList alpha(Context context) {
        ActivityManager activityManager;
        int collectionSizeOrDefault;
        Intrinsics.echo(context, "context");
        int i4 = context.getApplicationInfo().uid;
        String str = context.getApplicationInfo().processName;
        Object systemService = context.getSystemService("activity");
        List<ActivityManager.RunningAppProcessInfo> list = null;
        if (systemService instanceof ActivityManager) {
            activityManager = (ActivityManager) systemService;
        } else {
            activityManager = null;
        }
        if (activityManager != null) {
            list = activityManager.getRunningAppProcesses();
        }
        if (list == null) {
            list = CollectionsKt.emptyList();
        }
        ArrayList emerald = CollectionsKt.emerald(list);
        ArrayList arrayList = new ArrayList();
        Iterator it = emerald.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((ActivityManager.RunningAppProcessInfo) next).uid == i4) {
                arrayList.add(next);
            }
        }
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10);
        ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault);
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = (ActivityManager.RunningAppProcessInfo) it2.next();
            String str2 = runningAppProcessInfo.processName;
            Intrinsics.delta(str2, "runningAppProcessInfo.processName");
            arrayList2.add(new ad(str2, runningAppProcessInfo.pid, runningAppProcessInfo.importance, Intrinsics.areEqual(runningAppProcessInfo.processName, str)));
        }
        return arrayList2;
    }
}
