package Fb;

import A0.z;
import H0.v;
import T.s;
import a0.C0366t;
import a0.an;
import a0.ao;
import android.graphics.Color;
import androidx.appcompat.widget.P0;
import androidx.compose.foundation.layout.AbstractC0538d;
import androidx.compose.foundation.layout.AbstractC0542h;
import androidx.compose.foundation.layout.AbstractC0547m;
import androidx.compose.foundation.layout.AbstractC0553t;
import androidx.compose.foundation.layout.C0537c;
import androidx.compose.foundation.layout.C0554u;
import androidx.compose.foundation.layout.Q;
import androidx.compose.foundation.layout.S;
import androidx.compose.foundation.layout.V;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.I;
import androidx.compose.runtime.InterfaceC0581m;
import ao.ad;
import com.google.mlkit.vision.barcode.common.Barcode;
import com.zendesk.service.HttpConstants;
import delivery.samurai.android.R;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.r;
import m.AbstractC2094g;
import okhttp3.internal.http2.Http2;
import q0.C2391j;
import q0.ap;
import s0.C2549i;
import s0.C2550j;
import s0.C2551k;
import s0.InterfaceC2552l;
import s6.AbstractC2636d7;
import s6.AbstractC2715m5;
import t6.AbstractC3087z;
import t6.R3;
import t6.W3;
import z.ak;

/* loaded from: classes2.dex */
public abstract class f {
    public static final long alpha = ao.delta(4294243573L);

    static {
        ao.delta(4280756010L);
        ao.delta(4285624698L);
        ao.delta(4294967295L);
        ao.delta(4294243573L);
        ao.delta(4292617766L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v39 */
    /* JADX WARN: Type inference failed for: r13v40, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v53 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v23 */
    public static final void alpha(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z2, Function0 onClick, T.p pVar, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        boolean z10;
        C0585q c0585q;
        T.p pVar2;
        long j5;
        boolean z11;
        float f5;
        T.i iVar;
        int i18;
        int i19;
        C2549i c2549i;
        a aVar;
        C0585q c0585q2;
        ?? r13;
        long j6;
        long j7;
        long j10;
        int i20;
        T.p pVar3;
        int i21;
        int i22;
        C0366t charlie;
        C0366t charlie2;
        C0366t charlie3;
        Intrinsics.echo(onClick, "onClick");
        C0585q c0585q3 = (C0585q) interfaceC0581m;
        c0585q3.silver(1472529228);
        if (c0585q3.golf(str)) {
            i5 = 4;
        } else {
            i5 = 2;
        }
        int i23 = i4 | i5;
        if (c0585q3.golf(str2)) {
            i10 = 32;
        } else {
            i10 = 16;
        }
        int i24 = i23 | i10;
        if (c0585q3.golf(str3)) {
            i11 = Barcode.FORMAT_QR_CODE;
        } else {
            i11 = 128;
        }
        int i25 = i24 | i11;
        if (c0585q3.golf(str4)) {
            i12 = 2048;
        } else {
            i12 = Barcode.FORMAT_UPC_E;
        }
        int i26 = i25 | i12;
        if (c0585q3.golf(str5)) {
            i13 = Http2.INITIAL_MAX_FRAME_SIZE;
        } else {
            i13 = 8192;
        }
        int i27 = i26 | i13;
        if (c0585q3.golf(str6)) {
            i14 = 131072;
        } else {
            i14 = 65536;
        }
        int i28 = i27 | i14;
        if (c0585q3.golf(str7)) {
            i15 = 1048576;
        } else {
            i15 = 524288;
        }
        int i29 = i28 | i15;
        if (c0585q3.hotel(z2)) {
            i16 = 8388608;
        } else {
            i16 = 4194304;
        }
        int i30 = i29 | i16;
        if (c0585q3.india(onClick)) {
            i17 = 67108864;
        } else {
            i17 = 33554432;
        }
        int i31 = i30 | i17 | 805306368;
        if ((i31 & 306783379) != 306783378) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (c0585q3.magenta(i31 & 1, z10)) {
            T.p pVar4 = T.p.alpha;
            a bravo = bravo(str2);
            if (str3 != null) {
                charlie(str3);
            }
            if (str3 != null) {
                charlie(str3);
            }
            if (str4 != null) {
                charlie(str4);
            }
            if (z2) {
                j5 = alpha;
            } else {
                j5 = C0366t.echo;
            }
            long j11 = j5;
            s charlie4 = V.charlie(pVar4, 1.0f);
            an anVar = ao.alpha;
            s bravo2 = androidx.compose.foundation.a.bravo(charlie4, j11, anVar);
            if ((i31 & 234881024) == 67108864) {
                z11 = true;
            } else {
                z11 = false;
            }
            Object jade = c0585q3.jade();
            if (z11 || jade == C0580l.alpha) {
                jade = new Bb.a(onClick, 2);
                c0585q3.f(jade);
            }
            float f10 = 12;
            s tango = AbstractC0538d.tango(androidx.compose.foundation.a.echo(15, bravo2, null, (Function0) jade, false), 16, f10);
            C0537c c0537c = AbstractC0542h.charlie;
            T.i iVar2 = T.d.f2062f;
            C0554u alpha2 = AbstractC0553t.alpha(c0537c, iVar2, c0585q3, 0);
            long j12 = c0585q3.magenta;
            int i32 = (int) (j12 ^ (j12 >>> 32));
            I mike = c0585q3.mike();
            s charlie5 = T.a.charlie(tango, c0585q3);
            InterfaceC2552l.maroon.getClass();
            C2550j c2550j = C2551k.bravo;
            c0585q3.white();
            if (c0585q3.lime) {
                c0585q3.lima(c2550j);
            } else {
                c0585q3.i();
            }
            C2549i c2549i2 = C2551k.foxtrot;
            C0564b.blue(c2549i2, c0585q3, alpha2);
            C2549i c2549i3 = C2551k.echo;
            C0564b.blue(c2549i3, c0585q3, mike);
            C2549i c2549i4 = C2551k.golf;
            if (c0585q3.lime || !Intrinsics.areEqual(c0585q3.jade(), Integer.valueOf(i32))) {
                ad.blue(i32, c0585q3, i32, c2549i4);
            }
            C2549i c2549i5 = C2551k.delta;
            C0564b.blue(c2549i5, c0585q3, charlie5);
            S alpha3 = Q.alpha(AbstractC0542h.golf(f10), T.d.f2060c, c0585q3, 54);
            long j13 = c0585q3.magenta;
            int i33 = (int) (j13 ^ (j13 >>> 32));
            I mike2 = c0585q3.mike();
            s charlie6 = T.a.charlie(pVar4, c0585q3);
            c0585q3.white();
            if (c0585q3.lime) {
                c0585q3.lima(c2550j);
            } else {
                c0585q3.i();
            }
            C0564b.blue(c2549i2, c0585q3, alpha3);
            C0564b.blue(c2549i3, c0585q3, mike2);
            if (c0585q3.lime || !Intrinsics.areEqual(c0585q3.jade(), Integer.valueOf(i33))) {
                ad.blue(i33, c0585q3, i33, c2549i4);
            }
            C0564b.blue(c2549i5, c0585q3, charlie6);
            float f11 = 8;
            s bravo3 = androidx.compose.foundation.a.bravo(AbstractC3087z.alpha(V.kilo(pVar4, 60), AbstractC2094g.bravo(f11)), ao.delta(4293257195L), anVar);
            ap delta = AbstractC0547m.delta(T.d.alpha, false);
            long j14 = c0585q3.magenta;
            int i34 = (int) (j14 ^ (j14 >>> 32));
            I mike3 = c0585q3.mike();
            s charlie7 = T.a.charlie(bravo3, c0585q3);
            c0585q3.white();
            if (c0585q3.lime) {
                c0585q3.lima(c2550j);
            } else {
                c0585q3.i();
            }
            C0564b.blue(c2549i2, c0585q3, delta);
            C0564b.blue(c2549i3, c0585q3, mike3);
            if (c0585q3.lime || !Intrinsics.areEqual(c0585q3.jade(), Integer.valueOf(i34))) {
                ad.blue(i34, c0585q3, i34, c2549i4);
            }
            C0564b.blue(c2549i5, c0585q3, charlie7);
            if (str6 == null) {
                c0585q3.purple(1677306340);
                c0585q3.quebec(false);
                c0585q2 = c0585q3;
                iVar = iVar2;
                i19 = 54;
                f5 = 1.0f;
                i18 = 12;
                c2549i = c2549i4;
                aVar = bravo;
            } else {
                c0585q3.purple(1677306341);
                f5 = 1.0f;
                iVar = iVar2;
                i18 = 12;
                i19 = 54;
                c2549i = c2549i4;
                aVar = bravo;
                W3.alpha(N2.p.juliet(str6, c0585q3, 0), null, V.charlie, null, C2391j.foxtrot, 0.0f, null, c0585q3, 25008, 104);
                c0585q2 = c0585q3;
                c0585q2.quebec(false);
            }
            c0585q2.quebec(true);
            s maroon = P0.maroon(f5);
            C0554u alpha4 = AbstractC0553t.alpha(AbstractC0542h.golf(6), iVar, c0585q2, 6);
            long j15 = c0585q2.magenta;
            int i35 = (int) (j15 ^ (j15 >>> 32));
            I mike4 = c0585q2.mike();
            s charlie8 = T.a.charlie(maroon, c0585q2);
            c0585q2.white();
            if (c0585q2.lime) {
                c0585q2.lima(c2550j);
            } else {
                c0585q2.i();
            }
            C0564b.blue(c2549i2, c0585q2, alpha4);
            C0564b.blue(c2549i3, c0585q2, mike4);
            if (c0585q2.lime || !Intrinsics.areEqual(c0585q2.jade(), Integer.valueOf(i35))) {
                ad.blue(i35, c0585q2, i35, c2549i);
            }
            C0564b.blue(c2549i5, c0585q2, charlie8);
            s charlie9 = V.charlie(pVar4, f5);
            T.j jVar = T.d.f2061d;
            S alpha5 = Q.alpha(AbstractC0542h.golf, jVar, c0585q2, i19);
            long j16 = c0585q2.magenta;
            int i36 = (int) (j16 ^ (j16 >>> 32));
            I mike5 = c0585q2.mike();
            s charlie10 = T.a.charlie(charlie9, c0585q2);
            c0585q2.white();
            if (c0585q2.lime) {
                c0585q2.lima(c2550j);
            } else {
                c0585q2.i();
            }
            C0564b.blue(c2549i2, c0585q2, alpha5);
            C0564b.blue(c2549i3, c0585q2, mike5);
            if (c0585q2.lime || !Intrinsics.areEqual(c0585q2.jade(), Integer.valueOf(i36))) {
                ad.blue(i36, c0585q2, i36, c2549i);
            }
            C0564b.blue(c2549i5, c0585q2, charlie10);
            C0585q c0585q4 = c0585q2;
            ak.bravo(str, P0.maroon(1.0f), ao.delta(4280756010L), AbstractC2636d7.charlie(14), new v(700), new H0.n(ArraysKt.sierra(new H0.i[]{AbstractC2715m5.alpha(R.font.circularstd, null, 0, 14)})), 0L, null, 0L, 2, false, 2, 0, null, null, c0585q4, (i31 & 14) | 1772928, 3120, 120720);
            AbstractC0538d.echo(V.oscar(pVar4, f11), c0585q4);
            float f12 = 4;
            S alpha6 = Q.alpha(AbstractC0542h.golf(f12), jVar, c0585q4, 54);
            long j17 = c0585q4.magenta;
            int i37 = (int) (j17 ^ (j17 >>> 32));
            I mike6 = c0585q4.mike();
            s charlie11 = T.a.charlie(pVar4, c0585q4);
            c0585q4.white();
            if (c0585q4.lime) {
                c0585q4.lima(c2550j);
            } else {
                c0585q4.i();
            }
            C0564b.blue(c2549i2, c0585q4, alpha6);
            C0564b.blue(c2549i3, c0585q4, mike6);
            if (c0585q4.lime || !Intrinsics.areEqual(c0585q4.jade(), Integer.valueOf(i37))) {
                ad.blue(i37, c0585q4, i37, c2549i);
            }
            C0564b.blue(c2549i5, c0585q4, charlie11);
            if (z2) {
                c0585q4.purple(354284160);
                r13 = 0;
                AbstractC0547m.alpha(androidx.compose.foundation.a.bravo(V.kilo(pVar4, f11), ao.delta(4292617766L), AbstractC2094g.alpha), c0585q4, 0);
            } else {
                r13 = 0;
                c0585q4.purple(348594606);
            }
            c0585q4.quebec(r13);
            long charlie12 = AbstractC2636d7.charlie(i18);
            H0.i[] iVarArr = new H0.i[1];
            iVarArr[r13] = AbstractC2715m5.alpha(R.font.circularstd, null, r13, 14);
            ak.bravo(str7, null, ao.delta(4285624698L), charlie12, new v(HttpConstants.HTTP_BLOCKED), new H0.n(ArraysKt.sierra(iVarArr)), 0L, null, 0L, 0, false, 0, 0, null, null, c0585q4, ((i31 >> 18) & 14) | 1772928, 0, 130962);
            C0585q c0585q5 = c0585q4;
            c0585q5.quebec(true);
            c0585q5.quebec(true);
            if (str2 == null) {
                c0585q5.purple(1333968929);
                c0585q5.quebec(false);
                pVar3 = pVar4;
                i21 = 1;
                i22 = 0;
                i20 = 14;
            } else {
                c0585q5.purple(1333968930);
                if (str3 != null && (charlie3 = charlie(str3)) != null) {
                    j6 = charlie3.alpha;
                } else {
                    j6 = aVar.alpha;
                }
                if (str4 != null && (charlie2 = charlie(str4)) != null) {
                    j7 = charlie2.alpha;
                } else {
                    j7 = aVar.bravo;
                }
                if (str4 != null && (charlie = charlie(str4)) != null) {
                    j10 = charlie.alpha;
                } else {
                    j10 = aVar.charlie;
                }
                long j18 = j10;
                float f13 = 100;
                s tango2 = AbstractC0538d.tango(androidx.compose.foundation.a.bravo(R3.charlie(V.tango(pVar4, 3), 1, j7, AbstractC2094g.bravo(f13)), j6, AbstractC2094g.bravo(f13)), f11, f12);
                ap delta2 = AbstractC0547m.delta(T.d.teal, false);
                long j19 = c0585q5.magenta;
                int i38 = (int) (j19 ^ (j19 >>> 32));
                I mike7 = c0585q5.mike();
                s charlie13 = T.a.charlie(tango2, c0585q5);
                c0585q5.white();
                if (c0585q5.lime) {
                    c0585q5.lima(c2550j);
                } else {
                    c0585q5.i();
                }
                C0564b.blue(c2549i2, c0585q5, delta2);
                C0564b.blue(c2549i3, c0585q5, mike7);
                if (c0585q5.lime || !Intrinsics.areEqual(c0585q5.jade(), Integer.valueOf(i38))) {
                    ad.blue(i38, c0585q5, i38, c2549i);
                }
                C0564b.blue(c2549i5, c0585q5, charlie13);
                i20 = 14;
                pVar3 = pVar4;
                ak.bravo(str2, null, j18, AbstractC2636d7.charlie(i18), new v(700), new H0.n(ArraysKt.sierra(new H0.i[]{AbstractC2715m5.alpha(R.font.circularstd, null, 0, 14)})), 0L, null, 0L, 0, false, 1, 0, null, null, c0585q5, 1772544, 3456, 118674);
                c0585q5 = c0585q5;
                i21 = 1;
                c0585q5.quebec(true);
                i22 = 0;
                c0585q5.quebec(false);
            }
            long charlie14 = AbstractC2636d7.charlie(i20);
            int i39 = i20;
            H0.i[] iVarArr2 = new H0.i[i21];
            iVarArr2[i22] = AbstractC2715m5.alpha(R.font.circularstd, null, i22, i39);
            C0585q c0585q6 = c0585q5;
            ak.bravo(str5, null, ao.delta(4280756010L), charlie14, new v(HttpConstants.HTTP_BLOCKED), new H0.n(ArraysKt.sierra(iVarArr2)), 0L, null, 0L, 2, false, 2, 0, null, null, c0585q6, ((i31 >> 12) & i39) | 1772928, 3120, 120722);
            c0585q = c0585q6;
            z.papa(c0585q, i21, i21, i21);
            pVar2 = pVar3;
        } else {
            c0585q = c0585q3;
            c0585q.ochre();
            pVar2 = pVar;
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new e(str, str2, str3, str4, str5, str6, str7, z2, onClick, pVar2, i4, 0);
        }
    }

    public static final a bravo(String str) {
        if (str != null) {
            switch (str.hashCode()) {
                case -1933443991:
                    if (str.equals("Financial")) {
                        return new a(ao.delta(4293916415L), ao.delta(4280640491L), ao.delta(4280640491L));
                    }
                    break;
                case -1898802862:
                    if (str.equals("Policy")) {
                        return new a(ao.delta(4294963698L), ao.delta(4292943176L), ao.delta(4292943176L));
                    }
                    break;
                case -1819471791:
                    if (str.equals("Shifts")) {
                        return new a(ao.delta(4294966251L), ao.delta(4292441862L), ao.delta(4292441862L));
                    }
                    break;
                case -725839295:
                    if (str.equals("Pointings")) {
                        return new a(ao.delta(4294965229L), ao.delta(4293548044L), ao.delta(4293548044L));
                    }
                    break;
                case 64368639:
                    if (str.equals("Bonus")) {
                        return new a(ao.delta(4293983732L), ao.delta(4279673674L), ao.delta(4279673674L));
                    }
                    break;
                case 187480080:
                    if (str.equals("Performance")) {
                        return new a(ao.delta(4294308863L), ao.delta(4286331629L), ao.delta(4286331629L));
                    }
                    break;
                case 1584505032:
                    if (str.equals("General")) {
                        return new a(ao.delta(4294965229L), ao.delta(4293548044L), ao.delta(4293548044L));
                    }
                    break;
            }
        }
        return new a(ao.delta(4294243573L), ao.delta(4292138200L), ao.delta(4285624698L));
    }

    public static final C0366t charlie(String str) {
        try {
            if (!r.quebec(str, "0x", false) && !r.quebec(str, "0X", false)) {
                if (r.quebec(str, "#", false)) {
                    return new C0366t(ao.charlie(Color.parseColor(str)));
                }
                return null;
            }
            return new C0366t(ao.charlie((int) Long.decode(str).longValue()));
        } catch (Exception unused) {
            return null;
        }
    }
}
