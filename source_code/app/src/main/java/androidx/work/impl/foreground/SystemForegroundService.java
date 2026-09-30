package androidx.work.impl.foreground;

import A2.aa;
import A2.z;
import B2.w;
import I2.a;
import K2.i;
import L2.c;
import aa.AbstractC0417a;
import android.app.NotificationManager;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import androidx.lifecycle.ao;
import be.g;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public class SystemForegroundService extends ao {
    public static final String teal = z.golf("SystemFgService");
    public boolean purple;
    public a red;
    public NotificationManager silver;

    public final void alpha() {
        this.silver = (NotificationManager) getApplicationContext().getSystemService("notification");
        a aVar = new a(getApplicationContext());
        this.red = aVar;
        if (aVar.f1417b != null) {
            z.echo().charlie(a.f1415c, "A callback already exists.");
        } else {
            aVar.f1417b = this;
        }
    }

    @Override // androidx.lifecycle.ao, android.app.Service
    public final void onCreate() {
        super.onCreate();
        alpha();
    }

    @Override // androidx.lifecycle.ao, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.red.delta();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i4, int i5) {
        super.onStartCommand(intent, i4, i5);
        boolean z2 = this.purple;
        String str = teal;
        if (z2) {
            z.echo().foxtrot(str, "Re-initializing SystemForegroundService after a request to shut-down.");
            this.red.delta();
            alpha();
            this.purple = false;
        }
        if (intent != null) {
            a aVar = this.red;
            aVar.getClass();
            String action = intent.getAction();
            boolean equals = "ACTION_START_FOREGROUND".equals(action);
            String str2 = a.f1415c;
            if (equals) {
                z.echo().foxtrot(str2, "Started foreground service " + intent);
                ((c) aVar.purple).alpha(new g(4, aVar, intent.getStringExtra("KEY_WORKSPEC_ID"), false));
                aVar.bravo(intent);
                return 3;
            }
            if ("ACTION_NOTIFY".equals(action)) {
                aVar.bravo(intent);
                return 3;
            }
            if ("ACTION_CANCEL_WORK".equals(action)) {
                z.echo().foxtrot(str2, "Stopping foreground work for " + intent);
                String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
                if (stringExtra != null && !TextUtils.isEmpty(stringExtra)) {
                    UUID id2 = UUID.fromString(stringExtra);
                    w wVar = aVar.alpha;
                    wVar.getClass();
                    Intrinsics.echo(id2, "id");
                    aa aaVar = wVar.charlie.mike;
                    i iVar = ((c) wVar.echo).alpha;
                    Intrinsics.delta(iVar, "workManagerImpl.workTask…ecutor.serialTaskExecutor");
                    AbstractC0417a.bravo(aaVar, "CancelWorkById", iVar, new Aa.i(17, wVar, id2));
                    return 3;
                }
                return 3;
            }
            if ("ACTION_STOP_FOREGROUND".equals(action)) {
                z.echo().foxtrot(str2, "Stopping foreground service");
                SystemForegroundService systemForegroundService = aVar.f1417b;
                if (systemForegroundService != null) {
                    systemForegroundService.purple = true;
                    z.echo().alpha(str, "Shutting down.");
                    if (Build.VERSION.SDK_INT >= 26) {
                        systemForegroundService.stopForeground(true);
                    }
                    systemForegroundService.stopSelf();
                    return 3;
                }
                return 3;
            }
            return 3;
        }
        return 3;
    }

    @Override // android.app.Service
    public final void onTimeout(int i4) {
        if (Build.VERSION.SDK_INT >= 35) {
            return;
        }
        this.red.foxtrot(2048);
    }

    public final void onTimeout(int i4, int i5) {
        this.red.foxtrot(i5);
    }
}
