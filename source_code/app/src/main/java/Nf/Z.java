package Nf;

import kotlin.jvm.internal.Intrinsics;
import s6.AbstractC2796v6;

/* loaded from: classes2.dex */
public final class Z extends F {
    public static final Z charlie = new F(a0.alpha);

    @Override // Nf.AbstractC0243a
    public final int delta(Object obj) {
        long[] collectionSize = ((kotlin.q) obj).alpha;
        Intrinsics.echo(collectionSize, "$this$collectionSize");
        return collectionSize.length;
    }

    @Override // Nf.r, Nf.AbstractC0243a
    public final void foxtrot(Mf.a aVar, int i4, Object obj) {
        Y builder = (Y) obj;
        Intrinsics.echo(builder, "builder");
        long november = aVar.hotel(this.bravo, i4).november();
        builder.bravo(builder.delta() + 1);
        long[] jArr = builder.alpha;
        int i5 = builder.bravo;
        builder.bravo = i5 + 1;
        jArr[i5] = november;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [Nf.Y, java.lang.Object] */
    @Override // Nf.AbstractC0243a
    public final Object golf(Object obj) {
        long[] toBuilder = ((kotlin.q) obj).alpha;
        Intrinsics.echo(toBuilder, "$this$toBuilder");
        ?? obj2 = new Object();
        obj2.alpha = toBuilder;
        obj2.bravo = toBuilder.length;
        obj2.bravo(10);
        return obj2;
    }

    @Override // Nf.F
    public final Object juliet() {
        return new kotlin.q(new long[0]);
    }

    @Override // Nf.F
    public final void kilo(Mf.b encoder, Object obj, int i4) {
        long[] jArr = ((kotlin.q) obj).alpha;
        Intrinsics.echo(encoder, "encoder");
        for (int i5 = 0; i5 < i4; i5++) {
            ((AbstractC2796v6) encoder).uniform(this.bravo, i5).papa(jArr[i5]);
        }
    }
}
