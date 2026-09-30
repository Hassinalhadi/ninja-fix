package p6;

import android.app.PendingIntent;
import com.google.android.gms.location.GeofencingClient;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.tasks.Task;
import java.util.List;

/* loaded from: classes2.dex */
public final class g extends com.google.android.gms.common.api.g implements GeofencingClient {
    @Override // com.google.android.gms.location.GeofencingClient
    public final Task addGeofences(GeofencingRequest geofencingRequest, PendingIntent pendingIntent) {
        T5.o bravo = T5.o.bravo();
        bravo.delta = new com.google.android.play.core.integrity.c(7, geofencingRequest, pendingIntent);
        bravo.charlie = 2424;
        return delta(1, bravo.alpha());
    }

    @Override // com.google.android.gms.location.GeofencingClient
    public final Task removeGeofences(PendingIntent pendingIntent) {
        T5.o bravo = T5.o.bravo();
        bravo.delta = new C2282c(1, pendingIntent);
        bravo.charlie = 2425;
        return delta(1, bravo.alpha());
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, F2.n] */
    @Override // com.google.android.gms.location.GeofencingClient
    public final Task removeGeofences(List list) {
        T5.o bravo = T5.o.bravo();
        ?? obj = new Object();
        obj.alpha = list;
        bravo.delta = obj;
        bravo.charlie = 2425;
        return delta(1, bravo.alpha());
    }
}
