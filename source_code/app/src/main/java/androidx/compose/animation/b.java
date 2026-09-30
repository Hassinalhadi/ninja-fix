package androidx.compose.animation;

import F.C0144p;
import P.d;
import Q0.m;
import T.k;
import T.p;
import T.s;
import Xd.l;
import a2.C0393r;
import androidx.appcompat.widget.P0;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.I;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.runtime.Q;
import androidx.compose.runtime.as;
import androidx.compose.runtime.t0;
import ao.ad;
import bx.A;
import bx.B;
import bx.C0771i;
import bx.C0772j;
import bx.E;
import bx.M;
import bx.ab;
import bx.ac;
import bx.ai;
import bx.aj;
import bx.ao;
import bx.ap;
import bx.ar;
import bx.ax;
import bx.ay;
import bx.az;
import bx.t;
import bx.u;
import bx.v;
import bx.w;
import bx.x;
import bx.y;
import bx.z;
import bz.AbstractC0779d;
import bz.U;
import bz.a0;
import bz.an;
import bz.e0;
import bz.g0;
import com.google.mlkit.vision.barcode.common.Barcode;
import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;
import s0.C2549i;
import s0.C2550j;
import s0.C2551k;
import s0.InterfaceC2552l;

/* loaded from: classes3.dex */
public abstract class b {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:191:0x04f8  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x051e  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0522  */
    /* JADX WARN: Type inference failed for: r7v25, types: [P.d] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void alpha(a0 a0Var, Function1 function1, s sVar, ax axVar, az azVar, l lVar, d dVar, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        boolean z2;
        d dVar2;
        boolean z10;
        boolean z11;
        int i10;
        boolean z12;
        boolean z13;
        boolean z14;
        A a6;
        as asVar;
        boolean z15;
        a0 a0Var2;
        U u4;
        U u10;
        as asVar2;
        U u11;
        boolean z16;
        boolean z17;
        boolean z18;
        as asVar3;
        U u12;
        U u13;
        as asVar4;
        U u14;
        U u15;
        U u16;
        as asVar5;
        az azVar2;
        ax axVar2;
        boolean hotel;
        Object jade;
        Object jade2;
        int i11;
        d dVar3;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        d dVar4 = dVar;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(1912839215);
        if ((i4 & 6) == 0) {
            if (c0585q.golf(a0Var)) {
                i18 = 4;
            } else {
                i18 = 2;
            }
            i5 = i18 | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            if (c0585q.india(function1)) {
                i17 = 32;
            } else {
                i17 = 16;
            }
            i5 |= i17;
        }
        if ((i4 & 384) == 0) {
            if (c0585q.golf(sVar)) {
                i16 = Barcode.FORMAT_QR_CODE;
            } else {
                i16 = 128;
            }
            i5 |= i16;
        }
        if ((i4 & 3072) == 0) {
            if (c0585q.golf(axVar)) {
                i15 = 2048;
            } else {
                i15 = Barcode.FORMAT_UPC_E;
            }
            i5 |= i15;
        }
        if ((i4 & 24576) == 0) {
            if (c0585q.golf(azVar)) {
                i14 = Http2.INITIAL_MAX_FRAME_SIZE;
            } else {
                i14 = 8192;
            }
            i5 |= i14;
        }
        if ((196608 & i4) == 0) {
            if (c0585q.india(lVar)) {
                i13 = 131072;
            } else {
                i13 = 65536;
            }
            i5 |= i13;
        }
        int i19 = i5 | 1572864;
        if ((12582912 & i4) == 0) {
            if (c0585q.india(dVar4)) {
                i12 = 8388608;
            } else {
                i12 = 4194304;
            }
            i19 |= i12;
        }
        int i20 = i19;
        if ((i20 & 4793491) != 4793490) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i20 & 1, z2)) {
            boolean booleanValue = ((Boolean) function1.invoke(((t0) a0Var.delta).getValue())).booleanValue();
            G3.a aVar = a0Var.alpha;
            if (!booleanValue && !((Boolean) function1.invoke(aVar.L())).booleanValue() && !a0Var.hotel() && !a0Var.delta()) {
                c0585q.purple(-230149485);
                c0585q.quebec(false);
                dVar2 = dVar4;
            } else {
                c0585q.purple(-232323267);
                int i21 = i20 & 14;
                int i22 = i21 | 48;
                int i23 = i22 & 14;
                if (((i23 ^ 6) > 4 && c0585q.golf(a0Var)) || (i22 & 6) == 4) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                Object jade3 = c0585q.jade();
                as asVar6 = C0580l.alpha;
                if (z10 || jade3 == asVar6) {
                    jade3 = aVar.L();
                    c0585q.f(jade3);
                }
                if (a0Var.hotel()) {
                    jade3 = aVar.L();
                }
                c0585q.purple(1844425648);
                ai foxtrot = foxtrot(a0Var, function1, jade3, c0585q);
                c0585q.quebec(false);
                Object value = ((t0) a0Var.delta).getValue();
                c0585q.purple(1844425648);
                ai foxtrot2 = foxtrot(a0Var, function1, value, c0585q);
                c0585q.quebec(false);
                int i24 = i23 | 3072;
                a5.c cVar = e0.alpha;
                int i25 = (i24 & 14) ^ 6;
                if ((i25 > 4 && c0585q.golf(a0Var)) || (i24 & 6) == 4) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                Object jade4 = c0585q.jade();
                if (!z11 && jade4 != asVar6) {
                    i10 = i24;
                } else {
                    i10 = i24;
                    jade4 = new a0(new an(foxtrot), a0Var, P0.gold(new StringBuilder(), a0Var.charlie, " > EnterExitTransition"));
                    c0585q.f(jade4);
                }
                a0 a0Var3 = (a0) jade4;
                if ((i25 > 4 && c0585q.golf(a0Var)) || (i10 & 6) == 4) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                boolean golf = z12 | c0585q.golf(a0Var3);
                Object jade5 = c0585q.jade();
                if (golf || jade5 == asVar6) {
                    jade5 = new C0393r(18, a0Var, a0Var3);
                    c0585q.f(jade5);
                }
                C0564b.delta(a0Var3, (Function1) jade5, c0585q);
                if (a0Var.hotel()) {
                    a0Var3.lima(foxtrot, foxtrot2);
                } else {
                    a0Var3.quebec(foxtrot2);
                    ((t0) a0Var3.kilo).setValue(Boolean.FALSE);
                }
                androidx.compose.runtime.ax black = C0564b.black(lVar, c0585q);
                Object L4 = a0Var3.alpha.L();
                androidx.compose.runtime.ax axVar3 = a0Var3.delta;
                Object invoke = lVar.invoke(L4, ((t0) axVar3).getValue());
                boolean golf2 = c0585q.golf(a0Var3) | c0585q.golf(black);
                Object jade6 = c0585q.jade();
                if (golf2 || jade6 == asVar6) {
                    jade6 = new v(a0Var3, black, null);
                    c0585q.f(jade6);
                }
                androidx.compose.runtime.ax amber = C0564b.amber((l) jade6, c0585q, invoke);
                G3.a aVar2 = a0Var3.alpha;
                Object L10 = aVar2.L();
                ai aiVar = ai.red;
                if (L10 == aiVar && ((t0) axVar3).getValue() == aiVar && ((Boolean) amber.getValue()).booleanValue()) {
                    c0585q.purple(-230155437);
                    c0585q.quebec(false);
                    dVar3 = dVar;
                    z15 = false;
                } else {
                    c0585q.purple(-231293261);
                    if (i21 == 4) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    Object jade7 = c0585q.jade();
                    if (z13 || jade7 == asVar6) {
                        jade7 = new ab();
                        c0585q.f(jade7);
                    }
                    ab abVar = (ab) jade7;
                    g0 g0Var = ar.alpha;
                    Object jade8 = c0585q.jade();
                    if (jade8 == asVar6) {
                        jade8 = ao.alpha;
                        c0585q.f(jade8);
                    }
                    Function0 function0 = (Function0) jade8;
                    boolean golf3 = c0585q.golf(a0Var3);
                    Object jade9 = c0585q.jade();
                    if (golf3 || jade9 == asVar6) {
                        jade9 = C0564b.zulu(axVar);
                        c0585q.f(jade9);
                    }
                    androidx.compose.runtime.ax axVar4 = (androidx.compose.runtime.ax) jade9;
                    t0 t0Var = (t0) axVar3;
                    if (aVar2.L() == t0Var.getValue() && aVar2.L() == ai.purple) {
                        if (a0Var3.hotel()) {
                            axVar4.setValue(axVar);
                        } else {
                            axVar4.setValue(ax.alpha);
                        }
                    } else if (t0Var.getValue() == ai.purple) {
                        axVar4.setValue(((ax) axVar4.getValue()).alpha(axVar));
                    }
                    ax axVar5 = (ax) axVar4.getValue();
                    boolean golf4 = c0585q.golf(a0Var3);
                    Object jade10 = c0585q.jade();
                    if (golf4 || jade10 == asVar6) {
                        jade10 = C0564b.zulu(azVar);
                        c0585q.f(jade10);
                    }
                    androidx.compose.runtime.ax axVar6 = (androidx.compose.runtime.ax) jade10;
                    if (aVar2.L() == t0Var.getValue() && aVar2.L() == ai.purple) {
                        if (a0Var3.hotel()) {
                            axVar6.setValue(azVar);
                        } else {
                            axVar6.setValue(az.alpha);
                        }
                    } else if (t0Var.getValue() != ai.purple) {
                        axVar6.setValue(((az) axVar6.getValue()).alpha(azVar));
                    }
                    az azVar3 = (az) axVar6.getValue();
                    M m4 = ((ay) axVar5).bravo;
                    A a8 = (A) azVar3;
                    M m5 = a8.charlie;
                    if (m4.bravo == null && m5.bravo == null) {
                        z14 = false;
                    } else {
                        z14 = true;
                    }
                    c0585q.purple(133944080);
                    c0585q.quebec(false);
                    if (z14) {
                        c0585q.purple(134035871);
                        g0 g0Var2 = AbstractC0779d.quebec;
                        Object jade11 = c0585q.jade();
                        if (jade11 == asVar6) {
                            jade11 = "Built-in shrink/expand";
                            c0585q.f("Built-in shrink/expand");
                        }
                        a6 = a8;
                        asVar = asVar6;
                        a0Var2 = a0Var3;
                        z15 = false;
                        u4 = null;
                        U bravo = e0.bravo(a0Var2, g0Var2, (String) jade11, c0585q, 384, 0);
                        c0585q.quebec(false);
                        u10 = bravo;
                    } else {
                        a6 = a8;
                        asVar = asVar6;
                        z15 = false;
                        a0Var2 = a0Var3;
                        u4 = null;
                        c0585q.purple(134146695);
                        c0585q.quebec(false);
                        u10 = null;
                    }
                    if (z14) {
                        c0585q.purple(134220321);
                        g0 g0Var3 = AbstractC0779d.papa;
                        Object jade12 = c0585q.jade();
                        as asVar7 = asVar;
                        if (jade12 == asVar7) {
                            jade12 = "Built-in InterruptionHandlingOffset";
                            c0585q.f("Built-in InterruptionHandlingOffset");
                        }
                        asVar2 = asVar7;
                        U bravo2 = e0.bravo(a0Var2, g0Var3, (String) jade12, c0585q, 384, 0);
                        c0585q.quebec(z15);
                        u11 = bravo2;
                    } else {
                        asVar2 = asVar;
                        c0585q.purple(134390727);
                        c0585q.quebec(z15);
                        u11 = u4;
                    }
                    boolean z19 = !z14;
                    B b2 = m4.alpha;
                    M m8 = a6.charlie;
                    if (b2 == null && m8.alpha == null) {
                        z16 = z15;
                    } else {
                        z16 = true;
                    }
                    if (m4.charlie == null && m8.charlie == null) {
                        z17 = z15;
                    } else {
                        z17 = true;
                    }
                    g0 g0Var4 = AbstractC0779d.juliet;
                    if (z16) {
                        c0585q.purple(-703859581);
                        Object jade13 = c0585q.jade();
                        as asVar8 = asVar2;
                        if (jade13 == asVar8) {
                            jade13 = "Built-in alpha";
                            c0585q.f("Built-in alpha");
                        }
                        z18 = z19;
                        asVar3 = asVar8;
                        U bravo3 = e0.bravo(a0Var2, g0Var4, (String) jade13, c0585q, 384, 0);
                        c0585q.quebec(z15);
                        u12 = bravo3;
                    } else {
                        z18 = z19;
                        asVar3 = asVar2;
                        c0585q.purple(-703690136);
                        c0585q.quebec(z15);
                        u12 = u4;
                    }
                    if (z17) {
                        c0585q.purple(-703622493);
                        Object jade14 = c0585q.jade();
                        as asVar9 = asVar3;
                        if (jade14 == asVar9) {
                            jade14 = "Built-in scale";
                            c0585q.f("Built-in scale");
                        }
                        u13 = u12;
                        asVar4 = asVar9;
                        U bravo4 = e0.bravo(a0Var2, g0Var4, (String) jade14, c0585q, 384, 0);
                        c0585q.quebec(z15);
                        u14 = bravo4;
                    } else {
                        u13 = u12;
                        asVar4 = asVar3;
                        c0585q.purple(-703453048);
                        c0585q.quebec(z15);
                        u14 = u4;
                    }
                    if (z17) {
                        c0585q.purple(-703375392);
                        u15 = u14;
                        u16 = e0.bravo(a0Var2, ar.alpha, "TransformOriginInterruptionHandling", c0585q, 384, 0);
                        c0585q.quebec(z15);
                    } else {
                        u15 = u14;
                        c0585q.purple(-703203064);
                        c0585q.quebec(z15);
                        u16 = u4;
                    }
                    U u17 = u13;
                    boolean india = c0585q.india(u17) | c0585q.golf(axVar5) | c0585q.golf(azVar3) | c0585q.india(u15) | c0585q.golf(a0Var2) | c0585q.india(u16);
                    Object jade15 = c0585q.jade();
                    if (!india) {
                        asVar5 = asVar4;
                        if (jade15 != asVar5) {
                            azVar2 = azVar3;
                            axVar2 = axVar5;
                            aj ajVar = (aj) jade15;
                            p pVar = p.alpha;
                            boolean z20 = z18;
                            hotel = c0585q.hotel(z20) | c0585q.golf(function0);
                            jade = c0585q.jade();
                            if (!hotel || jade == asVar5) {
                                jade = new ap(function0, z20);
                                c0585q.f(jade);
                            }
                            s then = androidx.compose.ui.graphics.a.alpha(pVar, (Function1) jade).then(new EnterExitTransitionElement(a0Var2, u10, u11, axVar2, azVar2, function0, ajVar));
                            c0585q.purple(-7429769);
                            c0585q.quebec(z15);
                            s then2 = sVar.then(then.then(pVar));
                            jade2 = c0585q.jade();
                            if (jade2 == asVar5) {
                                jade2 = new t(abVar);
                                c0585q.f(jade2);
                            }
                            t tVar = (t) jade2;
                            long j5 = c0585q.magenta;
                            i11 = (int) (j5 ^ (j5 >>> 32));
                            I mike = c0585q.mike();
                            s charlie = T.a.charlie(then2, c0585q);
                            InterfaceC2552l.maroon.getClass();
                            C2550j c2550j = C2551k.bravo;
                            c0585q.white();
                            if (!c0585q.lime) {
                                c0585q.lima(c2550j);
                            } else {
                                c0585q.i();
                            }
                            C0564b.blue(C2551k.foxtrot, c0585q, tVar);
                            C0564b.blue(C2551k.echo, c0585q, mike);
                            C2549i c2549i = C2551k.golf;
                            if (!c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i11))) {
                                ad.blue(i11, c0585q, i11, c2549i);
                            }
                            C0564b.blue(C2551k.delta, c0585q, charlie);
                            ?? r72 = dVar;
                            r72.invoke(abVar, c0585q, Integer.valueOf((i20 >> 18) & 112));
                            c0585q.quebec(true);
                            c0585q.quebec(z15);
                            dVar3 = r72;
                        }
                    } else {
                        asVar5 = asVar4;
                    }
                    azVar2 = azVar3;
                    axVar2 = axVar5;
                    jade15 = new aj(u17, u15, a0Var2, axVar2, azVar2, u16);
                    c0585q.f(jade15);
                    aj ajVar2 = (aj) jade15;
                    p pVar2 = p.alpha;
                    boolean z202 = z18;
                    hotel = c0585q.hotel(z202) | c0585q.golf(function0);
                    jade = c0585q.jade();
                    if (!hotel) {
                    }
                    jade = new ap(function0, z202);
                    c0585q.f(jade);
                    s then3 = androidx.compose.ui.graphics.a.alpha(pVar2, (Function1) jade).then(new EnterExitTransitionElement(a0Var2, u10, u11, axVar2, azVar2, function0, ajVar2));
                    c0585q.purple(-7429769);
                    c0585q.quebec(z15);
                    s then22 = sVar.then(then3.then(pVar2));
                    jade2 = c0585q.jade();
                    if (jade2 == asVar5) {
                    }
                    t tVar2 = (t) jade2;
                    long j52 = c0585q.magenta;
                    i11 = (int) (j52 ^ (j52 >>> 32));
                    I mike2 = c0585q.mike();
                    s charlie2 = T.a.charlie(then22, c0585q);
                    InterfaceC2552l.maroon.getClass();
                    C2550j c2550j2 = C2551k.bravo;
                    c0585q.white();
                    if (!c0585q.lime) {
                    }
                    C0564b.blue(C2551k.foxtrot, c0585q, tVar2);
                    C0564b.blue(C2551k.echo, c0585q, mike2);
                    C2549i c2549i2 = C2551k.golf;
                    if (!c0585q.lime) {
                    }
                    ad.blue(i11, c0585q, i11, c2549i2);
                    C0564b.blue(C2551k.delta, c0585q, charlie2);
                    ?? r722 = dVar;
                    r722.invoke(abVar, c0585q, Integer.valueOf((i20 >> 18) & 112));
                    c0585q.quebec(true);
                    c0585q.quebec(z15);
                    dVar3 = r722;
                }
                c0585q.quebec(z15);
                dVar2 = dVar3;
            }
        } else {
            c0585q.ochre();
            dVar2 = dVar4;
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new u(a0Var, function1, sVar, axVar, azVar, lVar, dVar2, i4);
        }
    }

    public static final void bravo(an anVar, p pVar, ax axVar, az azVar, String str, d dVar, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        int i10;
        int i11;
        boolean z2;
        p pVar2;
        String str2;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-1238803325);
        if (c0585q.golf(anVar)) {
            i5 = 32;
        } else {
            i5 = 16;
        }
        int i12 = i4 | i5 | 384;
        if (c0585q.golf(axVar)) {
            i10 = 2048;
        } else {
            i10 = Barcode.FORMAT_UPC_E;
        }
        int i13 = i12 | i10;
        if (c0585q.golf(azVar)) {
            i11 = Http2.INITIAL_MAX_FRAME_SIZE;
        } else {
            i11 = 8192;
        }
        int i14 = i13 | i11 | 196608;
        if ((599185 & i14) != 599184) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i14 & 1, z2)) {
            p pVar3 = p.alpha;
            a0 delta = e0.delta(anVar, "AnimatedVisibility", c0585q, ((i14 >> 3) & 14) | 48);
            Object jade = c0585q.jade();
            if (jade == C0580l.alpha) {
                jade = w.red;
                c0585q.f(jade);
            }
            echo(delta, (Function1) jade, axVar, azVar, dVar, c0585q, (i14 & 57344) | (i14 & 7168) | 432 | 196608);
            pVar2 = pVar3;
            str2 = "AnimatedVisibility";
        } else {
            c0585q.ochre();
            pVar2 = pVar;
            str2 = str;
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new C0771i(anVar, pVar2, axVar, azVar, str2, dVar, i4);
        }
    }

    public static final void charlie(boolean z2, p pVar, ax axVar, az azVar, String str, d dVar, InterfaceC0581m interfaceC0581m, int i4, int i5) {
        int i10;
        int i11;
        int i12;
        d dVar2;
        boolean z10;
        p pVar2;
        ax axVar2;
        az azVar2;
        C0585q c0585q;
        String str2;
        ax axVar3;
        az azVar3;
        int i13;
        int i14;
        C0585q c0585q2 = (C0585q) interfaceC0581m;
        c0585q2.silver(1799879339);
        if ((i4 & 48) == 0) {
            if (c0585q2.hotel(z2)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i10 = i14 | i4;
        } else {
            i10 = i4;
        }
        int i15 = i10 | 384;
        int i16 = i5 & 4;
        if (i16 != 0) {
            i15 = i10 | 3456;
        } else if ((i4 & 3072) == 0) {
            if (c0585q2.golf(axVar)) {
                i11 = 2048;
            } else {
                i11 = Barcode.FORMAT_UPC_E;
            }
            i15 |= i11;
        }
        int i17 = i5 & 8;
        if (i17 != 0) {
            i15 |= 24576;
        } else if ((i4 & 24576) == 0) {
            if (c0585q2.golf(azVar)) {
                i12 = Http2.INITIAL_MAX_FRAME_SIZE;
            } else {
                i12 = 8192;
            }
            i15 |= i12;
        }
        int i18 = i15 | 196608;
        if ((1572864 & i4) == 0) {
            dVar2 = dVar;
            if (c0585q2.india(dVar2)) {
                i13 = 1048576;
            } else {
                i13 = 524288;
            }
            i18 |= i13;
        } else {
            dVar2 = dVar;
        }
        if ((599185 & i18) != 599184) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (c0585q2.magenta(i18 & 1, z10)) {
            p pVar3 = p.alpha;
            if (i16 != 0) {
                axVar3 = ar.bravo(null, 3).alpha(ar.alpha(null, 15));
            } else {
                axVar3 = axVar;
            }
            if (i17 != 0) {
                azVar3 = ar.charlie(null, 3).alpha(ar.delta(null, 15));
            } else {
                azVar3 = azVar;
            }
            int i19 = i18 >> 3;
            a0 echo = e0.echo(Boolean.valueOf(z2), "AnimatedVisibility", c0585q2, (i19 & 14) | ((i18 >> 12) & 112), 0);
            Object jade = c0585q2.jade();
            if (jade == C0580l.alpha) {
                jade = w.silver;
                c0585q2.f(jade);
            }
            echo(echo, (Function1) jade, axVar3, azVar3, dVar2, c0585q2, (i18 & 57344) | (i18 & 896) | 48 | (i18 & 7168) | (i19 & 458752));
            azVar2 = azVar3;
            axVar2 = axVar3;
            pVar2 = pVar3;
            c0585q = c0585q2;
            str2 = "AnimatedVisibility";
        } else {
            c0585q2.ochre();
            pVar2 = pVar;
            axVar2 = axVar;
            azVar2 = azVar;
            c0585q = c0585q2;
            str2 = str;
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new C0144p(z2, pVar2, axVar2, azVar2, str2, dVar, i4, i5);
        }
    }

    public static final void delta(boolean z2, p pVar, ay ayVar, A a6, String str, d dVar, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        boolean z10;
        p pVar2;
        ay ayVar2;
        A a8;
        String str2;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-1448730565);
        if (c0585q.hotel(z2)) {
            i5 = 4;
        } else {
            i5 = 2;
        }
        int i10 = i4 | i5 | 28080;
        if ((74899 & i10) != 74898) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (c0585q.magenta(i10 & 1, z10)) {
            pVar2 = p.alpha;
            k kVar = T.d.f2059b;
            long j5 = 1;
            ay alpha = ar.bravo(null, 3).alpha(new ay(new M((B) null, new ac(kVar, w.e, AbstractC0779d.juliet(400.0f, new m((j5 & 4294967295L) | (j5 << 32)), 1)), (E) null, (LinkedHashMap) null, 59)));
            long j6 = 1;
            A alpha2 = new A(new M((B) null, new ac(kVar, w.f3433g, AbstractC0779d.juliet(400.0f, new m((j6 & 4294967295L) | (j6 << 32)), 1)), (E) null, (LinkedHashMap) null, 59)).alpha(ar.charlie(null, 3));
            a0 echo = e0.echo(Boolean.valueOf(z2), "AnimatedVisibility", c0585q, (i10 & 14) | 48, 0);
            Object jade = c0585q.jade();
            if (jade == C0580l.alpha) {
                jade = w.purple;
                c0585q.f(jade);
            }
            echo(echo, (Function1) jade, alpha, alpha2, dVar, c0585q, 224688);
            ayVar2 = alpha;
            str2 = "AnimatedVisibility";
            a8 = alpha2;
        } else {
            c0585q.ochre();
            pVar2 = pVar;
            ayVar2 = ayVar;
            a8 = a6;
            str2 = str;
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new x(z2, pVar2, ayVar2, a8, str2, dVar, i4);
        }
    }

    public static final void echo(a0 a0Var, Function1 function1, ax axVar, az azVar, d dVar, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        ax axVar2;
        az azVar2;
        d dVar2;
        boolean z2;
        boolean z10;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        p pVar = p.alpha;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(1706321816);
        if ((i4 & 6) == 0) {
            if (c0585q.golf(a0Var)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i5 = i15 | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            if (c0585q.india(function1)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i5 |= i14;
        }
        if ((i4 & 384) == 0) {
            if (c0585q.golf(pVar)) {
                i13 = Barcode.FORMAT_QR_CODE;
            } else {
                i13 = 128;
            }
            i5 |= i13;
        }
        if ((i4 & 3072) == 0) {
            axVar2 = axVar;
            if (c0585q.golf(axVar2)) {
                i12 = 2048;
            } else {
                i12 = Barcode.FORMAT_UPC_E;
            }
            i5 |= i12;
        } else {
            axVar2 = axVar;
        }
        if ((i4 & 24576) == 0) {
            azVar2 = azVar;
            if (c0585q.golf(azVar2)) {
                i11 = Http2.INITIAL_MAX_FRAME_SIZE;
            } else {
                i11 = 8192;
            }
            i5 |= i11;
        } else {
            azVar2 = azVar;
        }
        if ((i4 & 196608) == 0) {
            dVar2 = dVar;
            if (c0585q.india(dVar2)) {
                i10 = 131072;
            } else {
                i10 = 65536;
            }
            i5 |= i10;
        } else {
            dVar2 = dVar;
        }
        boolean z11 = true;
        if ((74899 & i5) != 74898) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i5 & 1, z2)) {
            int i16 = i5 & 112;
            if (i16 == 32) {
                z10 = true;
            } else {
                z10 = false;
            }
            int i17 = i5 & 14;
            if (i17 != 4) {
                z11 = false;
            }
            boolean z12 = z10 | z11;
            Object jade = c0585q.jade();
            as asVar = C0580l.alpha;
            if (z12 || jade == asVar) {
                jade = new y(function1, a0Var);
                c0585q.f(jade);
            }
            s bravo = androidx.compose.ui.layout.a.bravo((Xd.m) jade);
            Object jade2 = c0585q.jade();
            if (jade2 == asVar) {
                jade2 = C0772j.red;
                c0585q.f(jade2);
            }
            alpha(a0Var, function1, bravo, axVar2, azVar2, (l) jade2, dVar2, c0585q, ((i5 << 6) & 29360128) | 196608 | i17 | i16 | (i5 & 7168) | (57344 & i5));
        } else {
            c0585q.ochre();
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new z(a0Var, function1, axVar, azVar, dVar, i4, 0);
        }
    }

    public static final ai foxtrot(a0 a0Var, Function1 function1, Object obj, InterfaceC0581m interfaceC0581m) {
        ai aiVar;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.pink(-422486105, a0Var);
        boolean hotel = a0Var.hotel();
        G3.a aVar = a0Var.alpha;
        if (hotel) {
            c0585q.purple(-212146657);
            c0585q.quebec(false);
            if (((Boolean) function1.invoke(obj)).booleanValue()) {
                aiVar = ai.purple;
            } else if (((Boolean) function1.invoke(aVar.L())).booleanValue()) {
                aiVar = ai.red;
            } else {
                aiVar = ai.alpha;
            }
        } else {
            c0585q.purple(-211872524);
            Object jade = c0585q.jade();
            if (jade == C0580l.alpha) {
                jade = C0564b.zulu(Boolean.FALSE);
                c0585q.f(jade);
            }
            androidx.compose.runtime.ax axVar = (androidx.compose.runtime.ax) jade;
            if (((Boolean) function1.invoke(aVar.L())).booleanValue()) {
                axVar.setValue(Boolean.TRUE);
            }
            if (((Boolean) function1.invoke(obj)).booleanValue()) {
                aiVar = ai.purple;
            } else if (((Boolean) axVar.getValue()).booleanValue()) {
                aiVar = ai.red;
            } else {
                aiVar = ai.alpha;
            }
            c0585q.quebec(false);
        }
        c0585q.quebec(false);
        return aiVar;
    }
}
