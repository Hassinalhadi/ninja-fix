package K5;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.PersistableBundle;
import android.util.Base64;
import android.util.Log;
import com.clevertap.android.sdk.Constants;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Set;
import java.util.zip.Adler32;
import s6.D5;

/* loaded from: classes3.dex */
public final class d {
    public final Context alpha;
    public final L5.d bravo;
    public final b charlie;

    public d(Context context, L5.d dVar, b bVar) {
        this.alpha = context;
        this.bravo = dVar;
        this.charlie = bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00ba A[Catch: all -> 0x0178, TryCatch #0 {all -> 0x0178, blocks: (B:19:0x00b4, B:21:0x00ba, B:40:0x00c3), top: B:18:0x00b4 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c3 A[Catch: all -> 0x0178, TRY_LEAVE, TryCatch #0 {all -> 0x0178, blocks: (B:19:0x00b4, B:21:0x00ba, B:40:0x00c3), top: B:18:0x00b4 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void alpha(E5.i iVar, int i4, boolean z2) {
        char c3;
        int i5;
        Cursor rawQuery;
        Long l10;
        Set set;
        String india;
        char c4 = 4;
        Context context = this.alpha;
        ComponentName componentName = new ComponentName(context, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        Adler32 adler32 = new Adler32();
        adler32.update(context.getPackageName().getBytes(Charset.forName("UTF-8")));
        adler32.update(iVar.alpha.getBytes(Charset.forName("UTF-8")));
        ByteBuffer allocate = ByteBuffer.allocate(4);
        B5.d dVar = iVar.charlie;
        adler32.update(allocate.putInt(O5.a.alpha(dVar)).array());
        byte[] bArr = iVar.bravo;
        if (bArr != null) {
            adler32.update(bArr);
        }
        int value = (int) adler32.getValue();
        try {
            if (!z2) {
                for (JobInfo jobInfo : jobScheduler.getAllPendingJobs()) {
                    c3 = c4;
                    int i10 = jobInfo.getExtras().getInt("attemptNumber");
                    i5 = 3;
                    if (jobInfo.getId() == value) {
                        if (i10 >= i4) {
                            D5.foxtrot("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", iVar);
                            return;
                        }
                        SQLiteDatabase charlie = ((L5.h) this.bravo).charlie();
                        String valueOf = String.valueOf(O5.a.alpha(dVar));
                        String str = iVar.alpha;
                        rawQuery = charlie.rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{str, valueOf});
                        if (!rawQuery.moveToNext()) {
                            l10 = Long.valueOf(rawQuery.getLong(0));
                        } else {
                            l10 = 0L;
                        }
                        rawQuery.close();
                        long longValue = l10.longValue();
                        JobInfo.Builder builder = new JobInfo.Builder(value, componentName);
                        b bVar = this.charlie;
                        Long l11 = l10;
                        builder.setMinimumLatency(bVar.alpha(dVar, longValue, i4));
                        set = ((c) bVar.bravo.get(dVar)).charlie;
                        if (!set.contains(e.alpha)) {
                            builder.setRequiredNetworkType(2);
                        } else {
                            builder.setRequiredNetworkType(1);
                        }
                        if (set.contains(e.red)) {
                            builder.setRequiresCharging(true);
                        }
                        if (set.contains(e.purple)) {
                            builder.setRequiresDeviceIdle(true);
                        }
                        PersistableBundle persistableBundle = new PersistableBundle();
                        persistableBundle.putInt("attemptNumber", i4);
                        persistableBundle.putString("backendName", str);
                        persistableBundle.putInt(Constants.INAPP_PRIORITY, O5.a.alpha(dVar));
                        if (bArr != null) {
                            persistableBundle.putString("extras", Base64.encodeToString(bArr, 0));
                        }
                        builder.setExtras(persistableBundle);
                        Integer valueOf2 = Integer.valueOf(value);
                        Long valueOf3 = Long.valueOf(bVar.alpha(dVar, longValue, i4));
                        Integer valueOf4 = Integer.valueOf(i4);
                        Object[] objArr = new Object[5];
                        objArr[0] = iVar;
                        objArr[1] = valueOf2;
                        objArr[2] = valueOf3;
                        objArr[i5] = l11;
                        objArr[c3] = valueOf4;
                        india = D5.india("JobInfoScheduler");
                        if (Log.isLoggable(india, i5)) {
                            Log.d(india, String.format("Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", objArr));
                        }
                        jobScheduler.schedule(builder.build());
                        return;
                    }
                    c4 = c3;
                }
            }
            if (!rawQuery.moveToNext()) {
            }
            rawQuery.close();
            long longValue2 = l10.longValue();
            JobInfo.Builder builder2 = new JobInfo.Builder(value, componentName);
            b bVar2 = this.charlie;
            Long l112 = l10;
            builder2.setMinimumLatency(bVar2.alpha(dVar, longValue2, i4));
            set = ((c) bVar2.bravo.get(dVar)).charlie;
            if (!set.contains(e.alpha)) {
            }
            if (set.contains(e.red)) {
            }
            if (set.contains(e.purple)) {
            }
            PersistableBundle persistableBundle2 = new PersistableBundle();
            persistableBundle2.putInt("attemptNumber", i4);
            persistableBundle2.putString("backendName", str);
            persistableBundle2.putInt(Constants.INAPP_PRIORITY, O5.a.alpha(dVar));
            if (bArr != null) {
            }
            builder2.setExtras(persistableBundle2);
            Integer valueOf22 = Integer.valueOf(value);
            Long valueOf32 = Long.valueOf(bVar2.alpha(dVar, longValue2, i4));
            Integer valueOf42 = Integer.valueOf(i4);
            Object[] objArr2 = new Object[5];
            objArr2[0] = iVar;
            objArr2[1] = valueOf22;
            objArr2[2] = valueOf32;
            objArr2[i5] = l112;
            objArr2[c3] = valueOf42;
            india = D5.india("JobInfoScheduler");
            if (Log.isLoggable(india, i5)) {
            }
            jobScheduler.schedule(builder2.build());
            return;
        } catch (Throwable th) {
            rawQuery.close();
            throw th;
        }
        c3 = c4;
        i5 = 3;
        SQLiteDatabase charlie2 = ((L5.h) this.bravo).charlie();
        String valueOf5 = String.valueOf(O5.a.alpha(dVar));
        String str2 = iVar.alpha;
        rawQuery = charlie2.rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{str2, valueOf5});
    }
}
