package Y9;

import android.app.Service;
import com.app.feature.location.LocationBroadcastConfig;
import com.app.feature.location.api.AllowMockProvider;
import com.app.feature.location.api.LocationPayloadMapper;
import com.app.feature.location.api.StompStateHolder;
import com.app.feature.location.api.UserInfoProvider;
import com.app.feature.location.store.LastSentLocationStore;
import dagger.hilt.android.internal.managers.ServiceComponentManager;
import dagger.hilt.internal.GeneratedComponentManagerHolder;
import dagger.hilt.internal.UnsafeCasts;
import delivery.samurai.android.services.CaptainLocationMonitoringService;
import g3.InterfaceC1740a;
import g3.ad;
import g3.ae;
import g3.w;
import k3.InterfaceC2002a;
import u3.InterfaceC3142e;
import u3.InterfaceC3143f;
import v3.InterfaceC3171a;
import w9.n;
import w9.p;

/* loaded from: classes2.dex */
public abstract class h extends Service implements GeneratedComponentManagerHolder {
    public volatile ServiceComponentManager alpha;
    public final Object purple = new Object();
    public boolean red = false;

    @Override // dagger.hilt.internal.GeneratedComponentManagerHolder
    /* renamed from: alpha, reason: merged with bridge method [inline-methods] */
    public final ServiceComponentManager componentManager() {
        if (this.alpha == null) {
            synchronized (this.purple) {
                try {
                    if (this.alpha == null) {
                        this.alpha = new ServiceComponentManager(this);
                    }
                } finally {
                }
            }
        }
        return this.alpha;
    }

    @Override // dagger.hilt.internal.GeneratedComponentManager
    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    @Override // android.app.Service
    public void onCreate() {
        if (!this.red) {
            this.red = true;
            f fVar = (f) generatedComponent();
            CaptainLocationMonitoringService captainLocationMonitoringService = (CaptainLocationMonitoringService) UnsafeCasts.unsafeCast(this);
            p pVar = ((n) fVar).alpha;
            captainLocationMonitoringService.silver = (InterfaceC3143f) pVar.lavender.get();
            captainLocationMonitoringService.teal = (LastSentLocationStore) pVar.beige.get();
            captainLocationMonitoringService.white = (InterfaceC3171a) pVar.f14014j.get();
            captainLocationMonitoringService.yellow = (ae) pVar.f14015k.get();
            captainLocationMonitoringService.f12082a = (ad) pVar.f14016l.get();
            captainLocationMonitoringService.f12083b = (InterfaceC3142e) pVar.f14017m.get();
            captainLocationMonitoringService.f12088h = (w) pVar.f14019o.get();
            captainLocationMonitoringService.f12089i = (Z9.c) pVar.f14018n.get();
            captainLocationMonitoringService.f12090j = (UserInfoProvider) pVar.f14020p.get();
            captainLocationMonitoringService.f12091k = (StompStateHolder) pVar.f14021q.get();
            captainLocationMonitoringService.f12092l = (AllowMockProvider) pVar.lime.get();
            captainLocationMonitoringService.f12093m = (InterfaceC1740a) pVar.f14022r.get();
            captainLocationMonitoringService.f12094n = (InterfaceC2002a) pVar.f14023s.get();
            captainLocationMonitoringService.f12095o = (LocationBroadcastConfig) pVar.gray.get();
            captainLocationMonitoringService.f12096p = (LocationPayloadMapper) pVar.f14024t.get();
        }
        super.onCreate();
    }
}
