package J8;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.os.Process;
import e6.AbstractC1630b;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class ao {
    public static final ao alpha = new Object();
    public static final com.google.android.material.internal.s bravo;

    /* JADX WARN: Type inference failed for: r0v0, types: [J8.ao, java.lang.Object] */
    static {
        d8.d dVar = new d8.d();
        dVar.alpha(an.class, C0192g.alpha);
        dVar.alpha(aw.class, h.alpha);
        dVar.alpha(k.class, C0190e.alpha);
        dVar.alpha(C0187b.class, C0189d.alpha);
        dVar.alpha(C0186a.class, C0188c.alpha);
        dVar.alpha(ad.class, C0191f.alpha);
        dVar.silver = true;
        bravo = new com.google.android.material.internal.s(5, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0094, code lost:
    
        r5 = android.app.Application.getProcessName();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C0187b alpha(B7.g gVar) {
        String valueOf;
        Object obj;
        String bravo2;
        long longVersionCode;
        gVar.alpha();
        Context context = gVar.alpha;
        Intrinsics.delta(context, "firebaseApp.applicationContext");
        String packageName = context.getPackageName();
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
        if (Build.VERSION.SDK_INT >= 28) {
            longVersionCode = packageInfo.getLongVersionCode();
            valueOf = String.valueOf(longVersionCode);
        } else {
            valueOf = String.valueOf(packageInfo.versionCode);
        }
        gVar.alpha();
        String str = gVar.charlie.bravo;
        Intrinsics.delta(str, "firebaseApp.options.applicationId");
        String MODEL = Build.MODEL;
        Intrinsics.delta(MODEL, "MODEL");
        String RELEASE = Build.VERSION.RELEASE;
        Intrinsics.delta(RELEASE, "RELEASE");
        Intrinsics.delta(packageName, "packageName");
        String str2 = packageInfo.versionName;
        if (str2 == null) {
            str2 = valueOf;
        }
        String MANUFACTURER = Build.MANUFACTURER;
        Intrinsics.delta(MANUFACTURER, "MANUFACTURER");
        gVar.alpha();
        int myPid = Process.myPid();
        Iterator it = t.alpha(context).iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((ad) obj).bravo == myPid) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        ad adVar = (ad) obj;
        if (adVar == null) {
            int i4 = Build.VERSION.SDK_INT;
            if (i4 > 33) {
                bravo2 = Process.myProcessName();
                Intrinsics.delta(bravo2, "myProcessName()");
            } else if ((i4 < 28 || bravo2 == null) && (bravo2 = AbstractC1630b.bravo()) == null) {
                bravo2 = "";
            }
            adVar = new ad(bravo2, myPid, 0, false);
        }
        gVar.alpha();
        return new C0187b(str, new C0186a(packageName, str2, valueOf, adVar, t.alpha(context)));
    }
}
