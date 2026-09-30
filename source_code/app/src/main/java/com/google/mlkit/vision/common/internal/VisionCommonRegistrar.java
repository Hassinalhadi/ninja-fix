package com.google.mlkit.vision.common.internal;

import I7.a;
import I7.b;
import I7.j;
import Y8.d;
import Y8.e;
import ao.ad;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import t6.m4;
import t6.o4;
import t6.q4;

/* loaded from: classes2.dex */
public class VisionCommonRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        a bravo = b.bravo(e.class);
        bravo.alpha(new j(2, 0, d.class));
        bravo.foxtrot = e.purple;
        Object[] objArr = {bravo.bravo()};
        for (int i4 = 0; i4 < 1; i4++) {
            m4 m4Var = o4.purple;
            if (objArr[i4] == null) {
                throw new NullPointerException(ad.zulu(i4, "at index "));
            }
        }
        m4 m4Var2 = o4.purple;
        return new q4(1, objArr);
    }
}
