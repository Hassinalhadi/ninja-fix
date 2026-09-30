package D2;

import A2.z;
import K2.k;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.background.systemalarm.SystemAlarmService;

/* loaded from: classes3.dex */
public final class h implements Runnable {
    public final /* synthetic */ int alpha;
    public final j purple;

    public /* synthetic */ h(j jVar, int i4) {
        this.alpha = i4;
        this.purple = jVar;
    }

    private final void alpha() {
        synchronized (this.purple.yellow) {
            j jVar = this.purple;
            jVar.f942a = (Intent) jVar.yellow.get(0);
        }
        Intent intent = this.purple.f942a;
        if (intent != null) {
            String action = intent.getAction();
            int intExtra = this.purple.f942a.getIntExtra("KEY_START_ID", 0);
            z echo = z.echo();
            String str = j.f941d;
            echo.alpha(str, "Processing command " + this.purple.f942a + ", " + intExtra);
            PowerManager.WakeLock alpha = k.alpha(this.purple.alpha, action + " (" + intExtra + ")");
            try {
                z.echo().alpha(str, "Acquiring operation wake lock (" + action + ") " + alpha);
                alpha.acquire();
                j jVar2 = this.purple;
                jVar2.white.bravo(jVar2.f942a, intExtra, jVar2);
                z.echo().alpha(str, "Releasing operation wake lock (" + action + ") " + alpha);
                alpha.release();
                j jVar3 = this.purple;
                ((L2.c) jVar3.purple).delta.execute(new h(jVar3, 1));
            } catch (Throwable th) {
                try {
                    z echo2 = z.echo();
                    String str2 = j.f941d;
                    echo2.delta(str2, "Unexpected error in onHandleIntent", th);
                    z.echo().alpha(str2, "Releasing operation wake lock (" + action + ") " + alpha);
                    alpha.release();
                    j jVar4 = this.purple;
                    ((L2.c) jVar4.purple).delta.execute(new h(jVar4, 1));
                } catch (Throwable th2) {
                    z.echo().alpha(j.f941d, "Releasing operation wake lock (" + action + ") " + alpha);
                    alpha.release();
                    j jVar5 = this.purple;
                    ((L2.c) jVar5.purple).delta.execute(new h(jVar5, 1));
                    throw th2;
                }
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.alpha) {
            case 0:
                alpha();
                return;
            default:
                j jVar = this.purple;
                jVar.getClass();
                z echo = z.echo();
                String str = j.f941d;
                echo.alpha(str, "Checking if commands are complete.");
                j.bravo();
                synchronized (jVar.yellow) {
                    try {
                        if (jVar.f942a != null) {
                            z.echo().alpha(str, "Removing command " + jVar.f942a);
                            if (((Intent) jVar.yellow.remove(0)).equals(jVar.f942a)) {
                                jVar.f942a = null;
                            } else {
                                throw new IllegalStateException("Dequeue-d command is not the first.");
                            }
                        }
                        K2.i iVar = ((L2.c) jVar.purple).alpha;
                        if (!jVar.white.alpha() && jVar.yellow.isEmpty() && !iVar.charlie()) {
                            z.echo().alpha(str, "No more commands & intents.");
                            SystemAlarmService systemAlarmService = jVar.f943b;
                            if (systemAlarmService != null) {
                                systemAlarmService.alpha();
                            }
                        } else if (!jVar.yellow.isEmpty()) {
                            jVar.echo();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
        }
    }
}
