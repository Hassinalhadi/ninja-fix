package F8;

import A2.s;
import android.util.Log;
import java.nio.charset.Charset;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;
import org.json.JSONException;

/* loaded from: classes2.dex */
public final class k {
    public static final Pattern echo;
    public static final Pattern foxtrot;
    public final HashSet alpha = new HashSet();
    public final Executor bravo;
    public final e charlie;
    public final e delta;

    static {
        Charset.forName("UTF-8");
        echo = Pattern.compile("^(1|true|t|yes|y|on)$", 2);
        foxtrot = Pattern.compile("^(0|false|f|no|n|off|)$", 2);
    }

    public k(Executor executor, e eVar, e eVar2) {
        this.bravo = executor;
        this.charlie = eVar;
        this.delta = eVar2;
    }

    public static HashSet charlie(e eVar) {
        HashSet hashSet = new HashSet();
        g charlie = eVar.charlie();
        if (charlie != null) {
            Iterator<String> keys = charlie.bravo.keys();
            while (keys.hasNext()) {
                hashSet.add(keys.next());
            }
        }
        return hashSet;
    }

    public static String delta(e eVar, String str) {
        g charlie = eVar.charlie();
        if (charlie == null) {
            return null;
        }
        try {
            return charlie.bravo.getString(str);
        } catch (JSONException unused) {
            return null;
        }
    }

    public static void foxtrot(String str, String str2) {
        Log.w("FirebaseRemoteConfig", av.q.golf("No value of type '", str2, "' exists for parameter key '", str, "'."));
    }

    public final void alpha(E8.f fVar) {
        synchronized (this.alpha) {
            this.alpha.add(fVar);
        }
    }

    public final void bravo(String str, g gVar) {
        if (gVar == null) {
            return;
        }
        synchronized (this.alpha) {
            try {
                Iterator it = this.alpha.iterator();
                while (it.hasNext()) {
                    this.bravo.execute(new s((E8.f) it.next(), str, gVar, 8));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final r echo(String str) {
        e eVar = this.charlie;
        String delta = delta(eVar, str);
        if (delta != null) {
            bravo(str, eVar.charlie());
            return new r(delta, 2);
        }
        String delta2 = delta(this.delta, str);
        if (delta2 != null) {
            return new r(delta2, 1);
        }
        foxtrot(str, "FirebaseRemoteConfigValue");
        return new r("", 0);
    }
}
