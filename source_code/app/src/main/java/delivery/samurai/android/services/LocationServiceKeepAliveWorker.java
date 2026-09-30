package delivery.samurai.android.services;

import A2.w;
import A2.x;
import Y9.l;
import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import t6.AbstractC3016k2;
import t6.AbstractC3026m2;
import t6.AbstractC3031n2;
import z3.C3462a;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ldelivery/samurai/android/services/LocationServiceKeepAliveWorker;", "Landroidx/work/Worker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "app_ProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class LocationServiceKeepAliveWorker extends Worker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocationServiceKeepAliveWorker(@NotNull Context context, @NotNull WorkerParameters params) {
        super(context, params);
        Intrinsics.echo(context, "context");
        Intrinsics.echo(params, "params");
    }

    @Override // androidx.work.Worker
    public final x doWork() {
        Context applicationContext = getApplicationContext();
        Intrinsics.delta(applicationContext, "getApplicationContext(...)");
        boolean z2 = CaptainLocationMonitoringService.f12066D;
        if (!AbstractC3016k2.bravo(applicationContext)) {
            C3462a.alpha("LocationFlow", 12, "🧰 [BACKSTOP] service disabled — cancelling keep-alive work", null);
            AbstractC3031n2.alpha(applicationContext);
            return new w();
        }
        boolean charlie = l.charlie(applicationContext, "workmanager_backstop", false);
        if (charlie) {
            AbstractC3026m2.bravo(applicationContext, "workmanager_backstop");
        }
        C3462a.alpha("LocationFlow", 12, "🧰 [BACKSTOP] periodic keep-alive — restartedService=" + charlie, null);
        return new w();
    }
}
