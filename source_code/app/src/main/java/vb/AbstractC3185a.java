package vb;

import D0.an;
import Db.c;
import F.G1;
import F.G2;
import F.K1;
import F.S2;
import F.T2;
import P.d;
import T.p;
import T.s;
import Xd.l;
import a0.C0366t;
import a0.ao;
import a5.C0405a;
import androidx.compose.foundation.layout.AbstractC0538d;
import androidx.compose.foundation.layout.AbstractC0542h;
import androidx.compose.foundation.layout.AbstractC0547m;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.S;
import androidx.compose.foundation.layout.V;
import androidx.compose.foundation.layout.r;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.I;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.runtime.Q;
import ao.ad;
import com.google.mlkit.vision.barcode.common.Barcode;
import delivery.samurai.android.R;
import h.AbstractC1797a;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import m.AbstractC2094g;
import m.C2093f;
import okhttp3.internal.http2.Http2;
import p3.EnumC2270b;
import p3.ah;
import q0.ap;
import s0.C2549i;
import s0.C2550j;
import s0.C2551k;
import s0.InterfaceC2552l;
import s6.J4;
import t6.AbstractC3071v3;
import t6.AbstractC3087z;
import wb.C3249a;

/* renamed from: vb.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3185a {
    public static final d alpha = new d(new Vc.d(12), 1342652278, false);
    public static final d bravo = new d(new Vc.d(13), -1879556420, false);

    /* JADX WARN: Removed duplicated region for block: B:13:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void alpha(ah state, String str, boolean z2, p pVar, Function0 function0, boolean z10, InterfaceC0581m interfaceC0581m, int i4, int i5) {
        int i10;
        boolean z11;
        int i11;
        int i12;
        int i13;
        Function0 function02;
        int i14;
        int i15;
        boolean z12;
        int i16;
        boolean z13;
        p pVar2;
        boolean z14;
        boolean z15;
        Function0 function03;
        Q uniform;
        boolean z16;
        long j5;
        float f5;
        float f10;
        boolean z17;
        Function0 function04;
        int i17;
        Intrinsics.echo(state, "state");
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(1036727869);
        if ((i4 & 6) == 0) {
            if (c0585q.echo(state.ordinal())) {
                i17 = 4;
            } else {
                i17 = 2;
            }
            i10 = i17 | i4;
        } else {
            i10 = i4;
        }
        int i18 = i5 & 4;
        if (i18 != 0) {
            i10 |= 384;
        } else if ((i4 & 384) == 0) {
            z11 = z2;
            if (c0585q.hotel(z11)) {
                i11 = Barcode.FORMAT_QR_CODE;
            } else {
                i11 = 128;
            }
            i10 |= i11;
            i12 = i10 | 3072;
            i13 = i5 & 16;
            if (i13 == 0) {
                i12 = i10 | 27648;
            } else if ((i4 & 24576) == 0) {
                function02 = function0;
                if (c0585q.india(function02)) {
                    i14 = Http2.INITIAL_MAX_FRAME_SIZE;
                } else {
                    i14 = 8192;
                }
                i12 |= i14;
                i15 = i5 & 32;
                if (i15 != 0) {
                    i12 |= 196608;
                } else if ((196608 & i4) == 0) {
                    z12 = z10;
                    if (c0585q.hotel(z12)) {
                        i16 = 131072;
                    } else {
                        i16 = 65536;
                    }
                    i12 |= i16;
                    if ((74899 & i12) == 74898) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (!c0585q.magenta(i12 & 1, z13)) {
                        if (i18 != 0) {
                            z11 = false;
                        }
                        pVar2 = p.alpha;
                        if (i13 != 0) {
                            function02 = null;
                        }
                        if (i15 != 0) {
                            z16 = false;
                        } else {
                            z16 = z12;
                        }
                        int ordinal = state.ordinal();
                        if (ordinal != 0) {
                            if (ordinal != 1) {
                                if (ordinal == 2) {
                                    j5 = c.delta;
                                } else {
                                    throw new NoWhenBranchMatchedException();
                                }
                            } else {
                                j5 = c.charlie;
                            }
                        } else {
                            j5 = c.echo;
                        }
                        float f11 = 15;
                        s bravo2 = androidx.compose.foundation.a.bravo(V.echo(V.charlie(pVar2, 1.0f), f11), j5, ao.alpha);
                        ap delta = AbstractC0547m.delta(T.d.teal, false);
                        long j6 = c0585q.magenta;
                        int i19 = (int) (j6 ^ (j6 >>> 32));
                        I mike = c0585q.mike();
                        s charlie = T.a.charlie(bravo2, c0585q);
                        InterfaceC2552l.maroon.getClass();
                        C2550j c2550j = C2551k.bravo;
                        c0585q.white();
                        if (c0585q.lime) {
                            c0585q.lima(c2550j);
                        } else {
                            c0585q.i();
                        }
                        C2549i c2549i = C2551k.foxtrot;
                        C0564b.blue(c2549i, c0585q, delta);
                        C2549i c2549i2 = C2551k.echo;
                        C0564b.blue(c2549i2, c0585q, mike);
                        C2549i c2549i3 = C2551k.golf;
                        if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i19))) {
                            ad.blue(i19, c0585q, i19, c2549i3);
                        }
                        C2549i c2549i4 = C2551k.delta;
                        C0564b.blue(c2549i4, c0585q, charlie);
                        float f12 = 4;
                        Function0 function05 = function02;
                        s uniform2 = AbstractC0538d.uniform(V.charlie(pVar2, 1.0f), f12, 0.0f, 2);
                        S alpha2 = androidx.compose.foundation.layout.Q.alpha(AbstractC0542h.echo, T.d.f2061d, c0585q, 54);
                        boolean z18 = z11;
                        int i20 = i12;
                        long j7 = c0585q.magenta;
                        int i21 = (int) (j7 ^ (j7 >>> 32));
                        I mike2 = c0585q.mike();
                        s charlie2 = T.a.charlie(uniform2, c0585q);
                        c0585q.white();
                        if (c0585q.lime) {
                            c0585q.lima(c2550j);
                        } else {
                            c0585q.i();
                        }
                        C0564b.blue(c2549i, c0585q, alpha2);
                        C0564b.blue(c2549i2, c0585q, mike2);
                        if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i21))) {
                            ad.blue(i21, c0585q, i21, c2549i3);
                        }
                        C0564b.blue(c2549i4, c0585q, charlie2);
                        if (z18) {
                            c0585q.purple(1471635890);
                            z17 = false;
                            f5 = f11;
                            f10 = 1.0f;
                            G1.bravo(V.kilo(pVar2, 12), C0366t.echo, 2, 0L, 0, c0585q, 438, 24);
                            AbstractC0538d.echo(V.oscar(pVar2, f12), c0585q);
                        } else {
                            f5 = f11;
                            f10 = 1.0f;
                            z17 = false;
                            c0585q.purple(1469353019);
                        }
                        c0585q.quebec(z17);
                        long j10 = C0366t.echo;
                        an anVar = ((S2) c0585q.kilo(T2.alpha)).oscar;
                        if (f10 <= 0.0d) {
                            AbstractC1797a.alpha("invalid weight; must be greater than zero");
                        }
                        G2.bravo(str, new LayoutWeightElement(f10, true), j10, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, anVar, c0585q, 390, 0, 65528);
                        c0585q = c0585q;
                        if (z16 && function05 != null) {
                            c0585q.purple(1472163913);
                            function04 = function05;
                            K1.juliet(function04, V.echo(pVar2, f5), false, null, null, null, alpha, c0585q, ((i20 >> 12) & 14) | 805306416, 508);
                        } else {
                            function04 = function05;
                            c0585q.purple(1469353019);
                        }
                        c0585q.quebec(z17);
                        c0585q.quebec(true);
                        c0585q.quebec(true);
                        function03 = function04;
                        z15 = z16;
                        z14 = z18;
                    } else {
                        c0585q.ochre();
                        pVar2 = pVar;
                        z14 = z11;
                        z15 = z12;
                        function03 = function02;
                    }
                    uniform = c0585q.uniform();
                    if (uniform == null) {
                        uniform.delta = new C3249a(state, str, z14, pVar2, function03, z15, i4, i5);
                        return;
                    }
                    return;
                }
                z12 = z10;
                if ((74899 & i12) == 74898) {
                }
                if (!c0585q.magenta(i12 & 1, z13)) {
                }
                uniform = c0585q.uniform();
                if (uniform == null) {
                }
            }
            function02 = function0;
            i15 = i5 & 32;
            if (i15 != 0) {
            }
            z12 = z10;
            if ((74899 & i12) == 74898) {
            }
            if (!c0585q.magenta(i12 & 1, z13)) {
            }
            uniform = c0585q.uniform();
            if (uniform == null) {
            }
        }
        z11 = z2;
        i12 = i10 | 3072;
        i13 = i5 & 16;
        if (i13 == 0) {
        }
        function02 = function0;
        i15 = i5 & 32;
        if (i15 != 0) {
        }
        z12 = z10;
        if ((74899 & i12) == 74898) {
        }
        if (!c0585q.magenta(i12 & 1, z13)) {
        }
        uniform = c0585q.uniform();
        if (uniform == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:78:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x025a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void bravo(EnumC2270b quality, String label, s sVar, Function0 function0, boolean z2, InterfaceC0581m interfaceC0581m, int i4, int i5) {
        int i10;
        Function0 function02;
        int i11;
        int i12;
        boolean z10;
        int i13;
        int i14;
        boolean z11;
        Function0 function03;
        boolean z12;
        s sVar2;
        Q uniform;
        boolean z13;
        int i15;
        Function0 function04;
        boolean z14;
        int i16;
        int i17;
        Intrinsics.echo(quality, "quality");
        Intrinsics.echo(label, "label");
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(1358986234);
        if ((i4 & 6) == 0) {
            if (c0585q.echo(quality.ordinal())) {
                i17 = 4;
            } else {
                i17 = 2;
            }
            i10 = i17 | i4;
        } else {
            i10 = i4;
        }
        if ((i4 & 48) == 0) {
            if (c0585q.golf(label)) {
                i16 = 32;
            } else {
                i16 = 16;
            }
            i10 |= i16;
        }
        int i18 = i10 | 3456;
        int i19 = i5 & 16;
        if (i19 != 0) {
            i18 = i10 | 28032;
        } else if ((i4 & 24576) == 0) {
            function02 = function0;
            if (c0585q.india(function02)) {
                i11 = Http2.INITIAL_MAX_FRAME_SIZE;
            } else {
                i11 = 8192;
            }
            i18 |= i11;
            i12 = i5 & 32;
            if (i12 == 0) {
                i18 |= 196608;
            } else if ((196608 & i4) == 0) {
                z10 = z2;
                if (c0585q.hotel(z10)) {
                    i13 = 131072;
                } else {
                    i13 = 65536;
                }
                i18 |= i13;
                i14 = i18;
                if ((i14 & 74899) != 74898) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (c0585q.magenta(i14 & 1, z11)) {
                    p pVar = p.alpha;
                    if (i19 != 0) {
                        function02 = null;
                    }
                    Function0 function05 = function02;
                    if (i12 != 0) {
                        z13 = false;
                    } else {
                        z13 = z10;
                    }
                    if (quality != EnumC2270b.red && quality != EnumC2270b.silver && quality != EnumC2270b.f13137a) {
                        int ordinal = quality.ordinal();
                        if (ordinal != 0) {
                            if (ordinal != 1) {
                                if (ordinal != 2) {
                                    if (ordinal != 3) {
                                        if (ordinal != 4) {
                                            if (ordinal == 5) {
                                                i15 = R.color.grey_400;
                                            } else {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                        } else {
                                            i15 = R.color.red_700;
                                        }
                                    } else {
                                        i15 = R.color.orange_700;
                                    }
                                } else {
                                    i15 = R.color.amber_600;
                                }
                            } else {
                                i15 = R.color.green_500;
                            }
                        } else {
                            i15 = R.color.green_700;
                        }
                        float f5 = 18;
                        s then = androidx.compose.foundation.a.bravo(V.echo(V.charlie(pVar, 1.0f), f5), AbstractC3071v3.alpha(c0585q, i15), ao.alpha).then(pVar);
                        ap delta = AbstractC0547m.delta(T.d.teal, false);
                        long j5 = c0585q.magenta;
                        int i20 = (int) (j5 ^ (j5 >>> 32));
                        I mike = c0585q.mike();
                        s charlie = T.a.charlie(then, c0585q);
                        InterfaceC2552l.maroon.getClass();
                        C2550j c2550j = C2551k.bravo;
                        c0585q.white();
                        if (c0585q.lime) {
                            c0585q.lima(c2550j);
                        } else {
                            c0585q.i();
                        }
                        C2549i c2549i = C2551k.foxtrot;
                        C0564b.blue(c2549i, c0585q, delta);
                        C2549i c2549i2 = C2551k.echo;
                        C0564b.blue(c2549i2, c0585q, mike);
                        C2549i c2549i3 = C2551k.golf;
                        if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i20))) {
                            ad.blue(i20, c0585q, i20, c2549i3);
                        }
                        C2549i c2549i4 = C2551k.delta;
                        C0564b.blue(c2549i4, c0585q, charlie);
                        s uniform2 = AbstractC0538d.uniform(V.charlie(pVar, 1.0f), 4, 0.0f, 2);
                        S alpha2 = androidx.compose.foundation.layout.Q.alpha(AbstractC0542h.golf, T.d.f2061d, c0585q, 54);
                        long j6 = c0585q.magenta;
                        int i21 = (int) (j6 ^ (j6 >>> 32));
                        I mike2 = c0585q.mike();
                        s charlie2 = T.a.charlie(uniform2, c0585q);
                        c0585q.white();
                        if (c0585q.lime) {
                            c0585q.lima(c2550j);
                        } else {
                            c0585q.i();
                        }
                        C0564b.blue(c2549i, c0585q, alpha2);
                        C0564b.blue(c2549i2, c0585q, mike2);
                        if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i21))) {
                            ad.blue(i21, c0585q, i21, c2549i3);
                        }
                        C0564b.blue(c2549i4, c0585q, charlie2);
                        long j7 = C0366t.echo;
                        an anVar = ((S2) c0585q.kilo(T2.alpha)).oscar;
                        if (1.0f <= 0.0d) {
                            AbstractC1797a.alpha("invalid weight; must be greater than zero");
                        }
                        G2.bravo(label, new LayoutWeightElement(1.0f, true), j7, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, anVar, c0585q, ((i14 >> 3) & 14) | 384, 0, 65528);
                        c0585q = c0585q;
                        if (z13 && function05 != null) {
                            c0585q.purple(-1755270938);
                            K1.juliet(function05, V.echo(pVar, f5), false, null, null, null, bravo, c0585q, ((i14 >> 12) & 14) | 805306416, 508);
                            function04 = function05;
                            z14 = false;
                        } else {
                            function04 = function05;
                            z14 = false;
                            c0585q.purple(-1757836994);
                        }
                        c0585q.quebec(z14);
                        c0585q.quebec(true);
                        c0585q.quebec(true);
                        function03 = function04;
                        z12 = z13;
                        sVar2 = pVar;
                    } else {
                        Q uniform3 = c0585q.uniform();
                        if (uniform3 != null) {
                            uniform3.delta = new r(quality, label, function05, z13, i4, i5);
                            return;
                        }
                        return;
                    }
                } else {
                    c0585q.ochre();
                    function03 = function02;
                    z12 = z10;
                    sVar2 = sVar;
                }
                uniform = c0585q.uniform();
                if (uniform != null) {
                    uniform.delta = new C0405a(quality, label, sVar2, function03, z12, i4, i5);
                    return;
                }
                return;
            }
            z10 = z2;
            i14 = i18;
            if ((i14 & 74899) != 74898) {
            }
            if (c0585q.magenta(i14 & 1, z11)) {
            }
            uniform = c0585q.uniform();
            if (uniform != null) {
            }
        }
        function02 = function0;
        i12 = i5 & 32;
        if (i12 == 0) {
        }
        z10 = z2;
        i14 = i18;
        if ((i14 & 74899) != 74898) {
        }
        if (c0585q.magenta(i14 & 1, z11)) {
        }
        uniform = c0585q.uniform();
        if (uniform != null) {
        }
    }

    public static final void charlie(p pVar, float f5, InterfaceC0581m interfaceC0581m, int i4) {
        boolean z2;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(728858038);
        int i5 = i4 | 54;
        if ((i5 & 19) != 18) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i5 & 1, z2)) {
            pVar = p.alpha;
            f5 = 40;
            s sierra = AbstractC0538d.sierra(V.charlie(pVar, 1.0f), Db.d.alpha);
            ap delta = AbstractC0547m.delta(T.d.teal, false);
            int romeo = C0564b.romeo(c0585q);
            I mike = c0585q.mike();
            s charlie = T.a.charlie(sierra, c0585q);
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
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(romeo))) {
                ad.blue(romeo, c0585q, romeo, c2549i);
            }
            C0564b.blue(C2551k.delta, c0585q, charlie);
            G1.bravo(V.kilo(pVar, f5), c.alpha, 0.0f, 0L, 0, c0585q, 48, 28);
            c0585q.quebec(true);
        } else {
            c0585q.ochre();
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new Sb.b(pVar, f5, i4);
        }
    }

    public static final void delta(String str, String contentDescription, InterfaceC0581m interfaceC0581m, int i4) {
        boolean z2;
        C0585q c0585q;
        p pVar = p.alpha;
        Intrinsics.echo(contentDescription, "contentDescription");
        C0585q c0585q2 = (C0585q) interfaceC0581m;
        c0585q2.silver(-364504558);
        if ((i4 & 131) != 130) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q2.magenta(i4 & 1, z2)) {
            c0585q = c0585q2;
            G2.bravo(str, pVar, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, ((S2) c0585q2.kilo(T2.alpha)).echo, c0585q, 54, 0, 65532);
        } else {
            c0585q = c0585q2;
            c0585q.ochre();
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new Bb.d(str, contentDescription, i4, 4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void echo(final float f5, final s sVar, float f10, long j5, long j6, C2093f c2093f, InterfaceC0581m interfaceC0581m, final int i4, final int i5) {
        int i10;
        float f11;
        int i11;
        int i12;
        long j7;
        int i13;
        int i14;
        long j10;
        int i15;
        boolean z2;
        final C2093f c2093f2;
        final float f12;
        final long j11;
        Q uniform;
        long j12;
        C2093f bravo2;
        int i16;
        int i17;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-1220711735);
        if ((i4 & 6) == 0) {
            if (c0585q.delta(f5)) {
                i17 = 4;
            } else {
                i17 = 2;
            }
            i10 = i17 | i4;
        } else {
            i10 = i4;
        }
        if ((i4 & 48) == 0) {
            if (c0585q.golf(sVar)) {
                i16 = 32;
            } else {
                i16 = 16;
            }
            i10 |= i16;
        }
        int i18 = i5 & 4;
        if (i18 != 0) {
            i10 |= 384;
        } else if ((i4 & 384) == 0) {
            f11 = f10;
            if (c0585q.delta(f11)) {
                i11 = Barcode.FORMAT_QR_CODE;
            } else {
                i11 = 128;
            }
            i10 |= i11;
            i12 = i5 & 8;
            if (i12 == 0) {
                i10 |= 3072;
                j7 = j5;
            } else {
                j7 = j5;
                if ((i4 & 3072) == 0) {
                    if (c0585q.foxtrot(j7)) {
                        i13 = 2048;
                    } else {
                        i13 = Barcode.FORMAT_UPC_E;
                    }
                    i10 |= i13;
                }
            }
            i14 = i5 & 16;
            if (i14 == 0) {
                i10 |= 24576;
            } else if ((i4 & 24576) == 0) {
                j10 = j6;
                if (c0585q.foxtrot(j10)) {
                    i15 = Http2.INITIAL_MAX_FRAME_SIZE;
                } else {
                    i15 = 8192;
                }
                i10 |= i15;
                if ((196608 & i4) == 0) {
                    i10 |= 65536;
                }
                if ((74899 & i10) != 74898) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (c0585q.magenta(i10 & 1, z2)) {
                    c0585q.orange();
                    int i19 = i4 & 1;
                    p pVar = p.alpha;
                    if (i19 != 0 && !c0585q.beige()) {
                        c0585q.ochre();
                        bravo2 = c2093f;
                        j12 = j10;
                    } else {
                        if (i18 != 0) {
                            f11 = 4;
                        }
                        if (i12 != 0) {
                            j7 = ao.delta(4293190887L);
                        }
                        if (i14 != 0) {
                            j12 = ao.delta(4278190080L);
                        } else {
                            j12 = j10;
                        }
                        bravo2 = AbstractC2094g.bravo(999);
                    }
                    c0585q.romeo();
                    float charlie = J4.charlie(f5, 0.0f, 1.0f);
                    s alpha2 = AbstractC3087z.alpha(V.echo(sVar, f11), bravo2);
                    a0.an anVar = ao.alpha;
                    s bravo3 = androidx.compose.foundation.a.bravo(alpha2, j7, anVar);
                    ap delta = AbstractC0547m.delta(T.d.alpha, false);
                    int romeo = C0564b.romeo(c0585q);
                    I mike = c0585q.mike();
                    s charlie2 = T.a.charlie(bravo3, c0585q);
                    InterfaceC2552l.maroon.getClass();
                    C2550j c2550j = C2551k.bravo;
                    c0585q.white();
                    float f13 = f11;
                    if (c0585q.lime) {
                        c0585q.lima(c2550j);
                    } else {
                        c0585q.i();
                    }
                    C0564b.blue(C2551k.foxtrot, c0585q, delta);
                    C0564b.blue(C2551k.echo, c0585q, mike);
                    C2549i c2549i = C2551k.golf;
                    if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(romeo))) {
                        ad.blue(romeo, c0585q, romeo, c2549i);
                    }
                    C0564b.blue(C2551k.delta, c0585q, charlie2);
                    AbstractC0547m.alpha(androidx.compose.foundation.a.bravo(AbstractC3087z.alpha(V.charlie(pVar, charlie).then(V.bravo), bravo2), j12, anVar), c0585q, 0);
                    c0585q.quebec(true);
                    j11 = j12;
                    c2093f2 = bravo2;
                    f12 = f13;
                } else {
                    c0585q.ochre();
                    c2093f2 = c2093f;
                    f12 = f11;
                    j11 = j10;
                }
                final long j13 = j7;
                uniform = c0585q.uniform();
                if (uniform != null) {
                    uniform.delta = new l() { // from class: vb.b
                        @Override // Xd.l
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int cyan = C0564b.cyan(i4 | 1);
                            C2093f c2093f3 = c2093f2;
                            AbstractC3185a.echo(f5, sVar, f12, j13, j11, c2093f3, (InterfaceC0581m) obj, cyan, i5);
                            return Unit.INSTANCE;
                        }
                    };
                    return;
                }
                return;
            }
            j10 = j6;
            if ((196608 & i4) == 0) {
            }
            if ((74899 & i10) != 74898) {
            }
            if (c0585q.magenta(i10 & 1, z2)) {
            }
            final long j132 = j7;
            uniform = c0585q.uniform();
            if (uniform != null) {
            }
        }
        f11 = f10;
        i12 = i5 & 8;
        if (i12 == 0) {
        }
        i14 = i5 & 16;
        if (i14 == 0) {
        }
        j10 = j6;
        if ((196608 & i4) == 0) {
        }
        if ((74899 & i10) != 74898) {
        }
        if (c0585q.magenta(i10 & 1, z2)) {
        }
        final long j1322 = j7;
        uniform = c0585q.uniform();
        if (uniform != null) {
        }
    }
}
