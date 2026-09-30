package com.google.firebase.messaging;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import f8.InterfaceC1697c;
import h8.InterfaceC1819a;
import j8.InterfaceC1947d;
import java.util.Arrays;
import java.util.List;
import s6.H0;

@Keep
/* loaded from: classes2.dex */
public class FirebaseMessagingRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fcm";

    public static /* synthetic */ FirebaseMessaging lambda$getComponents$0(I7.p pVar, I7.c cVar) {
        B7.g gVar = (B7.g) cVar.charlie(B7.g.class);
        if (cVar.charlie(InterfaceC1819a.class) == null) {
            return new FirebaseMessaging(gVar, cVar.india(D8.b.class), cVar.india(g8.f.class), (InterfaceC1947d) cVar.charlie(InterfaceC1947d.class), cVar.mike(pVar), (InterfaceC1697c) cVar.charlie(InterfaceC1697c.class));
        }
        throw new ClassCastException();
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List<I7.b> getComponents() {
        I7.p pVar = new I7.p(Z7.b.class, B5.f.class);
        I7.a bravo = I7.b.bravo(FirebaseMessaging.class);
        bravo.alpha = LIBRARY_NAME;
        bravo.alpha(I7.j.charlie(B7.g.class));
        bravo.alpha(new I7.j(0, 0, InterfaceC1819a.class));
        bravo.alpha(I7.j.alpha(D8.b.class));
        bravo.alpha(I7.j.alpha(g8.f.class));
        bravo.alpha(I7.j.charlie(InterfaceC1947d.class));
        bravo.alpha(new I7.j(pVar, 0, 1));
        bravo.alpha(I7.j.charlie(InterfaceC1697c.class));
        bravo.foxtrot = new E8.k(pVar, 1);
        bravo.charlie(1);
        return Arrays.asList(bravo.bravo(), H0.alpha(LIBRARY_NAME, "24.1.1"));
    }
}
