package D2;

import A2.aa;
import A2.z;
import B2.l;
import J2.p;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import ao.ad;
import av.q;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import s6.P5;

/* loaded from: classes3.dex */
public final class b implements B2.c {
    public static final String white = z.golf("CommandHandler");
    public final Context alpha;
    public final HashMap purple = new HashMap();
    public final Object red = new Object();
    public final aa silver;
    public final J2.c teal;

    public b(Context context, aa aaVar, J2.c cVar) {
        this.alpha = context;
        this.silver = aaVar;
        this.teal = cVar;
    }

    public static J2.j delta(Intent intent) {
        return new J2.j(intent.getStringExtra("KEY_WORKSPEC_ID"), intent.getIntExtra("KEY_WORKSPEC_GENERATION", 0));
    }

    public static void echo(Intent intent, J2.j jVar) {
        intent.putExtra("KEY_WORKSPEC_ID", jVar.alpha);
        intent.putExtra("KEY_WORKSPEC_GENERATION", jVar.bravo);
    }

    public final boolean alpha() {
        boolean z2;
        synchronized (this.red) {
            z2 = !this.purple.isEmpty();
        }
        return z2;
    }

    public final void bravo(Intent intent, int i4, j jVar) {
        List<l> list;
        boolean z2;
        String action = intent.getAction();
        int i5 = 0;
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            z.echo().alpha(white, "Handling constraints changed " + intent);
            e eVar = new e(this.alpha, this.silver, i4, jVar);
            ArrayList foxtrot = jVar.teal.delta.uniform().foxtrot();
            String str = c.alpha;
            Iterator it = foxtrot.iterator();
            boolean z10 = false;
            boolean z11 = false;
            boolean z12 = false;
            boolean z13 = false;
            while (it.hasNext()) {
                A2.d dVar = ((p) it.next()).juliet;
                z10 |= dVar.echo;
                z11 |= dVar.charlie;
                z12 |= dVar.foxtrot;
                if (dVar.alpha != 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                z13 |= z2;
                if (z10 && z11 && z12 && z13) {
                    break;
                }
            }
            String str2 = ConstraintProxyUpdateReceiver.alpha;
            Intent intent2 = new Intent("androidx.work.impl.background.systemalarm.UpdateProxies");
            Context context = eVar.alpha;
            intent2.setComponent(new ComponentName(context, (Class<?>) ConstraintProxyUpdateReceiver.class));
            intent2.putExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", z10).putExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", z11).putExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", z12).putExtra("KEY_NETWORK_STATE_PROXY_ENABLED", z13);
            context.sendBroadcast(intent2);
            ArrayList arrayList = new ArrayList(foxtrot.size());
            eVar.bravo.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            Iterator it2 = foxtrot.iterator();
            while (it2.hasNext()) {
                p pVar = (p) it2.next();
                if (currentTimeMillis >= pVar.alpha() && (!pVar.charlie() || eVar.delta.alpha(pVar))) {
                    arrayList.add(pVar);
                }
            }
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                p pVar2 = (p) it3.next();
                String str3 = pVar2.alpha;
                J2.j bravo = P5.bravo(pVar2);
                Intent intent3 = new Intent(context, (Class<?>) SystemAlarmService.class);
                intent3.setAction("ACTION_DELAY_MET");
                echo(intent3, bravo);
                z.echo().alpha(e.echo, ad.gray("Creating a delay_met command for workSpec with id (", str3, ")"));
                ((L2.c) jVar.purple).delta.execute(new i(eVar.charlie, i5, jVar, intent3));
            }
            return;
        }
        if ("ACTION_RESCHEDULE".equals(action)) {
            z.echo().alpha(white, "Handling reschedule " + intent + ", " + i4);
            jVar.teal.india();
            return;
        }
        Bundle extras = intent.getExtras();
        String[] strArr = {"KEY_WORKSPEC_ID"};
        if (extras != null && !extras.isEmpty() && extras.get(strArr[0]) != null) {
            if ("ACTION_SCHEDULE_WORK".equals(action)) {
                J2.j delta = delta(intent);
                String str4 = white;
                z.echo().alpha(str4, "Handling schedule work for " + delta);
                WorkDatabase workDatabase = jVar.teal.delta;
                workDatabase.charlie();
                try {
                    p hotel = workDatabase.uniform().hotel(delta.alpha);
                    if (hotel == null) {
                        z.echo().hotel(str4, "Skipping scheduling " + delta + " because it's no longer in the DB");
                        return;
                    }
                    if (A0.z.bravo(hotel.bravo)) {
                        z.echo().hotel(str4, "Skipping scheduling " + delta + "because it is finished.");
                        return;
                    }
                    long alpha = hotel.alpha();
                    boolean charlie = hotel.charlie();
                    Context context2 = this.alpha;
                    if (!charlie) {
                        z.echo().alpha(str4, "Setting up Alarms for " + delta + "at " + alpha);
                        a.bravo(context2, workDatabase, delta, alpha);
                    } else {
                        z.echo().alpha(str4, "Opportunistically setting an alarm for " + delta + "at " + alpha);
                        a.bravo(context2, workDatabase, delta, alpha);
                        Intent intent4 = new Intent(context2, (Class<?>) SystemAlarmService.class);
                        intent4.setAction("ACTION_CONSTRAINTS_CHANGED");
                        ((L2.c) jVar.purple).delta.execute(new i(i4, i5, jVar, intent4));
                    }
                    workDatabase.papa();
                    return;
                } finally {
                    workDatabase.kilo();
                }
            }
            if ("ACTION_DELAY_MET".equals(action)) {
                synchronized (this.red) {
                    try {
                        J2.j delta2 = delta(intent);
                        z echo = z.echo();
                        String str5 = white;
                        echo.alpha(str5, "Handing delay met for " + delta2);
                        if (!this.purple.containsKey(delta2)) {
                            g gVar = new g(this.alpha, i4, jVar, this.teal.beige(delta2));
                            this.purple.put(delta2, gVar);
                            gVar.delta();
                        } else {
                            z.echo().alpha(str5, "WorkSpec " + delta2 + " is is already being handled for ACTION_DELAY_MET");
                        }
                    } finally {
                    }
                }
                return;
            }
            if ("ACTION_STOP_WORK".equals(action)) {
                Bundle extras2 = intent.getExtras();
                String string = extras2.getString("KEY_WORKSPEC_ID");
                boolean containsKey = extras2.containsKey("KEY_WORKSPEC_GENERATION");
                J2.c cVar = this.teal;
                if (containsKey) {
                    int i10 = extras2.getInt("KEY_WORKSPEC_GENERATION");
                    ArrayList arrayList2 = new ArrayList(1);
                    l zulu = cVar.zulu(new J2.j(string, i10));
                    list = arrayList2;
                    if (zulu != null) {
                        arrayList2.add(zulu);
                        list = arrayList2;
                    }
                } else {
                    list = cVar.amber(string);
                }
                for (l workSpecId : list) {
                    z.echo().alpha(white, q.echo("Handing stopWork work for ", string));
                    J2.e eVar2 = jVar.f944c;
                    eVar2.getClass();
                    Intrinsics.echo(workSpecId, "workSpecId");
                    eVar2.L(workSpecId, -512);
                    WorkDatabase workDatabase2 = jVar.teal.delta;
                    String str6 = a.alpha;
                    J2.i quebec = workDatabase2.quebec();
                    J2.j jVar2 = workSpecId.alpha;
                    J2.g bravo2 = quebec.bravo(jVar2);
                    if (bravo2 != null) {
                        a.alpha(this.alpha, jVar2, bravo2.charlie);
                        z.echo().alpha(a.alpha, "Removing SystemIdInfo for workSpecId (" + jVar2 + ")");
                        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) quebec.alpha;
                        workDatabase_Impl.bravo();
                        J2.h hVar = (J2.h) quebec.red;
                        androidx.sqlite.db.framework.i alpha2 = hVar.alpha();
                        alpha2.oscar(1, jVar2.alpha);
                        alpha2.gold(2, jVar2.bravo);
                        try {
                            workDatabase_Impl.charlie();
                            try {
                                alpha2.charlie();
                                workDatabase_Impl.papa();
                                workDatabase_Impl.kilo();
                            } catch (Throwable th) {
                                workDatabase_Impl.kilo();
                                throw th;
                            }
                        } finally {
                            hVar.lima(alpha2);
                        }
                    }
                    jVar.charlie(jVar2, false);
                }
                return;
            }
            if ("ACTION_EXECUTION_COMPLETED".equals(action)) {
                J2.j delta3 = delta(intent);
                boolean z14 = intent.getExtras().getBoolean("KEY_NEEDS_RESCHEDULE");
                z.echo().alpha(white, "Handling onExecutionCompleted " + intent + ", " + i4);
                charlie(delta3, z14);
                return;
            }
            z.echo().hotel(white, "Ignoring intent " + intent);
            return;
        }
        z.echo().charlie(white, "Invalid request for " + action + " , requires KEY_WORKSPEC_ID .");
    }

    @Override // B2.c
    public final void charlie(J2.j jVar, boolean z2) {
        synchronized (this.red) {
            try {
                g gVar = (g) this.purple.remove(jVar);
                this.teal.zulu(jVar);
                if (gVar != null) {
                    gVar.foxtrot(z2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
