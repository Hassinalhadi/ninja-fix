package J2;

import android.database.Cursor;
import androidx.work.impl.WorkDatabase_Impl;
import com.clevertap.android.sdk.Constants;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import s6.G6;
import s6.Q5;

/* loaded from: classes3.dex */
public final class r {
    public final WorkDatabase_Impl alpha;
    public final b bravo;
    public final h charlie;
    public final h delta;
    public final h echo;
    public final h foxtrot;
    public final h golf;
    public final h hotel;
    public final h india;
    public final h juliet;
    public final h kilo;
    public final h lima;
    public final h mike;
    public final h november;
    public final h oscar;

    public r(WorkDatabase_Impl workDatabase_Impl) {
        this.alpha = workDatabase_Impl;
        this.bravo = new b(workDatabase_Impl, 5);
        this.charlie = new h(workDatabase_Impl, 12);
        this.delta = new h(workDatabase_Impl, 13);
        this.echo = new h(workDatabase_Impl, 14);
        this.foxtrot = new h(workDatabase_Impl, 15);
        this.golf = new h(workDatabase_Impl, 16);
        this.hotel = new h(workDatabase_Impl, 17);
        this.india = new h(workDatabase_Impl, 18);
        this.juliet = new h(workDatabase_Impl, 19);
        this.kilo = new h(workDatabase_Impl, 4);
        new h(workDatabase_Impl, 5);
        this.lima = new h(workDatabase_Impl, 6);
        this.mike = new h(workDatabase_Impl, 7);
        this.november = new h(workDatabase_Impl, 8);
        new h(workDatabase_Impl, 9);
        new h(workDatabase_Impl, 10);
        this.oscar = new h(workDatabase_Impl, 11);
    }

    public final void alpha(String str) {
        WorkDatabase_Impl workDatabase_Impl = this.alpha;
        workDatabase_Impl.bravo();
        h hVar = this.delta;
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

    public final ArrayList bravo() {
        l2.p pVar;
        int bravo;
        int bravo2;
        int bravo3;
        int bravo4;
        int bravo5;
        int bravo6;
        int bravo7;
        int bravo8;
        int bravo9;
        int bravo10;
        int bravo11;
        int bravo12;
        int bravo13;
        boolean z2;
        String string;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        l2.p foxtrot = l2.p.foxtrot(1, "SELECT * FROM workspec WHERE state=0 ORDER BY last_enqueue_time LIMIT ?");
        foxtrot.gold(1, 200);
        WorkDatabase_Impl workDatabase_Impl = this.alpha;
        workDatabase_Impl.bravo();
        Cursor mike = workDatabase_Impl.mike(foxtrot);
        try {
            bravo = G6.bravo(mike, Constants.KEY_ID);
            bravo2 = G6.bravo(mike, "state");
            bravo3 = G6.bravo(mike, "worker_class_name");
            bravo4 = G6.bravo(mike, "input_merger_class_name");
            bravo5 = G6.bravo(mike, "input");
            bravo6 = G6.bravo(mike, "output");
            bravo7 = G6.bravo(mike, "initial_delay");
            bravo8 = G6.bravo(mike, "interval_duration");
            bravo9 = G6.bravo(mike, "flex_duration");
            bravo10 = G6.bravo(mike, "run_attempt_count");
            bravo11 = G6.bravo(mike, "backoff_policy");
            bravo12 = G6.bravo(mike, "backoff_delay_duration");
            bravo13 = G6.bravo(mike, "last_enqueue_time");
            pVar = foxtrot;
        } catch (Throwable th) {
            th = th;
            pVar = foxtrot;
        }
        try {
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
                arrayList.add(new p(string2, foxtrot2, string3, string4, alpha, alpha2, j5, j6, j7, new A2.d(kilo, delta, z10, z11, z12, z13, j15, j16, Q5.alpha(mike.getBlob(i33))), i5, charlie, j10, j11, j12, j13, z2, echo, i16, i18, j14, i21, i23, str));
                bravo = i11;
                i4 = i10;
            }
            mike.close();
            pVar.golf();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            mike.close();
            pVar.golf();
            throw th;
        }
    }

    public final ArrayList charlie(int i4) {
        l2.p pVar;
        int bravo;
        int bravo2;
        int bravo3;
        int bravo4;
        int bravo5;
        int bravo6;
        int bravo7;
        int bravo8;
        int bravo9;
        int bravo10;
        int bravo11;
        int bravo12;
        int bravo13;
        boolean z2;
        String string;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        l2.p foxtrot = l2.p.foxtrot(1, "SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY last_enqueue_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND LENGTH(content_uri_triggers)=0 AND state NOT IN (2, 3, 5))");
        foxtrot.gold(1, i4);
        WorkDatabase_Impl workDatabase_Impl = this.alpha;
        workDatabase_Impl.bravo();
        Cursor mike = workDatabase_Impl.mike(foxtrot);
        try {
            bravo = G6.bravo(mike, Constants.KEY_ID);
            bravo2 = G6.bravo(mike, "state");
            bravo3 = G6.bravo(mike, "worker_class_name");
            bravo4 = G6.bravo(mike, "input_merger_class_name");
            bravo5 = G6.bravo(mike, "input");
            bravo6 = G6.bravo(mike, "output");
            bravo7 = G6.bravo(mike, "initial_delay");
            bravo8 = G6.bravo(mike, "interval_duration");
            bravo9 = G6.bravo(mike, "flex_duration");
            bravo10 = G6.bravo(mike, "run_attempt_count");
            bravo11 = G6.bravo(mike, "backoff_policy");
            bravo12 = G6.bravo(mike, "backoff_delay_duration");
            bravo13 = G6.bravo(mike, "last_enqueue_time");
            pVar = foxtrot;
        } catch (Throwable th) {
            th = th;
            pVar = foxtrot;
        }
        try {
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
            int i5 = bravo14;
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
                int i10 = mike.getInt(bravo10);
                int charlie = Q5.charlie(mike.getInt(bravo11));
                long j10 = mike.getLong(bravo12);
                long j11 = mike.getLong(bravo13);
                int i11 = i5;
                long j12 = mike.getLong(i11);
                int i12 = bravo;
                int i13 = bravo15;
                long j13 = mike.getLong(i13);
                bravo15 = i13;
                int i14 = bravo16;
                if (mike.getInt(i14) != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                bravo16 = i14;
                int i15 = bravo17;
                int echo = Q5.echo(mike.getInt(i15));
                bravo17 = i15;
                int i16 = bravo18;
                int i17 = mike.getInt(i16);
                bravo18 = i16;
                int i18 = bravo19;
                int i19 = mike.getInt(i18);
                bravo19 = i18;
                int i20 = bravo20;
                long j14 = mike.getLong(i20);
                bravo20 = i20;
                int i21 = bravo21;
                int i22 = mike.getInt(i21);
                bravo21 = i21;
                int i23 = bravo22;
                int i24 = mike.getInt(i23);
                bravo22 = i23;
                int i25 = bravo23;
                if (mike.isNull(i25)) {
                    string = null;
                } else {
                    string = mike.getString(i25);
                }
                String str = string;
                bravo23 = i25;
                int i26 = bravo24;
                int delta = Q5.delta(mike.getInt(i26));
                bravo24 = i26;
                int i27 = bravo25;
                K2.e kilo = Q5.kilo(mike.getBlob(i27));
                bravo25 = i27;
                int i28 = bravo26;
                if (mike.getInt(i28) != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                bravo26 = i28;
                int i29 = bravo27;
                if (mike.getInt(i29) != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                bravo27 = i29;
                int i30 = bravo28;
                if (mike.getInt(i30) != 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                bravo28 = i30;
                int i31 = bravo29;
                if (mike.getInt(i31) != 0) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                bravo29 = i31;
                int i32 = bravo30;
                long j15 = mike.getLong(i32);
                bravo30 = i32;
                int i33 = bravo31;
                long j16 = mike.getLong(i33);
                bravo31 = i33;
                int i34 = bravo32;
                bravo32 = i34;
                arrayList.add(new p(string2, foxtrot2, string3, string4, alpha, alpha2, j5, j6, j7, new A2.d(kilo, delta, z10, z11, z12, z13, j15, j16, Q5.alpha(mike.getBlob(i34))), i10, charlie, j10, j11, j12, j13, z2, echo, i17, i19, j14, i22, i24, str));
                bravo = i12;
                i5 = i11;
            }
            mike.close();
            pVar.golf();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            mike.close();
            pVar.golf();
            throw th;
        }
    }

    public final ArrayList delta() {
        l2.p pVar;
        boolean z2;
        String string;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        l2.p foxtrot = l2.p.foxtrot(0, "SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 AND LENGTH(content_uri_triggers)<>0 ORDER BY last_enqueue_time");
        WorkDatabase_Impl workDatabase_Impl = this.alpha;
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
            int bravo12 = G6.bravo(mike, "backoff_delay_duration");
            int bravo13 = G6.bravo(mike, "last_enqueue_time");
            pVar = foxtrot;
            try {
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
                    arrayList.add(new p(string2, foxtrot2, string3, string4, alpha, alpha2, j5, j6, j7, new A2.d(kilo, delta, z10, z11, z12, z13, j15, j16, Q5.alpha(mike.getBlob(i33))), i5, charlie, j10, j11, j12, j13, z2, echo, i16, i18, j14, i21, i23, str));
                    bravo = i11;
                    i4 = i10;
                }
                mike.close();
                pVar.golf();
                return arrayList;
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

    public final ArrayList echo() {
        l2.p pVar;
        boolean z2;
        String string;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        l2.p foxtrot = l2.p.foxtrot(0, "SELECT * FROM workspec WHERE state=1");
        WorkDatabase_Impl workDatabase_Impl = this.alpha;
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
            int bravo12 = G6.bravo(mike, "backoff_delay_duration");
            int bravo13 = G6.bravo(mike, "last_enqueue_time");
            pVar = foxtrot;
            try {
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
                    arrayList.add(new p(string2, foxtrot2, string3, string4, alpha, alpha2, j5, j6, j7, new A2.d(kilo, delta, z10, z11, z12, z13, j15, j16, Q5.alpha(mike.getBlob(i33))), i5, charlie, j10, j11, j12, j13, z2, echo, i16, i18, j14, i21, i23, str));
                    bravo = i11;
                    i4 = i10;
                }
                mike.close();
                pVar.golf();
                return arrayList;
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

    public final ArrayList foxtrot() {
        l2.p pVar;
        boolean z2;
        String string;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        l2.p foxtrot = l2.p.foxtrot(0, "SELECT * FROM workspec WHERE state=0 AND schedule_requested_at<>-1");
        WorkDatabase_Impl workDatabase_Impl = this.alpha;
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
            int bravo12 = G6.bravo(mike, "backoff_delay_duration");
            int bravo13 = G6.bravo(mike, "last_enqueue_time");
            pVar = foxtrot;
            try {
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
                    arrayList.add(new p(string2, foxtrot2, string3, string4, alpha, alpha2, j5, j6, j7, new A2.d(kilo, delta, z10, z11, z12, z13, j15, j16, Q5.alpha(mike.getBlob(i33))), i5, charlie, j10, j11, j12, j13, z2, echo, i16, i18, j14, i21, i23, str));
                    bravo = i11;
                    i4 = i10;
                }
                mike.close();
                pVar.golf();
                return arrayList;
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

    public final int golf(String str) {
        Integer valueOf;
        l2.p foxtrot = l2.p.foxtrot(1, "SELECT state FROM workspec WHERE id=?");
        foxtrot.oscar(1, str);
        WorkDatabase_Impl workDatabase_Impl = this.alpha;
        workDatabase_Impl.bravo();
        Cursor mike = workDatabase_Impl.mike(foxtrot);
        try {
            int i4 = 0;
            if (mike.moveToFirst()) {
                if (mike.isNull(0)) {
                    valueOf = null;
                } else {
                    valueOf = Integer.valueOf(mike.getInt(0));
                }
                if (valueOf != null) {
                    i4 = Q5.foxtrot(valueOf.intValue());
                }
            }
            return i4;
        } finally {
            mike.close();
            foxtrot.golf();
        }
    }

    public final p hotel(String str) {
        l2.p pVar;
        int bravo;
        int bravo2;
        int bravo3;
        int bravo4;
        int bravo5;
        int bravo6;
        int bravo7;
        int bravo8;
        int bravo9;
        int bravo10;
        int bravo11;
        int bravo12;
        int bravo13;
        boolean z2;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        l2.p foxtrot = l2.p.foxtrot(1, "SELECT * FROM workspec WHERE id=?");
        foxtrot.oscar(1, str);
        WorkDatabase_Impl workDatabase_Impl = this.alpha;
        workDatabase_Impl.bravo();
        Cursor mike = workDatabase_Impl.mike(foxtrot);
        try {
            bravo = G6.bravo(mike, Constants.KEY_ID);
            bravo2 = G6.bravo(mike, "state");
            bravo3 = G6.bravo(mike, "worker_class_name");
            bravo4 = G6.bravo(mike, "input_merger_class_name");
            bravo5 = G6.bravo(mike, "input");
            bravo6 = G6.bravo(mike, "output");
            bravo7 = G6.bravo(mike, "initial_delay");
            bravo8 = G6.bravo(mike, "interval_duration");
            bravo9 = G6.bravo(mike, "flex_duration");
            bravo10 = G6.bravo(mike, "run_attempt_count");
            bravo11 = G6.bravo(mike, "backoff_policy");
            bravo12 = G6.bravo(mike, "backoff_delay_duration");
            bravo13 = G6.bravo(mike, "last_enqueue_time");
            pVar = foxtrot;
        } catch (Throwable th) {
            th = th;
            pVar = foxtrot;
        }
        try {
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
            p pVar2 = null;
            String string = null;
            if (mike.moveToFirst()) {
                String string2 = mike.getString(bravo);
                int foxtrot2 = Q5.foxtrot(mike.getInt(bravo2));
                String string3 = mike.getString(bravo3);
                String string4 = mike.getString(bravo4);
                A2.j alpha = A2.j.alpha(mike.getBlob(bravo5));
                A2.j alpha2 = A2.j.alpha(mike.getBlob(bravo6));
                long j5 = mike.getLong(bravo7);
                long j6 = mike.getLong(bravo8);
                long j7 = mike.getLong(bravo9);
                int i4 = mike.getInt(bravo10);
                int charlie = Q5.charlie(mike.getInt(bravo11));
                long j10 = mike.getLong(bravo12);
                long j11 = mike.getLong(bravo13);
                long j12 = mike.getLong(bravo14);
                long j13 = mike.getLong(bravo15);
                if (mike.getInt(bravo16) != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                int echo = Q5.echo(mike.getInt(bravo17));
                int i5 = mike.getInt(bravo18);
                int i10 = mike.getInt(bravo19);
                long j14 = mike.getLong(bravo20);
                int i11 = mike.getInt(bravo21);
                int i12 = mike.getInt(bravo22);
                if (!mike.isNull(bravo23)) {
                    string = mike.getString(bravo23);
                }
                String str2 = string;
                int delta = Q5.delta(mike.getInt(bravo24));
                K2.e kilo = Q5.kilo(mike.getBlob(bravo25));
                if (mike.getInt(bravo26) != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (mike.getInt(bravo27) != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (mike.getInt(bravo28) != 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (mike.getInt(bravo29) != 0) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                pVar2 = new p(string2, foxtrot2, string3, string4, alpha, alpha2, j5, j6, j7, new A2.d(kilo, delta, z10, z11, z12, z13, mike.getLong(bravo30), mike.getLong(bravo31), Q5.alpha(mike.getBlob(bravo32))), i4, charlie, j10, j11, j12, j13, z2, echo, i5, i10, j14, i11, i12, str2);
            }
            mike.close();
            pVar.golf();
            return pVar2;
        } catch (Throwable th2) {
            th = th2;
            mike.close();
            pVar.golf();
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, J2.o] */
    public final ArrayList india(String str) {
        l2.p foxtrot = l2.p.foxtrot(1, "SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)");
        foxtrot.oscar(1, str);
        WorkDatabase_Impl workDatabase_Impl = this.alpha;
        workDatabase_Impl.bravo();
        Cursor mike = workDatabase_Impl.mike(foxtrot);
        try {
            ArrayList arrayList = new ArrayList(mike.getCount());
            while (mike.moveToNext()) {
                String id2 = mike.getString(0);
                int foxtrot2 = Q5.foxtrot(mike.getInt(1));
                Intrinsics.echo(id2, "id");
                ?? obj = new Object();
                obj.alpha = id2;
                obj.bravo = foxtrot2;
                arrayList.add(obj);
            }
            return arrayList;
        } finally {
            mike.close();
            foxtrot.golf();
        }
    }

    public final void juliet(long j5, String str) {
        WorkDatabase_Impl workDatabase_Impl = this.alpha;
        workDatabase_Impl.bravo();
        h hVar = this.mike;
        androidx.sqlite.db.framework.i alpha = hVar.alpha();
        alpha.gold(1, j5);
        alpha.oscar(2, str);
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

    public final void kilo(int i4, String str) {
        WorkDatabase_Impl workDatabase_Impl = this.alpha;
        workDatabase_Impl.bravo();
        h hVar = this.lima;
        androidx.sqlite.db.framework.i alpha = hVar.alpha();
        alpha.oscar(1, str);
        alpha.gold(2, i4);
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

    public final void lima(long j5, String str) {
        WorkDatabase_Impl workDatabase_Impl = this.alpha;
        workDatabase_Impl.bravo();
        h hVar = this.india;
        androidx.sqlite.db.framework.i alpha = hVar.alpha();
        alpha.gold(1, j5);
        alpha.oscar(2, str);
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

    public final void mike(String str, A2.j jVar) {
        WorkDatabase_Impl workDatabase_Impl = this.alpha;
        workDatabase_Impl.bravo();
        h hVar = this.hotel;
        androidx.sqlite.db.framework.i alpha = hVar.alpha();
        A2.j jVar2 = A2.j.bravo;
        alpha.ivory(1, V8.a.charlie(jVar));
        alpha.oscar(2, str);
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

    public final void november(int i4, String str) {
        WorkDatabase_Impl workDatabase_Impl = this.alpha;
        workDatabase_Impl.bravo();
        h hVar = this.echo;
        androidx.sqlite.db.framework.i alpha = hVar.alpha();
        alpha.gold(1, Q5.juliet(i4));
        alpha.oscar(2, str);
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

    public final void oscar(int i4, String str) {
        WorkDatabase_Impl workDatabase_Impl = this.alpha;
        workDatabase_Impl.bravo();
        h hVar = this.oscar;
        androidx.sqlite.db.framework.i alpha = hVar.alpha();
        alpha.gold(1, i4);
        alpha.oscar(2, str);
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
