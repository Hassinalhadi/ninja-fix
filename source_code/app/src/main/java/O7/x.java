package O7;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import j8.C1944a;
import j8.C1946c;
import j8.InterfaceC1947d;
import java.util.Locale;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import s6.V4;

/* loaded from: classes2.dex */
public final class x {
    public static final Pattern golf = Pattern.compile("[^\\p{Alnum}]");
    public static final String hotel = Pattern.quote("/");
    public final Af.t alpha;
    public final Context bravo;
    public final String charlie;
    public final InterfaceC1947d delta;
    public final u echo;
    public b foxtrot;

    public x(Context context, String str, InterfaceC1947d interfaceC1947d, u uVar) {
        if (context != null) {
            if (str != null) {
                this.bravo = context;
                this.charlie = str;
                this.delta = interfaceC1947d;
                this.echo = uVar;
                this.alpha = new Af.t(2);
                return;
            }
            throw new IllegalArgumentException("appIdentifier must not be null");
        }
        throw new IllegalArgumentException("appContext must not be null");
    }

    public final synchronized String alpha(SharedPreferences sharedPreferences, String str) {
        String lowerCase;
        lowerCase = golf.matcher(UUID.randomUUID().toString()).replaceAll("").toLowerCase(Locale.US);
        String str2 = "Created new Crashlytics installation ID: " + lowerCase + " for FID: " + str;
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", str2, null);
        }
        sharedPreferences.edit().putString("crashlytics.installation.id", lowerCase).putString("firebase.installation.id", str).apply();
        return lowerCase;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:1|(7:13|14|4|5|6|7|8)|3|4|5|6|7|8) */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0048, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0049, code lost:
    
        android.util.Log.w("FirebaseCrashlytics", "Error getting Firebase installation id.", r0);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final w bravo(boolean z2) {
        String str;
        P7.e.alpha(new P7.c(0, P7.f.delta, P7.e.class, "isNotMainThread", "isNotMainThread()Z", 0, 2), P7.d.silver);
        InterfaceC1947d interfaceC1947d = this.delta;
        String str2 = null;
        if (z2) {
            try {
                str = ((C1944a) V4.alpha(((C1946c) interfaceC1947d).echo(), 10000L, TimeUnit.MILLISECONDS)).alpha;
            } catch (Exception e) {
                Log.w("FirebaseCrashlytics", "Error getting Firebase authentication token.", e);
            }
            str2 = (String) V4.alpha(((C1946c) interfaceC1947d).delta(), 10000L, TimeUnit.MILLISECONDS);
            return new w(str2, str);
        }
        str = null;
        str2 = (String) V4.alpha(((C1946c) interfaceC1947d).delta(), 10000L, TimeUnit.MILLISECONDS);
        return new w(str2, str);
    }

    public final synchronized b charlie() {
        String str;
        b bVar = this.foxtrot;
        if (bVar != null && (bVar.bravo != null || !this.echo.bravo())) {
            return this.foxtrot;
        }
        L7.c cVar = L7.c.alpha;
        cVar.foxtrot("Determining Crashlytics installation ID...");
        SharedPreferences sharedPreferences = this.bravo.getSharedPreferences("com.google.firebase.crashlytics", 0);
        String string = sharedPreferences.getString("firebase.installation.id", null);
        cVar.foxtrot("Cached Firebase Installation ID: " + string);
        if (this.echo.bravo()) {
            w bravo = bravo(false);
            cVar.foxtrot("Fetched Firebase Installation ID: " + bravo.alpha);
            if (bravo.alpha == null) {
                if (string == null) {
                    str = "SYN_" + UUID.randomUUID().toString();
                } else {
                    str = string;
                }
                bravo = new w(str, null);
            }
            if (Objects.equals(bravo.alpha, string)) {
                this.foxtrot = new b(sharedPreferences.getString("crashlytics.installation.id", null), bravo.alpha, bravo.bravo);
            } else {
                this.foxtrot = new b(alpha(sharedPreferences, bravo.alpha), bravo.alpha, bravo.bravo);
            }
        } else if (string != null && string.startsWith("SYN_")) {
            this.foxtrot = new b(sharedPreferences.getString("crashlytics.installation.id", null), null, null);
        } else {
            this.foxtrot = new b(alpha(sharedPreferences, "SYN_" + UUID.randomUUID().toString()), null, null);
        }
        cVar.foxtrot("Install IDs: " + this.foxtrot);
        return this.foxtrot;
    }

    public final String delta() {
        String str;
        Af.t tVar = this.alpha;
        Context context = this.bravo;
        synchronized (tVar) {
            try {
                if (tVar.purple == null) {
                    String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                    if (installerPackageName == null) {
                        installerPackageName = "";
                    }
                    tVar.purple = installerPackageName;
                }
                if ("".equals(tVar.purple)) {
                    str = null;
                } else {
                    str = tVar.purple;
                }
            } finally {
            }
        }
        return str;
    }
}
