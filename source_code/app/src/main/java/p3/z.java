package p3;

import android.content.Context;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationRequest;
import g3.EnumC1747h;
import k3.InterfaceC2002a;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import l3.AbstractC2056a;
import u3.InterfaceC3142e;

/* loaded from: classes3.dex */
public final /* synthetic */ class z extends kotlin.jvm.internal.i implements Xd.n {
    /* JADX WARN: Type inference failed for: r9v0, types: [p3.a, java.lang.Object] */
    @Override // Xd.n
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        String str;
        String str2;
        String str3;
        String str4;
        FusedLocationProviderClient p02 = (FusedLocationProviderClient) obj;
        LocationRequest p12 = (LocationRequest) obj2;
        long longValue = ((Number) obj3).longValue();
        long longValue2 = ((Number) obj4).longValue();
        Intrinsics.echo(p02, "p0");
        Intrinsics.echo(p12, "p1");
        ab abVar = (ab) this.receiver;
        abVar.getClass();
        ?? obj5 = new Object();
        obj5.alpha = p12;
        obj5.bravo = longValue;
        obj5.charlie = longValue2;
        C2272d c2272d = abVar.alpha;
        Context context = c2272d.alpha;
        if (!AbstractC2056a.charlie(context)) {
            str = "DEGRADED";
        } else {
            str = "HIGH";
        }
        ah state = c2272d.foxtrot.getState();
        InterfaceC3142e interfaceC3142e = c2272d.charlie;
        interfaceC3142e.alpha("LocationFlow", "[SETTINGS_SUCCESS] Location settings check passed | accuracyMode=" + str + " | STOMP=" + state + " | willRegisterCallbacks=true");
        p02.getLastLocation().bravo(new C2274f(abVar));
        com.google.android.gms.location.g gVar = new com.google.android.gms.location.g(1000L);
        com.google.android.gms.location.n.alpha(100);
        gVar.alpha = 100;
        gVar.delta(500L);
        gVar.golf = 0.0f;
        gVar.bravo(2);
        gVar.hotel = true;
        LocationRequest alpha = gVar.alpha();
        interfaceC3142e.alpha("LocationFlow", "[WARMUP_REQUEST] RequestConfig Warmup interval=1000ms fastest=500ms granularity=FINE | accuracyMode=".concat(str));
        long currentTimeMillis = System.currentTimeMillis();
        abVar.quebec = currentTimeMillis;
        abVar.romeo = currentTimeMillis;
        abVar.sierra = false;
        abVar.tango = true;
        g3.ag agVar = abVar.uniform;
        agVar.bravo = true;
        agVar.charlie = currentTimeMillis;
        agVar.delta = currentTimeMillis + 8000;
        agVar.echo = false;
        agVar.foxtrot = false;
        interfaceC3142e.alpha("LocationFlow", "[WARMUP_START] Warmup started | accuracyMode=" + str + " | serviceStartMs=" + currentTimeMillis);
        com.google.android.material.datepicker.j.charlie(c2272d.juliet, "WarmupStart", 2);
        u uVar = new u(abVar, p02, obj5);
        if (!AbstractC2056a.charlie(context)) {
            str2 = "DEGRADED";
        } else {
            str2 = "HIGH";
        }
        interfaceC3142e.alpha("LocationFlow", "[SECONDARY_CHECK] Running secondary compliance check | accuracyMode=" + str2 + " | STOMP=" + state + " | callbackRegistered=" + abVar.hotel);
        g3.s alpha2 = ((S9.a) c2272d.hotel).alpha();
        boolean z2 = alpha2 instanceof g3.q;
        interfaceC3142e.alpha("LocationFlow", "[SECONDARY_CHECK_RESULT] Secondary compliance check result | isCompliant=" + z2 + " | accuracyMode=" + str2);
        if (!z2) {
            String obj6 = alpha2.toString();
            StringBuilder india = av.q.india("[SECONDARY_CHECK_FAILED] Location compliance check FAILED: ", obj6, " — skipping update request | accuracyMode=", str2, " | STOMP=");
            india.append(state);
            interfaceC3142e.alpha("LocationFlow", india.toString());
            String message = "Secondary compliance check failed: " + obj6 + " | accuracyMode=" + str2;
            Intrinsics.echo(message, "message");
            try {
                K7.b.alpha().bravo(message);
            } catch (Exception unused) {
            }
            InterfaceC2002a interfaceC2002a = c2272d.india;
            if (interfaceC2002a != null) {
                EnumC1747h enumC1747h = EnumC1747h.alpha;
                ((S9.b) interfaceC2002a).alpha(alpha2);
            }
        } else {
            interfaceC3142e.alpha("LocationFlow", "[SECONDARY_CHECK_PASSED] Secondary compliance check passed | accuracyMode=" + str2 + " | callbackRegistered=" + abVar.hotel + " | STOMP=" + state);
            boolean z10 = abVar.tango;
            if (!z10) {
                alpha = obj5.alpha;
            }
            LocationRequest locationRequest = alpha;
            if (z10) {
                str3 = "WARMUP";
            } else {
                str3 = "NORMAL";
            }
            String str5 = str3;
            if (z10) {
                str4 = "1000ms";
            } else {
                str4 = c2272d.echo.getLocationInterval() + "ms";
            }
            m golf = abVar.golf(locationRequest, uVar, p02, str5, str4, obj5.alpha);
            if (golf != null) {
                abVar.india = new C2276h(golf, abVar, 0);
            }
        }
        return Unit.INSTANCE;
    }
}
