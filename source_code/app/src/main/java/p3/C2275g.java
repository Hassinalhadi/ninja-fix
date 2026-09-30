package p3;

import androidx.appcompat.app.al;
import com.app.feature.location.LocationBroadcastConfig;
import com.google.android.gms.measurement.internal.C1477x;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import l3.AbstractC2056a;
import u3.InterfaceC3143f;

/* renamed from: p3.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C2275g implements Function0 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ ab purple;

    public /* synthetic */ C2275g(ab abVar, int i4) {
        this.alpha = i4;
        this.purple = abVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        boolean z2;
        long j5;
        float f5;
        boolean z10;
        float f10;
        long j6;
        switch (this.alpha) {
            case 0:
                ab abVar = this.purple;
                Function0 function0 = abVar.india;
                if (function0 != null) {
                    function0.invoke();
                }
                abVar.india = null;
                abVar.hotel = false;
                return Unit.INSTANCE;
            case 1:
                ab abVar2 = this.purple;
                C2272d c2272d = abVar2.alpha;
                LocationBroadcastConfig.send$default(c2272d.bravo, c2272d.alpha, "SYSTEM_LOCATION_DISABLED", null, 4, null);
                abVar2.alpha.charlie.alpha("LocationFlow", "System location disabled broadcast sent");
                return Unit.INSTANCE;
            case 2:
                ab abVar3 = this.purple;
                C2272d c2272d2 = abVar3.alpha;
                c2272d2.bravo.send(c2272d2.alpha, "ACCURACY_DEGRADED", new kd.l(26));
                abVar3.alpha.charlie.alpha("LocationFlow", "Accuracy degraded broadcast sent from LocationMonitoringController");
                return Unit.INSTANCE;
            case 3:
                ab abVar4 = this.purple;
                C2272d c2272d3 = abVar4.alpha;
                c2272d3.bravo.send(c2272d3.alpha, "ACCURACY_RESTORED", new kd.l(27));
                abVar4.alpha.charlie.alpha("LocationFlow", "Accuracy restored broadcast sent from LocationMonitoringController");
                return Unit.INSTANCE;
            case 4:
                return Boolean.valueOf(this.purple.hotel);
            case 5:
                return this.purple.alpha.mike;
            case 6:
                return Boolean.valueOf(this.purple.blue);
            case 7:
                return Long.valueOf(this.purple.zulu);
            case 8:
                return Long.valueOf(this.purple.quebec);
            case 9:
                if (C1477x.charlie() == this.purple) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                return Boolean.valueOf(z2);
            case 10:
                C2272d c2272d4 = this.purple.alpha;
                LocationBroadcastConfig.send$default(c2272d4.bravo, c2272d4.alpha, "LOCATION_STUCK", null, 4, null);
                return Unit.INSTANCE;
            case 11:
                return new w(this.purple);
            case 12:
                return this.purple.alpha.november;
            case 13:
                if (AbstractC2056a.charlie(this.purple.alpha.alpha)) {
                    return "HIGH";
                }
                return "DEGRADED";
            case 14:
                return this.purple.alpha.foxtrot.getState();
            case 15:
                return Boolean.valueOf(this.purple.hotel);
            case 16:
                return Integer.valueOf(this.purple.juliet);
            case 17:
                C2272d c2272d5 = this.purple.alpha;
                al alVar = c2272d5.oscar;
                InterfaceC3143f interfaceC3143f = c2272d5.lima;
                long j7 = 120;
                if (interfaceC3143f != null) {
                    j7 = ((N9.e) interfaceC3143f).bravo("location_cold_start_max_age_seconds", 120L);
                }
                long j10 = 1000;
                long j11 = j7 * j10;
                if (interfaceC3143f != null) {
                    j5 = ((N9.e) interfaceC3143f).bravo("location_cold_start_max_accuracy_meters", 200L);
                } else {
                    j5 = 200;
                }
                float f11 = (float) j5;
                boolean z11 = true;
                if (interfaceC3143f != null) {
                    z11 = ((N9.e) interfaceC3143f).alpha("location_send_validation_enabled", true);
                }
                boolean z12 = z11;
                long j12 = 180;
                if (interfaceC3143f != null) {
                    j12 = ((N9.e) interfaceC3143f).bravo("location_force_send_max_age_seconds", 180L);
                }
                long j13 = j12 * j10;
                if (interfaceC3143f != null) {
                    f5 = (float) ((N9.e) interfaceC3143f).bravo("location_force_send_max_accuracy_meters", 200L);
                } else {
                    f5 = c2272d5.kilo;
                }
                float f12 = f5;
                boolean z13 = false;
                if (interfaceC3143f != null) {
                    z10 = ((N9.e) interfaceC3143f).alpha("location_validate_compare_with_last_sent", false);
                } else {
                    z10 = false;
                }
                long j14 = 300;
                if (interfaceC3143f != null) {
                    j14 = ((N9.e) interfaceC3143f).bravo("location_validate_max_age_vs_last_sent_seconds", 300L);
                }
                long j15 = j14 * j10;
                if (interfaceC3143f != null) {
                    f10 = (float) ((N9.e) interfaceC3143f).bravo("location_validate_max_distance_from_last_sent_meters", 500L);
                } else {
                    f10 = 500.0f;
                }
                float f13 = f10;
                long j16 = 5000;
                if (interfaceC3143f != null) {
                    j16 = ((N9.e) interfaceC3143f).bravo("location_force_send_fresh_timeout_ms", 5000L);
                }
                if (j16 < 1000) {
                    j6 = 1000;
                } else {
                    j6 = j16;
                }
                if (interfaceC3143f != null) {
                    z13 = ((N9.e) interfaceC3143f).alpha("location_implausible_jump_guard_enabled", false);
                }
                return new C2273e(alVar.alpha, alVar.bravo, alVar.charlie, j11, f11, z12, j13, f12, z10, j15, f13, j6, z13);
            case 18:
                return this.purple.alpha.foxtrot.getState();
            case 19:
                return Long.valueOf(this.purple.quebec);
            default:
                return Long.valueOf(this.purple.golf);
        }
    }
}
