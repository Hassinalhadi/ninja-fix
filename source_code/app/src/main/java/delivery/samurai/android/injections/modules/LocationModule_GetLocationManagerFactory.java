package delivery.samurai.android.injections.modules;

import Q9.e;
import Y9.k;
import android.content.Context;
import dagger.internal.b;
import dagger.internal.d;
import s6.AbstractC2763s0;

/* loaded from: classes2.dex */
public final class LocationModule_GetLocationManagerFactory implements b {
    private final e alpha;
    private final d bravo;

    public static k bravo(e eVar, Context context) {
        k locationManager = eVar.getLocationManager(context);
        AbstractC2763s0.delta(locationManager);
        return locationManager;
    }

    @Override // Kd.a
    /* renamed from: alpha, reason: merged with bridge method [inline-methods] */
    public k get() {
        return bravo(this.alpha, (Context) this.bravo.get());
    }
}
