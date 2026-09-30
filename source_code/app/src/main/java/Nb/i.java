package Nb;

import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.location.LocationManager;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.os.Build;
import android.os.Bundle;
import android.os.PowerManager;
import android.provider.Settings;
import android.text.TextUtils;
import av.q;
import com.google.android.gms.internal.measurement.C1379u0;
import com.google.android.gms.internal.measurement.C1383v0;
import com.google.android.gms.internal.measurement.C1395y0;
import com.google.android.gms.measurement.internal.C1436c;
import com.google.android.gms.measurement.internal.C1450j;
import com.google.android.gms.measurement.internal.G;
import com.google.android.gms.measurement.internal.Z0;
import com.google.android.gms.measurement.internal.ar;
import com.google.android.gms.measurement.internal.au;
import com.google.android.gms.measurement.internal.zzbf;
import com.google.android.gms.measurement.internal.zzbh;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import com.google.firebase.perf.util.Timer;
import com.google.maps.android.BuildConfig;
import delivery.samurai.android.services.CaptainLocationMonitoringService;
import g1.AbstractC1735d;
import g3.InterfaceC1748i;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.k;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.Response;
import pe.AbstractC2327c;
import u3.InterfaceC3142e;
import yf.AbstractC3428A;
import yf.N;

/* loaded from: classes2.dex */
public final class i implements InterfaceC1748i, Callback {
    public final /* synthetic */ int alpha = 0;
    public long purple;
    public Object red;
    public Object silver;
    public Object teal;

    public i(long j5, Bundle bundle, String str, String str2) {
        this.red = str;
        this.silver = str2;
        this.teal = bundle;
        this.purple = j5;
    }

    public static i echo(zzbh zzbhVar) {
        Bundle o5 = zzbhVar.purple.o();
        return new i(zzbhVar.silver, o5, zzbhVar.alpha, zzbhVar.red);
    }

    public void alpha(String reason, long j5, boolean z2) {
        String str;
        Object m206constructorimpl;
        Object m206constructorimpl2;
        boolean z10;
        boolean z11;
        boolean z12;
        Object m206constructorimpl3;
        Object m206constructorimpl4;
        Object m206constructorimpl5;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        String l10;
        String concat;
        String l11;
        Intrinsics.echo(reason, "reason");
        long currentTimeMillis = System.currentTimeMillis();
        if (!z2 && currentTimeMillis - this.purple < j5) {
            return;
        }
        this.purple = currentTimeMillis;
        Pair pair = (Pair) ((Vc.i) this.teal).invoke();
        Long l12 = (Long) pair.first;
        Long l13 = (Long) pair.second;
        String str2 = BuildConfig.TRAVIS;
        if (l12 == null || (l11 = Long.valueOf(currentTimeMillis - l12.longValue()).toString()) == null || (str = l11.concat("ms ago")) == null) {
            str = BuildConfig.TRAVIS;
        }
        if (l13 != null && (l10 = Long.valueOf(currentTimeMillis - l13.longValue()).toString()) != null && (concat = l10.concat("ms ago")) != null) {
            str2 = concat;
        }
        CaptainLocationMonitoringService captainLocationMonitoringService = (CaptainLocationMonitoringService) this.red;
        Object systemService = captainLocationMonitoringService.getSystemService("power");
        Intrinsics.charlie(systemService, "null cannot be cast to non-null type android.os.PowerManager");
        boolean isPowerSaveMode = ((PowerManager) systemService).isPowerSaveMode();
        Object systemService2 = captainLocationMonitoringService.getSystemService("location");
        Intrinsics.charlie(systemService2, "null cannot be cast to non-null type android.location.LocationManager");
        LocationManager locationManager = (LocationManager) systemService2;
        try {
            Result.Companion companion = Result.INSTANCE;
            m206constructorimpl = Result.m206constructorimpl(Boolean.valueOf(locationManager.isProviderEnabled("gps")));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m206constructorimpl = Result.m206constructorimpl(ResultKt.createFailure(th));
        }
        Boolean bool = Boolean.FALSE;
        if (m206constructorimpl instanceof k) {
            m206constructorimpl = bool;
        }
        boolean booleanValue = ((Boolean) m206constructorimpl).booleanValue();
        try {
            m206constructorimpl2 = Result.m206constructorimpl(Boolean.valueOf(locationManager.isProviderEnabled("network")));
        } catch (Throwable th2) {
            Result.Companion companion3 = Result.INSTANCE;
            m206constructorimpl2 = Result.m206constructorimpl(ResultKt.createFailure(th2));
        }
        Boolean bool2 = Boolean.FALSE;
        if (m206constructorimpl2 instanceof k) {
            m206constructorimpl2 = bool2;
        }
        boolean booleanValue2 = ((Boolean) m206constructorimpl2).booleanValue();
        Object systemService3 = captainLocationMonitoringService.getSystemService("connectivity");
        Intrinsics.charlie(systemService3, "null cannot be cast to non-null type android.net.ConnectivityManager");
        ConnectivityManager connectivityManager = (ConnectivityManager) systemService3;
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
        if (networkCapabilities != null && networkCapabilities.hasTransport(0)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (networkCapabilities != null && networkCapabilities.hasTransport(1)) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (networkCapabilities != null && networkCapabilities.hasCapability(12)) {
            z12 = true;
        } else {
            z12 = false;
        }
        try {
            if (Settings.Secure.getInt(captainLocationMonitoringService.getContentResolver(), "location_mode") != 0) {
                z18 = true;
            } else {
                z18 = false;
            }
            m206constructorimpl3 = Result.m206constructorimpl(Boolean.valueOf(z18));
        } catch (Throwable th3) {
            Result.Companion companion4 = Result.INSTANCE;
            m206constructorimpl3 = Result.m206constructorimpl(ResultKt.createFailure(th3));
        }
        Boolean bool3 = Boolean.TRUE;
        if (m206constructorimpl3 instanceof k) {
            m206constructorimpl3 = bool3;
        }
        boolean booleanValue3 = ((Boolean) m206constructorimpl3).booleanValue();
        try {
            if (Settings.Global.getInt(captainLocationMonitoringService.getContentResolver(), "wifi_scan_always_enabled") == 1) {
                z17 = true;
            } else {
                z17 = false;
            }
            m206constructorimpl4 = Result.m206constructorimpl(Boolean.valueOf(z17));
        } catch (Throwable th4) {
            Result.Companion companion5 = Result.INSTANCE;
            m206constructorimpl4 = Result.m206constructorimpl(ResultKt.createFailure(th4));
        }
        Boolean bool4 = Boolean.FALSE;
        if (m206constructorimpl4 instanceof k) {
            m206constructorimpl4 = bool4;
        }
        boolean booleanValue4 = ((Boolean) m206constructorimpl4).booleanValue();
        try {
            if (Settings.Global.getInt(captainLocationMonitoringService.getContentResolver(), "ble_scan_always_enabled") == 1) {
                z16 = true;
            } else {
                z16 = false;
            }
            m206constructorimpl5 = Result.m206constructorimpl(Boolean.valueOf(z16));
        } catch (Throwable th5) {
            Result.Companion companion6 = Result.INSTANCE;
            m206constructorimpl5 = Result.m206constructorimpl(ResultKt.createFailure(th5));
        }
        Boolean bool5 = Boolean.FALSE;
        if (m206constructorimpl5 instanceof k) {
            m206constructorimpl5 = bool5;
        }
        boolean booleanValue5 = ((Boolean) m206constructorimpl5).booleanValue();
        if (Build.VERSION.SDK_INT < 34 || captainLocationMonitoringService.checkSelfPermission("android.permission.FOREGROUND_SERVICE_LOCATION") == 0) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (AbstractC1735d.alpha(captainLocationMonitoringService, "android.permission.ACCESS_FINE_LOCATION") == 0) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (AbstractC1735d.alpha(captainLocationMonitoringService, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
            z15 = true;
        } else {
            z15 = false;
        }
        boolean z19 = z15;
        StringBuilder india = q.india("🔎 Diagnostics[", reason, "] lastReceivedAt=", str, " lastSentAt=");
        india.append(str2);
        india.append(" powerSave=");
        india.append(isPowerSaveMode);
        india.append(" gpsEnabled=");
        india.append(booleanValue);
        india.append(" networkLoc=");
        india.append(booleanValue2);
        india.append(" glAccOn=");
        india.append(booleanValue3);
        india.append(" wifiScan=");
        india.append(booleanValue4);
        india.append(" btScan=");
        india.append(booleanValue5);
        india.append(" netCell=");
        india.append(z10);
        india.append(" netWifi=");
        india.append(z11);
        india.append(" netInternet=");
        india.append(z12);
        india.append(" fine=");
        india.append(z14);
        india.append(" coarse=");
        india.append(z19);
        india.append(" fgLoc=");
        india.append(z13);
        ((InterfaceC3142e) this.silver).alpha("LocationFlow", india.toString());
    }

    public boolean bravo(boolean z2) {
        N n5 = (N) this.red;
        if (((Boolean) n5.getValue()).booleanValue()) {
            return false;
        }
        Boolean bool = Boolean.TRUE;
        n5.getClass();
        n5.juliet(null, bool);
        this.teal = Boolean.valueOf(z2);
        this.purple++;
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x0109, code lost:
    
        if (r12 == null) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C1383v0 charlie(C1383v0 c1383v0, String str) {
        long j5;
        Cursor cursor;
        android.util.Pair pair;
        Object obj;
        String tango = c1383v0.tango();
        List uniform = c1383v0.uniform();
        C1436c c1436c = (C1436c) this.teal;
        Z0 z02 = c1436c.purple;
        z02.alpha();
        Long l10 = (Long) au.g0(c1383v0, "_eid");
        if (l10 != null) {
            boolean equals = tango.equals("_ep");
            G g2 = (G) c1436c.alpha;
            if (equals) {
                z02.alpha();
                String str2 = (String) au.g0(c1383v0, "_en");
                Cursor cursor2 = null;
                if (TextUtils.isEmpty(str2)) {
                    ar arVar = g2.f7507b;
                    G.foxtrot(arVar);
                    arVar.yellow.bravo(l10, "Extra parameter without an event name. eventId");
                    return null;
                }
                C1383v0 c1383v02 = (C1383v0) this.red;
                Z0 z03 = c1436c.purple;
                if (c1383v02 != null && ((Long) this.silver) != null && l10.longValue() == ((Long) this.silver).longValue()) {
                    j5 = 0;
                } else {
                    C1450j c1450j = z02.red;
                    Z0.cyan(c1450j);
                    G g5 = (G) c1450j.alpha;
                    c1450j.W();
                    c1450j.X();
                    try {
                        cursor = c1450j.S0().rawQuery("select main_event, children_to_process from main_event_params where app_id=? and event_id=?", new String[]{str, l10.toString()});
                        try {
                            try {
                                if (!cursor.moveToFirst()) {
                                    ar arVar2 = g5.f7507b;
                                    G.foxtrot(arVar2);
                                    arVar2.f7636g.alpha("Main event not found");
                                    cursor.close();
                                    pair = null;
                                    j5 = 0;
                                } else {
                                    j5 = 0;
                                    try {
                                        try {
                                            pair = android.util.Pair.create((C1383v0) ((C1379u0) au.C0(C1383v0.romeo(), cursor.getBlob(0))).echo(), Long.valueOf(cursor.getLong(1)));
                                            cursor.close();
                                        } catch (IOException e) {
                                            ar arVar3 = g5.f7507b;
                                            G.foxtrot(arVar3);
                                            arVar3.white.delta("Failed to merge main event. appId, eventId", ar.e0(str), l10, e);
                                            cursor.close();
                                            pair = null;
                                            if (pair == null) {
                                            }
                                            ar arVar4 = g2.f7507b;
                                            G.foxtrot(arVar4);
                                            arVar4.yellow.charlie(str2, l10, "Extra parameter without existing main event. eventName, eventId");
                                            return null;
                                        }
                                    } catch (SQLiteException e4) {
                                        e = e4;
                                        ar arVar5 = g5.f7507b;
                                        G.foxtrot(arVar5);
                                        arVar5.white.bravo(e, "Error selecting main event");
                                    }
                                }
                            } catch (Throwable th) {
                                th = th;
                                cursor2 = cursor;
                                if (cursor2 != null) {
                                    cursor2.close();
                                }
                                throw th;
                            }
                        } catch (SQLiteException e5) {
                            e = e5;
                            j5 = 0;
                        }
                    } catch (SQLiteException e10) {
                        e = e10;
                        j5 = 0;
                        cursor = null;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    if (pair == null && (obj = pair.first) != null) {
                        this.red = (C1383v0) obj;
                        this.purple = ((Long) pair.second).longValue();
                        z03.alpha();
                        this.silver = (Long) au.g0((C1383v0) this.red, "_eid");
                    } else {
                        ar arVar42 = g2.f7507b;
                        G.foxtrot(arVar42);
                        arVar42.yellow.charlie(str2, l10, "Extra parameter without existing main event. eventName, eventId");
                        return null;
                    }
                }
                long j6 = this.purple - 1;
                this.purple = j6;
                if (j6 <= j5) {
                    C1450j c1450j2 = z03.red;
                    Z0.cyan(c1450j2);
                    c1450j2.W();
                    G g10 = (G) c1450j2.alpha;
                    ar arVar6 = g10.f7507b;
                    G.foxtrot(arVar6);
                    arVar6.f7636g.bravo(str, "Clearing complex main event info. appId");
                    try {
                        c1450j2.S0().execSQL("delete from main_event_params where app_id=?", new String[]{str});
                    } catch (SQLiteException e11) {
                        ar arVar7 = g10.f7507b;
                        G.foxtrot(arVar7);
                        arVar7.white.bravo(e11, "Error clearing complex main event");
                    }
                } else {
                    C1450j c1450j3 = z03.red;
                    Z0.cyan(c1450j3);
                    c1450j3.I0(str, l10, this.purple, (C1383v0) this.red);
                }
                ArrayList arrayList = new ArrayList();
                for (C1395y0 c1395y0 : ((C1383v0) this.red).uniform()) {
                    z03.alpha();
                    if (au.f0(c1383v0, c1395y0.sierra()) == null) {
                        arrayList.add(c1395y0);
                    }
                }
                if (!arrayList.isEmpty()) {
                    arrayList.addAll(uniform);
                    uniform = arrayList;
                } else {
                    ar arVar8 = g2.f7507b;
                    G.foxtrot(arVar8);
                    arVar8.yellow.bravo(str2, "No unique parameters in main event. eventName");
                }
                tango = str2;
            } else {
                this.silver = l10;
                this.red = c1383v0;
                z02.alpha();
                Object obj2 = 0L;
                Object g02 = au.g0(c1383v0, "_epc");
                if (g02 != null) {
                    obj2 = g02;
                }
                long longValue = ((Long) obj2).longValue();
                this.purple = longValue;
                if (longValue <= 0) {
                    ar arVar9 = g2.f7507b;
                    G.foxtrot(arVar9);
                    arVar9.yellow.bravo(tango, "Complex event with zero extra param count. eventName");
                } else {
                    C1450j c1450j4 = z02.red;
                    Z0.cyan(c1450j4);
                    c1450j4.I0(str, l10, this.purple, c1383v0);
                }
            }
        }
        C1379u0 c1379u0 = (C1379u0) c1383v0.foxtrot();
        c1379u0.golf();
        C1383v0.zulu((C1383v0) c1379u0.purple, tango);
        c1379u0.golf();
        C1383v0.xray((C1383v0) c1379u0.purple);
        c1379u0.golf();
        C1383v0.victor((C1383v0) c1379u0.purple, uniform);
        return (C1383v0) c1379u0.echo();
    }

    public zzbh delta() {
        zzbf zzbfVar = new zzbf(new Bundle((Bundle) this.teal));
        return new zzbh((String) this.red, zzbfVar, (String) this.silver, this.purple);
    }

    @Override // okhttp3.Callback
    public void onFailure(Call call, IOException iOException) {
        Request request = call.request();
        v8.d dVar = (v8.d) this.silver;
        if (request != null) {
            HttpUrl url = request.url();
            if (url != null) {
                dVar.lima(url.url().toString());
            }
            if (request.method() != null) {
                dVar.echo(request.method());
            }
        }
        dVar.hotel(this.purple);
        AbstractC2327c.black((Timer) this.teal, dVar, dVar);
        ((Callback) this.red).onFailure(call, iOException);
    }

    @Override // okhttp3.Callback
    public void onResponse(Call call, Response response) {
        FirebasePerfOkHttpClient.alpha(response, (v8.d) this.silver, this.purple, ((Timer) this.teal).charlie());
        ((Callback) this.red).onResponse(call, response);
    }

    public String toString() {
        switch (this.alpha) {
            case 2:
                return "origin=" + ((String) this.silver) + ",name=" + ((String) this.red) + ",params=" + ((Bundle) this.teal).toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ i(C1436c c1436c) {
        this.teal = c1436c;
    }

    public i() {
        N charlie = AbstractC3428A.charlie(Boolean.FALSE);
        this.red = charlie;
        this.silver = charlie;
    }

    public i(CaptainLocationMonitoringService captainLocationMonitoringService, InterfaceC3142e interfaceC3142e, Vc.i iVar) {
        this.red = captainLocationMonitoringService;
        this.silver = interfaceC3142e;
        this.teal = iVar;
    }

    public i(Callback callback, A8.h hVar, Timer timer, long j5) {
        this.red = callback;
        this.silver = new v8.d(hVar);
        this.purple = j5;
        this.teal = timer;
    }
}
