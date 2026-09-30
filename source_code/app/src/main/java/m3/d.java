package m3;

import T9.e;
import android.app.ActivityManager;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Build;
import android.provider.Settings;
import com.airbnb.lottie.compose.LottieConstants;
import delivery.samurai.android.R;
import delivery.samurai.android.services.CaptainLocationMonitoringService;
import g3.EnumC1741b;
import g3.EnumC1742c;
import h3.InterfaceC1804a;
import h3.InterfaceC1805b;
import h3.InterfaceC1806c;
import h3.InterfaceC1807d;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.y;
import kotlin.jvm.internal.Intrinsics;
import kotlin.k;
import o3.g;
import p3.ah;
import t6.AbstractC3016k2;

/* loaded from: classes3.dex */
public final class d {
    public final Context alpha;
    public final g bravo;
    public final InterfaceC1807d charlie;
    public final InterfaceC1804a delta;

    public d(Context context, g gVar, InterfaceC1806c interfaceC1806c, InterfaceC1807d interfaceC1807d, InterfaceC1805b interfaceC1805b, InterfaceC1804a interfaceC1804a) {
        this.alpha = context;
        this.bravo = gVar;
        this.charlie = interfaceC1807d;
        this.delta = interfaceC1804a;
    }

    public static final LinkedHashMap alpha(d dVar) {
        Object m206constructorimpl;
        C2097a bravo = dVar.bravo();
        LinkedHashMap amber = y.amber(bravo.delta);
        amber.put("reason", bravo.alpha.name());
        amber.put("stompLastCloseCode", CaptainLocationMonitoringService.f12070H);
        amber.put("stompLastCloseReason", CaptainLocationMonitoringService.f12071I);
        amber.put("stompLastErrorClass", CaptainLocationMonitoringService.f12072J);
        amber.put("stompLastConnectAttemptAt", CaptainLocationMonitoringService.f12073K);
        amber.put("serviceLastStartAt", CaptainLocationMonitoringService.Q);
        amber.put("deviceModel", Build.MODEL);
        amber.put("deviceBrand", Build.BRAND);
        amber.put("androidSdk", Integer.valueOf(Build.VERSION.SDK_INT));
        try {
            Result.Companion companion = Result.INSTANCE;
            boolean z2 = false;
            if (Settings.Global.getInt(dVar.alpha.getContentResolver(), "airplane_mode_on", 0) == 1) {
                z2 = true;
            }
            m206constructorimpl = Result.m206constructorimpl(Boolean.valueOf(z2));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m206constructorimpl = Result.m206constructorimpl(ResultKt.createFailure(th));
        }
        Boolean bool = Boolean.FALSE;
        if (m206constructorimpl instanceof k) {
            m206constructorimpl = bool;
        }
        Boolean bool2 = (Boolean) m206constructorimpl;
        bool2.getClass();
        amber.put("airplaneMode", bool2);
        return amber;
    }

    public final C2097a bravo() {
        Object obj;
        Object m206constructorimpl;
        NetworkCapabilities networkCapabilities;
        Object m206constructorimpl2;
        boolean z2;
        boolean z10;
        C2097a c2097a;
        C2097a c2097a2;
        C2097a c2097a3;
        C2097a c2097a4;
        C2097a c2097a5;
        C2097a c2097a6;
        Boolean bool;
        Boolean bool2;
        boolean z11;
        o3.b golf = this.bravo.golf();
        Context context = this.alpha;
        ConnectivityManager cm = (ConnectivityManager) context.getSystemService(ConnectivityManager.class);
        try {
            Result.Companion companion = Result.INSTANCE;
            obj = Result.m206constructorimpl(cm.getActiveNetwork());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            obj = Result.m206constructorimpl(ResultKt.createFailure(th));
        }
        boolean z12 = obj instanceof k;
        Object obj2 = obj;
        if (z12) {
            obj2 = null;
        }
        Network network = (Network) obj2;
        if (network != null) {
            try {
                m206constructorimpl = Result.m206constructorimpl(cm.getNetworkCapabilities(network));
            } catch (Throwable th2) {
                Result.Companion companion3 = Result.INSTANCE;
                m206constructorimpl = Result.m206constructorimpl(ResultKt.createFailure(th2));
            }
            if (m206constructorimpl instanceof k) {
                m206constructorimpl = null;
            }
            networkCapabilities = (NetworkCapabilities) m206constructorimpl;
        } else {
            networkCapabilities = null;
        }
        Intrinsics.checkNotNull(cm);
        Intrinsics.echo(cm, "cm");
        try {
            Network[] allNetworks = cm.getAllNetworks();
            Intrinsics.delta(allNetworks, "getAllNetworks(...)");
            int length = allNetworks.length;
            int i4 = 0;
            while (true) {
                if (i4 < length) {
                    NetworkCapabilities networkCapabilities2 = cm.getNetworkCapabilities(allNetworks[i4]);
                    if (networkCapabilities2 != null && networkCapabilities2.hasTransport(4)) {
                        z11 = true;
                        break;
                    }
                    i4++;
                } else {
                    z11 = false;
                    break;
                }
            }
            m206constructorimpl2 = Result.m206constructorimpl(Boolean.valueOf(z11));
        } catch (Throwable th3) {
            Result.Companion companion4 = Result.INSTANCE;
            m206constructorimpl2 = Result.m206constructorimpl(ResultKt.createFailure(th3));
        }
        Boolean bool3 = Boolean.FALSE;
        if (m206constructorimpl2 instanceof k) {
            m206constructorimpl2 = bool3;
        }
        Boolean bool4 = (Boolean) m206constructorimpl2;
        bool4.getClass();
        boolean z13 = CaptainLocationMonitoringService.f12066D;
        boolean bravo = AbstractC3016k2.bravo(context);
        try {
            List<ActivityManager.RunningServiceInfo> runningServices = ((ActivityManager) context.getSystemService(ActivityManager.class)).getRunningServices(LottieConstants.IterateForever);
            Intrinsics.delta(runningServices, "getRunningServices(...)");
            if (!runningServices.isEmpty()) {
                Iterator<T> it = runningServices.iterator();
                while (it.hasNext()) {
                    if (Intrinsics.areEqual(((ActivityManager.RunningServiceInfo) it.next()).service.getClassName(), CaptainLocationMonitoringService.class.getName())) {
                        z2 = true;
                        break;
                    }
                }
            }
            z2 = false;
        } catch (Throwable unused) {
            z2 = CaptainLocationMonitoringService.f12069G.get();
        }
        boolean z14 = golf.bravo;
        Pair pair = new Pair("precisePermissionGranted", Boolean.valueOf(z14));
        boolean z15 = golf.delta;
        boolean z16 = false;
        Pair pair2 = new Pair("locationEnabled", Boolean.valueOf(z15));
        boolean z17 = golf.oscar;
        Pair pair3 = new Pair("internetConnected", Boolean.valueOf(z17));
        boolean z18 = golf.november;
        Pair pair4 = new Pair("networkValidated", Boolean.valueOf(z18));
        boolean z19 = golf.golf;
        Pair pair5 = new Pair("dataSaverEnabled", Boolean.valueOf(z19));
        boolean z20 = golf.foxtrot;
        LinkedHashMap tango = y.tango(pair, pair2, pair3, pair4, pair5, new Pair("backgroundRestricted", Boolean.valueOf(z20)), new Pair("batterySaverEnabled", Boolean.valueOf(golf.quebec)), new Pair("googleLocationAccuracyEnabled", Boolean.valueOf(golf.papa)), new Pair("serviceEnabled", Boolean.valueOf(bravo)), new Pair("serviceRunning", Boolean.valueOf(z2)), new Pair("vpnActive", bool4), new Pair("stompState", ((ah) CaptainLocationMonitoringService.f12067E.getValue()).name()), new Pair("sdk", Integer.valueOf(Build.VERSION.SDK_INT)));
        if (CaptainLocationMonitoringService.f12072J == null && CaptainLocationMonitoringService.f12071I == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        InterfaceC1807d interfaceC1807d = this.charlie;
        if (!z14) {
            EnumC1742c enumC1742c = EnumC1742c.alpha;
            String string = ((e) interfaceC1807d).alpha.getString(R.string.diag_permission_required);
            Intrinsics.delta(string, "getString(...)");
            c2097a = new C2097a(enumC1742c, string, EnumC1741b.red, tango);
        } else {
            c2097a = null;
        }
        if (c2097a == null) {
            if (!z15) {
                EnumC1742c enumC1742c2 = EnumC1742c.purple;
                String string2 = ((e) interfaceC1807d).alpha.getString(R.string.diag_location_off);
                Intrinsics.delta(string2, "getString(...)");
                c2097a2 = new C2097a(enumC1742c2, string2, EnumC1741b.purple, tango);
            } else {
                c2097a2 = null;
            }
            if (c2097a2 == null) {
                if (!z17) {
                    EnumC1742c enumC1742c3 = EnumC1742c.red;
                    String string3 = ((e) interfaceC1807d).alpha.getString(R.string.diag_no_internet);
                    Intrinsics.delta(string3, "getString(...)");
                    c2097a3 = new C2097a(enumC1742c3, string3, EnumC1741b.alpha, tango);
                } else if (z17 && !z18) {
                    EnumC1742c enumC1742c4 = EnumC1742c.silver;
                    String string4 = ((e) interfaceC1807d).alpha.getString(R.string.diag_captive_portal);
                    Intrinsics.delta(string4, "getString(...)");
                    c2097a3 = new C2097a(enumC1742c4, string4, EnumC1741b.alpha, tango);
                } else {
                    c2097a3 = null;
                }
                if (c2097a3 == null) {
                    if (z19) {
                        EnumC1742c enumC1742c5 = EnumC1742c.teal;
                        String string5 = ((e) interfaceC1807d).alpha.getString(R.string.diag_data_saver);
                        Intrinsics.delta(string5, "getString(...)");
                        c2097a4 = new C2097a(enumC1742c5, string5, EnumC1741b.red, tango);
                    } else if (z20) {
                        EnumC1742c enumC1742c6 = EnumC1742c.white;
                        String string6 = ((e) interfaceC1807d).alpha.getString(R.string.diag_background_restricted);
                        Intrinsics.delta(string6, "getString(...)");
                        c2097a4 = new C2097a(enumC1742c6, string6, EnumC1741b.red, tango);
                    } else {
                        c2097a4 = null;
                    }
                    if (c2097a4 == null) {
                        if (bravo && z2) {
                            c2097a5 = null;
                        } else {
                            EnumC1742c enumC1742c7 = EnumC1742c.yellow;
                            String string7 = ((e) interfaceC1807d).alpha.getString(R.string.diag_service_stopped);
                            Intrinsics.delta(string7, "getString(...)");
                            c2097a5 = new C2097a(enumC1742c7, string7, EnumC1741b.silver, tango);
                        }
                        if (c2097a5 == null) {
                            if (z10) {
                                EnumC1742c enumC1742c8 = EnumC1742c.f12645d;
                                String string8 = ((e) interfaceC1807d).alpha.getString(R.string.diag_ws_error);
                                Intrinsics.delta(string8, "getString(...)");
                                c2097a6 = new C2097a(enumC1742c8, string8, EnumC1741b.teal, tango);
                            } else {
                                c2097a6 = null;
                            }
                            if (c2097a6 == null) {
                                EnumC1742c enumC1742c9 = EnumC1742c.e;
                                String string9 = ((e) interfaceC1807d).alpha.getString(R.string.diag_unspecified_issue);
                                Intrinsics.delta(string9, "getString(...)");
                                EnumC1741b enumC1741b = EnumC1741b.teal;
                                if (network != null) {
                                    z16 = true;
                                }
                                tango.put("hasActiveNetwork", Boolean.valueOf(z16));
                                if (networkCapabilities != null) {
                                    bool = Boolean.valueOf(networkCapabilities.hasCapability(12));
                                } else {
                                    bool = null;
                                }
                                tango.put("hasNetInternetCap", bool);
                                if (networkCapabilities != null) {
                                    bool2 = Boolean.valueOf(networkCapabilities.hasCapability(16));
                                } else {
                                    bool2 = null;
                                }
                                tango.put("hasNetValidatedCap", bool2);
                                return new C2097a(enumC1742c9, string9, enumC1741b, tango);
                            }
                            return c2097a6;
                        }
                        return c2097a5;
                    }
                    return c2097a4;
                }
                return c2097a3;
            }
            return c2097a2;
        }
        return c2097a;
    }
}
