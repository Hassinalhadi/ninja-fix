package com.google.android.gms.location;

import android.app.PendingIntent;
import com.google.android.gms.tasks.Task;
import java.util.List;

/* loaded from: classes2.dex */
public interface GeofencingClient extends com.google.android.gms.common.api.k {
    Task addGeofences(GeofencingRequest geofencingRequest, PendingIntent pendingIntent);

    @Override // com.google.android.gms.common.api.k
    /* synthetic */ T5.b getApiKey();

    Task removeGeofences(PendingIntent pendingIntent);

    Task removeGeofences(List<String> list);
}
