package Sc;

import A0.z;
import D0.an;
import H0.v;
import Lb.C0221d;
import T.s;
import a0.ao;
import androidx.appcompat.widget.P0;
import androidx.compose.foundation.layout.AbstractC0538d;
import androidx.compose.foundation.layout.AbstractC0542h;
import androidx.compose.foundation.layout.AbstractC0547m;
import androidx.compose.foundation.layout.AbstractC0553t;
import androidx.compose.foundation.layout.C0537c;
import androidx.compose.foundation.layout.C0554u;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.Q;
import androidx.compose.foundation.layout.S;
import androidx.compose.foundation.layout.V;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.I;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.runtime.as;
import androidx.compose.runtime.ax;
import ao.ad;
import av.q;
import com.google.mlkit.vision.barcode.common.Barcode;
import com.zendesk.service.HttpConstants;
import delivery.samurai.android.R;
import h.AbstractC1797a;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import m.AbstractC2094g;
import okhttp3.internal.http2.Http2;
import q0.ap;
import s0.C2549i;
import s0.C2550j;
import s0.C2551k;
import s0.InterfaceC2552l;
import s6.AbstractC2636d7;
import s6.AbstractC2715m5;
import t6.AbstractC3033o;
import t6.AbstractC3086y3;
import t6.AbstractC3087z;
import t6.M3;
import t6.P3;
import t6.R3;
import t6.S3;
import z.ak;

/* loaded from: classes2.dex */
public abstract class a {
    public static final P.d alpha = new P.d(new S4.b(2), -1066974965, false);
    public static final P.d bravo = new P.d(new C0221d(23), -1910257576, false);
    public static final /* synthetic */ int charlie = 0;
    public static final /* synthetic */ int delta = 0;

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0072, code lost:
    
        if ((r35 & 8) != 0) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void alpha(int i4, int i5, long j5, s sVar, InterfaceC0581m interfaceC0581m, String str, String str2) {
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z2;
        C0585q c0585q;
        long j6;
        C0585q c0585q2 = (C0585q) interfaceC0581m;
        c0585q2.silver(1364482502);
        if (c0585q2.golf(str)) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        int i14 = i4 | i10;
        if (c0585q2.golf(str2)) {
            i11 = 32;
        } else {
            i11 = 16;
        }
        int i15 = i14 | i11;
        if (c0585q2.golf(sVar)) {
            i12 = Barcode.FORMAT_QR_CODE;
        } else {
            i12 = 128;
        }
        int i16 = i15 | i12;
        long j7 = j5;
        if ((i5 & 8) == 0 && c0585q2.foxtrot(j7)) {
            i13 = 2048;
        } else {
            i13 = Barcode.FORMAT_UPC_E;
        }
        int i17 = i16 | i13;
        if ((i17 & 1171) != 1170) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q2.magenta(i17 & 1, z2)) {
            c0585q2.orange();
            int i18 = i4 & 1;
            T.p pVar = T.p.alpha;
            if (i18 != 0 && !c0585q2.beige()) {
                c0585q2.ochre();
            } else {
                if ((i5 & 8) != 0) {
                    j7 = Db.c.bronze;
                    i17 &= -7169;
                }
                int i19 = i17;
                long j10 = j7;
                c0585q2.romeo();
                S alpha2 = Q.alpha(AbstractC0542h.golf, T.d.f2061d, c0585q2, 54);
                long j11 = c0585q2.magenta;
                int i20 = (int) ((j11 >>> 32) ^ j11);
                I mike = c0585q2.mike();
                s charlie2 = T.a.charlie(sVar, c0585q2);
                InterfaceC2552l.maroon.getClass();
                C2550j c2550j = C2551k.bravo;
                c0585q2.white();
                if (c0585q2.lime) {
                    c0585q2.lima(c2550j);
                } else {
                    c0585q2.i();
                }
                C0564b.blue(C2551k.foxtrot, c0585q2, alpha2);
                C0564b.blue(C2551k.echo, c0585q2, mike);
                C2549i c2549i = C2551k.golf;
                if (c0585q2.lime || !Intrinsics.areEqual(c0585q2.jade(), Integer.valueOf(i20))) {
                    ad.blue(i20, c0585q2, i20, c2549i);
                }
                C0564b.blue(C2551k.delta, c0585q2, charlie2);
                ak.bravo(str, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, new an(Db.c.black, AbstractC2636d7.charlie(12), new v(HttpConstants.HTTP_BLOCKED), null, new H0.n(ArraysKt.sierra(new H0.i[]{AbstractC2715m5.alpha(R.font.circularstd, null, 0, 14)})), 0L, 0, 0L, 0, 16777176), c0585q2, i19 & 14, 0, 65534);
                AbstractC0538d.echo(V.oscar(pVar, 8), c0585q2);
                ak.bravo(str2, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, new an(j10, AbstractC2636d7.charlie(14), new v(700), null, new H0.n(ArraysKt.sierra(new H0.i[]{AbstractC2715m5.alpha(R.font.circularstd, null, 0, 14)})), 0L, 2, 0L, 0, 16744408), c0585q2, (i19 >> 3) & 14, 0, 65534);
                c0585q = c0585q2;
                c0585q.quebec(true);
                j6 = j10;
            }
        } else {
            c0585q = c0585q2;
            c0585q.ochre();
            j6 = j7;
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new h(i4, i5, j6, sVar, str, str2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x015f, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r13.jade(), java.lang.Integer.valueOf(r1)) == false) goto L78;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void bravo(final String areaName, final double d4, final String str, final String str2, final Function0 onAccept, final Function0 onReject, InterfaceC0581m interfaceC0581m, final int i4) {
        int i5;
        boolean z2;
        boolean z10;
        boolean z11;
        float f5;
        C2549i c2549i;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        Intrinsics.echo(areaName, "areaName");
        Intrinsics.echo(onAccept, "onAccept");
        Intrinsics.echo(onReject, "onReject");
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(1026653580);
        if ((i4 & 6) == 0) {
            if (c0585q.golf(areaName)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i5 = i15 | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            if (c0585q.charlie(d4)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i5 |= i14;
        }
        if ((i4 & 384) == 0) {
            if (c0585q.golf(str)) {
                i13 = Barcode.FORMAT_QR_CODE;
            } else {
                i13 = 128;
            }
            i5 |= i13;
        }
        if ((i4 & 3072) == 0) {
            if (c0585q.golf(str2)) {
                i12 = 2048;
            } else {
                i12 = Barcode.FORMAT_UPC_E;
            }
            i5 |= i12;
        }
        if ((i4 & 24576) == 0) {
            if (c0585q.india(onAccept)) {
                i11 = Http2.INITIAL_MAX_FRAME_SIZE;
            } else {
                i11 = 8192;
            }
            i5 |= i11;
        }
        if ((196608 & i4) == 0) {
            if (c0585q.india(onReject)) {
                i10 = 131072;
            } else {
                i10 = 65536;
            }
            i5 |= i10;
        }
        if ((74899 & i5) != 74898) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i5 & 1, z2)) {
            int i16 = i5 & 7168;
            if (i16 == 2048) {
                z10 = true;
            } else {
                z10 = false;
            }
            Object jade = c0585q.jade();
            as asVar = C0580l.alpha;
            if (z10 || jade == asVar) {
                jade = C0564b.zulu(null);
                c0585q.f(jade);
            }
            final ax axVar = (ax) jade;
            if (i16 == 2048) {
                z11 = true;
            } else {
                z11 = false;
            }
            boolean golf = z11 | c0585q.golf(axVar);
            Object jade2 = c0585q.jade();
            if (golf || jade2 == asVar) {
                jade2 = new i(str2, axVar, null);
                c0585q.f(jade2);
            }
            int i17 = i5 >> 9;
            C0564b.foxtrot((Xd.l) jade2, c0585q, str2);
            T.p pVar = T.p.alpha;
            long j5 = Db.c.emerald;
            float f10 = 16;
            int i18 = i5;
            s sierra = AbstractC0538d.sierra(androidx.compose.foundation.a.bravo(R3.charlie(V.echo(pVar, 280), 5, j5, AbstractC2094g.bravo(f10)), Db.c.jade, AbstractC2094g.bravo(f10)), f10);
            C0537c c0537c = AbstractC0542h.charlie;
            T.i iVar = T.d.f2062f;
            C0554u alpha2 = AbstractC0553t.alpha(c0537c, iVar, c0585q, 0);
            long j6 = c0585q.magenta;
            int i19 = (int) (j6 ^ (j6 >>> 32));
            I mike = c0585q.mike();
            s charlie2 = T.a.charlie(sierra, c0585q);
            InterfaceC2552l.maroon.getClass();
            C2550j c2550j = C2551k.bravo;
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j);
            } else {
                c0585q.i();
            }
            C2549i c2549i2 = C2551k.foxtrot;
            C0564b.blue(c2549i2, c0585q, alpha2);
            C2549i c2549i3 = C2551k.echo;
            C0564b.blue(c2549i3, c0585q, mike);
            C2549i c2549i4 = C2551k.golf;
            if (!c0585q.lime) {
                f5 = f10;
            } else {
                f5 = f10;
            }
            ad.blue(i19, c0585q, i19, c2549i4);
            C2549i c2549i5 = C2551k.delta;
            C0564b.blue(c2549i5, c0585q, charlie2);
            float f11 = 100;
            float f12 = 12;
            float f13 = f5;
            P3.alpha(V.echo(V.charlie(pVar, 1.0f), f11), AbstractC2094g.bravo(f12), j5, 0L, 2, P.e.echo(-488372930, new Xd.l() { // from class: Sc.f
                @Override // Xd.l
                public final Object invoke(Object obj, Object obj2) {
                    boolean z12;
                    String d9;
                    String str3;
                    String str4;
                    InterfaceC0581m interfaceC0581m2 = (InterfaceC0581m) obj;
                    int intValue = ((Integer) obj2).intValue();
                    if ((intValue & 3) != 2) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    C0585q c0585q2 = (C0585q) interfaceC0581m2;
                    if (c0585q2.magenta(intValue & 1, z12)) {
                        T.p pVar2 = T.p.alpha;
                        float f14 = 12;
                        s sierra2 = AbstractC0538d.sierra(androidx.compose.foundation.a.bravo(R3.charlie(V.echo(V.charlie(pVar2, 1.0f), 100), 1, Db.c.fuchsia, AbstractC2094g.bravo(f14)), Db.c.emerald, AbstractC2094g.bravo(f14)), f14);
                        ap delta2 = AbstractC0547m.delta(T.d.alpha, false);
                        long j7 = c0585q2.magenta;
                        int i20 = (int) (j7 ^ (j7 >>> 32));
                        I mike2 = c0585q2.mike();
                        s charlie3 = T.a.charlie(sierra2, c0585q2);
                        InterfaceC2552l.maroon.getClass();
                        C2550j c2550j2 = C2551k.bravo;
                        c0585q2.white();
                        if (c0585q2.lime) {
                            c0585q2.lima(c2550j2);
                        } else {
                            c0585q2.i();
                        }
                        C2549i c2549i6 = C2551k.foxtrot;
                        C0564b.blue(c2549i6, c0585q2, delta2);
                        C2549i c2549i7 = C2551k.echo;
                        C0564b.blue(c2549i7, c0585q2, mike2);
                        C2549i c2549i8 = C2551k.golf;
                        if (c0585q2.lime || !Intrinsics.areEqual(c0585q2.jade(), Integer.valueOf(i20))) {
                            ad.blue(i20, c0585q2, i20, c2549i8);
                        }
                        C2549i c2549i9 = C2551k.delta;
                        C0564b.blue(c2549i9, c0585q2, charlie3);
                        FillElement fillElement = V.charlie;
                        C0554u alpha3 = AbstractC0553t.alpha(AbstractC0542h.golf, T.d.f2062f, c0585q2, 6);
                        long j10 = c0585q2.magenta;
                        int i21 = (int) (j10 ^ (j10 >>> 32));
                        I mike3 = c0585q2.mike();
                        s charlie4 = T.a.charlie(fillElement, c0585q2);
                        c0585q2.white();
                        if (c0585q2.lime) {
                            c0585q2.lima(c2550j2);
                        } else {
                            c0585q2.i();
                        }
                        C0564b.blue(c2549i6, c0585q2, alpha3);
                        C0564b.blue(c2549i7, c0585q2, mike3);
                        if (c0585q2.lime || !Intrinsics.areEqual(c0585q2.jade(), Integer.valueOf(i21))) {
                            ad.blue(i21, c0585q2, i21, c2549i8);
                        }
                        C0564b.blue(c2549i9, c0585q2, charlie4);
                        s navy = P0.navy(pVar2);
                        T.j jVar = T.d.f2061d;
                        C0537c c0537c2 = AbstractC0542h.alpha;
                        S alpha4 = Q.alpha(c0537c2, jVar, c0585q2, 48);
                        long j11 = c0585q2.magenta;
                        int i22 = (int) (j11 ^ (j11 >>> 32));
                        I mike4 = c0585q2.mike();
                        s charlie5 = T.a.charlie(navy, c0585q2);
                        c0585q2.white();
                        if (c0585q2.lime) {
                            c0585q2.lima(c2550j2);
                        } else {
                            c0585q2.i();
                        }
                        C0564b.blue(c2549i6, c0585q2, alpha4);
                        C0564b.blue(c2549i7, c0585q2, mike4);
                        if (c0585q2.lime || !Intrinsics.areEqual(c0585q2.jade(), Integer.valueOf(i22))) {
                            ad.blue(i22, c0585q2, i22, c2549i8);
                        }
                        C0564b.blue(c2549i9, c0585q2, charlie5);
                        a.alpha(0, 8, 0L, P0.maroon(1.0f), c0585q2, AbstractC3086y3.bravo(c0585q2, R.string.area_name_label), areaName);
                        a.charlie(c0585q2, 0);
                        double d10 = d4;
                        Double valueOf = Double.valueOf(d10);
                        if (d10 % 1.0d == 0.0d) {
                            d9 = String.valueOf((int) d10);
                        } else {
                            d9 = valueOf.toString();
                        }
                        a.alpha(0, 8, 0L, P0.maroon(1.0f), c0585q2, AbstractC3086y3.bravo(c0585q2, R.string.shift_transfer_reward_label), q.echo("﷼ ", d9));
                        c0585q2.quebec(true);
                        AbstractC0538d.echo(V.echo(pVar2, f14), c0585q2);
                        AbstractC3033o.alpha(null, 0.0f, c0585q2, 0, 3);
                        AbstractC0538d.echo(V.echo(pVar2, f14), c0585q2);
                        s navy2 = P0.navy(pVar2);
                        S alpha5 = Q.alpha(c0537c2, jVar, c0585q2, 48);
                        long j12 = c0585q2.magenta;
                        int i23 = (int) (j12 ^ (j12 >>> 32));
                        I mike5 = c0585q2.mike();
                        s charlie6 = T.a.charlie(navy2, c0585q2);
                        c0585q2.white();
                        if (c0585q2.lime) {
                            c0585q2.lima(c2550j2);
                        } else {
                            c0585q2.i();
                        }
                        C0564b.blue(c2549i6, c0585q2, alpha5);
                        C0564b.blue(c2549i7, c0585q2, mike5);
                        if (c0585q2.lime || !Intrinsics.areEqual(c0585q2.jade(), Integer.valueOf(i23))) {
                            ad.blue(i23, c0585q2, i23, c2549i8);
                        }
                        C0564b.blue(c2549i9, c0585q2, charlie6);
                        String bravo2 = AbstractC3086y3.bravo(c0585q2, R.string.distance_label);
                        String str5 = str;
                        if (str5 == null) {
                            str3 = "";
                        } else {
                            str3 = str5;
                        }
                        a.alpha(0, 8, 0L, P0.maroon(1.0f), c0585q2, bravo2, str3);
                        a.charlie(c0585q2, 0);
                        String bravo3 = AbstractC3086y3.bravo(c0585q2, R.string.expires_in_label);
                        String str6 = (String) axVar.getValue();
                        if (str6 == null) {
                            str4 = "";
                        } else {
                            str4 = str6;
                        }
                        a.alpha(0, 0, Db.c.orange, P0.maroon(1.0f), c0585q2, bravo3, str4);
                        z.papa(c0585q2, true, true, true);
                    } else {
                        c0585q2.ochre();
                    }
                    return Unit.INSTANCE;
                }
            }, c0585q), c0585q, 1769478, 24);
            AbstractC0538d.echo(V.echo(pVar, f12), c0585q);
            float f14 = 1;
            s sierra2 = AbstractC0538d.sierra(androidx.compose.foundation.a.bravo(R3.charlie(AbstractC3087z.alpha(V.echo(pVar, 60), AbstractC2094g.bravo(f12)), f14, Db.c.magenta, AbstractC2094g.bravo(f12)), Db.c.amber, ao.alpha), f12);
            C0554u alpha3 = AbstractC0553t.alpha(c0537c, iVar, c0585q, 48);
            long j7 = c0585q.magenta;
            int i20 = (int) (j7 ^ (j7 >>> 32));
            I mike2 = c0585q.mike();
            s charlie3 = T.a.charlie(sierra2, c0585q);
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j);
            } else {
                c0585q.i();
            }
            C0564b.blue(c2549i2, c0585q, alpha3);
            C0564b.blue(c2549i3, c0585q, mike2);
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i20))) {
                c2549i = c2549i4;
                ad.blue(i20, c0585q, i20, c2549i);
            } else {
                c2549i = c2549i4;
            }
            C0564b.blue(c2549i5, c0585q, charlie3);
            ak.bravo(AbstractC3086y3.bravo(c0585q, R.string.transfer_card_info_line1), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, new an(Db.c.maroon, AbstractC2636d7.charlie(12), new v(HttpConstants.HTTP_BLOCKED), null, new H0.n(ArraysKt.sierra(new H0.i[]{AbstractC2715m5.alpha(R.font.circularstd, null, 0, 14)})), 0L, 0, 0L, 0, 16777176), c0585q, 0, 0, 65534);
            c0585q.quebec(true);
            AbstractC0538d.echo(V.echo(pVar, f13), c0585q);
            s charlie4 = V.charlie(pVar, 1.0f);
            S alpha4 = Q.alpha(AbstractC0542h.alpha, T.d.f2061d, c0585q, 48);
            long j10 = c0585q.magenta;
            int i21 = (int) (j10 ^ (j10 >>> 32));
            I mike3 = c0585q.mike();
            s charlie5 = T.a.charlie(charlie4, c0585q);
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j);
            } else {
                c0585q.i();
            }
            C0564b.blue(c2549i2, c0585q, alpha4);
            C0564b.blue(c2549i3, c0585q, mike3);
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i21))) {
                ad.blue(i21, c0585q, i21, c2549i);
            }
            C0564b.blue(c2549i5, c0585q, charlie5);
            String bravo2 = AbstractC3086y3.bravo(c0585q, R.string.accept);
            if (1.0f <= 0.0d) {
                AbstractC1797a.alpha("invalid weight; must be greater than zero");
            }
            Pa.i.foxtrot(bravo2, onAccept, true, V.echo(new LayoutWeightElement(1.0f, true), 56), alpha, null, c0585q, (i17 & 112) | 24960, 96);
            AbstractC0538d.echo(V.oscar(pVar, f13), c0585q);
            M3.bravo(onReject, V.echo(V.oscar(pVar, f11), 54), null, AbstractC2094g.bravo(f12), S3.alpha(f14, ao.delta(4292138200L)), null, null, bravo, c0585q, ((i18 >> 15) & 14) | 806879280, HttpConstants.HTTP_PRECON_FAILED);
            c0585q = c0585q;
            c0585q.quebec(true);
            c0585q.quebec(true);
        } else {
            c0585q.ochre();
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new Xd.l() { // from class: Sc.g
                @Override // Xd.l
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int cyan = C0564b.cyan(i4 | 1);
                    Function0 function0 = onAccept;
                    Function0 function02 = onReject;
                    a.bravo(areaName, d4, str, str2, function0, function02, (InterfaceC0581m) obj, cyan);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void charlie(InterfaceC0581m interfaceC0581m, int i4) {
        boolean z2;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-228411246);
        if (i4 != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i4 & 1, z2)) {
            AbstractC0547m.alpha(androidx.compose.foundation.a.bravo(V.echo(V.oscar(AbstractC0538d.uniform(T.p.alpha, 16, 0.0f, 2), 1), 28), ao.delta(4292138200L), ao.alpha), c0585q, 6);
        } else {
            c0585q.ochre();
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new S4.b(i4, 3);
        }
    }
}
