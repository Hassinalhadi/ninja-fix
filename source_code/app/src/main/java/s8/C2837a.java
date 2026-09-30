package s8;

import com.google.firebase.perf.config.RemoteConfigManager;
import t6.Z1;
import u8.C3146a;

/* renamed from: s8.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2837a {
    public static final C3146a delta = C3146a.delta();
    public static volatile C2837a echo;
    public final RemoteConfigManager alpha = RemoteConfigManager.getInstance();
    public B8.d bravo = new B8.d();
    public final v charlie = v.bravo();

    public static synchronized C2837a echo() {
        C2837a c2837a;
        synchronized (C2837a.class) {
            try {
                if (echo == null) {
                    echo = new C2837a();
                }
                c2837a = echo;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c2837a;
    }

    public static boolean quebec(long j5) {
        if (j5 >= 0) {
            return true;
        }
        return false;
    }

    public static boolean romeo(String str) {
        if (!str.trim().isEmpty()) {
            for (String str2 : str.split(";")) {
                if (str2.trim().equals("21.0.5")) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean sierra(long j5) {
        if (j5 >= 0) {
            return true;
        }
        return false;
    }

    public static boolean uniform(double d4) {
        if (0.0d <= d4 && d4 <= 1.0d) {
            return true;
        }
        return false;
    }

    public final B8.e alpha(Z1 z12) {
        v vVar = this.charlie;
        String bravo = z12.bravo();
        if (bravo == null) {
            vVar.getClass();
            v.charlie.alpha("Key is null when getting boolean value on device cache.");
            return new B8.e();
        }
        if (vVar.alpha == null) {
            vVar.charlie(v.alpha());
            if (vVar.alpha == null) {
                return new B8.e();
            }
        }
        if (!vVar.alpha.contains(bravo)) {
            return new B8.e();
        }
        try {
            return new B8.e(Boolean.valueOf(vVar.alpha.getBoolean(bravo, false)));
        } catch (ClassCastException e) {
            v.charlie.bravo("Key %s from sharedPreferences has type other than long: %s", bravo, e.getMessage());
            return new B8.e();
        }
    }

    public final B8.e bravo(Z1 z12) {
        v vVar = this.charlie;
        String bravo = z12.bravo();
        if (bravo == null) {
            vVar.getClass();
            v.charlie.alpha("Key is null when getting double value on device cache.");
            return new B8.e();
        }
        if (vVar.alpha == null) {
            vVar.charlie(v.alpha());
            if (vVar.alpha == null) {
                return new B8.e();
            }
        }
        if (!vVar.alpha.contains(bravo)) {
            return new B8.e();
        }
        try {
            try {
                return new B8.e(Double.valueOf(Double.longBitsToDouble(vVar.alpha.getLong(bravo, 0L))));
            } catch (ClassCastException e) {
                v.charlie.bravo("Key %s from sharedPreferences has type other than double: %s", bravo, e.getMessage());
                return new B8.e();
            }
        } catch (ClassCastException unused) {
            return new B8.e(Double.valueOf(Float.valueOf(vVar.alpha.getFloat(bravo, 0.0f)).doubleValue()));
        }
    }

    public final B8.e charlie(Z1 z12) {
        v vVar = this.charlie;
        String bravo = z12.bravo();
        if (bravo == null) {
            vVar.getClass();
            v.charlie.alpha("Key is null when getting long value on device cache.");
            return new B8.e();
        }
        if (vVar.alpha == null) {
            vVar.charlie(v.alpha());
            if (vVar.alpha == null) {
                return new B8.e();
            }
        }
        if (!vVar.alpha.contains(bravo)) {
            return new B8.e();
        }
        try {
            return new B8.e(Long.valueOf(vVar.alpha.getLong(bravo, 0L)));
        } catch (ClassCastException e) {
            v.charlie.bravo("Key %s from sharedPreferences has type other than long: %s", bravo, e.getMessage());
            return new B8.e();
        }
    }

    public final B8.e delta(Z1 z12) {
        v vVar = this.charlie;
        String bravo = z12.bravo();
        if (bravo == null) {
            vVar.getClass();
            v.charlie.alpha("Key is null when getting String value on device cache.");
            return new B8.e();
        }
        if (vVar.alpha == null) {
            vVar.charlie(v.alpha());
            if (vVar.alpha == null) {
                return new B8.e();
            }
        }
        if (!vVar.alpha.contains(bravo)) {
            return new B8.e();
        }
        try {
            return new B8.e(vVar.alpha.getString(bravo, ""));
        } catch (ClassCastException e) {
            v.charlie.bravo("Key %s from sharedPreferences has type other than String: %s", bravo, e.getMessage());
            return new B8.e();
        }
    }

    public final boolean foxtrot() {
        d delta2 = d.delta();
        B8.e india = india(delta2);
        if (india.bravo()) {
            return ((Boolean) india.alpha()).booleanValue();
        }
        B8.e eVar = this.alpha.getBoolean("fpr_experiment_app_start_ttid");
        if (eVar.bravo()) {
            this.charlie.golf("com.google.firebase.perf.ExperimentTTID", ((Boolean) eVar.alpha()).booleanValue());
            return ((Boolean) eVar.alpha()).booleanValue();
        }
        B8.e alpha = alpha(delta2);
        if (alpha.bravo()) {
            return ((Boolean) alpha.alpha()).booleanValue();
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, s8.b] */
    public final Boolean golf() {
        C2838b c2838b;
        Boolean bool;
        synchronized (C2838b.class) {
            try {
                if (C2838b.alpha == null) {
                    C2838b.alpha = new Object();
                }
                c2838b = C2838b.alpha;
            } catch (Throwable th) {
                throw th;
            }
        }
        B8.e india = india(c2838b);
        if (india.bravo()) {
            bool = (Boolean) india.alpha();
        } else {
            bool = Boolean.FALSE;
        }
        if (bool.booleanValue()) {
            return Boolean.FALSE;
        }
        C2839c delta2 = C2839c.delta();
        B8.e alpha = alpha(delta2);
        if (alpha.bravo()) {
            return (Boolean) alpha.alpha();
        }
        B8.e india2 = india(delta2);
        if (india2.bravo()) {
            return (Boolean) india2.alpha();
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r1v8, types: [s8.k, java.lang.Object] */
    public final boolean hotel() {
        k kVar;
        synchronized (k.class) {
            try {
                if (k.alpha == null) {
                    k.alpha = new Object();
                }
                kVar = k.alpha;
            } catch (Throwable th) {
                throw th;
            }
        }
        B8.e delta2 = delta(kVar);
        B8.e string = this.alpha.getString("fpr_disabled_android_versions");
        if (string.bravo()) {
            String str = (String) string.alpha();
            if (!delta2.bravo() || !((String) delta2.alpha()).equals(str)) {
                this.charlie.foxtrot("com.google.firebase.perf.SdkDisabledVersions", str);
            }
            return romeo(str);
        }
        if (delta2.bravo()) {
            return romeo((String) delta2.alpha());
        }
        return romeo("");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final B8.e india(Z1 z12) {
        boolean z2;
        B8.d dVar = this.bravo;
        String charlie = z12.charlie();
        if (charlie != null) {
            if (dVar.alpha.containsKey(charlie)) {
                z2 = true;
                if (z2) {
                    return new B8.e();
                }
                try {
                    Boolean bool = (Boolean) dVar.alpha.get(charlie);
                    if (bool == null) {
                        return new B8.e();
                    }
                    return new B8.e(bool);
                } catch (ClassCastException e) {
                    B8.d.bravo.bravo("Metadata key %s contains type other than boolean: %s", charlie, e.getMessage());
                    return new B8.e();
                }
            }
        } else {
            dVar.getClass();
        }
        z2 = false;
        if (z2) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final B8.e juliet(Z1 z12) {
        boolean z2;
        B8.d dVar = this.bravo;
        String charlie = z12.charlie();
        if (charlie != null) {
            if (dVar.alpha.containsKey(charlie)) {
                z2 = true;
                if (z2) {
                    return new B8.e();
                }
                Object obj = dVar.alpha.get(charlie);
                if (obj == null) {
                    return new B8.e();
                }
                if (obj instanceof Float) {
                    return new B8.e(Double.valueOf(((Float) obj).doubleValue()));
                }
                if (obj instanceof Double) {
                    return new B8.e((Double) obj);
                }
                B8.d.bravo.bravo("Metadata key %s contains type other than double: %s", charlie);
                return new B8.e();
            }
        } else {
            dVar.getClass();
        }
        z2 = false;
        if (z2) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0020 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    /* JADX WARN: Type inference failed for: r2v3, types: [android.os.Bundle, android.os.BaseBundle] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r3v5, types: [android.os.Bundle, android.os.BaseBundle] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v13, types: [B8.e] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [u8.a] */
    /* JADX WARN: Type inference failed for: r5v4, types: [B8.e] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8, types: [B8.e] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final B8.e kilo(Z1 z12) {
        boolean z2;
        B8.d dVar = this.bravo;
        ?? charlie = z12.charlie();
        if (charlie != 0) {
            if (dVar.alpha.containsKey(charlie)) {
                z2 = true;
                if (z2) {
                    charlie = new B8.e();
                } else {
                    try {
                        Integer num = (Integer) dVar.alpha.get(charlie);
                        if (num == null) {
                            charlie = new B8.e();
                        } else {
                            charlie = new B8.e(num);
                        }
                    } catch (ClassCastException e) {
                        B8.d.bravo.bravo("Metadata key %s contains type other than int: %s", new Object[]{charlie, e.getMessage()});
                        charlie = new B8.e();
                    }
                }
                if (!charlie.bravo()) {
                    return new B8.e(Long.valueOf(((Integer) charlie.alpha()).intValue()));
                }
                return new B8.e();
            }
        } else {
            dVar.getClass();
        }
        z2 = false;
        if (z2) {
        }
        if (!charlie.bravo()) {
        }
    }

    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object, s8.g] */
    public final long lima() {
        g gVar;
        synchronized (g.class) {
            try {
                if (g.alpha == null) {
                    g.alpha = new Object();
                }
                gVar = g.alpha;
            } catch (Throwable th) {
                throw th;
            }
        }
        RemoteConfigManager remoteConfigManager = this.alpha;
        gVar.getClass();
        B8.e eVar = remoteConfigManager.getLong("fpr_rl_network_event_count_bg");
        if (eVar.bravo() && quebec(((Long) eVar.alpha()).longValue())) {
            this.charlie.delta(((Long) eVar.alpha()).longValue(), "com.google.firebase.perf.NetworkEventCountBackground");
            return ((Long) eVar.alpha()).longValue();
        }
        B8.e charlie = charlie(gVar);
        if (charlie.bravo() && quebec(((Long) charlie.alpha()).longValue())) {
            return ((Long) charlie.alpha()).longValue();
        }
        return 70L;
    }

    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object, s8.h] */
    public final long mike() {
        h hVar;
        synchronized (h.class) {
            try {
                if (h.alpha == null) {
                    h.alpha = new Object();
                }
                hVar = h.alpha;
            } catch (Throwable th) {
                throw th;
            }
        }
        RemoteConfigManager remoteConfigManager = this.alpha;
        hVar.getClass();
        B8.e eVar = remoteConfigManager.getLong("fpr_rl_network_event_count_fg");
        if (eVar.bravo() && quebec(((Long) eVar.alpha()).longValue())) {
            this.charlie.delta(((Long) eVar.alpha()).longValue(), "com.google.firebase.perf.NetworkEventCountForeground");
            return ((Long) eVar.alpha()).longValue();
        }
        B8.e charlie = charlie(hVar);
        if (charlie.bravo() && quebec(((Long) charlie.alpha()).longValue())) {
            return ((Long) charlie.alpha()).longValue();
        }
        return 700L;
    }

    /* JADX WARN: Type inference failed for: r1v9, types: [s8.j, java.lang.Object] */
    public final long november() {
        j jVar;
        synchronized (j.class) {
            try {
                if (j.alpha == null) {
                    j.alpha = new Object();
                }
                jVar = j.alpha;
            } catch (Throwable th) {
                throw th;
            }
        }
        RemoteConfigManager remoteConfigManager = this.alpha;
        jVar.getClass();
        B8.e eVar = remoteConfigManager.getLong("fpr_rl_time_limit_sec");
        if (eVar.bravo() && ((Long) eVar.alpha()).longValue() > 0) {
            this.charlie.delta(((Long) eVar.alpha()).longValue(), "com.google.firebase.perf.TimeLimitSec");
            return ((Long) eVar.alpha()).longValue();
        }
        B8.e charlie = charlie(jVar);
        if (charlie.bravo() && ((Long) charlie.alpha()).longValue() > 0) {
            return ((Long) charlie.alpha()).longValue();
        }
        return 600L;
    }

    /* JADX WARN: Type inference failed for: r1v9, types: [s8.m, java.lang.Object] */
    public final long oscar() {
        m mVar;
        synchronized (m.class) {
            try {
                if (m.alpha == null) {
                    m.alpha = new Object();
                }
                mVar = m.alpha;
            } catch (Throwable th) {
                throw th;
            }
        }
        B8.e kilo = kilo(mVar);
        if (kilo.bravo() && sierra(((Long) kilo.alpha()).longValue())) {
            return ((Long) kilo.alpha()).longValue();
        }
        B8.e eVar = this.alpha.getLong("fpr_session_gauge_cpu_capture_frequency_bg_ms");
        if (eVar.bravo() && sierra(((Long) eVar.alpha()).longValue())) {
            this.charlie.delta(((Long) eVar.alpha()).longValue(), "com.google.firebase.perf.SessionsCpuCaptureFrequencyBackgroundMs");
            return ((Long) eVar.alpha()).longValue();
        }
        B8.e charlie = charlie(mVar);
        if (charlie.bravo() && sierra(((Long) charlie.alpha()).longValue())) {
            return ((Long) charlie.alpha()).longValue();
        }
        return 0L;
    }

    /* JADX WARN: Type inference failed for: r1v9, types: [s8.p, java.lang.Object] */
    public final long papa() {
        p pVar;
        synchronized (p.class) {
            try {
                if (p.alpha == null) {
                    p.alpha = new Object();
                }
                pVar = p.alpha;
            } catch (Throwable th) {
                throw th;
            }
        }
        B8.e kilo = kilo(pVar);
        if (kilo.bravo() && sierra(((Long) kilo.alpha()).longValue())) {
            return ((Long) kilo.alpha()).longValue();
        }
        B8.e eVar = this.alpha.getLong("fpr_session_gauge_memory_capture_frequency_bg_ms");
        if (eVar.bravo() && sierra(((Long) eVar.alpha()).longValue())) {
            this.charlie.delta(((Long) eVar.alpha()).longValue(), "com.google.firebase.perf.SessionsMemoryCaptureFrequencyBackgroundMs");
            return ((Long) eVar.alpha()).longValue();
        }
        B8.e charlie = charlie(pVar);
        if (charlie.bravo() && sierra(((Long) charlie.alpha()).longValue())) {
            return ((Long) charlie.alpha()).longValue();
        }
        return 0L;
    }

    /* JADX WARN: Type inference failed for: r3v7, types: [s8.l, java.lang.Object] */
    public final boolean tango() {
        l lVar;
        boolean z2;
        boolean z10;
        Boolean golf = golf();
        if (golf == null || golf.booleanValue()) {
            synchronized (l.class) {
                try {
                    if (l.alpha == null) {
                        l.alpha = new Object();
                    }
                    lVar = l.alpha;
                } catch (Throwable th) {
                    throw th;
                }
            }
            B8.e alpha = alpha(lVar);
            B8.e eVar = this.alpha.getBoolean("fpr_enabled");
            if (eVar.bravo()) {
                if (this.alpha.isLastFetchFailed()) {
                    z2 = false;
                } else {
                    Boolean bool = (Boolean) eVar.alpha();
                    if (!alpha.bravo() || alpha.alpha() != bool) {
                        this.charlie.golf("com.google.firebase.perf.SdkEnabled", bool.booleanValue());
                    }
                    z2 = bool.booleanValue();
                }
            } else if (alpha.bravo()) {
                z2 = ((Boolean) alpha.alpha()).booleanValue();
            } else {
                z2 = true;
            }
            if (z2 && !hotel()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                return true;
            }
        }
        return false;
    }
}
