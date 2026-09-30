package s6;

import a0.C0366t;
import androidx.compose.foundation.BorderModifierNodeElement;
import androidx.compose.foundation.layout.AbstractC0538d;
import androidx.compose.foundation.layout.AbstractC0542h;
import androidx.compose.foundation.layout.AbstractC0547m;
import androidx.compose.foundation.layout.AbstractC0553t;
import androidx.compose.foundation.layout.C0537c;
import androidx.compose.foundation.layout.C0540f;
import androidx.compose.foundation.layout.C0554u;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import b.ab;
import cb.AbstractC0836a;
import cb.C0838c;
import cb.EnumC0839d;
import com.google.mlkit.vision.barcode.common.Barcode;
import delivery.samurai.android.R;
import h.AbstractC1797a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import m.AbstractC2094g;
import m.C2093f;
import ob.AbstractC2210c;
import ob.C2211d;
import s0.C2549i;
import s0.C2551k;
import s0.InterfaceC2552l;
import s6.X4;
import t6.AbstractC3086y3;

/* loaded from: classes2.dex */
public abstract class X4 {
    public static final /* synthetic */ int alpha = 0;

    /* JADX WARN: Removed duplicated region for block: B:105:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x03e6  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x04d3  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x092f  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x04ae  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x0232  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void alpha(final C0838c data, final Function0 function0, final Function0 function02, final Function0 function03, final T.s sVar, final Xd.l lVar, Function0 function04, Function0 function05, Function0 function06, final P.d dVar, boolean z2, P.d dVar2, final P.d dVar3, final P.d dVar4, final boolean z10, b.ab abVar, InterfaceC0581m interfaceC0581m, final int i4, final int i5, final int i10) {
        int i11;
        Function0 function07;
        int i12;
        int i13;
        int i14;
        C0585q c0585q;
        Function0 function08;
        final Function0 function09;
        final boolean z11;
        final b.ab abVar2;
        final Function0 function010;
        Function0 function011;
        boolean z12;
        long j5;
        EnumC0839d enumC0839d;
        Function0 function012;
        long j6;
        boolean z13;
        Function0 function013;
        b.ab abVar3;
        float f5;
        float f10;
        int romeo;
        C2549i c2549i;
        int romeo2;
        int romeo3;
        Function0 function014;
        EnumC0839d enumC0839d2;
        Function0 function015;
        EnumC0839d enumC0839d3;
        T.p pVar;
        C2549i c2549i2;
        C2549i c2549i3;
        T.i iVar;
        Function0 function016;
        boolean z14;
        boolean z15;
        int i15;
        Function0 function017;
        Function0 function018;
        T.p pVar2;
        int i16;
        T.s charlie;
        T.s charlie2;
        T.s charlie3;
        T.s charlie4;
        int i17;
        boolean z16;
        float f11;
        long j7;
        final P.d dVar5 = dVar2;
        Intrinsics.echo(data, "data");
        C0585q c0585q2 = (C0585q) interfaceC0581m;
        c0585q2.silver(-1788405859);
        if ((i4 & 6) == 0) {
            i11 = i4 | (c0585q2.india(data) ? 4 : 2);
        } else {
            i11 = i4;
        }
        if ((i4 & 48) == 0) {
            i11 |= c0585q2.india(function0) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i11 |= c0585q2.india(function02) ? 256 : 128;
        }
        if ((i4 & 3072) == 0) {
            i11 |= c0585q2.india(function03) ? 2048 : 1024;
        }
        if ((i4 & 24576) == 0) {
            i11 |= c0585q2.golf(sVar) ? 16384 : 8192;
        }
        int i18 = i11 | 1769472;
        if ((i4 & 12582912) == 0) {
            i18 |= c0585q2.india(lVar) ? 8388608 : 4194304;
        }
        int i19 = i10 & Barcode.FORMAT_QR_CODE;
        if (i19 != 0) {
            i18 |= 100663296;
        } else if ((i4 & 100663296) == 0) {
            i18 |= c0585q2.india(function04) ? 67108864 : 33554432;
        }
        int i20 = i10 & 512;
        if (i20 != 0) {
            i18 |= 805306368;
        } else if ((i4 & 805306368) == 0) {
            i18 |= c0585q2.india(function05) ? 536870912 : 268435456;
        }
        int i21 = i18;
        int i22 = i10 & Barcode.FORMAT_UPC_E;
        if (i22 != 0) {
            i12 = i5 | 6;
            function07 = function06;
        } else {
            function07 = function06;
            i12 = i5 | (c0585q2.india(function07) ? 4 : 2);
        }
        int i23 = i12;
        int i24 = i10 & 4096;
        if (i24 != 0) {
            i13 = i23 | 384;
        } else {
            i13 = i23 | (c0585q2.hotel(z2) ? Barcode.FORMAT_QR_CODE : 128);
        }
        int i25 = i13 | (c0585q2.india(dVar5) ? 2048 : Barcode.FORMAT_UPC_E) | (c0585q2.india(dVar3) ? 16384 : 8192);
        if ((i5 & 1572864) == 0) {
            i25 |= c0585q2.india(dVar4) ? 1048576 : 524288;
        }
        int i26 = i25 | (c0585q2.hotel(z10) ? 8388608 : 4194304);
        int i27 = i10 & 262144;
        if (i27 != 0) {
            i14 = i26 | 100663296;
        } else {
            i14 = i26 | (c0585q2.golf(abVar) ? 67108864 : 33554432);
        }
        int i28 = i14;
        if (c0585q2.magenta(i21 & 1, ((i21 & 306783379) == 306783378 && (i28 & 38282387) == 38282386) ? false : true)) {
            Object obj = C0580l.alpha;
            Function0 function019 = i19 != 0 ? null : function04;
            Function0 function020 = i20 != 0 ? null : function05;
            if (i22 != 0) {
                function07 = null;
            }
            boolean z17 = i24 != 0 ? false : z2;
            b.ab abVar4 = i27 != 0 ? null : abVar;
            EnumC0839d enumC0839d4 = EnumC0839d.alpha;
            EnumC0839d enumC0839d5 = data.delta;
            boolean z18 = enumC0839d5 == enumC0839d4;
            EnumC0839d enumC0839d6 = EnumC0839d.red;
            boolean z19 = enumC0839d5 == enumC0839d6;
            if (z18) {
                function011 = function019;
                c0585q2.purple(-671037521);
                c0585q2.quebec(false);
                float f12 = C2211d.bravo;
                j5 = Db.c.jade;
            } else {
                function011 = function019;
                if (z19) {
                    c0585q2.purple(-671035571);
                    c0585q2.quebec(false);
                    float f13 = C2211d.bravo;
                    j5 = AbstractC2210c.alpha;
                } else {
                    c0585q2.purple(-671033692);
                    z12 = z18;
                    j5 = ((F.O) c0585q2.kilo(F.Q.alpha)).papa;
                    c0585q2.quebec(false);
                    long j10 = j5;
                    if (!z12) {
                        enumC0839d = enumC0839d6;
                        c0585q2.purple(-671030835);
                        function012 = function07;
                        j6 = ((F.O) c0585q2.kilo(F.Q.alpha)).sierra;
                        z13 = false;
                    } else {
                        enumC0839d = enumC0839d6;
                        function012 = function07;
                        c0585q2.purple(-671029306);
                        j6 = ((F.O) c0585q2.kilo(F.Q.alpha)).quebec;
                        z13 = false;
                    }
                    c0585q2.quebec(z13);
                    long j11 = j6;
                    if (abVar4 != null) {
                        float f14 = C2211d.bravo;
                        if (z19) {
                            f11 = C2211d.bravo;
                        } else {
                            f11 = C2211d.echo;
                        }
                        float f15 = C2211d.bravo;
                        if (z19) {
                            j7 = AbstractC2210c.golf;
                        } else {
                            j7 = Db.c.azure;
                        }
                        function013 = function020;
                        abVar3 = t6.S3.alpha(f11, j7);
                    } else {
                        function013 = function020;
                        abVar3 = abVar4;
                    }
                    float f16 = C2211d.bravo;
                    if (!z19) {
                        f5 = C2211d.golf;
                    } else {
                        f5 = C2211d.foxtrot;
                    }
                    float f17 = C2211d.bravo;
                    if (!z19) {
                        f10 = C2211d.hotel;
                    } else {
                        f10 = C2211d.foxtrot;
                    }
                    T.s uniform = AbstractC0538d.uniform(androidx.compose.foundation.layout.V.charlie(sVar, 1.0f), 0.0f, ob.o.alpha / 2, 1);
                    float f18 = C2211d.bravo;
                    float f19 = C2211d.delta;
                    float f20 = C2211d.charlie;
                    C2093f bravo = AbstractC2094g.bravo(f20);
                    long j12 = C2211d.alpha;
                    T.s tango = AbstractC0538d.tango(androidx.compose.foundation.a.bravo(t6.ac.alpha(uniform, f19, bravo, j12, j12, 4).then(new BorderModifierNodeElement(abVar3.alpha, abVar3.bravo, AbstractC2094g.bravo(f20))), j10, AbstractC2094g.bravo(f20)), f10, f5);
                    q0.ap delta = AbstractC0547m.delta(T.d.alpha, false);
                    romeo = C0564b.romeo(c0585q2);
                    androidx.compose.runtime.I mike = c0585q2.mike();
                    T.s charlie5 = T.a.charlie(tango, c0585q2);
                    InterfaceC2552l.maroon.getClass();
                    Function0 function021 = C2551k.bravo;
                    c0585q2.white();
                    if (!c0585q2.lime) {
                        c0585q2.lima(function021);
                    } else {
                        c0585q2.i();
                    }
                    C2549i c2549i4 = C2551k.foxtrot;
                    C0564b.blue(c2549i4, c0585q2, delta);
                    C2549i c2549i5 = C2551k.echo;
                    C0564b.blue(c2549i5, c0585q2, mike);
                    c2549i = C2551k.golf;
                    if (!c0585q2.lime || !Intrinsics.areEqual(c0585q2.jade(), Integer.valueOf(romeo))) {
                        ao.ad.blue(romeo, c0585q2, romeo, c2549i);
                    }
                    C2549i c2549i6 = C2551k.delta;
                    C0564b.blue(c2549i6, c0585q2, charlie5);
                    T.p pVar3 = T.p.alpha;
                    T.s charlie6 = androidx.compose.foundation.layout.V.charlie(pVar3, 1.0f);
                    C0537c c0537c = AbstractC0542h.alpha;
                    C0540f golf = AbstractC0542h.golf(C2211d.india);
                    T.i iVar2 = T.d.f2062f;
                    C0554u alpha2 = AbstractC0553t.alpha(golf, iVar2, c0585q2, 6);
                    romeo2 = C0564b.romeo(c0585q2);
                    androidx.compose.runtime.I mike2 = c0585q2.mike();
                    T.s charlie7 = T.a.charlie(charlie6, c0585q2);
                    c0585q2.white();
                    if (!c0585q2.lime) {
                        c0585q2.lima(function021);
                    } else {
                        c0585q2.i();
                    }
                    C0564b.blue(c2549i4, c0585q2, alpha2);
                    C0564b.blue(c2549i5, c0585q2, mike2);
                    if (!c0585q2.lime || !Intrinsics.areEqual(c0585q2.jade(), Integer.valueOf(romeo2))) {
                        ao.ad.blue(romeo2, c0585q2, romeo2, c2549i);
                    }
                    C0564b.blue(c2549i6, c0585q2, charlie7);
                    T.s charlie8 = androidx.compose.foundation.layout.V.charlie(pVar3, 1.0f);
                    C0554u alpha3 = AbstractC0553t.alpha(AbstractC0542h.golf(C2211d.juliet), iVar2, c0585q2, 6);
                    romeo3 = C0564b.romeo(c0585q2);
                    androidx.compose.runtime.I mike3 = c0585q2.mike();
                    T.s charlie9 = T.a.charlie(charlie8, c0585q2);
                    c0585q2.white();
                    if (!c0585q2.lime) {
                        c0585q2.lima(function021);
                    } else {
                        c0585q2.i();
                    }
                    C0564b.blue(c2549i4, c0585q2, alpha3);
                    C0564b.blue(c2549i5, c0585q2, mike3);
                    if (!c0585q2.lime || !Intrinsics.areEqual(c0585q2.jade(), Integer.valueOf(romeo3))) {
                        ao.ad.blue(romeo3, c0585q2, romeo3, c2549i);
                    }
                    C0564b.blue(c2549i6, c0585q2, charlie9);
                    int i29 = i28 >> 9;
                    AbstractC2787u6.blue(data.alpha, j11, null, 0, data.romeo, data.echo, data.foxtrot, data.juliet, data.kilo, dVar4, data.bravo, dVar, c0585q2, 0, (i29 & 7168) | 196608);
                    C0585q c0585q3 = c0585q2;
                    if (z10) {
                        c0585q3.purple(1267979445);
                        String str = data.lima;
                        if (str == null) {
                            c0585q3.purple(1267992402);
                            c0585q3.quebec(false);
                            z16 = false;
                        } else {
                            c0585q3.purple(1267992403);
                            M6.alpha(str, j11, androidx.compose.foundation.layout.V.charlie(pVar3, 1.0f), new C0366t(AbstractC2210c.alpha), c0585q3, 384);
                            z16 = false;
                            c0585q3.quebec(false);
                        }
                        if (function02 != null) {
                            c0585q3.purple(1268392644);
                            function014 = function011;
                            enumC0839d2 = enumC0839d;
                            function015 = function012;
                            enumC0839d3 = enumC0839d5;
                            pVar = pVar3;
                            c2549i2 = c2549i;
                            iVar = iVar2;
                            c2549i3 = c2549i6;
                            z15 = z16;
                            function016 = function013;
                            z14 = true;
                            i15 = 6;
                            H5.alpha(data.charlie, j11, null, function02, c0585q3, (i21 << 3) & 7168);
                            c0585q3 = c0585q3;
                        } else {
                            function014 = function011;
                            enumC0839d2 = enumC0839d;
                            function015 = function012;
                            enumC0839d3 = enumC0839d5;
                            z15 = z16;
                            pVar = pVar3;
                            c2549i2 = c2549i;
                            c2549i3 = c2549i6;
                            iVar = iVar2;
                            function016 = function013;
                            z14 = true;
                            i15 = 6;
                            c0585q3.purple(1259423383);
                        }
                        c0585q3.quebec(z15);
                        if (dVar3 != null) {
                            c0585q3.purple(1268719756);
                            androidx.appcompat.widget.P0.indigo((i28 >> 12) & 14, dVar3, c0585q3, z15);
                        } else {
                            c0585q3.purple(1259423383);
                            c0585q3.quebec(z15);
                        }
                        if (function03 != null) {
                            c0585q3.purple(1268844748);
                            F5.alpha(j11, function03, null, c0585q3, (i21 >> 6) & 112);
                        } else {
                            c0585q3.purple(1259423383);
                        }
                        c0585q3.quebec(z15);
                    } else {
                        function014 = function011;
                        enumC0839d2 = enumC0839d;
                        function015 = function012;
                        enumC0839d3 = enumC0839d5;
                        pVar = pVar3;
                        c2549i2 = c2549i;
                        c2549i3 = c2549i6;
                        iVar = iVar2;
                        function016 = function013;
                        z14 = true;
                        z15 = false;
                        i15 = 6;
                        c0585q3.purple(1259423383);
                    }
                    c0585q3.quebec(z15);
                    c0585q3.quebec(z14);
                    if (z10) {
                        c0585q3.purple(2068185169);
                        boolean z20 = (enumC0839d3 != enumC0839d2 || (data.india == null && data.golf.isEmpty() && data.hotel.isEmpty())) ? z15 ? 1 : 0 : z14;
                        if (data.india == null && data.hotel.isEmpty() && data.golf.isEmpty()) {
                            c0585q3.purple(-320627199);
                            c0585q3.quebec(z15);
                            pVar2 = pVar;
                        } else {
                            c0585q3.purple(-310476249);
                            pVar2 = pVar;
                            B6.alpha(data.hotel, null, data.golf, z20, AbstractC0836a.echo, j11, androidx.compose.foundation.layout.V.charlie(pVar2, 1.0f), data.india, lVar, c0585q3, ((i21 << 3) & 234881024) | 1597440);
                            c0585q3.quebec(z15);
                        }
                        if (!data.quebec.isEmpty()) {
                            c0585q3.purple(-309839881);
                            Z4.alpha(data.quebec, androidx.compose.foundation.layout.V.charlie(pVar2, 1.0f), c0585q3, 432);
                        } else {
                            c0585q3.purple(-320627199);
                        }
                        c0585q3.quebec(z15);
                        T.j jVar = T.d.f2060c;
                        if (data.sierra) {
                            c0585q3.purple(-309485892);
                            if (z17) {
                                c0585q3.purple(-309490666);
                                T.s charlie10 = androidx.compose.foundation.layout.V.charlie(pVar2, 1.0f);
                                androidx.compose.foundation.layout.S alpha4 = androidx.compose.foundation.layout.Q.alpha(AbstractC0542h.golf(ob.m.echo), jVar, c0585q3, i15);
                                int romeo4 = C0564b.romeo(c0585q3);
                                androidx.compose.runtime.I mike4 = c0585q3.mike();
                                T.s charlie11 = T.a.charlie(charlie10, c0585q3);
                                c0585q3.white();
                                if (c0585q3.lime) {
                                    c0585q3.lima(function021);
                                } else {
                                    c0585q3.i();
                                }
                                C0564b.blue(c2549i4, c0585q3, alpha4);
                                C0564b.blue(c2549i5, c0585q3, mike4);
                                if (c0585q3.lime || !Intrinsics.areEqual(c0585q3.jade(), Integer.valueOf(romeo4))) {
                                    ao.ad.blue(romeo4, c0585q3, romeo4, c2549i2);
                                }
                                C0564b.blue(c2549i3, c0585q3, charlie11);
                                if (data.tango) {
                                    c0585q3.purple(-1311094464);
                                    t6.S2.alpha(z15 ? 1 : 0, androidx.appcompat.widget.P0.maroon(1.0f), c0585q3, AbstractC3086y3.bravo(c0585q3, R.string.invoice));
                                    c0585q3.quebec(z15);
                                    i17 = -1322519762;
                                } else {
                                    i17 = -1322519762;
                                    c0585q3.purple(-1322519762);
                                    c0585q3.quebec(z15);
                                }
                                if (data.uniform) {
                                    c0585q3.purple(-1310764872);
                                    t6.S2.alpha(z15 ? 1 : 0, androidx.appcompat.widget.P0.maroon(1.0f), c0585q3, AbstractC3086y3.bravo(c0585q3, R.string.proof_of_pickup));
                                } else {
                                    c0585q3.purple(i17);
                                }
                                c0585q3.quebec(z15);
                                c0585q3.quebec(true);
                                c0585q3.quebec(z15);
                                function08 = function014;
                                function017 = function016;
                            } else {
                                c0585q3.purple(-308510074);
                                T.s charlie12 = androidx.compose.foundation.layout.V.charlie(pVar2, 1.0f);
                                androidx.compose.foundation.layout.S alpha5 = androidx.compose.foundation.layout.Q.alpha(AbstractC0542h.golf(ob.m.echo), jVar, c0585q3, 6);
                                int romeo5 = C0564b.romeo(c0585q3);
                                androidx.compose.runtime.I mike5 = c0585q3.mike();
                                T.s charlie13 = T.a.charlie(charlie12, c0585q3);
                                c0585q3.white();
                                if (c0585q3.lime) {
                                    c0585q3.lima(function021);
                                } else {
                                    c0585q3.i();
                                }
                                C0564b.blue(C2551k.charlie(), c0585q3, alpha5);
                                C0564b.blue(C2551k.echo(), c0585q3, mike5);
                                C2549i bravo2 = C2551k.bravo();
                                if (c0585q3.blue() || !Intrinsics.areEqual(c0585q3.jade(), Integer.valueOf(romeo5))) {
                                    ao.ad.blue(romeo5, c0585q3, romeo5, bravo2);
                                }
                                C0564b.blue(C2551k.delta(), c0585q3, charlie13);
                                if (data.tango) {
                                    c0585q3.purple(-159227979);
                                    boolean z21 = (i21 & 234881024) == 67108864 ? true : z15 ? 1 : 0;
                                    Object jade = c0585q3.jade();
                                    if (z21 || jade == obj) {
                                        function08 = function014;
                                        jade = new com.checkout.components.ui.country.c(function08, 3);
                                        c0585q3.f(jade);
                                    } else {
                                        function08 = function014;
                                    }
                                    t6.T2.charlie(0, androidx.appcompat.widget.P0.maroon(1.0f), c0585q3, data.xray, (Function0) jade, data.whiskey);
                                } else {
                                    function08 = function014;
                                    c0585q3.purple(-171627049);
                                }
                                c0585q3.tango();
                                if (data.uniform) {
                                    c0585q3.purple(-158749339);
                                    boolean z22 = (i21 & 1879048192) == 536870912 ? true : z15 ? 1 : 0;
                                    Object jade2 = c0585q3.jade();
                                    if (z22 || jade2 == obj) {
                                        function017 = function016;
                                        jade2 = new com.checkout.components.ui.country.c(function017, 4);
                                        c0585q3.f(jade2);
                                    } else {
                                        function017 = function016;
                                    }
                                    t6.T2.alpha(0, androidx.appcompat.widget.P0.maroon(1.0f), c0585q3, data.yankee, AbstractC3086y3.bravo(c0585q3, R.string.proof_of_pickup), (Function0) jade2, data.victor);
                                } else {
                                    function017 = function016;
                                    c0585q3.purple(-171627049);
                                }
                                c0585q3.tango();
                                c0585q3.sierra();
                                c0585q3.tango();
                            }
                        } else {
                            function08 = function014;
                            function017 = function016;
                            c0585q3.purple(-320627199);
                        }
                        c0585q3.tango();
                        if (data.zulu) {
                            c0585q3.purple(-307114733);
                            charlie2 = androidx.compose.foundation.layout.V.charlie(pVar2, 1.0f);
                            float f21 = ob.m.echo;
                            C0554u alpha6 = AbstractC0553t.alpha(AbstractC0542h.golf(f21), iVar, c0585q3, 6);
                            int romeo6 = C0564b.romeo(c0585q3);
                            androidx.compose.runtime.I amber = c0585q3.amber();
                            T.s charlie14 = T.a.charlie(charlie2, c0585q3);
                            Function0 alpha7 = C2551k.alpha();
                            if (com.google.android.material.datepicker.j.romeo(c0585q3.zulu())) {
                                c0585q3.white();
                                if (c0585q3.blue()) {
                                    c0585q3.lima(alpha7);
                                } else {
                                    c0585q3.i();
                                }
                                C0564b.blue(C2551k.charlie(), c0585q3, alpha6);
                                C0564b.blue(C2551k.echo(), c0585q3, amber);
                                C2549i bravo3 = C2551k.bravo();
                                if (c0585q3.blue() || !Intrinsics.areEqual(c0585q3.jade(), Integer.valueOf(romeo6))) {
                                    ao.ad.blue(romeo6, c0585q3, romeo6, bravo3);
                                }
                                C0564b.blue(C2551k.delta(), c0585q3, charlie14);
                                charlie3 = androidx.compose.foundation.layout.V.charlie(pVar2, 1.0f);
                                androidx.compose.foundation.layout.S alpha8 = androidx.compose.foundation.layout.Q.alpha(AbstractC0542h.golf(f21), jVar, c0585q3, 6);
                                int romeo7 = C0564b.romeo(c0585q3);
                                androidx.compose.runtime.I amber2 = c0585q3.amber();
                                T.s charlie15 = T.a.charlie(charlie3, c0585q3);
                                Function0 alpha9 = C2551k.alpha();
                                if (com.google.android.material.datepicker.j.romeo(c0585q3.zulu())) {
                                    c0585q3.white();
                                    if (c0585q3.blue()) {
                                        c0585q3.lima(alpha9);
                                    } else {
                                        c0585q3.i();
                                    }
                                    C0564b.blue(C2551k.charlie(), c0585q3, alpha8);
                                    C0564b.blue(C2551k.echo(), c0585q3, amber2);
                                    C2549i bravo4 = C2551k.bravo();
                                    if (c0585q3.blue() || !Intrinsics.areEqual(c0585q3.jade(), Integer.valueOf(romeo7))) {
                                        ao.ad.blue(romeo7, c0585q3, romeo7, bravo4);
                                    }
                                    C0564b.blue(C2551k.delta(), c0585q3, charlie15);
                                    String str2 = data.beige;
                                    if (str2 == null) {
                                        c0585q3.purple(-1130869566);
                                        str2 = AbstractC3086y3.bravo(c0585q3, R.string.proof_of_delivery);
                                        c0585q3.tango();
                                    } else {
                                        c0585q3.purple(-1130871519);
                                        c0585q3.tango();
                                    }
                                    String str3 = str2;
                                    boolean z23 = data.amber;
                                    String str4 = data.azure;
                                    if ((i28 & 14) == 4) {
                                        z15 = true;
                                    }
                                    Object jade3 = c0585q3.jade();
                                    if (z15 || jade3 == obj) {
                                        function018 = function015;
                                        jade3 = new com.checkout.components.ui.country.c(function018, 5);
                                        c0585q3.f(jade3);
                                    } else {
                                        function018 = function015;
                                    }
                                    Function0 function022 = (Function0) jade3;
                                    if (1.0f <= 0.0d) {
                                        AbstractC1797a.alpha("invalid weight; must be greater than zero");
                                    }
                                    t6.R2.alpha(0, new LayoutWeightElement(1.0f, true), c0585q3, str3, str4, function022, z23);
                                    c0585q3.sierra();
                                    if (data.black.size() > 1) {
                                        c0585q3.purple(-240852405);
                                        charlie4 = androidx.compose.foundation.layout.V.charlie(pVar2, 1.0f);
                                        t6.Q2.alpha(data.black, charlie4, c0585q3, 48);
                                    } else {
                                        c0585q3.purple(-255419770);
                                    }
                                    c0585q3.tango();
                                    c0585q3.sierra();
                                    c0585q3.tango();
                                    i16 = -320627199;
                                } else {
                                    C0564b.tango();
                                    throw null;
                                }
                            } else {
                                C0564b.tango();
                                throw null;
                            }
                        } else {
                            function018 = function015;
                            i16 = -320627199;
                            c0585q3.purple(-320627199);
                            c0585q3.tango();
                        }
                        if (dVar2 != null) {
                            c0585q3.purple(-305729498);
                            Integer valueOf = Integer.valueOf(i29 & 14);
                            dVar5 = dVar2;
                            dVar5.invoke(c0585q3, valueOf);
                        } else {
                            dVar5 = dVar2;
                            c0585q3.purple(i16);
                        }
                        c0585q3.tango();
                        String str5 = data.mike;
                        if (str5 != null) {
                            c0585q3.purple(-305624439);
                            charlie = androidx.compose.foundation.layout.V.charlie(pVar2, 1.0f);
                            C0585q c0585q4 = c0585q3;
                            AbstractC2715m5.bravo(str5, function0, charlie, data.oscar, data.november, !data.oscar, false, c0585q4, (i21 & 112) | 384, 64);
                            c0585q = c0585q4;
                            c0585q.tango();
                        } else {
                            c0585q3.purple(-305624440);
                            c0585q3.tango();
                            c0585q = c0585q3;
                        }
                    } else {
                        dVar5 = dVar2;
                        c0585q = c0585q3;
                        function08 = function014;
                        function017 = function016;
                        function018 = function015;
                        c0585q.purple(-320627199);
                    }
                    c0585q.tango();
                    c0585q.sierra();
                    c0585q.sierra();
                    Function0 function023 = function017;
                    function010 = function018;
                    function09 = function023;
                    z11 = z17;
                    abVar2 = abVar4;
                }
            }
            z12 = z18;
            long j102 = j5;
            if (!z12) {
            }
            c0585q2.quebec(z13);
            long j112 = j6;
            if (abVar4 != null) {
            }
            float f162 = C2211d.bravo;
            if (!z19) {
            }
            float f172 = C2211d.bravo;
            if (!z19) {
            }
            T.s uniform2 = AbstractC0538d.uniform(androidx.compose.foundation.layout.V.charlie(sVar, 1.0f), 0.0f, ob.o.alpha / 2, 1);
            float f182 = C2211d.bravo;
            float f192 = C2211d.delta;
            float f202 = C2211d.charlie;
            C2093f bravo5 = AbstractC2094g.bravo(f202);
            long j122 = C2211d.alpha;
            T.s tango2 = AbstractC0538d.tango(androidx.compose.foundation.a.bravo(t6.ac.alpha(uniform2, f192, bravo5, j122, j122, 4).then(new BorderModifierNodeElement(abVar3.alpha, abVar3.bravo, AbstractC2094g.bravo(f202))), j102, AbstractC2094g.bravo(f202)), f10, f5);
            q0.ap delta2 = AbstractC0547m.delta(T.d.alpha, false);
            romeo = C0564b.romeo(c0585q2);
            androidx.compose.runtime.I mike6 = c0585q2.mike();
            T.s charlie52 = T.a.charlie(tango2, c0585q2);
            InterfaceC2552l.maroon.getClass();
            Function0 function0212 = C2551k.bravo;
            c0585q2.white();
            if (!c0585q2.lime) {
            }
            C2549i c2549i42 = C2551k.foxtrot;
            C0564b.blue(c2549i42, c0585q2, delta2);
            C2549i c2549i52 = C2551k.echo;
            C0564b.blue(c2549i52, c0585q2, mike6);
            c2549i = C2551k.golf;
            if (!c0585q2.lime) {
            }
            ao.ad.blue(romeo, c0585q2, romeo, c2549i);
            C2549i c2549i62 = C2551k.delta;
            C0564b.blue(c2549i62, c0585q2, charlie52);
            T.p pVar32 = T.p.alpha;
            T.s charlie62 = androidx.compose.foundation.layout.V.charlie(pVar32, 1.0f);
            C0537c c0537c2 = AbstractC0542h.alpha;
            C0540f golf2 = AbstractC0542h.golf(C2211d.india);
            T.i iVar22 = T.d.f2062f;
            C0554u alpha22 = AbstractC0553t.alpha(golf2, iVar22, c0585q2, 6);
            romeo2 = C0564b.romeo(c0585q2);
            androidx.compose.runtime.I mike22 = c0585q2.mike();
            T.s charlie72 = T.a.charlie(charlie62, c0585q2);
            c0585q2.white();
            if (!c0585q2.lime) {
            }
            C0564b.blue(c2549i42, c0585q2, alpha22);
            C0564b.blue(c2549i52, c0585q2, mike22);
            if (!c0585q2.lime) {
            }
            ao.ad.blue(romeo2, c0585q2, romeo2, c2549i);
            C0564b.blue(c2549i62, c0585q2, charlie72);
            T.s charlie82 = androidx.compose.foundation.layout.V.charlie(pVar32, 1.0f);
            C0554u alpha32 = AbstractC0553t.alpha(AbstractC0542h.golf(C2211d.juliet), iVar22, c0585q2, 6);
            romeo3 = C0564b.romeo(c0585q2);
            androidx.compose.runtime.I mike32 = c0585q2.mike();
            T.s charlie92 = T.a.charlie(charlie82, c0585q2);
            c0585q2.white();
            if (!c0585q2.lime) {
            }
            C0564b.blue(c2549i42, c0585q2, alpha32);
            C0564b.blue(c2549i52, c0585q2, mike32);
            if (!c0585q2.lime) {
            }
            ao.ad.blue(romeo3, c0585q2, romeo3, c2549i);
            C0564b.blue(c2549i62, c0585q2, charlie92);
            int i292 = i28 >> 9;
            AbstractC2787u6.blue(data.alpha, j112, null, 0, data.romeo, data.echo, data.foxtrot, data.juliet, data.kilo, dVar4, data.bravo, dVar, c0585q2, 0, (i292 & 7168) | 196608);
            C0585q c0585q32 = c0585q2;
            if (z10) {
            }
            c0585q32.quebec(z15);
            c0585q32.quebec(z14);
            if (z10) {
            }
            c0585q.tango();
            c0585q.sierra();
            c0585q.sierra();
            Function0 function0232 = function017;
            function010 = function018;
            function09 = function0232;
            z11 = z17;
            abVar2 = abVar4;
        } else {
            c0585q = c0585q2;
            c0585q.ochre();
            function08 = function04;
            function09 = function05;
            z11 = z2;
            abVar2 = abVar;
            function010 = function07;
        }
        androidx.compose.runtime.Q uniform3 = c0585q.uniform();
        if (uniform3 != null) {
            final Function0 function024 = function08;
            uniform3.delta = new Xd.l() { // from class: hb.a
                @Override // Xd.l
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int cyan = C0564b.cyan(i4 | 1);
                    int cyan2 = C0564b.cyan(i5);
                    ab abVar5 = abVar2;
                    int i30 = i10;
                    X4.alpha(C0838c.this, function0, function02, function03, sVar, lVar, function024, function09, function010, dVar, z11, dVar5, dVar3, dVar4, z10, abVar5, (InterfaceC0581m) obj2, cyan, cyan2, i30);
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
