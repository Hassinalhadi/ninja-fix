package p3;

import android.location.Location;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import s6.M4;

/* renamed from: p3.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C2274f implements G6.e, OnFailureListener {
    public final /* synthetic */ ab alpha;

    public /* synthetic */ C2274f(ab abVar) {
        this.alpha = abVar;
    }

    @Override // G6.e
    public void onComplete(Task lastTask) {
        Location location;
        Intrinsics.echo(lastTask, "lastTask");
        if (lastTask.juliet() && (location = (Location) lastTask.hotel()) != null) {
            ae aeVar = ae.silver;
            ab abVar = this.alpha;
            M4 bravo = ab.bravo(abVar, location, aeVar);
            boolean z2 = bravo instanceof g3.x;
            C2272d c2272d = abVar.alpha;
            if (z2) {
                c2272d.charlie.alpha("LocationFlow", "[COLD_START] Cached location rejected: " + ((g3.x) bravo).bravo);
                return;
            }
            if (bravo instanceof g3.y) {
                String locationsTopic = c2272d.echo.getLocationsTopic();
                if (locationsTopic == null) {
                    return;
                }
                abVar.echo.charlie(location, locationsTopic, c2272d.delta.toPayload(location), aeVar, new n(abVar, location, 0), new C2277i(abVar, 1));
                return;
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception e) {
        Intrinsics.echo(e, "e");
        this.alpha.alpha.charlie.alpha("LocationFlow", "Failed to get last-known location: " + e.getMessage());
    }
}
