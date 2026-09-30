package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import A8.g;
import E5.i;
import E5.s;
import K5.f;
import O5.a;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import com.clevertap.android.sdk.Constants;
import id.C1915c;

/* loaded from: classes3.dex */
public class JobInfoSchedulerService extends JobService {
    public static final /* synthetic */ int alpha = 0;

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i4 = jobParameters.getExtras().getInt(Constants.INAPP_PRIORITY);
        int i5 = jobParameters.getExtras().getInt("attemptNumber");
        s.bravo(getApplicationContext());
        C1915c alpha2 = i.alpha();
        alpha2.zulu(string);
        alpha2.silver = a.bravo(i4);
        if (string2 != null) {
            alpha2.red = Base64.decode(string2, 0);
        }
        K5.i iVar = s.alpha().delta;
        i hotel = alpha2.hotel();
        g gVar = new g(10, this, jobParameters);
        iVar.getClass();
        iVar.echo.execute(new f(iVar, hotel, i5, gVar));
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
