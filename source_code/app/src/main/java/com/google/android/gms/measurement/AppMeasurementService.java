package com.google.android.gms.measurement;

import Q1.a;
import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import android.os.PowerManager;
import android.util.Log;
import android.util.SparseArray;
import av.ah;
import com.google.android.gms.measurement.internal.G;
import com.google.android.gms.measurement.internal.K0;
import com.google.android.gms.measurement.internal.O;
import com.google.android.gms.measurement.internal.RunnableC1465q0;
import com.google.android.gms.measurement.internal.Z0;
import com.google.android.gms.measurement.internal.ar;
import s6.E;

/* loaded from: classes2.dex */
public final class AppMeasurementService extends Service implements K0 {
    public ah alpha;

    @Override // com.google.android.gms.measurement.internal.K0
    public final boolean alpha(int i4) {
        return stopSelfResult(i4);
    }

    @Override // com.google.android.gms.measurement.internal.K0
    public final void bravo(Intent intent) {
        SparseArray sparseArray = a.alpha;
        int intExtra = intent.getIntExtra("androidx.contentpager.content.wakelockid", 0);
        if (intExtra == 0) {
            return;
        }
        SparseArray sparseArray2 = a.alpha;
        synchronized (sparseArray2) {
            try {
                PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) sparseArray2.get(intExtra);
                if (wakeLock != null) {
                    wakeLock.release();
                    sparseArray2.remove(intExtra);
                } else {
                    Log.w("WakefulBroadcastReceiv.", "No active wake lock id #" + intExtra);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.measurement.internal.K0
    public final void charlie(JobParameters jobParameters) {
        throw new UnsupportedOperationException();
    }

    public final ah delta() {
        if (this.alpha == null) {
            this.alpha = new ah(20, this);
        }
        return this.alpha;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        ah delta = delta();
        delta.getClass();
        if (intent == null) {
            Log.e("FA", "onBind called with null intent");
            return null;
        }
        String action = intent.getAction();
        if ("com.google.android.gms.measurement.START".equals(action)) {
            return new O(Z0.f((Service) delta.purple));
        }
        Log.w("FA", "onBind received unknown action: ".concat(String.valueOf(action)));
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        Log.v("FA", ((Service) delta().purple).getClass().getSimpleName().concat(" is starting up."));
    }

    @Override // android.app.Service
    public final void onDestroy() {
        Log.v("FA", ((Service) delta().purple).getClass().getSimpleName().concat(" is shutting down."));
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onRebind(Intent intent) {
        delta();
        if (intent == null) {
            Log.e("FA", "onRebind called with null intent");
        } else {
            Log.v("FA", "onRebind called. action: ".concat(String.valueOf(intent.getAction())));
        }
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i4, int i5) {
        ah delta = delta();
        if (intent == null) {
            delta.getClass();
            Log.w("FA", "AppMeasurementService started with null intent");
            return 2;
        }
        Service service = (Service) delta.purple;
        ar arVar = G.lima(service, null, null).f7507b;
        G.foxtrot(arVar);
        String action = intent.getAction();
        arVar.f7636g.charlie(Integer.valueOf(i5), action, "Local AppMeasurementService called. startId, action");
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            RunnableC1465q0 runnableC1465q0 = new RunnableC1465q0(delta, i5, arVar, intent);
            Z0 f5 = Z0.f(service);
            f5.u().g0(new E(16, f5, runnableC1465q0));
            return 2;
        }
        return 2;
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        delta();
        if (intent == null) {
            Log.e("FA", "onUnbind called with null intent");
            return true;
        }
        Log.v("FA", "onUnbind called for intent. action: ".concat(String.valueOf(intent.getAction())));
        return true;
    }
}
