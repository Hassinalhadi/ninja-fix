package androidx.work.impl.background.systemalarm;

import A2.z;
import D2.j;
import K2.k;
import K2.l;
import android.content.Intent;
import android.os.PowerManager;
import androidx.lifecycle.ao;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class SystemAlarmService extends ao {
    public static final String silver = z.golf("SystemAlarmService");
    public j purple;
    public boolean red;

    public final void alpha() {
        this.red = true;
        z.echo().alpha(silver, "All commands completed in dispatcher");
        String str = k.alpha;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        synchronized (l.alpha) {
            linkedHashMap.putAll(l.bravo);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) entry.getKey();
            String str2 = (String) entry.getValue();
            if (wakeLock != null && wakeLock.isHeld()) {
                z.echo().hotel(k.alpha, "WakeLock held for " + str2);
            }
        }
        stopSelf();
    }

    @Override // androidx.lifecycle.ao, android.app.Service
    public final void onCreate() {
        super.onCreate();
        j jVar = new j(this);
        this.purple = jVar;
        if (jVar.f943b != null) {
            z.echo().charlie(j.f941d, "A completion listener for SystemAlarmDispatcher already exists.");
        } else {
            jVar.f943b = this;
        }
        this.red = false;
    }

    @Override // androidx.lifecycle.ao, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.red = true;
        j jVar = this.purple;
        jVar.getClass();
        z.echo().alpha(j.f941d, "Destroying SystemAlarmDispatcher");
        jVar.silver.golf(jVar);
        jVar.f943b = null;
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i4, int i5) {
        super.onStartCommand(intent, i4, i5);
        if (this.red) {
            z.echo().foxtrot(silver, "Re-initializing SystemAlarmDispatcher after a request to shut-down.");
            j jVar = this.purple;
            jVar.getClass();
            z echo = z.echo();
            String str = j.f941d;
            echo.alpha(str, "Destroying SystemAlarmDispatcher");
            jVar.silver.golf(jVar);
            jVar.f943b = null;
            j jVar2 = new j(this);
            this.purple = jVar2;
            if (jVar2.f943b != null) {
                z.echo().charlie(str, "A completion listener for SystemAlarmDispatcher already exists.");
            } else {
                jVar2.f943b = this;
            }
            this.red = false;
        }
        if (intent != null) {
            this.purple.alpha(intent, i5);
            return 3;
        }
        return 3;
    }
}
