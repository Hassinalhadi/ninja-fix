package com.app.feature.location;

import N9.e;
import android.content.Context;
import bz.C0796v;
import com.app.feature.location.api.AllowMockProvider;
import com.app.feature.location.api.LocationFeature;
import com.app.feature.location.api.LocationPayloadMapper;
import com.app.feature.location.api.StompStateHolder;
import com.app.feature.location.api.UserInfoProvider;
import com.app.feature.location.store.LastSentLocationStore;
import com.google.android.gms.measurement.internal.C1471u;
import g3.InterfaceC1740a;
import g3.InterfaceC1748i;
import g3.w;
import h3.InterfaceC1808e;
import k3.InterfaceC2002a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p3.C2272d;
import p3.ab;
import u3.InterfaceC3142e;
import u3.InterfaceC3143f;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u008f\u0001\u0010#\u001a\u00020\"2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001f\u001a\u00020\u001e2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lcom/app/feature/location/LocationFeatureFactory;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lcom/app/feature/location/LocationBroadcastConfig;", "broadcastConfig", "Lu3/e;", "logger", "Lcom/app/feature/location/api/LocationPayloadMapper;", "locationPayloadMapper", "Lcom/app/feature/location/api/UserInfoProvider;", "userInfoProvider", "Lcom/app/feature/location/api/StompStateHolder;", "stompStateHolder", "Lcom/app/feature/location/api/AllowMockProvider;", "allowMockProvider", "Lg3/a;", "complianceChecker", "Lk3/a;", "complianceUiHandler", "Lcom/app/feature/location/store/LastSentLocationStore;", "lastSentStore", "Lg3/w;", "locationSend", "Lu3/f;", "remoteConfigProvider", "Lg3/i;", "diagnosticsReporter", "", "maxAcceptableAccuracyMeters", "Lh3/e;", "locationDiagnosticsTimestampSink", "Lcom/app/feature/location/api/LocationFeature;", "create", "(Landroid/content/Context;Lcom/app/feature/location/LocationBroadcastConfig;Lu3/e;Lcom/app/feature/location/api/LocationPayloadMapper;Lcom/app/feature/location/api/UserInfoProvider;Lcom/app/feature/location/api/StompStateHolder;Lcom/app/feature/location/api/AllowMockProvider;Lg3/a;Lk3/a;Lcom/app/feature/location/store/LastSentLocationStore;Lg3/w;Lu3/f;Lg3/i;FLh3/e;)Lcom/app/feature/location/api/LocationFeature;", "feature-location_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LocationFeatureFactory {

    @NotNull
    public static final LocationFeatureFactory INSTANCE = new LocationFeatureFactory();

    private LocationFeatureFactory() {
    }

    public static /* synthetic */ LocationFeature create$default(LocationFeatureFactory locationFeatureFactory, Context context, LocationBroadcastConfig locationBroadcastConfig, InterfaceC3142e interfaceC3142e, LocationPayloadMapper locationPayloadMapper, UserInfoProvider userInfoProvider, StompStateHolder stompStateHolder, AllowMockProvider allowMockProvider, InterfaceC1740a interfaceC1740a, InterfaceC2002a interfaceC2002a, LastSentLocationStore lastSentLocationStore, w wVar, InterfaceC3143f interfaceC3143f, InterfaceC1748i interfaceC1748i, float f5, InterfaceC1808e interfaceC1808e, int i4, Object obj) {
        InterfaceC1808e interfaceC1808e2;
        if ((i4 & Http2.INITIAL_MAX_FRAME_SIZE) != 0) {
            interfaceC1808e2 = null;
        } else {
            interfaceC1808e2 = interfaceC1808e;
        }
        return locationFeatureFactory.create(context, locationBroadcastConfig, interfaceC3142e, locationPayloadMapper, userInfoProvider, stompStateHolder, allowMockProvider, interfaceC1740a, interfaceC2002a, lastSentLocationStore, wVar, interfaceC3143f, interfaceC1748i, f5, interfaceC1808e2);
    }

    /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.Object, androidx.appcompat.app.al] */
    @NotNull
    public final LocationFeature create(@NotNull Context context, @NotNull LocationBroadcastConfig broadcastConfig, @NotNull InterfaceC3142e logger, @NotNull LocationPayloadMapper locationPayloadMapper, @NotNull UserInfoProvider userInfoProvider, @NotNull StompStateHolder stompStateHolder, @NotNull AllowMockProvider allowMockProvider, @NotNull InterfaceC1740a complianceChecker, @Nullable InterfaceC2002a complianceUiHandler, @NotNull LastSentLocationStore lastSentStore, @NotNull w locationSend, @Nullable InterfaceC3143f remoteConfigProvider, @Nullable InterfaceC1748i diagnosticsReporter, float maxAcceptableAccuracyMeters, @Nullable InterfaceC1808e locationDiagnosticsTimestampSink) {
        Intrinsics.echo(context, "context");
        Intrinsics.echo(broadcastConfig, "broadcastConfig");
        Intrinsics.echo(logger, "logger");
        Intrinsics.echo(locationPayloadMapper, "locationPayloadMapper");
        Intrinsics.echo(userInfoProvider, "userInfoProvider");
        Intrinsics.echo(stompStateHolder, "stompStateHolder");
        Intrinsics.echo(allowMockProvider, "allowMockProvider");
        Intrinsics.echo(complianceChecker, "complianceChecker");
        Intrinsics.echo(lastSentStore, "lastSentStore");
        Intrinsics.echo(locationSend, "locationSend");
        long j5 = 60;
        if (remoteConfigProvider != null) {
            j5 = ((e) remoteConfigProvider).bravo("location_stuck_threshold_seconds", 60L);
        }
        long j6 = 1000;
        long j7 = j5 * j6;
        long j10 = 120;
        if (remoteConfigProvider != null) {
            j10 = ((e) remoteConfigProvider).bravo("location_stuck_fallback_max_age_seconds", 120L);
        }
        long j11 = j10 * j6;
        long j12 = 3;
        if (remoteConfigProvider != null) {
            j12 = ((e) remoteConfigProvider).bravo("location_stuck_recovery_max_attempts", 3L);
        }
        int i4 = (int) j12;
        if (i4 < 1) {
            i4 = 1;
        }
        ?? obj = new Object();
        obj.alpha = j7;
        obj.bravo = j11;
        obj.charlie = i4;
        C1471u c1471u = new C1471u(12);
        C0796v c0796v = new C0796v(context, logger);
        if (diagnosticsReporter != null) {
            return new ab(new C2272d(context, broadcastConfig, logger, locationPayloadMapper, userInfoProvider, stompStateHolder, allowMockProvider, complianceChecker, complianceUiHandler, diagnosticsReporter, maxAcceptableAccuracyMeters, remoteConfigProvider, lastSentStore, locationSend, obj, c1471u, c0796v, locationDiagnosticsTimestampSink));
        }
        throw new IllegalArgumentException("LocationDiagnosticsLogger required");
    }
}
