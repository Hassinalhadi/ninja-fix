package p6;

import android.app.PendingIntent;
import com.google.android.gms.common.Feature;
import com.google.android.gms.location.ActivityRecognitionClient;
import com.google.android.gms.location.ActivityTransitionRequest;
import com.google.android.gms.location.SleepSegmentRequest;
import com.google.android.gms.location.zzb;
import com.google.android.gms.tasks.Task;

/* renamed from: p6.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2280a extends com.google.android.gms.common.api.g implements ActivityRecognitionClient {
    public static final com.google.android.gms.common.api.e india = new com.google.android.gms.common.api.e("ActivityRecognition.API", new D6.b(5), new Object());

    @Override // com.google.android.gms.location.ActivityRecognitionClient
    public final Task removeActivityTransitionUpdates(PendingIntent pendingIntent) {
        T5.o bravo = T5.o.bravo();
        bravo.delta = new C2282c(0, pendingIntent);
        bravo.charlie = 2406;
        return delta(1, bravo.alpha());
    }

    @Override // com.google.android.gms.location.ActivityRecognitionClient
    public final Task removeActivityUpdates(PendingIntent pendingIntent) {
        T5.o bravo = T5.o.bravo();
        bravo.delta = new C2281b(0, pendingIntent);
        bravo.charlie = 2402;
        return delta(1, bravo.alpha());
    }

    @Override // com.google.android.gms.location.ActivityRecognitionClient
    public final Task removeSleepSegmentUpdates(PendingIntent pendingIntent) {
        T5.o bravo = T5.o.bravo();
        bravo.delta = new C2281b(1, pendingIntent);
        bravo.charlie = 2411;
        return delta(1, bravo.alpha());
    }

    @Override // com.google.android.gms.location.ActivityRecognitionClient
    public final Task requestActivityTransitionUpdates(ActivityTransitionRequest activityTransitionRequest, PendingIntent pendingIntent) {
        activityTransitionRequest.zza(this.bravo);
        T5.o bravo = T5.o.bravo();
        bravo.delta = new gd.a(4, activityTransitionRequest, pendingIntent);
        bravo.charlie = 2405;
        return delta(1, bravo.alpha());
    }

    @Override // com.google.android.gms.location.ActivityRecognitionClient
    public final Task requestActivityUpdates(long j5, PendingIntent pendingIntent) {
        boolean z2;
        boolean z10 = false;
        if (j5 >= 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        V5.x.alpha("intervalMillis can't be negative.", z2);
        if (j5 != Long.MIN_VALUE) {
            z10 = true;
        }
        V5.x.juliet("Must set intervalMillis.", z10);
        zzb zzbVar = new zzb(j5, true, null, null, null, false, null, 0L, null);
        zzbVar.f7454b = this.bravo;
        T5.o bravo = T5.o.bravo();
        bravo.delta = new com.google.android.play.core.integrity.c(6, zzbVar, pendingIntent);
        bravo.charlie = 2401;
        return delta(1, bravo.alpha());
    }

    @Override // com.google.android.gms.location.ActivityRecognitionClient
    public final Task requestSleepSegmentUpdates(PendingIntent pendingIntent, SleepSegmentRequest sleepSegmentRequest) {
        V5.x.india(pendingIntent, "PendingIntent must be specified.");
        T5.o bravo = T5.o.bravo();
        bravo.delta = new com.google.android.material.internal.ab(this, pendingIntent, sleepSegmentRequest);
        bravo.echo = new Feature[]{com.google.android.gms.location.n.alpha};
        bravo.charlie = 2410;
        return delta(0, bravo.alpha());
    }
}
