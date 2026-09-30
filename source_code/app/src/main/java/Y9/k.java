package Y9;

import J8.B;
import Xd.p;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.tasks.Task;
import delivery.samurai.android.services.CaptainLocationMonitoringService;
import java.util.concurrent.atomic.AtomicBoolean;
import k3.C2004c;
import kotlin.jvm.functions.Function1;

/* loaded from: classes2.dex */
public final class k {
    public static final AtomicBoolean kilo = new AtomicBoolean(false);
    public final Context alpha;
    public Task bravo;
    public CaptainLocationMonitoringService charlie;
    public boolean delta;
    public Function1 foxtrot;
    public i golf;
    public R9.g hotel;
    public i india;
    public final Handler echo = new Handler(Looper.getMainLooper());
    public final B juliet = new B(1, this);

    public k(Context context) {
        this.alpha = context;
    }

    public static void charlie(k3.f fVar, p pVar) {
        pVar.invoke(Boolean.valueOf(fVar instanceof C2004c), fVar.charlie(), fVar.bravo(), fVar.delta(), fVar.echo(), fVar.alpha());
    }

    public final void alpha() {
        this.foxtrot = null;
        i iVar = this.golf;
        if (iVar != null) {
            this.echo.removeCallbacks(iVar);
        }
        this.golf = null;
    }

    public final void bravo() {
        this.hotel = null;
        i iVar = this.india;
        if (iVar != null) {
            this.echo.removeCallbacks(iVar);
        }
        this.india = null;
    }

    public final void delta() {
        Context context = this.alpha;
        Intent intent = new Intent(context, (Class<?>) CaptainLocationMonitoringService.class);
        if (!this.delta) {
            context.bindService(intent, this.juliet, 1);
        }
    }
}
