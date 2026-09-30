package com.google.firebase.messaging;

import android.content.BroadcastReceiver;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.os.SystemClock;
import android.util.Log;
import com.google.mlkit.vision.barcode.internal.zzk;
import f6.ThreadFactoryC1693a;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import s6.A5;
import s6.C2602a0;
import s6.C2780u;
import s6.P7;

/* loaded from: classes2.dex */
public final class r implements Runnable {
    public final /* synthetic */ int alpha;
    public final long purple;
    public final Object red;
    public final Object silver;
    public final Object teal;

    public /* synthetic */ r(P7 p72, C2602a0 c2602a0, long j5, zzk zzkVar) {
        this.alpha = 1;
        A5 a52 = A5.UNKNOWN_EVENT;
        this.red = p72;
        this.silver = c2602a0;
        this.purple = j5;
        this.teal = zzkVar;
    }

    public boolean alpha() {
        NetworkInfo networkInfo;
        ConnectivityManager connectivityManager = (ConnectivityManager) ((FirebaseMessaging) this.silver).bravo.getSystemService("connectivity");
        if (connectivityManager != null) {
            networkInfo = connectivityManager.getActiveNetworkInfo();
        } else {
            networkInfo = null;
        }
        if (networkInfo != null && networkInfo.isConnected()) {
            return true;
        }
        return false;
    }

    public boolean bravo() {
        try {
            if (((FirebaseMessaging) this.silver).alpha() == null) {
                Log.e("FirebaseMessaging", "Token retrieval failed: null");
                return false;
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Token successfully retrieved");
                return true;
            }
            return true;
        } catch (IOException e) {
            String message = e.getMessage();
            if (!"SERVICE_NOT_AVAILABLE".equals(message) && !"INTERNAL_SERVER_ERROR".equals(message) && !"InternalServerError".equals(message)) {
                if (e.getMessage() == null) {
                    Log.w("FirebaseMessaging", "Token retrieval failed without exception message. Will retry token retrieval");
                    return false;
                }
                throw e;
            }
            Log.w("FirebaseMessaging", "Token retrieval failed: " + e.getMessage() + ". Will retry token retrieval");
            return false;
        } catch (SecurityException unused) {
            Log.w("FirebaseMessaging", "Token retrieval failed with SecurityException. Will retry token retrieval");
            return false;
        }
    }

    /* JADX WARN: Type inference failed for: r4v10, types: [com.google.firebase.messaging.q, android.content.BroadcastReceiver] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.alpha) {
            case 0:
                o kilo = o.kilo();
                FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.silver;
                boolean oscar = kilo.oscar(firebaseMessaging.bravo);
                PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) this.red;
                if (oscar) {
                    wakeLock.acquire();
                }
                try {
                    try {
                        synchronized (firebaseMessaging) {
                            firebaseMessaging.india = true;
                        }
                        if (!firebaseMessaging.hotel.juliet()) {
                            firebaseMessaging.hotel(false);
                            if (!o.kilo().oscar(firebaseMessaging.bravo)) {
                                return;
                            }
                        } else if (o.kilo().november(firebaseMessaging.bravo) && !alpha()) {
                            ?? broadcastReceiver = new BroadcastReceiver();
                            broadcastReceiver.alpha = this;
                            broadcastReceiver.alpha();
                            if (!o.kilo().oscar(firebaseMessaging.bravo)) {
                                return;
                            }
                        } else {
                            if (bravo()) {
                                firebaseMessaging.hotel(false);
                            } else {
                                firebaseMessaging.juliet(this.purple);
                            }
                            if (!o.kilo().oscar(firebaseMessaging.bravo)) {
                                return;
                            }
                        }
                    } catch (IOException e) {
                        Log.e("FirebaseMessaging", "Topic sync or token retrieval failed on hard failure exceptions: " + e.getMessage() + ". Won't retry the operation.");
                        firebaseMessaging.hotel(false);
                        if (!o.kilo().oscar(firebaseMessaging.bravo)) {
                            return;
                        }
                    }
                    wakeLock.release();
                    return;
                } catch (Throwable th) {
                    if (o.kilo().oscar(firebaseMessaging.bravo)) {
                        wakeLock.release();
                    }
                    throw th;
                }
            default:
                P7 p72 = (P7) this.red;
                HashMap hashMap = p72.juliet;
                A5 a52 = A5.AGGREGATED_ON_DEVICE_BARCODE_DETECTION;
                if (!hashMap.containsKey(a52)) {
                    hashMap.put(a52, new C2780u());
                }
                ((C2780u) hashMap.get(a52)).delta((C2602a0) this.silver, Long.valueOf(this.purple));
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (p72.delta(a52, elapsedRealtime)) {
                    p72.india.put(a52, Long.valueOf(elapsedRealtime));
                    com.google.mlkit.common.sdkinternal.p.alpha.execute(new be.g(p72, (zzk) this.teal));
                    return;
                }
                return;
        }
    }

    public r(FirebaseMessaging firebaseMessaging, long j5) {
        this.alpha = 0;
        this.teal = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC1693a("firebase-iid-executor"));
        this.silver = firebaseMessaging;
        this.purple = j5;
        PowerManager.WakeLock newWakeLock = ((PowerManager) firebaseMessaging.bravo.getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.red = newWakeLock;
        newWakeLock.setReferenceCounted(false);
    }
}
