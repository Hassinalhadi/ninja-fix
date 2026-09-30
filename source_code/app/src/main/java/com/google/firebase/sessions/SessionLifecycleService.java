package com.google.firebase.sessions;

import J8.C;
import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Process;
import android.util.Log;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/google/firebase/sessions/SessionLifecycleService;", "Landroid/app/Service;", "<init>", "()V", "J8/C", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SessionLifecycleService extends Service {
    public final HandlerThread alpha = new HandlerThread("FirebaseSessions_HandlerThread");
    public C purple;
    public Messenger red;

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        Messenger messenger;
        Object parcelableExtra;
        if (intent == null) {
            Log.d("SessionLifecycleService", "Service bound with null intent. Ignoring.");
            return null;
        }
        Log.d("SessionLifecycleService", "Service bound to new client on process " + intent.getAction());
        if (Build.VERSION.SDK_INT >= 33) {
            parcelableExtra = intent.getParcelableExtra("ClientCallbackMessenger", Messenger.class);
            messenger = (Messenger) parcelableExtra;
        } else {
            messenger = (Messenger) intent.getParcelableExtra("ClientCallbackMessenger");
        }
        if (messenger != null) {
            Message obtain = Message.obtain(null, 4, 0, 0);
            obtain.replyTo = messenger;
            C c3 = this.purple;
            if (c3 != null) {
                c3.sendMessage(obtain);
            }
        }
        Messenger messenger2 = this.red;
        if (messenger2 == null) {
            return null;
        }
        return messenger2.getBinder();
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        HandlerThread handlerThread = this.alpha;
        handlerThread.start();
        Looper looper = handlerThread.getLooper();
        Intrinsics.delta(looper, "handlerThread.looper");
        this.purple = new C(looper);
        this.red = new Messenger(this.purple);
        Log.d("SessionLifecycleService", "Service created on process " + Process.myPid());
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.alpha.quit();
    }
}
