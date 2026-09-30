package Gb;

import Ec.ai;
import a0.C0366t;
import a0.an;
import a0.ao;
import androidx.appcompat.widget.P0;
import androidx.compose.foundation.layout.AbstractC0538d;
import androidx.compose.foundation.layout.AbstractC0542h;
import androidx.compose.foundation.layout.AbstractC0547m;
import androidx.compose.foundation.layout.AbstractC0553t;
import androidx.compose.foundation.layout.C0554u;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.M;
import androidx.compose.foundation.layout.Q;
import androidx.compose.foundation.layout.S;
import androidx.compose.foundation.layout.V;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.D0;
import androidx.compose.runtime.I;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.runtime.as;
import androidx.compose.runtime.aw;
import androidx.compose.runtime.n0;
import ao.ad;
import bz.AbstractC0779d;
import bz.AbstractC0782g;
import com.google.mlkit.vision.barcode.common.Barcode;
import com.zendesk.service.HttpConstants;
import delivery.samurai.android.R;
import h.AbstractC1797a;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
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
import t6.AbstractC3086y3;
import t6.AbstractC3087z;
import t6.M3;
import t6.R3;
import t6.S3;
import t6.X3;
import z.AbstractC3447a;
import z.ak;

/* loaded from: classes2.dex */
public abstract class a {
    public static final P.d alpha = new P.d(new D0.y(21), -395812906, false);
    public static final P.d bravo = new P.d(new b(0), -1129879915, false);
    public static final P.d charlie = new P.d(new b(1), 772488651, false);
    public static final /* synthetic */ int delta = 0;
    public static final /* synthetic */ int echo = 0;

    /* JADX WARN: Code restructure failed: missing block: B:84:0x01d0, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.jade(), java.lang.Integer.valueOf(r12)) == false) goto L112;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void alpha(String str, String str2, String str3, String str4, String str5, String str6, Function0 onLater, Function0 onView, InterfaceC0581m interfaceC0581m, int i4, int i5) {
        int i10;
        String str7;
        int i11;
        int i12;
        String str8;
        int i13;
        int i14;
        boolean z2;
        Function0 function0;
        Function0 function02;
        C0585q c0585q;
        String str9;
        String str10;
        String str11;
        String str12;
        long j5;
        long j6;
        long j7;
        boolean z10;
        float f5;
        long j10;
        C2549i c2549i;
        C2549i c2549i2;
        long j11;
        int i15;
        boolean z11;
        float f10;
        int i16;
        C2549i c2549i3;
        C2549i c2549i4;
        C2549i c2549i5;
        C2550j c2550j;
        T.p pVar;
        char c3;
        C2549i c2549i6;
        int i17;
        ?? r11;
        boolean z12;
        C0585q c0585q2;
        C0366t charlie2;
        C0366t charlie3;
        C0366t charlie4;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        Intrinsics.echo(onLater, "onLater");
        Intrinsics.echo(onView, "onView");
        C0585q c0585q3 = (C0585q) interfaceC0581m;
        c0585q3.silver(-761384521);
        if ((i4 & 6) == 0) {
            if (c0585q3.golf(str)) {
                i23 = 4;
            } else {
                i23 = 2;
            }
            i10 = i23 | i4;
        } else {
            i10 = i4;
        }
        if ((i4 & 48) == 0) {
            if (c0585q3.golf(str2)) {
                i22 = 32;
            } else {
                i22 = 16;
            }
            i10 |= i22;
        }
        if ((i4 & 384) == 0) {
            if (c0585q3.golf(str3)) {
                i21 = Barcode.FORMAT_QR_CODE;
            } else {
                i21 = 128;
            }
            i10 |= i21;
        }
        int i24 = i5 & 8;
        if (i24 != 0) {
            i12 = i10 | 3072;
            str7 = str4;
        } else {
            str7 = str4;
            if (c0585q3.golf(str7)) {
                i11 = 2048;
            } else {
                i11 = Barcode.FORMAT_UPC_E;
            }
            i12 = i10 | i11;
        }
        int i25 = i5 & 16;
        if (i25 != 0) {
            i14 = i12 | 24576;
            str8 = str5;
        } else {
            str8 = str5;
            if (c0585q3.golf(str8)) {
                i13 = Http2.INITIAL_MAX_FRAME_SIZE;
            } else {
                i13 = 8192;
            }
            i14 = i12 | i13;
        }
        if ((i4 & 196608) == 0) {
            if (c0585q3.golf(str6)) {
                i20 = 131072;
            } else {
                i20 = 65536;
            }
            i14 |= i20;
        }
        if ((i4 & 1572864) == 0) {
            if (c0585q3.india(onLater)) {
                i19 = 1048576;
            } else {
                i19 = 524288;
            }
            i14 |= i19;
        }
        if ((i4 & 12582912) == 0) {
            if (c0585q3.india(onView)) {
                i18 = 8388608;
            } else {
                i18 = 4194304;
            }
            i14 |= i18;
        }
        int i26 = i14;
        if ((i26 & 4793491) != 4793490) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q3.magenta(i26 & 1, z2)) {
            if (i24 != 0) {
                str11 = null;
            } else {
                str11 = str7;
            }
            if (i25 != 0) {
                str12 = null;
            } else {
                str12 = str8;
            }
            Fb.a bravo2 = Fb.f.bravo(str3);
            if (str11 != null && (charlie4 = Fb.f.charlie(str11)) != null) {
                j5 = charlie4.alpha;
            } else {
                j5 = bravo2.alpha;
            }
            if (str12 != null && (charlie3 = Fb.f.charlie(str12)) != null) {
                j6 = charlie3.alpha;
            } else {
                j6 = bravo2.bravo;
            }
            if (str12 != null && (charlie2 = Fb.f.charlie(str12)) != null) {
                j7 = charlie2.alpha;
            } else {
                j7 = bravo2.charlie;
            }
            long j12 = j7;
            if ((i26 & 112) == 32) {
                z10 = true;
            } else {
                z10 = false;
            }
            Object jade = c0585q3.jade();
            as asVar = C0580l.alpha;
            if (z10 || jade == asVar) {
                if (str2 == null) {
                    f5 = 1.5f;
                } else {
                    f5 = 1.7777778f;
                }
                jade = C0564b.victor(f5);
                c0585q3.f(jade);
            }
            aw awVar = (aw) jade;
            D0 bravo3 = AbstractC0782g.bravo(((n0) awVar).juliet(), AbstractC0779d.kilo(220, 0, null, 6), "envelopeImageRatio", c0585q3, 3120, 20);
            T.p pVar2 = T.p.alpha;
            long j13 = j5;
            float f11 = 12;
            T.s sierra = AbstractC0538d.sierra(androidx.compose.foundation.a.bravo(V.oscar(pVar2, 280), C0366t.echo, AbstractC2094g.bravo(f11)), 16);
            C0554u alpha2 = AbstractC0553t.alpha(AbstractC0542h.golf(f11), T.d.f2062f, c0585q3, 6);
            long j14 = c0585q3.magenta;
            int i27 = (int) (j14 ^ (j14 >>> 32));
            I mike = c0585q3.mike();
            T.s charlie5 = T.a.charlie(sierra, c0585q3);
            InterfaceC2552l.maroon.getClass();
            C2550j c2550j2 = C2551k.bravo;
            c0585q3.white();
            if (c0585q3.lime) {
                c0585q3.lima(c2550j2);
            } else {
                c0585q3.i();
            }
            C2549i c2549i7 = C2551k.foxtrot;
            C0564b.blue(c2549i7, c0585q3, alpha2);
            C2549i c2549i8 = C2551k.echo;
            C0564b.blue(c2549i8, c0585q3, mike);
            C2549i c2549i9 = C2551k.golf;
            if (!c0585q3.lime) {
                j10 = j6;
            } else {
                j10 = j6;
            }
            ad.blue(i27, c0585q3, i27, c2549i9);
            C2549i c2549i10 = C2551k.delta;
            C0564b.blue(c2549i10, c0585q3, charlie5);
            T.s bravo4 = androidx.compose.foundation.a.bravo(AbstractC3087z.alpha(AbstractC0538d.golf(V.charlie(pVar2, 1.0f), ((Number) bravo3.getValue()).floatValue()), AbstractC2094g.bravo(6)), ao.delta(4293256677L), ao.alpha);
            ap delta2 = AbstractC0547m.delta(T.d.alpha, false);
            long j15 = c0585q3.magenta;
            int i28 = (int) (j15 ^ (j15 >>> 32));
            I mike2 = c0585q3.mike();
            T.s charlie6 = T.a.charlie(bravo4, c0585q3);
            c0585q3.white();
            if (c0585q3.lime) {
                c0585q3.lima(c2550j2);
            } else {
                c0585q3.i();
            }
            C0564b.blue(c2549i7, c0585q3, delta2);
            C0564b.blue(c2549i8, c0585q3, mike2);
            if (c0585q3.lime || !Intrinsics.areEqual(c0585q3.jade(), Integer.valueOf(i28))) {
                ad.blue(i28, c0585q3, i28, c2549i9);
            }
            C0564b.blue(c2549i10, c0585q3, charlie6);
            if (str2 != null) {
                c0585q3.purple(-2060091288);
                FillElement fillElement = V.charlie;
                P.d dVar = bravo;
                P.d dVar2 = charlie;
                boolean golf = c0585q3.golf(awVar);
                Object jade2 = c0585q3.jade();
                if (golf || jade2 == asVar) {
                    jade2 = new Aa.l(10, awVar);
                    c0585q3.f(jade2);
                }
                c2549i2 = c2549i8;
                j11 = j13;
                c2549i = c2549i7;
                i15 = 1;
                f10 = 1.0f;
                i16 = 12;
                N2.p.echo(str2, fillElement, dVar, dVar2, (Function1) jade2, c0585q3, ((i26 >> 3) & 14) | 1597872, 128680);
                z11 = false;
            } else {
                c2549i = c2549i7;
                c2549i2 = c2549i8;
                j11 = j13;
                i15 = 1;
                z11 = false;
                f10 = 1.0f;
                i16 = 12;
                c0585q3.purple(-2064772753);
            }
            c0585q3.quebec(z11);
            c0585q3.quebec(i15);
            c0585q3.purple(-891661973);
            T.s charlie7 = V.charlie(pVar2, f10);
            S alpha3 = Q.alpha(AbstractC0542h.golf, T.d.f2061d, c0585q3, 54);
            long j16 = c0585q3.magenta;
            int i29 = (int) (j16 ^ (j16 >>> 32));
            I mike3 = c0585q3.mike();
            T.s charlie8 = T.a.charlie(charlie7, c0585q3);
            c0585q3.white();
            if (c0585q3.lime) {
                c0585q3.lima(c2550j2);
            } else {
                c0585q3.i();
            }
            C0564b.blue(c2549i, c0585q3, alpha3);
            C0564b.blue(c2549i2, c0585q3, mike3);
            if (c0585q3.lime || !Intrinsics.areEqual(c0585q3.jade(), Integer.valueOf(i29))) {
                ad.blue(i29, c0585q3, i29, c2549i9);
            }
            C0564b.blue(c2549i10, c0585q3, charlie8);
            if (str3 == null) {
                c0585q3.purple(-187535925);
                c0585q3.quebec(false);
                c2549i6 = c2549i;
                c2549i3 = c2549i2;
                c2549i4 = c2549i10;
                pVar = pVar2;
                c2549i5 = c2549i9;
                c2550j = c2550j2;
                i17 = 14;
                c3 = ' ';
                z12 = false;
                c0585q2 = c0585q3;
                r11 = i15;
            } else {
                c0585q3.purple(-187535924);
                float f12 = 100;
                T.s tango = AbstractC0538d.tango(androidx.compose.foundation.a.bravo(R3.charlie(V.tango(pVar2, 3), i15, j10, AbstractC2094g.bravo(f12)), j11, AbstractC2094g.bravo(f12)), 8, 4);
                ap delta3 = AbstractC0547m.delta(T.d.teal, false);
                long j17 = c0585q3.magenta;
                int i30 = (int) (j17 ^ (j17 >>> 32));
                I mike4 = c0585q3.mike();
                T.s charlie9 = T.a.charlie(tango, c0585q3);
                c0585q3.white();
                if (c0585q3.lime) {
                    c0585q3.lima(c2550j2);
                } else {
                    c0585q3.i();
                }
                C0564b.blue(c2549i, c0585q3, delta3);
                C0564b.blue(c2549i2, c0585q3, mike4);
                if (c0585q3.lime || !Intrinsics.areEqual(c0585q3.jade(), Integer.valueOf(i30))) {
                    ad.blue(i30, c0585q3, i30, c2549i9);
                }
                C0564b.blue(c2549i10, c0585q3, charlie9);
                long charlie10 = AbstractC2636d7.charlie(i16);
                H0.i[] iVarArr = new H0.i[i15];
                iVarArr[0] = AbstractC2715m5.alpha(R.font.circularstd, null, 0, 14);
                c2549i3 = c2549i2;
                c2549i4 = c2549i10;
                c2549i5 = c2549i9;
                c2550j = c2550j2;
                pVar = pVar2;
                c3 = ' ';
                c2549i6 = c2549i;
                i17 = 14;
                ak.bravo(str3, null, j12, charlie10, new H0.v(700), new H0.n(ArraysKt.sierra(iVarArr)), 0L, null, 0L, 0, false, 1, 0, null, null, c0585q3, 1772544, 3456, 118674);
                C0585q c0585q4 = c0585q3;
                r11 = 1;
                c0585q4.quebec(true);
                z12 = false;
                c0585q4.quebec(false);
                c0585q2 = c0585q4;
            }
            c0585q2.purple(-186629267);
            ak.bravo(str6, null, ao.delta(4285624698L), AbstractC2636d7.charlie(i17), new H0.v(HttpConstants.HTTP_BLOCKED), null, 0L, null, 0L, 0, false, 0, 0, null, null, c0585q2, 200064, 0, 131026);
            A0.z.papa(c0585q2, z12, r11, z12);
            T.p pVar3 = pVar;
            ak.bravo(str, X3.bravo(V.golf(V.charlie(pVar3, 1.0f), 0.0f, 130, r11), X3.alpha(c0585q2), r11), ao.delta(4280756010L), AbstractC2636d7.charlie(i17), new H0.v(HttpConstants.HTTP_BLOCKED), null, 0L, null, AbstractC2636d7.charlie(20), 0, false, 0, 0, null, null, c0585q2, (i26 & 14) | 200064, 6, 130000);
            T.s charlie11 = V.charlie(pVar3, 1.0f);
            S alpha4 = Q.alpha(AbstractC0542h.golf(8), T.d.f2060c, c0585q2, 6);
            long j18 = c0585q2.magenta;
            int i31 = (int) (j18 ^ (j18 >>> c3));
            I mike5 = c0585q2.mike();
            T.s charlie12 = T.a.charlie(charlie11, c0585q2);
            c0585q2.white();
            if (c0585q2.lime) {
                c0585q2.lima(c2550j);
            } else {
                c0585q2.i();
            }
            C0564b.blue(c2549i6, c0585q2, alpha4);
            C0564b.blue(c2549i3, c0585q2, mike5);
            if (c0585q2.lime || !Intrinsics.areEqual(c0585q2.jade(), Integer.valueOf(i31))) {
                ad.blue(i31, c0585q2, i31, c2549i5);
            }
            C0564b.blue(c2549i4, c0585q2, charlie12);
            function0 = onLater;
            charlie((i26 >> 15) & 112, P0.maroon(1.0f), c0585q2, AbstractC3086y3.bravo(c0585q2, R.string.later), function0);
            function02 = onView;
            delta((i26 >> 18) & 112, P0.maroon(1.0f), c0585q2, AbstractC3086y3.bravo(c0585q2, R.string.view), function02);
            c0585q2.quebec(r11);
            c0585q2.quebec(r11);
            c0585q = c0585q2;
            str9 = str11;
            str10 = str12;
        } else {
            function0 = onLater;
            function02 = onView;
            c0585q3.ochre();
            c0585q = c0585q3;
            str9 = str7;
            str10 = str8;
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new y(str, str2, str3, str9, str10, str6, function0, function02, i4, i5, 0);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x010a, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r7.jade(), java.lang.Integer.valueOf(r14)) == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x023f, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r7.jade(), java.lang.Integer.valueOf(r13)) == false) goto L81;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void bravo(m mVar, boolean z2, Function1 function1, T.s sVar, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        int i10;
        int i11;
        boolean z10;
        C0585q c0585q;
        List list;
        boolean z11;
        boolean z12;
        long j5;
        boolean z13;
        String str;
        H0.v vVar;
        long j6;
        boolean z14;
        m selected = mVar;
        Function1 onSelected = function1;
        Intrinsics.echo(selected, "selected");
        Intrinsics.echo(onSelected, "onSelected");
        C0585q c0585q2 = (C0585q) interfaceC0581m;
        c0585q2.silver(-628594717);
        if (c0585q2.echo(selected.ordinal())) {
            i5 = 4;
        } else {
            i5 = 2;
        }
        int i12 = i4 | i5;
        if (c0585q2.hotel(z2)) {
            i10 = 32;
        } else {
            i10 = 16;
        }
        int i13 = i12 | i10;
        if (c0585q2.india(onSelected)) {
            i11 = Barcode.FORMAT_QR_CODE;
        } else {
            i11 = 128;
        }
        int i14 = i13 | i11;
        if ((i14 & 1171) != 1170) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (c0585q2.magenta(i14 & 1, z10)) {
            T.p pVar = T.p.alpha;
            List listOf = CollectionsKt.listOf(new Pair(m.alpha, AbstractC3086y3.bravo(c0585q2, R.string.tab_all)), new Pair(m.purple, AbstractC3086y3.bravo(c0585q2, R.string.tab_messages)), new Pair(m.red, AbstractC3086y3.bravo(c0585q2, R.string.tab_alerts)));
            T.s alpha2 = AbstractC3087z.alpha(V.charlie(sVar, 1.0f), AbstractC2094g.bravo(12));
            long delta2 = ao.delta(4294243573L);
            an anVar = ao.alpha;
            float f5 = 4;
            T.s sierra = AbstractC0538d.sierra(V.golf(androidx.compose.foundation.a.bravo(alpha2, delta2, anVar), 44, 0.0f, 2), f5);
            ap delta3 = AbstractC0547m.delta(T.d.alpha, false);
            an anVar2 = anVar;
            long j7 = c0585q2.magenta;
            int i15 = (int) (j7 ^ (j7 >>> 32));
            I mike = c0585q2.mike();
            T.s charlie2 = T.a.charlie(sierra, c0585q2);
            InterfaceC2552l.maroon.getClass();
            C2550j c2550j = C2551k.bravo;
            c0585q2.white();
            if (c0585q2.lime) {
                c0585q2.lima(c2550j);
            } else {
                c0585q2.i();
            }
            C2549i c2549i = C2551k.foxtrot;
            C0564b.blue(c2549i, c0585q2, delta3);
            C2549i c2549i2 = C2551k.echo;
            C0564b.blue(c2549i2, c0585q2, mike);
            C2549i c2549i3 = C2551k.golf;
            if (!c0585q2.lime) {
                list = listOf;
            } else {
                list = listOf;
            }
            ad.blue(i15, c0585q2, i15, c2549i3);
            C2549i c2549i4 = C2551k.delta;
            C0564b.blue(c2549i4, c0585q2, charlie2);
            T.s charlie3 = V.charlie(pVar, 1.0f);
            S alpha3 = Q.alpha(AbstractC0542h.alpha, T.d.f2060c, c0585q2, 0);
            long j10 = c0585q2.magenta;
            int i16 = (int) (j10 ^ (j10 >>> 32));
            I mike2 = c0585q2.mike();
            T.s charlie4 = T.a.charlie(charlie3, c0585q2);
            c0585q2.white();
            if (c0585q2.lime) {
                c0585q2.lima(c2550j);
            } else {
                c0585q2.i();
            }
            C0564b.blue(c2549i, c0585q2, alpha3);
            C0564b.blue(c2549i2, c0585q2, mike2);
            if (c0585q2.lime || !Intrinsics.areEqual(c0585q2.jade(), Integer.valueOf(i16))) {
                ad.blue(i16, c0585q2, i16, c2549i3);
            }
            C0564b.blue(c2549i4, c0585q2, charlie4);
            c0585q2.purple(743655386);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                m mVar2 = (m) pair.first;
                String str2 = (String) pair.second;
                if (selected == mVar2) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (mVar2 == m.purple && z2) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (1.0f <= 0.0d) {
                    AbstractC1797a.alpha("invalid weight; must be greater than zero");
                }
                T.s alpha4 = AbstractC3087z.alpha(V.golf(new LayoutWeightElement(1.0f, true), 36, 0.0f, 2), AbstractC2094g.bravo(10));
                if (z11) {
                    j5 = C0366t.echo;
                } else {
                    j5 = C0366t.juliet;
                }
                an anVar3 = anVar2;
                T.s bravo2 = androidx.compose.foundation.a.bravo(alpha4, j5, anVar3);
                if ((i14 & 896) == 256) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                boolean echo2 = c0585q2.echo(mVar2.ordinal()) | z13;
                Object jade = c0585q2.jade();
                if (echo2 || jade == C0580l.alpha) {
                    jade = new Ac.g(6, onSelected, mVar2);
                    c0585q2.f(jade);
                }
                T.s echo3 = androidx.compose.foundation.a.echo(15, bravo2, null, (Function0) jade, false);
                ap delta4 = AbstractC0547m.delta(T.d.teal, false);
                long j11 = c0585q2.magenta;
                int i17 = (int) (j11 ^ (j11 >>> 32));
                I mike3 = c0585q2.mike();
                T.s charlie5 = T.a.charlie(echo3, c0585q2);
                InterfaceC2552l.maroon.getClass();
                C2550j c2550j2 = C2551k.bravo;
                c0585q2.white();
                Iterator it2 = it;
                if (c0585q2.lime) {
                    c0585q2.lima(c2550j2);
                } else {
                    c0585q2.i();
                }
                C2549i c2549i5 = C2551k.foxtrot;
                C0564b.blue(c2549i5, c0585q2, delta4);
                C2549i c2549i6 = C2551k.echo;
                C0564b.blue(c2549i6, c0585q2, mike3);
                C2549i c2549i7 = C2551k.golf;
                if (!c0585q2.lime) {
                    str = str2;
                } else {
                    str = str2;
                }
                ad.blue(i17, c0585q2, i17, c2549i7);
                C2549i c2549i8 = C2551k.delta;
                C0564b.blue(c2549i8, c0585q2, charlie5);
                S alpha5 = Q.alpha(AbstractC0542h.golf(f5), T.d.f2061d, c0585q2, 54);
                long j12 = c0585q2.magenta;
                int i18 = (int) (j12 ^ (j12 >>> 32));
                I mike4 = c0585q2.mike();
                T.s charlie6 = T.a.charlie(pVar, c0585q2);
                c0585q2.white();
                boolean z15 = z11;
                if (c0585q2.lime) {
                    c0585q2.lima(c2550j2);
                } else {
                    c0585q2.i();
                }
                C0564b.blue(c2549i5, c0585q2, alpha5);
                C0564b.blue(c2549i6, c0585q2, mike4);
                if (c0585q2.lime || !Intrinsics.areEqual(c0585q2.jade(), Integer.valueOf(i18))) {
                    ad.blue(i18, c0585q2, i18, c2549i7);
                }
                C0564b.blue(c2549i8, c0585q2, charlie6);
                long charlie7 = AbstractC2636d7.charlie(14);
                if (z15) {
                    vVar = H0.v.f1408b;
                } else {
                    vVar = H0.v.yellow;
                }
                H0.v vVar2 = vVar;
                if (z15) {
                    j6 = 4280756010L;
                } else {
                    j6 = 4285624698L;
                }
                float f10 = f5;
                int i19 = i14;
                C0585q c0585q3 = c0585q2;
                T.p pVar2 = pVar;
                ak.bravo(str, null, ao.delta(j6), charlie7, vVar2, null, 0L, null, 0L, 0, false, 0, 0, null, null, c0585q3, 3072, 0, 131026);
                if (z12) {
                    c0585q3.purple(881213432);
                    z14 = false;
                    AbstractC0547m.alpha(androidx.compose.foundation.a.bravo(V.kilo(pVar2, 6), ao.delta(4292617766L), AbstractC2094g.alpha), c0585q3, 0);
                } else {
                    z14 = false;
                    c0585q3.purple(877777702);
                }
                c0585q3.quebec(z14);
                c0585q3.quebec(true);
                c0585q3.quebec(true);
                pVar = pVar2;
                anVar2 = anVar3;
                f5 = f10;
                c0585q2 = c0585q3;
                it = it2;
                selected = mVar;
                i14 = i19;
                onSelected = function1;
            }
            c0585q = c0585q2;
            A0.z.papa(c0585q, false, true, true);
        } else {
            c0585q = c0585q2;
            c0585q.ochre();
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new i(mVar, z2, function1, sVar, i4);
        }
    }

    public static final void charlie(int i4, T.s sVar, InterfaceC0581m interfaceC0581m, String text, Function0 onClick) {
        int i5;
        boolean z2;
        int i10;
        int i11;
        int i12;
        Intrinsics.echo(text, "text");
        Intrinsics.echo(onClick, "onClick");
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-2072678436);
        if ((i4 & 6) == 0) {
            if (c0585q.golf(text)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i5 = i12 | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            if (c0585q.india(onClick)) {
                i11 = 32;
            } else {
                i11 = 16;
            }
            i5 |= i11;
        }
        if ((i4 & 384) == 0) {
            if (c0585q.golf(sVar)) {
                i10 = Barcode.FORMAT_QR_CODE;
            } else {
                i10 = 128;
            }
            i5 |= i10;
        }
        if ((i5 & 147) != 146) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i5 & 1, z2)) {
            float f5 = 8;
            float f10 = 10;
            M3.bravo(onClick, V.golf(sVar, 44, 0.0f, 2), null, AbstractC2094g.bravo(12), S3.alpha(1, ao.delta(4292138200L)), null, new M(f5, f10, f5, f10), P.e.echo(-137548466, new ai(text, 2), c0585q), c0585q, ((i5 >> 3) & 14) | 907542528, 156);
        } else {
            c0585q.ochre();
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new z(text, onClick, sVar, i4, 1);
        }
    }

    public static final void delta(int i4, T.s sVar, InterfaceC0581m interfaceC0581m, String text, Function0 onClick) {
        int i5;
        boolean z2;
        int i10;
        int i11;
        int i12;
        int i13 = 1;
        Intrinsics.echo(text, "text");
        Intrinsics.echo(onClick, "onClick");
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-133350008);
        if ((i4 & 6) == 0) {
            if (c0585q.golf(text)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i5 = i12 | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            if (c0585q.india(onClick)) {
                i11 = 32;
            } else {
                i11 = 16;
            }
            i5 |= i11;
        }
        if ((i4 & 384) == 0) {
            if (c0585q.golf(sVar)) {
                i10 = Barcode.FORMAT_QR_CODE;
            } else {
                i10 = 128;
            }
            i5 |= i10;
        }
        int i14 = i5 | 3072;
        if ((i14 & 1171) != 1170) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i14 & 1, z2)) {
            T.s golf = V.golf(sVar, 44, 0.0f, 2);
            float f5 = 8;
            float f10 = 10;
            M m4 = new M(f5, f10, f5, f10);
            M m5 = AbstractC3447a.alpha;
            M3.alpha(onClick, golf, false, null, AbstractC2094g.bravo(12), null, AbstractC3447a.alpha(C0366t.bravo, C0366t.echo, c0585q, 54, 12), m4, P.e.echo(1259274136, new ai(text, i13), c0585q), c0585q, ((i14 >> 3) & 14) | 905969664, 92);
        } else {
            c0585q.ochre();
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new z(text, onClick, sVar, i4, 0);
        }
    }
}
