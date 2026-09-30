package Nf;

import kotlin.UInt;
import kotlin.jvm.internal.Intrinsics;
import s6.AbstractC2796v6;

/* loaded from: classes2.dex */
public final class W extends F {
    public static final W charlie = new F(X.alpha);

    @Override // Nf.AbstractC0243a
    public final int delta(Object obj) {
        int[] collectionSize = ((kotlin.o) obj).alpha;
        Intrinsics.echo(collectionSize, "$this$collectionSize");
        return collectionSize.length;
    }

    @Override // Nf.r, Nf.AbstractC0243a
    public final void foxtrot(Mf.a aVar, int i4, Object obj) {
        V builder = (V) obj;
        Intrinsics.echo(builder, "builder");
        int m210constructorimpl = UInt.m210constructorimpl(aVar.hotel(this.bravo, i4).juliet());
        builder.bravo(builder.delta() + 1);
        int[] iArr = builder.alpha;
        int i5 = builder.bravo;
        builder.bravo = i5 + 1;
        iArr[i5] = m210constructorimpl;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [Nf.V, java.lang.Object] */
    @Override // Nf.AbstractC0243a
    public final Object golf(Object obj) {
        int[] toBuilder = ((kotlin.o) obj).alpha;
        Intrinsics.echo(toBuilder, "$this$toBuilder");
        ?? obj2 = new Object();
        obj2.alpha = toBuilder;
        obj2.bravo = toBuilder.length;
        obj2.bravo(10);
        return obj2;
    }

    @Override // Nf.F
    public final Object juliet() {
        return new kotlin.o(new int[0]);
    }

    @Override // Nf.F
    public final void kilo(Mf.b encoder, Object obj, int i4) {
        int[] iArr = ((kotlin.o) obj).alpha;
        Intrinsics.echo(encoder, "encoder");
        for (int i5 = 0; i5 < i4; i5++) {
            ((AbstractC2796v6) encoder).uniform(this.bravo, i5).mike(UInt.m210constructorimpl(iArr[i5]));
        }
    }
}
