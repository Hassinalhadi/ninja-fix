package wb;

import A0.h;
import Ac.i;
import Cb.t;
import D0.an;
import F.AbstractC0174x1;
import F.C0143o2;
import F.C0150q1;
import F.C0162t2;
import F.F;
import F.G2;
import F.I1;
import F.K1;
import F.O;
import F.S2;
import F.T2;
import F.ay;
import F.z2;
import I0.ai;
import I0.aj;
import N2.ae;
import T.j;
import T.p;
import T.s;
import Xd.l;
import a0.C0366t;
import androidx.compose.foundation.layout.AbstractC0538d;
import androidx.compose.foundation.layout.AbstractC0542h;
import androidx.compose.foundation.layout.AbstractC0553t;
import androidx.compose.foundation.layout.C0537c;
import androidx.compose.foundation.layout.C0554u;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.S;
import androidx.compose.foundation.layout.V;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.E0;
import androidx.compose.runtime.I;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.runtime.Q;
import androidx.compose.runtime.as;
import androidx.compose.runtime.ax;
import ao.ad;
import com.google.mlkit.vision.barcode.common.Barcode;
import delivery.samurai.android.R;
import h.AbstractC1797a;
import java.util.List;
import k5.C2008a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import n.C2144t;
import n.av;
import n.aw;
import okhttp3.internal.http2.Http2;
import pa.C2296b;
import s0.C2549i;
import s0.C2550j;
import s0.C2551k;
import s0.InterfaceC2552l;
import sb.C2844c;
import y.AbstractC3355O;
import y.C3354N;

/* renamed from: wb.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3253e {
    public static final P.d alpha = new P.d(new ud.f(6), -1298044247, false);
    public static final P.d bravo = new P.d(new ud.f(7), 1276543883, false);

    /* JADX WARN: Removed duplicated region for block: B:20:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void alpha(int i4, int i5, p pVar, InterfaceC0581m interfaceC0581m, Function1 onCheckedChange, boolean z2, boolean z10) {
        int i10;
        boolean z11;
        int i11;
        boolean z12;
        p pVar2;
        boolean z13;
        Q uniform;
        int i12;
        int i13;
        Intrinsics.echo(onCheckedChange, "onCheckedChange");
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(1870433475);
        if ((i4 & 6) == 0) {
            if (c0585q.hotel(z2)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i10 = i13 | i4;
        } else {
            i10 = i4;
        }
        if ((i4 & 48) == 0) {
            if (c0585q.india(onCheckedChange)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i10 |= i12;
        }
        int i14 = i10 | 384;
        int i15 = i5 & 8;
        if (i15 != 0) {
            i14 = i10 | 3456;
        } else if ((i4 & 3072) == 0) {
            z11 = z10;
            if (c0585q.hotel(z11)) {
                i11 = 2048;
            } else {
                i11 = Barcode.FORMAT_UPC_E;
            }
            i14 |= i11;
            if ((i14 & 1171) == 1170) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (!c0585q.magenta(i14 & 1, z12)) {
                p pVar3 = p.alpha;
                if (i15 != 0) {
                    z11 = true;
                }
                E0 e02 = F.Q.alpha;
                ay november = K1.november(((O) c0585q.kilo(e02)).alpha, ((O) c0585q.kilo(e02)).sierra, ((O) c0585q.kilo(e02)).bravo, c0585q);
                c0585q = c0585q;
                boolean z14 = z11;
                F.alpha(z2, onCheckedChange, pVar3, z14, november, c0585q, i14 & 8190, 32);
                pVar2 = pVar3;
                z13 = z14;
            } else {
                c0585q.ochre();
                pVar2 = pVar;
                z13 = z11;
            }
            uniform = c0585q.uniform();
            if (uniform == null) {
                uniform.delta = new C3250b(z2, onCheckedChange, pVar2, z13, i4, i5);
                return;
            }
            return;
        }
        z11 = z10;
        if ((i14 & 1171) == 1170) {
        }
        if (!c0585q.magenta(i14 & 1, z12)) {
        }
        uniform = c0585q.uniform();
        if (uniform == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0442  */
    /* JADX WARN: Removed duplicated region for block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0425  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void bravo(String value, Function1 onValueChange, s sVar, String str, String str2, P.d dVar, P.d dVar2, aj ajVar, boolean z2, String str3, boolean z10, boolean z11, int i4, aw awVar, av avVar, InterfaceC0581m interfaceC0581m, int i5, int i10, int i11) {
        int i12;
        boolean z12;
        s sVar2;
        String str4;
        P.d dVar3;
        aj ajVar2;
        boolean z13;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        C0585q c0585q;
        P.d dVar4;
        boolean z14;
        int i24;
        aw awVar2;
        s sVar3;
        aj ajVar3;
        boolean z15;
        String str5;
        P.d dVar5;
        String str6;
        boolean z16;
        av avVar2;
        Q uniform;
        int i25;
        boolean z17;
        boolean z18;
        P.d echo;
        P.d echo2;
        String str7;
        boolean z19;
        Intrinsics.echo(value, "value");
        Intrinsics.echo(onValueChange, "onValueChange");
        C0585q c0585q2 = (C0585q) interfaceC0581m;
        c0585q2.silver(1397154284);
        if ((i5 & 6) == 0) {
            i12 = (c0585q2.golf(value) ? 4 : 2) | i5;
        } else {
            i12 = i5;
        }
        if ((i5 & 48) == 0) {
            i12 |= c0585q2.india(onValueChange) ? 32 : 16;
        }
        int i26 = i11 & 4;
        if (i26 != 0) {
            i12 |= 384;
            sVar2 = sVar;
            z12 = true;
        } else {
            z12 = true;
            if ((i5 & 384) == 0) {
                sVar2 = sVar;
                i12 |= c0585q2.golf(sVar2) ? 256 : 128;
            } else {
                sVar2 = sVar;
            }
        }
        int i27 = i11 & 8;
        if (i27 != 0) {
            i12 |= 3072;
            str4 = str;
        } else if ((i5 & 3072) == 0) {
            str4 = str;
            i12 |= c0585q2.golf(str4) ? 2048 : Barcode.FORMAT_UPC_E;
        } else {
            str4 = str;
        }
        if ((i5 & 24576) == 0) {
            i12 |= c0585q2.golf(str2) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        int i28 = i11 & 32;
        if (i28 != 0) {
            i12 |= 196608;
            dVar3 = dVar;
        } else {
            dVar3 = dVar;
            if ((i5 & 196608) == 0) {
                i12 |= c0585q2.india(dVar3) ? 131072 : 65536;
            }
        }
        int i29 = i11 & 64;
        if (i29 != 0) {
            i12 |= 1572864;
        } else if ((i5 & 1572864) == 0) {
            i12 |= c0585q2.india(dVar2) ? 1048576 : 524288;
        }
        int i30 = i11 & 128;
        if (i30 != 0) {
            i12 |= 12582912;
            ajVar2 = ajVar;
        } else {
            ajVar2 = ajVar;
            if ((i5 & 12582912) == 0) {
                i12 |= c0585q2.golf(ajVar2) ? 8388608 : 4194304;
            }
        }
        int i31 = i11 & Barcode.FORMAT_QR_CODE;
        if (i31 != 0) {
            i12 |= 100663296;
            z13 = z2;
        } else {
            z13 = z2;
            if ((i5 & 100663296) == 0) {
                i12 |= c0585q2.hotel(z13) ? 67108864 : 33554432;
            }
        }
        int i32 = i11 & 512;
        if (i32 != 0) {
            i13 = i32;
            i14 = i12 | 805306368;
            i15 = Barcode.FORMAT_UPC_E;
        } else {
            if ((i5 & 805306368) == 0) {
                i13 = i32;
                i12 |= c0585q2.golf(str3) ? 536870912 : 268435456;
            } else {
                i13 = i32;
            }
            i14 = i12;
            i15 = Barcode.FORMAT_UPC_E;
        }
        int i33 = i15 & i11;
        if (i33 != 0) {
            i17 = i10 | 6;
        } else {
            if ((i10 & 6) != 0) {
                i16 = i10;
                int i34 = i16 | 48;
                i18 = i11 & 4096;
                if (i18 == 0) {
                    i19 = i16 | 432;
                } else {
                    if ((i10 & 384) == 0) {
                        i34 |= c0585q2.hotel(z11) ? Barcode.FORMAT_QR_CODE : 128;
                    }
                    i19 = i34;
                }
                int i35 = i19 | 3072;
                int i36 = Http2.INITIAL_MAX_FRAME_SIZE;
                i20 = i11 & Http2.INITIAL_MAX_FRAME_SIZE;
                if (i20 == 0) {
                    i21 = i19 | 27648;
                } else if ((i10 & 24576) == 0) {
                    if (!c0585q2.golf(awVar)) {
                        i36 = 8192;
                    }
                    i21 = i35 | i36;
                } else {
                    i21 = i35;
                }
                i22 = i11 & 32768;
                if (i22 == 0) {
                    i21 |= 196608;
                } else if ((i10 & 196608) == 0) {
                    i21 |= c0585q2.golf(avVar) ? 131072 : 65536;
                }
                i23 = i21;
                if (!c0585q2.magenta(i14 & 1, ((i14 & 306783379) == 306783378 || (i23 & 74899) != 74898) ? z12 : false)) {
                    p pVar = p.alpha;
                    s sVar4 = i26 != 0 ? pVar : sVar2;
                    if (i27 != 0) {
                        str4 = null;
                    }
                    P.d dVar6 = i28 != 0 ? null : dVar3;
                    P.d dVar7 = i29 != 0 ? null : dVar2;
                    if (i30 != 0) {
                        ajVar2 = ai.alpha;
                    }
                    if (i31 != 0) {
                        z13 = false;
                    }
                    String str8 = i13 != 0 ? null : str3;
                    if (i33 != 0) {
                        i25 = i20;
                        z17 = z12;
                    } else {
                        i25 = i20;
                        z17 = z10;
                    }
                    boolean z20 = i18 != 0 ? z12 : z11;
                    aw awVar3 = i25 != 0 ? aw.delta : awVar;
                    av avVar3 = i22 != 0 ? av.bravo : avVar;
                    C0554u alpha2 = AbstractC0553t.alpha(AbstractC0542h.charlie, T.d.f2062f, c0585q2, 0);
                    int romeo = C0564b.romeo(c0585q2);
                    I mike = c0585q2.mike();
                    s charlie = T.a.charlie(sVar4, c0585q2);
                    InterfaceC2552l.maroon.getClass();
                    C2550j c2550j = C2551k.bravo;
                    c0585q2.white();
                    s sVar5 = sVar4;
                    if (c0585q2.lime) {
                        c0585q2.lima(c2550j);
                    } else {
                        c0585q2.i();
                    }
                    C0564b.blue(C2551k.foxtrot, c0585q2, alpha2);
                    C0564b.blue(C2551k.echo, c0585q2, mike);
                    C2549i c2549i = C2551k.golf;
                    if (c0585q2.lime || !Intrinsics.areEqual(c0585q2.jade(), Integer.valueOf(romeo))) {
                        ad.blue(romeo, c0585q2, romeo, c2549i);
                    }
                    C0564b.blue(C2551k.delta, c0585q2, charlie);
                    if (str4 == null) {
                        c0585q2.purple(1651260427);
                        z18 = false;
                        c0585q2.quebec(false);
                        echo = null;
                    } else {
                        z18 = false;
                        c0585q2.purple(1651260428);
                        echo = P.e.echo(1628501879, new i(str4, 20), c0585q2);
                        c0585q2.quebec(false);
                    }
                    if (str2 == null) {
                        c0585q2.purple(1651322334);
                        c0585q2.quebec(z18);
                        echo2 = null;
                    } else {
                        c0585q2.purple(1651322335);
                        echo2 = P.e.echo(1664192631, new i(str2, 21), c0585q2);
                        c0585q2.quebec(z18);
                    }
                    C0150q1 c0150q1 = C0150q1.alpha;
                    E0 e02 = F.Q.alpha;
                    C0143o2 charlie2 = C0150q1.charlie(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, ((O) c0585q2.kilo(e02)).alpha, ((O) c0585q2.kilo(e02)).amber, 0L, ((O) c0585q2.kilo(e02)).whiskey, 0L, 0L, 0L, 0L, 0L, 0L, c0585q2, 2147461119);
                    int i37 = i23 << 9;
                    int i38 = (i14 & 14) | 384 | (i14 & 112) | (i37 & 7168) | (i37 & 57344);
                    int i39 = i14 << 9;
                    int i40 = i38 | (i39 & 234881024) | (i39 & 1879048192);
                    int i41 = i23 << 3;
                    int i42 = ((i14 >> 15) & 7168) | ((i14 >> 9) & 57344) | (458752 & i41) | (i41 & 3670016);
                    int i43 = i23 << 15;
                    int i44 = i42 | (29360128 & i43) | (i43 & 234881024);
                    String str9 = str4;
                    aj ajVar4 = ajVar2;
                    boolean z21 = z20;
                    aw awVar4 = awVar3;
                    av avVar4 = avVar3;
                    AbstractC0174x1.alpha(value, onValueChange, V.charlie(pVar, 1.0f), z17, null, echo, echo2, dVar6, dVar7, null, z13, ajVar4, awVar4, avVar4, z21, 1, 0, null, charlie2, c0585q2, i40, i44, 3677216);
                    c0585q = c0585q2;
                    if (z13 && str8 != null) {
                        c0585q.purple(1652179113);
                        str7 = str8;
                        G2.bravo(str7, AbstractC0538d.whiskey(pVar, Db.f.echo, Db.f.bravo, 0.0f, 0.0f, 12), ((O) c0585q.kilo(e02)).whiskey, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, ((S2) c0585q.kilo(T2.alpha)).lima, c0585q, ((i14 >> 27) & 14) | 48, 0, 65528);
                        z19 = false;
                    } else {
                        str7 = str8;
                        z19 = false;
                        c0585q.purple(1646660896);
                    }
                    c0585q.quebec(z19);
                    c0585q.quebec(true);
                    avVar2 = avVar4;
                    dVar5 = dVar6;
                    dVar4 = dVar7;
                    z15 = z13;
                    ajVar3 = ajVar4;
                    awVar2 = awVar4;
                    str6 = str7;
                    str5 = str9;
                    z14 = z21;
                    i24 = 1;
                    z16 = z17;
                    sVar3 = sVar5;
                } else {
                    c0585q = c0585q2;
                    c0585q.ochre();
                    dVar4 = dVar2;
                    z14 = z11;
                    i24 = i4;
                    awVar2 = awVar;
                    sVar3 = sVar2;
                    ajVar3 = ajVar2;
                    z15 = z13;
                    str5 = str4;
                    dVar5 = dVar3;
                    str6 = str3;
                    z16 = z10;
                    avVar2 = avVar;
                }
                uniform = c0585q.uniform();
                if (uniform == null) {
                    uniform.delta = new C2144t(value, onValueChange, sVar3, str5, str2, dVar5, dVar4, ajVar3, z15, str6, z16, z14, i24, awVar2, avVar2, i5, i10, i11);
                    return;
                }
                return;
            }
            i17 = i10 | (c0585q2.hotel(z10) ? 4 : 2);
        }
        i16 = i17;
        int i342 = i16 | 48;
        i18 = i11 & 4096;
        if (i18 == 0) {
        }
        int i352 = i19 | 3072;
        int i362 = Http2.INITIAL_MAX_FRAME_SIZE;
        i20 = i11 & Http2.INITIAL_MAX_FRAME_SIZE;
        if (i20 == 0) {
        }
        i22 = i11 & 32768;
        if (i22 == 0) {
        }
        i23 = i21;
        if (!c0585q2.magenta(i14 & 1, ((i14 & 306783379) == 306783378 || (i23 & 74899) != 74898) ? z12 : false)) {
        }
        uniform = c0585q.uniform();
        if (uniform == null) {
        }
    }

    public static final void charlie(boolean z2, Function0 onClick, p pVar, boolean z10, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        boolean z11;
        p pVar2;
        int i10;
        int i11;
        int i12;
        Intrinsics.echo(onClick, "onClick");
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(1162346336);
        if ((i4 & 6) == 0) {
            if (c0585q.hotel(z2)) {
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
        int i13 = i5 | 384;
        if ((i4 & 3072) == 0) {
            if (c0585q.hotel(z10)) {
                i10 = 2048;
            } else {
                i10 = Barcode.FORMAT_UPC_E;
            }
            i13 |= i10;
        }
        if ((i13 & 1171) != 1170) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (c0585q.magenta(i13 & 1, z11)) {
            p pVar3 = p.alpha;
            E0 e02 = F.Q.alpha;
            I1.alpha(z2, onClick, pVar3, z10, K1.papa(((O) c0585q.kilo(e02)).alpha, ((O) c0585q.kilo(e02)).sierra, c0585q), c0585q, i13 & 8190, 32);
            pVar2 = pVar3;
        } else {
            c0585q.ochre();
            pVar2 = pVar;
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new Mb.b(z2, onClick, pVar2, z10, i4, 1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void delta(int i4, int i5, p pVar, InterfaceC0581m interfaceC0581m, Function1 function1, boolean z2, boolean z10) {
        int i10;
        boolean z11;
        int i11;
        int i12;
        boolean z12;
        C0585q c0585q;
        p pVar2;
        Q uniform;
        int i13;
        C0585q c0585q2 = (C0585q) interfaceC0581m;
        c0585q2.silver(-717218007);
        if ((i4 & 6) == 0) {
            if (c0585q2.hotel(z2)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i10 = i13 | i4;
        } else {
            i10 = i4;
        }
        int i14 = i5 & 4;
        if (i14 != 0) {
            i10 |= 384;
        } else if ((i4 & 384) == 0) {
            z11 = z10;
            if (c0585q2.hotel(z11)) {
                i11 = Barcode.FORMAT_QR_CODE;
            } else {
                i11 = 128;
            }
            i10 |= i11;
            i12 = i10 | 3072;
            if ((i12 & 1171) == 1170) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (!c0585q2.magenta(i12 & 1, z12)) {
                if (i14 != 0) {
                    z11 = true;
                }
                p pVar3 = p.alpha;
                long j5 = C0366t.echo;
                long j6 = Db.c.bravo;
                long j7 = Db.c.yankee;
                c0585q = c0585q2;
                boolean z13 = z11;
                androidx.compose.material3.a.alpha(z2, function1, pVar3, z13, K1.oscar(j5, j6, 0L, j5, j7, 0L, C0366t.bravo(0.6f, j5), C0366t.bravo(0.5f, j7), 0L, C0366t.bravo(0.6f, j5), C0366t.bravo(0.5f, j7), 0L, c0585q, 52428), c0585q, (i12 & 126) | 384 | ((i12 << 6) & 57344));
                pVar2 = pVar3;
                z11 = z13;
            } else {
                c0585q = c0585q2;
                c0585q.ochre();
                pVar2 = pVar;
            }
            uniform = c0585q.uniform();
            if (uniform == null) {
                uniform.delta = new C3250b(z2, function1, z11, pVar2, i4, i5);
                return;
            }
            return;
        }
        z11 = z10;
        i12 = i10 | 3072;
        if ((i12 & 1171) == 1170) {
        }
        if (!c0585q2.magenta(i12 & 1, z12)) {
        }
        uniform = c0585q.uniform();
        if (uniform == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x04f0  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0510  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void echo(final String value, final Function1 onValueChange, s sVar, String str, String str2, P.d dVar, P.d dVar2, boolean z2, String str3, boolean z10, boolean z11, boolean z12, int i4, aw awVar, av avVar, InterfaceC0581m interfaceC0581m, final int i5, final int i10, final int i11) {
        int i12;
        String str4;
        int i13;
        String str5;
        int i14;
        P.d dVar3;
        int i15;
        P.d dVar4;
        int i16;
        int i17;
        int i18;
        String str6;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        C0585q c0585q;
        final P.d dVar5;
        final String str7;
        final s sVar2;
        final boolean z13;
        final boolean z14;
        final boolean z15;
        final boolean z16;
        final aw awVar2;
        final av avVar2;
        final String str8;
        final String str9;
        final P.d dVar6;
        final int i28;
        Q uniform;
        boolean z17;
        P.d echo;
        P.d dVar7;
        E0 e02;
        long j5;
        P.d dVar8;
        String str10;
        C0143o2 c0143o2;
        String str11;
        p pVar;
        boolean z18;
        Intrinsics.echo(value, "value");
        Intrinsics.echo(onValueChange, "onValueChange");
        C0585q c0585q2 = (C0585q) interfaceC0581m;
        c0585q2.silver(191455999);
        if ((i5 & 6) == 0) {
            i12 = (c0585q2.golf(value) ? 4 : 2) | i5;
        } else {
            i12 = i5;
        }
        int i29 = i12 | 384;
        int i30 = i11 & 8;
        if (i30 != 0) {
            i29 = i12 | 3456;
        } else if ((i5 & 3072) == 0) {
            str4 = str;
            i29 |= c0585q2.golf(str4) ? 2048 : Barcode.FORMAT_UPC_E;
            i13 = i11 & 16;
            if (i13 == 0) {
                i29 |= 24576;
            } else if ((i5 & 24576) == 0) {
                str5 = str2;
                i29 |= c0585q2.golf(str5) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
                i14 = i11 & 32;
                if (i14 != 0) {
                    i29 |= 196608;
                    dVar3 = dVar;
                } else {
                    dVar3 = dVar;
                    if ((i5 & 196608) == 0) {
                        i29 |= c0585q2.india(dVar3) ? 131072 : 65536;
                    }
                }
                i15 = i11 & 64;
                if (i15 != 0) {
                    i16 = i29 | 1572864;
                    dVar4 = dVar2;
                } else {
                    dVar4 = dVar2;
                    i16 = i29 | (c0585q2.india(dVar4) ? 1048576 : 524288);
                }
                i17 = i11 & 128;
                if (i17 != 0) {
                    i16 |= 12582912;
                } else if ((i5 & 12582912) == 0) {
                    i16 |= c0585q2.hotel(z2) ? 8388608 : 4194304;
                }
                i18 = i11 & Barcode.FORMAT_QR_CODE;
                if (i18 != 0) {
                    i16 |= 100663296;
                    str6 = str3;
                } else {
                    str6 = str3;
                    if ((i5 & 100663296) == 0) {
                        i16 |= c0585q2.golf(str6) ? 67108864 : 33554432;
                    }
                }
                i19 = i11 & 512;
                if (i19 != 0) {
                    i16 |= 805306368;
                } else if ((i5 & 805306368) == 0) {
                    i16 |= c0585q2.hotel(z10) ? 536870912 : 268435456;
                }
                i20 = i16;
                i21 = 1024 & i11;
                if (i21 != 0) {
                    i22 = i10 | 6;
                } else if ((i10 & 6) == 0) {
                    i22 = i10 | (c0585q2.hotel(z11) ? 4 : 2);
                } else {
                    i22 = i10;
                }
                i23 = 2048 & i11;
                if (i23 != 0) {
                    i22 |= 48;
                    i24 = i23;
                } else if ((i10 & 48) == 0) {
                    i24 = i23;
                    i22 |= c0585q2.hotel(z12) ? 32 : 16;
                } else {
                    i24 = i23;
                }
                int i31 = i22;
                i25 = i11 & 4096;
                if (i25 != 0) {
                    i26 = i31 | 384;
                } else {
                    int i32 = i31;
                    if ((i10 & 384) == 0) {
                        i32 |= c0585q2.echo(i4) ? Barcode.FORMAT_QR_CODE : 128;
                    }
                    i26 = i32;
                }
                i27 = i26 | 27648;
                if (c0585q2.magenta(i20 & 1, (i20 & 306783379) == 306783378 || (i27 & 9363) != 9362)) {
                    p pVar2 = p.alpha;
                    if (i30 != 0) {
                        str4 = null;
                    }
                    if (i13 != 0) {
                        str5 = null;
                    }
                    P.d dVar9 = i14 != 0 ? null : dVar3;
                    if (i15 != 0) {
                        dVar4 = null;
                    }
                    boolean z19 = i17 != 0 ? false : z2;
                    String str12 = i18 != 0 ? null : str6;
                    boolean z20 = i19 != 0 ? true : z10;
                    boolean z21 = i21 != 0 ? false : z11;
                    z16 = i24 != 0 ? true : z12;
                    P.d dVar10 = dVar4;
                    i28 = i25 != 0 ? 1 : i4;
                    aw awVar3 = aw.delta;
                    av avVar3 = av.bravo;
                    C0554u alpha2 = AbstractC0553t.alpha(AbstractC0542h.charlie, T.d.f2062f, c0585q2, 0);
                    int romeo = C0564b.romeo(c0585q2);
                    I mike = c0585q2.mike();
                    s charlie = T.a.charlie(pVar2, c0585q2);
                    InterfaceC2552l.maroon.getClass();
                    boolean z22 = z20;
                    C2550j c2550j = C2551k.bravo;
                    c0585q2.white();
                    boolean z23 = z21;
                    if (c0585q2.lime) {
                        c0585q2.lima(c2550j);
                    } else {
                        c0585q2.i();
                    }
                    C0564b.blue(C2551k.foxtrot, c0585q2, alpha2);
                    C0564b.blue(C2551k.echo, c0585q2, mike);
                    C2549i c2549i = C2551k.golf;
                    if (c0585q2.lime || !Intrinsics.areEqual(c0585q2.jade(), Integer.valueOf(romeo))) {
                        ad.blue(romeo, c0585q2, romeo, c2549i);
                    }
                    C0564b.blue(C2551k.delta, c0585q2, charlie);
                    if (str4 == null) {
                        c0585q2.purple(-496732860);
                        z17 = false;
                        c0585q2.quebec(false);
                        echo = null;
                    } else {
                        z17 = false;
                        c0585q2.purple(-496732859);
                        echo = P.e.echo(1917972884, new i(str4, 18), c0585q2);
                        c0585q2.quebec(false);
                    }
                    if (str5 == null) {
                        c0585q2.purple(-496670953);
                        c0585q2.quebec(z17);
                        dVar7 = null;
                    } else {
                        c0585q2.purple(-496670952);
                        P.d echo2 = P.e.echo(1855633556, new i(str5, 19), c0585q2);
                        c0585q2.quebec(z17);
                        dVar7 = echo2;
                    }
                    C0162t2 c0162t2 = C0162t2.alpha;
                    E0 e03 = F.Q.alpha;
                    long j6 = ((O) c0585q2.kilo(e03)).papa;
                    long j7 = ((O) c0585q2.kilo(e03)).papa;
                    long bravo2 = C0366t.bravo(0.5f, ((O) c0585q2.kilo(e03)).papa);
                    long j10 = ((O) c0585q2.kilo(e03)).yankee;
                    long j11 = C0366t.kilo;
                    O o5 = (O) c0585q2.kilo(e03);
                    P.d dVar11 = echo;
                    C0143o2 c0143o22 = o5.ochre;
                    c0585q2.purple(27085453);
                    if (c0143o22 == null) {
                        e02 = e03;
                        j5 = j10;
                        dVar8 = dVar10;
                        str10 = str4;
                        C0143o2 c0143o23 = new C0143o2(F.Q.charlie(o5, 18), F.Q.charlie(o5, 18), C0366t.bravo(0.38f, F.Q.charlie(o5, 18)), F.Q.charlie(o5, 18), F.Q.charlie(o5, 39), F.Q.charlie(o5, 39), F.Q.charlie(o5, 39), F.Q.charlie(o5, 39), F.Q.charlie(o5, 26), F.Q.charlie(o5, 2), (C3354N) c0585q2.kilo(AbstractC3355O.alpha), F.Q.charlie(o5, 26), F.Q.charlie(o5, 19), C0366t.bravo(0.38f, F.Q.charlie(o5, 18)), F.Q.charlie(o5, 2), F.Q.charlie(o5, 19), F.Q.charlie(o5, 19), C0366t.bravo(0.38f, F.Q.charlie(o5, 18)), F.Q.charlie(o5, 19), F.Q.charlie(o5, 19), F.Q.charlie(o5, 19), C0366t.bravo(0.38f, F.Q.charlie(o5, 18)), F.Q.charlie(o5, 2), F.Q.charlie(o5, 26), F.Q.charlie(o5, 19), C0366t.bravo(0.38f, F.Q.charlie(o5, 18)), F.Q.charlie(o5, 2), F.Q.charlie(o5, 19), F.Q.charlie(o5, 19), C0366t.bravo(0.38f, F.Q.charlie(o5, 18)), F.Q.charlie(o5, 19), F.Q.charlie(o5, 19), F.Q.charlie(o5, 19), C0366t.bravo(0.38f, F.Q.charlie(o5, 18)), F.Q.charlie(o5, 2), F.Q.charlie(o5, 19), F.Q.charlie(o5, 19), C0366t.bravo(0.38f, F.Q.charlie(o5, 19)), F.Q.charlie(o5, 19), F.Q.charlie(o5, 19), F.Q.charlie(o5, 19), C0366t.bravo(0.38f, F.Q.charlie(o5, 19)), F.Q.charlie(o5, 19));
                        o5.ochre = c0143o23;
                        c0143o2 = c0143o23;
                    } else {
                        e02 = e03;
                        j5 = j10;
                        dVar8 = dVar10;
                        str10 = str4;
                        c0143o2 = c0143o22;
                    }
                    c0585q2.quebec(false);
                    C0143o2 alpha3 = c0143o2.alpha(j11, j11, j11, j11, j6, j7, bravo2, j5, j11, j11, null, j11, j11, j11, j11, j11, j11, j11, j11, j11, j11, j11, j11, j11, j11, j11, j11, j11, j11, j11, j11, j11, j11, j11, j11, j11, j11, j11, j11, j11, j11, j11, j11);
                    int i33 = i20 << 9;
                    int i34 = (i20 & 14) | 432 | ((i20 >> 18) & 7168) | ((i27 << 12) & 57344) | (i33 & 234881024) | (i33 & 1879048192);
                    int i35 = i27 << 18;
                    E0 e04 = e02;
                    String str13 = str10;
                    String str14 = str5;
                    P.d dVar12 = dVar8;
                    z2.alpha(value, onValueChange, V.charlie(pVar2, 1.0f), z22, z23, null, dVar11, dVar7, dVar9, dVar12, z19, null, z16, i28, 0, null, alpha3, c0585q2, i34, ((i20 >> 12) & 7168) | 1769472 | (29360128 & i35) | (i35 & 234881024));
                    c0585q = c0585q2;
                    if (z19 && str12 != null) {
                        c0585q.purple(-495766558);
                        pVar = pVar2;
                        str11 = str12;
                        G2.bravo(str11, AbstractC0538d.whiskey(pVar2, Db.f.echo, Db.f.bravo, 0.0f, 0.0f, 12), ((O) c0585q.kilo(e04)).whiskey, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, ((S2) c0585q.kilo(T2.alpha)).lima, c0585q, ((i20 >> 24) & 14) | 48, 0, 65528);
                        z18 = false;
                    } else {
                        str11 = str12;
                        pVar = pVar2;
                        z18 = false;
                        c0585q.purple(-499223399);
                    }
                    c0585q.quebec(z18);
                    c0585q.quebec(true);
                    z15 = z23;
                    dVar5 = dVar9;
                    z13 = z19;
                    str9 = str11;
                    awVar2 = awVar3;
                    avVar2 = avVar3;
                    str7 = str13;
                    z14 = z22;
                    sVar2 = pVar;
                    dVar6 = dVar12;
                    str8 = str14;
                } else {
                    c0585q = c0585q2;
                    c0585q.ochre();
                    String str15 = str4;
                    dVar5 = dVar3;
                    str7 = str15;
                    sVar2 = sVar;
                    z13 = z2;
                    z14 = z10;
                    z15 = z11;
                    z16 = z12;
                    awVar2 = awVar;
                    avVar2 = avVar;
                    str8 = str5;
                    str9 = str6;
                    dVar6 = dVar4;
                    i28 = i4;
                }
                uniform = c0585q.uniform();
                if (uniform != null) {
                    uniform.delta = new l() { // from class: wb.f
                        @Override // Xd.l
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int cyan = C0564b.cyan(i5 | 1);
                            int cyan2 = C0564b.cyan(i10);
                            av avVar4 = avVar2;
                            int i36 = i11;
                            AbstractC3253e.echo(value, onValueChange, sVar2, str7, str8, dVar5, dVar6, z13, str9, z14, z15, z16, i28, awVar2, avVar4, (InterfaceC0581m) obj, cyan, cyan2, i36);
                            return Unit.INSTANCE;
                        }
                    };
                    return;
                }
                return;
            }
            str5 = str2;
            i14 = i11 & 32;
            if (i14 != 0) {
            }
            i15 = i11 & 64;
            if (i15 != 0) {
            }
            i17 = i11 & 128;
            if (i17 != 0) {
            }
            i18 = i11 & Barcode.FORMAT_QR_CODE;
            if (i18 != 0) {
            }
            i19 = i11 & 512;
            if (i19 != 0) {
            }
            i20 = i16;
            i21 = 1024 & i11;
            if (i21 != 0) {
            }
            i23 = 2048 & i11;
            if (i23 != 0) {
            }
            int i312 = i22;
            i25 = i11 & 4096;
            if (i25 != 0) {
            }
            i27 = i26 | 27648;
            if (c0585q2.magenta(i20 & 1, (i20 & 306783379) == 306783378 || (i27 & 9363) != 9362)) {
            }
            uniform = c0585q.uniform();
            if (uniform != null) {
            }
        }
        str4 = str;
        i13 = i11 & 16;
        if (i13 == 0) {
        }
        str5 = str2;
        i14 = i11 & 32;
        if (i14 != 0) {
        }
        i15 = i11 & 64;
        if (i15 != 0) {
        }
        i17 = i11 & 128;
        if (i17 != 0) {
        }
        i18 = i11 & Barcode.FORMAT_QR_CODE;
        if (i18 != 0) {
        }
        i19 = i11 & 512;
        if (i19 != 0) {
        }
        i20 = i16;
        i21 = 1024 & i11;
        if (i21 != 0) {
        }
        i23 = 2048 & i11;
        if (i23 != 0) {
        }
        int i3122 = i22;
        i25 = i11 & 4096;
        if (i25 != 0) {
        }
        i27 = i26 | 27648;
        if (c0585q2.magenta(i20 & 1, (i20 & 306783379) == 306783378 || (i27 & 9363) != 9362)) {
        }
        uniform = c0585q.uniform();
        if (uniform != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void foxtrot(int i4, int i5, p pVar, InterfaceC0581m interfaceC0581m, String str, String str2, Function1 onCheckedChange, boolean z2, boolean z10) {
        int i10;
        String str3;
        int i11;
        int i12;
        boolean z11;
        p pVar2;
        boolean z12;
        C0585q c0585q;
        String str4;
        Q uniform;
        boolean z13;
        String str5;
        boolean z14;
        Intrinsics.echo(onCheckedChange, "onCheckedChange");
        C0585q c0585q2 = (C0585q) interfaceC0581m;
        c0585q2.silver(-1544836616);
        if (c0585q2.hotel(z2)) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        int i13 = i4 | i10;
        int i14 = i13 | 27648;
        int i15 = i5 & 32;
        if (i15 != 0) {
            i14 = 224256 | i13;
        } else if ((i4 & 196608) == 0) {
            str3 = str2;
            if (c0585q2.golf(str3)) {
                i11 = 131072;
            } else {
                i11 = 65536;
            }
            i14 |= i11;
            i12 = i14;
            if ((i12 & 74899) == 74898) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!c0585q2.magenta(i12 & 1, z11)) {
                p pVar3 = p.alpha;
                if (i15 != 0) {
                    str3 = null;
                }
                s charlie = V.charlie(pVar3, 1.0f);
                h hVar = new h(1);
                int i16 = i12 & 14;
                if (i16 == 4) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                Object jade = c0585q2.jade();
                as asVar = C0580l.alpha;
                if (z13 || jade == asVar) {
                    jade = new C2008a(onCheckedChange, z2, 3);
                    c0585q2.f(jade);
                }
                s uniform2 = AbstractC0538d.uniform(androidx.compose.foundation.a.delta(charlie, true, null, hVar, (Function0) jade, 2), 0.0f, Db.f.charlie, 1);
                j jVar = T.d.f2061d;
                C0537c c0537c = AbstractC0542h.alpha;
                S alpha2 = androidx.compose.foundation.layout.Q.alpha(AbstractC0542h.golf(Db.f.delta), jVar, c0585q2, 54);
                int romeo = C0564b.romeo(c0585q2);
                I mike = c0585q2.mike();
                s charlie2 = T.a.charlie(uniform2, c0585q2);
                InterfaceC2552l.maroon.getClass();
                C2550j c2550j = C2551k.bravo;
                c0585q2.white();
                if (c0585q2.lime) {
                    c0585q2.lima(c2550j);
                } else {
                    c0585q2.i();
                }
                C2549i c2549i = C2551k.foxtrot;
                C0564b.blue(c2549i, c0585q2, alpha2);
                C2549i c2549i2 = C2551k.echo;
                C0564b.blue(c2549i2, c0585q2, mike);
                C2549i c2549i3 = C2551k.golf;
                if (c0585q2.lime || !Intrinsics.areEqual(c0585q2.jade(), Integer.valueOf(romeo))) {
                    ad.blue(romeo, c0585q2, romeo, c2549i3);
                }
                C2549i c2549i4 = C2551k.delta;
                C0564b.blue(c2549i4, c0585q2, charlie2);
                Object jade2 = c0585q2.jade();
                if (jade2 == asVar) {
                    jade2 = new ae(11, onCheckedChange);
                    c0585q2.f(jade2);
                }
                alpha(i16 | 3072, 4, null, c0585q2, (Function1) jade2, z2, true);
                if (1.0f <= 0.0d) {
                    AbstractC1797a.alpha("invalid weight; must be greater than zero");
                }
                LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
                C0554u alpha3 = AbstractC0553t.alpha(AbstractC0542h.charlie, T.d.f2062f, c0585q2, 0);
                int romeo2 = C0564b.romeo(c0585q2);
                I mike2 = c0585q2.mike();
                s charlie3 = T.a.charlie(layoutWeightElement, c0585q2);
                c0585q2.white();
                if (c0585q2.lime) {
                    c0585q2.lima(c2550j);
                } else {
                    c0585q2.i();
                }
                C0564b.blue(c2549i, c0585q2, alpha3);
                C0564b.blue(c2549i2, c0585q2, mike2);
                if (c0585q2.lime || !Intrinsics.areEqual(c0585q2.jade(), Integer.valueOf(romeo2))) {
                    ad.blue(romeo2, c0585q2, romeo2, c2549i3);
                }
                C0564b.blue(c2549i4, c0585q2, charlie3);
                E0 e02 = T2.alpha;
                an anVar = ((S2) c0585q2.kilo(e02)).juliet;
                c0585q2.purple(1107319065);
                E0 e03 = F.Q.alpha;
                long j5 = ((O) c0585q2.kilo(e03)).quebec;
                c0585q2.quebec(false);
                String str6 = str3;
                G2.bravo(str, null, j5, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, anVar, c0585q2, 6, 0, 65530);
                C0585q c0585q3 = c0585q2;
                if (str6 != null) {
                    c0585q3.purple(1107570506);
                    an anVar2 = ((S2) c0585q3.kilo(e02)).lima;
                    c0585q3.purple(1107726250);
                    long j6 = ((O) c0585q3.kilo(e03)).sierra;
                    c0585q3.quebec(false);
                    str5 = str6;
                    G2.bravo(str5, AbstractC0538d.whiskey(pVar3, 0.0f, Db.f.alpha, 0.0f, 0.0f, 13), j6, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, anVar2, c0585q3, ((i12 >> 15) & 14) | 48, 0, 65528);
                    c0585q3 = c0585q3;
                    z14 = false;
                } else {
                    str5 = str6;
                    z14 = false;
                    c0585q3.purple(1104510372);
                }
                c0585q3.quebec(z14);
                c0585q3.quebec(true);
                c0585q3.quebec(true);
                c0585q = c0585q3;
                z12 = true;
                pVar2 = pVar3;
                str4 = str5;
            } else {
                c0585q2.ochre();
                pVar2 = pVar;
                z12 = z10;
                c0585q = c0585q2;
                str4 = str3;
            }
            uniform = c0585q.uniform();
            if (uniform == null) {
                uniform.delta = new C3249a(z2, onCheckedChange, str, pVar2, z12, str4, i4, i5);
                return;
            }
            return;
        }
        str3 = str2;
        i12 = i14;
        if ((i12 & 74899) == 74898) {
        }
        if (!c0585q2.magenta(i12 & 1, z11)) {
        }
        uniform = c0585q.uniform();
        if (uniform == null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0055  */
    /* JADX WARN: Type inference failed for: r7v11, types: [I0.aj] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void golf(int i4, int i5, p pVar, InterfaceC0581m interfaceC0581m, String value, String str, Function1 onValueChange, boolean z2, boolean z10) {
        int i10;
        boolean z11;
        int i11;
        int i12;
        String str2;
        int i13;
        int i14;
        boolean z12;
        p pVar2;
        boolean z13;
        String str3;
        boolean z14;
        Q uniform;
        boolean z15;
        String str4;
        Object obj;
        int i15;
        Intrinsics.echo(value, "value");
        Intrinsics.echo(onValueChange, "onValueChange");
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-79756613);
        if ((i4 & 6) == 0) {
            if (c0585q.golf(value)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i10 = i4 | i15;
        } else {
            i10 = i4;
        }
        int i16 = i10 | 24960;
        int i17 = i5 & 32;
        if (i17 != 0) {
            i16 = 221568 | i10;
        } else if ((i4 & 196608) == 0) {
            z11 = z2;
            if (c0585q.hotel(z11)) {
                i11 = 131072;
            } else {
                i11 = 65536;
            }
            i16 |= i11;
            i12 = i5 & 64;
            if (i12 == 0) {
                i16 |= 1572864;
            } else if ((i4 & 1572864) == 0) {
                str2 = str;
                if (c0585q.golf(str2)) {
                    i13 = 1048576;
                } else {
                    i13 = 524288;
                }
                i16 |= i13;
                i14 = i16 | 12582912;
                if ((4793491 & i14) != 4793490) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (c0585q.magenta(i14 & 1, z12)) {
                    p pVar3 = p.alpha;
                    if (i17 != 0) {
                        z15 = false;
                    } else {
                        z15 = z11;
                    }
                    if (i12 != 0) {
                        str4 = null;
                    } else {
                        str4 = str2;
                    }
                    Object jade = c0585q.jade();
                    if (jade == C0580l.alpha) {
                        jade = C0564b.zulu(Boolean.FALSE);
                        c0585q.f(jade);
                    }
                    ax axVar = (ax) jade;
                    if (((Boolean) axVar.getValue()).booleanValue()) {
                        obj = ai.alpha;
                    } else {
                        obj = new Object();
                    }
                    ?? r72 = obj;
                    aw awVar = new aw(7, 7, 115);
                    P.d echo = P.e.echo(144555128, new t(axVar, 6), c0585q);
                    int i18 = (i14 & 14) | 1600944;
                    int i19 = i14 << 9;
                    bravo(value, onValueChange, pVar3, "Password", null, null, echo, r72, z15, str4, true, true, 0, awVar, null, c0585q, i18 | (234881024 & i19) | (i19 & 1879048192), 24966, 43040);
                    pVar2 = pVar3;
                    z13 = z15;
                    str3 = str4;
                    z14 = true;
                } else {
                    c0585q.ochre();
                    pVar2 = pVar;
                    z13 = z11;
                    str3 = str2;
                    z14 = z10;
                }
                uniform = c0585q.uniform();
                if (uniform != null) {
                    uniform.delta = new C3249a(value, onValueChange, pVar2, z13, str3, z14, i4, i5);
                    return;
                }
                return;
            }
            str2 = str;
            i14 = i16 | 12582912;
            if ((4793491 & i14) != 4793490) {
            }
            if (c0585q.magenta(i14 & 1, z12)) {
            }
            uniform = c0585q.uniform();
            if (uniform != null) {
            }
        }
        z11 = z2;
        i12 = i5 & 64;
        if (i12 == 0) {
        }
        str2 = str;
        i14 = i16 | 12582912;
        if ((4793491 & i14) != 4793490) {
        }
        if (c0585q.magenta(i14 & 1, z12)) {
        }
        uniform = c0585q.uniform();
        if (uniform != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void hotel(final List options, final String str, final Function1 onOptionSelected, s sVar, boolean z2, final Function1 getLabel, Function1 function1, InterfaceC0581m interfaceC0581m, final int i4, final int i5) {
        int i10;
        boolean z10;
        int i11;
        int i12;
        Function1 function12;
        int i13;
        boolean z11;
        final s sVar2;
        final boolean z12;
        final Function1 function13;
        Q uniform;
        String str2;
        Intrinsics.echo(options, "options");
        Intrinsics.echo(onOptionSelected, "onOptionSelected");
        Intrinsics.echo(getLabel, "getLabel");
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-1123486683);
        if (c0585q.golf(str)) {
            i10 = 32;
        } else {
            i10 = 16;
        }
        int i14 = i10 | i4;
        int i15 = i14 | 3072;
        int i16 = i5 & 16;
        if (i16 != 0) {
            i15 = i14 | 27648;
        } else if ((i4 & 24576) == 0) {
            z10 = z2;
            if (c0585q.hotel(z10)) {
                i11 = Http2.INITIAL_MAX_FRAME_SIZE;
            } else {
                i11 = 8192;
            }
            i15 |= i11;
            i12 = i5 & 64;
            if (i12 == 0) {
                i15 |= 1572864;
            } else if ((1572864 & i4) == 0) {
                function12 = function1;
                if (c0585q.india(function12)) {
                    i13 = 1048576;
                } else {
                    i13 = 524288;
                }
                i15 |= i13;
                if ((599187 & i15) != 599186) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (c0585q.magenta(i15 & 1, z11)) {
                    p pVar = p.alpha;
                    if (i16 != 0) {
                        z10 = true;
                    }
                    if (i12 != 0) {
                        function13 = null;
                    } else {
                        function13 = function12;
                    }
                    C0554u alpha2 = AbstractC0553t.alpha(AbstractC0542h.charlie, T.d.f2062f, c0585q, 0);
                    int romeo = C0564b.romeo(c0585q);
                    I mike = c0585q.mike();
                    s charlie = T.a.charlie(pVar, c0585q);
                    InterfaceC2552l.maroon.getClass();
                    C2550j c2550j = C2551k.bravo;
                    c0585q.white();
                    if (c0585q.lime) {
                        c0585q.lima(c2550j);
                    } else {
                        c0585q.i();
                    }
                    C0564b.blue(C2551k.foxtrot, c0585q, alpha2);
                    C0564b.blue(C2551k.echo, c0585q, mike);
                    C2549i c2549i = C2551k.golf;
                    if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(romeo))) {
                        ad.blue(romeo, c0585q, romeo, c2549i);
                    }
                    C0564b.blue(C2551k.delta, c0585q, charlie);
                    c0585q.purple(860925235);
                    for (Object obj : options) {
                        boolean areEqual = Intrinsics.areEqual(obj, str);
                        String str3 = (String) getLabel.invoke(obj);
                        if (function13 != null) {
                            str2 = (String) function13.invoke(obj);
                        } else {
                            str2 = null;
                        }
                        boolean india = c0585q.india(obj);
                        boolean z13 = z10;
                        Object jade = c0585q.jade();
                        if (india || jade == C0580l.alpha) {
                            jade = new okhttp3.internal.ws.a(9, onOptionSelected, obj);
                            c0585q.f(jade);
                        }
                        india(areEqual, (Function0) jade, str3, null, z13, str2, c0585q, 57344 & i15);
                        z10 = z13;
                        pVar = pVar;
                    }
                    c0585q.quebec(false);
                    c0585q.quebec(true);
                    z12 = z10;
                    sVar2 = pVar;
                } else {
                    c0585q.ochre();
                    sVar2 = sVar;
                    z12 = z10;
                    function13 = function12;
                }
                uniform = c0585q.uniform();
                if (uniform != null) {
                    uniform.delta = new l() { // from class: wb.c
                        @Override // Xd.l
                        public final Object invoke(Object obj2, Object obj3) {
                            ((Integer) obj3).getClass();
                            int cyan = C0564b.cyan(i4 | 1);
                            Function1 function14 = function13;
                            AbstractC3253e.hotel(options, str, onOptionSelected, sVar2, z12, getLabel, function14, (InterfaceC0581m) obj2, cyan, i5);
                            return Unit.INSTANCE;
                        }
                    };
                    return;
                }
                return;
            }
            function12 = function1;
            if ((599187 & i15) != 599186) {
            }
            if (c0585q.magenta(i15 & 1, z11)) {
            }
            uniform = c0585q.uniform();
            if (uniform != null) {
            }
        }
        z10 = z2;
        i12 = i5 & 64;
        if (i12 == 0) {
        }
        function12 = function1;
        if ((599187 & i15) != 599186) {
        }
        if (c0585q.magenta(i15 & 1, z11)) {
        }
        uniform = c0585q.uniform();
        if (uniform != null) {
        }
    }

    public static final void india(final boolean z2, final Function0 onClick, final String label, p pVar, final boolean z10, final String str, InterfaceC0581m interfaceC0581m, final int i4) {
        int i5;
        boolean z11;
        C0585q c0585q;
        p pVar2;
        long bravo2;
        boolean z12;
        boolean z13;
        boolean z14;
        long bravo3;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        Intrinsics.echo(onClick, "onClick");
        Intrinsics.echo(label, "label");
        C0585q c0585q2 = (C0585q) interfaceC0581m;
        c0585q2.silver(-253048377);
        if ((i4 & 6) == 0) {
            if (c0585q2.hotel(z2)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i5 = i14 | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            if (c0585q2.india(onClick)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i5 |= i13;
        }
        if ((i4 & 384) == 0) {
            if (c0585q2.golf(label)) {
                i12 = Barcode.FORMAT_QR_CODE;
            } else {
                i12 = 128;
            }
            i5 |= i12;
        }
        int i15 = i5 | 3072;
        if ((i4 & 24576) == 0) {
            if (c0585q2.hotel(z10)) {
                i11 = Http2.INITIAL_MAX_FRAME_SIZE;
            } else {
                i11 = 8192;
            }
            i15 |= i11;
        }
        if ((196608 & i4) == 0) {
            if (c0585q2.golf(str)) {
                i10 = 131072;
            } else {
                i10 = 65536;
            }
            i15 |= i10;
        }
        int i16 = i15;
        if ((i16 & 74899) != 74898) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (c0585q2.magenta(i16 & 1, z11)) {
            p pVar3 = p.alpha;
            s uniform = AbstractC0538d.uniform(androidx.compose.foundation.a.delta(V.charlie(pVar3, 1.0f), z10, null, new h(3), onClick, 2), 0.0f, Db.f.charlie, 1);
            j jVar = T.d.f2061d;
            C0537c c0537c = AbstractC0542h.alpha;
            S alpha2 = androidx.compose.foundation.layout.Q.alpha(AbstractC0542h.golf(Db.f.delta), jVar, c0585q2, 54);
            int romeo = C0564b.romeo(c0585q2);
            I mike = c0585q2.mike();
            s charlie = T.a.charlie(uniform, c0585q2);
            InterfaceC2552l.maroon.getClass();
            C2550j c2550j = C2551k.bravo;
            c0585q2.white();
            if (c0585q2.lime) {
                c0585q2.lima(c2550j);
            } else {
                c0585q2.i();
            }
            C2549i c2549i = C2551k.foxtrot;
            C0564b.blue(c2549i, c0585q2, alpha2);
            C2549i c2549i2 = C2551k.echo;
            C0564b.blue(c2549i2, c0585q2, mike);
            C2549i c2549i3 = C2551k.golf;
            if (c0585q2.lime || !Intrinsics.areEqual(c0585q2.jade(), Integer.valueOf(romeo))) {
                ad.blue(romeo, c0585q2, romeo, c2549i3);
            }
            C2549i c2549i4 = C2551k.delta;
            C0564b.blue(c2549i4, c0585q2, charlie);
            charlie(z2, onClick, null, z10, c0585q2, (i16 & 126) | ((i16 >> 3) & 7168));
            if (1.0f <= 0.0d) {
                AbstractC1797a.alpha("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
            C0554u alpha3 = AbstractC0553t.alpha(AbstractC0542h.charlie, T.d.f2062f, c0585q2, 0);
            int romeo2 = C0564b.romeo(c0585q2);
            I mike2 = c0585q2.mike();
            s charlie2 = T.a.charlie(layoutWeightElement, c0585q2);
            c0585q2.white();
            if (c0585q2.lime) {
                c0585q2.lima(c2550j);
            } else {
                c0585q2.i();
            }
            C0564b.blue(c2549i, c0585q2, alpha3);
            C0564b.blue(c2549i2, c0585q2, mike2);
            if (c0585q2.lime || !Intrinsics.areEqual(c0585q2.jade(), Integer.valueOf(romeo2))) {
                ad.blue(romeo2, c0585q2, romeo2, c2549i3);
            }
            C0564b.blue(c2549i4, c0585q2, charlie2);
            E0 e02 = T2.alpha;
            an anVar = ((S2) c0585q2.kilo(e02)).juliet;
            if (z10) {
                c0585q2.purple(1714271734);
                bravo2 = ((O) c0585q2.kilo(F.Q.alpha)).quebec;
                c0585q2.quebec(false);
                z12 = false;
            } else {
                c0585q2.purple(1714352706);
                bravo2 = C0366t.bravo(0.38f, ((O) c0585q2.kilo(F.Q.alpha)).quebec);
                z12 = false;
                c0585q2.quebec(false);
            }
            pVar2 = pVar3;
            G2.bravo(label, null, bravo2, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, anVar, c0585q2, (i16 >> 6) & 14, 0, 65530);
            if (str != null) {
                c0585q2.purple(1714523175);
                an anVar2 = ((S2) c0585q2.kilo(e02)).lima;
                if (z10) {
                    c0585q2.purple(1714678919);
                    bravo3 = ((O) c0585q2.kilo(F.Q.alpha)).sierra;
                    z14 = false;
                    c0585q2.quebec(false);
                } else {
                    z14 = false;
                    c0585q2.purple(1714774771);
                    bravo3 = C0366t.bravo(0.38f, ((O) c0585q2.kilo(F.Q.alpha)).sierra);
                    c0585q2.quebec(false);
                }
                G2.bravo(str, AbstractC0538d.whiskey(pVar2, 0.0f, Db.f.alpha, 0.0f, 0.0f, 13), bravo3, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, anVar2, c0585q2, ((i16 >> 15) & 14) | 48, 0, 65528);
                c0585q = c0585q2;
                z13 = false;
            } else {
                c0585q = c0585q2;
                z13 = false;
                c0585q.purple(1709278657);
            }
            c0585q.quebec(z13);
            c0585q.quebec(true);
            c0585q.quebec(true);
        } else {
            c0585q = c0585q2;
            c0585q.ochre();
            pVar2 = pVar;
        }
        Q uniform2 = c0585q.uniform();
        if (uniform2 != null) {
            final p pVar4 = pVar2;
            uniform2.delta = new l() { // from class: wb.d
                @Override // Xd.l
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int cyan = C0564b.cyan(i4 | 1);
                    boolean z15 = z10;
                    String str2 = str;
                    AbstractC3253e.india(z2, onClick, label, pVar4, z15, str2, (InterfaceC0581m) obj, cyan);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void juliet(String value, Function1 onValueChange, s sVar, String str, Function0 function0, InterfaceC0581m interfaceC0581m, int i4, int i5) {
        int i10;
        s sVar2;
        int i11;
        int i12;
        boolean z2;
        Function0 function02;
        s sVar3;
        s sVar4;
        String str2;
        P.d dVar;
        int i13;
        int i14;
        Intrinsics.echo(value, "value");
        Intrinsics.echo(onValueChange, "onValueChange");
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-1941864753);
        if ((i4 & 6) == 0) {
            if (c0585q.golf(value)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i10 = i14 | i4;
        } else {
            i10 = i4;
        }
        int i15 = i5 & 4;
        if (i15 != 0) {
            i12 = i10 | 384;
            sVar2 = sVar;
        } else {
            sVar2 = sVar;
            if (c0585q.golf(sVar2)) {
                i11 = Barcode.FORMAT_QR_CODE;
            } else {
                i11 = 128;
            }
            i12 = i10 | i11;
        }
        if ((i4 & 3072) == 0) {
            if (c0585q.golf(str)) {
                i13 = 2048;
            } else {
                i13 = Barcode.FORMAT_UPC_E;
            }
            i12 |= i13;
        }
        int i16 = i12 | 24576;
        if ((i16 & 9363) != 9362) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i16 & 1, z2)) {
            if (i15 != 0) {
                sVar4 = p.alpha;
            } else {
                sVar4 = sVar2;
            }
            as asVar = C0580l.alpha;
            Object jade = c0585q.jade();
            if (jade == asVar) {
                jade = new C2844c(11);
                c0585q.f(jade);
            }
            Function0 function03 = (Function0) jade;
            if (str == null) {
                str2 = Q0.c.oscar(c0585q, -2116213746, R.string.search, c0585q, false);
            } else {
                c0585q.purple(-2116214211);
                c0585q.quebec(false);
                str2 = str;
            }
            if (value.length() > 0) {
                c0585q.purple(-1177645453);
                dVar = P.e.echo(1212836428, new a5.t(1, onValueChange), c0585q);
                c0585q.quebec(false);
            } else {
                c0585q.purple(-1177270354);
                c0585q.quebec(false);
                dVar = null;
            }
            aw awVar = new aw(1, 3, 115);
            Object jade2 = c0585q.jade();
            if (jade2 == asVar) {
                jade2 = new com.clevertap.android.sdk.variables.b(function03, 2);
                c0585q.f(jade2);
            }
            int i17 = (i16 & 14) | 196656 | (i16 & 896);
            bravo(value, onValueChange, sVar4, null, str2, bravo, dVar, null, false, null, false, true, 0, awVar, new av(47, (Function1) jade2), c0585q, i17, 24960, 12168);
            sVar3 = sVar4;
            function02 = function03;
        } else {
            c0585q.ochre();
            function02 = function0;
            sVar3 = sVar2;
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new C2296b(value, onValueChange, sVar3, str, function02, i4, i5, 1);
        }
    }
}
