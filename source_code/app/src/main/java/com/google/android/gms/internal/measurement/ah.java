package com.google.android.gms.internal.measurement;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.os.Build;
import android.os.UserHandle;
import android.util.Log;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public abstract class ah {
    public static final Method alpha;
    public static final Method bravo;

    /* JADX WARN: Removed duplicated region for block: B:9:0x003a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    static {
        Method declaredMethod;
        Method method = null;
        if (Build.VERSION.SDK_INT >= 24) {
            try {
                declaredMethod = JobScheduler.class.getDeclaredMethod("scheduleAsPackage", JobInfo.class, String.class, Integer.TYPE, String.class);
            } catch (NoSuchMethodException unused) {
                if (Log.isLoggable("JobSchedulerCompat", 6)) {
                    Log.e("JobSchedulerCompat", "No scheduleAsPackage method available, falling back to schedule");
                }
            }
            alpha = declaredMethod;
            if (Build.VERSION.SDK_INT >= 24) {
                try {
                    method = UserHandle.class.getDeclaredMethod("myUserId", null);
                } catch (NoSuchMethodException unused2) {
                    if (Log.isLoggable("JobSchedulerCompat", 6)) {
                        Log.e("JobSchedulerCompat", "No myUserId method available");
                    }
                }
            }
            bravo = method;
        }
        declaredMethod = null;
        alpha = declaredMethod;
        if (Build.VERSION.SDK_INT >= 24) {
        }
        bravo = method;
    }
}
