package com.google.firebase.messaging;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class w implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public static Boolean f8281a;
    public static final Object white = new Object();
    public static Boolean yellow;
    public final Context alpha;
    public final S.j purple;
    public final PowerManager.WakeLock red;
    public final u silver;
    public final long teal;

    public w(u uVar, Context context, S.j jVar, long j5) {
        this.silver = uVar;
        this.alpha = context;
        this.teal = j5;
        this.purple = jVar;
        this.red = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }

    public static boolean alpha(Context context) {
        boolean booleanValue;
        boolean booleanValue2;
        synchronized (white) {
            try {
                Boolean bool = f8281a;
                if (bool == null) {
                    booleanValue = bravo(context, "android.permission.ACCESS_NETWORK_STATE", bool);
                } else {
                    booleanValue = bool.booleanValue();
                }
                Boolean valueOf = Boolean.valueOf(booleanValue);
                f8281a = valueOf;
                booleanValue2 = valueOf.booleanValue();
            } catch (Throwable th) {
                throw th;
            }
        }
        return booleanValue2;
    }

    public static boolean bravo(Context context, String str, Boolean bool) {
        boolean z2;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (context.checkCallingOrSelfPermission(str) == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2 && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: " + str + ". This permission should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return z2;
    }

    public static boolean charlie(Context context) {
        boolean booleanValue;
        boolean booleanValue2;
        synchronized (white) {
            try {
                Boolean bool = yellow;
                if (bool == null) {
                    booleanValue = bravo(context, "android.permission.WAKE_LOCK", bool);
                } else {
                    booleanValue = bool.booleanValue();
                }
                Boolean valueOf = Boolean.valueOf(booleanValue);
                yellow = valueOf;
                booleanValue2 = valueOf.booleanValue();
            } catch (Throwable th) {
                throw th;
            }
        }
        return booleanValue2;
    }

    public final synchronized boolean delta() {
        NetworkInfo networkInfo;
        boolean z2;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) this.alpha.getSystemService("connectivity");
            if (connectivityManager != null) {
                networkInfo = connectivityManager.getActiveNetworkInfo();
            } else {
                networkInfo = null;
            }
            if (networkInfo != null) {
                if (networkInfo.isConnected()) {
                    z2 = true;
                }
            }
            z2 = false;
        } catch (Throwable th) {
            throw th;
        }
        return z2;
    }

    /* JADX WARN: Finally extract failed */
    @Override // java.lang.Runnable
    public final void run() {
        u uVar = this.silver;
        Context context = this.alpha;
        boolean charlie = charlie(context);
        PowerManager.WakeLock wakeLock = this.red;
        if (charlie) {
            wakeLock.acquire(f.alpha);
        }
        try {
            try {
                try {
                    uVar.foxtrot(true);
                    if (!this.purple.juliet()) {
                        uVar.foxtrot(false);
                        if (!charlie(context)) {
                            return;
                        }
                    } else if (alpha(context) && !delta()) {
                        new v(this, this).alpha();
                        if (!charlie(context)) {
                            return;
                        }
                    } else {
                        if (uVar.golf()) {
                            uVar.foxtrot(false);
                        } else {
                            uVar.hotel(this.teal);
                        }
                        if (!charlie(context)) {
                            return;
                        }
                    }
                    wakeLock.release();
                } catch (IOException e) {
                    Log.e("FirebaseMessaging", "Failed to sync topics. Won't retry sync. " + e.getMessage());
                    uVar.foxtrot(false);
                    if (charlie(context)) {
                        wakeLock.release();
                    }
                }
            } catch (Throwable th) {
                if (charlie(context)) {
                    try {
                        wakeLock.release();
                    } catch (RuntimeException unused) {
                        Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                    }
                }
                throw th;
            }
        } catch (RuntimeException unused2) {
            Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
        }
    }
}
