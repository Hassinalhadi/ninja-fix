package I2;

import A2.z;
import B2.c;
import B2.l;
import B2.w;
import F2.j;
import F2.n;
import J2.p;
import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.appcompat.widget.P0;
import androidx.work.impl.foreground.SystemForegroundService;
import ao.ad;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import s6.P5;
import vf.I;

/* loaded from: classes3.dex */
public final class a implements j, c {

    /* renamed from: c, reason: collision with root package name */
    public static final String f1415c = z.golf("SystemFgDispatcher");

    /* renamed from: a, reason: collision with root package name */
    public final n f1416a;
    public final w alpha;

    /* renamed from: b, reason: collision with root package name */
    public SystemForegroundService f1417b;
    public final L2.a purple;
    public final Object red = new Object();
    public J2.j silver;
    public final LinkedHashMap teal;
    public final HashMap white;
    public final HashMap yellow;

    public a(Context context) {
        w golf = w.golf(context);
        this.alpha = golf;
        this.purple = golf.echo;
        this.silver = null;
        this.teal = new LinkedHashMap();
        this.yellow = new HashMap();
        this.white = new HashMap();
        this.f1416a = new n(golf.kilo);
        golf.golf.alpha(this);
    }

    public static Intent alpha(Context context, J2.j jVar, A2.n nVar) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", jVar.alpha);
        intent.putExtra("KEY_GENERATION", jVar.bravo);
        intent.putExtra("KEY_NOTIFICATION_ID", nVar.alpha);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", nVar.bravo);
        intent.putExtra("KEY_NOTIFICATION", nVar.charlie);
        return intent;
    }

    public final void bravo(Intent intent) {
        if (this.f1417b != null) {
            int i4 = 0;
            int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
            int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
            String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
            J2.j jVar = new J2.j(stringExtra, intent.getIntExtra("KEY_GENERATION", 0));
            Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
            z.echo().alpha(f1415c, P0.cyan(A0.z.lima("Notifying with (id:", ", workSpecId: ", stringExtra, ", notificationType :", intExtra), intExtra2, ")"));
            if (notification != null) {
                A2.n nVar = new A2.n(intExtra, notification, intExtra2);
                LinkedHashMap linkedHashMap = this.teal;
                linkedHashMap.put(jVar, nVar);
                A2.n nVar2 = (A2.n) linkedHashMap.get(this.silver);
                if (nVar2 == null) {
                    this.silver = jVar;
                } else {
                    this.f1417b.silver.notify(intExtra, notification);
                    if (Build.VERSION.SDK_INT >= 29) {
                        Iterator it = linkedHashMap.entrySet().iterator();
                        while (it.hasNext()) {
                            i4 |= ((A2.n) ((Map.Entry) it.next()).getValue()).bravo;
                        }
                        nVar = new A2.n(nVar2.alpha, nVar2.charlie, i4);
                    } else {
                        nVar = nVar2;
                    }
                }
                SystemForegroundService systemForegroundService = this.f1417b;
                Notification notification2 = nVar.charlie;
                systemForegroundService.getClass();
                int i5 = Build.VERSION.SDK_INT;
                int i10 = nVar.alpha;
                int i11 = nVar.bravo;
                if (i5 >= 31) {
                    b.mike(systemForegroundService, i10, notification2, i11);
                    return;
                } else if (i5 >= 29) {
                    b.lima(systemForegroundService, i10, notification2, i11);
                    return;
                } else {
                    systemForegroundService.startForeground(i10, notification2);
                    return;
                }
            }
            throw new IllegalArgumentException("Notification passed in the intent was null.");
        }
        throw new IllegalStateException("handleNotify was called on the destroyed dispatcher");
    }

    @Override // B2.c
    public final void charlie(J2.j jVar, boolean z2) {
        I i4;
        Map.Entry entry;
        synchronized (this.red) {
            try {
                if (((p) this.white.remove(jVar)) != null) {
                    i4 = (I) this.yellow.remove(jVar);
                } else {
                    i4 = null;
                }
                if (i4 != null) {
                    i4.foxtrot(null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        A2.n nVar = (A2.n) this.teal.remove(jVar);
        if (jVar.equals(this.silver)) {
            if (this.teal.size() > 0) {
                Iterator it = this.teal.entrySet().iterator();
                Object next = it.next();
                while (true) {
                    entry = (Map.Entry) next;
                    if (!it.hasNext()) {
                        break;
                    } else {
                        next = it.next();
                    }
                }
                this.silver = (J2.j) entry.getKey();
                if (this.f1417b != null) {
                    A2.n nVar2 = (A2.n) entry.getValue();
                    SystemForegroundService systemForegroundService = this.f1417b;
                    int i5 = nVar2.alpha;
                    int i10 = nVar2.bravo;
                    Notification notification = nVar2.charlie;
                    systemForegroundService.getClass();
                    int i11 = Build.VERSION.SDK_INT;
                    if (i11 >= 31) {
                        b.mike(systemForegroundService, i5, notification, i10);
                    } else if (i11 >= 29) {
                        b.lima(systemForegroundService, i5, notification, i10);
                    } else {
                        systemForegroundService.startForeground(i5, notification);
                    }
                    this.f1417b.silver.cancel(nVar2.alpha);
                }
            } else {
                this.silver = null;
            }
        }
        SystemForegroundService systemForegroundService2 = this.f1417b;
        if (nVar != null && systemForegroundService2 != null) {
            z.echo().alpha(f1415c, "Removing Notification (id: " + nVar.alpha + ", workSpecId: " + jVar + ", notificationType: " + nVar.bravo);
            systemForegroundService2.silver.cancel(nVar.alpha);
        }
    }

    public final void delta() {
        this.f1417b = null;
        synchronized (this.red) {
            try {
                Iterator it = this.yellow.values().iterator();
                while (it.hasNext()) {
                    ((I) it.next()).foxtrot(null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.alpha.golf.golf(this);
    }

    @Override // F2.j
    public final void echo(p pVar, F2.c cVar) {
        if (cVar instanceof F2.b) {
            z.echo().alpha(f1415c, "Constraints unmet for WorkSpec " + pVar.alpha);
            J2.j bravo = P5.bravo(pVar);
            int i4 = ((F2.b) cVar).alpha;
            w wVar = this.alpha;
            wVar.getClass();
            ((L2.c) wVar.echo).alpha(new K2.j(wVar.golf, new l(bravo), true, i4));
        }
    }

    public final void foxtrot(int i4) {
        z.echo().foxtrot(f1415c, ad.zulu(i4, "Foreground service timed out, FGS type: "));
        for (Map.Entry entry : this.teal.entrySet()) {
            if (((A2.n) entry.getValue()).bravo == i4) {
                J2.j jVar = (J2.j) entry.getKey();
                w wVar = this.alpha;
                wVar.getClass();
                ((L2.c) wVar.echo).alpha(new K2.j(wVar.golf, new l(jVar), true, -128));
            }
        }
        SystemForegroundService systemForegroundService = this.f1417b;
        if (systemForegroundService != null) {
            systemForegroundService.purple = true;
            z.echo().alpha(SystemForegroundService.teal, "Shutting down.");
            if (Build.VERSION.SDK_INT >= 26) {
                systemForegroundService.stopForeground(true);
            }
            systemForegroundService.stopSelf();
        }
    }
}
