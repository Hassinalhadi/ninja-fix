package p3;

import android.location.Location;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationResult;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import l3.AbstractC2056a;
import s6.M4;
import u3.InterfaceC3142e;

/* loaded from: classes3.dex */
public final class v extends LocationCallback {
    public final /* synthetic */ ab alpha;

    public v(ab abVar) {
        this.alpha = abVar;
    }

    @Override // com.google.android.gms.location.LocationCallback
    public final void onLocationResult(LocationResult locationResult) {
        String str;
        Intrinsics.echo(locationResult, "locationResult");
        ab abVar = this.alpha;
        String str2 = "DEGRADED";
        if (!AbstractC2056a.charlie(abVar.alpha.alpha)) {
            str = "DEGRADED";
        } else {
            str = "HIGH";
        }
        C2272d c2272d = abVar.alpha;
        ah state = c2272d.foxtrot.getState();
        int size = locationResult.getLocations().size();
        InterfaceC3142e interfaceC3142e = c2272d.charlie;
        StringBuilder lima = A0.z.lima("[FALLBACK_CALLBACK] onLocationResult called (fallback mode) | locationsCount=", " | accuracyMode=", str, " | STOMP=", size);
        lima.append(state);
        interfaceC3142e.alpha("LocationFlow", lima.toString());
        List locations = locationResult.getLocations();
        Intrinsics.delta(locations, "getLocations(...)");
        Location location = (Location) CollectionsKt.green(locations);
        if (location != null) {
            abVar.zulu = System.currentTimeMillis();
            abVar.foxtrot(null);
            float accuracy = location.getAccuracy();
            float abs = Math.abs(accuracy);
            InterfaceC3142e interfaceC3142e2 = c2272d.charlie;
            if (abs <= Float.MAX_VALUE && accuracy <= c2272d.kilo) {
                if (AbstractC2056a.charlie(c2272d.alpha)) {
                    str2 = "HIGH";
                }
                ah state2 = c2272d.foxtrot.getState();
                interfaceC3142e2.alpha("LocationFlow", "[FALLBACK_LOCATION_RECEIVED] Location received (fallback) | lat=" + location.getLatitude() + ", lng=" + location.getLongitude() + ", accuracy=" + location.getAccuracy() + "m | accuracyMode=" + str2 + " | STOMP=" + state2);
                M4 bravo = ab.bravo(abVar, location, ae.purple);
                if (bravo instanceof g3.x) {
                    interfaceC3142e2.alpha("LocationFlow", "[FALLBACK_SKIP_VALIDATION] Skipping location: " + ((g3.x) bravo).bravo + " | accuracyMode=" + str2);
                    return;
                }
                if (bravo instanceof g3.y) {
                    if (state2 == ah.purple) {
                        try {
                            ab.alpha(abVar, location, false);
                            return;
                        } catch (Exception e) {
                            interfaceC3142e2.bravo("LocationFlow", av.q.foxtrot("[FALLBACK_EXCEPTION] Exception sending location (fallback) | error=", e.getMessage(), " | accuracyMode=", str2), e);
                            try {
                                K7.b.alpha().charlie(e);
                                return;
                            } catch (Exception unused) {
                                return;
                            }
                        }
                    }
                    interfaceC3142e2.alpha("LocationFlow", "[FALLBACK_STOMP_SKIP] STOMP not connected - skipping location push (fallback) | STOMP=" + state2);
                    return;
                }
                throw new NoWhenBranchMatchedException();
            }
            interfaceC3142e2.alpha("LocationFlow", "[FALLBACK_SKIP] Skipping location (invalid/poor accuracy) | accuracy=" + accuracy + "m | accuracyMode=" + str);
        }
    }
}
