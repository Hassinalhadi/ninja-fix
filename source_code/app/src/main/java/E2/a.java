package E2;

import A2.z;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.Context;
import android.os.Build;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class a {
    public static final String alpha;

    static {
        String golf = z.golf("SystemJobScheduler");
        Intrinsics.delta(golf, "tagWithPrefix(\"SystemJobScheduler\")");
        alpha = golf;
    }

    public static final List alpha(JobScheduler jobScheduler) {
        Intrinsics.echo(jobScheduler, "<this>");
        try {
            List<JobInfo> allPendingJobs = jobScheduler.getAllPendingJobs();
            Intrinsics.delta(allPendingJobs, "jobScheduler.allPendingJobs");
            return allPendingJobs;
        } catch (Throwable th) {
            z.echo().delta(alpha, "getAllPendingJobs() is not reliable on this device.", th);
            return null;
        }
    }

    public static final JobScheduler bravo(Context context) {
        JobScheduler forNamespace;
        Intrinsics.echo(context, "<this>");
        Object systemService = context.getSystemService("jobscheduler");
        Intrinsics.charlie(systemService, "null cannot be cast to non-null type android.app.job.JobScheduler");
        JobScheduler jobScheduler = (JobScheduler) systemService;
        if (Build.VERSION.SDK_INT >= 34) {
            forNamespace = jobScheduler.forNamespace("androidx.work.systemjobscheduler");
            Intrinsics.delta(forNamespace, "jobScheduler.forNamespace(WORKMANAGER_NAMESPACE)");
            return forNamespace;
        }
        return jobScheduler;
    }
}
