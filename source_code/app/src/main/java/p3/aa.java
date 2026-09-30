package p3;

import android.content.Context;
import android.content.res.Resources;
import android.location.LocationManager;
import android.os.Build;
import androidx.fragment.app.an;
import com.google.android.gms.common.api.ResolvableApiException;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l3.AbstractC2056a;
import t0.C2946x;
import u3.InterfaceC3142e;

/* loaded from: classes3.dex */
public final /* synthetic */ class aa extends kotlin.jvm.internal.i implements Xd.m {
    public final /* synthetic */ int alpha = 0;

    public /* synthetic */ aa(int i4, int i5, Class cls, Object obj, String str, String str2) {
        super(i4, i5, cls, obj, str, str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x02bf  */
    @Override // Xd.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        String str;
        LocationManager locationManager;
        boolean z2;
        B9.ab abVar;
        boolean z10;
        boolean z11;
        Exception exc;
        B9.ab abVar2;
        boolean z12;
        Exception exc2;
        an anVar;
        InterfaceC3142e interfaceC3142e;
        FusedLocationProviderClient fusedLocationProviderClient;
        switch (this.alpha) {
            case 0:
                Exception p02 = (Exception) obj;
                an anVar2 = (an) obj2;
                LocationRequest p22 = (LocationRequest) obj3;
                Intrinsics.echo(p02, "p0");
                Intrinsics.echo(p22, "p2");
                ab abVar3 = (ab) this.receiver;
                C2272d c2272d = abVar3.alpha;
                Context context = c2272d.alpha;
                String str2 = "DEGRADED";
                if (!AbstractC2056a.charlie(context)) {
                    str = "DEGRADED";
                } else {
                    str = "HIGH";
                }
                ah stompState = c2272d.foxtrot.getState();
                p02.printStackTrace();
                String message = p02.getMessage();
                String simpleName = p02.getClass().getSimpleName();
                StringBuilder india = av.q.india("[SETTINGS_FAILED] Location settings check FAILED | error=", message, " | accuracyMode=", str, " | STOMP=");
                india.append(stompState);
                india.append(" | exceptionType=");
                india.append(simpleName);
                String sb2 = india.toString();
                InterfaceC3142e interfaceC3142e2 = c2272d.charlie;
                interfaceC3142e2.alpha("LocationFlow", sb2);
                StringBuilder india2 = av.q.india("Location settings check failed: ", p02.getMessage(), " | accuracyMode=", str, " | STOMP=");
                india2.append(stompState);
                String message2 = india2.toString();
                Intrinsics.echo(message2, "message");
                try {
                    K7.b.alpha().bravo(message2);
                } catch (Exception unused) {
                }
                try {
                    K7.b.alpha().charlie(p02);
                } catch (Exception unused2) {
                }
                B9.ab abVar4 = abVar3.lima;
                Context context2 = (Context) abVar4.purple;
                Object systemService = context2.getSystemService("location");
                if (systemService instanceof LocationManager) {
                    locationManager = (LocationManager) systemService;
                } else {
                    locationManager = null;
                }
                InterfaceC3142e interfaceC3142e3 = (InterfaceC3142e) abVar4.white;
                if (locationManager == null) {
                    exc = p02;
                    abVar = abVar4;
                    z11 = false;
                } else {
                    try {
                        z2 = locationManager.isProviderEnabled("gps");
                    } catch (Exception unused3) {
                        z2 = false;
                    }
                    abVar = abVar4;
                    try {
                        z10 = locationManager.isProviderEnabled("network");
                    } catch (Exception unused4) {
                        z10 = false;
                    }
                    if (!z2 && !z10) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    if (AbstractC2056a.charlie(context2)) {
                        str2 = "HIGH";
                    }
                    exc = p02;
                    interfaceC3142e3.alpha("LocationFlow", "[PROVIDER_CHECK] Location providers check | GPS=" + z2 + " | Network=" + z10 + " | enabled=" + z11 + " | accuracyMode=" + str2);
                }
                boolean z13 = ((S9.a) c2272d.hotel).alpha() instanceof g3.q;
                if (z11 && z13 && !abVar3.hotel) {
                    interfaceC3142e2.alpha("LocationFlow", "[FALLBACK_REGISTER] Settings check failed BUT providers are enabled - attempting fallback registration | accuracyMode=" + str + " | STOMP=" + stompState);
                    try {
                        fusedLocationProviderClient = LocationServices.getFusedLocationProviderClient(context);
                        Intrinsics.delta(fusedLocationProviderClient, "getFusedLocationProviderClient(...)");
                        abVar3.quebec = System.currentTimeMillis();
                        abVar3.tango = false;
                    } catch (Exception e) {
                        e = e;
                        interfaceC3142e = interfaceC3142e3;
                    }
                    try {
                        interfaceC3142e = interfaceC3142e3;
                        abVar2 = abVar;
                    } catch (Exception e4) {
                        e = e4;
                        interfaceC3142e = interfaceC3142e3;
                        abVar2 = abVar;
                        interfaceC3142e2.alpha("LocationFlow", av.q.foxtrot("[FALLBACK_REGISTER_FAILED] Fallback registration failed | error=", e.getMessage(), " | accuracyMode=", str));
                        try {
                            K7.b.alpha().charlie(e);
                        } catch (Exception unused5) {
                        }
                        z12 = false;
                        abVar3.hotel = false;
                        interfaceC3142e3 = interfaceC3142e;
                        exc2 = exc;
                        if (!(exc2 instanceof ResolvableApiException)) {
                        }
                        return Unit.INSTANCE;
                    }
                    try {
                        m golf = abVar3.golf(p22, new v(abVar3), fusedLocationProviderClient, "NORMAL", c2272d.echo.getLocationInterval() + "ms", p22);
                        if (golf != null) {
                            interfaceC3142e2.alpha("LocationFlow", "[FALLBACK_REGISTER_SUCCESS] Location updates registered successfully (fallback mode) | accuracyMode=" + str + " | STOMP=" + stompState);
                            abVar3.india = new C2276h(golf, abVar3, 1);
                        }
                        interfaceC3142e3 = interfaceC3142e;
                        exc2 = exc;
                        z12 = false;
                    } catch (Exception e5) {
                        e = e5;
                        interfaceC3142e2.alpha("LocationFlow", av.q.foxtrot("[FALLBACK_REGISTER_FAILED] Fallback registration failed | error=", e.getMessage(), " | accuracyMode=", str));
                        K7.b.alpha().charlie(e);
                        z12 = false;
                        abVar3.hotel = false;
                        interfaceC3142e3 = interfaceC3142e;
                        exc2 = exc;
                        if (!(exc2 instanceof ResolvableApiException)) {
                        }
                        return Unit.INSTANCE;
                    }
                    if (!(exc2 instanceof ResolvableApiException)) {
                        if (anVar2 != null) {
                            z12 = true;
                        }
                        interfaceC3142e2.alpha("LocationFlow", "[SETTINGS_RESOLVABLE] Exception is resolvable - attempting resolution | accuracyMode=" + str + " | baseActivity=" + z12);
                        ResolvableApiException resolvableApiException = (ResolvableApiException) exc2;
                        Intrinsics.echo(stompState, "stompState");
                        if (anVar2 != null) {
                            try {
                                interfaceC3142e3.alpha("LocationFlow", "[SETTINGS_RESOLUTION] Launching resolution for location settings | accuracyMode=".concat(str));
                                anVar = anVar2;
                            } catch (Exception e10) {
                                e = e10;
                                anVar = anVar2;
                            }
                            try {
                                resolvableApiException.startResolutionForResult(anVar, 1002);
                                interfaceC3142e3.alpha("LocationFlow", "[SETTINGS_RESOLUTION_STARTED] Resolution started successfully | accuracyMode=".concat(str));
                            } catch (Exception e11) {
                                e = e11;
                                interfaceC3142e3.alpha("LocationFlow", av.q.foxtrot("[SETTINGS_RESOLUTION_FAILED] startResolutionForResult failed | error=", e.getMessage(), " | accuracyMode=", str));
                                try {
                                    K7.b.alpha().charlie(e);
                                } catch (Exception unused6) {
                                }
                                if (anVar == null) {
                                    interfaceC3142e2.alpha("LocationFlow", "[SETTINGS_RETRY_SCHEDULED] Will retry settings check when STOMP connects | accuracyMode=".concat(str));
                                }
                                return Unit.INSTANCE;
                            }
                        } else {
                            anVar = anVar2;
                            interfaceC3142e3.alpha("LocationFlow", "[SETTINGS_RESOLUTION_NO_ACTIVITY] Cannot resolve - baseActivity is null | accuracyMode=" + str + " | STOMP=" + stompState + " | storing exception for retry");
                            abVar2.silver = resolvableApiException;
                            abVar2.teal = null;
                            interfaceC3142e3.alpha("LocationFlow", "[SETTINGS_PENDING] Stored resolution for later; baseActivity=null. Will retry when activity available (e.g. Home on STOMP connect).");
                        }
                        if (anVar == null && stompState == ah.red && ((ResolvableApiException) abVar2.silver) != null) {
                            interfaceC3142e2.alpha("LocationFlow", "[SETTINGS_RETRY_SCHEDULED] Will retry settings check when STOMP connects | accuracyMode=".concat(str));
                        }
                    } else {
                        StringBuilder india3 = av.q.india("[SETTINGS_NON_RESOLVABLE] Location settings failed with non-resolvable exception | error=", exc2.getMessage(), " | accuracyMode=", str, " | STOMP=");
                        india3.append(stompState);
                        interfaceC3142e2.alpha("LocationFlow", india3.toString());
                    }
                    return Unit.INSTANCE;
                }
                abVar2 = abVar;
                z12 = false;
                if (!z11) {
                    interfaceC3142e2.alpha("LocationFlow", "[FALLBACK_SKIP] Fallback registration skipped - location providers not enabled | accuracyMode=".concat(str));
                } else if (!z13) {
                    interfaceC3142e2.alpha("LocationFlow", "[FALLBACK_SKIP] Fallback registration skipped - compliance check failed | accuracyMode=".concat(str));
                } else if (abVar3.hotel) {
                    interfaceC3142e2.alpha("LocationFlow", "[FALLBACK_SKIP] Fallback registration skipped - already registered | accuracyMode=".concat(str));
                }
                exc2 = exc;
                if (!(exc2 instanceof ResolvableApiException)) {
                }
                return Unit.INSTANCE;
            default:
                if (obj == null) {
                    C2946x c2946x = (C2946x) this.receiver;
                    Resources resources = c2946x.getContext().getResources();
                    W.b bVar = new W.b(new Q0.e(resources.getDisplayMetrics().density, resources.getConfiguration().fontScale), ((Z.e) obj2).alpha, (Function1) obj3);
                    if (Build.VERSION.SDK_INT >= 24) {
                        return Boolean.valueOf(t0.ah.alpha.alpha(c2946x, null, bVar));
                    }
                    throw null;
                }
                throw new ClassCastException();
        }
    }
}
