package ub;

import Ec.af;
import F.AbstractC0141o0;
import F.G1;
import F.O;
import F.Y1;
import F.Z1;
import Lb.am;
import M2.f;
import N2.n;
import N2.p;
import N2.q;
import N2.y;
import N2.z;
import P.d;
import P.e;
import T.k;
import T.s;
import X2.g;
import X2.h;
import Xd.l;
import a0.ao;
import android.content.Context;
import androidx.compose.foundation.layout.AbstractC0547m;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.V;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.E0;
import androidx.compose.runtime.I;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.runtime.Q;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import ao.ad;
import com.google.mlkit.vision.barcode.common.Barcode;
import delivery.samurai.android.R;
import g4.C1752a;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import l3.AbstractC2056a;
import m.AbstractC2088a;
import m.AbstractC2094g;
import okhttp3.internal.http2.Http2;
import q0.C2391j;
import q0.ap;
import q0.av;
import s0.C2549i;
import s0.C2550j;
import s0.C2551k;
import s0.InterfaceC2552l;
import t6.AbstractC3086y3;
import t6.AbstractC3087z;

/* renamed from: ub.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3150c {
    public static final d alpha = new d(new C1752a(28), 465200239, false);

    /* JADX WARN: Removed duplicated region for block: B:27:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void alpha(String str, String str2, s sVar, d dVar, d dVar2, av avVar, AbstractC2088a abstractC2088a, InterfaceC0581m interfaceC0581m, int i4, int i5) {
        int i10;
        d dVar3;
        int i11;
        int i12;
        d dVar4;
        int i13;
        int i14;
        AbstractC2088a abstractC2088a2;
        boolean z2;
        C0585q c0585q;
        av avVar2;
        d dVar5;
        d dVar6;
        AbstractC2088a abstractC2088a3;
        Q uniform;
        av avVar3;
        AbstractC2088a abstractC2088a4;
        int i15;
        int i16;
        int i17;
        int i18;
        C0585q c0585q2 = (C0585q) interfaceC0581m;
        c0585q2.silver(-718154210);
        if ((i4 & 6) == 0) {
            if (c0585q2.golf(str)) {
                i18 = 4;
            } else {
                i18 = 2;
            }
            i10 = i18 | i4;
        } else {
            i10 = i4;
        }
        if ((i4 & 48) == 0) {
            if (c0585q2.golf(str2)) {
                i17 = 32;
            } else {
                i17 = 16;
            }
            i10 |= i17;
        }
        if ((i4 & 384) == 0) {
            if (c0585q2.golf(sVar)) {
                i16 = Barcode.FORMAT_QR_CODE;
            } else {
                i16 = 128;
            }
            i10 |= i16;
        }
        int i19 = i5 & 8;
        if (i19 != 0) {
            i10 |= 3072;
        } else if ((i4 & 3072) == 0) {
            dVar3 = dVar;
            if (c0585q2.india(dVar3)) {
                i11 = 2048;
            } else {
                i11 = Barcode.FORMAT_UPC_E;
            }
            i10 |= i11;
            i12 = i5 & 16;
            if (i12 == 0) {
                i10 |= 24576;
            } else if ((i4 & 24576) == 0) {
                dVar4 = dVar2;
                if (c0585q2.india(dVar4)) {
                    i13 = Http2.INITIAL_MAX_FRAME_SIZE;
                } else {
                    i13 = 8192;
                }
                i10 |= i13;
                i14 = i10 | 196608;
                if ((1572864 & i4) == 0) {
                    if ((i5 & 64) == 0) {
                        abstractC2088a2 = abstractC2088a;
                        if (c0585q2.golf(abstractC2088a2)) {
                            i15 = 1048576;
                            i14 |= i15;
                        }
                    } else {
                        abstractC2088a2 = abstractC2088a;
                    }
                    i15 = 524288;
                    i14 |= i15;
                } else {
                    abstractC2088a2 = abstractC2088a;
                }
                if ((599187 & i14) != 599186) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (c0585q2.magenta(i14 & 1, z2)) {
                    c0585q2.orange();
                    if ((i4 & 1) != 0 && !c0585q2.beige()) {
                        c0585q2.ochre();
                        if ((i5 & 64) != 0) {
                            i14 &= -3670017;
                        }
                        avVar3 = avVar;
                    } else {
                        if (i19 != 0) {
                            dVar3 = null;
                        }
                        if (i12 != 0) {
                            dVar4 = null;
                        }
                        av avVar4 = C2391j.alpha;
                        if ((i5 & 64) != 0) {
                            abstractC2088a4 = ((Y1) c0585q2.kilo(Z1.alpha)).charlie;
                            i14 &= -3670017;
                            avVar3 = avVar4;
                            c0585q2.romeo();
                            g gVar = new g((Context) c0585q2.kilo(AndroidCompositionLocals_androidKt.bravo));
                            gVar.charlie = str;
                            gVar.bravo();
                            h alpha2 = gVar.alpha();
                            s alpha3 = AbstractC3087z.alpha(sVar, abstractC2088a4);
                            d echo = e.echo(194373948, new af(12, dVar3, dVar4), c0585q2);
                            int i20 = ((i14 << 3) & 3670016) | (i14 & 112);
                            c0585q2.red(1004188389);
                            am amVar = n.f1858j;
                            k kVar = T.d.teal;
                            y yVar = p.bravo;
                            f hotel = p.hotel(z.alpha, c0585q2);
                            int i21 = (i20 & 112) | 520 | ((i20 << 3) & 29360128);
                            c0585q2.red(-105413282);
                            p.foxtrot(new q(alpha2, yVar, hotel), str2, alpha3, amVar, null, kVar, avVar3, echo, c0585q2, (i21 & 112) | ((i21 >> 3) & 3670016), 48);
                            c0585q = c0585q2;
                            c0585q.quebec(false);
                            c0585q.quebec(false);
                            dVar5 = dVar3;
                            dVar6 = dVar4;
                            abstractC2088a3 = abstractC2088a4;
                            avVar2 = avVar3;
                        } else {
                            avVar3 = avVar4;
                        }
                    }
                    abstractC2088a4 = abstractC2088a2;
                    c0585q2.romeo();
                    g gVar2 = new g((Context) c0585q2.kilo(AndroidCompositionLocals_androidKt.bravo));
                    gVar2.charlie = str;
                    gVar2.bravo();
                    h alpha22 = gVar2.alpha();
                    s alpha32 = AbstractC3087z.alpha(sVar, abstractC2088a4);
                    d echo2 = e.echo(194373948, new af(12, dVar3, dVar4), c0585q2);
                    int i202 = ((i14 << 3) & 3670016) | (i14 & 112);
                    c0585q2.red(1004188389);
                    am amVar2 = n.f1858j;
                    k kVar2 = T.d.teal;
                    y yVar2 = p.bravo;
                    f hotel2 = p.hotel(z.alpha, c0585q2);
                    int i212 = (i202 & 112) | 520 | ((i202 << 3) & 29360128);
                    c0585q2.red(-105413282);
                    p.foxtrot(new q(alpha22, yVar2, hotel2), str2, alpha32, amVar2, null, kVar2, avVar3, echo2, c0585q2, (i212 & 112) | ((i212 >> 3) & 3670016), 48);
                    c0585q = c0585q2;
                    c0585q.quebec(false);
                    c0585q.quebec(false);
                    dVar5 = dVar3;
                    dVar6 = dVar4;
                    abstractC2088a3 = abstractC2088a4;
                    avVar2 = avVar3;
                } else {
                    c0585q = c0585q2;
                    c0585q.ochre();
                    avVar2 = avVar;
                    dVar5 = dVar3;
                    dVar6 = dVar4;
                    abstractC2088a3 = abstractC2088a2;
                }
                uniform = c0585q.uniform();
                if (uniform != null) {
                    uniform.delta = new N2.a(str, str2, sVar, dVar5, dVar6, avVar2, abstractC2088a3, i4, i5);
                    return;
                }
                return;
            }
            dVar4 = dVar2;
            i14 = i10 | 196608;
            if ((1572864 & i4) == 0) {
            }
            if ((599187 & i14) != 599186) {
            }
            if (c0585q2.magenta(i14 & 1, z2)) {
            }
            uniform = c0585q.uniform();
            if (uniform != null) {
            }
        }
        dVar3 = dVar;
        i12 = i5 & 16;
        if (i12 == 0) {
        }
        dVar4 = dVar2;
        i14 = i10 | 196608;
        if ((1572864 & i4) == 0) {
        }
        if ((599187 & i14) != 599186) {
        }
        if (c0585q2.magenta(i14 & 1, z2)) {
        }
        uniform = c0585q.uniform();
        if (uniform != null) {
        }
    }

    public static final void bravo(InterfaceC0581m interfaceC0581m, int i4) {
        boolean z2;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(89504523);
        if (i4 != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i4 & 1, z2)) {
            FillElement fillElement = V.charlie;
            E0 e02 = F.Q.alpha;
            s bravo = androidx.compose.foundation.a.bravo(fillElement, ((O) c0585q.kilo(e02)).yankee, ao.alpha);
            ap delta = AbstractC0547m.delta(T.d.teal, false);
            long j5 = c0585q.magenta;
            int i5 = (int) (j5 ^ (j5 >>> 32));
            I mike = c0585q.mike();
            s charlie = T.a.charlie(bravo, c0585q);
            InterfaceC2552l.maroon.getClass();
            C2550j c2550j = C2551k.bravo;
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j);
            } else {
                c0585q.i();
            }
            C0564b.blue(C2551k.foxtrot, c0585q, delta);
            C0564b.blue(C2551k.echo, c0585q, mike);
            C2549i c2549i = C2551k.golf;
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i5))) {
                ad.blue(i5, c0585q, i5, c2549i);
            }
            C0564b.blue(C2551k.delta, c0585q, charlie);
            AbstractC0141o0.bravo(AbstractC2056a.alpha(), AbstractC3086y3.bravo(c0585q, R.string.image_failed_to_load_content_description), null, ((O) c0585q.kilo(e02)).zulu, c0585q, 0, 4);
            c0585q.quebec(true);
        } else {
            c0585q.ochre();
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new C1752a(i4, 26);
        }
    }

    public static final void charlie(InterfaceC0581m interfaceC0581m, int i4) {
        boolean z2;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-401986305);
        if (i4 != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i4 & 1, z2)) {
            T.p pVar = T.p.alpha;
            FillElement fillElement = V.charlie;
            E0 e02 = F.Q.alpha;
            s bravo = androidx.compose.foundation.a.bravo(fillElement, ((O) c0585q.kilo(e02)).romeo, ao.alpha);
            ap delta = AbstractC0547m.delta(T.d.teal, false);
            long j5 = c0585q.magenta;
            int i5 = (int) (j5 ^ (j5 >>> 32));
            I mike = c0585q.mike();
            s charlie = T.a.charlie(bravo, c0585q);
            InterfaceC2552l.maroon.getClass();
            C2550j c2550j = C2551k.bravo;
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j);
            } else {
                c0585q.i();
            }
            C0564b.blue(C2551k.foxtrot, c0585q, delta);
            C0564b.blue(C2551k.echo, c0585q, mike);
            C2549i c2549i = C2551k.golf;
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i5))) {
                ad.blue(i5, c0585q, i5, c2549i);
            }
            C0564b.blue(C2551k.delta, c0585q, charlie);
            G1.bravo(V.kilo(pVar, 24), ((O) c0585q.kilo(e02)).alpha, 2, 0L, 0, c0585q, 390, 24);
            c0585q.quebec(true);
        } else {
            c0585q.ochre();
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new C1752a(i4, 27);
        }
    }

    public static final void delta(int i4, s sVar, InterfaceC0581m interfaceC0581m, String str) {
        boolean z2;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(1124743653);
        int i5 = i4 | 384;
        if ((i5 & 147) != 146) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i5 & 1, z2)) {
            sVar = T.p.alpha;
            alpha(null, AbstractC3086y3.alpha(R.string.image_order_content_description, new Object[]{str}, c0585q), V.kilo(sVar, 80), alpha, null, null, null, c0585q, 3078, 112);
        } else {
            c0585q.ochre();
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new Jc.k(i4, 2, sVar, str);
        }
    }

    public static final void echo(String str, final String str2, T.p pVar, float f5, InterfaceC0581m interfaceC0581m, final int i4) {
        int i5;
        boolean z2;
        String str3;
        final float f10;
        final T.p pVar2;
        int i10;
        int i11;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(1230555386);
        if ((i4 & 6) == 0) {
            if (c0585q.golf(str)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i5 = i11 | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            if (c0585q.golf(str2)) {
                i10 = 32;
            } else {
                i10 = 16;
            }
            i5 |= i10;
        }
        int i12 = i5 | 384;
        if ((i12 & 1171) != 1170) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i12 & 1, z2)) {
            T.p pVar3 = T.p.alpha;
            str3 = str;
            foxtrot(str3, AbstractC3086y3.alpha(R.string.image_profile_picture_content_description, new Object[]{str2}, c0585q), pVar3, f5, c0585q, i12 & 8078, 0);
            f10 = f5;
            pVar2 = pVar3;
        } else {
            str3 = str;
            f10 = f5;
            c0585q.ochre();
            pVar2 = pVar;
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            final String str4 = str3;
            uniform.delta = new l() { // from class: ub.a
                @Override // Xd.l
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int cyan = C0564b.cyan(i4 | 1);
                    String str5 = str2;
                    T.p pVar4 = pVar2;
                    float f11 = f10;
                    AbstractC3150c.echo(str4, str5, pVar4, f11, (InterfaceC0581m) obj, cyan);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void foxtrot(final String str, final String str2, s sVar, final float f5, InterfaceC0581m interfaceC0581m, final int i4, final int i5) {
        int i10;
        String str3;
        s sVar2;
        int i11;
        boolean z2;
        final s sVar3;
        Q uniform;
        int i12;
        int i13;
        int i14;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-449034378);
        if ((i4 & 6) == 0) {
            if (c0585q.golf(str)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i10 = i14 | i4;
        } else {
            i10 = i4;
        }
        if ((i4 & 48) == 0) {
            str3 = str2;
            if (c0585q.golf(str3)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i10 |= i13;
        } else {
            str3 = str2;
        }
        int i15 = i5 & 4;
        if (i15 != 0) {
            i10 |= 384;
        } else if ((i4 & 384) == 0) {
            sVar2 = sVar;
            if (c0585q.golf(sVar2)) {
                i11 = Barcode.FORMAT_QR_CODE;
            } else {
                i11 = 128;
            }
            i10 |= i11;
            if ((i4 & 3072) == 0) {
                if (c0585q.delta(f5)) {
                    i12 = 2048;
                } else {
                    i12 = Barcode.FORMAT_UPC_E;
                }
                i10 |= i12;
            }
            if ((i10 & 1171) == 1170) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!c0585q.magenta(i10 & 1, z2)) {
                if (i15 != 0) {
                    sVar3 = T.p.alpha;
                } else {
                    sVar3 = sVar2;
                }
                alpha(str, str3, V.kilo(sVar3, f5), e.echo(-1852628180, new Jc.h(f5, 1, (byte) 0), c0585q), e.echo(-773086133, new Jc.h(f5, 2, (byte) 0), c0585q), null, AbstractC2094g.alpha, c0585q, (i10 & 14) | 27648 | (i10 & 112), 32);
            } else {
                c0585q.ochre();
                sVar3 = sVar2;
            }
            uniform = c0585q.uniform();
            if (uniform == null) {
                uniform.delta = new l() { // from class: ub.b
                    @Override // Xd.l
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int cyan = C0564b.cyan(i4 | 1);
                        float f10 = f5;
                        AbstractC3150c.foxtrot(str, str2, sVar3, f10, (InterfaceC0581m) obj, cyan, i5);
                        return Unit.INSTANCE;
                    }
                };
                return;
            }
            return;
        }
        sVar2 = sVar;
        if ((i4 & 3072) == 0) {
        }
        if ((i10 & 1171) == 1170) {
        }
        if (!c0585q.magenta(i10 & 1, z2)) {
        }
        uniform = c0585q.uniform();
        if (uniform == null) {
        }
    }
}
