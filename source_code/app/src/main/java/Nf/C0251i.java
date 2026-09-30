package Nf;

import kotlin.jvm.internal.Intrinsics;
import s6.AbstractC2796v6;

/* renamed from: Nf.i, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0251i extends F {
    public static final C0251i charlie = new F(C0252j.alpha);

    @Override // Nf.AbstractC0243a
    public final int delta(Object obj) {
        byte[] bArr = (byte[]) obj;
        Intrinsics.echo(bArr, "<this>");
        return bArr.length;
    }

    @Override // Nf.r, Nf.AbstractC0243a
    public final void foxtrot(Mf.a aVar, int i4, Object obj) {
        C0250h builder = (C0250h) obj;
        Intrinsics.echo(builder, "builder");
        byte lima = aVar.lima(this.bravo, i4);
        builder.bravo(builder.delta() + 1);
        byte[] bArr = builder.alpha;
        int i5 = builder.bravo;
        builder.bravo = i5 + 1;
        bArr[i5] = lima;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [Nf.h, java.lang.Object] */
    @Override // Nf.AbstractC0243a
    public final Object golf(Object obj) {
        byte[] bArr = (byte[]) obj;
        Intrinsics.echo(bArr, "<this>");
        ?? obj2 = new Object();
        obj2.alpha = bArr;
        obj2.bravo = bArr.length;
        obj2.bravo(10);
        return obj2;
    }

    @Override // Nf.F
    public final Object juliet() {
        return new byte[0];
    }

    @Override // Nf.F
    public final void kilo(Mf.b encoder, Object obj, int i4) {
        byte[] content = (byte[]) obj;
        Intrinsics.echo(encoder, "encoder");
        Intrinsics.echo(content, "content");
        for (int i5 = 0; i5 < i4; i5++) {
            byte b2 = content[i5];
            AbstractC2796v6 abstractC2796v6 = (AbstractC2796v6) encoder;
            E descriptor = this.bravo;
            Intrinsics.echo(descriptor, "descriptor");
            abstractC2796v6.tango(descriptor, i5);
            abstractC2796v6.golf(b2);
        }
    }
}
