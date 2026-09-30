package R9;

import G6.q;
import android.location.Location;
import com.google.android.gms.tasks.Task;
import kotlin.jvm.internal.Intrinsics;
import s6.AbstractC2744p7;
import z3.C3462a;

/* loaded from: classes2.dex */
public final /* synthetic */ class l implements G6.e {
    public final /* synthetic */ int alpha = 1;
    public final /* synthetic */ long purple;
    public final /* synthetic */ String red;

    public /* synthetic */ l(long j5, String str) {
        this.purple = j5;
        this.red = str;
    }

    @Override // G6.e
    public final void onComplete(Task task) {
        Location location;
        Location location2;
        String str;
        String echo;
        switch (this.alpha) {
            case 0:
                Intrinsics.echo(task, "task");
                if (task.juliet()) {
                    location = (Location) task.hotel();
                } else {
                    location = null;
                }
                C3462a.alpha("LocationFlow", 12, "LOCATION_SNAPSHOT id=" + this.red + " lastLocation: " + AbstractC2744p7.charlie(location, this.purple), null);
                return;
            default:
                long j5 = this.purple;
                String str2 = this.red;
                Intrinsics.echo(task, "task");
                if (task.juliet()) {
                    location2 = (Location) task.hotel();
                } else {
                    location2 = null;
                }
                long currentTimeMillis = System.currentTimeMillis() - j5;
                if (location2 != null) {
                    echo = "FRESH_FIX";
                } else if (task.juliet()) {
                    echo = "NULL_RESULT";
                } else if (((q) task).delta) {
                    echo = "CANCELED";
                } else {
                    Exception golf = task.golf();
                    if (golf != null) {
                        str = golf.getClass().getSimpleName();
                    } else {
                        str = null;
                    }
                    echo = av.q.echo("ERROR:", str);
                }
                String charlie = AbstractC2744p7.charlie(location2, j5);
                StringBuilder india = av.q.india("LOCATION_SNAPSHOT id=", str2, " getCurrentLocation: outcome=", echo, " waitMs=");
                india.append(currentTimeMillis);
                india.append(" ");
                india.append(charlie);
                C3462a.alpha("LocationFlow", 12, india.toString(), null);
                C3462a.alpha("LocationFlow", 12, "LOCATION_SNAPSHOT_END id=".concat(str2), null);
                return;
        }
    }

    public /* synthetic */ l(String str, long j5) {
        this.red = str;
        this.purple = j5;
    }
}
