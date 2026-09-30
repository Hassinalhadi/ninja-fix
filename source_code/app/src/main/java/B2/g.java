package B2;

import android.content.Context;
import android.content.SharedPreferences;
import m2.AbstractC2096a;

/* loaded from: classes3.dex */
public final class g extends AbstractC2096a {
    public final /* synthetic */ int charlie = 1;
    public final Context delta;

    public g(Context context, int i4, int i5) {
        super(i4, i5);
        this.delta = context;
    }

    @Override // m2.AbstractC2096a
    public final void alpha(androidx.sqlite.db.framework.b bVar) {
        Context context = this.delta;
        switch (this.charlie) {
            case 0:
                if (this.bravo >= 10) {
                    bVar.papa(new Object[]{"reschedule_needed", 1});
                    return;
                } else {
                    context.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
                    return;
                }
            default:
                bVar.juliet("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
                SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.preferences", 0);
                if (sharedPreferences.contains("reschedule_needed") || sharedPreferences.contains("last_cancel_all_time_ms")) {
                    long j5 = 0;
                    long j6 = sharedPreferences.getLong("last_cancel_all_time_ms", 0L);
                    if (sharedPreferences.getBoolean("reschedule_needed", false)) {
                        j5 = 1;
                    }
                    bVar.charlie();
                    try {
                        bVar.papa(new Object[]{"last_cancel_all_time_ms", Long.valueOf(j6)});
                        bVar.papa(new Object[]{"reschedule_needed", Long.valueOf(j5)});
                        sharedPreferences.edit().clear().apply();
                        bVar.blue();
                    } finally {
                    }
                }
                SharedPreferences sharedPreferences2 = context.getSharedPreferences("androidx.work.util.id", 0);
                if (sharedPreferences2.contains("next_job_scheduler_id") || sharedPreferences2.contains("next_job_scheduler_id")) {
                    int i4 = sharedPreferences2.getInt("next_job_scheduler_id", 0);
                    int i5 = sharedPreferences2.getInt("next_alarm_manager_id", 0);
                    bVar.charlie();
                    try {
                        bVar.papa(new Object[]{"next_job_scheduler_id", Integer.valueOf(i4)});
                        bVar.papa(new Object[]{"next_alarm_manager_id", Integer.valueOf(i5)});
                        sharedPreferences2.edit().clear().apply();
                        bVar.blue();
                        return;
                    } finally {
                    }
                }
                return;
        }
    }

    public g(Context context) {
        super(9, 10);
        this.delta = context;
    }
}
