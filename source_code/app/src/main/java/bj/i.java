package bj;

import android.location.Location;
import android.view.Surface;
import androidx.camera.core.C0499f;
import androidx.camera.core.impl.DeferrableSurface$SurfaceClosedException;
import av.q;
import be.InterfaceC0755a;
import com.app.feature.location.store.LastSentLocationStore;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.tasks.Task;
import g3.v;
import g3.x;
import g3.y;
import k4.C2007a;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p3.C2272d;
import p3.ab;
import p3.ae;
import s6.M4;
import s6.T7;
import u3.InterfaceC3142e;

/* loaded from: classes3.dex */
public final /* synthetic */ class i implements InterfaceC0755a, G6.e {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Object purple;
    public final /* synthetic */ Object red;
    public final /* synthetic */ Object silver;
    public final /* synthetic */ Object teal;

    public /* synthetic */ i(int i4, ab abVar, String str, FusedLocationProviderClient fusedLocationProviderClient, String str2) {
        this.alpha = i4;
        this.purple = abVar;
        this.red = str;
        this.silver = fusedLocationProviderClient;
        this.teal = str2;
    }

    @Override // be.InterfaceC0755a
    public com.google.common.util.concurrent.e apply(Object obj) {
        boolean z2;
        j jVar = (j) this.red;
        Surface surface = (Surface) obj;
        k kVar = (k) this.purple;
        kVar.getClass();
        surface.getClass();
        try {
            jVar.delta();
            l lVar = new l(surface, this.alpha, kVar.golf.alpha, (C0499f) this.silver, (C0499f) this.teal);
            lVar.f3392c.purple.foxtrot(new g(jVar, 1), tg.k.bravo());
            if (jVar.romeo == null) {
                z2 = true;
            } else {
                z2 = false;
            }
            T7.golf("Consumer can only be linked once.", z2);
            jVar.romeo = lVar;
            return be.h.charlie(lVar);
        } catch (DeferrableSurface$SurfaceClosedException e) {
            return new be.j(1, e);
        }
    }

    @Override // G6.e
    public void onComplete(Task task) {
        Location location;
        final ab abVar = (ab) this.purple;
        final String str = (String) this.red;
        Intrinsics.echo(task, "task");
        try {
            if (task.juliet()) {
                location = (Location) task.hotel();
            } else {
                location = null;
            }
            final Location location2 = location;
            final String str2 = (String) this.teal;
            final int i4 = this.alpha;
            final FusedLocationProviderClient fusedLocationProviderClient = (FusedLocationProviderClient) this.silver;
            if (location2 == null) {
                if (i4 < 4) {
                    abVar.alpha.charlie.alpha("LocationFlow", "SEND_VALIDATION_RETRY source=STUCK_FALLBACK attempt=" + i4 + " reason=no_location");
                    final int i5 = 0;
                    abVar.black.postDelayed(new Runnable() { // from class: p3.r
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i5) {
                                case 0:
                                    int i10 = i4 + 1;
                                    String str3 = str;
                                    String str4 = str2;
                                    FusedLocationProviderClient fusedLocationProviderClient2 = fusedLocationProviderClient;
                                    fusedLocationProviderClient2.getLastLocation().bravo(new bj.i(i10, abVar, str3, fusedLocationProviderClient2, str4));
                                    return;
                                default:
                                    int i11 = i4 + 1;
                                    String str5 = str;
                                    String str6 = str2;
                                    FusedLocationProviderClient fusedLocationProviderClient3 = fusedLocationProviderClient;
                                    fusedLocationProviderClient3.getLastLocation().bravo(new bj.i(i11, abVar, str5, fusedLocationProviderClient3, str6));
                                    return;
                            }
                        }
                    }, 800L);
                    return;
                }
                abVar.alpha.charlie.alpha("LocationFlow", "[STUCK_FALLBACK] getLastLocation returned null after " + i4 + " attempts | accuracyMode=" + str);
                return;
            }
            ae aeVar = ae.teal;
            M4 bravo = ab.bravo(abVar, location2, aeVar);
            boolean z2 = bravo instanceof x;
            C2272d c2272d = abVar.alpha;
            InterfaceC3142e interfaceC3142e = c2272d.charlie;
            if (z2) {
                v vVar = ((x) bravo).bravo;
                if (i4 < 4) {
                    interfaceC3142e.alpha("LocationFlow", "SEND_VALIDATION_RETRY source=STUCK_FALLBACK attempt=" + i4 + " reason=" + vVar);
                    final int i10 = 1;
                    abVar.black.postDelayed(new Runnable() { // from class: p3.r
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i10) {
                                case 0:
                                    int i102 = i4 + 1;
                                    String str3 = str;
                                    String str4 = str2;
                                    FusedLocationProviderClient fusedLocationProviderClient2 = fusedLocationProviderClient;
                                    fusedLocationProviderClient2.getLastLocation().bravo(new bj.i(i102, abVar, str3, fusedLocationProviderClient2, str4));
                                    return;
                                default:
                                    int i11 = i4 + 1;
                                    String str5 = str;
                                    String str6 = str2;
                                    FusedLocationProviderClient fusedLocationProviderClient3 = fusedLocationProviderClient;
                                    fusedLocationProviderClient3.getLastLocation().bravo(new bj.i(i11, abVar, str5, fusedLocationProviderClient3, str6));
                                    return;
                            }
                        }
                    }, 800L);
                    return;
                }
                interfaceC3142e.alpha("LocationFlow", "[STUCK_FALLBACK] Cached location rejected after " + i4 + " attempts: " + vVar + " | accuracyMode=" + str);
                return;
            }
            if (bravo instanceof y) {
                long currentTimeMillis = System.currentTimeMillis() - location2.getTime();
                if (currentTimeMillis < 0) {
                    currentTimeMillis = 0;
                }
                if (currentTimeMillis > 120000) {
                    interfaceC3142e.alpha("LocationFlow", "[STUCK_FALLBACK_REJECTED_HARD_CAP] age=" + currentTimeMillis + "ms exceeds 120000ms | accuracyMode=" + str);
                    return;
                }
                final long j5 = currentTimeMillis;
                final float accuracy = location2.getAccuracy();
                try {
                    abVar.echo.charlie(location2, str2, c2272d.delta.toPayload(location2), aeVar, new Function0() { // from class: p3.s
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            long currentTimeMillis2 = System.currentTimeMillis();
                            ab abVar2 = abVar;
                            LastSentLocationStore lastSentLocationStore = abVar2.alpha.mike;
                            Location location3 = location2;
                            lastSentLocationStore.save(location3);
                            double latitude = location3.getLatitude();
                            double longitude = location3.getLongitude();
                            long time = location3.getTime();
                            g3.ab state = abVar2.victor;
                            Intrinsics.echo(state, "state");
                            state.alpha = time;
                            state.bravo = latitude;
                            state.charlie = longitude;
                            state.delta = currentTimeMillis2;
                            abVar2.foxtrot(Long.valueOf(currentTimeMillis2));
                            abVar2.alpha.charlie.alpha("LocationFlow", "[STUCK_FALLBACK] Sent cached location age=" + j5 + "ms accuracy=" + accuracy + "m | accuracyMode=" + str);
                            return Unit.INSTANCE;
                        }
                    }, new C2007a(7, abVar, str));
                    return;
                } catch (Exception e) {
                    e = e;
                    str = str;
                    abVar = abVar;
                    abVar.alpha.charlie.alpha("LocationFlow", q.foxtrot("[STUCK_FALLBACK] Exception: ", e.getMessage(), " | accuracyMode=", str));
                    return;
                }
            }
            throw new NoWhenBranchMatchedException();
        } catch (Exception e4) {
            e = e4;
        }
    }

    public /* synthetic */ i(k kVar, j jVar, int i4, C0499f c0499f, C0499f c0499f2) {
        this.purple = kVar;
        this.red = jVar;
        this.alpha = i4;
        this.silver = c0499f;
        this.teal = c0499f2;
    }
}
