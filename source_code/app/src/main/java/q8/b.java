package q8;

import A8.f;
import A8.h;
import B7.g;
import B7.i;
import B8.d;
import B8.j;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.perf.session.SessionManager;
import i8.InterfaceC1904b;
import j8.InterfaceC1947d;
import java.util.concurrent.ConcurrentHashMap;
import s8.C2837a;
import t6.AbstractC3065u2;
import u8.C3146a;

/* loaded from: classes2.dex */
public final class b {
    public static final C3146a bravo = C3146a.delta();
    public final ConcurrentHashMap alpha = new ConcurrentHashMap();

    public b(g gVar, InterfaceC1904b interfaceC1904b, InterfaceC1947d interfaceC1947d, InterfaceC1904b interfaceC1904b2, RemoteConfigManager remoteConfigManager, C2837a c2837a, SessionManager sessionManager) {
        Bundle bundle;
        d dVar;
        boolean hotel;
        if (gVar == null) {
            new d(new Bundle());
            return;
        }
        h hVar = h.f18l;
        hVar.silver = gVar;
        gVar.alpha();
        i iVar = gVar.charlie;
        hVar.f26i = iVar.golf;
        hVar.white = interfaceC1947d;
        hVar.yellow = interfaceC1904b2;
        hVar.f20b.execute(new f(hVar, 1));
        gVar.alpha();
        Context context = gVar.alpha;
        try {
            bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
        } catch (PackageManager.NameNotFoundException | NullPointerException e) {
            Log.d("isEnabled", "No perf enable meta data found " + e.getMessage());
            bundle = null;
        }
        if (bundle != null) {
            dVar = new d(bundle);
        } else {
            dVar = new d();
        }
        remoteConfigManager.setFirebaseRemoteConfigProvider(interfaceC1904b);
        c2837a.bravo = dVar;
        C2837a.delta.bravo = j.alpha(context);
        c2837a.charlie.charlie(context);
        sessionManager.setApplicationContext(context);
        Boolean golf = c2837a.golf();
        C3146a c3146a = bravo;
        if (c3146a.bravo) {
            if (golf != null) {
                hotel = golf.booleanValue();
            } else {
                hotel = g.charlie().hotel();
            }
            if (hotel) {
                gVar.alpha();
                String concat = "Firebase Performance Monitoring is successfully initialized! In a minute, visit the Firebase console to view your data: ".concat(AbstractC3065u2.bravo(iVar.golf, context.getPackageName()).concat("/trends?utm_source=perf-android-sdk&utm_medium=android-ide"));
                if (c3146a.bravo) {
                    c3146a.alpha.getClass();
                    Log.i("FirebasePerformance", concat);
                }
            }
        }
    }
}
