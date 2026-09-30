package A8;

import A2.s;
import C8.aa;
import C8.i;
import C8.o;
import C8.r;
import C8.t;
import C8.u;
import android.content.Context;
import android.text.TextUtils;
import androidx.appcompat.widget.P0;
import av.q;
import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.perf.session.SessionManager;
import com.google.protobuf.AbstractC1511n;
import i8.InterfaceC1904b;
import j8.C1946c;
import j8.InterfaceC1947d;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import pe.AbstractC2327c;
import r8.C2508c;
import r8.InterfaceC2507b;
import s6.V4;
import s8.C2837a;
import t6.AbstractC3065u2;
import u8.C3146a;
import w8.C3239a;

/* loaded from: classes2.dex */
public final class h implements InterfaceC2507b {

    /* renamed from: k, reason: collision with root package name */
    public static final C3146a f17k = C3146a.delta();

    /* renamed from: l, reason: collision with root package name */
    public static final h f18l = new h();

    /* renamed from: a, reason: collision with root package name */
    public b f19a;
    public final ConcurrentHashMap alpha;

    /* renamed from: c, reason: collision with root package name */
    public Context f21c;

    /* renamed from: d, reason: collision with root package name */
    public C2837a f22d;
    public e e;

    /* renamed from: f, reason: collision with root package name */
    public C2508c f23f;

    /* renamed from: g, reason: collision with root package name */
    public C8.e f24g;

    /* renamed from: h, reason: collision with root package name */
    public String f25h;

    /* renamed from: i, reason: collision with root package name */
    public String f26i;
    public B7.g silver;
    public q8.b teal;
    public InterfaceC1947d white;
    public InterfaceC1904b yellow;
    public final ConcurrentLinkedQueue purple = new ConcurrentLinkedQueue();
    public final AtomicBoolean red = new AtomicBoolean(false);

    /* renamed from: j, reason: collision with root package name */
    public boolean f27j = false;

    /* renamed from: b, reason: collision with root package name */
    public final ThreadPoolExecutor f20b = new ThreadPoolExecutor(0, 1, 10, TimeUnit.SECONDS, new LinkedBlockingQueue());

    public h() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.alpha = concurrentHashMap;
        concurrentHashMap.put("KEY_AVAILABLE_TRACES_FOR_CACHING", 50);
        concurrentHashMap.put("KEY_AVAILABLE_NETWORK_REQUESTS_FOR_CACHING", 50);
        concurrentHashMap.put("KEY_AVAILABLE_GAUGES_FOR_CACHING", 50);
    }

    public static String alpha(u uVar) {
        long j5;
        String str;
        if (uVar.bravo()) {
            aa charlie = uVar.charlie();
            long coral = charlie.coral();
            Locale locale = Locale.ENGLISH;
            return q.golf("trace metric: ", charlie.crimson(), " (duration: ", new DecimalFormat("#.####").format(coral / 1000.0d), "ms)");
        }
        if (uVar.delta()) {
            r echo = uVar.echo();
            if (echo.ochre()) {
                j5 = echo.green();
            } else {
                j5 = 0;
            }
            if (echo.lime()) {
                str = String.valueOf(echo.cyan());
            } else {
                str = "UNKNOWN";
            }
            Locale locale2 = Locale.ENGLISH;
            return P0.gold(q.india("network request trace: ", echo.ivory(), " (responseCode: ", str, ", responseTime: "), new DecimalFormat("#.####").format(j5 / 1000.0d), "ms)");
        }
        if (uVar.alpha()) {
            o foxtrot = uVar.foxtrot();
            Locale locale3 = Locale.ENGLISH;
            boolean amber = foxtrot.amber();
            int xray = foxtrot.xray();
            int whiskey = foxtrot.whiskey();
            StringBuilder sb2 = new StringBuilder("gauges (hasMetadata: ");
            sb2.append(amber);
            sb2.append(", cpuGaugeCount: ");
            sb2.append(xray);
            sb2.append(", memoryGaugeCount: ");
            return P0.cyan(sb2, whiskey, ")");
        }
        return "log";
    }

    public final void bravo(t tVar) {
        if (tVar.bravo()) {
            this.f23f.bravo("_fstec");
        } else if (tVar.delta()) {
            this.f23f.bravo("_fsntc");
        }
    }

    public final void charlie(aa aaVar, i iVar) {
        this.f20b.execute(new s(this, aaVar, iVar, 3));
    }

    /* JADX WARN: Code restructure failed: missing block: B:115:0x02ef, code lost:
    
        if (A8.e.alpha(r0.charlie().cyan()) != false) goto L118;
     */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01a5  */
    /* JADX WARN: Type inference failed for: r9v15, types: [s8.u, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void delta(C8.s sVar, i iVar) {
        q8.b bVar;
        Map map;
        boolean z2;
        boolean bravo;
        boolean z10;
        s8.u uVar;
        double d4;
        String xray;
        String str;
        int i4 = 0;
        if (!this.red.get()) {
            ConcurrentHashMap concurrentHashMap = this.alpha;
            Integer num = (Integer) concurrentHashMap.get("KEY_AVAILABLE_TRACES_FOR_CACHING");
            int intValue = num.intValue();
            Integer num2 = (Integer) concurrentHashMap.get("KEY_AVAILABLE_NETWORK_REQUESTS_FOR_CACHING");
            int intValue2 = num2.intValue();
            Integer num3 = (Integer) concurrentHashMap.get("KEY_AVAILABLE_GAUGES_FOR_CACHING");
            int intValue3 = num3.intValue();
            if (sVar.bravo() && intValue > 0) {
                concurrentHashMap.put("KEY_AVAILABLE_TRACES_FOR_CACHING", Integer.valueOf(intValue - 1));
            } else if (sVar.delta() && intValue2 > 0) {
                concurrentHashMap.put("KEY_AVAILABLE_NETWORK_REQUESTS_FOR_CACHING", Integer.valueOf(intValue2 - 1));
            } else if (sVar.alpha() && intValue3 > 0) {
                concurrentHashMap.put("KEY_AVAILABLE_GAUGES_FOR_CACHING", Integer.valueOf(intValue3 - 1));
            } else {
                f17k.bravo("%s is not allowed to cache. Cache exhausted the limit (availableTracesForCaching: %d, availableNetworkRequestsForCaching: %d, availableGaugesForCaching: %d).", alpha(sVar), num, num2, num3);
                return;
            }
            f17k.bravo("Transport is not initialized yet, %s will be queued for to be dispatched later", alpha(sVar));
            this.purple.add(new c(sVar, iVar));
            return;
        }
        C3146a c3146a = f17k;
        if (this.f22d.tango() && (!((C8.g) this.f24g.purple).amber() || this.f27j)) {
            try {
                str = (String) V4.alpha(((C1946c) this.white).delta(), 60000L, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e) {
                c3146a.charlie("Task to retrieve Installation Id is interrupted: %s", e.getMessage());
                str = null;
                if (TextUtils.isEmpty(str)) {
                }
                C8.e eVar = this.f24g;
                eVar.india();
                C8.g.tango((C8.g) eVar.purple, iVar);
                if (!sVar.bravo()) {
                }
                AbstractC1511n abstractC1511n = (AbstractC1511n) eVar.alpha.juliet(5);
                abstractC1511n.purple = eVar.hotel();
                eVar = (C8.e) abstractC1511n;
                if (this.teal == null) {
                    C3146a c3146a2 = q8.b.bravo;
                    this.teal = (q8.b) B7.g.charlie().bravo(q8.b.class);
                }
                bVar = this.teal;
                if (bVar == null) {
                }
                eVar.india();
                C8.g.uniform((C8.g) eVar.purple).putAll(map);
                sVar.india();
                t.sierra((t) sVar.purple, (C8.g) eVar.golf());
                t tVar = (t) sVar.golf();
                if (this.f22d.tango()) {
                }
                z10 = false;
                if (z10) {
                }
            } catch (ExecutionException e4) {
                c3146a.charlie("Unable to retrieve Installation Id: %s", e4.getMessage());
                str = null;
                if (TextUtils.isEmpty(str)) {
                }
                C8.e eVar2 = this.f24g;
                eVar2.india();
                C8.g.tango((C8.g) eVar2.purple, iVar);
                if (!sVar.bravo()) {
                }
                AbstractC1511n abstractC1511n2 = (AbstractC1511n) eVar2.alpha.juliet(5);
                abstractC1511n2.purple = eVar2.hotel();
                eVar2 = (C8.e) abstractC1511n2;
                if (this.teal == null) {
                }
                bVar = this.teal;
                if (bVar == null) {
                }
                eVar2.india();
                C8.g.uniform((C8.g) eVar2.purple).putAll(map);
                sVar.india();
                t.sierra((t) sVar.purple, (C8.g) eVar2.golf());
                t tVar2 = (t) sVar.golf();
                if (this.f22d.tango()) {
                }
                z10 = false;
                if (z10) {
                }
            } catch (TimeoutException e5) {
                c3146a.charlie("Task to retrieve Installation Id is timed out: %s", e5.getMessage());
                str = null;
                if (TextUtils.isEmpty(str)) {
                }
                C8.e eVar22 = this.f24g;
                eVar22.india();
                C8.g.tango((C8.g) eVar22.purple, iVar);
                if (!sVar.bravo()) {
                }
                AbstractC1511n abstractC1511n22 = (AbstractC1511n) eVar22.alpha.juliet(5);
                abstractC1511n22.purple = eVar22.hotel();
                eVar22 = (C8.e) abstractC1511n22;
                if (this.teal == null) {
                }
                bVar = this.teal;
                if (bVar == null) {
                }
                eVar22.india();
                C8.g.uniform((C8.g) eVar22.purple).putAll(map);
                sVar.india();
                t.sierra((t) sVar.purple, (C8.g) eVar22.golf());
                t tVar22 = (t) sVar.golf();
                if (this.f22d.tango()) {
                }
                z10 = false;
                if (z10) {
                }
            }
            if (TextUtils.isEmpty(str)) {
                C8.e eVar3 = this.f24g;
                eVar3.india();
                C8.g.victor((C8.g) eVar3.purple, str);
            } else {
                c3146a.foxtrot("Firebase Installation Id is empty, contact Firebase Support for debugging.");
            }
        }
        C8.e eVar222 = this.f24g;
        eVar222.india();
        C8.g.tango((C8.g) eVar222.purple, iVar);
        if (!sVar.bravo() || sVar.delta()) {
            AbstractC1511n abstractC1511n222 = (AbstractC1511n) eVar222.alpha.juliet(5);
            abstractC1511n222.purple = eVar222.hotel();
            eVar222 = (C8.e) abstractC1511n222;
            if (this.teal == null && this.red.get()) {
                C3146a c3146a22 = q8.b.bravo;
                this.teal = (q8.b) B7.g.charlie().bravo(q8.b.class);
            }
            bVar = this.teal;
            if (bVar == null) {
                map = new HashMap(bVar.alpha);
            } else {
                map = Collections.EMPTY_MAP;
            }
            eVar222.india();
            C8.g.uniform((C8.g) eVar222.purple).putAll(map);
        }
        sVar.india();
        t.sierra((t) sVar.purple, (C8.g) eVar222.golf());
        t tVar222 = (t) sVar.golf();
        if (this.f22d.tango()) {
            f17k.echo("Performance collection is not enabled, dropping %s", alpha(tVar222));
        } else if (!tVar222.whiskey().amber()) {
            f17k.golf("App Instance ID is null or empty, dropping %s", alpha(tVar222));
        } else {
            Context context = this.f21c;
            ArrayList arrayList = new ArrayList();
            if (tVar222.bravo()) {
                arrayList.add(new w8.d(tVar222.charlie()));
            }
            if (tVar222.delta()) {
                arrayList.add(new w8.c(tVar222.echo(), context));
            }
            if (tVar222.xray()) {
                arrayList.add(new C3239a(tVar222.whiskey()));
            }
            if (tVar222.alpha()) {
                arrayList.add(new w8.b(tVar222.foxtrot()));
            }
            if (arrayList.isEmpty()) {
                C3146a.delta().alpha("No validators found for PerfMetric.");
            } else {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (!((w8.e) it.next()).alpha()) {
                    }
                }
                e eVar4 = this.e;
                eVar4.getClass();
                if (tVar222.bravo()) {
                    C2837a c2837a = eVar4.alpha;
                    c2837a.getClass();
                    synchronized (s8.u.class) {
                        try {
                            if (s8.u.alpha == null) {
                                s8.u.alpha = new Object();
                            }
                            uVar = s8.u.alpha;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    RemoteConfigManager remoteConfigManager = c2837a.alpha;
                    uVar.getClass();
                    B8.e eVar5 = remoteConfigManager.getDouble("fpr_vc_trace_sampling_rate");
                    if (eVar5.bravo() && C2837a.uniform(((Double) eVar5.alpha()).doubleValue())) {
                        c2837a.charlie.echo("com.google.firebase.perf.TraceSamplingRate", ((Double) eVar5.alpha()).doubleValue());
                        d4 = ((Double) eVar5.alpha()).doubleValue();
                    } else {
                        B8.e bravo2 = c2837a.bravo(uVar);
                        if (bravo2.bravo() && C2837a.uniform(((Double) bravo2.alpha()).doubleValue())) {
                            d4 = ((Double) bravo2.alpha()).doubleValue();
                        } else if (c2837a.alpha.isLastFetchFailed()) {
                            d4 = 0.001d;
                        } else {
                            d4 = 1.0d;
                        }
                    }
                    if (eVar4.bravo >= d4) {
                    }
                }
                if ((!tVar222.bravo() || !tVar222.charlie().crimson().startsWith("_st_") || !tVar222.charlie().azure() || eVar4.bravo() || e.alpha(tVar222.charlie().cyan())) && (!tVar222.delta() || eVar4.charlie() || e.alpha(tVar222.echo().emerald()))) {
                    e eVar6 = this.e;
                    eVar6.getClass();
                    if ((tVar222.bravo() && ((tVar222.charlie().crimson().equals("_fs") || tVar222.charlie().crimson().equals("_bs")) && tVar222.charlie().beige() > 0)) || tVar222.alpha()) {
                        z2 = false;
                    } else {
                        if (tVar222.delta()) {
                            bravo = eVar6.echo.bravo();
                        } else if (tVar222.bravo()) {
                            bravo = eVar6.delta.bravo();
                        } else {
                            z2 = true;
                        }
                        z2 = !bravo;
                    }
                    if (z2) {
                        bravo(tVar222);
                        f17k.echo("Rate limited (per device) - %s", alpha(tVar222));
                    } else {
                        z10 = true;
                        if (z10) {
                            boolean bravo3 = tVar222.bravo();
                            C3146a c3146a3 = f17k;
                            if (bravo3) {
                                String alpha = alpha(tVar222);
                                String crimson = tVar222.charlie().crimson();
                                if (crimson.startsWith("_st_")) {
                                    xray = AbstractC2327c.xray(AbstractC3065u2.bravo(this.f26i, this.f25h), "/troubleshooting/trace/SCREEN_TRACE/", crimson, "?utm_source=perf-android-sdk&utm_medium=android-ide");
                                } else {
                                    xray = AbstractC2327c.xray(AbstractC3065u2.bravo(this.f26i, this.f25h), "/troubleshooting/trace/DURATION_TRACE/", crimson, "?utm_source=perf-android-sdk&utm_medium=android-ide");
                                }
                                c3146a3.echo("Logging %s. In a minute, visit the Firebase console to view your data: %s", alpha, xray);
                            } else {
                                c3146a3.echo("Logging %s", alpha(tVar222));
                            }
                            b bVar2 = this.f19a;
                            E5.r rVar = bVar2.charlie;
                            C3146a c3146a4 = b.delta;
                            if (rVar == null) {
                                B5.f fVar = (B5.f) bVar2.bravo.get();
                                if (fVar != null) {
                                    bVar2.charlie = ((E5.q) fVar).alpha(bVar2.alpha, new B5.c("proto"), new a(i4));
                                } else {
                                    c3146a4.foxtrot("Flg TransportFactory is not available at the moment");
                                }
                            }
                            E5.r rVar2 = bVar2.charlie;
                            if (rVar2 != null) {
                                rVar2.alpha(new B5.a(tVar222, B5.d.alpha, null), new a(9));
                            } else {
                                c3146a4.foxtrot("Unable to dispatch event because Flg Transport is not available");
                            }
                            SessionManager.getInstance().stopGaugeCollectionIfSessionRunningTooLong();
                            return;
                        }
                        return;
                    }
                }
                bravo(tVar222);
                f17k.echo("Event dropped due to device sampling - %s", alpha(tVar222));
            }
            f17k.golf("Unable to process the PerfMetric (%s) due to missing or invalid values. See earlier log statements for additional information on the specific missing/invalid values.", alpha(tVar222));
            break;
        }
        z10 = false;
        if (z10) {
        }
    }

    @Override // r8.InterfaceC2507b
    public final void onUpdateAppState(i iVar) {
        boolean z2;
        if (iVar == i.FOREGROUND) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f27j = z2;
        if (this.red.get()) {
            this.f20b.execute(new f(this, 0));
        }
    }
}
