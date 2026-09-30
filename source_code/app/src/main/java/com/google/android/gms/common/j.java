package com.google.android.gms.common;

import android.content.Context;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.internal.measurement.ai;

/* loaded from: classes2.dex */
public final class j extends ai {
    public final Context alpha;
    public final /* synthetic */ GoogleApiAvailability bravo;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public j(GoogleApiAvailability googleApiAvailability, Context context) {
        super(r2, 1);
        Looper myLooper;
        this.bravo = googleApiAvailability;
        if (Looper.myLooper() == null) {
            myLooper = Looper.getMainLooper();
        } else {
            myLooper = Looper.myLooper();
        }
        this.alpha = context.getApplicationContext();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i4 = message.what;
        if (i4 != 1) {
            Log.w("GoogleApiAvailability", "Don't know how to handle this message: " + i4);
        } else {
            GoogleApiAvailability googleApiAvailability = this.bravo;
            Context context = this.alpha;
            int isGooglePlayServicesAvailable = googleApiAvailability.isGooglePlayServicesAvailable(context);
            if (googleApiAvailability.isUserResolvableError(isGooglePlayServicesAvailable)) {
                googleApiAvailability.showErrorNotification(context, isGooglePlayServicesAvailable);
            }
        }
    }
}
