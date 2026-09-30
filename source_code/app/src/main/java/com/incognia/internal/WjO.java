package com.incognia.internal;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.Context;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class WjO {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x003e A[Catch: all -> 0x0045, TRY_LEAVE, TryCatch #0 {all -> 0x0045, blocks: (B:2:0x0000, B:4:0x0014, B:7:0x003e, B:12:0x0019, B:14:0x0020, B:15:0x0024, B:17:0x002a, B:21:0x0038), top: B:1:0x0000 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void b(Context context, int i4) {
        JobInfo jobInfo;
        JobInfo jobInfo2;
        try {
            JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
            if (CnH.b(CnH.f8484b, 24, 0, 2)) {
                jobInfo2 = jobScheduler.getPendingJob(i4);
            } else {
                List<JobInfo> allPendingJobs = jobScheduler.getAllPendingJobs();
                jobInfo = null;
                if (allPendingJobs != null) {
                    Iterator<T> it = allPendingJobs.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Object next = it.next();
                        if (((JobInfo) next).getId() == i4) {
                            jobInfo = next;
                            break;
                        }
                    }
                    jobInfo2 = jobInfo;
                }
                if (jobInfo == null) {
                    jobScheduler.cancel(jobInfo.getId());
                    return;
                }
                return;
            }
            jobInfo = jobInfo2;
            if (jobInfo == null) {
            }
        } catch (Throwable unused) {
        }
    }
}
