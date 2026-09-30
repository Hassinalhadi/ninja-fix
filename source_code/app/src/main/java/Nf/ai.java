package Nf;

import kotlin.jvm.internal.Intrinsics;
import s6.AbstractC2796v6;

/* loaded from: classes2.dex */
public final class ai extends F {
    public static final ai charlie = new F(aj.alpha);

    @Override // Nf.AbstractC0243a
    public final int delta(Object obj) {
        int[] iArr = (int[]) obj;
        Intrinsics.echo(iArr, "<this>");
        return iArr.length;
    }

    @Override // Nf.r, Nf.AbstractC0243a
    public final void foxtrot(Mf.a aVar, int i4, Object obj) {
        ah builder = (ah) obj;
        Intrinsics.echo(builder, "builder");
        int kilo = aVar.kilo(this.bravo, i4);
        builder.bravo(builder.delta() + 1);
        int[] iArr = builder.alpha;
        int i5 = builder.bravo;
        builder.bravo = i5 + 1;
        iArr[i5] = kilo;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [Nf.ah, java.lang.Object] */
    @Override // Nf.AbstractC0243a
    public final Object golf(Object obj) {
        int[] iArr = (int[]) obj;
        Intrinsics.echo(iArr, "<this>");
        ?? obj2 = new Object();
        obj2.alpha = iArr;
        obj2.bravo = iArr.length;
        obj2.bravo(10);
        return obj2;
    }

    @Override // Nf.F
    public final Object juliet() {
        return new int[0];
    }

    @Override // Nf.F
    public final void kilo(Mf.b encoder, Object obj, int i4) {
        int[] content = (int[]) obj;
        Intrinsics.echo(encoder, "encoder");
        Intrinsics.echo(content, "content");
        for (int i5 = 0; i5 < i4; i5++) {
            ((AbstractC2796v6) encoder).victor(i5, content[i5], this.bravo);
        }
    }
}
