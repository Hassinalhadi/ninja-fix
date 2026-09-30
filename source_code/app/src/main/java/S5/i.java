package S5;

import V5.x;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Messenger;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.cloudmessaging.zzt;
import d6.C1590a;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import s6.E;

/* loaded from: classes2.dex */
public final class i implements ServiceConnection {
    public int alpha = 0;
    public final Messenger bravo;
    public J2.c charlie;
    public final ArrayDeque delta;
    public final SparseArray echo;
    public final /* synthetic */ k foxtrot;

    public i(k kVar) {
        this.foxtrot = kVar;
        Handler handler = new Handler(Looper.getMainLooper(), new P3.g(1, this));
        Looper.getMainLooper();
        this.bravo = new Messenger(handler);
        this.delta = new ArrayDeque();
        this.echo = new SparseArray();
    }

    public final synchronized void alpha(int i4, String str) {
        bravo(i4, str, null);
    }

    public final synchronized void bravo(int i4, String str, SecurityException securityException) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", "Disconnected: ".concat(String.valueOf(str)));
            }
            int i5 = this.alpha;
            if (i5 != 0) {
                if (i5 != 1 && i5 != 2) {
                    if (i5 != 3) {
                        return;
                    }
                    this.alpha = 4;
                    return;
                }
                if (Log.isLoggable("MessengerIpcClient", 2)) {
                    Log.v("MessengerIpcClient", "Unbinding service");
                }
                this.alpha = 4;
                C1590a.bravo().charlie((Context) this.foxtrot.purple, this);
                zzt zztVar = new zzt(i4, str, securityException);
                Iterator it = this.delta.iterator();
                while (it.hasNext()) {
                    ((j) it.next()).bravo(zztVar);
                }
                this.delta.clear();
                for (int i10 = 0; i10 < this.echo.size(); i10++) {
                    ((j) this.echo.valueAt(i10)).bravo(zztVar);
                }
                this.echo.clear();
                return;
            }
            throw new IllegalStateException();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void charlie() {
        try {
            if (this.alpha == 2 && this.delta.isEmpty() && this.echo.size() == 0) {
                if (Log.isLoggable("MessengerIpcClient", 2)) {
                    Log.v("MessengerIpcClient", "Finished handling requests, unbinding");
                }
                this.alpha = 3;
                C1590a.bravo().charlie((Context) this.foxtrot.purple, this);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized boolean delta(j jVar) {
        boolean z2;
        int i4 = this.alpha;
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 != 2) {
                    return false;
                }
                this.delta.add(jVar);
                ((ScheduledExecutorService) this.foxtrot.red).execute(new h(this, 0));
                return true;
            }
            this.delta.add(jVar);
            return true;
        }
        this.delta.add(jVar);
        if (this.alpha == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        x.kilo(z2);
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Starting bind to GmsCore");
        }
        this.alpha = 1;
        Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
        intent.setPackage("com.google.android.gms");
        try {
            if (!C1590a.bravo().alpha((Context) this.foxtrot.purple, intent, this, 1)) {
                alpha(0, "Unable to bind to service");
            } else {
                ((ScheduledExecutorService) this.foxtrot.red).schedule(new h(this, 1), 30L, TimeUnit.SECONDS);
            }
        } catch (SecurityException e) {
            bravo(0, "Unable to bind to service", e);
        }
        return true;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service connected");
        }
        ((ScheduledExecutorService) this.foxtrot.red).execute(new E(5, this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service disconnected");
        }
        ((ScheduledExecutorService) this.foxtrot.red).execute(new h(this, 2));
    }
}
