package com.google.android.gms.common;

import V5.x;
import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes2.dex */
public final class a implements ServiceConnection {
    public boolean alpha = false;
    public final LinkedBlockingQueue bravo = new LinkedBlockingQueue();

    public final IBinder alpha() {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        x.golf("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
        if (!this.alpha) {
            this.alpha = true;
            IBinder iBinder = (IBinder) this.bravo.poll(10000L, timeUnit);
            if (iBinder != null) {
                return iBinder;
            }
            throw new TimeoutException("Timed out waiting for the service connection");
        }
        throw new IllegalStateException("Cannot call get on this connection more than once");
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.bravo.add(iBinder);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
