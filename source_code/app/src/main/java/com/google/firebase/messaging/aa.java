package com.google.firebase.messaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import androidx.camera.core.impl.ai;
import d6.C1590a;
import java.util.ArrayDeque;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class aa implements ServiceConnection {
    public final Context alpha;
    public final Intent bravo;
    public final ScheduledThreadPoolExecutor charlie;
    public final ArrayDeque delta;
    public y echo;
    public boolean foxtrot;

    public aa(Context context) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(40L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.delta = new ArrayDeque();
        this.foxtrot = false;
        Context applicationContext = context.getApplicationContext();
        this.alpha = applicationContext;
        this.bravo = new Intent("com.google.firebase.MESSAGING_EVENT").setPackage(applicationContext.getPackageName());
        this.charlie = scheduledThreadPoolExecutor;
    }

    public final synchronized void alpha() {
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "flush queue called");
            }
            while (!this.delta.isEmpty()) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "found intent to be delivered");
                }
                y yVar = this.echo;
                if (yVar != null && yVar.isBinderAlive()) {
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "binder is alive, sending the intent.");
                    }
                    this.echo.alpha((z) this.delta.poll());
                } else {
                    charlie();
                    return;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized G6.q bravo(Intent intent) {
        z zVar;
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "new intent queued in the bind-strategy delivery");
            }
            zVar = new z(intent);
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.charlie;
            zVar.bravo.alpha.charlie(scheduledThreadPoolExecutor, new a4.u(21, scheduledThreadPoolExecutor.schedule(new ai(28, zVar), 20L, TimeUnit.SECONDS)));
            this.delta.add(zVar);
            alpha();
        } catch (Throwable th) {
            throw th;
        }
        return zVar.bravo.alpha;
    }

    public final void charlie() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            StringBuilder sb2 = new StringBuilder("binder is dead. start connection? ");
            sb2.append(!this.foxtrot);
            Log.d("FirebaseMessaging", sb2.toString());
        }
        if (!this.foxtrot) {
            this.foxtrot = true;
            try {
            } catch (SecurityException e) {
                Log.e("FirebaseMessaging", "Exception while binding the service", e);
            }
            if (!C1590a.bravo().alpha(this.alpha, this.bravo, this, 65)) {
                Log.e("FirebaseMessaging", "binding to the service failed");
                this.foxtrot = false;
                while (true) {
                    ArrayDeque arrayDeque = this.delta;
                    if (!arrayDeque.isEmpty()) {
                        ((z) arrayDeque.poll()).bravo.delta(null);
                    } else {
                        return;
                    }
                }
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "onServiceConnected: " + componentName);
            }
            this.foxtrot = false;
            if (!(iBinder instanceof y)) {
                Log.e("FirebaseMessaging", "Invalid service connection: " + iBinder);
                while (true) {
                    ArrayDeque arrayDeque = this.delta;
                    if (!arrayDeque.isEmpty()) {
                        ((z) arrayDeque.poll()).bravo.delta(null);
                    } else {
                        return;
                    }
                }
            } else {
                this.echo = (y) iBinder;
                alpha();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "onServiceDisconnected: " + componentName);
        }
        alpha();
    }
}
