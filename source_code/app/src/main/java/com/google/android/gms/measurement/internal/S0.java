package com.google.android.gms.measurement.internal;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobScheduler;
import android.content.Context;
import android.content.Intent;
import android.os.Build;

/* loaded from: classes2.dex */
public final class S0 extends U0 {
    public final AlarmManager silver;
    public N0 teal;
    public Integer white;

    public S0(Z0 z02) {
        super(z02);
        this.silver = (AlarmManager) ((G) this.alpha).alpha.getSystemService("alarm");
    }

    @Override // com.google.android.gms.measurement.internal.U0
    public final void Z() {
        JobScheduler jobScheduler;
        AlarmManager alarmManager = this.silver;
        if (alarmManager != null) {
            alarmManager.cancel(c0());
        }
        if (Build.VERSION.SDK_INT >= 24 && (jobScheduler = (JobScheduler) ((G) this.alpha).alpha.getSystemService("jobscheduler")) != null) {
            jobScheduler.cancel(b0());
        }
    }

    public final void a0() {
        JobScheduler jobScheduler;
        X();
        G g2 = (G) this.alpha;
        ar arVar = g2.f7507b;
        G.foxtrot(arVar);
        arVar.f7636g.alpha("Unscheduling upload");
        AlarmManager alarmManager = this.silver;
        if (alarmManager != null) {
            alarmManager.cancel(c0());
        }
        d0().alpha();
        if (Build.VERSION.SDK_INT >= 24 && (jobScheduler = (JobScheduler) g2.alpha.getSystemService("jobscheduler")) != null) {
            jobScheduler.cancel(b0());
        }
    }

    public final int b0() {
        if (this.white == null) {
            this.white = Integer.valueOf("measurement".concat(String.valueOf(((G) this.alpha).alpha.getPackageName())).hashCode());
        }
        return this.white.intValue();
    }

    public final PendingIntent c0() {
        Context context = ((G) this.alpha).alpha;
        return PendingIntent.getBroadcast(context, 0, new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), com.google.android.gms.internal.measurement.ag.alpha);
    }

    public final AbstractC1452k d0() {
        if (this.teal == null) {
            this.teal = new N0(this, this.purple.e, 1);
        }
        return this.teal;
    }
}
