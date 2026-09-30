package com.google.firebase.iid;

import S5.g;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.zendesk.service.HttpConstants;
import f6.ThreadFactoryC1693a;
import java.lang.ref.SoftReference;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import s6.AbstractC2629d0;

/* loaded from: classes2.dex */
public final class FirebaseInstanceIdReceiver extends BroadcastReceiver {
    public static SoftReference alpha;
    public static SoftReference bravo;

    public static int alpha(Intent intent) {
        PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra("pending_intent");
        if (pendingIntent != null) {
            try {
                pendingIntent.send();
            } catch (PendingIntent.CanceledException unused) {
                Log.e("CloudMessagingReceiver", "Notification pending intent canceled");
            }
        }
        Bundle extras = intent.getExtras();
        if (extras != null) {
            extras.remove("pending_intent");
        } else {
            extras = new Bundle();
        }
        if (Objects.equals(intent.getAction(), "com.google.firebase.messaging.NOTIFICATION_DISMISS")) {
            Intent putExtras = new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(extras);
            if (AbstractC2629d0.delta(putExtras)) {
                AbstractC2629d0.charlie(putExtras.getExtras(), "_nd");
                return -1;
            }
            return -1;
        }
        Log.e("CloudMessagingReceiver", "Unknown notification action");
        return HttpConstants.HTTP_INTERNAL_ERROR;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        ExecutorService executorService;
        ExecutorService executorService2;
        if (intent == null) {
            return;
        }
        boolean isOrderedBroadcast = isOrderedBroadcast();
        BroadcastReceiver.PendingResult goAsync = goAsync();
        synchronized (FirebaseInstanceIdReceiver.class) {
            try {
                SoftReference softReference = alpha;
                if (softReference != null) {
                    executorService = (ExecutorService) softReference.get();
                } else {
                    executorService = null;
                }
                if (executorService == null) {
                    executorService = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool(new ThreadFactoryC1693a("firebase-iid-executor")));
                    alpha = new SoftReference(executorService);
                }
                executorService2 = executorService;
            } catch (Throwable th) {
                throw th;
            }
        }
        executorService2.execute(new g(this, intent, context, isOrderedBroadcast, goAsync));
    }
}
