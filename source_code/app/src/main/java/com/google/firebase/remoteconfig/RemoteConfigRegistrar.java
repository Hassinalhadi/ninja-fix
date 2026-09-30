package com.google.firebase.remoteconfig;

import B7.g;
import C7.b;
import D7.a;
import E8.j;
import E8.k;
import I7.c;
import I7.p;
import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import j8.InterfaceC1947d;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import s6.H0;

@Keep
/* loaded from: classes2.dex */
public class RemoteConfigRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-rc";

    public static j lambda$getComponents$0(p pVar, c cVar) {
        b bVar;
        Context context = (Context) cVar.charlie(Context.class);
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) cVar.oscar(pVar);
        g gVar = (g) cVar.charlie(g.class);
        InterfaceC1947d interfaceC1947d = (InterfaceC1947d) cVar.charlie(InterfaceC1947d.class);
        a aVar = (a) cVar.charlie(a.class);
        synchronized (aVar) {
            try {
                if (!aVar.alpha.containsKey("frc")) {
                    aVar.alpha.put("frc", new b(aVar.bravo));
                }
                bVar = (b) aVar.alpha.get("frc");
            } catch (Throwable th) {
                throw th;
            }
        }
        return new j(context, scheduledExecutorService, gVar, interfaceC1947d, bVar, cVar.india(F7.b.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<I7.b> getComponents() {
        p pVar = new p(H7.b.class, ScheduledExecutorService.class);
        I7.a aVar = new I7.a(j.class, new Class[]{H8.a.class});
        aVar.alpha = LIBRARY_NAME;
        aVar.alpha(I7.j.charlie(Context.class));
        aVar.alpha(new I7.j(pVar, 1, 0));
        aVar.alpha(I7.j.charlie(g.class));
        aVar.alpha(I7.j.charlie(InterfaceC1947d.class));
        aVar.alpha(I7.j.charlie(a.class));
        aVar.alpha(I7.j.alpha(F7.b.class));
        aVar.foxtrot = new k(pVar, 0);
        aVar.charlie(2);
        return Arrays.asList(aVar.bravo(), H0.alpha(LIBRARY_NAME, "22.1.2"));
    }
}
