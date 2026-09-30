package com.google.android.gms.location;

import android.app.Activity;
import android.content.Context;
import p6.C2280a;

/* loaded from: classes2.dex */
public class ActivityRecognition {

    @Deprecated
    public static final com.google.android.gms.common.api.e API = C2280a.india;

    @Deprecated
    public static final a ActivityRecognitionApi = new com.google.android.gms.measurement.internal.r(13);

    private ActivityRecognition() {
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.location.ActivityRecognitionClient, com.google.android.gms.common.api.g] */
    public static ActivityRecognitionClient getClient(Activity activity) {
        return new com.google.android.gms.common.api.g(activity, activity, C2280a.india, com.google.android.gms.common.api.b.fuchsia, com.google.android.gms.common.api.f.bravo);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.location.ActivityRecognitionClient, com.google.android.gms.common.api.g] */
    public static ActivityRecognitionClient getClient(Context context) {
        return new com.google.android.gms.common.api.g(context, null, C2280a.india, com.google.android.gms.common.api.b.fuchsia, com.google.android.gms.common.api.f.bravo);
    }
}
