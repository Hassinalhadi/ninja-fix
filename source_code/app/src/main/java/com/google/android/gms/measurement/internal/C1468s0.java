package com.google.android.gms.measurement.internal;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.os.Build;
import android.os.PersistableBundle;
import com.clevertap.android.sdk.Constants;

/* renamed from: com.google.android.gms.measurement.internal.s0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1468s0 extends AbstractC1481z {
    public JobScheduler red;

    @Override // com.google.android.gms.measurement.internal.AbstractC1481z
    public final boolean Z() {
        return true;
    }

    public final int a0() {
        boolean booleanValue;
        X();
        W();
        G g2 = (G) this.alpha;
        if (!g2.yellow.j0(null, ac.f7570K)) {
            return 9;
        }
        if (this.red != null) {
            Boolean h02 = g2.yellow.h0("google_analytics_sgtm_upload_enabled");
            if (h02 == null) {
                booleanValue = false;
            } else {
                booleanValue = h02.booleanValue();
            }
            if (booleanValue) {
                if (g2.india().f7623c >= 119000) {
                    if (!d1.T0(g2.alpha, "com.google.android.gms.measurement.AppMeasurementJobService")) {
                        return 3;
                    }
                    if (Build.VERSION.SDK_INT >= 24) {
                        if (!g2.mike().j0()) {
                            return 5;
                        }
                        return 2;
                    }
                    return 4;
                }
                return 6;
            }
            return 8;
        }
        return 7;
    }

    public final void b0(long j5) {
        String str;
        JobInfo pendingJob;
        X();
        W();
        JobScheduler jobScheduler = this.red;
        G g2 = (G) this.alpha;
        if (jobScheduler != null) {
            pendingJob = jobScheduler.getPendingJob("measurement-client".concat(String.valueOf(g2.alpha.getPackageName())).hashCode());
            if (pendingJob != null) {
                ar arVar = g2.f7507b;
                G.foxtrot(arVar);
                arVar.f7636g.alpha("[sgtm] There's an existing pending job, skip this schedule.");
                return;
            }
        }
        int a02 = a0();
        if (a02 == 2) {
            ar arVar2 = g2.f7507b;
            G.foxtrot(arVar2);
            arVar2.f7636g.bravo(Long.valueOf(j5), "[sgtm] Scheduling Scion upload, millis");
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putString(Constants.KEY_ACTION, "com.google.android.gms.measurement.SCION_UPLOAD");
            JobInfo build = new JobInfo.Builder("measurement-client".concat(String.valueOf(g2.alpha.getPackageName())).hashCode(), new ComponentName(g2.alpha, "com.google.android.gms.measurement.AppMeasurementJobService")).setRequiredNetworkType(1).setMinimumLatency(j5).setOverrideDeadline(j5 + j5).setExtras(persistableBundle).build();
            JobScheduler jobScheduler2 = this.red;
            V5.x.hotel(jobScheduler2);
            int schedule = jobScheduler2.schedule(build);
            ar arVar3 = g2.f7507b;
            G.foxtrot(arVar3);
            if (schedule == 1) {
                str = "SUCCESS";
            } else {
                str = "FAILURE";
            }
            arVar3.f7636g.bravo(str, "[sgtm] Scion upload job scheduled with result");
            return;
        }
        ar arVar4 = g2.f7507b;
        G.foxtrot(arVar4);
        arVar4.f7636g.bravo(ao.ad.indigo(a02), "[sgtm] Not eligible for Scion upload");
    }
}
