package j8;

import I7.l;
import V5.x;
import android.net.TrafficStats;
import android.text.TextUtils;
import android.util.Log;
import av.q;
import com.google.android.gms.measurement.internal.C1477x;
import com.google.android.material.internal.ab;
import com.google.android.play.core.integrity.k;
import com.google.firebase.installations.FirebaseInstallationsException;
import i8.InterfaceC1904b;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import k8.C2019a;
import k8.C2020b;
import l8.C2060a;
import org.json.JSONException;
import org.json.JSONObject;
import s6.V4;

/* renamed from: j8.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1946c implements InterfaceC1947d {
    public static final Object mike = new Object();
    public final B7.g alpha;
    public final l8.c bravo;
    public final ab charlie;
    public final C1953j delta;
    public final l echo;
    public final C1951h foxtrot;
    public final Object golf;
    public final ExecutorService hotel;
    public final J7.j india;
    public String juliet;
    public final HashSet kilo;
    public final ArrayList lima;

    static {
        new AtomicInteger(1);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [j8.h, java.lang.Object] */
    public C1946c(B7.g gVar, InterfaceC1904b interfaceC1904b, ExecutorService executorService, J7.j jVar) {
        gVar.alpha();
        l8.c cVar = new l8.c(gVar.alpha, interfaceC1904b);
        ab abVar = new ab(gVar);
        if (C1477x.purple == null) {
            C1477x.purple = new C1477x(11);
        }
        C1477x c1477x = C1477x.purple;
        if (C1953j.delta == null) {
            C1953j.delta = new C1953j(c1477x);
        }
        C1953j c1953j = C1953j.delta;
        l lVar = new l(new I7.d(2, gVar));
        ?? obj = new Object();
        this.golf = new Object();
        this.kilo = new HashSet();
        this.lima = new ArrayList();
        this.alpha = gVar;
        this.bravo = cVar;
        this.charlie = abVar;
        this.delta = c1953j;
        this.echo = lVar;
        this.foxtrot = obj;
        this.hotel = executorService;
        this.india = jVar;
    }

    public final void alpha(InterfaceC1952i interfaceC1952i) {
        synchronized (this.golf) {
            this.lima.add(interfaceC1952i);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0020, code lost:
    
        r3 = hotel(r2);
        r4 = r6.charlie;
        r2 = r2.alpha();
        r2.bravo = r3;
        r2.charlie = 3;
        r2 = r2.alpha();
        r4.bravo(r2);
     */
    /* JADX WARN: Finally extract failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void bravo() {
        C2019a charlie;
        synchronized (mike) {
            try {
                B7.g gVar = this.alpha;
                gVar.alpha();
                k delta = k.delta(gVar.alpha);
                try {
                    charlie = this.charlie.charlie();
                    int i4 = charlie.bravo;
                    boolean z2 = true;
                    if (i4 != 2 && i4 != 1) {
                        z2 = false;
                    }
                    if (delta != null) {
                        delta.india();
                    }
                } catch (Throwable th) {
                    if (delta != null) {
                        delta.india();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        kilo(charlie);
        this.india.execute(new RunnableC1945b(this, 2));
    }

    public final C2019a charlie(C2019a c2019a) {
        int responseCode;
        boolean z2;
        l8.b foxtrot;
        B7.g gVar = this.alpha;
        gVar.alpha();
        String str = gVar.charlie.alpha;
        gVar.alpha();
        String str2 = gVar.charlie.golf;
        String str3 = c2019a.delta;
        l8.c cVar = this.bravo;
        l8.d dVar = cVar.charlie;
        boolean bravo = dVar.bravo();
        EnumC1948e enumC1948e = EnumC1948e.purple;
        if (bravo) {
            URL alpha = l8.c.alpha("projects/" + str2 + "/installations/" + c2019a.alpha + "/authTokens:generate");
            for (int i4 = 0; i4 <= 1; i4++) {
                TrafficStats.setThreadStatsTag(32771);
                HttpURLConnection charlie = cVar.charlie(alpha, str);
                try {
                    try {
                        charlie.setRequestMethod("POST");
                        charlie.addRequestProperty("Authorization", "FIS_v2 " + str3);
                        charlie.setDoOutput(true);
                        l8.c.hotel(charlie);
                        responseCode = charlie.getResponseCode();
                        dVar.delta(responseCode);
                        if (responseCode >= 200 && responseCode < 300) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                    } catch (Throwable th) {
                        charlie.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        throw th;
                    }
                } catch (IOException | AssertionError unused) {
                }
                if (z2) {
                    foxtrot = l8.c.foxtrot(charlie);
                } else {
                    l8.c.bravo(charlie, null, str, str2);
                    if (responseCode != 401 && responseCode != 404) {
                        if (responseCode != 429) {
                            if (responseCode < 500 || responseCode >= 600) {
                                Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                                B0.a alpha2 = l8.b.alpha();
                                alpha2.bravo = 2;
                                foxtrot = alpha2.alpha();
                            }
                            charlie.disconnect();
                            TrafficStats.clearThreadStatsTag();
                        } else {
                            throw new FirebaseInstallationsException("Firebase servers have received too many requests from this client in a short period of time. Please try again later.", EnumC1948e.red);
                        }
                    } else {
                        B0.a alpha3 = l8.b.alpha();
                        alpha3.bravo = 3;
                        foxtrot = alpha3.alpha();
                    }
                }
                charlie.disconnect();
                TrafficStats.clearThreadStatsTag();
                int mike2 = q.mike(foxtrot.charlie);
                if (mike2 != 0) {
                    if (mike2 != 1) {
                        if (mike2 == 2) {
                            lima(null);
                            He.b alpha4 = c2019a.alpha();
                            alpha4.charlie = 2;
                            return alpha4.alpha();
                        }
                        throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", enumC1948e);
                    }
                    He.b alpha5 = c2019a.alpha();
                    alpha5.hotel = "BAD CONFIG";
                    alpha5.charlie = 5;
                    return alpha5.alpha();
                }
                C1953j c1953j = this.delta;
                c1953j.getClass();
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                c1953j.alpha.getClass();
                long seconds = timeUnit.toSeconds(System.currentTimeMillis());
                He.b alpha6 = c2019a.alpha();
                alpha6.delta = foxtrot.alpha;
                alpha6.foxtrot = Long.valueOf(foxtrot.bravo);
                alpha6.golf = Long.valueOf(seconds);
                return alpha6.alpha();
            }
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", enumC1948e);
        }
        throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", enumC1948e);
    }

    public final G6.q delta() {
        String str;
        golf();
        synchronized (this) {
            str = this.juliet;
        }
        if (str != null) {
            return V4.echo(str);
        }
        G6.h hVar = new G6.h();
        alpha(new C1950g(hVar));
        G6.q qVar = hVar.alpha;
        this.hotel.execute(new RunnableC1945b(this, 0));
        return qVar;
    }

    public final G6.q echo() {
        golf();
        G6.h hVar = new G6.h();
        alpha(new C1949f(this.delta, hVar));
        this.hotel.execute(new RunnableC1945b(this, 1));
        return hVar.alpha;
    }

    /* JADX WARN: Finally extract failed */
    public final void foxtrot(C2019a c2019a) {
        synchronized (mike) {
            try {
                B7.g gVar = this.alpha;
                gVar.alpha();
                k delta = k.delta(gVar.alpha);
                try {
                    this.charlie.bravo(c2019a);
                    if (delta != null) {
                        delta.india();
                    }
                } catch (Throwable th) {
                    if (delta != null) {
                        delta.india();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void golf() {
        B7.g gVar = this.alpha;
        gVar.alpha();
        x.foxtrot(gVar.charlie.bravo, "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        gVar.alpha();
        x.foxtrot(gVar.charlie.golf, "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        gVar.alpha();
        x.foxtrot(gVar.charlie.alpha, "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        gVar.alpha();
        String str = gVar.charlie.bravo;
        Pattern pattern = C1953j.charlie;
        x.alpha("Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.", str.contains(":"));
        gVar.alpha();
        x.alpha("Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.", C1953j.charlie.matcher(gVar.charlie.alpha).matches());
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001c, code lost:
    
        if ("[DEFAULT]".equals(r0.bravo) != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String hotel(C2019a c2019a) {
        String alpha;
        B7.g gVar = this.alpha;
        gVar.alpha();
        if (!gVar.bravo.equals("CHIME_ANDROID_SDK")) {
            B7.g gVar2 = this.alpha;
            gVar2.alpha();
        }
        if (c2019a.bravo == 1) {
            C2020b c2020b = (C2020b) this.echo.get();
            synchronized (c2020b.alpha) {
                try {
                    alpha = c2020b.alpha();
                    if (alpha == null) {
                        alpha = c2020b.bravo();
                    }
                } finally {
                }
            }
            if (TextUtils.isEmpty(alpha)) {
                this.foxtrot.getClass();
                return C1951h.alpha();
            }
            return alpha;
        }
        this.foxtrot.getClass();
        return C1951h.alpha();
    }

    public final C2019a india(C2019a c2019a) {
        int responseCode;
        boolean z2;
        C2060a echo;
        C2019a c2019a2 = c2019a;
        String str = c2019a2.alpha;
        String str2 = null;
        if (str != null && str.length() == 11) {
            C2020b c2020b = (C2020b) this.echo.get();
            synchronized (c2020b.alpha) {
                try {
                    String[] strArr = C2020b.charlie;
                    int i4 = 0;
                    while (true) {
                        if (i4 < 4) {
                            String str3 = strArr[i4];
                            String string = c2020b.alpha.getString("|T|" + c2020b.bravo + "|" + str3, null);
                            if (string != null && !string.isEmpty()) {
                                if (string.startsWith("{")) {
                                    try {
                                        str2 = new JSONObject(string).getString("token");
                                    } catch (JSONException unused) {
                                    }
                                } else {
                                    str2 = string;
                                }
                            } else {
                                i4++;
                            }
                        }
                    }
                } finally {
                }
            }
        }
        l8.c cVar = this.bravo;
        B7.g gVar = this.alpha;
        gVar.alpha();
        String str4 = gVar.charlie.alpha;
        String str5 = c2019a2.alpha;
        B7.g gVar2 = this.alpha;
        gVar2.alpha();
        String str6 = gVar2.charlie.golf;
        B7.g gVar3 = this.alpha;
        gVar3.alpha();
        String str7 = gVar3.charlie.bravo;
        l8.d dVar = cVar.charlie;
        boolean bravo = dVar.bravo();
        EnumC1948e enumC1948e = EnumC1948e.purple;
        if (bravo) {
            URL alpha = l8.c.alpha("projects/" + str6 + "/installations");
            int i5 = 0;
            while (i5 <= 1) {
                TrafficStats.setThreadStatsTag(32769);
                HttpURLConnection charlie = cVar.charlie(alpha, str4);
                try {
                    try {
                        charlie.setRequestMethod("POST");
                        charlie.setDoOutput(true);
                        if (str2 != null) {
                            charlie.addRequestProperty("x-goog-fis-android-iid-migration-auth", str2);
                        }
                        l8.c.golf(charlie, str5, str7);
                        responseCode = charlie.getResponseCode();
                        dVar.delta(responseCode);
                        if (responseCode >= 200 && responseCode < 300) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                    } catch (IOException | AssertionError unused2) {
                    }
                    if (z2) {
                        echo = l8.c.echo(charlie);
                        charlie.disconnect();
                        TrafficStats.clearThreadStatsTag();
                    } else {
                        l8.c.bravo(charlie, str7, str4, str6);
                        if (responseCode != 429) {
                            if (responseCode < 500 || responseCode >= 600) {
                                try {
                                    Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                                    C2060a c2060a = new C2060a(null, null, null, null, 2);
                                    charlie.disconnect();
                                    TrafficStats.clearThreadStatsTag();
                                    echo = c2060a;
                                } catch (IOException | AssertionError unused3) {
                                }
                            }
                            charlie.disconnect();
                            TrafficStats.clearThreadStatsTag();
                            i5++;
                            c2019a2 = c2019a;
                        } else {
                            throw new FirebaseInstallationsException("Firebase servers have received too many requests from this client in a short period of time. Please try again later.", EnumC1948e.red);
                        }
                    }
                    int mike2 = q.mike(echo.echo);
                    if (mike2 != 0) {
                        if (mike2 == 1) {
                            He.b alpha2 = c2019a2.alpha();
                            alpha2.hotel = "BAD CONFIG";
                            alpha2.charlie = 5;
                            return alpha2.alpha();
                        }
                        throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", EnumC1948e.purple);
                    }
                    String str8 = echo.bravo;
                    String str9 = echo.charlie;
                    C1953j c1953j = this.delta;
                    c1953j.getClass();
                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    c1953j.alpha.getClass();
                    long seconds = timeUnit.toSeconds(System.currentTimeMillis());
                    l8.b bVar = echo.delta;
                    String str10 = bVar.alpha;
                    long j5 = bVar.bravo;
                    He.b alpha3 = c2019a2.alpha();
                    alpha3.bravo = str8;
                    alpha3.charlie = 4;
                    alpha3.delta = str10;
                    alpha3.echo = str9;
                    alpha3.foxtrot = Long.valueOf(j5);
                    alpha3.golf = Long.valueOf(seconds);
                    return alpha3.alpha();
                } finally {
                    charlie.disconnect();
                    TrafficStats.clearThreadStatsTag();
                }
            }
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", enumC1948e);
        }
        throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", enumC1948e);
    }

    public final void juliet(Exception exc) {
        synchronized (this.golf) {
            try {
                Iterator it = this.lima.iterator();
                while (it.hasNext()) {
                    if (((InterfaceC1952i) it.next()).alpha(exc)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void kilo(C2019a c2019a) {
        synchronized (this.golf) {
            try {
                Iterator it = this.lima.iterator();
                while (it.hasNext()) {
                    if (((InterfaceC1952i) it.next()).bravo(c2019a)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized void lima(String str) {
        this.juliet = str;
    }

    public final synchronized void mike(C2019a c2019a, C2019a c2019a2) {
        try {
            if (this.kilo.size() != 0 && !TextUtils.equals(c2019a.alpha, c2019a2.alpha)) {
                Iterator it = this.kilo.iterator();
                if (it.hasNext()) {
                    if (it.next() == null) {
                        throw null;
                    }
                    throw new ClassCastException();
                }
            }
        } finally {
        }
    }
}
