package E8;

import Aa.m;
import Af.t;
import D5.s;
import F8.p;
import J2.l;
import O7.n;
import O7.r;
import android.util.Log;
import androidx.work.impl.WorkDatabase;
import com.clevertap.android.sdk.inapp.InAppController;
import com.clevertap.android.sdk.network.NetworkManager;
import com.clevertap.android.sdk.pushnotification.PushProviders;
import com.clevertap.android.sdk.variables.VarCache;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.Callable;
import kotlin.Unit;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final /* synthetic */ class g implements Callable {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Object purple;

    public /* synthetic */ g(int i4, Object obj) {
        this.alpha = i4;
        this.purple = obj;
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, J2.t] */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        FileInputStream fileInputStream;
        F8.g gVar;
        int i4;
        Unit showNotificationIfAvailable$lambda$3;
        Void lambda$init$0;
        Void lambda$saveDiffsAsync$0;
        switch (this.alpha) {
            case 0:
                return ((j) this.purple).bravo("firebase");
            case 1:
                p pVar = (p) this.purple;
                synchronized (pVar) {
                    FileInputStream fileInputStream2 = null;
                    gVar = null;
                    try {
                        fileInputStream = pVar.alpha.openFileInput(pVar.bravo);
                        try {
                            int available = fileInputStream.available();
                            byte[] bArr = new byte[available];
                            fileInputStream.read(bArr, 0, available);
                            gVar = F8.g.alpha(new JSONObject(new String(bArr, "UTF-8")));
                            fileInputStream.close();
                        } catch (FileNotFoundException | JSONException unused) {
                            if (fileInputStream != null) {
                                fileInputStream.close();
                            }
                            return gVar;
                        } catch (Throwable th) {
                            th = th;
                            fileInputStream2 = fileInputStream;
                            if (fileInputStream2 != null) {
                                fileInputStream2.close();
                            }
                            throw th;
                        }
                    } catch (FileNotFoundException | JSONException unused2) {
                        fileInputStream = null;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
                return gVar;
            case 2:
                WorkDatabase workDatabase = (WorkDatabase) ((m) this.purple).purple;
                Long E4 = workDatabase.lima().E("next_alarm_manager_id");
                int i5 = 0;
                if (E4 != null) {
                    i4 = (int) E4.longValue();
                } else {
                    i4 = 0;
                }
                if (i4 != Integer.MAX_VALUE) {
                    i5 = i4 + 1;
                }
                workDatabase.lima().F(new J2.d("next_alarm_manager_id", Long.valueOf(i5)));
                return Integer.valueOf(i4);
            case 3:
                n nVar = ((r) this.purple).golf;
                nVar.getClass();
                P7.f.alpha();
                J2.e eVar = nVar.charlie;
                String str = (String) eVar.purple;
                U7.c cVar = (U7.c) eVar.red;
                cVar.getClass();
                boolean z2 = true;
                if (!new File((File) cVar.red, str).exists()) {
                    String echo = nVar.echo();
                    if (echo == null || !nVar.juliet.charlie(echo)) {
                        z2 = false;
                    }
                } else {
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", "Found previous crash marker.", null);
                    }
                    String str2 = (String) eVar.purple;
                    cVar.getClass();
                    new File((File) cVar.red, str2).delete();
                }
                return Boolean.valueOf(z2);
            case 4:
                s sVar = (s) ((l) this.purple).purple;
                W7.d dVar = (W7.d) sVar.bravo;
                t tVar = (t) sVar.foxtrot;
                String str3 = tVar.purple;
                P7.e.alpha(new P7.c(0, P7.f.delta, P7.e.class, "isBlockingThread", "isBlockingThread()Z", 0, 1), P7.d.red);
                try {
                    HashMap bravo = t.bravo(dVar);
                    ?? obj = new Object();
                    obj.alpha = str3;
                    obj.purple = bravo;
                    obj.red = new HashMap();
                    obj.quebec("User-Agent", "Crashlytics Android SDK/19.4.4");
                    obj.quebec("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
                    t.alpha(obj, dVar);
                    String str4 = "Requesting settings from " + str3;
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", str4, null);
                    }
                    String str5 = "Settings query params were: " + bravo;
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", str5, null);
                    }
                    return tVar.delta(obj.lima());
                } catch (IOException e) {
                    Log.e("FirebaseCrashlytics", "Settings request failed.", e);
                    return null;
                }
            case 5:
                showNotificationIfAvailable$lambda$3 = InAppController.showNotificationIfAvailable$lambda$3((InAppController) this.purple);
                return showNotificationIfAvailable$lambda$3;
            case 6:
                return NetworkManager.bravo((NetworkManager) this.purple);
            case 7:
                lambda$init$0 = ((PushProviders) this.purple).lambda$init$0();
                return lambda$init$0;
            default:
                lambda$saveDiffsAsync$0 = ((VarCache) this.purple).lambda$saveDiffsAsync$0();
                return lambda$saveDiffsAsync$0;
        }
    }
}
