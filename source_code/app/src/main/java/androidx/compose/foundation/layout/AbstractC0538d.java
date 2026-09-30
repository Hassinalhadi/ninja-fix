package androidx.compose.foundation.layout;

import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import com.airbnb.lottie.compose.LottieConstants;
import com.google.android.gms.internal.measurement.C1298c;
import com.google.mlkit.vision.barcode.common.Barcode;
import h.AbstractC1797a;
import j1.C1929c;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import q0.AbstractC2367C;
import q0.AbstractC2375K;
import q0.InterfaceC2401t;
import s0.C2549i;
import s0.C2550j;
import s0.C2551k;
import s0.InterfaceC2552l;
import t0.AbstractC2911e0;
import t0.C2915g0;

/* renamed from: androidx.compose.foundation.layout.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0538d {
    public static final C0537c alpha = new C0537c(0);
    public static final C0537c bravo = new C0537c(1);
    public static final r0.g charlie = new r0.g(new Vc.i(24));
    public static final int delta = 9;
    public static final int echo = 6;
    public static final int foxtrot = 10;
    public static final int golf = 5;
    public static final int hotel = 15;

    public static final void alpha(T.s sVar, T.f fVar, boolean z2, P.d dVar, InterfaceC0581m interfaceC0581m, int i4, int i5) {
        int i10;
        int i11;
        int i12;
        boolean z10;
        boolean z11;
        boolean z12;
        int i13;
        int i14;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(380139498);
        if ((i4 & 6) == 0) {
            if (c0585q.golf(sVar)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i10 = i14 | i4;
        } else {
            i10 = i4;
        }
        int i15 = i5 & 2;
        if (i15 != 0) {
            i10 |= 48;
        } else if ((i4 & 48) == 0) {
            if (c0585q.golf(fVar)) {
                i11 = 32;
            } else {
                i11 = 16;
            }
            i10 |= i11;
        }
        int i16 = i5 & 4;
        if (i16 != 0) {
            i10 |= 384;
        } else if ((i4 & 384) == 0) {
            if (c0585q.hotel(z2)) {
                i12 = Barcode.FORMAT_QR_CODE;
            } else {
                i12 = 128;
            }
            i10 |= i12;
        }
        if ((i4 & 3072) == 0) {
            if (c0585q.india(dVar)) {
                i13 = 2048;
            } else {
                i13 = Barcode.FORMAT_UPC_E;
            }
            i10 |= i13;
        }
        boolean z13 = true;
        if ((i10 & 1171) != 1170) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (c0585q.magenta(i10 & 1, z10)) {
            if (i15 != 0) {
                fVar = T.d.alpha;
            }
            if (i16 != 0) {
                z12 = false;
            } else {
                z12 = z2;
            }
            q0.ap delta2 = AbstractC0547m.delta(fVar, z12);
            if ((i10 & 7168) != 2048) {
                z13 = false;
            }
            boolean golf2 = c0585q.golf(delta2) | z13;
            Object jade = c0585q.jade();
            if (golf2 || jade == C0580l.alpha) {
                jade = new Cb.a(20, delta2, dVar);
                c0585q.f(jade);
            }
            AbstractC2375K.alpha(sVar, (Xd.l) jade, c0585q, i10 & 14, 0);
            z11 = z12;
        } else {
            c0585q.ochre();
            z11 = z2;
        }
        T.f fVar2 = fVar;
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new r(sVar, fVar2, z11, dVar, i4, i5);
        }
    }

    public static final T.s amber(T.s sVar) {
        B b2 = B.alpha;
        return sVar.then(new IntrinsicWidthElement(AbstractC2911e0.alpha));
    }

    public static final T.s azure(T.s sVar, a0 a0Var) {
        return T.a.alpha(sVar, AbstractC2911e0.alpha, new c0(1, a0Var));
    }

    public static M bravo(int i4, float f5, float f10) {
        if ((i4 & 1) != 0) {
            f5 = 0;
        }
        if ((i4 & 2) != 0) {
            f10 = 0;
        }
        return new M(f5, f10, f5, f10);
    }

    public static final M charlie(float f5, float f10, float f11, float f12) {
        return new M(f5, f10, f11, f12);
    }

    public static M delta(float f5, float f10, float f11, float f12, int i4) {
        if ((i4 & 1) != 0) {
            f5 = 0;
        }
        if ((i4 & 2) != 0) {
            f10 = 0;
        }
        if ((i4 & 4) != 0) {
            f11 = 0;
        }
        if ((i4 & 8) != 0) {
            f12 = 0;
        }
        return new M(f5, f10, f11, f12);
    }

    public static final void echo(T.s sVar, InterfaceC0581m interfaceC0581m) {
        C0546l c0546l = C0546l.charlie;
        C0585q c0585q = (C0585q) interfaceC0581m;
        long j5 = c0585q.magenta;
        int i4 = (int) (j5 ^ (j5 >>> 32));
        T.s charlie2 = T.a.charlie(sVar, interfaceC0581m);
        androidx.compose.runtime.I mike = c0585q.mike();
        InterfaceC2552l.maroon.getClass();
        C2550j c2550j = C2551k.bravo;
        C1298c c1298c = c0585q.alpha;
        c0585q.white();
        if (c0585q.lime) {
            c0585q.lima(c2550j);
        } else {
            c0585q.i();
        }
        C0564b.blue(C2551k.foxtrot, interfaceC0581m, c0546l);
        C0564b.blue(C2551k.echo, interfaceC0581m, mike);
        C0564b.blue(C2551k.delta, interfaceC0581m, charlie2);
        C2549i c2549i = C2551k.golf;
        if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i4))) {
            ao.ad.blue(i4, c0585q, i4, c2549i);
        }
        c0585q.quebec(true);
    }

    public static T.s golf(T.s sVar, float f5) {
        return sVar.then(new AspectRatioElement(f5, AbstractC2911e0.alpha));
    }

    public static final float hotel(L l10, Q0.n nVar) {
        if (nVar == Q0.n.alpha) {
            return l10.delta(nVar);
        }
        return l10.bravo(nVar);
    }

    public static final float india(L l10, Q0.n nVar) {
        if (nVar == Q0.n.alpha) {
            return l10.bravo(nVar);
        }
        return l10.delta(nVar);
    }

    public static long juliet(long j5, E e) {
        int india;
        int golf2;
        int juliet;
        int hotel2;
        E e4 = E.alpha;
        if (e == e4) {
            india = Q0.a.juliet(j5);
        } else {
            india = Q0.a.india(j5);
        }
        if (e == e4) {
            golf2 = Q0.a.hotel(j5);
        } else {
            golf2 = Q0.a.golf(j5);
        }
        if (e == e4) {
            juliet = Q0.a.india(j5);
        } else {
            juliet = Q0.a.juliet(j5);
        }
        if (e == e4) {
            hotel2 = Q0.a.golf(j5);
        } else {
            hotel2 = Q0.a.hotel(j5);
        }
        return Q0.b.alpha(india, golf2, juliet, hotel2);
    }

    public static long kilo(int i4, long j5) {
        int i5;
        int hotel2 = Q0.a.hotel(j5);
        if ((i4 & 4) != 0) {
            i5 = Q0.a.india(j5);
        } else {
            i5 = 0;
        }
        return Q0.b.alpha(0, hotel2, i5, Q0.a.golf(j5));
    }

    public static final P lima(InterfaceC2401t interfaceC2401t) {
        Object yankee = interfaceC2401t.yankee();
        if (yankee instanceof P) {
            return (P) yankee;
        }
        return null;
    }

    public static final float mike(P p4) {
        if (p4 != null) {
            return p4.alpha;
        }
        return 0.0f;
    }

    public static final T.s november(T.s sVar) {
        B b2 = B.alpha;
        return sVar.then(new IntrinsicHeightElement(AbstractC2911e0.alpha));
    }

    public static final boolean oscar(int i4, int i5, long j5) {
        int juliet = Q0.a.juliet(j5);
        if (i4 <= Q0.a.hotel(j5) && juliet <= i4) {
            int india = Q0.a.india(j5);
            if (i5 <= Q0.a.golf(j5) && india <= i5) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static final q0.aq papa(O o5, int i4, int i5, int i10, int i11, int i12, q0.ar arVar, List list, AbstractC2367C[] abstractC2367CArr, int i13, int i14, int[] iArr, int i15) {
        int i16;
        int i17;
        float f5;
        boolean z2;
        int i18;
        long j5;
        int i19;
        int i20;
        int i21;
        List list2 = list;
        long j6 = i12;
        int i22 = i14 - i13;
        int[] iArr2 = new int[i22];
        int i23 = i13;
        int i24 = 0;
        int i25 = 0;
        int i26 = 0;
        int i27 = 0;
        float f10 = 0.0f;
        while (i23 < i14) {
            q0.ao aoVar = (q0.ao) list2.get(i23);
            float mike = mike(lima(aoVar));
            if (mike > 0.0f) {
                f10 += mike;
                i25++;
                j5 = j6;
                i19 = i23;
            } else {
                int i28 = i10 - i26;
                AbstractC2367C abstractC2367C = abstractC2367CArr[i23];
                j5 = j6;
                if (abstractC2367C == null) {
                    if (i10 == Integer.MAX_VALUE) {
                        i19 = i23;
                        i20 = i25;
                        i21 = LottieConstants.IterateForever;
                    } else {
                        i19 = i23;
                        i20 = i25;
                        if (i28 < 0) {
                            i21 = 0;
                        } else {
                            i21 = i28;
                        }
                    }
                    abstractC2367C = aoVar.victor(o5.charlie(0, i21, i11, false));
                } else {
                    i19 = i23;
                    i20 = i25;
                }
                AbstractC2367C abstractC2367C2 = abstractC2367C;
                int foxtrot2 = o5.foxtrot(abstractC2367C2);
                int juliet = o5.juliet(abstractC2367C2);
                iArr2[i19 - i13] = foxtrot2;
                int i29 = i28 - foxtrot2;
                if (i29 < 0) {
                    i29 = 0;
                }
                i27 = Math.min(i12, i29);
                i26 += foxtrot2 + i27;
                i24 = Math.max(i24, juliet);
                abstractC2367CArr[i19] = abstractC2367C2;
                i25 = i20;
            }
            i23 = i19 + 1;
            j6 = j5;
        }
        long j7 = j6;
        if (i25 == 0) {
            i26 -= i27;
            i17 = 0;
        } else {
            if (i10 != Integer.MAX_VALUE) {
                i16 = i10;
            } else {
                i16 = i4;
            }
            long j10 = (r22 - 1) * j7;
            long j11 = (i16 - i26) - j10;
            if (j11 < 0) {
                j11 = 0;
            }
            float f11 = ((float) j11) / f10;
            for (int i30 = i13; i30 < i14; i30++) {
                j11 -= Math.round(mike(lima((q0.ao) list2.get(i30))) * f11);
            }
            int i31 = i13;
            int i32 = i24;
            int i33 = 0;
            while (i31 < i14) {
                if (abstractC2367CArr[i31] == null) {
                    q0.ao aoVar2 = (q0.ao) list2.get(i31);
                    f5 = f11;
                    P lima = lima(aoVar2);
                    float mike2 = mike(lima);
                    if (mike2 <= 0.0f) {
                        AbstractC1797a.bravo("All weights <= 0 should have placeables");
                    }
                    int signum = Long.signum(j11);
                    long j12 = j11 - signum;
                    int max = Math.max(0, Math.round(mike2 * f5) + signum);
                    if (lima != null) {
                        z2 = lima.bravo;
                    } else {
                        z2 = true;
                    }
                    if (z2 && max != Integer.MAX_VALUE) {
                        i18 = max;
                    } else {
                        i18 = 0;
                    }
                    AbstractC2367C victor = aoVar2.victor(o5.charlie(i18, max, i11, true));
                    int foxtrot3 = o5.foxtrot(victor);
                    int juliet2 = o5.juliet(victor);
                    iArr2[i31 - i13] = foxtrot3;
                    i33 += foxtrot3;
                    int max2 = Math.max(i32, juliet2);
                    abstractC2367CArr[i31] = victor;
                    i32 = max2;
                    j11 = j12;
                } else {
                    f5 = f11;
                }
                i31++;
                list2 = list;
                f11 = f5;
            }
            i17 = (int) (i33 + j10);
            int i34 = i10 - i26;
            if (i17 < 0) {
                i17 = 0;
            }
            if (i17 > i34) {
                i17 = i34;
            }
            i24 = i32;
        }
        int i35 = i17 + i26;
        if (i35 < 0) {
            i35 = 0;
        }
        int max3 = Math.max(i35, i4);
        int max4 = Math.max(i24, Math.max(i5, 0));
        int[] iArr3 = new int[i22];
        o5.echo(max3, iArr2, iArr3, arVar);
        return o5.india(abstractC2367CArr, arVar, iArr3, max3, max4, iArr, i15, i13, i14);
    }

    public static final T.s quebec(T.s sVar, float f5, float f10) {
        return sVar.then(new OffsetElement(f5, f10, new H(0, f5, f10)));
    }

    public static final T.s romeo(T.s sVar, L l10) {
        return sVar.then(new PaddingValuesElement(l10, new Ya.c(7, l10)));
    }

    public static final T.s sierra(T.s sVar, final float f5) {
        return sVar.then(new PaddingElement(f5, f5, f5, f5, new Function1() { // from class: androidx.compose.foundation.layout.J
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                C2915g0 c2915g0 = (C2915g0) obj;
                c2915g0.alpha = "padding";
                c2915g0.bravo = new Q0.g(f5);
                return Unit.INSTANCE;
            }
        }));
    }

    public static final T.s tango(T.s sVar, float f5, float f10) {
        return sVar.then(new PaddingElement(f5, f10, f5, f10, new H(1, f5, f10)));
    }

    public static T.s uniform(T.s sVar, float f5, float f10, int i4) {
        if ((i4 & 1) != 0) {
            f5 = 0;
        }
        if ((i4 & 2) != 0) {
            f10 = 0;
        }
        return tango(sVar, f5, f10);
    }

    public static final T.s victor(T.s sVar, float f5, float f10, float f11, float f12) {
        return sVar.then(new PaddingElement(f5, f10, f11, f12, new Za.g(f5, f10, f11, f12, 1)));
    }

    public static T.s whiskey(T.s sVar, float f5, float f10, float f11, float f12, int i4) {
        if ((i4 & 1) != 0) {
            f5 = 0;
        }
        if ((i4 & 2) != 0) {
            f10 = 0;
        }
        if ((i4 & 4) != 0) {
            f11 = 0;
        }
        if ((i4 & 8) != 0) {
            f12 = 0;
        }
        return victor(sVar, f5, f10, f11, f12);
    }

    public static final long xray(long j5) {
        E e = E.alpha;
        return Q0.b.alpha(Q0.a.juliet(j5), Q0.a.hotel(j5), Q0.a.india(j5), Q0.a.golf(j5));
    }

    public static final az yankee(C1929c c1929c) {
        return new az(c1929c.alpha, c1929c.bravo, c1929c.charlie, c1929c.delta);
    }

    public static final void zulu(StringBuilder sb2, String str) {
        if (sb2.length() > 0) {
            sb2.append('+');
        }
        sb2.append(str);
    }

    public abstract int foxtrot(int i4, Q0.n nVar);
}
