package s6;

import D0.an;
import J2.t;
import T.s;
import androidx.compose.foundation.layout.AbstractC0538d;
import androidx.compose.foundation.layout.AbstractC0542h;
import androidx.compose.foundation.layout.AbstractC0547m;
import androidx.compose.foundation.layout.AbstractC0553t;
import androidx.compose.foundation.layout.C0554u;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import ao.ad;
import av.ah;
import com.google.mlkit.vision.barcode.common.Barcode;
import delivery.samurai.android.R;
import eb.C1646a;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;
import s0.C2549i;
import s0.C2550j;
import s0.C2551k;
import s0.InterfaceC2552l;
import s6.G0;
import t6.M2;

/* loaded from: classes2.dex */
public abstract class G0 {
    public static final void alpha(int i4, final int i5, eb.i iVar, final C1646a c1646a, InterfaceC0581m interfaceC0581m, int i10) {
        int i11;
        final eb.i iVar2;
        boolean z2;
        boolean z10;
        boolean z11;
        boolean z12;
        T.s sVar;
        int i12;
        int i13;
        int i14;
        int i15;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-1070599207);
        if ((i10 & 6) == 0) {
            if (c0585q.echo(i4)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i11 = i15 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (c0585q.echo(i5)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i11 |= i14;
        }
        if ((i10 & 384) == 0) {
            iVar2 = iVar;
            if (c0585q.golf(iVar2)) {
                i13 = Barcode.FORMAT_QR_CODE;
            } else {
                i13 = 128;
            }
            i11 |= i13;
        } else {
            iVar2 = iVar;
        }
        if ((i10 & 3072) == 0) {
            if (c0585q.golf(c1646a)) {
                i12 = 2048;
            } else {
                i12 = Barcode.FORMAT_UPC_E;
            }
            i11 |= i12;
        }
        if ((i11 & 1171) != 1170) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i11 & 1, z2)) {
            final int i16 = i4 - 1;
            final float f5 = 360.0f / i5;
            c1646a.getClass();
            float f10 = 0.0f;
            final float charlie = J4.charlie(18.0f, 0.0f, 0.9f * f5);
            final float f11 = f5 - charlie;
            if (i5 != 2) {
                f10 = 90.0f;
            }
            final float f12 = f10 - ((f5 / 2.0f) + (i16 * f5));
            T.s kilo = androidx.compose.foundation.layout.V.kilo(T.p.alpha, c1646a.alpha);
            if ((i11 & 7168) == 2048) {
                z10 = true;
            } else {
                z10 = false;
            }
            if ((i11 & 112) == 32) {
                z11 = true;
            } else {
                z11 = false;
            }
            boolean echo = z11 | z10 | c0585q.echo(i16);
            if ((i11 & 896) == 256) {
                z12 = true;
            } else {
                z12 = false;
            }
            boolean delta = z12 | echo | c0585q.delta(f12) | c0585q.delta(f5) | c0585q.delta(charlie) | c0585q.delta(f11);
            Object jade = c0585q.jade();
            if (!delta && jade != C0580l.alpha) {
                sVar = kilo;
            } else {
                sVar = kilo;
                Function1 function1 = new Function1() { // from class: eb.l
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        long j5;
                        c0.d Canvas = (c0.d) obj;
                        Intrinsics.echo(Canvas, "$this$Canvas");
                        float lavender = Canvas.lavender(C1646a.this.bravo);
                        float min = Math.min(Float.intBitsToFloat((int) (Canvas.bravo() >> 32)), Float.intBitsToFloat((int) (Canvas.bravo() & 4294967295L))) - lavender;
                        long floatToRawIntBits = (Float.floatToRawIntBits(min) << 32) | (Float.floatToRawIntBits(min) & 4294967295L);
                        float intBitsToFloat = (Float.intBitsToFloat((int) (Canvas.bravo() >> 32)) - Float.intBitsToFloat((int) (floatToRawIntBits >> 32))) / 2.0f;
                        float intBitsToFloat2 = (Float.intBitsToFloat((int) (Canvas.bravo() & 4294967295L)) - Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L))) / 2.0f;
                        long floatToRawIntBits2 = (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L);
                        int i17 = 0;
                        while (i17 < i5) {
                            i iVar3 = iVar2;
                            int i18 = i16;
                            if (i17 < i18) {
                                j5 = iVar3.alpha;
                            } else if (i17 == i18) {
                                j5 = iVar3.charlie;
                            } else {
                                j5 = iVar3.bravo;
                            }
                            long j6 = floatToRawIntBits;
                            long j7 = floatToRawIntBits2;
                            ad.foxtrot(Canvas, j5, (charlie / 2.0f) + (i17 * f5) + f12, f11, j7, j6, 0.0f, new c0.h(lavender, 0.0f, 1, 0, null, 26), 832);
                            i17++;
                            floatToRawIntBits2 = j7;
                            floatToRawIntBits = j6;
                            lavender = lavender;
                        }
                        return Unit.INSTANCE;
                    }
                };
                c0585q.f(function1);
                jade = function1;
            }
            t6.T3.alpha(sVar, (Function1) jade, c0585q, 0);
        } else {
            c0585q.ochre();
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new H4.a(i4, i5, iVar, c1646a, i10, 2);
        }
    }

    public static final void bravo(int i4, final int i5, final eb.i iVar, final eb.h hVar, InterfaceC0581m interfaceC0581m, int i10) {
        int i11;
        boolean z2;
        boolean z10;
        boolean z11;
        int i12;
        int i13;
        int i14;
        int i15;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(1983952973);
        if ((i10 & 6) == 0) {
            if (c0585q.echo(i4)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i11 = i15 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (c0585q.echo(i5)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i11 |= i14;
        }
        if ((i10 & 384) == 0) {
            if (c0585q.golf(iVar)) {
                i13 = 256;
            } else {
                i13 = 128;
            }
            i11 |= i13;
        }
        if ((i10 & 3072) == 0) {
            if (c0585q.golf(hVar)) {
                i12 = 2048;
            } else {
                i12 = Barcode.FORMAT_UPC_E;
            }
            i11 |= i12;
        }
        boolean z12 = true;
        if ((i11 & 1171) != 1170) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i11 & 1, z2)) {
            final int i16 = i4 - 1;
            final float f5 = 360.0f / i5;
            T.s kilo = androidx.compose.foundation.layout.V.kilo(T.p.alpha, hVar.alpha);
            if ((i11 & 7168) == 2048) {
                z10 = true;
            } else {
                z10 = false;
            }
            if ((i11 & 112) == 32) {
                z11 = true;
            } else {
                z11 = false;
            }
            boolean echo = z11 | z10 | c0585q.echo(i16);
            if ((i11 & 896) != 256) {
                z12 = false;
            }
            boolean delta = echo | z12 | c0585q.delta(f5);
            Object jade = c0585q.jade();
            if (delta || jade == C0580l.alpha) {
                Function1 function1 = new Function1() { // from class: eb.k
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        long j5;
                        t tVar;
                        long j6;
                        k kVar = this;
                        c0.d Canvas = (c0.d) obj;
                        Intrinsics.echo(Canvas, "$this$Canvas");
                        long charlie = M2.charlie(Canvas.bravo());
                        h hVar2 = h.this;
                        float lavender = Canvas.lavender(hVar2.bravo);
                        float lavender2 = Canvas.lavender(hVar2.charlie);
                        float lavender3 = Canvas.lavender(hVar2.delta);
                        float f10 = lavender2 / 2.0f;
                        long floatToRawIntBits = (Float.floatToRawIntBits(f10) << 32) | (Float.floatToRawIntBits(f10) & 4294967295L);
                        int i17 = 0;
                        while (i17 < i5) {
                            i iVar2 = iVar;
                            int i18 = i16;
                            if (i17 < i18) {
                                j5 = iVar2.alpha;
                            } else if (i17 == i18) {
                                j5 = iVar2.charlie;
                            } else {
                                j5 = iVar2.bravo;
                            }
                            float f11 = i17 * f5;
                            t lime = Canvas.lime();
                            long oscar = lime.oscar();
                            lime.mike().golf();
                            try {
                                ((ah) lime.alpha).ochre(f11, charlie);
                                float f12 = lavender3;
                                float intBitsToFloat = Float.intBitsToFloat((int) (charlie >> 32)) - f10;
                                float intBitsToFloat2 = (Float.intBitsToFloat((int) (charlie & 4294967295L)) - lavender) - (f12 / 2.0f);
                                long floatToRawIntBits2 = (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L);
                                tVar = lime;
                                int i19 = i17;
                                long j7 = charlie;
                                j6 = oscar;
                                try {
                                    ad.papa(Canvas, j5, floatToRawIntBits2, (Float.floatToRawIntBits(lavender2) << 32) | (Float.floatToRawIntBits(f12) & 4294967295L), floatToRawIntBits, null, 240);
                                    tVar.mike().november();
                                    tVar.yankee(j6);
                                    i17 = i19 + 1;
                                    kVar = this;
                                    lavender3 = f12;
                                    charlie = j7;
                                } catch (Throwable th) {
                                    th = th;
                                    ad.coral(tVar, j6);
                                    throw th;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                tVar = lime;
                                j6 = oscar;
                            }
                        }
                        return Unit.INSTANCE;
                    }
                };
                c0585q.f(function1);
                jade = function1;
            }
            t6.T3.alpha(kilo, (Function1) jade, c0585q, 0);
        } else {
            c0585q.ochre();
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new H4.a(i4, i5, iVar, hVar, i10, 1);
        }
    }

    public static final void charlie(int i4, int i5, String str, D0.an anVar, D0.an anVar2, InterfaceC0581m interfaceC0581m, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        boolean z2;
        C0585q c0585q;
        C0585q c0585q2 = (C0585q) interfaceC0581m;
        c0585q2.silver(1940207095);
        if (c0585q2.echo(i4)) {
            i11 = 4;
        } else {
            i11 = 2;
        }
        int i16 = i10 | i11;
        if (c0585q2.echo(i5)) {
            i12 = 32;
        } else {
            i12 = 16;
        }
        int i17 = i16 | i12;
        if (c0585q2.golf(str)) {
            i13 = Barcode.FORMAT_QR_CODE;
        } else {
            i13 = 128;
        }
        int i18 = i17 | i13;
        if (c0585q2.golf(anVar)) {
            i14 = 2048;
        } else {
            i14 = Barcode.FORMAT_UPC_E;
        }
        int i19 = i18 | i14;
        if (c0585q2.golf(anVar2)) {
            i15 = Http2.INITIAL_MAX_FRAME_SIZE;
        } else {
            i15 = 8192;
        }
        int i20 = i19 | i15;
        if ((i20 & 9363) != 9362) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q2.magenta(i20 & 1, z2)) {
            T.i iVar = T.d.f2063g;
            T.p pVar = T.p.alpha;
            C0554u alpha = AbstractC0553t.alpha(AbstractC0542h.charlie, iVar, c0585q2, 48);
            int romeo = C0564b.romeo(c0585q2);
            androidx.compose.runtime.I mike = c0585q2.mike();
            T.s charlie = T.a.charlie(pVar, c0585q2);
            InterfaceC2552l.maroon.getClass();
            C2550j c2550j = C2551k.bravo;
            c0585q2.white();
            if (c0585q2.lime) {
                c0585q2.lima(c2550j);
            } else {
                c0585q2.i();
            }
            C0564b.blue(C2551k.foxtrot, c0585q2, alpha);
            C0564b.blue(C2551k.echo, c0585q2, mike);
            C2549i c2549i = C2551k.golf;
            if (c0585q2.lime || !Intrinsics.areEqual(c0585q2.jade(), Integer.valueOf(romeo))) {
                ao.ad.blue(romeo, c0585q2, romeo, c2549i);
            }
            C0564b.blue(C2551k.delta, c0585q2, charlie);
            F.G2.bravo(i4 + " of " + i5, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, anVar, c0585q2, 0, (i20 << 9) & 3670016, 65534);
            AbstractC0538d.echo(androidx.compose.foundation.layout.V.echo(pVar, (float) 6), c0585q2);
            F.G2.bravo(str, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, anVar2, c0585q2, (i20 >> 6) & 14, (i20 << 6) & 3670016, 65534);
            c0585q = c0585q2;
            c0585q.quebec(true);
        } else {
            c0585q = c0585q2;
            c0585q.ochre();
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new Lb.F(i4, i5, str, anVar, anVar2, i10);
        }
    }

    public static final void delta(final int i4, final int i5, final T.s sVar, final String str, final eb.m mVar, int i10, final eb.i iVar, final eb.h hVar, final C1646a c1646a, final D0.an anVar, final D0.an anVar2, final P.d dVar, InterfaceC0581m interfaceC0581m, final int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        boolean z2;
        final int i18;
        int i19;
        String str2;
        int i20;
        eb.m mVar2;
        int i21;
        boolean z10;
        D0.an anVar3;
        D0.an anVar4;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-474910263);
        char c3 = 4;
        if (c0585q.echo(i4)) {
            i12 = 4;
        } else {
            i12 = 2;
        }
        int i22 = i11 | i12;
        if (c0585q.echo(i5)) {
            i13 = 32;
        } else {
            i13 = 16;
        }
        int i23 = i22 | i13;
        if (c0585q.golf(str)) {
            i14 = 2048;
        } else {
            i14 = Barcode.FORMAT_UPC_E;
        }
        int i24 = i23 | i14;
        if (c0585q.echo(mVar.ordinal())) {
            i15 = Http2.INITIAL_MAX_FRAME_SIZE;
        } else {
            i15 = 8192;
        }
        int i25 = i24 | i15 | 196608;
        if (c0585q.golf(iVar)) {
            i16 = 1048576;
        } else {
            i16 = 524288;
        }
        int i26 = i25 | i16;
        if (c0585q.golf(anVar)) {
            i17 = 536870912;
        } else {
            i17 = 268435456;
        }
        int i27 = i26 | i17;
        if (!c0585q.golf(anVar2)) {
            c3 = 2;
        }
        int i28 = c3 | '0';
        if ((306783379 & i27) == 306783378 && (i28 & 19) == 18) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (c0585q.magenta(i27 & 1, z2)) {
            c0585q.orange();
            if ((i11 & 1) != 0 && !c0585q.beige()) {
                c0585q.ochre();
                i19 = i10;
            } else {
                i19 = 10;
            }
            c0585q.romeo();
            if (str == null) {
                str2 = Q0.c.oscar(c0585q, -1122213043, R.string.tasks_label, c0585q, false);
            } else {
                c0585q.purple(-1122213322);
                c0585q.quebec(false);
                str2 = str;
            }
            if (i5 < 1) {
                i20 = 1;
            } else {
                i20 = i5;
            }
            int delta = J4.delta(i4, 1, i20);
            int ordinal = mVar.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal == 2) {
                        mVar2 = eb.m.purple;
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                } else {
                    mVar2 = eb.m.alpha;
                }
            } else if (i20 >= i19) {
                mVar2 = eb.m.alpha;
            } else {
                mVar2 = eb.m.purple;
            }
            q0.ap delta2 = AbstractC0547m.delta(T.d.teal, false);
            int romeo = C0564b.romeo(c0585q);
            androidx.compose.runtime.I mike = c0585q.mike();
            T.s charlie = T.a.charlie(sVar, c0585q);
            InterfaceC2552l.maroon.getClass();
            C2550j c2550j = C2551k.bravo;
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j);
            } else {
                c0585q.i();
            }
            C0564b.blue(C2551k.foxtrot, c0585q, delta2);
            C0564b.blue(C2551k.echo, c0585q, mike);
            C2549i c2549i = C2551k.golf;
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(romeo))) {
                ao.ad.blue(romeo, c0585q, romeo, c2549i);
            }
            C0564b.blue(C2551k.delta, c0585q, charlie);
            int ordinal2 = mVar2.ordinal();
            if (ordinal2 != 0) {
                if (ordinal2 != 1) {
                    if (ordinal2 == 2) {
                        c0585q.purple(1618085925);
                        i21 = delta;
                        z10 = false;
                        alpha(i21, i20, iVar, c1646a, c0585q, ((i27 >> 12) & 896) | 3072);
                        c0585q.quebec(false);
                    } else {
                        throw ao.ad.black(c0585q, 1618077965, false);
                    }
                } else {
                    i21 = delta;
                    z10 = false;
                    c0585q.purple(1618079527);
                    bravo(i21, i20, iVar, hVar, c0585q, (i27 >> 12) & 8064);
                    c0585q.quebec(false);
                }
            } else {
                i21 = delta;
                z10 = false;
                c0585q.purple(-1378750807);
                c0585q.quebec(false);
            }
            if (dVar != null) {
                c0585q.purple(-1378657218);
                dVar.invoke(c0585q, 6);
                c0585q.quebec(z10);
            } else {
                c0585q.purple(-1378598070);
                if (anVar == null) {
                    c0585q.purple(-1378527390);
                    D0.an alpha = D0.an.alpha(((F.S2) c0585q.kilo(F.T2.alpha)).echo, ((F.O) c0585q.kilo(F.Q.alpha)).quebec, 0L, H0.v.f1409c, null, 0L, 0, 0L, null, null, 16777210);
                    c0585q.quebec(z10);
                    anVar3 = alpha;
                } else {
                    c0585q.purple(1618097562);
                    c0585q.quebec(z10);
                    anVar3 = anVar;
                }
                if (anVar2 == null) {
                    c0585q.purple(-1378320775);
                    D0.an alpha2 = D0.an.alpha(((F.S2) c0585q.kilo(F.T2.alpha)).juliet, ((F.O) c0585q.kilo(F.Q.alpha)).sierra, 0L, H0.v.f1407a, null, 0L, 0, 0L, null, null, 16777210);
                    c0585q.quebec(z10);
                    anVar4 = alpha2;
                } else {
                    c0585q.purple(1618104382);
                    c0585q.quebec(z10);
                    anVar4 = anVar2;
                }
                charlie(i21, i20, str2, anVar3, anVar4, c0585q, 0);
                c0585q.quebec(z10);
            }
            c0585q.quebec(true);
            i18 = i19;
        } else {
            c0585q.ochre();
            i18 = i10;
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new Xd.l(i4, i5, sVar, str, mVar, i18, iVar, hVar, c1646a, anVar, anVar2, dVar, i11) { // from class: eb.j

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ h f12575a;
                public final /* synthetic */ int alpha;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ C1646a f12576b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ an f12577c;

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ an f12578d;
                public final /* synthetic */ P.d e;
                public final /* synthetic */ int purple;
                public final /* synthetic */ s red;
                public final /* synthetic */ String silver;
                public final /* synthetic */ m teal;
                public final /* synthetic */ int white;
                public final /* synthetic */ i yellow;

                @Override // Xd.l
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int cyan = C0564b.cyan(113246593);
                    m mVar3 = this.teal;
                    i iVar2 = this.yellow;
                    an anVar5 = this.f12578d;
                    P.d dVar2 = this.e;
                    G0.delta(this.alpha, this.purple, this.red, this.silver, mVar3, this.white, iVar2, this.f12575a, this.f12576b, this.f12577c, anVar5, dVar2, (InterfaceC0581m) obj, cyan);
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
