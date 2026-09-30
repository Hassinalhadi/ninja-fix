package com.google.firebase.messaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public abstract class x {
    public static final long alpha = TimeUnit.MINUTES.toMillis(1);
    public static final Object bravo = new Object();
    public static F6.a charlie;

    public static void alpha(Context context) {
        if (charlie == null) {
            F6.a aVar = new F6.a(context);
            charlie = aVar;
            synchronized (aVar.alpha) {
                aVar.golf = true;
            }
        }
    }

    public static void bravo(Intent intent) {
        synchronized (bravo) {
            try {
                if (charlie != null && intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false)) {
                    intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                    charlie.charlie();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void charlie(Context context, aa aaVar, Intent intent) {
        synchronized (bravo) {
            try {
                alpha(context);
                boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
                if (!booleanExtra) {
                    charlie.alpha(alpha);
                }
                aaVar.bravo(intent).bravo(new a4.u(19, intent));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static ComponentName delta(Context context, Intent intent) {
        synchronized (bravo) {
            try {
                alpha(context);
                boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
                ComponentName startService = context.startService(intent);
                if (startService == null) {
                    return null;
                }
                if (!booleanExtra) {
                    charlie.alpha(alpha);
                }
                return startService;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
