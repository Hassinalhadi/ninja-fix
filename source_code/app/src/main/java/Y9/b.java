package Y9;

import android.content.Intent;
import android.util.Log;
import ca.n;
import com.app.feature.location.LocationBroadcastConfig;
import com.app.feature.location.LocationFeatureFactory;
import com.app.feature.location.api.AllowMockProvider;
import com.app.feature.location.api.LocationPayloadMapper;
import com.app.feature.location.api.StompStateHolder;
import com.app.feature.location.api.UserInfoProvider;
import com.app.feature.location.store.LastSentLocationStore;
import com.app.network.network.models.Captain;
import com.app.network.network.models.UserInfo;
import delivery.samurai.android.services.CaptainLocationMonitoringService;
import g3.InterfaceC1740a;
import g3.ad;
import g3.ae;
import g3.w;
import k3.InterfaceC2002a;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.UninitializedPropertyAccessException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import t6.AbstractC3016k2;
import u3.InterfaceC3142e;
import u3.InterfaceC3143f;
import v3.InterfaceC3171a;
import z3.C3462a;

/* loaded from: classes2.dex */
public final /* synthetic */ class b implements Function0 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ CaptainLocationMonitoringService purple;

    public /* synthetic */ b(CaptainLocationMonitoringService captainLocationMonitoringService, int i4) {
        this.alpha = i4;
        this.purple = captainLocationMonitoringService;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x015e A[Catch: all -> 0x0194, TRY_LEAVE, TryCatch #2 {all -> 0x0194, blocks: (B:85:0x0141, B:88:0x0152, B:89:0x0182, B:92:0x018f, B:105:0x015e, B:108:0x0167, B:110:0x0176, B:111:0x017b), top: B:84:0x0141 }] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0176 A[Catch: all -> 0x0194, TRY_ENTER, TryCatch #2 {all -> 0x0194, blocks: (B:85:0x0141, B:88:0x0152, B:89:0x0182, B:92:0x018f, B:105:0x015e, B:108:0x0167, B:110:0x0176, B:111:0x017b), top: B:84:0x0141 }] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x017b A[Catch: all -> 0x0194, TryCatch #2 {all -> 0x0194, blocks: (B:85:0x0141, B:88:0x0152, B:89:0x0182, B:92:0x018f, B:105:0x015e, B:108:0x0167, B:110:0x0176, B:111:0x017b), top: B:84:0x0141 }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01ae  */
    @Override // kotlin.jvm.functions.Function0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        LastSentLocationStore lastSentLocationStore;
        Object m206constructorimpl;
        Float f5;
        float f10;
        F8.k kVar;
        F8.e eVar;
        F8.g charlie;
        Double d4;
        Double d9;
        double d10;
        float f11;
        Captain captain;
        Integer id2;
        switch (this.alpha) {
            case 0:
                boolean z2 = CaptainLocationMonitoringService.f12066D;
                LocationFeatureFactory locationFeatureFactory = LocationFeatureFactory.INSTANCE;
                CaptainLocationMonitoringService captainLocationMonitoringService = this.purple;
                LocationBroadcastConfig charlie2 = captainLocationMonitoringService.charlie();
                InterfaceC3142e interfaceC3142e = captainLocationMonitoringService.f12083b;
                if (interfaceC3142e != null) {
                    LocationPayloadMapper locationPayloadMapper = captainLocationMonitoringService.f12096p;
                    if (locationPayloadMapper != null) {
                        UserInfoProvider userInfoProvider = captainLocationMonitoringService.f12090j;
                        if (userInfoProvider != null) {
                            StompStateHolder stompStateHolder = captainLocationMonitoringService.f12091k;
                            if (stompStateHolder != null) {
                                AllowMockProvider allowMockProvider = captainLocationMonitoringService.f12092l;
                                if (allowMockProvider != null) {
                                    InterfaceC1740a interfaceC1740a = captainLocationMonitoringService.f12093m;
                                    if (interfaceC1740a != null) {
                                        InterfaceC2002a interfaceC2002a = captainLocationMonitoringService.f12094n;
                                        if (interfaceC2002a != null) {
                                            LastSentLocationStore lastSentLocationStore2 = captainLocationMonitoringService.teal;
                                            if (lastSentLocationStore2 != null) {
                                                w wVar = captainLocationMonitoringService.f12088h;
                                                if (wVar != null) {
                                                    InterfaceC3143f interfaceC3143f = captainLocationMonitoringService.silver;
                                                    Object obj = null;
                                                    if (interfaceC3143f != null) {
                                                        Nb.i iVar = captainLocationMonitoringService.f12087g;
                                                        if (iVar != null) {
                                                            try {
                                                                Result.Companion companion = Result.INSTANCE;
                                                                kVar = E8.b.echo().hotel;
                                                                eVar = kVar.charlie;
                                                                charlie = eVar.charlie();
                                                                lastSentLocationStore = lastSentLocationStore2;
                                                            } catch (Throwable th) {
                                                                th = th;
                                                                lastSentLocationStore = lastSentLocationStore2;
                                                            }
                                                            if (charlie != null) {
                                                                try {
                                                                    try {
                                                                        d4 = Double.valueOf(charlie.bravo.getDouble("location_max_accuracy_meters"));
                                                                    } catch (Throwable th2) {
                                                                        th = th2;
                                                                        Result.Companion companion2 = Result.INSTANCE;
                                                                        m206constructorimpl = Result.m206constructorimpl(ResultKt.createFailure(th));
                                                                        if (!(m206constructorimpl instanceof kotlin.k)) {
                                                                        }
                                                                        f5 = (Float) obj;
                                                                        if (f5 != null) {
                                                                        }
                                                                        return locationFeatureFactory.create(captainLocationMonitoringService, charlie2, interfaceC3142e, locationPayloadMapper, userInfoProvider, stompStateHolder, allowMockProvider, interfaceC1740a, interfaceC2002a, lastSentLocationStore, wVar, interfaceC3143f, iVar, f10, captainLocationMonitoringService.f12104x);
                                                                    }
                                                                } catch (JSONException unused) {
                                                                    d4 = null;
                                                                }
                                                                if (d4 == null) {
                                                                    Double d11 = d4;
                                                                    kVar.bravo("location_max_accuracy_meters", eVar.charlie());
                                                                    d10 = d11.doubleValue();
                                                                } else {
                                                                    F8.g charlie3 = kVar.delta.charlie();
                                                                    if (charlie3 != null) {
                                                                        try {
                                                                            d9 = Double.valueOf(charlie3.bravo.getDouble("location_max_accuracy_meters"));
                                                                        } catch (JSONException unused2) {
                                                                            d9 = null;
                                                                        }
                                                                        if (d9 == null) {
                                                                            d10 = d9.doubleValue();
                                                                        } else {
                                                                            F8.k.foxtrot("location_max_accuracy_meters", "Double");
                                                                            d10 = 0.0d;
                                                                        }
                                                                    }
                                                                    d9 = null;
                                                                    if (d9 == null) {
                                                                    }
                                                                }
                                                                f11 = (float) d10;
                                                                Float valueOf = Float.valueOf(f11);
                                                                if (f11 > 0.0f) {
                                                                    valueOf = null;
                                                                }
                                                                m206constructorimpl = Result.m206constructorimpl(valueOf);
                                                                if (!(m206constructorimpl instanceof kotlin.k)) {
                                                                    obj = m206constructorimpl;
                                                                }
                                                                f5 = (Float) obj;
                                                                if (f5 != null) {
                                                                    f10 = f5.floatValue();
                                                                } else {
                                                                    f10 = 150.0f;
                                                                }
                                                                return locationFeatureFactory.create(captainLocationMonitoringService, charlie2, interfaceC3142e, locationPayloadMapper, userInfoProvider, stompStateHolder, allowMockProvider, interfaceC1740a, interfaceC2002a, lastSentLocationStore, wVar, interfaceC3143f, iVar, f10, captainLocationMonitoringService.f12104x);
                                                            }
                                                            d4 = null;
                                                            if (d4 == null) {
                                                            }
                                                            f11 = (float) d10;
                                                            Float valueOf2 = Float.valueOf(f11);
                                                            if (f11 > 0.0f) {
                                                            }
                                                            m206constructorimpl = Result.m206constructorimpl(valueOf2);
                                                            if (!(m206constructorimpl instanceof kotlin.k)) {
                                                            }
                                                            f5 = (Float) obj;
                                                            if (f5 != null) {
                                                            }
                                                            return locationFeatureFactory.create(captainLocationMonitoringService, charlie2, interfaceC3142e, locationPayloadMapper, userInfoProvider, stompStateHolder, allowMockProvider, interfaceC1740a, interfaceC2002a, lastSentLocationStore, wVar, interfaceC3143f, iVar, f10, captainLocationMonitoringService.f12104x);
                                                        }
                                                        Intrinsics.lima("diagnostics");
                                                        throw null;
                                                    }
                                                    Intrinsics.lima("remoteConfigProvider");
                                                    throw null;
                                                }
                                                Intrinsics.lima("locationSendFacade");
                                                throw null;
                                            }
                                            Intrinsics.lima("lastSentLocationStore");
                                            throw null;
                                        }
                                        Intrinsics.lima("complianceUiHandler");
                                        throw null;
                                    }
                                    Intrinsics.lima("complianceChecker");
                                    throw null;
                                }
                                Intrinsics.lima("allowMockProvider");
                                throw null;
                            }
                            Intrinsics.lima("stompStateHolder");
                            throw null;
                        }
                        Intrinsics.lima("userInfoProvider");
                        throw null;
                    }
                    Intrinsics.lima("locationPayloadMapper");
                    throw null;
                }
                Intrinsics.lima("logger");
                throw null;
            case 1:
                boolean z10 = CaptainLocationMonitoringService.f12066D;
                Log.i("LocationFlow", "🚦 [STOMP_TRANSPORT] STOMP V2 (OkHttp WebSocket)");
                C3462a.alpha("LocationFlow", 12, "🚦 [STOMP_TRANSPORT] STOMP V2 (OkHttp WebSocket)", null);
                CaptainLocationMonitoringService captainLocationMonitoringService2 = this.purple;
                InterfaceC3143f interfaceC3143f2 = captainLocationMonitoringService2.silver;
                if (interfaceC3143f2 != null) {
                    InterfaceC3142e interfaceC3142e2 = captainLocationMonitoringService2.f12083b;
                    if (interfaceC3142e2 != null) {
                        InterfaceC3171a interfaceC3171a = captainLocationMonitoringService2.white;
                        if (interfaceC3171a != null) {
                            d dVar = (d) captainLocationMonitoringService2.f12084c.getValue();
                            ae aeVar = captainLocationMonitoringService2.yellow;
                            if (aeVar != null) {
                                ad adVar = captainLocationMonitoringService2.f12082a;
                                if (adVar != null) {
                                    return new n(captainLocationMonitoringService2, interfaceC3143f2, interfaceC3142e2, interfaceC3171a, dVar, aeVar, adVar, new b(captainLocationMonitoringService2, 2), new Vc.i(16), new b(captainLocationMonitoringService2, 3), new b(captainLocationMonitoringService2, 4));
                                }
                                Intrinsics.lima("stompTokenProvider");
                                throw null;
                            }
                            Intrinsics.lima("stompUrlProvider");
                            throw null;
                        }
                        Intrinsics.lima("stompRuntime");
                        throw null;
                    }
                    Intrinsics.lima("logger");
                    throw null;
                }
                Intrinsics.lima("remoteConfigProvider");
                throw null;
            case 2:
                boolean z11 = CaptainLocationMonitoringService.f12066D;
                CaptainLocationMonitoringService captainLocationMonitoringService3 = this.purple;
                if (CaptainLocationMonitoringService.f12069G.get() && captainLocationMonitoringService3.e && AbstractC3016k2.bravo(captainLocationMonitoringService3.bravo())) {
                    try {
                        captainLocationMonitoringService3.delta().retryPendingSettingsResolution();
                        Log.i("LocationFlow", "[STOMP_CONNECTED] STOMP connected - checked for pending settings resolution");
                        C3462a.alpha("LocationFlow", 12, "[STOMP_CONNECTED] STOMP connected - checked for pending settings resolution", null);
                    } catch (UninitializedPropertyAccessException unused3) {
                    }
                    W1.b.alpha(captainLocationMonitoringService3.bravo()).charlie(new Intent("SOCKET_CONNECT_MESSAGE"));
                }
                return Unit.INSTANCE;
            case 3:
                boolean z12 = CaptainLocationMonitoringService.f12066D;
                UserInfo sierra = L9.d.sierra(this.purple.bravo());
                if (sierra == null || (captain = sierra.getCaptain()) == null || (id2 = captain.getId()) == null) {
                    return null;
                }
                return ao.ad.zulu(id2.intValue(), "/topic/location-");
            default:
                Z9.c cVar = this.purple.f12089i;
                if (cVar != null) {
                    cVar.bravo.charlie.incrementAndGet();
                    return Unit.INSTANCE;
                }
                Intrinsics.lima("locationSendMetrics");
                throw null;
        }
    }
}
