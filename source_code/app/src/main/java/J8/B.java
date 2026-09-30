package J8;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Messenger;
import android.util.Log;
import delivery.samurai.android.services.CaptainLocationMonitoringService;
import java.util.ArrayList;
import java.util.concurrent.LinkedBlockingDeque;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p7.C2284a;
import p7.C2285b;

/* loaded from: classes2.dex */
public final class B implements ServiceConnection {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Object bravo;

    public /* synthetic */ B(int i4, Object obj) {
        this.alpha = i4;
        this.bravo = obj;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        int i4 = 3;
        int i5 = 1;
        Object obj = this.bravo;
        switch (this.alpha) {
            case 0:
                StringBuilder sb2 = new StringBuilder("Connected to SessionLifecycleService. Queue size ");
                J2.n nVar = (J2.n) obj;
                sb2.append(((LinkedBlockingDeque) nVar.red).size());
                Log.d("SessionLifecycleClient", sb2.toString());
                nVar.purple = new Messenger(iBinder);
                ArrayList arrayList = new ArrayList();
                ((LinkedBlockingDeque) nVar.red).drainTo(arrayList);
                vf.ad.zulu(vf.ad.charlie((Nd.h) nVar.alpha), null, null, new A(nVar, arrayList, null), 3);
                return;
            case 1:
                Intrinsics.charlie(iBinder, "null cannot be cast to non-null type delivery.samurai.android.services.CaptainLocationMonitoringService.LocalBinder");
                Y9.k kVar = (Y9.k) obj;
                kVar.charlie = ((Y9.c) iBinder).golf;
                kVar.delta = true;
                Function1 function1 = kVar.foxtrot;
                if (function1 != null) {
                    kVar.alpha();
                    CaptainLocationMonitoringService captainLocationMonitoringService = kVar.charlie;
                    if (captainLocationMonitoringService != null) {
                        captainLocationMonitoringService.hotel(new N2.ae(i4, function1));
                    }
                }
                R9.g gVar = kVar.hotel;
                if (gVar != null) {
                    kVar.bravo();
                    CaptainLocationMonitoringService captainLocationMonitoringService2 = kVar.charlie;
                    if (captainLocationMonitoringService2 != null) {
                        captainLocationMonitoringService2.hotel(new Y9.j(kVar, gVar, i5));
                        return;
                    }
                    return;
                }
                return;
            default:
                C2285b c2285b = (C2285b) obj;
                c2285b.bravo.bravo("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
                c2285b.alpha().post(new com.google.android.play.core.integrity.d(this, iBinder));
                return;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        int i4 = 0;
        Object obj = this.bravo;
        switch (this.alpha) {
            case 0:
                Log.d("SessionLifecycleClient", "Disconnected from SessionLifecycleService");
                J2.n nVar = (J2.n) obj;
                nVar.purple = null;
                nVar.getClass();
                return;
            case 1:
                Y9.k kVar = (Y9.k) obj;
                kVar.delta = false;
                kVar.charlie = null;
                kVar.alpha();
                kVar.bravo();
                return;
            default:
                C2285b c2285b = (C2285b) obj;
                c2285b.bravo.bravo("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
                c2285b.alpha().post(new C2284a(i4, this));
                return;
        }
    }
}
