package s6;

import D0.an;
import F.G2;
import F.S2;
import F.T2;
import a0.C0366t;
import androidx.compose.foundation.layout.AbstractC0538d;
import androidx.compose.foundation.layout.AbstractC0542h;
import androidx.compose.foundation.layout.AbstractC0553t;
import androidx.compose.foundation.layout.C0554u;
import androidx.compose.foundation.layout.InterfaceC0555v;
import androidx.compose.foundation.layout.V;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.E0;
import androidx.compose.runtime.I;
import androidx.compose.runtime.InterfaceC0581m;
import bz.AbstractC0779d;
import bz.AbstractC0800z;
import com.google.mlkit.vision.barcode.common.Barcode;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m.C2093f;
import okhttp3.internal.http2.Http2;
import qb.AbstractC2434a;
import qb.C2435b;
import s0.C2549i;
import s0.C2550j;
import s0.C2551k;
import s0.InterfaceC2552l;
import s6.AbstractC2797v7;

/* renamed from: s6.v7, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2797v7 {
    public static final void alpha(final String title, final T.s sVar, C2093f c2093f, long j5, long j6, long j7, long j10, InterfaceC0581m interfaceC0581m, final int i4) {
        int i5;
        boolean z2;
        final C2093f c2093f2;
        final long j11;
        final long j12;
        final long j13;
        final long j14;
        long j15;
        long j16;
        long j17;
        C2093f c2093f3;
        long j18;
        Intrinsics.echo(title, "title");
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-1282832324);
        if (c0585q.golf(title)) {
            i5 = 4;
        } else {
            i5 = 2;
        }
        int i10 = i4 | i5 | 4795392;
        if ((4793491 & i10) != 4793490) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i10 & 1, z2)) {
            c0585q.orange();
            if ((i4 & 1) != 0 && !c0585q.beige()) {
                c0585q.ochre();
                c2093f3 = c2093f;
                j18 = j5;
                j17 = j6;
                j16 = j7;
                j15 = j10;
            } else {
                C2093f c2093f4 = AbstractC2434a.alpha;
                long j19 = ((F.O) c0585q.kilo(F.Q.alpha)).papa;
                long j20 = Db.c.bronze;
                long j21 = Db.c.india;
                j15 = Db.c.alpha;
                j16 = j21;
                j17 = j20;
                c2093f3 = c2093f4;
                j18 = j19;
            }
            c0585q.romeo();
            bravo(new C2435b(title), sVar, c2093f3, j18, j17, j16, j15, c0585q, 432);
            c2093f2 = c2093f3;
            j11 = j18;
            j12 = j17;
            j13 = j16;
            j14 = j15;
        } else {
            c0585q.ochre();
            c2093f2 = c2093f;
            j11 = j5;
            j12 = j6;
            j13 = j7;
            j14 = j10;
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new Xd.l(title, sVar, c2093f2, j11, j12, j13, j14, i4) { // from class: qb.c
                public final /* synthetic */ String alpha;
                public final /* synthetic */ T.s purple;
                public final /* synthetic */ C2093f red;
                public final /* synthetic */ long silver;
                public final /* synthetic */ long teal;
                public final /* synthetic */ long white;
                public final /* synthetic */ long yellow;

                @Override // Xd.l
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int cyan = C0564b.cyan(433);
                    long j22 = this.white;
                    long j23 = this.yellow;
                    AbstractC2797v7.alpha(this.alpha, this.purple, this.red, this.silver, this.teal, j22, j23, (InterfaceC0581m) obj, cyan);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void bravo(final C2435b c2435b, final T.s sVar, final C2093f c2093f, final long j5, final long j6, final long j7, final long j10, InterfaceC0581m interfaceC0581m, final int i4) {
        int i5;
        C2093f c2093f2;
        long j11;
        long j12;
        boolean z2;
        C0585q c0585q;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        C0585q c0585q2 = (C0585q) interfaceC0581m;
        c0585q2.silver(-623213789);
        if ((i4 & 6) == 0) {
            if (c0585q2.golf(c2435b)) {
                i16 = 4;
            } else {
                i16 = 2;
            }
            i5 = i16 | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            if (c0585q2.golf(sVar)) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i5 |= i15;
        }
        if ((i4 & 384) == 0) {
            c2093f2 = c2093f;
            if (c0585q2.golf(c2093f2)) {
                i14 = Barcode.FORMAT_QR_CODE;
            } else {
                i14 = 128;
            }
            i5 |= i14;
        } else {
            c2093f2 = c2093f;
        }
        if ((i4 & 3072) == 0) {
            if (c0585q2.foxtrot(j5)) {
                i13 = 2048;
            } else {
                i13 = Barcode.FORMAT_UPC_E;
            }
            i5 |= i13;
        }
        if ((i4 & 24576) == 0) {
            j11 = j6;
            if (c0585q2.foxtrot(j11)) {
                i12 = Http2.INITIAL_MAX_FRAME_SIZE;
            } else {
                i12 = 8192;
            }
            i5 |= i12;
        } else {
            j11 = j6;
        }
        if ((i4 & 196608) == 0) {
            j12 = j7;
            if (c0585q2.foxtrot(j12)) {
                i11 = 131072;
            } else {
                i11 = 65536;
            }
            i5 |= i11;
        } else {
            j12 = j7;
        }
        if ((1572864 & i4) == 0) {
            if (c0585q2.foxtrot(j10)) {
                i10 = 1048576;
            } else {
                i10 = 524288;
            }
            i5 |= i10;
        }
        if ((599187 & i5) != 599186) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q2.magenta(i5 & 1, z2)) {
            c0585q2.orange();
            if ((i4 & 1) != 0 && !c0585q2.beige()) {
                c0585q2.ochre();
            }
            c0585q2.romeo();
            final long j13 = j11;
            final long j14 = j12;
            c0585q = c0585q2;
            F.K1.charlie(androidx.compose.foundation.layout.V.charlie(sVar, 1.0f), c2093f2, F.K1.lima(j5, c0585q2, (i5 >> 9) & 14), F.K1.mike(8, 62), null, P.e.echo(882383253, new Xd.m() { // from class: qb.d
                @Override // Xd.m
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    boolean z10;
                    InterfaceC0555v Card = (InterfaceC0555v) obj;
                    InterfaceC0581m interfaceC0581m2 = (InterfaceC0581m) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    Intrinsics.echo(Card, "$this$Card");
                    if ((intValue & 17) != 16) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    C0585q c0585q3 = (C0585q) interfaceC0581m2;
                    if (c0585q3.magenta(intValue & 1, z10)) {
                        T.p pVar = T.p.alpha;
                        T.s tango = AbstractC0538d.tango(V.charlie(pVar, 1.0f), AbstractC2434a.bravo, AbstractC2434a.charlie);
                        C0554u alpha = AbstractC0553t.alpha(AbstractC0542h.charlie, T.d.f2063g, c0585q3, 48);
                        long j15 = c0585q3.magenta;
                        int i17 = (int) (j15 ^ (j15 >>> 32));
                        I mike = c0585q3.mike();
                        T.s charlie = T.a.charlie(tango, c0585q3);
                        InterfaceC2552l.maroon.getClass();
                        C2550j c2550j = C2551k.bravo;
                        c0585q3.white();
                        if (c0585q3.lime) {
                            c0585q3.lima(c2550j);
                        } else {
                            c0585q3.i();
                        }
                        C0564b.blue(C2551k.foxtrot, c0585q3, alpha);
                        C0564b.blue(C2551k.echo, c0585q3, mike);
                        C2549i c2549i = C2551k.golf;
                        if (c0585q3.lime || !Intrinsics.areEqual(c0585q3.jade(), Integer.valueOf(i17))) {
                            ao.ad.blue(i17, c0585q3, i17, c2549i);
                        }
                        C0564b.blue(C2551k.delta, c0585q3, charlie);
                        AbstractC2797v7.charlie(44, j10, null, 0, 0.0f, 0.0f, 0, c0585q3, 6);
                        AbstractC0538d.echo(V.echo(pVar, AbstractC2434a.delta), c0585q3);
                        C2435b c2435b2 = c2435b;
                        E0 e02 = T2.alpha;
                        G2.bravo(c2435b2.alpha, null, j13, 0L, null, null, 0L, new O0.k(3), 0L, 0, false, 0, 0, null, ((S2) c0585q3.kilo(e02)).charlie, c0585q3, 0, 0, 65018);
                        AbstractC0538d.echo(V.kilo(pVar, AbstractC2434a.echo), c0585q3);
                        G2.bravo("You’ll get delivery requests in a few minutes. Please\nstay available", null, j14, 0L, null, null, 0L, new O0.k(3), 0L, 0, false, 0, 0, null, an.alpha(((S2) c0585q3.kilo(e02)).foxtrot, 0L, 0L, H0.v.yellow, null, 0L, 0, 0L, null, null, 16777211), c0585q3, 0, 0, 65018);
                        c0585q3.quebec(true);
                    } else {
                        c0585q3.ochre();
                    }
                    return Unit.INSTANCE;
                }
            }, c0585q2), c0585q, ((i5 >> 3) & 112) | 196608, 16);
        } else {
            c0585q = c0585q2;
            c0585q.ochre();
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new Xd.l() { // from class: qb.e
                @Override // Xd.l
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int cyan = C0564b.cyan(i4 | 1);
                    C2435b c2435b2 = C2435b.this;
                    long j15 = j7;
                    long j16 = j10;
                    AbstractC2797v7.bravo(c2435b2, sVar, c2093f, j5, j6, j15, j16, (InterfaceC0581m) obj, cyan);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void charlie(float f5, final long j5, T.s sVar, int i4, float f10, float f11, int i5, InterfaceC0581m interfaceC0581m, final int i10) {
        int i11;
        boolean z2;
        final float f12;
        final T.s sVar2;
        final int i12;
        final float f13;
        final float f14;
        final int i13;
        float f15;
        float f16;
        boolean z10 = true;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(509082244);
        if (c0585q.foxtrot(j5)) {
            i11 = 32;
        } else {
            i11 = 16;
        }
        int i14 = i10 | i11 | 1797504;
        if ((599187 & i14) != 599186) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i14 & 1, z2)) {
            T.p pVar = T.p.alpha;
            final float f17 = 4;
            bz.f0 kilo = AbstractC0779d.kilo(840, 0, AbstractC0800z.delta, 2);
            bz.at atVar = bz.at.alpha;
            bz.ag charlie = AbstractC0779d.charlie(AbstractC0779d.india("SegmentedLoadingSpinner", c0585q, 0), 12, AbstractC0779d.golf(kilo, 4), "activeIndex", c0585q, 28728, 0);
            boolean delta = c0585q.delta(((Number) charlie.getValue()).floatValue());
            Object jade = c0585q.jade();
            androidx.compose.runtime.as asVar = C0580l.alpha;
            if (delta || jade == asVar) {
                jade = Integer.valueOf(J4.delta((int) ((Number) charlie.getValue()).floatValue(), 0, 11));
                c0585q.f(jade);
            }
            final int intValue = ((Number) jade).intValue();
            f12 = f5;
            T.s kilo2 = androidx.compose.foundation.layout.V.kilo(pVar, f12);
            boolean echo = c0585q.echo(intValue);
            if ((i14 & 112) != 32) {
                z10 = false;
            }
            boolean z11 = z10 | echo;
            Object jade2 = c0585q.jade();
            final float f18 = 0.25f;
            if (!z11 && jade2 != asVar) {
                f16 = 0.25f;
                f15 = f17;
            } else {
                jade2 = new Function1() { // from class: qb.f
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        c0.d Canvas = (c0.d) obj;
                        Intrinsics.echo(Canvas, "$this$Canvas");
                        float lavender = Canvas.lavender(f17);
                        char c3 = ' ';
                        long j6 = 4294967295L;
                        float min = Math.min(Float.intBitsToFloat((int) (Canvas.bravo() >> 32)), Float.intBitsToFloat((int) (Canvas.bravo() & 4294967295L))) / 2.0f;
                        float f19 = min - (0.26f * min);
                        long orange = Canvas.orange();
                        int i15 = 12;
                        float f20 = 6.2831855f / 12;
                        int i16 = 0;
                        while (i16 < i15) {
                            float f21 = f18;
                            float lima = Q0.c.lima(1.0f, f21, 1.0f - ((((i16 - intValue) + i15) % i15) / 11), f21);
                            double d4 = (i16 * f20) - 1.5707964f;
                            float cos = (float) Math.cos(d4);
                            float sin = (float) Math.sin(d4);
                            int i17 = (int) (orange >> c3);
                            float intBitsToFloat = (cos * f19) + Float.intBitsToFloat(i17);
                            int i18 = (int) (orange & j6);
                            float intBitsToFloat2 = (sin * f19) + Float.intBitsToFloat(i18);
                            char c4 = c3;
                            long j7 = j6;
                            long floatToRawIntBits = Float.floatToRawIntBits(intBitsToFloat);
                            c0.d dVar = Canvas;
                            float intBitsToFloat3 = (cos * min) + Float.intBitsToFloat(i17);
                            float intBitsToFloat4 = (sin * min) + Float.intBitsToFloat(i18);
                            Canvas = dVar;
                            ao.ad.juliet(Canvas, C0366t.bravo(lima, j5), (Float.floatToRawIntBits(intBitsToFloat2) & j7) | (floatToRawIntBits << c4), (Float.floatToRawIntBits(intBitsToFloat3) << c4) | (Float.floatToRawIntBits(intBitsToFloat4) & j7), lavender, 1, 480);
                            i16++;
                            i15 = 12;
                            c3 = c4;
                            j6 = j7;
                        }
                        return Unit.INSTANCE;
                    }
                };
                f15 = f17;
                f16 = 0.25f;
                c0585q.f(jade2);
            }
            t6.T3.alpha(kilo2, (Function1) jade2, c0585q, 0);
            f13 = f15;
            i13 = 70;
            sVar2 = pVar;
            i12 = 12;
            f14 = f16;
        } else {
            f12 = f5;
            c0585q.ochre();
            sVar2 = sVar;
            i12 = i4;
            f13 = f10;
            f14 = f11;
            i13 = i5;
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new Xd.l(f12, j5, sVar2, i12, f13, f14, i13, i10) { // from class: qb.g
                public final /* synthetic */ float alpha;
                public final /* synthetic */ long purple;
                public final /* synthetic */ T.s red;
                public final /* synthetic */ int silver;
                public final /* synthetic */ float teal;
                public final /* synthetic */ float white;
                public final /* synthetic */ int yellow;

                @Override // Xd.l
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int cyan = C0564b.cyan(7);
                    float f19 = this.white;
                    int i15 = this.yellow;
                    AbstractC2797v7.charlie(this.alpha, this.purple, this.red, this.silver, this.teal, f19, i15, (InterfaceC0581m) obj, cyan);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final float delta(float f5) {
        float intBitsToFloat = Float.intBitsToFloat(((int) ((Float.floatToRawIntBits(f5) & 8589934591L) / 3)) + 709952852);
        float f10 = intBitsToFloat - ((intBitsToFloat - (f5 / (intBitsToFloat * intBitsToFloat))) * 0.33333334f);
        return f10 - ((f10 - (f5 / (f10 * f10))) * 0.33333334f);
    }

    public static final float echo(float f5, float f10, float f11) {
        return (f11 * f10) + ((1 - f11) * f5);
    }

    public static final int foxtrot(int i4, int i5, float f5) {
        return i4 + ((int) Math.round((i5 - i4) * f5));
    }
}
