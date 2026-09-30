package J2;

import A2.aj;
import androidx.work.impl.WorkDatabase;
import kotlin.NoWhenBranchMatchedException;
import s6.Q5;

/* loaded from: classes3.dex */
public final class b extends aj {
    public final /* synthetic */ int echo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(WorkDatabase workDatabase, int i4) {
        super(workDatabase);
        this.echo = i4;
    }

    @Override // A2.aj
    public final String echo() {
        switch (this.echo) {
            case 0:
                return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
            case 1:
                return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
            case 2:
                return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`generation`,`system_id`) VALUES (?,?,?)";
            case 3:
                return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
            case 4:
                return "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
            case 5:
                return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`next_schedule_time_override`,`next_schedule_time_override_generation`,`stop_reason`,`trace_tag`,`required_network_type`,`required_network_request`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            default:
                return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
        }
    }

    public final void november(androidx.sqlite.db.framework.i iVar, Object obj) {
        int i4;
        int i5 = 1;
        switch (this.echo) {
            case 0:
                a aVar = (a) obj;
                iVar.oscar(1, aVar.alpha);
                iVar.oscar(2, aVar.bravo);
                return;
            case 1:
                d dVar = (d) obj;
                iVar.oscar(1, dVar.alpha);
                iVar.gold(2, dVar.bravo.longValue());
                return;
            case 2:
                iVar.oscar(1, ((g) obj).alpha);
                iVar.gold(2, r8.bravo);
                iVar.gold(3, r8.charlie);
                return;
            case 3:
                k kVar = (k) obj;
                iVar.oscar(1, kVar.alpha);
                iVar.oscar(2, kVar.bravo);
                return;
            case 4:
                m mVar = (m) obj;
                iVar.oscar(1, mVar.alpha);
                A2.j jVar = A2.j.bravo;
                iVar.ivory(2, V8.a.charlie(mVar.bravo));
                return;
            case 5:
                p pVar = (p) obj;
                iVar.oscar(1, pVar.alpha);
                iVar.gold(2, Q5.juliet(pVar.bravo));
                iVar.oscar(3, pVar.charlie);
                iVar.oscar(4, pVar.delta);
                A2.j jVar2 = A2.j.bravo;
                iVar.ivory(5, V8.a.charlie(pVar.echo));
                iVar.ivory(6, V8.a.charlie(pVar.foxtrot));
                iVar.gold(7, pVar.golf);
                iVar.gold(8, pVar.hotel);
                iVar.gold(9, pVar.india);
                iVar.gold(10, pVar.kilo);
                int i10 = pVar.lima;
                com.google.android.material.datepicker.j.papa(i10, "backoffPolicy");
                int mike = av.q.mike(i10);
                if (mike != 0) {
                    if (mike == 1) {
                        i4 = 1;
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                } else {
                    i4 = 0;
                }
                iVar.gold(11, i4);
                iVar.gold(12, pVar.mike);
                iVar.gold(13, pVar.november);
                iVar.gold(14, pVar.oscar);
                iVar.gold(15, pVar.papa);
                iVar.gold(16, pVar.quebec ? 1L : 0L);
                int i11 = pVar.romeo;
                com.google.android.material.datepicker.j.papa(i11, "policy");
                int mike2 = av.q.mike(i11);
                if (mike2 != 0) {
                    if (mike2 != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                } else {
                    i5 = 0;
                }
                iVar.gold(17, i5);
                iVar.gold(18, pVar.sierra);
                iVar.gold(19, pVar.tango);
                iVar.gold(20, pVar.uniform);
                iVar.gold(21, pVar.victor);
                iVar.gold(22, pVar.whiskey);
                String str = pVar.xray;
                if (str == null) {
                    iVar.b(23);
                } else {
                    iVar.oscar(23, str);
                }
                A2.d dVar2 = pVar.juliet;
                iVar.gold(24, Q5.golf(dVar2.alpha));
                iVar.ivory(25, Q5.bravo(dVar2.bravo));
                iVar.gold(26, dVar2.charlie ? 1L : 0L);
                iVar.gold(27, dVar2.delta ? 1L : 0L);
                iVar.gold(28, dVar2.echo ? 1L : 0L);
                iVar.gold(29, dVar2.foxtrot ? 1L : 0L);
                iVar.gold(30, dVar2.golf);
                iVar.gold(31, dVar2.hotel);
                iVar.ivory(32, Q5.hotel(dVar2.india));
                return;
            default:
                s sVar = (s) obj;
                iVar.oscar(1, sVar.alpha);
                iVar.oscar(2, sVar.bravo);
                return;
        }
    }

    public final void oscar(Object obj) {
        androidx.sqlite.db.framework.i alpha = alpha();
        try {
            november(alpha, obj);
            alpha.purple.executeInsert();
        } finally {
            lima(alpha);
        }
    }
}
