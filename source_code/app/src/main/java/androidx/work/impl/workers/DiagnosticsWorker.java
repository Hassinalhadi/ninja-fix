package androidx.work.impl.workers;

import A2.x;
import A2.z;
import B2.w;
import J2.l;
import J2.r;
import J2.t;
import android.content.Context;
import android.database.Cursor;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import com.clevertap.android.sdk.Constants;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l2.p;
import org.jetbrains.annotations.NotNull;
import s6.G6;
import s6.Q5;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/work/impl/workers/DiagnosticsWorker;", "Landroidx/work/Worker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "parameters", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DiagnosticsWorker extends Worker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiagnosticsWorker(@NotNull Context context, @NotNull WorkerParameters parameters) {
        super(context, parameters);
        Intrinsics.echo(context, "context");
        Intrinsics.echo(parameters, "parameters");
    }

    @Override // androidx.work.Worker
    public final x doWork() {
        p pVar;
        J2.i iVar;
        l lVar;
        t tVar;
        boolean z2;
        String string;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        w golf = w.golf(getApplicationContext());
        WorkDatabase workDatabase = golf.delta;
        Intrinsics.delta(workDatabase, "workManager.workDatabase");
        r uniform = workDatabase.uniform();
        l sierra = workDatabase.sierra();
        t victor = workDatabase.victor();
        J2.i quebec = workDatabase.quebec();
        golf.charlie.delta.getClass();
        long currentTimeMillis = System.currentTimeMillis() - TimeUnit.DAYS.toMillis(1L);
        uniform.getClass();
        p foxtrot = p.foxtrot(1, "SELECT * FROM workspec WHERE last_enqueue_time >= ? AND state IN (2, 3, 5) ORDER BY last_enqueue_time DESC");
        foxtrot.gold(1, currentTimeMillis);
        WorkDatabase_Impl workDatabase_Impl = uniform.alpha;
        workDatabase_Impl.bravo();
        Cursor mike = workDatabase_Impl.mike(foxtrot);
        try {
            int bravo = G6.bravo(mike, Constants.KEY_ID);
            int bravo2 = G6.bravo(mike, "state");
            int bravo3 = G6.bravo(mike, "worker_class_name");
            int bravo4 = G6.bravo(mike, "input_merger_class_name");
            int bravo5 = G6.bravo(mike, "input");
            int bravo6 = G6.bravo(mike, "output");
            int bravo7 = G6.bravo(mike, "initial_delay");
            int bravo8 = G6.bravo(mike, "interval_duration");
            int bravo9 = G6.bravo(mike, "flex_duration");
            int bravo10 = G6.bravo(mike, "run_attempt_count");
            int bravo11 = G6.bravo(mike, "backoff_policy");
            pVar = foxtrot;
            try {
                int bravo12 = G6.bravo(mike, "backoff_delay_duration");
                int bravo13 = G6.bravo(mike, "last_enqueue_time");
                int bravo14 = G6.bravo(mike, "minimum_retention_duration");
                int bravo15 = G6.bravo(mike, "schedule_requested_at");
                int bravo16 = G6.bravo(mike, "run_in_foreground");
                int bravo17 = G6.bravo(mike, "out_of_quota_policy");
                int bravo18 = G6.bravo(mike, "period_count");
                int bravo19 = G6.bravo(mike, "generation");
                int bravo20 = G6.bravo(mike, "next_schedule_time_override");
                int bravo21 = G6.bravo(mike, "next_schedule_time_override_generation");
                int bravo22 = G6.bravo(mike, "stop_reason");
                int bravo23 = G6.bravo(mike, "trace_tag");
                int bravo24 = G6.bravo(mike, "required_network_type");
                int bravo25 = G6.bravo(mike, "required_network_request");
                int bravo26 = G6.bravo(mike, "requires_charging");
                int bravo27 = G6.bravo(mike, "requires_device_idle");
                int bravo28 = G6.bravo(mike, "requires_battery_not_low");
                int bravo29 = G6.bravo(mike, "requires_storage_not_low");
                int bravo30 = G6.bravo(mike, "trigger_content_update_delay");
                int bravo31 = G6.bravo(mike, "trigger_max_content_delay");
                int bravo32 = G6.bravo(mike, "content_uri_triggers");
                int i4 = bravo14;
                ArrayList arrayList = new ArrayList(mike.getCount());
                while (mike.moveToNext()) {
                    String string2 = mike.getString(bravo);
                    int foxtrot2 = Q5.foxtrot(mike.getInt(bravo2));
                    String string3 = mike.getString(bravo3);
                    String string4 = mike.getString(bravo4);
                    A2.j alpha = A2.j.alpha(mike.getBlob(bravo5));
                    A2.j alpha2 = A2.j.alpha(mike.getBlob(bravo6));
                    long j5 = mike.getLong(bravo7);
                    long j6 = mike.getLong(bravo8);
                    long j7 = mike.getLong(bravo9);
                    int i5 = mike.getInt(bravo10);
                    int charlie = Q5.charlie(mike.getInt(bravo11));
                    long j10 = mike.getLong(bravo12);
                    long j11 = mike.getLong(bravo13);
                    int i10 = i4;
                    long j12 = mike.getLong(i10);
                    int i11 = bravo;
                    int i12 = bravo15;
                    long j13 = mike.getLong(i12);
                    bravo15 = i12;
                    int i13 = bravo16;
                    if (mike.getInt(i13) != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    bravo16 = i13;
                    int i14 = bravo17;
                    int echo = Q5.echo(mike.getInt(i14));
                    bravo17 = i14;
                    int i15 = bravo18;
                    int i16 = mike.getInt(i15);
                    bravo18 = i15;
                    int i17 = bravo19;
                    int i18 = mike.getInt(i17);
                    bravo19 = i17;
                    int i19 = bravo20;
                    long j14 = mike.getLong(i19);
                    bravo20 = i19;
                    int i20 = bravo21;
                    int i21 = mike.getInt(i20);
                    bravo21 = i20;
                    int i22 = bravo22;
                    int i23 = mike.getInt(i22);
                    bravo22 = i22;
                    int i24 = bravo23;
                    if (mike.isNull(i24)) {
                        string = null;
                    } else {
                        string = mike.getString(i24);
                    }
                    String str = string;
                    bravo23 = i24;
                    int i25 = bravo24;
                    int delta = Q5.delta(mike.getInt(i25));
                    bravo24 = i25;
                    int i26 = bravo25;
                    K2.e kilo = Q5.kilo(mike.getBlob(i26));
                    bravo25 = i26;
                    int i27 = bravo26;
                    if (mike.getInt(i27) != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    bravo26 = i27;
                    int i28 = bravo27;
                    if (mike.getInt(i28) != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    bravo27 = i28;
                    int i29 = bravo28;
                    if (mike.getInt(i29) != 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    bravo28 = i29;
                    int i30 = bravo29;
                    if (mike.getInt(i30) != 0) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    bravo29 = i30;
                    int i31 = bravo30;
                    long j15 = mike.getLong(i31);
                    bravo30 = i31;
                    int i32 = bravo31;
                    long j16 = mike.getLong(i32);
                    bravo31 = i32;
                    int i33 = bravo32;
                    bravo32 = i33;
                    arrayList.add(new J2.p(string2, foxtrot2, string3, string4, alpha, alpha2, j5, j6, j7, new A2.d(kilo, delta, z10, z11, z12, z13, j15, j16, Q5.alpha(mike.getBlob(i33))), i5, charlie, j10, j11, j12, j13, z2, echo, i16, i18, j14, i21, i23, str));
                    bravo = i11;
                    i4 = i10;
                }
                mike.close();
                pVar.golf();
                ArrayList echo2 = uniform.echo();
                ArrayList bravo33 = uniform.bravo();
                if (!arrayList.isEmpty()) {
                    z echo3 = z.echo();
                    String str2 = k.alpha;
                    echo3.foxtrot(str2, "Recently completed work:\n\n");
                    iVar = quebec;
                    lVar = sierra;
                    tVar = victor;
                    z.echo().foxtrot(str2, k.alpha(lVar, tVar, iVar, arrayList));
                } else {
                    iVar = quebec;
                    lVar = sierra;
                    tVar = victor;
                }
                if (!echo2.isEmpty()) {
                    z echo4 = z.echo();
                    String str3 = k.alpha;
                    echo4.foxtrot(str3, "Running work:\n\n");
                    z.echo().foxtrot(str3, k.alpha(lVar, tVar, iVar, echo2));
                }
                if (!bravo33.isEmpty()) {
                    z echo5 = z.echo();
                    String str4 = k.alpha;
                    echo5.foxtrot(str4, "Enqueued work:\n\n");
                    z.echo().foxtrot(str4, k.alpha(lVar, tVar, iVar, bravo33));
                }
                return new A2.w();
            } catch (Throwable th) {
                th = th;
                mike.close();
                pVar.golf();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            pVar = foxtrot;
        }
    }
}
