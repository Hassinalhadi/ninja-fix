package Nf;

import kotlin.jvm.internal.Intrinsics;
import s6.AbstractC2796v6;

/* renamed from: Nf.o, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0257o extends F {
    public static final C0257o charlie = new F(C0258p.alpha);

    @Override // Nf.AbstractC0243a
    public final int delta(Object obj) {
        char[] cArr = (char[]) obj;
        Intrinsics.echo(cArr, "<this>");
        return cArr.length;
    }

    @Override // Nf.r, Nf.AbstractC0243a
    public final void foxtrot(Mf.a aVar, int i4, Object obj) {
        C0256n builder = (C0256n) obj;
        Intrinsics.echo(builder, "builder");
        char zulu = aVar.zulu(this.bravo, i4);
        builder.bravo(builder.delta() + 1);
        char[] cArr = builder.alpha;
        int i5 = builder.bravo;
        builder.bravo = i5 + 1;
        cArr[i5] = zulu;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, Nf.n] */
    @Override // Nf.AbstractC0243a
    public final Object golf(Object obj) {
        char[] cArr = (char[]) obj;
        Intrinsics.echo(cArr, "<this>");
        ?? obj2 = new Object();
        obj2.alpha = cArr;
        obj2.bravo = cArr.length;
        obj2.bravo(10);
        return obj2;
    }

    @Override // Nf.F
    public final Object juliet() {
        return new char[0];
    }

    @Override // Nf.F
    public final void kilo(Mf.b encoder, Object obj, int i4) {
        char[] content = (char[]) obj;
        Intrinsics.echo(encoder, "encoder");
        Intrinsics.echo(content, "content");
        for (int i5 = 0; i5 < i4; i5++) {
            char c3 = content[i5];
            AbstractC2796v6 abstractC2796v6 = (AbstractC2796v6) encoder;
            E descriptor = this.bravo;
            Intrinsics.echo(descriptor, "descriptor");
            abstractC2796v6.tango(descriptor, i5);
            abstractC2796v6.kilo(c3);
        }
    }
}
