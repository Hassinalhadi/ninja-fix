package com.google.firebase.perf;

import B5.f;
import B7.a;
import B7.g;
import B8.j;
import E8.k;
import H7.d;
import I7.c;
import I7.p;
import android.app.Application;
import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.messaging.l;
import com.google.firebase.perf.injection.modules.FirebasePerformanceModule_ProvidesConfigResolverFactory;
import com.google.firebase.perf.injection.modules.FirebasePerformanceModule_ProvidesFirebaseAppFactory;
import com.google.firebase.perf.injection.modules.FirebasePerformanceModule_ProvidesFirebaseInstallationsFactory;
import com.google.firebase.perf.injection.modules.FirebasePerformanceModule_ProvidesRemoteConfigComponentFactory;
import com.google.firebase.perf.injection.modules.FirebasePerformanceModule_ProvidesRemoteConfigManagerFactory;
import com.google.firebase.perf.injection.modules.FirebasePerformanceModule_ProvidesSessionManagerFactory;
import com.google.firebase.perf.injection.modules.FirebasePerformanceModule_ProvidesTransportFactoryProviderFactory;
import com.google.firebase.perf.metrics.AppStartTrace;
import com.google.firebase.perf.session.SessionManager;
import j8.InterfaceC1947d;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import q8.C2430a;
import q8.b;
import r8.C2508c;
import s6.H0;
import s8.C2837a;
import t0.RunnableC2944v;

@Keep
/* loaded from: classes2.dex */
public class FirebasePerfRegistrar implements ComponentRegistrar {
    private static final String EARLY_LIBRARY_NAME = "fire-perf-early";
    private static final String LIBRARY_NAME = "fire-perf";

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, q8.a] */
    /* JADX WARN: Type inference failed for: r3v5, types: [q8.c, java.lang.Object] */
    public static C2430a lambda$getComponents$0(p pVar, c cVar) {
        g gVar = (g) cVar.charlie(g.class);
        a aVar = (a) cVar.india(a.class).get();
        Executor executor = (Executor) cVar.oscar(pVar);
        ?? obj = new Object();
        gVar.alpha();
        Context context = gVar.alpha;
        C2837a echo = C2837a.echo();
        echo.getClass();
        C2837a.delta.bravo = j.alpha(context);
        echo.charlie.charlie(context);
        C2508c alpha = C2508c.alpha();
        synchronized (alpha) {
            if (!alpha.f13209i) {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext instanceof Application) {
                    ((Application) applicationContext).registerActivityLifecycleCallbacks(alpha);
                    alpha.f13209i = true;
                }
            }
        }
        alpha.charlie(new Object());
        if (aVar != null) {
            AppStartTrace bravo = AppStartTrace.bravo();
            bravo.foxtrot(context);
            executor.execute(new RunnableC2944v(1, bravo));
        }
        SessionManager.getInstance().initializeGaugeCollection();
        return obj;
    }

    public static b providesFirebasePerformance(c cVar) {
        cVar.charlie(C2430a.class);
        t8.a aVar = new t8.a((g) cVar.charlie(g.class), (InterfaceC1947d) cVar.charlie(InterfaceC1947d.class), cVar.india(E8.j.class), cVar.india(f.class));
        return (b) dagger.internal.a.bravo(new FirebasePerformance_Factory(new FirebasePerformanceModule_ProvidesFirebaseAppFactory(aVar), new FirebasePerformanceModule_ProvidesRemoteConfigComponentFactory(aVar), new FirebasePerformanceModule_ProvidesFirebaseInstallationsFactory(aVar), new FirebasePerformanceModule_ProvidesTransportFactoryProviderFactory(aVar), new FirebasePerformanceModule_ProvidesRemoteConfigManagerFactory(aVar), new FirebasePerformanceModule_ProvidesConfigResolverFactory(aVar), new FirebasePerformanceModule_ProvidesSessionManagerFactory(aVar))).get();
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List<I7.b> getComponents() {
        p pVar = new p(d.class, Executor.class);
        I7.a bravo = I7.b.bravo(b.class);
        bravo.alpha = LIBRARY_NAME;
        bravo.alpha(I7.j.charlie(g.class));
        bravo.alpha(new I7.j(1, 1, E8.j.class));
        bravo.alpha(I7.j.charlie(InterfaceC1947d.class));
        bravo.alpha(new I7.j(1, 1, f.class));
        bravo.alpha(I7.j.charlie(C2430a.class));
        bravo.foxtrot = new l(15);
        I7.b bravo2 = bravo.bravo();
        I7.a bravo3 = I7.b.bravo(C2430a.class);
        bravo3.alpha = EARLY_LIBRARY_NAME;
        bravo3.alpha(I7.j.charlie(g.class));
        bravo3.alpha(I7.j.alpha(a.class));
        bravo3.alpha(new I7.j(pVar, 1, 0));
        bravo3.charlie(2);
        bravo3.foxtrot = new k(pVar, 3);
        return Arrays.asList(bravo2, bravo3.bravo(), H0.alpha(LIBRARY_NAME, "21.0.5"));
    }
}
