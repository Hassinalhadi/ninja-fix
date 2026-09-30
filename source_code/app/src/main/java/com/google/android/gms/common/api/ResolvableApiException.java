package com.google.android.gms.common.api;

import V5.x;
import android.app.Activity;
import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;

/* loaded from: classes2.dex */
public class ResolvableApiException extends ApiException {
    public ResolvableApiException(Status status) {
        super(status);
    }

    public PendingIntent getResolution() {
        return getStatus().red;
    }

    public void startResolutionForResult(Activity activity, int i4) throws IntentSender.SendIntentException {
        Bundle bundle;
        ActivityOptions pendingIntentBackgroundActivityStartMode;
        Status status = getStatus();
        if (status.red != null) {
            if (Build.VERSION.SDK_INT >= 34) {
                pendingIntentBackgroundActivityStartMode = ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(1);
                bundle = pendingIntentBackgroundActivityStartMode.toBundle();
            } else {
                bundle = null;
            }
            Bundle bundle2 = bundle;
            PendingIntent pendingIntent = status.red;
            x.hotel(pendingIntent);
            activity.startIntentSenderForResult(pendingIntent.getIntentSender(), i4, null, 0, 0, 0, bundle2);
        }
    }
}
