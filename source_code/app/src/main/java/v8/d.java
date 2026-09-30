package v8;

import A2.s;
import A8.h;
import C8.p;
import C8.r;
import C8.w;
import com.google.firebase.perf.session.PerfSession;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.session.gauges.GaugeManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import okhttp3.HttpUrl;
import r8.C2508c;
import u8.C3146a;
import x8.g;
import y8.InterfaceC3402a;

/* loaded from: classes2.dex */
public final class d extends r8.d implements InterfaceC3402a {

    /* renamed from: a, reason: collision with root package name */
    public static final C3146a f13989a = C3146a.delta();
    public final List alpha;
    public final GaugeManager purple;
    public final h red;
    public final p silver;
    public final WeakReference teal;
    public String white;
    public boolean yellow;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public d(h hVar) {
        super(r0);
        C2508c alpha = C2508c.alpha();
        GaugeManager gaugeManager = GaugeManager.getInstance();
        this.silver = r.orange();
        this.teal = new WeakReference(this);
        this.red = hVar;
        this.purple = gaugeManager;
        this.alpha = Collections.synchronizedList(new ArrayList());
        registerForAppState();
    }

    @Override // y8.InterfaceC3402a
    public final void charlie(PerfSession perfSession) {
        if (perfSession == null) {
            f13989a.foxtrot("Unable to add new SessionId to the Network Trace. Continuing without it.");
            return;
        }
        p pVar = this.silver;
        if (((r) pVar.purple).jade() && !((r) pVar.purple).ochre()) {
            this.alpha.add(perfSession);
        }
    }

    public final void delta() {
        List unmodifiableList;
        SessionManager.getInstance().unregisterForSessionUpdates(this.teal);
        unregisterForAppState();
        synchronized (this.alpha) {
            try {
                ArrayList arrayList = new ArrayList();
                for (PerfSession perfSession : this.alpha) {
                    if (perfSession != null) {
                        arrayList.add(perfSession);
                    }
                }
                unmodifiableList = Collections.unmodifiableList(arrayList);
            } catch (Throwable th) {
                throw th;
            }
        }
        w[] delta = PerfSession.delta(unmodifiableList);
        if (delta != null) {
            p pVar = this.silver;
            List asList = Arrays.asList(delta);
            pVar.india();
            r.azure((r) pVar.purple, asList);
        }
        r rVar = (r) this.silver.golf();
        String str = this.white;
        if (str != null) {
            if (g.alpha.matcher(str).matches()) {
                f13989a.alpha("Dropping network request from a 'User-Agent' that is not allowed");
                return;
            }
        } else {
            Pattern pattern = g.alpha;
        }
        if (!this.yellow) {
            h hVar = this.red;
            hVar.f20b.execute(new s(hVar, rVar, getAppState(), 4));
            this.yellow = true;
        }
    }

    public final void echo(String str) {
        int i4 = 8;
        if (str != null) {
            String upperCase = str.toUpperCase();
            upperCase.getClass();
            char c3 = 65535;
            switch (upperCase.hashCode()) {
                case -531492226:
                    if (upperCase.equals("OPTIONS")) {
                        c3 = 0;
                        break;
                    }
                    break;
                case 70454:
                    if (upperCase.equals("GET")) {
                        c3 = 1;
                        break;
                    }
                    break;
                case 79599:
                    if (upperCase.equals("PUT")) {
                        c3 = 2;
                        break;
                    }
                    break;
                case 2213344:
                    if (upperCase.equals("HEAD")) {
                        c3 = 3;
                        break;
                    }
                    break;
                case 2461856:
                    if (upperCase.equals("POST")) {
                        c3 = 4;
                        break;
                    }
                    break;
                case 75900968:
                    if (upperCase.equals("PATCH")) {
                        c3 = 5;
                        break;
                    }
                    break;
                case 80083237:
                    if (upperCase.equals("TRACE")) {
                        c3 = 6;
                        break;
                    }
                    break;
                case 1669334218:
                    if (upperCase.equals("CONNECT")) {
                        c3 = 7;
                        break;
                    }
                    break;
                case 2012838315:
                    if (upperCase.equals("DELETE")) {
                        c3 = '\b';
                        break;
                    }
                    break;
            }
            switch (c3) {
                case 0:
                    break;
                case 1:
                    i4 = 2;
                    break;
                case 2:
                    i4 = 3;
                    break;
                case 3:
                    i4 = 6;
                    break;
                case 4:
                    i4 = 4;
                    break;
                case 5:
                    i4 = 7;
                    break;
                case 6:
                    i4 = 9;
                    break;
                case 7:
                    i4 = 10;
                    break;
                case '\b':
                    i4 = 5;
                    break;
                default:
                    i4 = 1;
                    break;
            }
            p pVar = this.silver;
            pVar.india();
            r.beige((r) pVar.purple, i4);
        }
    }

    public final void foxtrot(int i4) {
        p pVar = this.silver;
        pVar.india();
        r.uniform((r) pVar.purple, i4);
    }

    public final void golf(long j5) {
        p pVar = this.silver;
        pVar.india();
        r.black((r) pVar.purple, j5);
    }

    public final void hotel(long j5) {
        PerfSession perfSession = SessionManager.getInstance().perfSession();
        SessionManager.getInstance().registerForSessionUpdates(this.teal);
        p pVar = this.silver;
        pVar.india();
        r.xray((r) pVar.purple, j5);
        charlie(perfSession);
        if (perfSession.red) {
            this.purple.collectGaugeMetricOnce(perfSession.purple);
        }
    }

    public final void india(String str) {
        p pVar = this.silver;
        if (str == null) {
            pVar.india();
            r.whiskey((r) pVar.purple);
            return;
        }
        if (str.length() <= 128) {
            for (int i4 = 0; i4 < str.length(); i4++) {
                char charAt = str.charAt(i4);
                if (charAt > 31 && charAt <= 127) {
                }
            }
            pVar.india();
            r.victor((r) pVar.purple, str);
            return;
        }
        f13989a.foxtrot("The content type of the response is not a valid content-type:".concat(str));
    }

    public final void juliet(long j5) {
        p pVar = this.silver;
        pVar.india();
        r.blue((r) pVar.purple, j5);
    }

    public final void kilo(long j5) {
        p pVar = this.silver;
        pVar.india();
        r.amber((r) pVar.purple, j5);
        if (SessionManager.getInstance().perfSession().red) {
            this.purple.collectGaugeMetricOnce(SessionManager.getInstance().perfSession().purple);
        }
    }

    public final void lima(String str) {
        int lastIndexOf;
        if (str != null) {
            HttpUrl parse = HttpUrl.parse(str);
            if (parse != null) {
                str = parse.newBuilder().username("").password("").query(null).fragment(null).toString();
            }
            if (str.length() > 2000) {
                if (str.charAt(2000) == '/') {
                    str = str.substring(0, 2000);
                } else {
                    HttpUrl parse2 = HttpUrl.parse(str);
                    if (parse2 == null) {
                        str = str.substring(0, 2000);
                    } else if (parse2.encodedPath().lastIndexOf(47) >= 0 && (lastIndexOf = str.lastIndexOf(47, 1999)) >= 0) {
                        str = str.substring(0, lastIndexOf);
                    } else {
                        str = str.substring(0, 2000);
                    }
                }
            }
            p pVar = this.silver;
            pVar.india();
            r.sierra((r) pVar.purple, str);
        }
    }
}
