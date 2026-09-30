package com.google.mlkit.common.internal;

import I7.a;
import I7.b;
import I7.j;
import V8.c;
import com.google.firebase.components.ComponentRegistrar;
import com.google.mlkit.common.sdkinternal.d;
import com.google.mlkit.common.sdkinternal.i;
import com.google.mlkit.common.sdkinternal.m;
import g7.f;
import java.util.List;
import r6.AbstractC2496d;
import r6.C2494b;
import r6.g;
import r6.u;
import t6.AbstractC2993g;

/* loaded from: classes2.dex */
public class CommonComponentRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        a bravo = b.bravo(W8.a.class);
        bravo.alpha(j.charlie(i.class));
        bravo.foxtrot = new W8.a(9);
        b bravo2 = bravo.bravo();
        a bravo3 = b.bravo(com.google.mlkit.common.sdkinternal.j.class);
        bravo3.foxtrot = new com.google.mlkit.common.sdkinternal.b(9);
        b bravo4 = bravo3.bravo();
        a bravo5 = b.bravo(c.class);
        bravo5.alpha(new j(2, 0, V8.b.class));
        bravo5.foxtrot = new f(9);
        b bravo6 = bravo5.bravo();
        a bravo7 = b.bravo(d.class);
        bravo7.alpha(new j(1, 1, com.google.mlkit.common.sdkinternal.j.class));
        bravo7.foxtrot = new g8.d(9);
        b bravo8 = bravo7.bravo();
        a bravo9 = b.bravo(com.google.mlkit.common.sdkinternal.a.class);
        bravo9.foxtrot = new u(9);
        b bravo10 = bravo9.bravo();
        a bravo11 = b.bravo(com.google.mlkit.common.sdkinternal.b.class);
        bravo11.alpha(j.charlie(com.google.mlkit.common.sdkinternal.a.class));
        bravo11.foxtrot = new u8.b(9);
        b bravo12 = bravo11.bravo();
        a bravo13 = b.bravo(U8.a.class);
        bravo13.alpha(j.charlie(i.class));
        bravo13.foxtrot = new U8.a(10);
        b bravo14 = bravo13.bravo();
        a bravo15 = b.bravo(V8.b.class);
        bravo15.echo = 1;
        bravo15.alpha(new j(1, 1, U8.a.class));
        bravo15.foxtrot = new W8.a(10);
        b bravo16 = bravo15.bravo();
        C2494b c2494b = AbstractC2496d.purple;
        Object[] objArr = {m.bravo, bravo2, bravo4, bravo6, bravo8, bravo10, bravo12, bravo14, bravo16};
        AbstractC2993g.bravo(9, objArr);
        return new g(9, objArr);
    }
}
