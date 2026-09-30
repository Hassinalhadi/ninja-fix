package com.google.firebase.crashlytics;

import B2.s;
import B7.g;
import H7.a;
import H7.b;
import H7.c;
import I7.j;
import I7.p;
import K8.d;
import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import j8.InterfaceC1947d;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import s6.H0;

/* loaded from: classes2.dex */
public class CrashlyticsRegistrar implements ComponentRegistrar {
    public static final /* synthetic */ int delta = 0;
    public final p alpha = new p(a.class, ExecutorService.class);
    public final p bravo = new p(b.class, ExecutorService.class);
    public final p charlie = new p(c.class, ExecutorService.class);

    static {
        d dVar = d.alpha;
        Map map = K8.c.bravo;
        if (map.containsKey(dVar)) {
            Log.d("SessionsDependencies", "Dependency " + dVar + " already added.");
            return;
        }
        map.put(dVar, new K8.a(new Ef.c(true)));
        Log.d("SessionsDependencies", "Dependency to " + dVar + " added.");
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        I7.a bravo = I7.b.bravo(K7.b.class);
        bravo.alpha = "fire-cls";
        bravo.alpha(j.charlie(g.class));
        bravo.alpha(j.charlie(InterfaceC1947d.class));
        bravo.alpha(new j(this.alpha, 1, 0));
        bravo.alpha(new j(this.bravo, 1, 0));
        bravo.alpha(new j(this.charlie, 1, 0));
        bravo.alpha(new j(0, 2, L7.a.class));
        bravo.alpha(new j(0, 2, F7.b.class));
        bravo.alpha(new j(0, 2, H8.a.class));
        bravo.foxtrot = new s(14, this);
        bravo.charlie(2);
        return Arrays.asList(bravo.bravo(), H0.alpha("fire-cls", "19.4.4"));
    }
}
