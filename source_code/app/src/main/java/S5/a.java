package S5;

import G6.q;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import bv.aw;
import com.google.android.gms.cloudmessaging.zzd;
import id.C1915c;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import n6.AbstractC2161a;

/* loaded from: classes2.dex */
public final class a {
    public static int hotel;
    public static PendingIntent india;
    public static final Pattern juliet = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)");
    public final Context bravo;
    public final l charlie;
    public final ScheduledThreadPoolExecutor delta;
    public Messenger foxtrot;
    public zzd golf;
    public final aw alpha = new aw(0);
    public final Messenger echo = new Messenger(new d(this, Looper.getMainLooper()));

    public a(Context context) {
        this.bravo = context;
        this.charlie = new l(context);
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(60L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.delta = scheduledThreadPoolExecutor;
    }

    public static synchronized String bravo() {
        String num;
        synchronized (a.class) {
            int i4 = hotel;
            hotel = i4 + 1;
            num = Integer.toString(i4);
        }
        return num;
    }

    public static synchronized void charlie(Context context, Intent intent) {
        synchronized (a.class) {
            try {
                if (india == null) {
                    Intent intent2 = new Intent();
                    intent2.setPackage("com.google.example.invalidpackage");
                    india = PendingIntent.getBroadcast(context, 0, intent2, AbstractC2161a.alpha);
                }
                intent.putExtra("app", india);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final q alpha(Bundle bundle) {
        String bravo = bravo();
        G6.h hVar = new G6.h();
        synchronized (this.alpha) {
            this.alpha.put(bravo, hVar);
        }
        Intent intent = new Intent();
        intent.setPackage("com.google.android.gms");
        if (this.charlie.papa() == 2) {
            intent.setAction("com.google.iid.TOKEN_REQUEST");
        } else {
            intent.setAction("com.google.android.c2dm.intent.REGISTER");
        }
        intent.putExtras(bundle);
        charlie(this.bravo, intent);
        intent.putExtra("kid", "|ID|" + bravo + "|");
        if (Log.isLoggable("Rpc", 3)) {
            Log.d("Rpc", "Sending ".concat(String.valueOf(intent.getExtras())));
        }
        intent.putExtra("google.messenger", this.echo);
        if (this.foxtrot != null || this.golf != null) {
            Message obtain = Message.obtain();
            obtain.obj = intent;
            try {
                Messenger messenger = this.foxtrot;
                if (messenger != null) {
                    messenger.send(obtain);
                } else {
                    Messenger messenger2 = this.golf.alpha;
                    messenger2.getClass();
                    messenger2.send(obtain);
                }
            } catch (RemoteException unused) {
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Messenger failed, fallback to startService");
                }
            }
            hVar.alpha.charlie(f.red, new C1915c(this, bravo, this.delta.schedule(new F6.b(4, hVar), 30L, TimeUnit.SECONDS), 17));
            return hVar.alpha;
        }
        if (this.charlie.papa() == 2) {
            this.bravo.sendBroadcast(intent);
        } else {
            this.bravo.startService(intent);
        }
        hVar.alpha.charlie(f.red, new C1915c(this, bravo, this.delta.schedule(new F6.b(4, hVar), 30L, TimeUnit.SECONDS), 17));
        return hVar.alpha;
    }

    public final void delta(Bundle bundle, String str) {
        synchronized (this.alpha) {
            try {
                G6.h hVar = (G6.h) this.alpha.remove(str);
                if (hVar == null) {
                    Log.w("Rpc", "Missing callback for " + str);
                    return;
                }
                hVar.bravo(bundle);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
