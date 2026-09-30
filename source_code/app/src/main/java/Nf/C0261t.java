package Nf;

import kotlin.jvm.internal.Intrinsics;
import s6.AbstractC2796v6;

/* renamed from: Nf.t, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0261t extends F {
    public static final C0261t charlie = new F(C0262u.alpha);

    @Override // Nf.AbstractC0243a
    public final int delta(Object obj) {
        double[] dArr = (double[]) obj;
        Intrinsics.echo(dArr, "<this>");
        return dArr.length;
    }

    @Override // Nf.r, Nf.AbstractC0243a
    public final void foxtrot(Mf.a aVar, int i4, Object obj) {
        C0260s builder = (C0260s) obj;
        Intrinsics.echo(builder, "builder");
        double amber = aVar.amber(this.bravo, i4);
        builder.bravo(builder.delta() + 1);
        double[] dArr = builder.alpha;
        int i5 = builder.bravo;
        builder.bravo = i5 + 1;
        dArr[i5] = amber;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [Nf.s, java.lang.Object] */
    @Override // Nf.AbstractC0243a
    public final Object golf(Object obj) {
        double[] dArr = (double[]) obj;
        Intrinsics.echo(dArr, "<this>");
        ?? obj2 = new Object();
        obj2.alpha = dArr;
        obj2.bravo = dArr.length;
        obj2.bravo(10);
        return obj2;
    }

    @Override // Nf.F
    public final Object juliet() {
        return new double[0];
    }

    @Override // Nf.F
    public final void kilo(Mf.b encoder, Object obj, int i4) {
        double[] content = (double[]) obj;
        Intrinsics.echo(encoder, "encoder");
        Intrinsics.echo(content, "content");
        for (int i5 = 0; i5 < i4; i5++) {
            double d4 = content[i5];
            AbstractC2796v6 abstractC2796v6 = (AbstractC2796v6) encoder;
            E descriptor = this.bravo;
            Intrinsics.echo(descriptor, "descriptor");
            abstractC2796v6.tango(descriptor, i5);
            abstractC2796v6.echo(d4);
        }
    }
}
