package com.incognia.internal;

import h9.am;

/* loaded from: classes2.dex */
public abstract class njO {
    public static final void W(Gg gg, d7p d7pVar) {
        D5f sVU = gg.sVU();
        sVU.getClass();
        if (!(sVU instanceof L4)) {
            gg.b().b(500L, new am(12, gg, d7pVar));
        }
    }

    public static final boolean b(Gg gg, d7p d7pVar) {
        D5f sVU = gg.sVU();
        sVU.getClass();
        if (!(sVU instanceof L4)) {
            gg.b().b(d7pVar);
            return true;
        }
        return false;
    }

    public static final void f9(Gg gg, d7p d7pVar) {
        D5f sVU = gg.sVU();
        sVU.getClass();
        if (!(sVU instanceof L4)) {
            d7pVar.run();
        }
    }
}
