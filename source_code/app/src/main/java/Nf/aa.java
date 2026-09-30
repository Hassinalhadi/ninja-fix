package Nf;

import kotlin.jvm.internal.Intrinsics;
import s6.AbstractC2796v6;

/* loaded from: classes2.dex */
public final class aa extends F {
    public static final aa charlie = new F(ab.alpha);

    @Override // Nf.AbstractC0243a
    public final int delta(Object obj) {
        float[] fArr = (float[]) obj;
        Intrinsics.echo(fArr, "<this>");
        return fArr.length;
    }

    @Override // Nf.r, Nf.AbstractC0243a
    public final void foxtrot(Mf.a aVar, int i4, Object obj) {
        C0267z builder = (C0267z) obj;
        Intrinsics.echo(builder, "builder");
        float romeo = aVar.romeo(this.bravo, i4);
        builder.bravo(builder.delta() + 1);
        float[] fArr = builder.alpha;
        int i5 = builder.bravo;
        builder.bravo = i5 + 1;
        fArr[i5] = romeo;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [Nf.z, java.lang.Object] */
    @Override // Nf.AbstractC0243a
    public final Object golf(Object obj) {
        float[] fArr = (float[]) obj;
        Intrinsics.echo(fArr, "<this>");
        ?? obj2 = new Object();
        obj2.alpha = fArr;
        obj2.bravo = fArr.length;
        obj2.bravo(10);
        return obj2;
    }

    @Override // Nf.F
    public final Object juliet() {
        return new float[0];
    }

    @Override // Nf.F
    public final void kilo(Mf.b encoder, Object obj, int i4) {
        float[] content = (float[]) obj;
        Intrinsics.echo(encoder, "encoder");
        Intrinsics.echo(content, "content");
        for (int i5 = 0; i5 < i4; i5++) {
            float f5 = content[i5];
            AbstractC2796v6 abstractC2796v6 = (AbstractC2796v6) encoder;
            E descriptor = this.bravo;
            Intrinsics.echo(descriptor, "descriptor");
            abstractC2796v6.tango(descriptor, i5);
            abstractC2796v6.juliet(f5);
        }
    }
}
