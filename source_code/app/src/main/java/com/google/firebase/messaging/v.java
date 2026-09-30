package com.google.firebase.messaging;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.util.Log;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class v extends BroadcastReceiver {
    public w alpha;
    public final /* synthetic */ w bravo;

    public v(w wVar, w wVar2) {
        this.bravo = wVar;
        this.alpha = wVar2;
    }

    public final void alpha() {
        if (Log.isLoggable("FirebaseMessaging", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3))) {
            Log.d("FirebaseMessaging", "Connectivity change received registered");
        }
        w wVar = this.bravo;
        wVar.alpha.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x002a A[Catch: all -> 0x0032, TryCatch #0 {all -> 0x0032, blocks: (B:3:0x0001, B:8:0x0007, B:12:0x000f, B:14:0x0018, B:16:0x001e, B:21:0x002a, B:22:0x0034), top: B:2:0x0001 }] */
    @Override // android.content.BroadcastReceiver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void onReceive(Context context, Intent intent) {
        boolean z2;
        try {
            w wVar = this.alpha;
            if (wVar == null) {
                return;
            }
            if (!wVar.delta()) {
                return;
            }
            if (!Log.isLoggable("FirebaseMessaging", 3) && (Build.VERSION.SDK_INT != 23 || !Log.isLoggable("FirebaseMessaging", 3))) {
                z2 = false;
                if (z2) {
                    Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                }
                w wVar2 = this.alpha;
                wVar2.silver.foxtrot.schedule(wVar2, 0L, TimeUnit.SECONDS);
                context.unregisterReceiver(this);
                this.alpha = null;
            }
            z2 = true;
            if (z2) {
            }
            w wVar22 = this.alpha;
            wVar22.silver.foxtrot.schedule(wVar22, 0L, TimeUnit.SECONDS);
            context.unregisterReceiver(this);
            this.alpha = null;
        } catch (Throwable th) {
            throw th;
        }
    }
}
