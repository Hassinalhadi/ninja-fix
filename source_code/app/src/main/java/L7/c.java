package L7;

import R7.az;
import R7.d0;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class c {
    public static final c alpha = new Object();
    public static final c bravo = new Object();

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, R7.ay] */
    public static az alpha(c cVar, String processName, int i4, int i5, int i10) {
        if ((i10 & 4) != 0) {
            i5 = 0;
        }
        cVar.getClass();
        Intrinsics.echo(processName, "processName");
        ?? obj = new Object();
        obj.alpha = processName;
        obj.bravo = i4;
        byte b2 = (byte) (obj.echo | 1);
        obj.charlie = i5;
        obj.delta = false;
        obj.echo = (byte) (((byte) (b2 | 2)) | 4);
        return obj.alpha();
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, R7.ay] */
    public static ArrayList delta(Context context) {
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
            ?? obj = new Object();
            String str2 = runningAppProcessInfo.processName;
            if (str2 != null) {
                obj.alpha = str2;
                obj.bravo = runningAppProcessInfo.pid;
                byte b2 = (byte) (obj.echo | 1);
                obj.charlie = runningAppProcessInfo.importance;
                obj.echo = (byte) (b2 | 2);
                obj.delta = Intrinsics.areEqual(str2, str);
                obj.echo = (byte) (obj.echo | 4);
                arrayList2.add(obj.alpha());
            } else {
                throw new NullPointerException("Null processName");
            }
        }
        return arrayList2;
    }

    public boolean bravo(int i4) {
        if (4 > i4 && !Log.isLoggable("FirebaseCrashlytics", i4)) {
            return false;
        }
        return true;
    }

    public void charlie(String str) {
        if (bravo(3)) {
            Log.d("FirebaseCrashlytics", str, null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0040, code lost:
    
        r4 = android.app.Application.getProcessName();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public d0 echo(Context context) {
        Object obj;
        String str;
        Intrinsics.echo(context, "context");
        int myPid = Process.myPid();
        Iterator it = delta(context).iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((az) ((d0) obj)).bravo == myPid) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        d0 d0Var = (d0) obj;
        if (d0Var == null) {
            int i4 = Build.VERSION.SDK_INT;
            if (i4 > 33) {
                str = Process.myProcessName();
                Intrinsics.delta(str, "{\n      Process.myProcessName()\n    }");
            } else if (i4 < 28 || str == null) {
                str = "";
            }
            return alpha(this, str, myPid, 0, 12);
        }
        return d0Var;
    }

    public void foxtrot(String str) {
        if (bravo(2)) {
            Log.v("FirebaseCrashlytics", str, null);
        }
    }

    public void golf(String str, Exception exc) {
        if (bravo(5)) {
            Log.w("FirebaseCrashlytics", str, exc);
        }
    }
}
