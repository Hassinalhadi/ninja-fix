package Nf;

import kotlin.jvm.internal.Intrinsics;
import s6.AbstractC2796v6;

/* loaded from: classes2.dex */
public final class c0 extends F {
    public static final c0 charlie = new F(d0.alpha);

    @Override // Nf.AbstractC0243a
    public final int delta(Object obj) {
        short[] collectionSize = ((kotlin.t) obj).alpha;
        Intrinsics.echo(collectionSize, "$this$collectionSize");
        return collectionSize.length;
    }

    @Override // Nf.r, Nf.AbstractC0243a
    public final void foxtrot(Mf.a aVar, int i4, Object obj) {
        b0 builder = (b0) obj;
        Intrinsics.echo(builder, "builder");
        short azure = aVar.hotel(this.bravo, i4).azure();
        builder.bravo(builder.delta() + 1);
        short[] sArr = builder.alpha;
        int i5 = builder.bravo;
        builder.bravo = i5 + 1;
        sArr[i5] = azure;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, Nf.b0] */
    @Override // Nf.AbstractC0243a
    public final Object golf(Object obj) {
        short[] toBuilder = ((kotlin.t) obj).alpha;
        Intrinsics.echo(toBuilder, "$this$toBuilder");
        ?? obj2 = new Object();
        obj2.alpha = toBuilder;
        obj2.bravo = toBuilder.length;
        obj2.bravo(10);
        return obj2;
    }

    @Override // Nf.F
    public final Object juliet() {
        return new kotlin.t(new short[0]);
    }

    @Override // Nf.F
    public final void kilo(Mf.b encoder, Object obj, int i4) {
        short[] sArr = ((kotlin.t) obj).alpha;
        Intrinsics.echo(encoder, "encoder");
        for (int i5 = 0; i5 < i4; i5++) {
            ((AbstractC2796v6) encoder).uniform(this.bravo, i5).foxtrot(sArr[i5]);
        }
    }
}
