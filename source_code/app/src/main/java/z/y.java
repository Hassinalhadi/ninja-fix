package z;

import a0.C0366t;
import androidx.compose.foundation.layout.V;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.runtime.Q;
import androidx.compose.runtime.as;
import bz.AbstractC0779d;
import bz.AbstractC0800z;
import bz.C0795u;
import bz.g0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import t0.AbstractC2901T;
import t6.T3;
import y.ar;

/* loaded from: classes3.dex */
public abstract class y {
    public static final float alpha;
    public static final C0795u bravo;

    static {
        int i4 = v.alpha;
        alpha = 40;
        new C0795u(0.2f, 0.0f, 0.8f, 1.0f);
        new C0795u(0.4f, 0.0f, 1.0f, 1.0f);
        new C0795u(0.0f, 0.0f, 0.65f, 1.0f);
        new C0795u(0.1f, 0.0f, 0.45f, 1.0f);
        bravo = new C0795u(0.4f, 0.0f, 0.2f, 1.0f);
    }

    public static final void alpha(T.s sVar, final long j5, final float f5, long j6, int i4, InterfaceC0581m interfaceC0581m, final int i5) {
        boolean z2;
        T.s sVar2;
        final long j7;
        final int i10;
        int i11;
        long j10;
        int i12;
        final long j11;
        Object obj;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-1119119072);
        int i13 = i5 | 11264;
        if ((i13 & 9363) != 9362) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i13 & 1, z2)) {
            c0585q.orange();
            if ((i5 & 1) != 0 && !c0585q.beige()) {
                c0585q.ochre();
                j10 = j6;
                i11 = i4;
            } else {
                i11 = 2;
                j10 = C0366t.juliet;
            }
            c0585q.romeo();
            final c0.h hVar = new c0.h(((Q0.d) c0585q.kilo(AbstractC2901T.hotel)).lavender(f5), 0.0f, i11, 0, null, 26);
            int i14 = i11;
            bz.aj india = AbstractC0779d.india(null, c0585q, 1);
            g0 g0Var = AbstractC0779d.kilo;
            S7.a aVar = AbstractC0800z.delta;
            final bz.ag delta = AbstractC0779d.delta(india, 0, 5, g0Var, AbstractC0779d.golf(AbstractC0779d.kilo(6660, 0, aVar, 2), 6), null, c0585q, 33208, 16);
            c0585q = c0585q;
            final bz.ag charlie = AbstractC0779d.charlie(india, 286.0f, AbstractC0779d.golf(AbstractC0779d.kilo(1332, 0, aVar, 2), 6), null, c0585q, 4536, 8);
            Object jade = c0585q.jade();
            as asVar = C0580l.alpha;
            if (jade == asVar) {
                jade = new ar(3);
                c0585q.f(jade);
            }
            final bz.ag charlie2 = AbstractC0779d.charlie(india, 290.0f, AbstractC0779d.golf(AbstractC0779d.hotel((Function1) jade), 6), null, c0585q, 4536, 8);
            Object jade2 = c0585q.jade();
            if (jade2 == asVar) {
                jade2 = new ar(4);
                c0585q.f(jade2);
            }
            final bz.ag charlie3 = AbstractC0779d.charlie(india, 290.0f, AbstractC0779d.golf(AbstractC0779d.hotel((Function1) jade2), 6), null, c0585q, 4536, 8);
            sVar2 = sVar;
            T.s kilo = V.kilo(A0.o.bravo(sVar2, true, new a5.c(13)), alpha);
            boolean india2 = c0585q.india(hVar) | c0585q.golf(delta) | c0585q.golf(charlie2) | c0585q.golf(charlie3) | c0585q.golf(charlie);
            Object jade3 = c0585q.jade();
            if (india2 || jade3 == asVar) {
                i12 = 0;
                j11 = j10;
                obj = new Function1() { // from class: z.w
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        float f10;
                        c0.d dVar = (c0.d) obj2;
                        c0.h hVar2 = hVar;
                        y.bravo(dVar, 0.0f, 360.0f, j11, hVar2);
                        float floatValue = ((Number) charlie2.getValue()).floatValue();
                        bz.ag agVar = charlie3;
                        float abs = Math.abs(floatValue - ((Number) agVar.getValue()).floatValue());
                        float floatValue2 = ((Number) agVar.getValue()).floatValue() + ((Number) charlie.getValue()).floatValue() + (((((Number) delta.getValue()).intValue() * 216.0f) % 360.0f) - 90.0f);
                        if (hVar2.charlie == 0) {
                            f10 = 0.0f;
                        } else {
                            f10 = ((f5 / (y.alpha / 2)) * 57.29578f) / 2.0f;
                        }
                        y.bravo(dVar, floatValue2 + f10, Math.max(abs, 0.1f), j5, hVar2);
                        return Unit.INSTANCE;
                    }
                };
                c0585q.f(obj);
            } else {
                obj = jade3;
                i12 = 0;
                j11 = j10;
            }
            T3.alpha(kilo, (Function1) obj, c0585q, i12);
            j7 = j11;
            i10 = i14;
        } else {
            sVar2 = sVar;
            c0585q.ochre();
            j7 = j6;
            i10 = i4;
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            final T.s sVar3 = sVar2;
            uniform.delta = new Xd.l(j5, f5, j7, i10, i5) { // from class: z.x
                public final /* synthetic */ long purple;
                public final /* synthetic */ float red;
                public final /* synthetic */ long silver;
                public final /* synthetic */ int teal;

                @Override // Xd.l
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int cyan = C0564b.cyan(439);
                    long j12 = this.silver;
                    int i15 = this.teal;
                    y.alpha(T.s.this, this.purple, this.red, j12, i15, (InterfaceC0581m) obj2, cyan);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void bravo(c0.d dVar, float f5, float f10, long j5, c0.h hVar) {
        float f11 = 2;
        float f12 = hVar.alpha / f11;
        float intBitsToFloat = Float.intBitsToFloat((int) (dVar.bravo() >> 32)) - (f11 * f12);
        ao.ad.foxtrot(dVar, j5, f5, f10, (Float.floatToRawIntBits(f12) & 4294967295L) | (Float.floatToRawIntBits(f12) << 32), (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat) & 4294967295L), 0.0f, hVar, 832);
    }
}
