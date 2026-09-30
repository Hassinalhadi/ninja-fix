package com.google.firebase.messaging;

import android.content.res.Resources;
import android.os.Build;
import android.os.SystemClock;
import android.util.Log;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public abstract class e {
    public static final AtomicInteger alpha = new AtomicInteger((int) SystemClock.elapsedRealtime());

    public static boolean alpha(Resources resources, int i4) {
        if (Build.VERSION.SDK_INT == 26) {
            try {
                if (com.google.android.gms.common.c.amber(resources.getDrawable(i4, null))) {
                    Log.e("FirebaseMessaging", "Adaptive icons cannot be used in notifications. Ignoring icon id: " + i4);
                    return false;
                }
                return true;
            } catch (Resources.NotFoundException unused) {
                Log.e("FirebaseMessaging", "Couldn't find resource " + i4 + ", treating it as an invalid icon");
                return false;
            }
        }
        return true;
    }
}
