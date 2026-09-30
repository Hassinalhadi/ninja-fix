package Nf;

import kotlin.UByte;
import kotlin.jvm.internal.Intrinsics;
import s6.AbstractC2796v6;

/* loaded from: classes2.dex */
public final class T extends F {
    public static final T charlie = new F(U.alpha);

    @Override // Nf.AbstractC0243a
    public final int delta(Object obj) {
        byte[] collectionSize = ((kotlin.n) obj).alpha;
        Intrinsics.echo(collectionSize, "$this$collectionSize");
        return collectionSize.length;
    }

    @Override // Nf.r, Nf.AbstractC0243a
    public final void foxtrot(Mf.a aVar, int i4, Object obj) {
        S builder = (S) obj;
        Intrinsics.echo(builder, "builder");
        byte m209constructorimpl = UByte.m209constructorimpl(aVar.hotel(this.bravo, i4).xray());
        builder.bravo(builder.delta() + 1);
        byte[] bArr = builder.alpha;
        int i5 = builder.bravo;
        builder.bravo = i5 + 1;
        bArr[i5] = m209constructorimpl;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [Nf.S, java.lang.Object] */
    @Override // Nf.AbstractC0243a
    public final Object golf(Object obj) {
        byte[] toBuilder = ((kotlin.n) obj).alpha;
        Intrinsics.echo(toBuilder, "$this$toBuilder");
        ?? obj2 = new Object();
        obj2.alpha = toBuilder;
        obj2.bravo = toBuilder.length;
        obj2.bravo(10);
        return obj2;
    }

    @Override // Nf.F
    public final Object juliet() {
        return new kotlin.n(new byte[0]);
    }

    @Override // Nf.F
    public final void kilo(Mf.b encoder, Object obj, int i4) {
        byte[] bArr = ((kotlin.n) obj).alpha;
        Intrinsics.echo(encoder, "encoder");
        for (int i5 = 0; i5 < i4; i5++) {
            ((AbstractC2796v6) encoder).uniform(this.bravo, i5).golf(UByte.m209constructorimpl(bArr[i5]));
        }
    }
}
