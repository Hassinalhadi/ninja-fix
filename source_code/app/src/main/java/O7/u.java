package O7;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;

/* loaded from: classes2.dex */
public final class u implements V5.d {
    public boolean alpha;
    public final Object bravo;
    public final Object charlie;
    public Object delta;
    public Object echo;
    public final Object foxtrot;

    public u(T5.e eVar, com.google.android.gms.common.api.c cVar, T5.b bVar) {
        this.foxtrot = eVar;
        this.delta = null;
        this.echo = null;
        this.alpha = false;
        this.bravo = cVar;
        this.charlie = bVar;
    }

    @Override // V5.d
    public void alpha(ConnectionResult connectionResult) {
        ((T5.e) this.foxtrot).november.post(new com.google.common.util.concurrent.d(6, this, connectionResult, false));
    }

    public synchronized boolean bravo() {
        boolean z2;
        Boolean bool = (Boolean) this.foxtrot;
        if (bool != null) {
            z2 = bool.booleanValue();
        } else {
            try {
                z2 = ((B7.g) this.bravo).hotel();
            } catch (IllegalStateException unused) {
                z2 = false;
            }
        }
        charlie(z2);
        return z2;
    }

    public void charlie(boolean z2) {
        String str;
        String str2;
        if (z2) {
            str = "ENABLED";
        } else {
            str = "DISABLED";
        }
        if (((Boolean) this.foxtrot) == null) {
            str2 = "global Firebase setting";
        } else if (this.alpha) {
            str2 = "firebase_crashlytics_collection_enabled manifest flag";
        } else {
            str2 = "API";
        }
        String golf = av.q.golf("Crashlytics automatic data collection ", str, " by ", str2, ".");
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", golf, null);
        }
    }

    public void delta(ConnectionResult connectionResult) {
        T5.r rVar = (T5.r) ((T5.e) this.foxtrot).juliet.get((T5.b) this.charlie);
        if (rVar != null) {
            rVar.papa(connectionResult);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public u(B7.g gVar) {
        Boolean bool;
        Boolean bool2;
        PackageManager packageManager;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        this.charlie = new Object();
        this.delta = new G6.h();
        this.alpha = false;
        this.echo = new G6.h();
        gVar.alpha();
        Context context = gVar.alpha;
        this.bravo = gVar;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.crashlytics", 0);
        if (sharedPreferences.contains("firebase_crashlytics_collection_enabled")) {
            this.alpha = false;
            bool = Boolean.valueOf(sharedPreferences.getBoolean("firebase_crashlytics_collection_enabled", true));
        } else {
            bool = null;
        }
        if (bool == null) {
            try {
                packageManager = context.getPackageManager();
            } catch (PackageManager.NameNotFoundException e) {
                Log.e("FirebaseCrashlytics", "Could not read data collection permission from manifest", e);
            }
            if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("firebase_crashlytics_collection_enabled")) {
                bool2 = Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_crashlytics_collection_enabled"));
                if (bool2 != null) {
                    this.alpha = false;
                    bool = null;
                } else {
                    this.alpha = true;
                    bool = Boolean.valueOf(Boolean.TRUE.equals(bool2));
                }
            }
            bool2 = null;
            if (bool2 != null) {
            }
        }
        this.foxtrot = bool;
        synchronized (this.charlie) {
            try {
                if (bravo()) {
                    ((G6.h) this.delta).delta(null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
