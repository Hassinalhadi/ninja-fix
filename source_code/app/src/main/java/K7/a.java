package K7;

import Aa.m;
import K1.f;
import O7.q;
import android.os.Bundle;
import android.util.Log;
import i8.InterfaceC1903a;
import i8.InterfaceC1904b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements N7.a, M7.a, InterfaceC1903a {
    public final /* synthetic */ f alpha;

    public /* synthetic */ a(f fVar) {
        this.alpha = fVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, J2.t] */
    /* JADX WARN: Type inference failed for: r3v1, types: [J2.l, java.lang.Object] */
    @Override // i8.InterfaceC1903a
    public void delta(InterfaceC1904b interfaceC1904b) {
        f fVar = this.alpha;
        fVar.getClass();
        L7.c cVar = L7.c.alpha;
        cVar.charlie("AnalyticsConnector now available.");
        F7.b bVar = (F7.b) interfaceC1904b.get();
        D8.c cVar2 = new D8.c(27, bVar);
        ?? obj = new Object();
        F7.c cVar3 = (F7.c) bVar;
        u8.b bravo = cVar3.bravo("clx", obj);
        if (bravo == null) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Could not register AnalyticsConnectorListener with Crashlytics origin.", null);
            }
            u8.b bravo2 = cVar3.bravo("crash", obj);
            if (bravo2 != null) {
                Log.w("FirebaseCrashlytics", "A new version of the Google Analytics for Firebase SDK is now available. For improved performance and compatibility with Crashlytics, please update to the latest version.", null);
            }
            bravo = bravo2;
        }
        if (bravo != null) {
            cVar.charlie("Registered Firebase Analytics listener.");
            m mVar = new m(27);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            TimeUnit timeUnit2 = TimeUnit.MILLISECONDS;
            ?? obj2 = new Object();
            obj2.purple = new Object();
            obj2.alpha = cVar2;
            synchronized (fVar) {
                try {
                    Iterator it = ((ArrayList) fVar.charlie).iterator();
                    while (it.hasNext()) {
                        mVar.india((q) it.next());
                    }
                    obj.purple = mVar;
                    obj.alpha = obj2;
                    fVar.bravo = mVar;
                    fVar.alpha = obj2;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return;
        }
        cVar.golf("Could not register Firebase Analytics listener; a listener is already registered.", null);
    }

    @Override // N7.a
    public void india(q qVar) {
        f fVar = this.alpha;
        synchronized (fVar) {
            if (((N7.a) fVar.bravo) instanceof N7.b) {
                ((ArrayList) fVar.charlie).add(qVar);
            }
            ((N7.a) fVar.bravo).india(qVar);
        }
    }

    @Override // M7.a
    public void juliet(Bundle bundle) {
        ((M7.a) this.alpha.alpha).juliet(bundle);
    }
}
