package com.google.android.gms.common;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.IntentSender;
import androidx.activity.result.IntentSenderRequest;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class i implements DialogInterface.OnClickListener {
    public final /* synthetic */ Activity alpha;
    public final /* synthetic */ int purple;
    public final /* synthetic */ ah.b red;
    public final /* synthetic */ GoogleApiAvailability silver;

    public i(GoogleApiAvailability googleApiAvailability, Activity activity, int i4, ah.b bVar) {
        this.silver = googleApiAvailability;
        this.alpha = activity;
        this.purple = i4;
        this.red = bVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i4) {
        dialogInterface.dismiss();
        PendingIntent errorResolutionPendingIntent = this.silver.getErrorResolutionPendingIntent(this.alpha, this.purple, 0);
        if (errorResolutionPendingIntent == null) {
            return;
        }
        IntentSender intentSender = errorResolutionPendingIntent.getIntentSender();
        Intrinsics.echo(intentSender, "intentSender");
        this.red.alpha(new IntentSenderRequest(intentSender, null, 0, 0));
    }
}
