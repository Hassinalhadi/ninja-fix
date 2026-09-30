package D2;

import A2.z;
import B2.w;
import K2.k;
import K2.s;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class j implements B2.c {

    /* renamed from: d, reason: collision with root package name */
    public static final String f941d = z.golf("SystemAlarmDispatcher");

    /* renamed from: a, reason: collision with root package name */
    public Intent f942a;
    public final Context alpha;

    /* renamed from: b, reason: collision with root package name */
    public SystemAlarmService f943b;

    /* renamed from: c, reason: collision with root package name */
    public final J2.e f944c;
    public final L2.a purple;
    public final s red;
    public final B2.f silver;
    public final w teal;
    public final b white;
    public final ArrayList yellow;

    public j(SystemAlarmService systemAlarmService) {
        Context applicationContext = systemAlarmService.getApplicationContext();
        this.alpha = applicationContext;
        J2.c cVar = new J2.c(new A2.h(1));
        w golf = w.golf(systemAlarmService);
        this.teal = golf;
        A2.a aVar = golf.charlie;
        this.white = new b(applicationContext, aVar.delta, cVar);
        this.red = new s(aVar.golf);
        B2.f fVar = golf.golf;
        this.silver = fVar;
        L2.a aVar2 = golf.echo;
        this.purple = aVar2;
        this.f944c = new J2.e(fVar, aVar2);
        fVar.alpha(this);
        this.yellow = new ArrayList();
        this.f942a = null;
    }

    public static void bravo() {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
        } else {
            throw new IllegalStateException("Needs to be invoked on the main thread.");
        }
    }

    public final void alpha(Intent intent, int i4) {
        z echo = z.echo();
        String str = f941d;
        echo.alpha(str, "Adding command " + intent + " (" + i4 + ")");
        bravo();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            z.echo().hotel(str, "Unknown command. Ignoring");
            return;
        }
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action) && delta()) {
            return;
        }
        intent.putExtra("KEY_START_ID", i4);
        synchronized (this.yellow) {
            try {
                boolean isEmpty = this.yellow.isEmpty();
                this.yellow.add(intent);
                if (isEmpty) {
                    echo();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // B2.c
    public final void charlie(J2.j jVar, boolean z2) {
        L2.b bVar = ((L2.c) this.purple).delta;
        String str = b.white;
        Intent intent = new Intent(this.alpha, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_NEEDS_RESCHEDULE", z2);
        b.echo(intent, jVar);
        bVar.execute(new i(0, 0, this, intent));
    }

    public final boolean delta() {
        bravo();
        synchronized (this.yellow) {
            try {
                Iterator it = this.yellow.iterator();
                while (it.hasNext()) {
                    if ("ACTION_CONSTRAINTS_CHANGED".equals(((Intent) it.next()).getAction())) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void echo() {
        bravo();
        PowerManager.WakeLock alpha = k.alpha(this.alpha, "ProcessCommand");
        try {
            alpha.acquire();
            ((L2.c) this.teal.echo).alpha(new h(this, 0));
        } finally {
            alpha.release();
        }
    }
}
