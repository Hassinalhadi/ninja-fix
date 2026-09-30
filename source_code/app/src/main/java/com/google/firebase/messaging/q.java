package com.google.firebase.messaging;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.util.Log;

/* loaded from: classes2.dex */
public final class q extends BroadcastReceiver {
    public r alpha;
    public Context bravo;

    public final void alpha() {
        if (Log.isLoggable("FirebaseMessaging", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3))) {
            Log.d("FirebaseMessaging", "Connectivity change received registered");
        }
        IntentFilter intentFilter = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
        r rVar = this.alpha;
        if (rVar != null) {
            Context context = ((FirebaseMessaging) rVar.silver).bravo;
            this.bravo = context;
            context.registerReceiver(this, intentFilter);
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        r rVar = this.alpha;
        if (rVar == null || !rVar.alpha()) {
            return;
        }
        if (Log.isLoggable("FirebaseMessaging", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3))) {
            Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
        }
        r rVar2 = this.alpha;
        ((FirebaseMessaging) rVar2.silver).getClass();
        FirebaseMessaging.bravo(rVar2, 0L);
        Context context2 = this.bravo;
        if (context2 != null) {
            context2.unregisterReceiver(this);
        }
        this.alpha = null;
    }
}
