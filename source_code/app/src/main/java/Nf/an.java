package Nf;

import kotlin.jvm.internal.Intrinsics;
import s6.AbstractC2796v6;

/* loaded from: classes2.dex */
public final class an extends F {
    public static final an charlie = new F(ao.alpha);

    @Override // Nf.AbstractC0243a
    public final int delta(Object obj) {
        long[] jArr = (long[]) obj;
        Intrinsics.echo(jArr, "<this>");
        return jArr.length;
    }

    @Override // Nf.r, Nf.AbstractC0243a
    public final void foxtrot(Mf.a aVar, int i4, Object obj) {
        am builder = (am) obj;
        Intrinsics.echo(builder, "builder");
        long golf = aVar.golf(this.bravo, i4);
        builder.bravo(builder.delta() + 1);
        long[] jArr = builder.alpha;
        int i5 = builder.bravo;
        builder.bravo = i5 + 1;
        jArr[i5] = golf;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [Nf.am, java.lang.Object] */
    @Override // Nf.AbstractC0243a
    public final Object golf(Object obj) {
        long[] jArr = (long[]) obj;
        Intrinsics.echo(jArr, "<this>");
        ?? obj2 = new Object();
        obj2.alpha = jArr;
        obj2.bravo = jArr.length;
        obj2.bravo(10);
        return obj2;
    }

    @Override // Nf.F
    public final Object juliet() {
        return new long[0];
    }

    @Override // Nf.F
    public final void kilo(Mf.b encoder, Object obj, int i4) {
        long[] content = (long[]) obj;
        Intrinsics.echo(encoder, "encoder");
        Intrinsics.echo(content, "content");
        for (int i5 = 0; i5 < i4; i5++) {
            long j5 = content[i5];
            AbstractC2796v6 abstractC2796v6 = (AbstractC2796v6) encoder;
            E descriptor = this.bravo;
            Intrinsics.echo(descriptor, "descriptor");
            abstractC2796v6.tango(descriptor, i5);
            abstractC2796v6.papa(j5);
        }
    }
}
