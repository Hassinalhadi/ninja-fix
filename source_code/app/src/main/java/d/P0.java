package d;

import a0.C0352f;
import a0.C0360n;
import bz.C0789n;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class P0 implements Function1 {
    public final /* synthetic */ int alpha = 1;
    public final /* synthetic */ float purple;
    public final /* synthetic */ Object red;
    public final /* synthetic */ Object silver;

    public /* synthetic */ P0(float f5, C0352f c0352f, C0360n c0360n) {
        this.purple = f5;
        this.red = c0352f;
        this.silver = c0360n;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        long echo;
        switch (this.alpha) {
            case 0:
                long longValue = ((Long) obj).longValue();
                R0 r02 = (R0) this.red;
                if (r02.bravo == Long.MIN_VALUE) {
                    r02.bravo = longValue;
                }
                float f5 = r02.echo;
                C0789n c0789n = new C0789n(f5);
                float f10 = this.purple;
                C0789n c0789n2 = R0.foxtrot;
                if (f10 == 0.0f) {
                    echo = r02.alpha.amber(new C0789n(f5), c0789n2, r02.charlie);
                } else {
                    echo = Zd.a.echo(((float) (longValue - r02.bravo)) / f10);
                }
                long j5 = echo;
                float f11 = ((C0789n) r02.alpha.foxtrot(j5, c0789n, c0789n2, r02.charlie)).alpha;
                r02.charlie = (C0789n) r02.alpha.gray(j5, c0789n, c0789n2, r02.charlie);
                r02.bravo = longValue;
                float f12 = r02.echo - f11;
                r02.echo = f11;
                ((Function1) this.silver).invoke(Float.valueOf(f12));
                return Unit.INSTANCE;
            default:
                float f13 = this.purple;
                C0352f c0352f = (C0352f) this.red;
                C0360n c0360n = (C0360n) this.silver;
                s0.an anVar = (s0.an) obj;
                anVar.charlie();
                c0.b bVar = anVar.alpha;
                J2.t tVar = bVar.purple;
                long oscar = tVar.oscar();
                tVar.mike().golf();
                try {
                    av.ah ahVar = (av.ah) tVar.alpha;
                    ahVar.red(f13, 0.0f);
                    ahVar.ochre(45.0f, 0L);
                    bVar.foxtrot(c0352f, c0360n);
                    ao.ad.coral(tVar, oscar);
                    return Unit.INSTANCE;
                } catch (Throwable th) {
                    ao.ad.coral(tVar, oscar);
                    throw th;
                }
        }
    }

    public /* synthetic */ P0(R0 r02, float f5, Function1 function1) {
        this.red = r02;
        this.purple = f5;
        this.silver = function1;
    }
}
