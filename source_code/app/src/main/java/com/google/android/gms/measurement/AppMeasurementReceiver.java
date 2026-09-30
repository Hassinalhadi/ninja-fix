package com.google.android.gms.measurement;

import Q1.a;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.util.SparseArray;
import androidx.core.widget.f;
import com.google.android.gms.measurement.internal.G;
import com.google.android.gms.measurement.internal.ar;

/* loaded from: classes2.dex */
public final class AppMeasurementReceiver extends a {
    public f charlie;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (this.charlie == null) {
            this.charlie = new f(24, this);
        }
        f fVar = this.charlie;
        fVar.getClass();
        ar arVar = G.lima(context, null, null).f7507b;
        G.foxtrot(arVar);
        if (intent == null) {
            arVar.f7632b.alpha("Receiver called with null intent");
            return;
        }
        String action = intent.getAction();
        arVar.f7636g.bravo(action, "Local receiver got");
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            Intent className = new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
            className.setAction("com.google.android.gms.measurement.UPLOAD");
            arVar.f7636g.alpha("Starting wakeful intent.");
            ((AppMeasurementReceiver) fVar.purple).getClass();
            SparseArray sparseArray = a.alpha;
            synchronized (sparseArray) {
                try {
                    int i4 = a.bravo;
                    int i5 = i4 + 1;
                    a.bravo = i5;
                    if (i5 <= 0) {
                        a.bravo = 1;
                    }
                    className.putExtra("androidx.contentpager.content.wakelockid", i4);
                    ComponentName startService = context.startService(className);
                    if (startService == null) {
                        return;
                    }
                    PowerManager.WakeLock newWakeLock = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "androidx.core:wake:" + startService.flattenToShortString());
                    newWakeLock.setReferenceCounted(false);
                    newWakeLock.acquire(60000L);
                    sparseArray.put(i4, newWakeLock);
                    return;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if ("com.android.vending.INSTALL_REFERRER".equals(action)) {
            arVar.f7632b.alpha("Install Referrer Broadcasts are deprecated");
        }
    }
}
