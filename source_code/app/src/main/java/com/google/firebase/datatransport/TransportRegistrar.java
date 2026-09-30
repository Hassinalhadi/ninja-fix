package com.google.firebase.datatransport;

import B5.f;
import C5.a;
import E5.s;
import I7.b;
import I7.c;
import I7.j;
import I7.p;
import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import s6.H0;

@Keep
/* loaded from: classes2.dex */
public class TransportRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-transport";

    public static /* synthetic */ f lambda$getComponents$0(c cVar) {
        s.bravo((Context) cVar.charlie(Context.class));
        return s.alpha().charlie(a.foxtrot);
    }

    public static /* synthetic */ f lambda$getComponents$1(c cVar) {
        s.bravo((Context) cVar.charlie(Context.class));
        return s.alpha().charlie(a.foxtrot);
    }

    public static /* synthetic */ f lambda$getComponents$2(c cVar) {
        s.bravo((Context) cVar.charlie(Context.class));
        return s.alpha().charlie(a.echo);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<b> getComponents() {
        I7.a bravo = b.bravo(f.class);
        bravo.alpha = LIBRARY_NAME;
        bravo.alpha(j.charlie(Context.class));
        bravo.foxtrot = new S7.a(9);
        b bravo2 = bravo.bravo();
        I7.a alpha = b.alpha(new p(Z7.a.class, f.class));
        alpha.alpha(j.charlie(Context.class));
        alpha.foxtrot = new S7.a(10);
        b bravo3 = alpha.bravo();
        I7.a alpha2 = b.alpha(new p(Z7.b.class, f.class));
        alpha2.alpha(j.charlie(Context.class));
        alpha2.foxtrot = new S7.a(11);
        return Arrays.asList(bravo2, bravo3, alpha2.bravo(), H0.alpha(LIBRARY_NAME, "19.0.0"));
    }
}
