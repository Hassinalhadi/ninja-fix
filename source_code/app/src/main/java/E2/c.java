package E2;

import A2.z;
import Aa.m;
import B2.h;
import B2.v;
import J2.g;
import J2.i;
import J2.j;
import J2.p;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import androidx.work.impl.background.systemjob.SystemJobService;
import av.q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import s6.P5;

/* loaded from: classes3.dex */
public final class c implements h {
    public static final String white = z.golf("SystemJobScheduler");
    public final Context alpha;
    public final JobScheduler purple;
    public final b red;
    public final WorkDatabase silver;
    public final A2.a teal;

    public c(Context context, WorkDatabase workDatabase, A2.a aVar) {
        JobScheduler bravo = a.bravo(context);
        b bVar = new b(context, aVar.delta, aVar.lima);
        this.alpha = context;
        this.purple = bravo;
        this.red = bVar;
        this.silver = workDatabase;
        this.teal = aVar;
    }

    public static void charlie(JobScheduler jobScheduler, int i4) {
        try {
            jobScheduler.cancel(i4);
        } catch (Throwable th) {
            z.echo().delta(white, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(i4)), th);
        }
    }

    public static ArrayList echo(Context context, JobScheduler jobScheduler, String str) {
        ArrayList foxtrot = foxtrot(context, jobScheduler);
        if (foxtrot == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(2);
        Iterator it = foxtrot.iterator();
        while (it.hasNext()) {
            JobInfo jobInfo = (JobInfo) it.next();
            j golf = golf(jobInfo);
            if (golf != null && str.equals(golf.alpha)) {
                arrayList.add(Integer.valueOf(jobInfo.getId()));
            }
        }
        return arrayList;
    }

    public static ArrayList foxtrot(Context context, JobScheduler jobScheduler) {
        List<JobInfo> alpha = a.alpha(jobScheduler);
        if (alpha == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(alpha.size());
        ComponentName componentName = new ComponentName(context, (Class<?>) SystemJobService.class);
        for (JobInfo jobInfo : alpha) {
            if (componentName.equals(jobInfo.getService())) {
                arrayList.add(jobInfo);
            }
        }
        return arrayList;
    }

    public static j golf(JobInfo jobInfo) {
        PersistableBundle extras = jobInfo.getExtras();
        if (extras != null) {
            try {
                if (extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                    return new j(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION", 0));
                }
                return null;
            } catch (NullPointerException unused) {
                return null;
            }
        }
        return null;
    }

    @Override // B2.h
    public final void alpha(p... pVarArr) {
        int intValue;
        ArrayList echo;
        int intValue2;
        WorkDatabase workDatabase = this.silver;
        final m mVar = new m(workDatabase);
        for (p pVar : pVarArr) {
            workDatabase.charlie();
            try {
                p hotel = workDatabase.uniform().hotel(pVar.alpha);
                String str = white;
                String str2 = pVar.alpha;
                if (hotel == null) {
                    z.echo().hotel(str, "Skipping scheduling " + str2 + " because it's no longer in the DB");
                    workDatabase.papa();
                } else if (hotel.bravo != 1) {
                    z.echo().hotel(str, "Skipping scheduling " + str2 + " because it is no longer enqueued");
                    workDatabase.papa();
                } else {
                    j bravo = P5.bravo(pVar);
                    g bravo2 = workDatabase.quebec().bravo(bravo);
                    WorkDatabase workDatabase2 = (WorkDatabase) mVar.purple;
                    A2.a aVar = this.teal;
                    if (bravo2 != null) {
                        intValue = bravo2.charlie;
                    } else {
                        aVar.getClass();
                        final int i4 = aVar.india;
                        Object november = workDatabase2.november(new Callable() { // from class: K2.d
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                int i5;
                                int i10;
                                Aa.m mVar2 = Aa.m.this;
                                WorkDatabase workDatabase3 = (WorkDatabase) mVar2.purple;
                                Long E4 = workDatabase3.lima().E("next_job_scheduler_id");
                                int i11 = 0;
                                if (E4 != null) {
                                    i5 = (int) E4.longValue();
                                } else {
                                    i5 = 0;
                                }
                                if (i5 == Integer.MAX_VALUE) {
                                    i10 = 0;
                                } else {
                                    i10 = i5 + 1;
                                }
                                workDatabase3.lima().F(new J2.d("next_job_scheduler_id", Long.valueOf(i10)));
                                if (i5 >= 0 && i5 <= i4) {
                                    i11 = i5;
                                } else {
                                    ((WorkDatabase) mVar2.purple).lima().F(new J2.d("next_job_scheduler_id", Long.valueOf(1)));
                                }
                                return Integer.valueOf(i11);
                            }
                        });
                        Intrinsics.delta(november, "workDatabase.runInTransa…d\n            }\n        )");
                        intValue = ((Number) november).intValue();
                    }
                    if (bravo2 == null) {
                        workDatabase.quebec().delta(new g(bravo.alpha, bravo.bravo, intValue));
                    }
                    hotel(pVar, intValue);
                    if (Build.VERSION.SDK_INT == 23 && (echo = echo(this.alpha, this.purple, str2)) != null) {
                        int indexOf = echo.indexOf(Integer.valueOf(intValue));
                        if (indexOf >= 0) {
                            echo.remove(indexOf);
                        }
                        if (!echo.isEmpty()) {
                            intValue2 = ((Integer) echo.get(0)).intValue();
                        } else {
                            aVar.getClass();
                            final int i5 = aVar.india;
                            Object november2 = workDatabase2.november(new Callable() { // from class: K2.d
                                @Override // java.util.concurrent.Callable
                                public final Object call() {
                                    int i52;
                                    int i10;
                                    Aa.m mVar2 = Aa.m.this;
                                    WorkDatabase workDatabase3 = (WorkDatabase) mVar2.purple;
                                    Long E4 = workDatabase3.lima().E("next_job_scheduler_id");
                                    int i11 = 0;
                                    if (E4 != null) {
                                        i52 = (int) E4.longValue();
                                    } else {
                                        i52 = 0;
                                    }
                                    if (i52 == Integer.MAX_VALUE) {
                                        i10 = 0;
                                    } else {
                                        i10 = i52 + 1;
                                    }
                                    workDatabase3.lima().F(new J2.d("next_job_scheduler_id", Long.valueOf(i10)));
                                    if (i52 >= 0 && i52 <= i5) {
                                        i11 = i52;
                                    } else {
                                        ((WorkDatabase) mVar2.purple).lima().F(new J2.d("next_job_scheduler_id", Long.valueOf(1)));
                                    }
                                    return Integer.valueOf(i11);
                                }
                            });
                            Intrinsics.delta(november2, "workDatabase.runInTransa…d\n            }\n        )");
                            intValue2 = ((Number) november2).intValue();
                        }
                        hotel(pVar, intValue2);
                    }
                    workDatabase.papa();
                }
            } finally {
                workDatabase.kilo();
            }
        }
    }

    @Override // B2.h
    public final boolean bravo() {
        return true;
    }

    @Override // B2.h
    public final void delta(String str) {
        Context context = this.alpha;
        JobScheduler jobScheduler = this.purple;
        ArrayList echo = echo(context, jobScheduler, str);
        if (echo != null && !echo.isEmpty()) {
            Iterator it = echo.iterator();
            while (it.hasNext()) {
                charlie(jobScheduler, ((Integer) it.next()).intValue());
            }
            i quebec = this.silver.quebec();
            WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) quebec.alpha;
            workDatabase_Impl.bravo();
            J2.h hVar = (J2.h) quebec.silver;
            androidx.sqlite.db.framework.i alpha = hVar.alpha();
            alpha.oscar(1, str);
            try {
                workDatabase_Impl.charlie();
                try {
                    alpha.charlie();
                    workDatabase_Impl.papa();
                } finally {
                    workDatabase_Impl.kilo();
                }
            } finally {
                hVar.lima(alpha);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:121:0x0088, code lost:
    
        if (r9 < 26) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x008b, code lost:
    
        if (r9 >= 24) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void hotel(p pVar, int i4) {
        int i5;
        boolean z2;
        boolean z10;
        int i10;
        int i11;
        int i12;
        String str;
        int i13;
        String str2;
        int i14;
        b bVar = this.red;
        bVar.getClass();
        A2.d dVar = pVar.juliet;
        PersistableBundle persistableBundle = new PersistableBundle();
        String str3 = pVar.alpha;
        persistableBundle.putString("EXTRA_WORK_SPEC_ID", str3);
        persistableBundle.putInt("EXTRA_WORK_SPEC_GENERATION", pVar.tango);
        persistableBundle.putBoolean("EXTRA_IS_PERIODIC", pVar.delta());
        JobInfo.Builder requiresCharging = new JobInfo.Builder(i4, bVar.alpha).setRequiresCharging(dVar.charlie);
        boolean z11 = dVar.delta;
        JobInfo.Builder builder = requiresCharging.setRequiresDeviceIdle(z11).setExtras(persistableBundle);
        NetworkRequest networkRequest = dVar.bravo.alpha;
        int i15 = Build.VERSION.SDK_INT;
        if (i15 >= 28 && networkRequest != null) {
            Intrinsics.echo(builder, "builder");
            builder.setRequiredNetwork(networkRequest);
        } else {
            int i16 = dVar.alpha;
            if (i15 >= 30 && i16 == 6) {
                builder.setRequiredNetwork(new NetworkRequest.Builder().addCapability(25).build());
            } else {
                int mike = q.mike(i16);
                if (mike != 0) {
                    if (mike != 1) {
                        if (mike != 2) {
                            i5 = 3;
                            if (mike != 3) {
                                i5 = 4;
                                if (mike == 4) {
                                }
                                z.echo().alpha(b.delta, "API version too low. Cannot convert network type value ".concat(A0.z.quebec(i16)));
                            }
                        } else {
                            i5 = 2;
                        }
                    }
                    i5 = 1;
                } else {
                    i5 = 0;
                }
                builder.setRequiredNetworkType(i5);
            }
        }
        if (!z11) {
            if (pVar.lima == 2) {
                i14 = 0;
            } else {
                i14 = 1;
            }
            builder.setBackoffCriteria(pVar.mike, i14);
        }
        long alpha = pVar.alpha();
        bVar.bravo.getClass();
        long max = Math.max(alpha - System.currentTimeMillis(), 0L);
        if (i15 <= 28) {
            builder.setMinimumLatency(max);
        } else if (max > 0) {
            builder.setMinimumLatency(max);
        } else if (!pVar.quebec && bVar.charlie) {
            builder.setImportantWhileForeground(true);
        }
        if (i15 >= 24 && dVar.alpha()) {
            for (A2.c cVar : dVar.india) {
                boolean z12 = cVar.bravo;
                v.november();
                builder.addTriggerContentUri(v.charlie(cVar.alpha, z12 ? 1 : 0));
            }
            builder.setTriggerContentUpdateDelay(dVar.golf);
            builder.setTriggerContentMaxDelay(dVar.hotel);
        }
        builder.setPersisted(false);
        int i17 = Build.VERSION.SDK_INT;
        if (i17 >= 26) {
            builder.setRequiresBatteryNotLow(dVar.echo);
            builder.setRequiresStorageNotLow(dVar.foxtrot);
        }
        if (pVar.kilo > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (max > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i17 >= 31 && pVar.quebec && !z2 && !z10) {
            builder.setExpedited(true);
        }
        if (i17 >= 35 && (str2 = pVar.xray) != null) {
            builder.setTraceTag(str2);
        }
        JobInfo build = builder.build();
        String str4 = white;
        z.echo().alpha(str4, "Scheduling work ID " + str3 + "Job ID " + i4);
        try {
            try {
                if (this.purple.schedule(build) == 0) {
                    z.echo().hotel(str4, "Unable to schedule work ID " + str3);
                    if (pVar.quebec) {
                        if (pVar.romeo == 1) {
                            i10 = 0;
                            try {
                                pVar.quebec = false;
                                z.echo().alpha(str4, "Scheduling a non-expedited job (work ID " + str3 + ")");
                                hotel(pVar, i4);
                            } catch (IllegalStateException e) {
                                e = e;
                                String str5 = a.alpha;
                                Context context = this.alpha;
                                Intrinsics.echo(context, "context");
                                WorkDatabase workDatabase = this.silver;
                                Intrinsics.echo(workDatabase, "workDatabase");
                                A2.a configuration = this.teal;
                                Intrinsics.echo(configuration, "configuration");
                                int i18 = Build.VERSION.SDK_INT;
                                if (i18 >= 31) {
                                    i11 = 150;
                                } else {
                                    i11 = 100;
                                }
                                int size = workDatabase.uniform().foxtrot().size();
                                String str6 = "<faulty JobScheduler failed to getPendingJobs>";
                                if (i18 >= 34) {
                                    JobScheduler bravo = a.bravo(context);
                                    List alpha2 = a.alpha(bravo);
                                    if (alpha2 != null) {
                                        ArrayList foxtrot = foxtrot(context, bravo);
                                        if (foxtrot != null) {
                                            i12 = alpha2.size() - foxtrot.size();
                                        } else {
                                            i12 = i10;
                                        }
                                        String str7 = null;
                                        if (i12 == 0) {
                                            str = null;
                                        } else {
                                            str = i12 + " of which are not owned by WorkManager";
                                        }
                                        Object systemService = context.getSystemService("jobscheduler");
                                        Intrinsics.charlie(systemService, "null cannot be cast to non-null type android.app.job.JobScheduler");
                                        ArrayList foxtrot2 = foxtrot(context, (JobScheduler) systemService);
                                        if (foxtrot2 != null) {
                                            i13 = foxtrot2.size();
                                        } else {
                                            i13 = i10;
                                        }
                                        if (i13 != 0) {
                                            str7 = i13 + " from WorkManager in the default namespace";
                                        }
                                        str6 = CollectionsKt.maroon(CollectionsKt.peach(alpha2.size() + " jobs in \"androidx.work.systemjobscheduler\" namespace", str, str7), ",\n", null, null, null, 62);
                                    }
                                } else {
                                    ArrayList foxtrot3 = foxtrot(context, a.bravo(context));
                                    if (foxtrot3 != null) {
                                        str6 = foxtrot3.size() + " jobs from WorkManager";
                                    }
                                }
                                StringBuilder lima = A0.z.lima("JobScheduler ", " job limit exceeded.\nIn JobScheduler there are ", str6, ".\nThere are ", i11);
                                lima.append(size);
                                lima.append(" jobs tracked by WorkManager's database;\nthe Configuration limit is ");
                                String quebec = Q0.c.quebec(lima, configuration.kilo, '.');
                                z.echo().charlie(str4, quebec);
                                throw new IllegalStateException(quebec, e);
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                z.echo().delta(str4, "Unable to schedule " + pVar, th);
            }
        } catch (IllegalStateException e4) {
            e = e4;
            i10 = 0;
        }
    }
}
