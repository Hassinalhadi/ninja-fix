package com.google.firebase.messaging;

import A2.ao;
import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;
import av.ah;
import com.google.android.gms.tasks.Task;
import f6.ThreadFactoryC1693a;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import s6.V4;

/* loaded from: classes2.dex */
public abstract class g extends Service {
    static final long MESSAGE_TIMEOUT_S = 20;
    private static final String TAG = "EnhancedIntentService";
    private Binder binder;
    final ExecutorService executor;
    private int lastStartId;
    private final Object lock;
    private int runningTasks;

    public g() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC1693a("Firebase-Messaging-Intent-Handle"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.executor = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.lock = new Object();
        this.runningTasks = 0;
    }

    public static Task access$000(g gVar, Intent intent) {
        if (gVar.handleIntentOnMainThread(intent)) {
            return V4.echo(null);
        }
        G6.h hVar = new G6.h();
        gVar.executor.execute(new A2.s(gVar, intent, hVar, 25));
        return hVar.alpha;
    }

    public final void alpha(Intent intent) {
        if (intent != null) {
            x.bravo(intent);
        }
        synchronized (this.lock) {
            try {
                int i4 = this.runningTasks - 1;
                this.runningTasks = i4;
                if (i4 == 0) {
                    stopSelfResultHook(this.lastStartId);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract Intent getStartCommandIntent(Intent intent);

    public abstract void handleIntent(Intent intent);

    public boolean handleIntentOnMainThread(Intent intent) {
        return false;
    }

    @Override // android.app.Service
    public final synchronized IBinder onBind(Intent intent) {
        try {
            if (Log.isLoggable(TAG, 3)) {
                Log.d(TAG, "Service received bind request");
            }
            if (this.binder == null) {
                this.binder = new y(new ah(27, this));
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.binder;
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.executor.shutdown();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i4, int i5) {
        G6.q qVar;
        synchronized (this.lock) {
            this.lastStartId = i5;
            this.runningTasks++;
        }
        Intent startCommandIntent = getStartCommandIntent(intent);
        if (startCommandIntent == null) {
            alpha(intent);
            return 2;
        }
        if (handleIntentOnMainThread(startCommandIntent)) {
            qVar = V4.echo(null);
        } else {
            G6.h hVar = new G6.h();
            this.executor.execute(new A2.s(this, startCommandIntent, hVar, 25));
            qVar = hVar.alpha;
        }
        if (qVar.india()) {
            alpha(intent);
            return 2;
        }
        qVar.charlie(new ap.a(1), new ao(27, this, intent));
        return 3;
    }

    public boolean stopSelfResultHook(int i4) {
        return stopSelfResult(i4);
    }
}
