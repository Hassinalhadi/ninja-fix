package p3;

import android.location.Location;
import com.app.feature.location.store.LastSentLocationStore;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class n implements Function0 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ ab purple;
    public final /* synthetic */ Location red;

    public /* synthetic */ n(ab abVar, Location location, int i4) {
        this.alpha = i4;
        this.purple = abVar;
        this.red = location;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.alpha) {
            case 0:
                long currentTimeMillis = System.currentTimeMillis();
                ab abVar = this.purple;
                LastSentLocationStore lastSentLocationStore = abVar.alpha.mike;
                Location location = this.red;
                lastSentLocationStore.save(location);
                double latitude = location.getLatitude();
                double longitude = location.getLongitude();
                long time = location.getTime();
                g3.ab state = abVar.victor;
                Intrinsics.echo(state, "state");
                state.alpha = time;
                state.bravo = latitude;
                state.charlie = longitude;
                state.delta = currentTimeMillis;
                abVar.foxtrot(Long.valueOf(currentTimeMillis));
                abVar.alpha.charlie.alpha("LocationFlow", com.google.android.material.datepicker.j.kilo("[COLD_START] Sent cached location (age=", System.currentTimeMillis() - location.getTime(), "ms)"));
                return Unit.INSTANCE;
            default:
                long currentTimeMillis2 = System.currentTimeMillis();
                ab abVar2 = this.purple;
                LastSentLocationStore lastSentLocationStore2 = abVar2.alpha.mike;
                Location location2 = this.red;
                lastSentLocationStore2.save(location2);
                lastSentLocationStore2.saveStreamSent(location2);
                double latitude2 = location2.getLatitude();
                double longitude2 = location2.getLongitude();
                long time2 = location2.getTime();
                g3.ab state2 = abVar2.victor;
                Intrinsics.echo(state2, "state");
                state2.alpha = time2;
                state2.bravo = latitude2;
                state2.charlie = longitude2;
                state2.delta = currentTimeMillis2;
                abVar2.foxtrot(Long.valueOf(currentTimeMillis2));
                abVar2.alpha.charlie.alpha("LocationFlow", "Warmup sent");
                return Unit.INSTANCE;
        }
    }
}
