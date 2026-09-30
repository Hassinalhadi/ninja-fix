package com.google.firebase.messaging;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import av.ao;
import bv.aw;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import s6.V4;

/* loaded from: classes2.dex */
public final class u {
    public static final long india = TimeUnit.HOURS.toSeconds(8);
    public static final /* synthetic */ int juliet = 0;
    public final Context alpha;
    public final S.j bravo;
    public final ao charlie;
    public final FirebaseMessaging delta;
    public final ScheduledThreadPoolExecutor foxtrot;
    public final t hotel;
    public final bv.e echo = new aw(0);
    public boolean golf = false;

    /* JADX WARN: Type inference failed for: r0v0, types: [bv.e, bv.aw] */
    public u(FirebaseMessaging firebaseMessaging, S.j jVar, t tVar, ao aoVar, Context context, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.delta = firebaseMessaging;
        this.bravo = jVar;
        this.hotel = tVar;
        this.charlie = aoVar;
        this.alpha = context;
        this.foxtrot = scheduledThreadPoolExecutor;
    }

    public static void alpha(G6.q qVar) {
        try {
            try {
                V4.alpha(qVar, 30L, TimeUnit.SECONDS);
            } catch (TimeoutException e) {
                e = e;
                throw new IOException("SERVICE_NOT_AVAILABLE", e);
            }
        } catch (InterruptedException | TimeoutException e4) {
            e = e4;
        } catch (ExecutionException e5) {
            Throwable cause = e5.getCause();
            if (!(cause instanceof IOException)) {
                if (cause instanceof RuntimeException) {
                    throw ((RuntimeException) cause);
                }
                throw new IOException(e5);
            }
            throw ((IOException) cause);
        }
    }

    public static boolean delta() {
        if (!Log.isLoggable("FirebaseMessaging", 3)) {
            if (Build.VERSION.SDK_INT != 23 || !Log.isLoggable("FirebaseMessaging", 3)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final void bravo(String str) {
        String alpha = this.delta.alpha();
        ao aoVar = this.charlie;
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str);
        alpha(aoVar.quebec(aoVar.fuchsia(alpha, "/topics/" + str, bundle)));
    }

    public final void charlie(String str) {
        String alpha = this.delta.alpha();
        ao aoVar = this.charlie;
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str);
        bundle.putString("delete", "1");
        alpha(aoVar.quebec(aoVar.fuchsia(alpha, "/topics/" + str, bundle)));
    }

    public final void echo(s sVar) {
        synchronized (this.echo) {
            try {
                String str = sVar.charlie;
                if (!this.echo.containsKey(str)) {
                    return;
                }
                ArrayDeque arrayDeque = (ArrayDeque) this.echo.get(str);
                G6.h hVar = (G6.h) arrayDeque.poll();
                if (hVar != null) {
                    hVar.bravo(null);
                }
                if (arrayDeque.isEmpty()) {
                    this.echo.remove(str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized void foxtrot(boolean z2) {
        this.golf = z2;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008d A[Catch: IOException -> 0x0040, TryCatch #1 {IOException -> 0x0040, blocks: (B:8:0x0027, B:17:0x0056, B:19:0x005c, B:23:0x0071, B:25:0x007a, B:28:0x008d, B:30:0x0096, B:33:0x0036, B:36:0x0043), top: B:7:0x0027 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean golf() {
        s alpha;
        char c3;
        while (true) {
            synchronized (this) {
                try {
                    alpha = this.hotel.alpha();
                    if (alpha == null) {
                        break;
                    }
                } finally {
                }
            }
            try {
                String str = alpha.bravo;
                int hashCode = str.hashCode();
                if (hashCode != 83) {
                    if (hashCode == 85 && str.equals("U")) {
                        c3 = 1;
                        String str2 = alpha.alpha;
                        if (c3 == 0) {
                            if (c3 != 1) {
                                if (delta()) {
                                    Log.d("FirebaseMessaging", "Unknown topic operation" + alpha + ".");
                                }
                            } else {
                                charlie(str2);
                                if (delta()) {
                                    Log.d("FirebaseMessaging", "Unsubscribe from topic: " + str2 + " succeeded.");
                                }
                            }
                        } else {
                            bravo(str2);
                            if (delta()) {
                                Log.d("FirebaseMessaging", "Subscribe to topic: " + str2 + " succeeded.");
                            }
                        }
                        this.hotel.charlie(alpha);
                        echo(alpha);
                    }
                    c3 = 65535;
                    String str22 = alpha.alpha;
                    if (c3 == 0) {
                    }
                    this.hotel.charlie(alpha);
                    echo(alpha);
                } else {
                    if (str.equals("S")) {
                        c3 = 0;
                        String str222 = alpha.alpha;
                        if (c3 == 0) {
                        }
                        this.hotel.charlie(alpha);
                        echo(alpha);
                    }
                    c3 = 65535;
                    String str2222 = alpha.alpha;
                    if (c3 == 0) {
                    }
                    this.hotel.charlie(alpha);
                    echo(alpha);
                }
            } catch (IOException e) {
                if (!"SERVICE_NOT_AVAILABLE".equals(e.getMessage()) && !"INTERNAL_SERVER_ERROR".equals(e.getMessage()) && !"TOO_MANY_SUBSCRIBERS".equals(e.getMessage())) {
                    if (e.getMessage() == null) {
                        Log.e("FirebaseMessaging", "Topic operation failed without exception message. Will retry Topic operation.");
                    } else {
                        throw e;
                    }
                } else {
                    Log.e("FirebaseMessaging", "Topic operation failed: " + e.getMessage() + ". Will retry Topic operation.");
                }
                return false;
            }
        }
        if (delta()) {
            Log.d("FirebaseMessaging", "topic sync succeeded");
        }
        return true;
    }

    public final void hotel(long j5) {
        long min = Math.min(Math.max(30L, 2 * j5), india);
        this.foxtrot.schedule(new w(this, this.alpha, this.bravo, min), j5, TimeUnit.SECONDS);
        foxtrot(true);
    }
}
