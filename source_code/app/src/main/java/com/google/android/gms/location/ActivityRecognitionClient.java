package com.google.android.gms.location;

import android.app.PendingIntent;
import com.google.android.gms.tasks.Task;

/* loaded from: classes2.dex */
public interface ActivityRecognitionClient extends com.google.android.gms.common.api.k {
    @Override // com.google.android.gms.common.api.k
    /* synthetic */ T5.b getApiKey();

    Task removeActivityTransitionUpdates(PendingIntent pendingIntent);

    Task removeActivityUpdates(PendingIntent pendingIntent);

    Task removeSleepSegmentUpdates(PendingIntent pendingIntent);

    Task requestActivityTransitionUpdates(ActivityTransitionRequest activityTransitionRequest, PendingIntent pendingIntent);

    Task requestActivityUpdates(long j5, PendingIntent pendingIntent);

    Task requestSleepSegmentUpdates(PendingIntent pendingIntent, SleepSegmentRequest sleepSegmentRequest);
}
