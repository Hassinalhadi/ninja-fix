package K2;

import A2.z;
import B2.w;
import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.ApplicationExitInfo;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteAccessPermException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteDiskIOException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.database.sqlite.SQLiteTableLockedException;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import androidx.work.impl.utils.ForceStopRunnable$BroadcastReceiver;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import s6.AbstractC2737p0;
import s6.V6;

/* loaded from: classes3.dex */
public final class c implements Runnable {
    public static final String teal = z.golf("ForceStopRunnable");
    public static final long white = TimeUnit.DAYS.toMillis(3650);
    public final Context alpha;
    public final w purple;
    public final D8.c red;
    public int silver = 0;

    public c(Context context, w wVar) {
        this.alpha = context.getApplicationContext();
        this.purple = wVar;
        this.red = wVar.hotel;
    }

    public static void charlie(Context context) {
        int i4;
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        if (Build.VERSION.SDK_INT >= 31) {
            i4 = 167772160;
        } else {
            i4 = 134217728;
        }
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, (Class<?>) ForceStopRunnable$BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        PendingIntent broadcast = PendingIntent.getBroadcast(context, -1, intent, i4);
        long currentTimeMillis = System.currentTimeMillis() + white;
        if (alarmManager != null) {
            alarmManager.setExact(0, currentTimeMillis, broadcast);
        }
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x022a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void alpha() {
        int i4;
        boolean z2;
        int i5;
        int i10;
        int i11;
        PendingIntent broadcast;
        List historicalProcessExitReasons;
        int reason;
        long timestamp;
        int i12 = 1;
        D8.c cVar = this.red;
        w wVar = this.purple;
        WorkDatabase workDatabase = wVar.delta;
        String str = E2.c.white;
        Context context = this.alpha;
        JobScheduler bravo = E2.a.bravo(context);
        ArrayList foxtrot = E2.c.foxtrot(context, bravo);
        J2.i quebec = workDatabase.quebec();
        quebec.getClass();
        l2.p foxtrot2 = l2.p.foxtrot(0, "SELECT DISTINCT work_spec_id FROM SystemIdInfo");
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) quebec.alpha;
        workDatabase_Impl.bravo();
        Cursor mike = workDatabase_Impl.mike(foxtrot2);
        try {
            ArrayList arrayList = new ArrayList(mike.getCount());
            while (mike.moveToNext()) {
                arrayList.add(mike.getString(0));
            }
            if (foxtrot != null) {
                i4 = foxtrot.size();
            } else {
                i4 = 0;
            }
            HashSet hashSet = new HashSet(i4);
            if (foxtrot != null && !foxtrot.isEmpty()) {
                Iterator it = foxtrot.iterator();
                while (it.hasNext()) {
                    JobInfo jobInfo = (JobInfo) it.next();
                    J2.j golf = E2.c.golf(jobInfo);
                    if (golf != null) {
                        hashSet.add(golf.alpha);
                    } else {
                        E2.c.charlie(bravo, jobInfo.getId());
                    }
                }
            }
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (it2.hasNext()) {
                    if (!hashSet.contains((String) it2.next())) {
                        z.echo().alpha(E2.c.white, "Reconciling jobs");
                        z2 = true;
                        break;
                    }
                } else {
                    z2 = false;
                    break;
                }
            }
            if (z2) {
                workDatabase.charlie();
                try {
                    J2.r uniform = workDatabase.uniform();
                    Iterator it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        uniform.juliet(-1L, (String) it3.next());
                    }
                    workDatabase.papa();
                    workDatabase.kilo();
                } catch (Throwable th) {
                    throw th;
                }
            }
            workDatabase = wVar.delta;
            J2.r uniform2 = workDatabase.uniform();
            J2.n tango = workDatabase.tango();
            workDatabase.charlie();
            try {
                ArrayList echo = uniform2.echo();
                boolean isEmpty = echo.isEmpty();
                if (!isEmpty) {
                    Iterator it4 = echo.iterator();
                    while (it4.hasNext()) {
                        String str2 = ((J2.p) it4.next()).alpha;
                        uniform2.november(i12, str2);
                        uniform2.oscar(-512, str2);
                        uniform2.juliet(-1L, str2);
                        i12 = i12;
                    }
                }
                int i13 = i12;
                WorkDatabase_Impl workDatabase_Impl2 = (WorkDatabase_Impl) tango.alpha;
                workDatabase_Impl2.bravo();
                J2.h hVar = (J2.h) tango.silver;
                androidx.sqlite.db.framework.i alpha = hVar.alpha();
                try {
                    workDatabase_Impl2.charlie();
                    try {
                        alpha.charlie();
                        workDatabase_Impl2.papa();
                        hVar.lima(alpha);
                        workDatabase.papa();
                        workDatabase.kilo();
                        if (isEmpty && !z2) {
                            i5 = 0;
                        } else {
                            i5 = i13;
                        }
                        Long E4 = ((WorkDatabase) wVar.hotel.purple).lima().E("reschedule_needed");
                        long j5 = 0;
                        String str3 = teal;
                        if (E4 != null && E4.longValue() == 1) {
                            z.echo().alpha(str3, "Rescheduling Workers.");
                            wVar.india();
                            D8.c cVar2 = wVar.hotel;
                            cVar2.getClass();
                            ((WorkDatabase) cVar2.purple).lima().F(new J2.d("reschedule_needed", 0L));
                            return;
                        }
                        try {
                            i10 = Build.VERSION.SDK_INT;
                            if (i10 >= 31) {
                                i11 = 570425344;
                            } else {
                                i11 = 536870912;
                            }
                            Intent intent = new Intent();
                            intent.setComponent(new ComponentName(context, (Class<?>) ForceStopRunnable$BroadcastReceiver.class));
                            intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
                            broadcast = PendingIntent.getBroadcast(context, -1, intent, i11);
                        } catch (IllegalArgumentException e) {
                            e = e;
                            if (z.echo().alpha <= 5) {
                                Log.w(str3, "Ignoring exception", e);
                            }
                            z.echo().alpha(str3, "Application was force-stopped, rescheduling.");
                            wVar.india();
                            wVar.charlie.delta.getClass();
                            long currentTimeMillis = System.currentTimeMillis();
                            cVar.getClass();
                            ((WorkDatabase) cVar.purple).lima().F(new J2.d("last_force_stop_ms", Long.valueOf(currentTimeMillis)));
                            return;
                        } catch (SecurityException e4) {
                            e = e4;
                            if (z.echo().alpha <= 5) {
                            }
                            z.echo().alpha(str3, "Application was force-stopped, rescheduling.");
                            wVar.india();
                            wVar.charlie.delta.getClass();
                            long currentTimeMillis2 = System.currentTimeMillis();
                            cVar.getClass();
                            ((WorkDatabase) cVar.purple).lima().F(new J2.d("last_force_stop_ms", Long.valueOf(currentTimeMillis2)));
                            return;
                        }
                        if (i10 >= 30) {
                            if (broadcast != null) {
                                broadcast.cancel();
                            }
                            historicalProcessExitReasons = ((ActivityManager) context.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
                            if (historicalProcessExitReasons != null && !historicalProcessExitReasons.isEmpty()) {
                                Long E10 = ((WorkDatabase) cVar.purple).lima().E("last_force_stop_ms");
                                if (E10 != null) {
                                    j5 = E10.longValue();
                                }
                                for (int i14 = 0; i14 < historicalProcessExitReasons.size(); i14++) {
                                    ApplicationExitInfo delta = E0.e.delta(historicalProcessExitReasons.get(i14));
                                    reason = delta.getReason();
                                    if (reason == 10) {
                                        timestamp = delta.getTimestamp();
                                        if (timestamp >= j5) {
                                            z.echo().alpha(str3, "Application was force-stopped, rescheduling.");
                                            wVar.india();
                                            wVar.charlie.delta.getClass();
                                            long currentTimeMillis22 = System.currentTimeMillis();
                                            cVar.getClass();
                                            ((WorkDatabase) cVar.purple).lima().F(new J2.d("last_force_stop_ms", Long.valueOf(currentTimeMillis22)));
                                            return;
                                        }
                                    }
                                }
                            }
                            if (i5 == 0) {
                                z.echo().alpha(str3, "Found unfinished work, scheduling it.");
                                B2.k.bravo(wVar.charlie, wVar.delta, wVar.foxtrot);
                                return;
                            }
                            return;
                        }
                        if (broadcast == null) {
                            charlie(context);
                            z.echo().alpha(str3, "Application was force-stopped, rescheduling.");
                            wVar.india();
                            wVar.charlie.delta.getClass();
                            long currentTimeMillis222 = System.currentTimeMillis();
                            cVar.getClass();
                            ((WorkDatabase) cVar.purple).lima().F(new J2.d("last_force_stop_ms", Long.valueOf(currentTimeMillis222)));
                            return;
                        }
                        if (i5 == 0) {
                        }
                    } finally {
                        workDatabase_Impl2.kilo();
                    }
                } catch (Throwable th2) {
                    hVar.lima(alpha);
                    throw th2;
                }
            } finally {
                workDatabase.kilo();
            }
        } finally {
            mike.close();
            foxtrot2.golf();
        }
    }

    public final boolean bravo() {
        A2.a aVar = this.purple.charlie;
        aVar.getClass();
        boolean isEmpty = TextUtils.isEmpty(null);
        String str = teal;
        if (isEmpty) {
            z.echo().alpha(str, "The default process name was not specified.");
            return true;
        }
        boolean alpha = h.alpha(this.alpha, aVar);
        z.echo().alpha(str, "Is default app process = " + alpha);
        return alpha;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        Context context = this.alpha;
        String str2 = teal;
        w wVar = this.purple;
        try {
            if (!bravo()) {
                return;
            }
            while (true) {
                try {
                    AbstractC2737p0.bravo(context);
                    z.echo().alpha(str2, "Performing cleanup operations.");
                    try {
                        alpha();
                        return;
                    } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteFullException | SQLiteTableLockedException e) {
                        int i4 = this.silver + 1;
                        this.silver = i4;
                        if (i4 >= 3) {
                            if (V6.alpha(context)) {
                                str = "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.";
                            } else {
                                str = "WorkManager can't be accessed from direct boot, because credential encrypted storage isn't accessible.\nDon't access or initialise WorkManager from directAware components. See https://developer.android.com/training/articles/direct-boot";
                            }
                            z.echo().delta(str2, str, e);
                            IllegalStateException illegalStateException = new IllegalStateException(str, e);
                            wVar.charlie.getClass();
                            throw illegalStateException;
                        }
                        z.echo().bravo(str2, "Retrying after " + (i4 * 300), e);
                        try {
                            Thread.sleep(this.silver * 300);
                        } catch (InterruptedException unused) {
                        }
                    }
                } catch (SQLiteException e4) {
                    z.echo().charlie(str2, "Unexpected SQLite exception during migrations");
                    IllegalStateException illegalStateException2 = new IllegalStateException("Unexpected SQLite exception during migrations", e4);
                    wVar.charlie.getClass();
                    throw illegalStateException2;
                }
            }
        } finally {
            wVar.hotel();
        }
    }
}
