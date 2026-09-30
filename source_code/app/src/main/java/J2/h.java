package J2;

import A2.aj;
import androidx.work.impl.WorkDatabase;
import kotlin.NoWhenBranchMatchedException;
import s6.Q5;

/* loaded from: classes3.dex */
public final class h extends aj {
    public final /* synthetic */ int echo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(WorkDatabase workDatabase, int i4) {
        super(workDatabase);
        this.echo = i4;
    }

    @Override // A2.aj
    public final String echo() {
        switch (this.echo) {
            case 0:
                return "DELETE FROM SystemIdInfo where work_spec_id=? AND generation=?";
            case 1:
                return "DELETE FROM SystemIdInfo where work_spec_id=?";
            case 2:
                return "DELETE from WorkProgress where work_spec_id=?";
            case 3:
                return "DELETE FROM WorkProgress";
            case 4:
                return "UPDATE workspec SET run_attempt_count=0 WHERE id=?";
            case 5:
                return "UPDATE workspec SET next_schedule_time_override=? WHERE id=?";
            case 6:
                return "UPDATE workspec SET next_schedule_time_override=9223372036854775807 WHERE (id=? AND next_schedule_time_override_generation=?)";
            case 7:
                return "UPDATE workspec SET schedule_requested_at=? WHERE id=?";
            case 8:
                return "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";
            case 9:
                return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
            case 10:
                return "UPDATE workspec SET generation=generation+1 WHERE id=?";
            case 11:
                return "UPDATE workspec SET stop_reason=? WHERE id=?";
            case 12:
                return "UPDATE OR ABORT `WorkSpec` SET `id` = ?,`state` = ?,`worker_class_name` = ?,`input_merger_class_name` = ?,`input` = ?,`output` = ?,`initial_delay` = ?,`interval_duration` = ?,`flex_duration` = ?,`run_attempt_count` = ?,`backoff_policy` = ?,`backoff_delay_duration` = ?,`last_enqueue_time` = ?,`minimum_retention_duration` = ?,`schedule_requested_at` = ?,`run_in_foreground` = ?,`out_of_quota_policy` = ?,`period_count` = ?,`generation` = ?,`next_schedule_time_override` = ?,`next_schedule_time_override_generation` = ?,`stop_reason` = ?,`trace_tag` = ?,`required_network_type` = ?,`required_network_request` = ?,`requires_charging` = ?,`requires_device_idle` = ?,`requires_battery_not_low` = ?,`requires_storage_not_low` = ?,`trigger_content_update_delay` = ?,`trigger_max_content_delay` = ?,`content_uri_triggers` = ? WHERE `id` = ?";
            case 13:
                return "DELETE FROM workspec WHERE id=?";
            case 14:
                return "UPDATE workspec SET state=? WHERE id=?";
            case 15:
                return "UPDATE workspec SET stop_reason = CASE WHEN state=1 THEN 1 ELSE -256 END, state=5 WHERE id=?";
            case 16:
                return "UPDATE workspec SET period_count=period_count+1 WHERE id=?";
            case 17:
                return "UPDATE workspec SET output=? WHERE id=?";
            case 18:
                return "UPDATE workspec SET last_enqueue_time=? WHERE id=?";
            case 19:
                return "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?";
            default:
                return "DELETE FROM worktag WHERE work_spec_id=?";
        }
    }

    public void november(androidx.sqlite.db.framework.i iVar, Object obj) {
        int i4;
        p pVar = (p) obj;
        int i5 = 1;
        String str = pVar.alpha;
        iVar.oscar(1, str);
        iVar.gold(2, Q5.juliet(pVar.bravo));
        iVar.oscar(3, pVar.charlie);
        iVar.oscar(4, pVar.delta);
        A2.j jVar = A2.j.bravo;
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
        String str2 = pVar.xray;
        if (str2 == null) {
            iVar.b(23);
        } else {
            iVar.oscar(23, str2);
        }
        A2.d dVar = pVar.juliet;
        iVar.gold(24, Q5.golf(dVar.alpha));
        iVar.ivory(25, Q5.bravo(dVar.bravo));
        iVar.gold(26, dVar.charlie ? 1L : 0L);
        iVar.gold(27, dVar.delta ? 1L : 0L);
        iVar.gold(28, dVar.echo ? 1L : 0L);
        iVar.gold(29, dVar.foxtrot ? 1L : 0L);
        iVar.gold(30, dVar.golf);
        iVar.gold(31, dVar.hotel);
        iVar.ivory(32, Q5.hotel(dVar.india));
        iVar.oscar(33, str);
    }
}
