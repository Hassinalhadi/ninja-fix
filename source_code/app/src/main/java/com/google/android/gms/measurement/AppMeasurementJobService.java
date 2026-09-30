package com.google.android.gms.measurement;

import D2.d;
import V5.x;
import android.annotation.TargetApi;
import android.app.Service;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import android.util.Log;
import av.ah;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.internal.measurement.J;
import com.google.android.gms.internal.measurement.ax;
import com.google.android.gms.measurement.internal.K0;
import com.google.android.gms.measurement.internal.Z0;
import com.google.android.gms.measurement.internal.ac;
import com.google.android.gms.measurement.internal.ar;
import java.util.Objects;
import r6.u;
import s6.E;

@TargetApi(24)
/* loaded from: classes2.dex */
public final class AppMeasurementJobService extends JobService implements K0 {
    public ah alpha;

    @Override // com.google.android.gms.measurement.internal.K0
    public final boolean alpha(int i4) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.measurement.internal.K0
    public final void bravo(Intent intent) {
    }

    @Override // com.google.android.gms.measurement.internal.K0
    public final void charlie(JobParameters jobParameters) {
        jobFinished(jobParameters, false);
    }

    public final ah delta() {
        if (this.alpha == null) {
            this.alpha = new ah(20, this);
        }
        return this.alpha;
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

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        ah delta = delta();
        delta.getClass();
        String string = jobParameters.getExtras().getString(Constants.KEY_ACTION);
        Log.v("FA", "onStartJob received action: ".concat(String.valueOf(string)));
        boolean equals = Objects.equals(string, "com.google.android.gms.measurement.UPLOAD");
        Service service = (Service) delta.purple;
        if (equals) {
            x.hotel(string);
            Z0 f5 = Z0.f(service);
            ar crimson = f5.crimson();
            u uVar = f5.e.white;
            crimson.f7636g.bravo(string, "Local AppMeasurementJobService called. action");
            f5.u().g0(new E(16, f5, new d(delta, crimson, jobParameters, 12)));
        }
        if (Objects.equals(string, "com.google.android.gms.measurement.SCION_UPLOAD")) {
            x.hotel(string);
            J delta2 = J.delta(service, null);
            if (((Boolean) ac.f7572M.alpha(null)).booleanValue()) {
                com.google.common.util.concurrent.d dVar = new com.google.common.util.concurrent.d(12, delta, jobParameters);
                delta2.getClass();
                delta2.bravo(new ax(delta2, dVar, 1));
                return true;
            }
            return true;
        }
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return false;
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
