package Nf;

import kotlin.jvm.internal.Intrinsics;
import s6.AbstractC2796v6;

/* renamed from: Nf.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0248f extends F {
    public static final C0248f charlie = new F(C0249g.alpha);

    @Override // Nf.AbstractC0243a
    public final int delta(Object obj) {
        boolean[] zArr = (boolean[]) obj;
        Intrinsics.echo(zArr, "<this>");
        return zArr.length;
    }

    @Override // Nf.r, Nf.AbstractC0243a
    public final void foxtrot(Mf.a aVar, int i4, Object obj) {
        C0247e builder = (C0247e) obj;
        Intrinsics.echo(builder, "builder");
        boolean oscar = aVar.oscar(this.bravo, i4);
        builder.bravo(builder.delta() + 1);
        boolean[] zArr = builder.alpha;
        int i5 = builder.bravo;
        builder.bravo = i5 + 1;
        zArr[i5] = oscar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, Nf.e] */
    @Override // Nf.AbstractC0243a
    public final Object golf(Object obj) {
        boolean[] zArr = (boolean[]) obj;
        Intrinsics.echo(zArr, "<this>");
        ?? obj2 = new Object();
        obj2.alpha = zArr;
        obj2.bravo = zArr.length;
        obj2.bravo(10);
        return obj2;
    }

    @Override // Nf.F
    public final Object juliet() {
        return new boolean[0];
    }

    @Override // Nf.F
    public final void kilo(Mf.b encoder, Object obj, int i4) {
        boolean[] content = (boolean[]) obj;
        Intrinsics.echo(encoder, "encoder");
        Intrinsics.echo(content, "content");
        for (int i5 = 0; i5 < i4; i5++) {
            boolean z2 = content[i5];
            AbstractC2796v6 abstractC2796v6 = (AbstractC2796v6) encoder;
            E descriptor = this.bravo;
            Intrinsics.echo(descriptor, "descriptor");
            abstractC2796v6.tango(descriptor, i5);
            abstractC2796v6.hotel(z2);
        }
    }
}
