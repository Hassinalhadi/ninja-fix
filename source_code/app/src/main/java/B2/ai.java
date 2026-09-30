package B2;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.database.Cursor;
import android.util.Log;
import androidx.work.impl.WorkDatabase_Impl;
import com.clevertap.android.sdk.bitmap.BitmapDownloadRequest;
import com.clevertap.android.sdk.bitmap.BitmapDownloadRequestHandlerWithTimeLimit;
import com.clevertap.android.sdk.inapp.CTInAppNotification;
import com.clevertap.android.sdk.inapp.InAppController;
import com.clevertap.android.sdk.inapp.InAppNotificationInflater;
import com.clevertap.android.sdk.network.DownloadedBitmap;
import com.clevertap.android.sdk.variables.VarCache;
import com.zendesk.service.HttpConstants;
import java.io.FileOutputStream;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.Callable;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class ai implements Callable {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Object purple;
    public final /* synthetic */ Object red;

    public /* synthetic */ ai(int i4, Object obj, Object obj2) {
        this.alpha = i4;
        this.purple = obj;
        this.red = obj2;
    }

    private final Object alpha() {
        F8.e eVar = (F8.e) this.purple;
        F8.g gVar = (F8.g) this.red;
        F8.p pVar = eVar.bravo;
        synchronized (pVar) {
            FileOutputStream openFileOutput = pVar.alpha.openFileOutput(pVar.bravo, 0);
            try {
                openFileOutput.write(gVar.alpha.toString().getBytes("UTF-8"));
            } finally {
                openFileOutput.close();
            }
        }
        return null;
    }

    private final Object bravo() {
        String str;
        ServiceInfo serviceInfo;
        String str2;
        int i4;
        ComponentName startService;
        Context context = (Context) this.purple;
        Intent intent = (Intent) this.red;
        com.google.firebase.messaging.o kilo = com.google.firebase.messaging.o.kilo();
        kilo.getClass();
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Starting service");
        }
        ((ArrayDeque) kilo.delta).offer(intent);
        Intent intent2 = new Intent("com.google.firebase.MESSAGING_EVENT");
        intent2.setPackage(context.getPackageName());
        synchronized (kilo) {
            try {
                str = (String) kilo.alpha;
                if (str == null) {
                    ResolveInfo resolveService = context.getPackageManager().resolveService(intent2, 0);
                    if (resolveService != null && (serviceInfo = resolveService.serviceInfo) != null) {
                        if (context.getPackageName().equals(serviceInfo.packageName) && (str2 = serviceInfo.name) != null) {
                            if (str2.startsWith(".")) {
                                kilo.alpha = context.getPackageName() + serviceInfo.name;
                            } else {
                                kilo.alpha = serviceInfo.name;
                            }
                            str = (String) kilo.alpha;
                        }
                        Log.e("FirebaseMessaging", "Error resolving target intent service, skipping classname enforcement. Resolved service was: " + serviceInfo.packageName + "/" + serviceInfo.name);
                        str = null;
                    }
                    Log.e("FirebaseMessaging", "Failed to resolve target intent service, skipping classname enforcement");
                    str = null;
                }
            } finally {
            }
        }
        if (str != null) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Restricting intent to a specific service: ".concat(str));
            }
            intent2.setClassName(context.getPackageName(), str);
        }
        try {
            if (kilo.oscar(context)) {
                startService = com.google.firebase.messaging.x.delta(context, intent2);
            } else {
                startService = context.startService(intent2);
                Log.d("FirebaseMessaging", "Missing wake lock permission, service start may be delayed");
            }
            if (startService == null) {
                Log.e("FirebaseMessaging", "Error while delivering the message: ServiceIntent not found.");
                i4 = HttpConstants.HTTP_NOT_FOUND;
            } else {
                i4 = -1;
            }
        } catch (IllegalStateException e) {
            Log.e("FirebaseMessaging", "Failed to start service while in background: " + e);
            i4 = HttpConstants.HTTP_PAYMENT_REQUIRED;
        } catch (SecurityException e4) {
            Log.e("FirebaseMessaging", "Error while delivering the message to the serviceIntent", e4);
            i4 = HttpConstants.HTTP_UNAUTHORIZED;
        }
        return Integer.valueOf(i4);
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        boolean z2;
        Unit incrementLocalInAppCountInPersistentStore$lambda$7;
        Boolean lambda$fileVarUpdated$4;
        DownloadedBitmap handleRequest$lambda$0;
        switch (this.alpha) {
            case 0:
                ah ahVar = (ah) this.purple;
                boolean z10 = ahVar instanceof af;
                ao aoVar = (ao) this.red;
                boolean z11 = true;
                String str = aoVar.charlie;
                J2.r rVar = aoVar.juliet;
                boolean z12 = false;
                if (z10) {
                    A2.x xVar = ((af) ahVar).alpha;
                    int golf = rVar.golf(str);
                    aoVar.india.tango().lima(str);
                    if (golf != 0) {
                        if (golf == 2) {
                            boolean z13 = xVar instanceof A2.w;
                            J2.p pVar = aoVar.alpha;
                            String str2 = aoVar.mike;
                            if (z13) {
                                String str3 = aq.alpha;
                                A2.z.echo().foxtrot(str3, "Worker result SUCCESS for " + str2);
                                if (pVar.delta()) {
                                    aoVar.charlie();
                                } else {
                                    rVar.november(3, str);
                                    A2.j jVar = ((A2.w) xVar).alpha;
                                    Intrinsics.delta(jVar, "success.outputData");
                                    rVar.mike(str, jVar);
                                    aoVar.golf.getClass();
                                    long currentTimeMillis = System.currentTimeMillis();
                                    J2.c cVar = aoVar.kilo;
                                    Iterator it = cVar.sierra(str).iterator();
                                    while (it.hasNext()) {
                                        String str4 = (String) it.next();
                                        if (rVar.golf(str4) == 5) {
                                            l2.p foxtrot = l2.p.foxtrot(1, "SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)");
                                            foxtrot.oscar(1, str4);
                                            WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) cVar.purple;
                                            workDatabase_Impl.bravo();
                                            Cursor mike = workDatabase_Impl.mike(foxtrot);
                                            try {
                                                if (mike.moveToFirst() && mike.getInt(0) != 0) {
                                                    z2 = true;
                                                } else {
                                                    z2 = false;
                                                }
                                                if (z2) {
                                                    A2.z.echo().foxtrot(aq.alpha, "Setting status to enqueued for ".concat(str4));
                                                    rVar.november(1, str4);
                                                    rVar.lima(currentTimeMillis, str4);
                                                }
                                            } finally {
                                                mike.close();
                                                foxtrot.golf();
                                            }
                                        }
                                    }
                                }
                            } else {
                                if (xVar instanceof A2.v) {
                                    String str5 = aq.alpha;
                                    A2.z.echo().foxtrot(str5, "Worker result RETRY for " + str2);
                                    aoVar.bravo(-256);
                                    z12 = z11;
                                    return Boolean.valueOf(z12);
                                }
                                String str6 = aq.alpha;
                                A2.z.echo().foxtrot(str6, "Worker result FAILURE for " + str2);
                                if (pVar.delta()) {
                                    aoVar.charlie();
                                } else {
                                    aoVar.delta(xVar);
                                }
                            }
                        } else if (!A0.z.bravo(golf)) {
                            aoVar.bravo(-512);
                            z12 = z11;
                            return Boolean.valueOf(z12);
                        }
                    }
                    z11 = false;
                    z12 = z11;
                    return Boolean.valueOf(z12);
                }
                if (ahVar instanceof ae) {
                    aoVar.delta(((ae) ahVar).alpha);
                    return Boolean.valueOf(z12);
                }
                if (ahVar instanceof ag) {
                    int i4 = ((ag) ahVar).alpha;
                    int golf2 = rVar.golf(str);
                    if (golf2 != 0 && !A0.z.bravo(golf2)) {
                        String str7 = aq.alpha;
                        A2.z echo = A2.z.echo();
                        StringBuilder victor = Q0.c.victor("Status for ", str, " is ");
                        victor.append(A0.z.romeo(golf2));
                        victor.append("; not doing any work and rescheduling for later execution");
                        echo.alpha(str7, victor.toString());
                        rVar.november(1, str);
                        rVar.oscar(i4, str);
                        rVar.juliet(-1L, str);
                        z12 = z11;
                        return Boolean.valueOf(z12);
                    }
                    String str8 = aq.alpha;
                    A2.z echo2 = A2.z.echo();
                    StringBuilder victor2 = Q0.c.victor("Status for ", str, " is ");
                    victor2.append(A0.z.romeo(golf2));
                    victor2.append(" ; not doing any work");
                    echo2.alpha(str8, victor2.toString());
                    z11 = false;
                    z12 = z11;
                    return Boolean.valueOf(z12);
                }
                throw new NoWhenBranchMatchedException();
            case 1:
                E8.b bVar = (E8.b) this.purple;
                E8.d dVar = (E8.d) this.red;
                F8.o oVar = bVar.india;
                synchronized (oVar.bravo) {
                    oVar.alpha.edit().putLong("fetch_timeout_in_seconds", dVar.alpha).putLong("minimum_fetch_interval_in_seconds", dVar.bravo).commit();
                }
                return null;
            case 2:
                return alpha();
            case 3:
                incrementLocalInAppCountInPersistentStore$lambda$7 = InAppController.incrementLocalInAppCountInPersistentStore$lambda$7((Context) this.purple, (InAppController) this.red);
                return incrementLocalInAppCountInPersistentStore$lambda$7;
            case 4:
                return InAppNotificationInflater.alpha((InAppNotificationInflater.InAppNotificationReadyListener) this.purple, (CTInAppNotification) this.red);
            case 5:
                lambda$fileVarUpdated$4 = ((VarCache) this.purple).lambda$fileVarUpdated$4((String) this.red);
                return lambda$fileVarUpdated$4;
            case 6:
                return bravo();
            default:
                handleRequest$lambda$0 = BitmapDownloadRequestHandlerWithTimeLimit.handleRequest$lambda$0((BitmapDownloadRequestHandlerWithTimeLimit) this.purple, (BitmapDownloadRequest) this.red);
                return handleRequest$lambda$0;
        }
    }
}
