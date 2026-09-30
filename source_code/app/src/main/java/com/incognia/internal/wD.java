package com.incognia.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Handler;

/* loaded from: classes2.dex */
public abstract class wD {
    public static final Intent b(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, Handler handler) {
        Intent registerReceiver;
        if (Build.VERSION.SDK_INT >= 33) {
            registerReceiver = context.registerReceiver(broadcastReceiver, intentFilter, null, handler, 4);
            return registerReceiver;
        }
        return context.registerReceiver(broadcastReceiver, intentFilter, null, handler);
    }
}
