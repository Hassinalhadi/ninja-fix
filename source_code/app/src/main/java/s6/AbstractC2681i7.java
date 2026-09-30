package s6;

import android.app.usage.UsageStatsManager;
import android.content.Context;
import android.os.Build;
import android.os.PowerManager;
import android.util.Log;
import com.app.network.network.models.TaskStatus;
import com.checkout.components.insight.common.Constants;
import delivery.samurai.android.services.CaptainLocationMonitoringService;
import io.reactivex.annotations.SchedulerSupport;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import t6.AbstractC3070v2;

/* renamed from: s6.i7, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2681i7 {
    /* JADX WARN: Can't wrap try/catch for region: R(59:1|(1:3)(1:139)|4|5|(1:9)|10|(1:138)|14|15|(1:17)(1:137)|18|(3:20|(1:22)|(1:24))|25|26|(1:28)(1:133)|(1:30)(1:132)|31|32|(1:34)|35|36|37|(3:39|(1:41)(1:126)|(12:43|44|45|(1:47)(1:124)|48|(1:50)|51|(1:123)|55|(1:59)|60|(22:68|69|70|71|72|73|74|(1:76)(1:116)|77|(12:84|85|(9:92|93|94|95|96|97|(2:100|98)|101|102)|114|93|94|95|96|97|(1:98)|101|102)|115|85|(11:87|89|92|93|94|95|96|97|(1:98)|101|102)|114|93|94|95|96|97|(1:98)|101|102)(1:66)))|127|44|45|(0)(0)|48|(0)|51|(1:53)|123|55|(2:57|59)|60|(1:62)|68|69|70|71|72|73|74|(0)(0)|77|(14:79|81|84|85|(0)|114|93|94|95|96|97|(1:98)|101|102)|115|85|(0)|114|93|94|95|96|97|(1:98)|101|102|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x027a, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x027b, code lost:
    
        r3 = "LocationProximityDebug";
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0255, code lost:
    
        r0 = java.lang.String.valueOf(java.lang.System.currentTimeMillis());
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0253, code lost:
    
        r32 = r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0452 A[Catch: Exception -> 0x045f, LOOP:0: B:98:0x044c->B:100:0x0452, LOOP_END, TRY_LEAVE, TryCatch #0 {Exception -> 0x045f, blocks: (B:97:0x0445, B:98:0x044c, B:100:0x0452), top: B:96:0x0445 }] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x026c A[Catch: Exception -> 0x027a, TryCatch #2 {Exception -> 0x027a, blocks: (B:77:0x0266, B:79:0x026c, B:85:0x0281, B:87:0x0287, B:94:0x029a, B:120:0x0255), top: B:119:0x0255 }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0287 A[Catch: Exception -> 0x027a, TryCatch #2 {Exception -> 0x027a, blocks: (B:77:0x0266, B:79:0x026c, B:85:0x0281, B:87:0x0287, B:94:0x029a, B:120:0x0255), top: B:119:0x0255 }] */
    /* JADX WARN: Type inference failed for: r21v0 */
    /* JADX WARN: Type inference failed for: r21v1 */
    /* JADX WARN: Type inference failed for: r21v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void alpha(float f5, boolean z2, Context context, String str, int i4, String str2, p3.ah ahVar, long j5, TaskStatus taskStatus, String targetLatLng, String lastSentLatLng, String lastSentTimeUtc, long j6, String str3, float f10, float f11, String currentCapturedTimeUtc, long j7, boolean z10) {
        ?? r21;
        String valueOf;
        String str4;
        Object m206constructorimpl;
        Object m206constructorimpl2;
        Integer num;
        String str5;
        String str6;
        boolean z11;
        boolean z12;
        String num2;
        Integer num3;
        int appStandbyBucket;
        String bravo = AbstractC2680i6.bravo(f5, f10, f11, z10, z2);
        Pair pair = new Pair("task_type", str);
        Pair pair2 = new Pair("task_id", String.valueOf(i4));
        Pair pair3 = new Pair("driver_id", str2);
        String str7 = "-1";
        if (z2) {
            valueOf = "-1";
            r21 = 0;
        } else {
            r21 = 0;
            valueOf = String.valueOf((int) f5);
        }
        Pair pair4 = new Pair("distance_m", valueOf);
        if (z10 && !Float.isNaN(f10)) {
            str7 = String.valueOf((int) f10);
        }
        Pair pair5 = new Pair("current_to_target_m", str7);
        Pair pair6 = new Pair("risk_reason", bravo);
        String str8 = "unknown";
        if (ahVar == null || (str4 = ahVar.toString()) == null) {
            str4 = "unknown";
        }
        Pair pair7 = new Pair("stomp_state", str4);
        Pair[] pairArr = new Pair[7];
        pairArr[r21] = pair;
        pairArr[1] = pair2;
        pairArr[2] = pair3;
        pairArr[3] = pair4;
        pairArr[4] = pair5;
        pairArr[5] = pair6;
        pairArr[6] = pair7;
        Map sierra = kotlin.collections.y.sierra(pairArr);
        Long l10 = CaptainLocationMonitoringService.f12074L;
        long j10 = -1;
        long longValue = l10 != null ? j5 - l10.longValue() : -1L;
        Long l11 = CaptainLocationMonitoringService.f12081T;
        if (l11 != null) {
            if (l11.longValue() <= 0) {
                l11 = null;
            }
            if (l11 != null) {
                j10 = j5 - l11.longValue();
            }
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            Object systemService = context.getSystemService("power");
            PowerManager powerManager = systemService instanceof PowerManager ? (PowerManager) systemService : null;
            m206constructorimpl = Result.m206constructorimpl(powerManager != null ? Boolean.valueOf(powerManager.isDeviceIdleMode()) : null);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m206constructorimpl = Result.m206constructorimpl(ResultKt.createFailure(th));
        }
        if (m206constructorimpl instanceof kotlin.k) {
            m206constructorimpl = null;
        }
        Boolean bool = (Boolean) m206constructorimpl;
        try {
        } catch (Throwable th2) {
            Result.Companion companion3 = Result.INSTANCE;
            m206constructorimpl2 = Result.m206constructorimpl(ResultKt.createFailure(th2));
        }
        try {
            if (Build.VERSION.SDK_INT >= 28) {
                Object systemService2 = context.getSystemService("usagestats");
                UsageStatsManager usageStatsManager = systemService2 instanceof UsageStatsManager ? (UsageStatsManager) systemService2 : null;
                if (usageStatsManager != null) {
                    appStandbyBucket = usageStatsManager.getAppStandbyBucket();
                    num3 = Integer.valueOf(appStandbyBucket);
                    m206constructorimpl2 = Result.m206constructorimpl(num3);
                    num = (Integer) (!(m206constructorimpl2 instanceof kotlin.k) ? null : m206constructorimpl2);
                    Pair pair8 = new Pair("stomp_downtime_ms", String.valueOf(longValue));
                    str5 = CaptainLocationMonitoringService.f12071I;
                    if (str5 == null) {
                        str5 = SchedulerSupport.NONE;
                    }
                    Pair pair9 = new Pair("stomp_close_reason", str5);
                    Pair pair10 = new Pair("stomp_consecutive_failures", String.valueOf(CaptainLocationMonitoringService.f12075M));
                    Pair pair11 = new Pair("coverage_gap_ms", String.valueOf(j10));
                    if (bool != null || (r0 = bool.toString()) == null) {
                        String str9 = "unknown";
                    }
                    Pair pair12 = new Pair("doze", str9);
                    if (num != null && (num2 = num.toString()) != null) {
                        str8 = num2;
                    }
                    Pair pair13 = new Pair("standby_bucket", str8);
                    Pair[] pairArr2 = new Pair[6];
                    pairArr2[r21] = pair8;
                    pairArr2[1] = pair9;
                    pairArr2[2] = pair10;
                    pairArr2[3] = pair11;
                    pairArr2[4] = pair12;
                    pairArr2[5] = pair13;
                    AbstractC3070v2.charlie(context, "proximity_validation_risk", kotlin.collections.y.uniform(sierra, kotlin.collections.y.sierra(pairArr2)));
                    String status = taskStatus.name();
                    Intrinsics.checkNotNull(lastSentTimeUtc);
                    Intrinsics.echo(status, "status");
                    Intrinsics.echo(targetLatLng, "targetLatLng");
                    Intrinsics.echo(lastSentLatLng, "lastSentLatLng");
                    Intrinsics.echo(lastSentTimeUtc, "lastSentTimeUtc");
                    Intrinsics.echo(currentCapturedTimeUtc, "currentCapturedTimeUtc");
                    if (f5 <= 150.0f || f10 > 150.0f || f11 > 150.0f) {
                        String str10 = status;
                        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(Constants.DATE_TIME_PATTERN_ISO_8601, Locale.US);
                        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
                        String valueOf2 = simpleDateFormat.format(new Date());
                        boolean z13 = f5 > 150.0f ? true : r21;
                        if (!Float.isNaN(f10) && !Float.isInfinite(f10) && f10 <= 150.0f) {
                            z11 = r21;
                            if (!Float.isNaN(f11) && !Float.isInfinite(f11) && f11 <= 150.0f) {
                                z12 = r21;
                                String bravo2 = AbstractC2680i6.bravo(f5, f10, f11, z10, z2);
                                List<String> listOf = CollectionsKt.listOf("LocationProximityDebug.schemaVersion=3", "LocationProximityDebug.threshold_m=150", "LocationProximityDebug.triggerLastSentToTarget=" + z13, "LocationProximityDebug.triggerCurrentToTarget=" + z11, "LocationProximityDebug.triggerCurrentToLastSent=" + z12, "LocationProximityDebug.riskReason=" + AbstractC2680i6.echo(bravo2), "LocationProximityDebug.event=" + AbstractC2680i6.echo("TaskCompletionAttempt"), "LocationProximityDebug.time=" + valueOf2, "LocationProximityDebug.taskId=" + i4, "LocationProximityDebug.driverId=" + AbstractC2680i6.echo(str2), "LocationProximityDebug.status=" + AbstractC2680i6.echo(str10), "LocationProximityDebug.taskType=" + AbstractC2680i6.echo(str), "LocationProximityDebug.targetLatLng=" + AbstractC2680i6.echo(targetLatLng), "LocationProximityDebug.lastSentLatLng=" + AbstractC2680i6.echo(lastSentLatLng), "LocationProximityDebug.lastSentTimeUtc=" + AbstractC2680i6.echo(lastSentTimeUtc), "LocationProximityDebug.lastSentAgeMs=" + j6, "LocationProximityDebug.currentLatLng=" + AbstractC2680i6.echo(str3), "LocationProximityDebug.currentCapturedTimeUtc=" + AbstractC2680i6.echo(currentCapturedTimeUtc), "LocationProximityDebug.currentAgeMs=" + j7, "LocationProximityDebug.hasCurrentFix=" + z10, "LocationProximityDebug.lastSentLatLngIsDefaultZero=" + z2, "LocationProximityDebug.distance_lastSent_to_target=" + AbstractC2680i6.delta(f5), "LocationProximityDebug.distance_current_to_target=" + AbstractC2680i6.delta(f10), "LocationProximityDebug.distance_current_to_lastSent=" + AbstractC2680i6.delta(f11), "LocationProximityDebug.alert=proximity_validation_risk");
                                K7.b alpha = K7.b.alpha();
                                String str11 = "LocationProximityDebug PROXIMITY_RISK taskId=" + i4 + " driverId=" + AbstractC2680i6.echo(str2) + " riskReason=" + bravo2 + " event=" + AbstractC2680i6.echo("TaskCompletionAttempt");
                                alpha.bravo(str11);
                                str6 = "LocationProximityDebug";
                                Log.w(str6, str11);
                                for (String str12 : listOf) {
                                    alpha.bravo(str12);
                                    Log.w(str6, str12);
                                }
                                return;
                            }
                            z12 = true;
                            String bravo22 = AbstractC2680i6.bravo(f5, f10, f11, z10, z2);
                            List<String> listOf2 = CollectionsKt.listOf("LocationProximityDebug.schemaVersion=3", "LocationProximityDebug.threshold_m=150", "LocationProximityDebug.triggerLastSentToTarget=" + z13, "LocationProximityDebug.triggerCurrentToTarget=" + z11, "LocationProximityDebug.triggerCurrentToLastSent=" + z12, "LocationProximityDebug.riskReason=" + AbstractC2680i6.echo(bravo22), "LocationProximityDebug.event=" + AbstractC2680i6.echo("TaskCompletionAttempt"), "LocationProximityDebug.time=" + valueOf2, "LocationProximityDebug.taskId=" + i4, "LocationProximityDebug.driverId=" + AbstractC2680i6.echo(str2), "LocationProximityDebug.status=" + AbstractC2680i6.echo(str10), "LocationProximityDebug.taskType=" + AbstractC2680i6.echo(str), "LocationProximityDebug.targetLatLng=" + AbstractC2680i6.echo(targetLatLng), "LocationProximityDebug.lastSentLatLng=" + AbstractC2680i6.echo(lastSentLatLng), "LocationProximityDebug.lastSentTimeUtc=" + AbstractC2680i6.echo(lastSentTimeUtc), "LocationProximityDebug.lastSentAgeMs=" + j6, "LocationProximityDebug.currentLatLng=" + AbstractC2680i6.echo(str3), "LocationProximityDebug.currentCapturedTimeUtc=" + AbstractC2680i6.echo(currentCapturedTimeUtc), "LocationProximityDebug.currentAgeMs=" + j7, "LocationProximityDebug.hasCurrentFix=" + z10, "LocationProximityDebug.lastSentLatLngIsDefaultZero=" + z2, "LocationProximityDebug.distance_lastSent_to_target=" + AbstractC2680i6.delta(f5), "LocationProximityDebug.distance_current_to_target=" + AbstractC2680i6.delta(f10), "LocationProximityDebug.distance_current_to_lastSent=" + AbstractC2680i6.delta(f11), "LocationProximityDebug.alert=proximity_validation_risk");
                            K7.b alpha2 = K7.b.alpha();
                            String str112 = "LocationProximityDebug PROXIMITY_RISK taskId=" + i4 + " driverId=" + AbstractC2680i6.echo(str2) + " riskReason=" + bravo22 + " event=" + AbstractC2680i6.echo("TaskCompletionAttempt");
                            alpha2.bravo(str112);
                            str6 = "LocationProximityDebug";
                            Log.w(str6, str112);
                            while (r0.hasNext()) {
                            }
                            return;
                        }
                        z11 = true;
                        if (!Float.isNaN(f11)) {
                            z12 = r21;
                            String bravo222 = AbstractC2680i6.bravo(f5, f10, f11, z10, z2);
                            List<String> listOf22 = CollectionsKt.listOf("LocationProximityDebug.schemaVersion=3", "LocationProximityDebug.threshold_m=150", "LocationProximityDebug.triggerLastSentToTarget=" + z13, "LocationProximityDebug.triggerCurrentToTarget=" + z11, "LocationProximityDebug.triggerCurrentToLastSent=" + z12, "LocationProximityDebug.riskReason=" + AbstractC2680i6.echo(bravo222), "LocationProximityDebug.event=" + AbstractC2680i6.echo("TaskCompletionAttempt"), "LocationProximityDebug.time=" + valueOf2, "LocationProximityDebug.taskId=" + i4, "LocationProximityDebug.driverId=" + AbstractC2680i6.echo(str2), "LocationProximityDebug.status=" + AbstractC2680i6.echo(str10), "LocationProximityDebug.taskType=" + AbstractC2680i6.echo(str), "LocationProximityDebug.targetLatLng=" + AbstractC2680i6.echo(targetLatLng), "LocationProximityDebug.lastSentLatLng=" + AbstractC2680i6.echo(lastSentLatLng), "LocationProximityDebug.lastSentTimeUtc=" + AbstractC2680i6.echo(lastSentTimeUtc), "LocationProximityDebug.lastSentAgeMs=" + j6, "LocationProximityDebug.currentLatLng=" + AbstractC2680i6.echo(str3), "LocationProximityDebug.currentCapturedTimeUtc=" + AbstractC2680i6.echo(currentCapturedTimeUtc), "LocationProximityDebug.currentAgeMs=" + j7, "LocationProximityDebug.hasCurrentFix=" + z10, "LocationProximityDebug.lastSentLatLngIsDefaultZero=" + z2, "LocationProximityDebug.distance_lastSent_to_target=" + AbstractC2680i6.delta(f5), "LocationProximityDebug.distance_current_to_target=" + AbstractC2680i6.delta(f10), "LocationProximityDebug.distance_current_to_lastSent=" + AbstractC2680i6.delta(f11), "LocationProximityDebug.alert=proximity_validation_risk");
                            K7.b alpha22 = K7.b.alpha();
                            String str1122 = "LocationProximityDebug PROXIMITY_RISK taskId=" + i4 + " driverId=" + AbstractC2680i6.echo(str2) + " riskReason=" + bravo222 + " event=" + AbstractC2680i6.echo("TaskCompletionAttempt");
                            alpha22.bravo(str1122);
                            str6 = "LocationProximityDebug";
                            Log.w(str6, str1122);
                            while (r0.hasNext()) {
                            }
                            return;
                        }
                        z12 = true;
                        String bravo2222 = AbstractC2680i6.bravo(f5, f10, f11, z10, z2);
                        List<String> listOf222 = CollectionsKt.listOf("LocationProximityDebug.schemaVersion=3", "LocationProximityDebug.threshold_m=150", "LocationProximityDebug.triggerLastSentToTarget=" + z13, "LocationProximityDebug.triggerCurrentToTarget=" + z11, "LocationProximityDebug.triggerCurrentToLastSent=" + z12, "LocationProximityDebug.riskReason=" + AbstractC2680i6.echo(bravo2222), "LocationProximityDebug.event=" + AbstractC2680i6.echo("TaskCompletionAttempt"), "LocationProximityDebug.time=" + valueOf2, "LocationProximityDebug.taskId=" + i4, "LocationProximityDebug.driverId=" + AbstractC2680i6.echo(str2), "LocationProximityDebug.status=" + AbstractC2680i6.echo(str10), "LocationProximityDebug.taskType=" + AbstractC2680i6.echo(str), "LocationProximityDebug.targetLatLng=" + AbstractC2680i6.echo(targetLatLng), "LocationProximityDebug.lastSentLatLng=" + AbstractC2680i6.echo(lastSentLatLng), "LocationProximityDebug.lastSentTimeUtc=" + AbstractC2680i6.echo(lastSentTimeUtc), "LocationProximityDebug.lastSentAgeMs=" + j6, "LocationProximityDebug.currentLatLng=" + AbstractC2680i6.echo(str3), "LocationProximityDebug.currentCapturedTimeUtc=" + AbstractC2680i6.echo(currentCapturedTimeUtc), "LocationProximityDebug.currentAgeMs=" + j7, "LocationProximityDebug.hasCurrentFix=" + z10, "LocationProximityDebug.lastSentLatLngIsDefaultZero=" + z2, "LocationProximityDebug.distance_lastSent_to_target=" + AbstractC2680i6.delta(f5), "LocationProximityDebug.distance_current_to_target=" + AbstractC2680i6.delta(f10), "LocationProximityDebug.distance_current_to_lastSent=" + AbstractC2680i6.delta(f11), "LocationProximityDebug.alert=proximity_validation_risk");
                        K7.b alpha222 = K7.b.alpha();
                        String str11222 = "LocationProximityDebug PROXIMITY_RISK taskId=" + i4 + " driverId=" + AbstractC2680i6.echo(str2) + " riskReason=" + bravo2222 + " event=" + AbstractC2680i6.echo("TaskCompletionAttempt");
                        alpha222.bravo(str11222);
                        str6 = "LocationProximityDebug";
                        Log.w(str6, str11222);
                        while (r0.hasNext()) {
                        }
                        return;
                    }
                    return;
                }
            }
            if (!Float.isNaN(f10)) {
                z11 = r21;
                if (!Float.isNaN(f11)) {
                }
                z12 = true;
                String bravo22222 = AbstractC2680i6.bravo(f5, f10, f11, z10, z2);
                List<String> listOf2222 = CollectionsKt.listOf("LocationProximityDebug.schemaVersion=3", "LocationProximityDebug.threshold_m=150", "LocationProximityDebug.triggerLastSentToTarget=" + z13, "LocationProximityDebug.triggerCurrentToTarget=" + z11, "LocationProximityDebug.triggerCurrentToLastSent=" + z12, "LocationProximityDebug.riskReason=" + AbstractC2680i6.echo(bravo22222), "LocationProximityDebug.event=" + AbstractC2680i6.echo("TaskCompletionAttempt"), "LocationProximityDebug.time=" + valueOf2, "LocationProximityDebug.taskId=" + i4, "LocationProximityDebug.driverId=" + AbstractC2680i6.echo(str2), "LocationProximityDebug.status=" + AbstractC2680i6.echo(str10), "LocationProximityDebug.taskType=" + AbstractC2680i6.echo(str), "LocationProximityDebug.targetLatLng=" + AbstractC2680i6.echo(targetLatLng), "LocationProximityDebug.lastSentLatLng=" + AbstractC2680i6.echo(lastSentLatLng), "LocationProximityDebug.lastSentTimeUtc=" + AbstractC2680i6.echo(lastSentTimeUtc), "LocationProximityDebug.lastSentAgeMs=" + j6, "LocationProximityDebug.currentLatLng=" + AbstractC2680i6.echo(str3), "LocationProximityDebug.currentCapturedTimeUtc=" + AbstractC2680i6.echo(currentCapturedTimeUtc), "LocationProximityDebug.currentAgeMs=" + j7, "LocationProximityDebug.hasCurrentFix=" + z10, "LocationProximityDebug.lastSentLatLngIsDefaultZero=" + z2, "LocationProximityDebug.distance_lastSent_to_target=" + AbstractC2680i6.delta(f5), "LocationProximityDebug.distance_current_to_target=" + AbstractC2680i6.delta(f10), "LocationProximityDebug.distance_current_to_lastSent=" + AbstractC2680i6.delta(f11), "LocationProximityDebug.alert=proximity_validation_risk");
                K7.b alpha2222 = K7.b.alpha();
                String str112222 = "LocationProximityDebug PROXIMITY_RISK taskId=" + i4 + " driverId=" + AbstractC2680i6.echo(str2) + " riskReason=" + bravo22222 + " event=" + AbstractC2680i6.echo("TaskCompletionAttempt");
                alpha2222.bravo(str112222);
                str6 = "LocationProximityDebug";
                Log.w(str6, str112222);
                while (r0.hasNext()) {
                }
                return;
            }
            Log.w(str6, str112222);
            while (r0.hasNext()) {
            }
            return;
        } catch (Exception e) {
            e = e;
            try {
                Log.e(str6, "LocationProximityDebug log failed: " + e.getMessage());
                return;
            } catch (Exception unused) {
                return;
            }
        }
        num3 = null;
        m206constructorimpl2 = Result.m206constructorimpl(num3);
        num = (Integer) (!(m206constructorimpl2 instanceof kotlin.k) ? null : m206constructorimpl2);
        Pair pair82 = new Pair("stomp_downtime_ms", String.valueOf(longValue));
        str5 = CaptainLocationMonitoringService.f12071I;
        if (str5 == null) {
        }
        Pair pair92 = new Pair("stomp_close_reason", str5);
        Pair pair102 = new Pair("stomp_consecutive_failures", String.valueOf(CaptainLocationMonitoringService.f12075M));
        Pair pair112 = new Pair("coverage_gap_ms", String.valueOf(j10));
        if (bool != null) {
        }
        String str92 = "unknown";
        Pair pair122 = new Pair("doze", str92);
        if (num != null) {
            str8 = num2;
        }
        Pair pair132 = new Pair("standby_bucket", str8);
        Pair[] pairArr22 = new Pair[6];
        pairArr22[r21] = pair82;
        pairArr22[1] = pair92;
        pairArr22[2] = pair102;
        pairArr22[3] = pair112;
        pairArr22[4] = pair122;
        pairArr22[5] = pair132;
        AbstractC3070v2.charlie(context, "proximity_validation_risk", kotlin.collections.y.uniform(sierra, kotlin.collections.y.sierra(pairArr22)));
        String status2 = taskStatus.name();
        Intrinsics.checkNotNull(lastSentTimeUtc);
        Intrinsics.echo(status2, "status");
        Intrinsics.echo(targetLatLng, "targetLatLng");
        Intrinsics.echo(lastSentLatLng, "lastSentLatLng");
        Intrinsics.echo(lastSentTimeUtc, "lastSentTimeUtc");
        Intrinsics.echo(currentCapturedTimeUtc, "currentCapturedTimeUtc");
        if (f5 <= 150.0f) {
        }
        String str102 = status2;
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat(Constants.DATE_TIME_PATTERN_ISO_8601, Locale.US);
        simpleDateFormat2.setTimeZone(TimeZone.getTimeZone("UTC"));
        String valueOf22 = simpleDateFormat2.format(new Date());
        if (f5 > 150.0f) {
        }
        z11 = true;
        if (!Float.isNaN(f11)) {
        }
        z12 = true;
        String bravo222222 = AbstractC2680i6.bravo(f5, f10, f11, z10, z2);
        List<String> listOf22222 = CollectionsKt.listOf("LocationProximityDebug.schemaVersion=3", "LocationProximityDebug.threshold_m=150", "LocationProximityDebug.triggerLastSentToTarget=" + z13, "LocationProximityDebug.triggerCurrentToTarget=" + z11, "LocationProximityDebug.triggerCurrentToLastSent=" + z12, "LocationProximityDebug.riskReason=" + AbstractC2680i6.echo(bravo222222), "LocationProximityDebug.event=" + AbstractC2680i6.echo("TaskCompletionAttempt"), "LocationProximityDebug.time=" + valueOf22, "LocationProximityDebug.taskId=" + i4, "LocationProximityDebug.driverId=" + AbstractC2680i6.echo(str2), "LocationProximityDebug.status=" + AbstractC2680i6.echo(str102), "LocationProximityDebug.taskType=" + AbstractC2680i6.echo(str), "LocationProximityDebug.targetLatLng=" + AbstractC2680i6.echo(targetLatLng), "LocationProximityDebug.lastSentLatLng=" + AbstractC2680i6.echo(lastSentLatLng), "LocationProximityDebug.lastSentTimeUtc=" + AbstractC2680i6.echo(lastSentTimeUtc), "LocationProximityDebug.lastSentAgeMs=" + j6, "LocationProximityDebug.currentLatLng=" + AbstractC2680i6.echo(str3), "LocationProximityDebug.currentCapturedTimeUtc=" + AbstractC2680i6.echo(currentCapturedTimeUtc), "LocationProximityDebug.currentAgeMs=" + j7, "LocationProximityDebug.hasCurrentFix=" + z10, "LocationProximityDebug.lastSentLatLngIsDefaultZero=" + z2, "LocationProximityDebug.distance_lastSent_to_target=" + AbstractC2680i6.delta(f5), "LocationProximityDebug.distance_current_to_target=" + AbstractC2680i6.delta(f10), "LocationProximityDebug.distance_current_to_lastSent=" + AbstractC2680i6.delta(f11), "LocationProximityDebug.alert=proximity_validation_risk");
        K7.b alpha22222 = K7.b.alpha();
        String str1122222 = "LocationProximityDebug PROXIMITY_RISK taskId=" + i4 + " driverId=" + AbstractC2680i6.echo(str2) + " riskReason=" + bravo222222 + " event=" + AbstractC2680i6.echo("TaskCompletionAttempt");
        alpha22222.bravo(str1122222);
        str6 = "LocationProximityDebug";
    }

    public static void bravo(int i4, int i5) {
        String alpha;
        if (i4 >= 0 && i4 < i5) {
            return;
        }
        if (i4 >= 0) {
            if (i5 < 0) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(i5).length() + 15);
                sb2.append("negative size: ");
                sb2.append(i5);
                throw new IllegalArgumentException(sb2.toString());
            }
            alpha = AbstractC2690j7.alpha("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i4), Integer.valueOf(i5));
        } else {
            alpha = AbstractC2690j7.alpha("%s (%s) must not be negative", "index", Integer.valueOf(i4));
        }
        throw new IndexOutOfBoundsException(alpha);
    }

    public static void charlie(int i4, int i5, int i10) {
        String delta;
        if (i4 >= 0 && i5 >= i4 && i5 <= i10) {
            return;
        }
        if (i4 >= 0 && i4 <= i10) {
            if (i5 >= 0 && i5 <= i10) {
                delta = AbstractC2690j7.alpha("end index (%s) must not be less than start index (%s)", Integer.valueOf(i5), Integer.valueOf(i4));
            } else {
                delta = delta(i5, i10, "end index");
            }
        } else {
            delta = delta(i4, i10, "start index");
        }
        throw new IndexOutOfBoundsException(delta);
    }

    public static String delta(int i4, int i5, String str) {
        if (i4 < 0) {
            return AbstractC2690j7.alpha("%s (%s) must not be negative", str, Integer.valueOf(i4));
        }
        if (i5 >= 0) {
            return AbstractC2690j7.alpha("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i4), Integer.valueOf(i5));
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(i5).length() + 15);
        sb2.append("negative size: ");
        sb2.append(i5);
        throw new IllegalArgumentException(sb2.toString());
    }
}
