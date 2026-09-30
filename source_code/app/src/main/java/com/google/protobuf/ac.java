package com.google.protobuf;

import java.nio.charset.Charset;

/* loaded from: classes2.dex */
public final class ac {
    public static final C1510m bravo = new C1510m(1);
    public final Object alpha;

    public ac(C1503f c1503f) {
        Charset charset = AbstractC1517u.alpha;
        if (c1503f != null) {
            this.alpha = c1503f;
            c1503f.charlie = this;
            return;
        }
        throw new NullPointerException("output");
    }

    public void alpha(int i4, Object obj, au auVar) {
        C1503f c1503f = (C1503f) this.alpha;
        c1503f.tango(i4, 3);
        auVar.echo((aj) obj, c1503f.charlie);
        c1503f.tango(i4, 4);
    }

    public void bravo(int i4, Object obj, au auVar) {
        aj ajVar = (aj) obj;
        C1503f c1503f = (C1503f) this.alpha;
        c1503f.tango(i4, 2);
        c1503f.uniform(((AbstractC1498a) ajVar).hotel(auVar));
        auVar.echo(ajVar, c1503f.charlie);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, com.google.protobuf.ab] */
    public ac() {
        ai aiVar;
        try {
            aiVar = (ai) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            aiVar = bravo;
        }
        ai[] aiVarArr = {C1510m.bravo, aiVar};
        ?? obj = new Object();
        obj.alpha = aiVarArr;
        Charset charset = AbstractC1517u.alpha;
        this.alpha = obj;
    }
}
