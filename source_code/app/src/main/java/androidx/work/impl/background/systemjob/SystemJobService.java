package androidx.work.impl.background.systemjob;

import A2.h;
import A2.s;
import A2.z;
import B2.c;
import B2.f;
import B2.l;
import B2.w;
import E2.d;
import J2.e;
import J2.j;
import J2.t;
import L2.a;
import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.Build;
import android.os.Looper;
import android.os.PersistableBundle;
import androidx.appcompat.widget.P0;
import ao.ad;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: classes3.dex */
public class SystemJobService extends JobService implements c {
    public static final String teal = z.golf("SystemJobService");
    public w alpha;
    public final HashMap purple = new HashMap();
    public final h red = new h(1);
    public e silver;

    public static void alpha(String str) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
        } else {
            throw new IllegalStateException(ad.gray("Cannot invoke ", str, " on a background thread"));
        }
    }

    public static j bravo(JobParameters jobParameters) {
        try {
            PersistableBundle extras = jobParameters.getExtras();
            if (extras != null && extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return new j(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION"));
            }
            return null;
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // B2.c
    public final void charlie(j jVar, boolean z2) {
        alpha("onExecuted");
        z.echo().alpha(teal, P0.gold(new StringBuilder(), jVar.alpha, " executed on JobScheduler"));
        JobParameters jobParameters = (JobParameters) this.purple.remove(jVar);
        this.red.charlie(jVar);
        if (jobParameters != null) {
            jobFinished(jobParameters, z2);
        }
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        try {
            w golf = w.golf(getApplicationContext());
            this.alpha = golf;
            f fVar = golf.golf;
            this.silver = new e(fVar, golf.echo);
            fVar.alpha(this);
        } catch (IllegalStateException e) {
            if (Application.class.equals(getApplication().getClass())) {
                z.echo().hotel(teal, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.");
                return;
            }
            throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e);
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        w wVar = this.alpha;
        if (wVar != null) {
            wVar.golf.golf(this);
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        t tVar;
        alpha("onStartJob");
        w wVar = this.alpha;
        String str = teal;
        if (wVar == null) {
            z.echo().alpha(str, "WorkManager is not initialized; requesting retry.");
            jobFinished(jobParameters, true);
            return false;
        }
        j bravo = bravo(jobParameters);
        if (bravo == null) {
            z.echo().charlie(str, "WorkSpec id not found!");
            return false;
        }
        HashMap hashMap = this.purple;
        if (hashMap.containsKey(bravo)) {
            z.echo().alpha(str, "Job is already being executed by SystemJobService: " + bravo);
            return false;
        }
        z.echo().alpha(str, "onStartJob for " + bravo);
        hashMap.put(bravo, jobParameters);
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 24) {
            tVar = new t(1);
            if (d.golf(jobParameters) != null) {
                tVar.purple = Arrays.asList(d.golf(jobParameters));
            }
            if (d.foxtrot(jobParameters) != null) {
                tVar.alpha = Arrays.asList(d.foxtrot(jobParameters));
            }
            if (i4 >= 28) {
                tVar.red = E2.e.foxtrot(jobParameters);
            }
        } else {
            tVar = null;
        }
        e eVar = this.silver;
        l echo = this.red.echo(bravo);
        eVar.getClass();
        ((L2.c) ((a) eVar.red)).alpha(new s(eVar, echo, tVar, 6));
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        boolean contains;
        int i4;
        alpha("onStopJob");
        if (this.alpha == null) {
            z.echo().alpha(teal, "WorkManager is not initialized; requesting retry.");
            return true;
        }
        j bravo = bravo(jobParameters);
        if (bravo == null) {
            z.echo().charlie(teal, "WorkSpec id not found!");
            return false;
        }
        z.echo().alpha(teal, "onStopJob for " + bravo);
        this.purple.remove(bravo);
        l charlie = this.red.charlie(bravo);
        if (charlie != null) {
            if (Build.VERSION.SDK_INT >= 31) {
                i4 = E2.f.charlie(jobParameters);
            } else {
                i4 = -512;
            }
            e eVar = this.silver;
            eVar.getClass();
            eVar.L(charlie, i4);
        }
        f fVar = this.alpha.golf;
        String str = bravo.alpha;
        synchronized (fVar.kilo) {
            contains = fVar.india.contains(str);
        }
        return !contains;
    }
}
