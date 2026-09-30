package com.google.crypto.tink.shaded.protobuf;

import java.nio.charset.Charset;

/* renamed from: com.google.crypto.tink.shaded.protobuf.m, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1495m {
    public static final u bravo = new u(1);
    public final Object alpha;

    public C1495m(C1494l c1494l) {
        ab.alpha(c1494l, "output");
        this.alpha = c1494l;
        c1494l.alpha = this;
    }

    public void alpha(int i4, AbstractC1490h abstractC1490h) {
        C1494l c1494l = (C1494l) this.alpha;
        c1494l.jade(i4, 2);
        c1494l.lavender(abstractC1490h.size());
        C1489g c1489g = (C1489g) abstractC1490h;
        c1494l.fuchsia(c1489g.silver, c1489g.lima(), c1489g.size());
    }

    public void bravo(int i4, Object obj, A a6) {
        C1494l c1494l = (C1494l) this.alpha;
        c1494l.jade(i4, 3);
        a6.foxtrot((ao) obj, c1494l.alpha);
        c1494l.jade(i4, 4);
    }

    public void charlie(int i4, Object obj, A a6) {
        ao aoVar = (ao) obj;
        C1494l c1494l = (C1494l) this.alpha;
        c1494l.jade(i4, 2);
        AbstractC1483a abstractC1483a = (AbstractC1483a) aoVar;
        abstractC1483a.getClass();
        x xVar = (x) abstractC1483a;
        int i5 = xVar.memoizedSerializedSize;
        if (i5 == -1) {
            i5 = a6.india(abstractC1483a);
            xVar.memoizedSerializedSize = i5;
        }
        c1494l.lavender(i5);
        a6.foxtrot(aoVar, c1494l.alpha);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.crypto.tink.shaded.protobuf.aj, java.lang.Object] */
    public C1495m() {
        an anVar;
        try {
            anVar = (an) Class.forName("com.google.crypto.tink.shaded.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            anVar = bravo;
        }
        an[] anVarArr = {u.bravo, anVar};
        ?? obj = new Object();
        obj.alpha = anVarArr;
        Charset charset = ab.alpha;
        this.alpha = obj;
    }
}
