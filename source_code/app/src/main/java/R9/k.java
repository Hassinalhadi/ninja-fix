package R9;

import A0.z;
import A2.s;
import Lb.am;
import O7.r;
import Yb.C0316l0;
import android.util.Log;
import delivery.samurai.android.location.ReconnectFailedAtCompletionException;
import delivery.samurai.android.services.CaptainLocationMonitoringService;
import delivery.samurai.android.ui.orders.v2.ProcessOrderActivityV2;
import io.reactivex.annotations.SchedulerSupport;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.y;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p3.ah;
import t6.AbstractC3016k2;
import t6.AbstractC3070v2;
import yf.N;
import z9.C3490g;

/* loaded from: classes2.dex */
public abstract class k {
    public static volatile long alpha;
    public static final AtomicBoolean bravo = new AtomicBoolean(false);

    public static void alpha(d3.k kVar, String str, boolean z2, long j5, boolean z10, boolean z11) {
        long j6;
        boolean z12;
        try {
            Result.Companion companion = Result.INSTANCE;
            boolean z13 = CaptainLocationMonitoringService.f12066D;
            long currentTimeMillis = System.currentTimeMillis();
            Long l10 = CaptainLocationMonitoringService.f12081T;
            long j7 = -1;
            if (l10 != null) {
                j6 = currentTimeMillis - l10.longValue();
            } else {
                j6 = -1;
            }
            Long l11 = CaptainLocationMonitoringService.f12074L;
            if (l11 != null) {
                j7 = currentTimeMillis - l11.longValue();
            }
            Pair pair = new Pair("fresh_socket_location_gate_result", str);
            Pair pair2 = new Pair("location_sensitive_action", "PRE_COMPLETE");
            Pair pair3 = new Pair("stomp_connected_at_action", String.valueOf(z2));
            N n5 = CaptainLocationMonitoringService.f12067E;
            Pair pair4 = new Pair("stomp_state_at_result", ((ah) n5.getValue()).name());
            if (n5.getValue() == ah.alpha) {
                z12 = true;
            } else {
                z12 = false;
            }
            AbstractC3070v2.charlie(kVar, "fresh_socket_location_gate_result", y.sierra(pair, pair2, pair3, pair4, new Pair("reconnect_in_progress", String.valueOf(z12)), new Pair("reconnect_consecutive_failures", String.valueOf(CaptainLocationMonitoringService.f12075M)), new Pair("last_socket_send_success_age_ms", String.valueOf(j6)), new Pair("last_socket_send_attempt_age_ms", "unavailable"), new Pair("last_pong_age_ms", "unavailable"), new Pair("stomp_downtime_ms", String.valueOf(j7)), new Pair("gate_wait_ms", String.valueOf(j5)), new Pair("patch_or_api_sent_after_gate_failure", String.valueOf(z10)), new Pair("confirmation_mode", "local_send_only"), new Pair("feature_flag_location_reliability_enhancements", String.valueOf(z11))));
            Result.m206constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m206constructorimpl(ResultKt.createFailure(th));
        }
    }

    public static boolean bravo(ProcessOrderActivityV2 processOrderActivityV2) {
        if (!processOrderActivityV2.isDestroyed() && !processOrderActivityV2.isFinishing()) {
            return true;
        }
        return false;
    }

    public static void charlie(d3.k kVar, String str, C3490g c3490g) {
        Object m206constructorimpl;
        boolean z2 = CaptainLocationMonitoringService.f12066D;
        if (CaptainLocationMonitoringService.f12066D) {
            AbstractC3016k2.charlie(kVar);
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - alpha >= 15000) {
                AtomicBoolean atomicBoolean = bravo;
                atomicBoolean.set(false);
                if (atomicBoolean.compareAndSet(false, true)) {
                    alpha = currentTimeMillis;
                    Log.i("LocationFlow", "FRESH_LOC_PREWARM action=" + str + " sendingFreshLocation=true");
                    try {
                        Result.Companion companion = Result.INSTANCE;
                        c3490g.charlie(kVar, new am(16));
                        m206constructorimpl = Result.m206constructorimpl(Unit.INSTANCE);
                    } catch (Throwable th) {
                        Result.Companion companion2 = Result.INSTANCE;
                        m206constructorimpl = Result.m206constructorimpl(ResultKt.createFailure(th));
                    }
                    if (Result.m207exceptionOrNullimpl(m206constructorimpl) != null) {
                        bravo.set(false);
                    }
                }
            }
        }
    }

    public static void delta(ProcessOrderActivityV2 processOrderActivityV2, int i4, String str, int i5, f fVar, F4.f fVar2, C0316l0 c0316l0, boolean z2, boolean z10, long j5, String str2) {
        String str3;
        Long l10;
        String str4;
        long j6;
        if (!bravo(processOrderActivityV2)) {
            alpha(processOrderActivityV2, "cancelled", z10, j5, false, z2);
            return;
        }
        if (fVar == null && !z2) {
            StringBuilder lima = z.lima("FRESH_LOC_BYPASS action=PRE_COMPLETE taskId=", " taskType=", str, " attempt=", i4);
            lima.append(i5);
            lima.append(" ");
            lima.append(str2);
            Log.w("LocationFlow", StringsKt.b(lima.toString()).toString());
            if (CaptainLocationMonitoringService.f12067E.getValue() != ah.purple) {
                try {
                    Result.Companion companion = Result.INSTANCE;
                    Long l11 = CaptainLocationMonitoringService.f12074L;
                    if (l11 != null) {
                        j6 = System.currentTimeMillis() - l11.longValue();
                    } else {
                        j6 = -1;
                    }
                    String str5 = CaptainLocationMonitoringService.f12071I;
                    String str6 = SchedulerSupport.NONE;
                    if (str5 == null) {
                        str5 = SchedulerSupport.NONE;
                    }
                    String str7 = CaptainLocationMonitoringService.f12072J;
                    if (str7 != null) {
                        str6 = str7;
                    }
                    K7.b alpha2 = K7.b.alpha();
                    alpha2.echo("reconnect_fail_close_reason", str5);
                    alpha2.echo("reconnect_fail_err_class", str6);
                    alpha2.delta(CaptainLocationMonitoringService.f12075M, "reconnect_fail_consecutive");
                    r rVar = alpha2.alpha;
                    rVar.oscar.alpha.alpha(new s(rVar, "reconnect_fail_downtime_ms", Long.toString(j6), 11));
                    alpha2.charlie(new ReconnectFailedAtCompletionException("action=PRE_COMPLETE taskType=" + str + " attempt=" + i5 + " closeReason=" + str5 + " errClass=" + str6 + " downtimeMs=" + j6));
                    Result.m206constructorimpl(Unit.INSTANCE);
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.INSTANCE;
                    Result.m206constructorimpl(ResultKt.createFailure(th));
                }
            }
            alpha(processOrderActivityV2, "legacy_bypass", z10, j5, true, z2);
            c0316l0.invoke();
            return;
        }
        if (fVar != null) {
            str3 = fVar.bravo;
        } else {
            str3 = "socket_not_confirmed";
        }
        Object obj = null;
        if (fVar != null) {
            l10 = fVar.alpha;
        } else {
            l10 = null;
        }
        StringBuilder lima2 = z.lima("FRESH_LOC_BLOCK action=PRE_COMPLETE taskId=", " taskType=", str, " attempt=", i4);
        lima2.append(i5);
        lima2.append(" reason=");
        lima2.append(str3);
        lima2.append(" ageMs=");
        lima2.append(l10);
        lima2.append(" ");
        lima2.append(str2);
        Log.w("LocationFlow", StringsKt.b(lima2.toString()).toString());
        if (fVar != null) {
            str4 = "send_timeout";
        } else {
            str4 = "patch_blocked";
        }
        alpha(processOrderActivityV2, str4, z10, j5, false, z2);
        Intrinsics.checkNotNull(fVar2);
        if (fVar != null) {
            obj = fVar.alpha;
        }
        fVar2.invoke(str3, obj);
    }
}
