package ca;

import X9.q;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkRequest;
import android.os.Build;
import android.util.Log;
import com.checkout.components.card.operations.network.utils.OkHttpConstants;
import com.checkout.components.redirecthandler.customtab.RedirectCustomTabEventLogger;
import com.clevertap.android.sdk.Constants;
import de.AbstractC1621d;
import delivery.samurai.android.services.CaptainLocationMonitoringService;
import g3.ad;
import g3.ae;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.y;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.WebSocket;
import s6.AbstractC2832z6;
import td.C3117a;
import u3.InterfaceC3142e;
import u3.InterfaceC3143f;
import v3.InterfaceC3171a;
import vf.Y;
import vf.a0;
import vf.ao;

/* loaded from: classes2.dex */
public final class n implements Z9.f {
    public static volatile n crimson;
    public final InterfaceC3143f alpha;
    public Y amber;
    public Y azure;
    public final AtomicLong beige;
    public Y black;
    public Y blue;
    public final InterfaceC3142e bravo;
    public F2.d bronze;
    public final InterfaceC3171a charlie;
    public final AtomicBoolean coral;
    public final Y9.d delta;
    public final ae echo;
    public final ad foxtrot;
    public final Y9.b golf;
    public final Vc.i hotel;
    public final Y9.b india;
    public final Y9.b juliet;
    public final Context kilo;
    public C3117a lima;
    public final boolean mike;
    public volatile String november;
    public final OkHttpClient oscar;
    public volatile WebSocket papa;
    public final AtomicBoolean quebec;
    public final AtomicBoolean romeo;
    public volatile boolean sierra;
    public volatile Long tango;
    public volatile int uniform;
    public volatile long victor;
    public volatile long whiskey;
    public volatile long xray;
    public volatile long yankee;
    public volatile long zulu;

    public n(Context context, InterfaceC3143f interfaceC3143f, InterfaceC3142e interfaceC3142e, InterfaceC3171a interfaceC3171a, Y9.d dVar, ae aeVar, ad adVar, Y9.b bVar, Vc.i iVar, Y9.b bVar2, Y9.b bVar3) {
        long j5;
        this.alpha = interfaceC3143f;
        this.bravo = interfaceC3142e;
        this.charlie = interfaceC3171a;
        this.delta = dVar;
        this.echo = aeVar;
        this.foxtrot = adVar;
        this.golf = bVar;
        this.hotel = iVar;
        this.india = bVar2;
        this.juliet = bVar3;
        Context applicationContext = context.getApplicationContext();
        Intrinsics.delta(applicationContext, "getApplicationContext(...)");
        this.kilo = applicationContext;
        a0 foxtrot = vf.ad.foxtrot();
        Cf.e eVar = ao.alpha;
        this.lima = vf.ad.charlie(AbstractC2832z6.charlie(foxtrot, Cf.d.purple));
        boolean z2 = CaptainLocationMonitoringService.f12066D;
        if (CaptainLocationMonitoringService.f12066D) {
            j5 = 15;
        } else {
            j5 = 25;
        }
        this.mike = ((N9.e) interfaceC3143f).alpha("stomp_v2_receipt_probe", false);
        this.oscar = new OkHttpClient.Builder().readTimeout(0L, TimeUnit.MILLISECONDS).pingInterval(j5, TimeUnit.SECONDS).build();
        this.quebec = new AtomicBoolean(false);
        this.romeo = new AtomicBoolean(false);
        this.beige = new AtomicLong(0L);
        this.coral = new AtomicBoolean(false);
        crimson = this;
    }

    public static boolean foxtrot(String str, String str2) {
        String str3;
        String str4 = "";
        if (str == null) {
            str3 = "";
        } else {
            str3 = str.toLowerCase(Locale.ROOT);
            Intrinsics.delta(str3, "toLowerCase(...)");
        }
        if (str2 != null) {
            str4 = str2.toLowerCase(Locale.ROOT);
            Intrinsics.delta(str4, "toLowerCase(...)");
        }
        if (!StringsKt.beige(str3, "401", false) && !StringsKt.beige(str3, "403", false) && !StringsKt.beige(str3, "unauthorized", false) && !StringsKt.beige(str3, "forbidden", false) && !StringsKt.beige(str3, Constants.AUTH, false)) {
            if ((!StringsKt.beige(str3, "token", false) || (!StringsKt.beige(str3, "invalid", false) && !StringsKt.beige(str3, "expired", false))) && !StringsKt.beige(str4, "unauthorized", false) && !StringsKt.beige(str4, "forbidden", false)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public static void golf(n nVar, String str, Map map, Long l10, Long l11, String str2, String str3, Long l12, int i4) {
        Map map2;
        Long l13;
        Long l14;
        String str4;
        String str5;
        Long l15;
        String str6;
        Integer num = null;
        if ((i4 & 2) != 0) {
            map2 = null;
        } else {
            map2 = map;
        }
        if ((i4 & 4) != 0) {
            l13 = null;
        } else {
            l13 = l10;
        }
        if ((i4 & 8) != 0) {
            l14 = null;
        } else {
            l14 = l11;
        }
        if ((i4 & 16) != 0) {
            str4 = null;
        } else {
            str4 = str2;
        }
        if ((i4 & 32) != 0) {
            str5 = null;
        } else {
            str5 = str3;
        }
        if ((i4 & 64) != 0) {
            l15 = null;
        } else {
            l15 = l12;
        }
        if (nVar.quebec.get()) {
            str6 = "CONNECTED";
        } else if (nVar.romeo.get()) {
            str6 = "CONNECTING";
        } else {
            str6 = "NOT_CONNECTED";
        }
        String str7 = str6;
        InterfaceC3171a interfaceC3171a = nVar.charlie;
        if (interfaceC3171a != null) {
            num = Integer.valueOf(interfaceC3171a.charlie());
        }
        String alpha = Z9.g.alpha(str, str7, null, num, l13, Long.valueOf(nVar.whiskey), str5, null, l14, l15, Integer.valueOf(nVar.uniform), str4, map2, 132);
        Log.i("SocketConnection", "[V2] " + alpha);
        nVar.bravo.alpha("SocketConnection", "[V2] " + alpha);
        if (nVar.delta != null) {
            Y9.d.alpha("[V2] " + alpha);
        }
    }

    public static String hotel(Long l10) {
        if (l10 == null) {
            return null;
        }
        if (l10.longValue() < OkHttpConstants.READ_TIMEOUT_MS) {
            return "SHORT";
        }
        if (l10.longValue() < 300000) {
            return "NORMAL";
        }
        return "LONG";
    }

    public final void alpha() {
        this.quebec.set(false);
        this.romeo.set(false);
        Y y10 = this.blue;
        if (y10 != null) {
            y10.foxtrot(null);
        }
        Y y11 = this.amber;
        if (y11 != null) {
            y11.foxtrot(null);
        }
        Y y12 = this.azure;
        if (y12 != null) {
            y12.foxtrot(null);
        }
        WebSocket webSocket = this.papa;
        if (webSocket != null) {
            webSocket.close(1000, "Auth error");
        }
        this.papa = null;
        InterfaceC3171a interfaceC3171a = this.charlie;
        if (interfaceC3171a != null) {
            interfaceC3171a.golf();
        }
    }

    public final void bravo(String str, String str2) {
        int i4;
        boolean z2;
        String str3;
        if (!this.romeo.compareAndSet(false, true)) {
            golf(this, "CONNECT_ATTEMPT", y.romeo(new Pair("skipped", "already_in_progress")), null, null, null, null, null, 124);
            return;
        }
        WebSocket webSocket = this.papa;
        if (webSocket != null) {
            webSocket.close(1000, "Replacing connection");
        }
        this.papa = null;
        InterfaceC3171a interfaceC3171a = this.charlie;
        if (interfaceC3171a != null) {
            i4 = interfaceC3171a.foxtrot();
        } else {
            i4 = 0;
        }
        this.victor = System.currentTimeMillis();
        InterfaceC3171a interfaceC3171a2 = this.charlie;
        if (interfaceC3171a2 != null) {
            interfaceC3171a2.november(this.victor);
        }
        InterfaceC3171a interfaceC3171a3 = this.charlie;
        if (interfaceC3171a3 != null) {
            interfaceC3171a3.mike();
        }
        this.whiskey = ((N9.e) this.alpha).bravo("stomp_heart_beat_interval", 30L) * 1000;
        this.coral.set(false);
        golf(this, "CONNECT_ATTEMPT", y.sierra(new Pair("attempt", String.valueOf(i4)), new Pair(Constants.KEY_URL, StringsKt.yellow(50, str))), null, null, null, null, null, 124);
        try {
            WebSocket newWebSocket = this.oscar.newWebSocket(new Request.Builder().url(str).build(), new h(this, str2, str));
            this.papa = newWebSocket;
            if (!this.sierra) {
                newWebSocket.close(1000, "Stopped during connect");
                if (this.papa == newWebSocket) {
                    this.papa = null;
                }
                this.romeo.set(false);
                return;
            }
            Y y10 = this.blue;
            if (y10 != null) {
                y10.foxtrot(null);
            }
            this.blue = vf.ad.zulu(this.lima, null, null, new g(newWebSocket, this, null), 3);
        } catch (Exception e) {
            long currentTimeMillis = System.currentTimeMillis();
            String amber = ao.ad.amber(e.getClass().getSimpleName(), ": ", e.getMessage());
            if (this.delta != null) {
                Y9.d.alpha("[V2] Connect error: " + amber);
            }
            juliet(e);
            this.romeo.set(false);
            InterfaceC3171a interfaceC3171a4 = this.charlie;
            if (interfaceC3171a4 != null) {
                interfaceC3171a4.delta(e.getClass().getSimpleName());
            }
            this.uniform++;
            InterfaceC3171a interfaceC3171a5 = this.charlie;
            if (interfaceC3171a5 != null) {
                interfaceC3171a5.golf();
            }
            InterfaceC3171a interfaceC3171a6 = this.charlie;
            if (interfaceC3171a6 != null) {
                interfaceC3171a6.bravo(null, amber);
            }
            InterfaceC3171a interfaceC3171a7 = this.charlie;
            if (interfaceC3171a7 != null) {
                interfaceC3171a7.echo(currentTimeMillis);
            }
            InterfaceC3171a interfaceC3171a8 = this.charlie;
            if (interfaceC3171a8 != null) {
                interfaceC3171a8.alpha(currentTimeMillis);
            }
            AtomicLong atomicLong = q.alpha;
            String message = e.getMessage();
            if (message != null && StringsKt.beige(message, "INTEGRITY_TIMESTAMP_", false)) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                golf(this, "INTEGRITY_TIMESTAMP_ERROR", y.romeo(new Pair("no_retry", "true")), null, null, null, null, null, 124);
                q.alpha(e.getMessage());
                alpha();
                this.sierra = false;
                return;
            }
            if (foxtrot(e.getMessage(), e.getClass().getName())) {
                golf(this, "AUTH_ERROR", y.romeo(new Pair("session_invalidated", "true")), null, null, null, null, null, 124);
                alpha();
                this.hotel.invoke();
                return;
            }
            String message2 = e.getMessage();
            if (message2 != null) {
                str3 = StringsKt.yellow(100, message2);
            } else {
                str3 = "unknown";
            }
            golf(this, "ERROR", y.sierra(new Pair(RedirectCustomTabEventLogger.RESULT_ERROR, str3), new Pair("errorClass", e.getClass().getSimpleName())), Long.valueOf(currentTimeMillis - this.victor), null, null, null, null, 120);
            if (this.sierra) {
                kilo();
            }
        }
    }

    public final void charlie() {
        ConnectivityManager connectivityManager;
        Object m206constructorimpl;
        if (!this.sierra) {
            this.sierra = true;
            crimson = this;
            if (!vf.ad.xray(this.lima)) {
                a0 foxtrot = vf.ad.foxtrot();
                Cf.e eVar = ao.alpha;
                this.lima = vf.ad.charlie(AbstractC2832z6.charlie(foxtrot, Cf.d.purple));
            }
            kilo();
            if (this.bronze == null) {
                Object systemService = this.kilo.getSystemService("connectivity");
                if (systemService instanceof ConnectivityManager) {
                    connectivityManager = (ConnectivityManager) systemService;
                } else {
                    connectivityManager = null;
                }
                if (connectivityManager != null) {
                    F2.d dVar = new F2.d(4, this);
                    try {
                        Result.Companion companion = Result.INSTANCE;
                        if (Build.VERSION.SDK_INT >= 24) {
                            connectivityManager.registerDefaultNetworkCallback(dVar);
                        } else {
                            connectivityManager.registerNetworkCallback(new NetworkRequest.Builder().addCapability(12).build(), dVar);
                        }
                        m206constructorimpl = Result.m206constructorimpl(Unit.INSTANCE);
                    } catch (Throwable th) {
                        Result.Companion companion2 = Result.INSTANCE;
                        m206constructorimpl = Result.m206constructorimpl(ResultKt.createFailure(th));
                    }
                    if (!(m206constructorimpl instanceof kotlin.k)) {
                        this.bronze = dVar;
                    }
                    Throwable m207exceptionOrNullimpl = Result.m207exceptionOrNullimpl(m206constructorimpl);
                    if (m207exceptionOrNullimpl != null && this.delta != null) {
                        Y9.d.alpha("[V2] network callback register failed: ".concat(m207exceptionOrNullimpl.getClass().getSimpleName()));
                    }
                }
            }
        }
    }

    public final void delta(String str, String str2, Throwable th) {
        Long l10;
        InterfaceC3171a interfaceC3171a;
        InterfaceC3171a interfaceC3171a2;
        if (this.coral.compareAndSet(false, true)) {
            this.quebec.set(false);
            this.romeo.set(false);
            WebSocket webSocket = this.papa;
            if (webSocket != null) {
                webSocket.close(1000, "Disconnecting");
            }
            this.papa = null;
            Y y10 = this.blue;
            if (y10 != null) {
                y10.foxtrot(null);
            }
            Y y11 = this.amber;
            if (y11 != null) {
                y11.foxtrot(null);
            }
            Y y12 = this.azure;
            if (y12 != null) {
                y12.foxtrot(null);
            }
            Long l11 = this.tango;
            if (l11 != null) {
                l10 = Long.valueOf(System.currentTimeMillis() - l11.longValue());
            } else {
                l10 = null;
            }
            this.tango = null;
            this.uniform++;
            long currentTimeMillis = System.currentTimeMillis();
            InterfaceC3171a interfaceC3171a3 = this.charlie;
            if (interfaceC3171a3 != null) {
                interfaceC3171a3.golf();
            }
            InterfaceC3171a interfaceC3171a4 = this.charlie;
            if (interfaceC3171a4 != null) {
                interfaceC3171a4.bravo(null, str2);
            }
            InterfaceC3171a interfaceC3171a5 = this.charlie;
            if (interfaceC3171a5 != null) {
                interfaceC3171a5.echo(currentTimeMillis);
            }
            InterfaceC3171a interfaceC3171a6 = this.charlie;
            if (interfaceC3171a6 != null) {
                interfaceC3171a6.alpha(currentTimeMillis);
            }
            if (l10 != null) {
                long longValue = l10.longValue();
                InterfaceC3171a interfaceC3171a7 = this.charlie;
                if (interfaceC3171a7 != null) {
                    interfaceC3171a7.india(longValue);
                }
            }
            if (th != null && (interfaceC3171a2 = this.charlie) != null) {
                interfaceC3171a2.delta(th.getClass().getSimpleName());
            }
            if (th != null) {
                if (this.delta != null) {
                    Y9.d.alpha("[V2] " + th.getClass().getSimpleName() + ": " + th.getMessage());
                }
                juliet(th);
            }
            if (l10 != null && l10.longValue() > 300000 && (interfaceC3171a = this.charlie) != null) {
                interfaceC3171a.hotel();
            }
            golf(this, str, null, null, l10, hotel(l10), StringsKt.yellow(100, str2), null, 70);
            if (this.sierra) {
                kilo();
            }
        }
    }

    public final void echo() {
        golf(this, "HARD_RESTART", y.romeo(new Pair("consecutiveFailures", String.valueOf(this.uniform))), null, null, null, null, null, 124);
        lima();
        this.uniform = 0;
        this.victor = 0L;
        charlie();
    }

    public final void india(String str) {
        Long l10;
        long currentTimeMillis = System.currentTimeMillis();
        Long l11 = this.tango;
        if (l11 != null) {
            l10 = Long.valueOf(currentTimeMillis - l11.longValue());
        } else {
            l10 = null;
        }
        this.quebec.set(false);
        this.uniform++;
        if (l10 != null) {
            long longValue = l10.longValue();
            InterfaceC3171a interfaceC3171a = this.charlie;
            if (interfaceC3171a != null) {
                interfaceC3171a.india(longValue);
            }
        }
        InterfaceC3171a interfaceC3171a2 = this.charlie;
        if (interfaceC3171a2 != null) {
            interfaceC3171a2.golf();
        }
        InterfaceC3171a interfaceC3171a3 = this.charlie;
        if (interfaceC3171a3 != null) {
            interfaceC3171a3.bravo(null, str);
        }
        InterfaceC3171a interfaceC3171a4 = this.charlie;
        if (interfaceC3171a4 != null) {
            interfaceC3171a4.echo(currentTimeMillis);
        }
        InterfaceC3171a interfaceC3171a5 = this.charlie;
        if (interfaceC3171a5 != null) {
            interfaceC3171a5.alpha(currentTimeMillis);
        }
        this.tango = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0082, code lost:
    
        if (r3 == null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0084, code lost:
    
        kotlin.jvm.internal.Intrinsics.echo(r8, "throwable");
        K7.b.alpha().charlie(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0090, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void juliet(Throwable throwable) {
        Y9.d dVar;
        String str;
        List list;
        Set set = Z9.h.alpha;
        Throwable th = throwable;
        int i4 = 0;
        loop0: while (true) {
            dVar = this.delta;
            if (th != null && i4 < 6) {
                if (Z9.h.alpha.contains(th.getClass().getSimpleName())) {
                    break;
                }
                String message = th.getMessage();
                if (message != null) {
                    str = message.toLowerCase(Locale.ROOT);
                    Intrinsics.delta(str, "toLowerCase(...)");
                } else {
                    str = null;
                }
                if (str != null && ((list = Z9.h.bravo) == null || !list.isEmpty())) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        if (StringsKt.beige(str, (String) it.next(), false)) {
                            break loop0;
                        }
                    }
                }
                th = th.getCause();
                i4++;
            } else {
                break;
            }
        }
        if (dVar != null) {
            Y9.d.alpha("STOMP_NET_DROP origin=stomp_v2 cls=" + throwable.getClass().getSimpleName() + " msg=" + throwable.getMessage());
        }
    }

    public final void kilo() {
        String str;
        String str2;
        boolean z2;
        boolean z10;
        Long l10;
        Long kilo;
        int i4 = 0;
        if (!this.sierra) {
            return;
        }
        ae aeVar = this.echo;
        if (aeVar != null) {
            str = aeVar.alpha();
        } else {
            str = null;
        }
        ad adVar = this.foxtrot;
        if (adVar != null) {
            str2 = adVar.alpha();
        } else {
            str2 = null;
        }
        if (str != null && !StringsKt.gray(str) && str2 != null && !StringsKt.gray(str2)) {
            long j5 = 0;
            if (this.victor == 0) {
                bravo(str, str2);
                return;
            }
            int i5 = this.uniform;
            if (i5 >= 0) {
                i4 = i5;
            }
            if (i4 > 3) {
                i4 = 3;
            }
            long min = Math.min((1 << i4) * 10, 60L);
            long j6 = 100 * min;
            if (j6 < 0) {
                j6 = 0;
            }
            if (j6 > 1) {
                j5 = AbstractC1621d.alpha.echo(j6);
            }
            long j7 = (min * 1000) + j5;
            InterfaceC3171a interfaceC3171a = this.charlie;
            if (interfaceC3171a != null && (kilo = interfaceC3171a.kilo()) != null) {
                l10 = Long.valueOf(System.currentTimeMillis() - kilo.longValue());
            } else {
                l10 = null;
            }
            golf(this, "RETRY", null, l10, null, null, null, Long.valueOf(j7), 58);
            Y y10 = this.black;
            if (y10 != null) {
                y10.foxtrot(null);
            }
            this.black = vf.ad.zulu(this.lima, null, null, new k(j7, null, this), 3);
            return;
        }
        Pair pair = new Pair("reason", "url_or_token_null");
        if (str != null && !StringsKt.gray(str)) {
            z2 = false;
        } else {
            z2 = true;
        }
        Pair pair2 = new Pair(Constants.KEY_HAS_URL, String.valueOf(!z2));
        if (str2 != null && !StringsKt.gray(str2)) {
            z10 = false;
        } else {
            z10 = true;
        }
        golf(this, "NO_SESSION", y.sierra(pair, pair2, new Pair("hasToken", String.valueOf(!z10))), null, null, null, null, null, 124);
        Y y11 = this.black;
        if (y11 != null) {
            y11.foxtrot(null);
        }
        this.black = vf.ad.zulu(this.lima, null, null, new j(this, null), 3);
    }

    public final void lima() {
        int i4;
        ConnectivityManager connectivityManager;
        Unit unit;
        this.sierra = false;
        InterfaceC3171a interfaceC3171a = this.charlie;
        if (interfaceC3171a != null) {
            i4 = interfaceC3171a.charlie();
        } else {
            i4 = 0;
        }
        golf(this, "STOP", y.romeo(new Pair("attemptAtStop", String.valueOf(i4))), null, null, null, null, null, 124);
        Y y10 = this.black;
        if (y10 != null) {
            y10.foxtrot(null);
        }
        this.black = null;
        Y y11 = this.blue;
        if (y11 != null) {
            y11.foxtrot(null);
        }
        this.blue = null;
        F2.d dVar = this.bronze;
        if (dVar != null) {
            this.bronze = null;
            Object systemService = this.kilo.getSystemService("connectivity");
            if (systemService instanceof ConnectivityManager) {
                connectivityManager = (ConnectivityManager) systemService;
            } else {
                connectivityManager = null;
            }
            try {
                Result.Companion companion = Result.INSTANCE;
                if (connectivityManager != null) {
                    connectivityManager.unregisterNetworkCallback(dVar);
                    unit = Unit.INSTANCE;
                } else {
                    unit = null;
                }
                Result.m206constructorimpl(unit);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                Result.m206constructorimpl(ResultKt.createFailure(th));
            }
        }
        Y y12 = this.amber;
        if (y12 != null) {
            y12.foxtrot(null);
        }
        this.amber = null;
        Y y13 = this.azure;
        if (y13 != null) {
            y13.foxtrot(null);
        }
        this.azure = null;
        WebSocket webSocket = this.papa;
        if (webSocket != null) {
            webSocket.close(1000, "Service stopped");
        }
        this.papa = null;
        this.november = null;
        this.quebec.set(false);
        this.romeo.set(false);
        InterfaceC3171a interfaceC3171a2 = this.charlie;
        if (interfaceC3171a2 != null) {
            interfaceC3171a2.golf();
        }
        if (crimson == this) {
            crimson = null;
        }
        vf.ad.kilo(this.lima, null);
    }
}
