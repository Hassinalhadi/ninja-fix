package D2;

import A2.z;
import B2.l;
import F2.n;
import J2.p;
import K2.k;
import K2.q;
import K2.r;
import K2.s;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import ao.ad;
import vf.AbstractC3220y;
import vf.Y;

/* loaded from: classes3.dex */
public final class g implements F2.j, q {

    /* renamed from: h, reason: collision with root package name */
    public static final String f934h = z.golf("DelayMetCommandHandler");

    /* renamed from: a, reason: collision with root package name */
    public final K2.i f935a;
    public final Context alpha;

    /* renamed from: b, reason: collision with root package name */
    public final L2.b f936b;

    /* renamed from: c, reason: collision with root package name */
    public PowerManager.WakeLock f937c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f938d;
    public final l e;

    /* renamed from: f, reason: collision with root package name */
    public final AbstractC3220y f939f;

    /* renamed from: g, reason: collision with root package name */
    public volatile Y f940g;
    public final int purple;
    public final J2.j red;
    public final j silver;
    public final n teal;
    public final Object white;
    public int yellow;

    public g(Context context, int i4, j jVar, l lVar) {
        this.alpha = context;
        this.purple = i4;
        this.silver = jVar;
        this.red = lVar.alpha;
        this.e = lVar;
        H2.l lVar2 = jVar.teal.kilo;
        L2.c cVar = (L2.c) jVar.purple;
        this.f935a = cVar.alpha;
        this.f936b = cVar.delta;
        this.f939f = cVar.bravo;
        this.teal = new n(lVar2);
        this.f938d = false;
        this.yellow = 0;
        this.white = new Object();
    }

    public static void alpha(g gVar) {
        J2.j jVar = gVar.red;
        String str = jVar.alpha;
        int i4 = gVar.yellow;
        String str2 = f934h;
        if (i4 < 2) {
            gVar.yellow = 2;
            z.echo().alpha(str2, "Stopping work for WorkSpec " + str);
            Context context = gVar.alpha;
            Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
            intent.setAction("ACTION_STOP_WORK");
            b.echo(intent, jVar);
            j jVar2 = gVar.silver;
            int i5 = gVar.purple;
            i iVar = new i(i5, 0, jVar2, intent);
            L2.b bVar = gVar.f936b;
            bVar.execute(iVar);
            if (jVar2.silver.foxtrot(jVar.alpha)) {
                z.echo().alpha(str2, "WorkSpec " + str + " needs to be rescheduled");
                Intent intent2 = new Intent(context, (Class<?>) SystemAlarmService.class);
                intent2.setAction("ACTION_SCHEDULE_WORK");
                b.echo(intent2, jVar);
                bVar.execute(new i(i5, 0, jVar2, intent2));
                return;
            }
            z.echo().alpha(str2, "Processor does not have WorkSpec " + str + ". No need to reschedule");
            return;
        }
        z.echo().alpha(str2, "Already stopped work for " + str);
    }

    public static void bravo(g gVar) {
        if (gVar.yellow == 0) {
            gVar.yellow = 1;
            z.echo().alpha(f934h, "onAllConstraintsMet for " + gVar.red);
            if (gVar.silver.silver.india(gVar.e, null)) {
                s sVar = gVar.silver.red;
                J2.j jVar = gVar.red;
                synchronized (sVar.delta) {
                    z.echo().alpha(s.echo, "Starting timer for " + jVar);
                    sVar.alpha(jVar);
                    r rVar = new r(sVar, jVar);
                    sVar.bravo.put(jVar, rVar);
                    sVar.charlie.put(jVar, gVar);
                    sVar.alpha.alpha.postDelayed(rVar, 600000L);
                }
                return;
            }
            gVar.charlie();
            return;
        }
        z.echo().alpha(f934h, "Already started work for " + gVar.red);
    }

    public final void charlie() {
        synchronized (this.white) {
            try {
                if (this.f940g != null) {
                    this.f940g.foxtrot(null);
                }
                this.silver.red.alpha(this.red);
                PowerManager.WakeLock wakeLock = this.f937c;
                if (wakeLock != null && wakeLock.isHeld()) {
                    z.echo().alpha(f934h, "Releasing wakelock " + this.f937c + "for WorkSpec " + this.red);
                    this.f937c.release();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void delta() {
        String str = this.red.alpha;
        Context context = this.alpha;
        StringBuilder beige = ad.beige(str, " (");
        beige.append(this.purple);
        beige.append(")");
        this.f937c = k.alpha(context, beige.toString());
        z echo = z.echo();
        String str2 = f934h;
        echo.alpha(str2, "Acquiring wakelock " + this.f937c + "for WorkSpec " + str);
        this.f937c.acquire();
        p hotel = this.silver.teal.delta.uniform().hotel(str);
        if (hotel == null) {
            this.f935a.execute(new f(this, 0));
            return;
        }
        boolean charlie = hotel.charlie();
        this.f938d = charlie;
        if (!charlie) {
            z.echo().alpha(str2, "No constraints for ".concat(str));
            this.f935a.execute(new f(this, 1));
        } else {
            this.f940g = F2.p.alpha(this.teal, hotel, this.f939f, this);
        }
    }

    @Override // F2.j
    public final void echo(p pVar, F2.c cVar) {
        boolean z2 = cVar instanceof F2.a;
        K2.i iVar = this.f935a;
        if (z2) {
            iVar.execute(new f(this, 1));
        } else {
            iVar.execute(new f(this, 0));
        }
    }

    public final void foxtrot(boolean z2) {
        z echo = z.echo();
        StringBuilder sb2 = new StringBuilder("onExecuted ");
        J2.j jVar = this.red;
        sb2.append(jVar);
        sb2.append(", ");
        sb2.append(z2);
        echo.alpha(f934h, sb2.toString());
        charlie();
        int i4 = this.purple;
        j jVar2 = this.silver;
        L2.b bVar = this.f936b;
        Context context = this.alpha;
        if (z2) {
            Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
            intent.setAction("ACTION_SCHEDULE_WORK");
            b.echo(intent, jVar);
            bVar.execute(new i(i4, 0, jVar2, intent));
        }
        if (this.f938d) {
            Intent intent2 = new Intent(context, (Class<?>) SystemAlarmService.class);
            intent2.setAction("ACTION_CONSTRAINTS_CHANGED");
            bVar.execute(new i(i4, 0, jVar2, intent2));
        }
    }
}
