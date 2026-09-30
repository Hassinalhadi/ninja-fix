package com.google.firebase.installations;

import B2.s;
import B7.g;
import H7.a;
import H7.b;
import I7.c;
import I7.p;
import J7.j;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.messaging.l;
import g8.d;
import g8.e;
import j8.C1946c;
import j8.InterfaceC1947d;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import s6.H0;

@Keep
/* loaded from: classes2.dex */
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-installations";

    public static InterfaceC1947d lambda$getComponents$0(c cVar) {
        return new C1946c((g) cVar.charlie(g.class), cVar.india(e.class), (ExecutorService) cVar.oscar(new p(a.class, ExecutorService.class)), new j((Executor) cVar.oscar(new p(b.class, Executor.class))));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<I7.b> getComponents() {
        I7.a bravo = I7.b.bravo(InterfaceC1947d.class);
        bravo.alpha = LIBRARY_NAME;
        bravo.alpha(I7.j.charlie(g.class));
        bravo.alpha(I7.j.alpha(e.class));
        bravo.alpha(new I7.j(new p(a.class, ExecutorService.class), 1, 0));
        bravo.alpha(new I7.j(new p(b.class, Executor.class), 1, 0));
        bravo.foxtrot = new l(13);
        I7.b bravo2 = bravo.bravo();
        d dVar = new d(0);
        I7.a bravo3 = I7.b.bravo(d.class);
        bravo3.echo = 1;
        bravo3.foxtrot = new s(7, dVar);
        return Arrays.asList(bravo2, bravo3.bravo(), H0.alpha(LIBRARY_NAME, "18.0.0"));
    }
}
