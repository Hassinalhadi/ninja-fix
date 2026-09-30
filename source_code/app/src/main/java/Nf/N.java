package Nf;

import kotlin.jvm.internal.Intrinsics;
import s6.AbstractC2796v6;

/* loaded from: classes2.dex */
public final class N extends F {
    public static final N charlie = new F(O.alpha);

    @Override // Nf.AbstractC0243a
    public final int delta(Object obj) {
        short[] sArr = (short[]) obj;
        Intrinsics.echo(sArr, "<this>");
        return sArr.length;
    }

    @Override // Nf.r, Nf.AbstractC0243a
    public final void foxtrot(Mf.a aVar, int i4, Object obj) {
        M builder = (M) obj;
        Intrinsics.echo(builder, "builder");
        short yankee = aVar.yankee(this.bravo, i4);
        builder.bravo(builder.delta() + 1);
        short[] sArr = builder.alpha;
        int i5 = builder.bravo;
        builder.bravo = i5 + 1;
        sArr[i5] = yankee;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [Nf.M, java.lang.Object] */
    @Override // Nf.AbstractC0243a
    public final Object golf(Object obj) {
        short[] sArr = (short[]) obj;
        Intrinsics.echo(sArr, "<this>");
        ?? obj2 = new Object();
        obj2.alpha = sArr;
        obj2.bravo = sArr.length;
        obj2.bravo(10);
        return obj2;
    }

    @Override // Nf.F
    public final Object juliet() {
        return new short[0];
    }

    @Override // Nf.F
    public final void kilo(Mf.b encoder, Object obj, int i4) {
        short[] content = (short[]) obj;
        Intrinsics.echo(encoder, "encoder");
        Intrinsics.echo(content, "content");
        for (int i5 = 0; i5 < i4; i5++) {
            short s3 = content[i5];
            AbstractC2796v6 abstractC2796v6 = (AbstractC2796v6) encoder;
            E descriptor = this.bravo;
            Intrinsics.echo(descriptor, "descriptor");
            abstractC2796v6.tango(descriptor, i5);
            abstractC2796v6.foxtrot(s3);
        }
    }
}
