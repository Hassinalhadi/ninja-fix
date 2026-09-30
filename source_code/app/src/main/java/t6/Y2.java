package t6;

import Y1.ag;
import a2.C0374aa;
import a2.C0375ab;
import a2.C0383h;
import a2.C0389n;
import a2.C0393r;
import a2.C0394s;
import a2.C0399x;
import a2.C0400y;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.runtime.ax;
import androidx.compose.runtime.t0;
import bx.az;
import com.airbnb.lottie.compose.LottieConstants;
import com.google.mlkit.vision.barcode.common.Barcode;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;
import s6.J4;
import s6.X6;
import t6.Y2;

/* loaded from: classes2.dex */
public abstract class Y2 {
    public static final void alpha(final Y1.ag agVar, final Y1.ac graph, final T.s sVar, final T.f fVar, final Function1 function1, final Function1 function12, final Function1 function13, final Function1 function14, final Function1 function15, InterfaceC0581m interfaceC0581m, final int i4) {
        int i5;
        final T.f fVar2;
        C0383h c0383h;
        boolean z2;
        final C0383h c0383h2;
        androidx.compose.runtime.ax axVar;
        androidx.compose.runtime.aw awVar;
        androidx.navigation.internal.g gVar;
        C0585q c0585q;
        androidx.navigation.internal.g gVar2;
        C0389n c0389n;
        C0389n c0389n2;
        boolean z10;
        boolean z11;
        R.e eVar;
        bv.af afVar;
        int i10;
        boolean z12;
        boolean z13;
        Function1 function16;
        boolean z14;
        androidx.compose.runtime.D0 d02;
        C0389n c0389n3;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        C0585q c0585q2 = (C0585q) interfaceC0581m;
        c0585q2.silver(-1964664536);
        if ((i4 & 6) == 0) {
            if (c0585q2.india(agVar)) {
                i19 = 4;
            } else {
                i19 = 2;
            }
            i5 = i19 | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            if (c0585q2.india(graph)) {
                i18 = 32;
            } else {
                i18 = 16;
            }
            i5 |= i18;
        }
        if ((i4 & 384) == 0) {
            if (c0585q2.golf(sVar)) {
                i17 = Barcode.FORMAT_QR_CODE;
            } else {
                i17 = 128;
            }
            i5 |= i17;
        }
        if ((i4 & 3072) == 0) {
            fVar2 = fVar;
            if (c0585q2.golf(fVar2)) {
                i16 = 2048;
            } else {
                i16 = Barcode.FORMAT_UPC_E;
            }
            i5 |= i16;
        } else {
            fVar2 = fVar;
        }
        if ((i4 & 24576) == 0) {
            if (c0585q2.india(function1)) {
                i15 = Http2.INITIAL_MAX_FRAME_SIZE;
            } else {
                i15 = 8192;
            }
            i5 |= i15;
        }
        if ((i4 & 196608) == 0) {
            if (c0585q2.india(function12)) {
                i14 = 131072;
            } else {
                i14 = 65536;
            }
            i5 |= i14;
        }
        if ((i4 & 1572864) == 0) {
            if (c0585q2.india(function13)) {
                i13 = 1048576;
            } else {
                i13 = 524288;
            }
            i5 |= i13;
        }
        if ((i4 & 12582912) == 0) {
            if (c0585q2.india(function14)) {
                i12 = 8388608;
            } else {
                i12 = 4194304;
            }
            i5 |= i12;
        }
        if ((i4 & 100663296) == 0) {
            if (c0585q2.india(function15)) {
                i11 = 67108864;
            } else {
                i11 = 33554432;
            }
            i5 |= i11;
        }
        if ((i5 & 38347923) == 38347922 && c0585q2.bronze()) {
            c0585q2.ochre();
            c0585q = c0585q2;
        } else {
            c0585q2.orange();
            int i20 = i4 & 1;
            Object obj = C0580l.alpha;
            if (i20 != 0 && !c0585q2.beige()) {
                c0585q2.ochre();
            }
            c0585q2.romeo();
            Object obj2 = (androidx.lifecycle.al) c0585q2.kilo(R1.e.alpha);
            androidx.lifecycle.d0 alpha = U1.a.alpha(c0585q2);
            if (alpha != null) {
                agVar.india(alpha.getViewModelStore());
                Intrinsics.echo(graph, "graph");
                androidx.navigation.internal.g gVar3 = agVar.bravo;
                gVar3.getClass();
                gVar3.romeo(graph, null);
                Y1.at bravo = gVar3.sierra.bravo("composable");
                if (bravo instanceof C0383h) {
                    c0383h = (C0383h) bravo;
                } else {
                    c0383h = null;
                }
                if (c0383h == null) {
                    androidx.compose.runtime.Q uniform = c0585q2.uniform();
                    if (uniform != null) {
                        final int i21 = 2;
                        uniform.delta = new Xd.l() { // from class: a2.v
                            @Override // Xd.l
                            public final Object invoke(Object obj3, Object obj4) {
                                switch (i21) {
                                    case 0:
                                        ((Integer) obj4).getClass();
                                        int cyan = C0564b.cyan(i4 | 1);
                                        Function1 function17 = function14;
                                        Function1 function18 = function15;
                                        Y2.alpha(agVar, graph, sVar, fVar2, function1, function12, function13, function17, function18, (InterfaceC0581m) obj3, cyan);
                                        return Unit.INSTANCE;
                                    case 1:
                                        ((Integer) obj4).getClass();
                                        int cyan2 = C0564b.cyan(i4 | 1);
                                        Function1 function19 = function14;
                                        Function1 function110 = function15;
                                        Y2.alpha(agVar, graph, sVar, fVar2, function1, function12, function13, function19, function110, (InterfaceC0581m) obj3, cyan2);
                                        return Unit.INSTANCE;
                                    default:
                                        ((Integer) obj4).getClass();
                                        int cyan3 = C0564b.cyan(i4 | 1);
                                        Function1 function111 = function14;
                                        Function1 function112 = function15;
                                        Y2.alpha(agVar, graph, sVar, fVar2, function1, function12, function13, function111, function112, (InterfaceC0581m) obj3, cyan3);
                                        return Unit.INSTANCE;
                                }
                            }
                        };
                        return;
                    }
                    return;
                }
                androidx.compose.runtime.ax mike = C0564b.mike(c0383h.bravo().echo, c0585q2, 0);
                Object jade = c0585q2.jade();
                if (jade == obj) {
                    jade = C0564b.victor(0.0f);
                    c0585q2.f(jade);
                }
                androidx.compose.runtime.aw awVar2 = (androidx.compose.runtime.aw) jade;
                Object jade2 = c0585q2.jade();
                if (jade2 == obj) {
                    jade2 = C0564b.zulu(Boolean.FALSE);
                    c0585q2.f(jade2);
                }
                final androidx.compose.runtime.ax axVar2 = (androidx.compose.runtime.ax) jade2;
                if (((List) mike.getValue()).size() > 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                boolean golf = c0585q2.golf(mike) | c0585q2.india(c0383h);
                Object jade3 = c0585q2.jade();
                if (!golf && jade3 != obj) {
                    C0383h c0383h3 = c0383h;
                    axVar = mike;
                    c0383h2 = c0383h3;
                    awVar = awVar2;
                } else {
                    C0383h c0383h4 = c0383h;
                    jade3 = new C0399x(c0383h4, mike, awVar2, axVar2, null);
                    c0383h2 = c0383h4;
                    axVar = mike;
                    awVar = awVar2;
                    c0585q2.f(jade3);
                }
                Y3.alpha(z2, (Xd.l) jade3, c0585q2, 0);
                boolean india = c0585q2.india(agVar) | c0585q2.india(obj2);
                Object jade4 = c0585q2.jade();
                if (india || jade4 == obj) {
                    jade4 = new Cb.ad(29, agVar, obj2);
                    c0585q2.f(jade4);
                }
                C0564b.delta(obj2, (Function1) jade4, c0585q2);
                R.e foxtrot = R.l.foxtrot(c0585q2);
                androidx.compose.runtime.ax mike2 = C0564b.mike(gVar3.india, c0585q2, 0);
                Object jade5 = c0585q2.jade();
                if (jade5 == obj) {
                    jade5 = C0564b.quebec(new Cb.u(mike2, 8));
                    c0585q2.f(jade5);
                }
                androidx.compose.runtime.D0 d03 = (androidx.compose.runtime.D0) jade5;
                Y1.l lVar = (Y1.l) CollectionsKt.olive((List) d03.getValue());
                Object jade6 = c0585q2.jade();
                if (jade6 == obj) {
                    int i22 = bv.ap.alpha;
                    gVar = gVar3;
                    jade6 = new bv.af(6);
                    c0585q2.f(jade6);
                } else {
                    gVar = gVar3;
                }
                bv.af afVar2 = (bv.af) jade6;
                if (lVar != null) {
                    c0585q2.purple(-1797897781);
                    boolean india2 = c0585q2.india(c0383h2);
                    if ((((3670016 & i5) ^ 1572864) > 1048576 && c0585q2.golf(function13)) || (i5 & 1572864) == 1048576) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    boolean z15 = india2 | z10;
                    if ((57344 & i5) == 16384) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    boolean z16 = z15 | z11;
                    Object jade7 = c0585q2.jade();
                    if (!z16 && jade7 != obj) {
                        eVar = foxtrot;
                        gVar2 = gVar;
                        afVar = afVar2;
                        i10 = i5;
                    } else {
                        final int i23 = 0;
                        eVar = foxtrot;
                        gVar2 = gVar;
                        afVar = afVar2;
                        i10 = i5;
                        Object obj3 = new Function1() { // from class: a2.q
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj4) {
                                Function1 function17 = function13;
                                Function1 function18 = function1;
                                ax axVar3 = axVar2;
                                C0383h c0383h5 = c0383h2;
                                bx.s sVar2 = (bx.s) obj4;
                                switch (i23) {
                                    case 0:
                                        Y1.aa aaVar = ((Y1.l) sVar2.charlie()).purple;
                                        Intrinsics.charlie(aaVar, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
                                        C0382g c0382g = (C0382g) aaVar;
                                        if (!((Boolean) ((t0) c0383h5.charlie).getValue()).booleanValue() && !((Boolean) axVar3.getValue()).booleanValue()) {
                                            int i24 = Y1.aa.white;
                                            for (Y1.aa aaVar2 : Y1.y.bravo(c0382g)) {
                                                if (aaVar2 instanceof C0382g) {
                                                    ((C0382g) aaVar2).getClass();
                                                } else if (aaVar2 instanceof C0380e) {
                                                    ((C0380e) aaVar2).getClass();
                                                }
                                            }
                                            return (bx.ax) function18.invoke(sVar2);
                                        }
                                        int i25 = Y1.aa.white;
                                        for (Y1.aa aaVar3 : Y1.y.bravo(c0382g)) {
                                            if (aaVar3 instanceof C0382g) {
                                                ((C0382g) aaVar3).getClass();
                                            } else if (aaVar3 instanceof C0380e) {
                                                ((C0380e) aaVar3).getClass();
                                            }
                                        }
                                        return (bx.ax) function17.invoke(sVar2);
                                    default:
                                        Y1.aa aaVar4 = ((Y1.l) sVar2.alpha()).purple;
                                        Intrinsics.charlie(aaVar4, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
                                        C0382g c0382g2 = (C0382g) aaVar4;
                                        if (!((Boolean) ((t0) c0383h5.charlie).getValue()).booleanValue() && !((Boolean) axVar3.getValue()).booleanValue()) {
                                            int i26 = Y1.aa.white;
                                            for (Y1.aa aaVar5 : Y1.y.bravo(c0382g2)) {
                                                if (aaVar5 instanceof C0382g) {
                                                    ((C0382g) aaVar5).getClass();
                                                } else if (aaVar5 instanceof C0380e) {
                                                    ((C0380e) aaVar5).getClass();
                                                }
                                            }
                                            return (az) function18.invoke(sVar2);
                                        }
                                        int i27 = Y1.aa.white;
                                        for (Y1.aa aaVar6 : Y1.y.bravo(c0382g2)) {
                                            if (aaVar6 instanceof C0382g) {
                                                ((C0382g) aaVar6).getClass();
                                            } else if (aaVar6 instanceof C0380e) {
                                                ((C0380e) aaVar6).getClass();
                                            }
                                        }
                                        return (az) function17.invoke(sVar2);
                                }
                            }
                        };
                        c0585q2.f(obj3);
                        jade7 = obj3;
                    }
                    Function1 function17 = (Function1) jade7;
                    boolean india3 = c0585q2.india(c0383h2);
                    if ((((29360128 & i10) ^ 12582912) > 8388608 && c0585q2.golf(function14)) || (i10 & 12582912) == 8388608) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    boolean z17 = india3 | z12;
                    if ((458752 & i10) == 131072) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    boolean z18 = z17 | z13;
                    Object jade8 = c0585q2.jade();
                    if (!z18 && jade8 != obj) {
                        function16 = function17;
                    } else {
                        final int i24 = 1;
                        function16 = function17;
                        Object obj4 = new Function1() { // from class: a2.q
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj42) {
                                Function1 function172 = function14;
                                Function1 function18 = function12;
                                ax axVar3 = axVar2;
                                C0383h c0383h5 = c0383h2;
                                bx.s sVar2 = (bx.s) obj42;
                                switch (i24) {
                                    case 0:
                                        Y1.aa aaVar = ((Y1.l) sVar2.charlie()).purple;
                                        Intrinsics.charlie(aaVar, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
                                        C0382g c0382g = (C0382g) aaVar;
                                        if (!((Boolean) ((t0) c0383h5.charlie).getValue()).booleanValue() && !((Boolean) axVar3.getValue()).booleanValue()) {
                                            int i242 = Y1.aa.white;
                                            for (Y1.aa aaVar2 : Y1.y.bravo(c0382g)) {
                                                if (aaVar2 instanceof C0382g) {
                                                    ((C0382g) aaVar2).getClass();
                                                } else if (aaVar2 instanceof C0380e) {
                                                    ((C0380e) aaVar2).getClass();
                                                }
                                            }
                                            return (bx.ax) function18.invoke(sVar2);
                                        }
                                        int i25 = Y1.aa.white;
                                        for (Y1.aa aaVar3 : Y1.y.bravo(c0382g)) {
                                            if (aaVar3 instanceof C0382g) {
                                                ((C0382g) aaVar3).getClass();
                                            } else if (aaVar3 instanceof C0380e) {
                                                ((C0380e) aaVar3).getClass();
                                            }
                                        }
                                        return (bx.ax) function172.invoke(sVar2);
                                    default:
                                        Y1.aa aaVar4 = ((Y1.l) sVar2.alpha()).purple;
                                        Intrinsics.charlie(aaVar4, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
                                        C0382g c0382g2 = (C0382g) aaVar4;
                                        if (!((Boolean) ((t0) c0383h5.charlie).getValue()).booleanValue() && !((Boolean) axVar3.getValue()).booleanValue()) {
                                            int i26 = Y1.aa.white;
                                            for (Y1.aa aaVar5 : Y1.y.bravo(c0382g2)) {
                                                if (aaVar5 instanceof C0382g) {
                                                    ((C0382g) aaVar5).getClass();
                                                } else if (aaVar5 instanceof C0380e) {
                                                    ((C0380e) aaVar5).getClass();
                                                }
                                            }
                                            return (az) function18.invoke(sVar2);
                                        }
                                        int i27 = Y1.aa.white;
                                        for (Y1.aa aaVar6 : Y1.y.bravo(c0382g2)) {
                                            if (aaVar6 instanceof C0382g) {
                                                ((C0382g) aaVar6).getClass();
                                            } else if (aaVar6 instanceof C0380e) {
                                                ((C0380e) aaVar6).getClass();
                                            }
                                        }
                                        return (az) function172.invoke(sVar2);
                                }
                            }
                        };
                        c0585q2.f(obj4);
                        jade8 = obj4;
                    }
                    Function1 function18 = (Function1) jade8;
                    if ((234881024 & i10) == 67108864) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    Object jade9 = c0585q2.jade();
                    if (z14 || jade9 == obj) {
                        jade9 = new N2.ae(4, function15);
                        c0585q2.f(jade9);
                    }
                    Function1 function19 = (Function1) jade9;
                    Boolean bool = Boolean.TRUE;
                    boolean india4 = c0585q2.india(c0383h2);
                    androidx.compose.runtime.ax axVar3 = axVar2;
                    Object jade10 = c0585q2.jade();
                    if (india4 || jade10 == obj) {
                        jade10 = new C0393r(0, d03, c0383h2);
                        c0585q2.f(jade10);
                    }
                    C0564b.delta(bool, (Function1) jade10, c0585q2);
                    Object jade11 = c0585q2.jade();
                    if (jade11 == obj) {
                        jade11 = new bz.F(lVar);
                        c0585q2.f(jade11);
                    }
                    bz.F f5 = (bz.F) jade11;
                    bz.a0 delta = bz.e0.delta(f5, "entry", c0585q2, 56);
                    if (((Boolean) axVar3.getValue()).booleanValue()) {
                        c0585q2.purple(-1795663766);
                        Float valueOf = Float.valueOf(((androidx.compose.runtime.n0) awVar).juliet());
                        boolean golf2 = c0585q2.golf(axVar) | c0585q2.india(f5);
                        Object jade12 = c0585q2.jade();
                        if (!golf2 && jade12 != obj) {
                            d02 = d03;
                        } else {
                            d02 = d03;
                            jade12 = new C0400y(f5, axVar, awVar, null);
                            c0585q2.f(jade12);
                        }
                        C0564b.foxtrot((Xd.l) jade12, c0585q2, valueOf);
                        c0585q2.quebec(false);
                        c0389n3 = null;
                    } else {
                        d02 = d03;
                        c0585q2.purple(-1795408729);
                        boolean india5 = c0585q2.india(f5) | c0585q2.india(lVar) | c0585q2.golf(delta);
                        Object jade13 = c0585q2.jade();
                        if (!india5 && jade13 != obj) {
                            c0389n3 = null;
                        } else {
                            c0389n3 = null;
                            jade13 = new C0374aa(f5, lVar, delta, null);
                            c0585q2.f(jade13);
                        }
                        C0564b.foxtrot((Xd.l) jade13, c0585q2, lVar);
                        c0585q2.quebec(false);
                    }
                    boolean india6 = c0585q2.india(afVar) | c0585q2.india(c0383h2) | c0585q2.golf(function16) | c0585q2.golf(function18) | c0585q2.golf(function19);
                    Object jade14 = c0585q2.jade();
                    if (india6 || jade14 == obj) {
                        jade14 = new C0394s(afVar, c0383h2, function16, function18, function19, d02, axVar3);
                        axVar3 = axVar3;
                        c0585q2.f(jade14);
                    }
                    Function1 function110 = (Function1) jade14;
                    Object jade15 = c0585q2.jade();
                    if (jade15 == obj) {
                        jade15 = new X9.i(28);
                        c0585q2.f(jade15);
                    }
                    androidx.compose.runtime.D0 d04 = d02;
                    androidx.compose.animation.a.alpha(delta, sVar, function110, fVar, (Function1) jade15, P.e.echo(820763100, new Ec.k(f5, lVar, eVar, axVar3, d04), c0585q2), c0585q2, ((i10 >> 3) & 112) | 221184 | (i10 & 7168));
                    c0585q = c0585q2;
                    Object L4 = delta.alpha.L();
                    Object value = ((androidx.compose.runtime.t0) delta.delta).getValue();
                    boolean golf3 = c0585q.golf(delta) | c0585q.india(agVar) | c0585q.india(lVar) | c0585q.india(c0383h2) | c0585q.india(afVar);
                    Object jade16 = c0585q.jade();
                    if (!golf3 && jade16 != obj) {
                        c0389n = c0389n3;
                    } else {
                        c0389n = c0389n3;
                        Object c0375ab = new C0375ab(delta, agVar, lVar, afVar, d04, c0383h2, null);
                        c0585q.f(c0375ab);
                        jade16 = c0375ab;
                    }
                    C0564b.golf(L4, value, (Xd.l) jade16, c0585q);
                    c0585q.quebec(false);
                } else {
                    c0585q = c0585q2;
                    gVar2 = gVar;
                    c0389n = null;
                    c0585q.purple(-1790256870);
                    c0585q.quebec(false);
                }
                Y1.at bravo2 = gVar2.sierra.bravo("dialog");
                if (bravo2 instanceof C0389n) {
                    c0389n2 = (C0389n) bravo2;
                } else {
                    c0389n2 = c0389n;
                }
                if (c0389n2 == null) {
                    androidx.compose.runtime.Q uniform2 = c0585q.uniform();
                    if (uniform2 != null) {
                        final int i25 = 0;
                        uniform2.delta = new Xd.l() { // from class: a2.v
                            @Override // Xd.l
                            public final Object invoke(Object obj32, Object obj42) {
                                switch (i25) {
                                    case 0:
                                        ((Integer) obj42).getClass();
                                        int cyan = C0564b.cyan(i4 | 1);
                                        Function1 function172 = function14;
                                        Function1 function182 = function15;
                                        Y2.alpha(agVar, graph, sVar, fVar, function1, function12, function13, function172, function182, (InterfaceC0581m) obj32, cyan);
                                        return Unit.INSTANCE;
                                    case 1:
                                        ((Integer) obj42).getClass();
                                        int cyan2 = C0564b.cyan(i4 | 1);
                                        Function1 function192 = function14;
                                        Function1 function1102 = function15;
                                        Y2.alpha(agVar, graph, sVar, fVar, function1, function12, function13, function192, function1102, (InterfaceC0581m) obj32, cyan2);
                                        return Unit.INSTANCE;
                                    default:
                                        ((Integer) obj42).getClass();
                                        int cyan3 = C0564b.cyan(i4 | 1);
                                        Function1 function111 = function14;
                                        Function1 function112 = function15;
                                        Y2.alpha(agVar, graph, sVar, fVar, function1, function12, function13, function111, function112, (InterfaceC0581m) obj32, cyan3);
                                        return Unit.INSTANCE;
                                }
                            }
                        };
                        return;
                    }
                    return;
                }
                U2.alpha(c0389n2, c0585q, 0);
            } else {
                throw new IllegalStateException("NavHost requires a ViewModelStoreOwner to be provided via LocalViewModelStoreOwner");
            }
        }
        androidx.compose.runtime.Q uniform3 = c0585q.uniform();
        if (uniform3 != null) {
            final int i26 = 1;
            uniform3.delta = new Xd.l() { // from class: a2.v
                @Override // Xd.l
                public final Object invoke(Object obj32, Object obj42) {
                    switch (i26) {
                        case 0:
                            ((Integer) obj42).getClass();
                            int cyan = C0564b.cyan(i4 | 1);
                            Function1 function172 = function14;
                            Function1 function182 = function15;
                            Y2.alpha(agVar, graph, sVar, fVar, function1, function12, function13, function172, function182, (InterfaceC0581m) obj32, cyan);
                            return Unit.INSTANCE;
                        case 1:
                            ((Integer) obj42).getClass();
                            int cyan2 = C0564b.cyan(i4 | 1);
                            Function1 function192 = function14;
                            Function1 function1102 = function15;
                            Y2.alpha(agVar, graph, sVar, fVar, function1, function12, function13, function192, function1102, (InterfaceC0581m) obj32, cyan2);
                            return Unit.INSTANCE;
                        default:
                            ((Integer) obj42).getClass();
                            int cyan3 = C0564b.cyan(i4 | 1);
                            Function1 function111 = function14;
                            Function1 function112 = function15;
                            Y2.alpha(agVar, graph, sVar, fVar, function1, function12, function13, function111, function112, (InterfaceC0581m) obj32, cyan3);
                            return Unit.INSTANCE;
                    }
                }
            };
        }
    }

    public static final void bravo(final Y1.ag agVar, final Object obj, T.p pVar, T.k kVar, kotlin.collections.t tVar, Function1 function1, Function1 function12, Function1 function13, Function1 function14, final Function1 function15, InterfaceC0581m interfaceC0581m, final int i4) {
        int i5;
        T.p pVar2;
        T.k kVar2;
        Function1 function16;
        int i10;
        Function1 function17;
        Function1 function18;
        kotlin.collections.t tVar2;
        Function1 function19;
        boolean z2;
        final Function1 function110;
        C0585q c0585q;
        final Function1 function111;
        final Function1 function112;
        final T.k kVar3;
        final Function1 function113;
        final kotlin.collections.t tVar3;
        final T.p pVar3;
        int i11;
        C0585q c0585q2 = (C0585q) interfaceC0581m;
        c0585q2.silver(-1476019057);
        if (c0585q2.india(agVar)) {
            i5 = 4;
        } else {
            i5 = 2;
        }
        int i12 = i4 | i5;
        char c3 = 16;
        if ((i4 & 48) == 0) {
            if (c0585q2.india(obj)) {
                i11 = 32;
            } else {
                i11 = 16;
            }
            i12 |= i11;
        }
        int i13 = i12 | 316370304;
        if (c0585q2.india(function15)) {
            c3 = ' ';
        }
        int i14 = 6 | c3;
        if ((306783379 & i13) == 306783378 && (i14 & 19) == 18 && c0585q2.bronze()) {
            c0585q2.ochre();
            pVar3 = pVar;
            kVar3 = kVar;
            tVar3 = tVar;
            function111 = function1;
            function113 = function12;
            function110 = function13;
            c0585q = c0585q2;
            function112 = function14;
        } else {
            c0585q2.orange();
            int i15 = i4 & 1;
            androidx.compose.runtime.as asVar = C0580l.alpha;
            if (i15 != 0 && !c0585q2.beige()) {
                c0585q2.ochre();
                pVar2 = pVar;
                kVar2 = kVar;
                tVar2 = tVar;
                function16 = function1;
                function17 = function13;
                function19 = function14;
                i10 = i13 & (-2113929217);
                function18 = function12;
            } else {
                pVar2 = T.p.alpha;
                kVar2 = T.d.alpha;
                kotlin.collections.t tVar4 = kotlin.collections.t.alpha;
                Object jade = c0585q2.jade();
                if (jade == asVar) {
                    jade = new X9.i(24);
                    c0585q2.f(jade);
                }
                function16 = (Function1) jade;
                Object jade2 = c0585q2.jade();
                if (jade2 == asVar) {
                    jade2 = new X9.i(25);
                    c0585q2.f(jade2);
                }
                i10 = i13 & (-2113929217);
                function17 = function16;
                function18 = (Function1) jade2;
                tVar2 = tVar4;
                function19 = function18;
            }
            c0585q2.romeo();
            boolean golf = c0585q2.golf(null) | c0585q2.golf(obj);
            if ((i14 & 112) == 32) {
                z2 = true;
            } else {
                z2 = false;
            }
            boolean z10 = z2 | golf;
            Object jade3 = c0585q2.jade();
            if (z10 || jade3 == asVar) {
                Y1.ad adVar = new Y1.ad(agVar.bravo.sierra, obj, tVar2);
                function15.invoke(adVar);
                jade3 = adVar.alpha();
                c0585q2.f(jade3);
            }
            Function1 function114 = function18;
            Function1 function115 = function16;
            T.p pVar4 = pVar2;
            T.k kVar4 = kVar2;
            Function1 function116 = function19;
            alpha(agVar, (Y1.ac) jade3, pVar4, kVar4, function115, function114, function17, function116, null, c0585q2, (i10 & 8078) | 100884480);
            function110 = function17;
            c0585q = c0585q2;
            function111 = function115;
            function112 = function116;
            kVar3 = kVar4;
            function113 = function114;
            tVar3 = tVar2;
            pVar3 = pVar4;
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new Xd.l() { // from class: a2.t
                @Override // Xd.l
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int cyan = C0564b.cyan(i4 | 1);
                    Function1 function117 = function112;
                    Function1 function118 = function15;
                    Y2.bravo(ag.this, obj, pVar3, kVar3, tVar3, function111, function113, function110, function117, function118, (InterfaceC0581m) obj2, cyan);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void charlie(final Y1.ag agVar, final String str, T.p pVar, T.k kVar, Function1 function1, Function1 function12, Function1 function13, Function1 function14, final Function1 function15, InterfaceC0581m interfaceC0581m, final int i4) {
        int i5;
        int i10;
        char c3;
        T.p pVar2;
        T.k kVar2;
        Function1 function16;
        Function1 function17;
        int i11;
        char c4;
        Function1 function18;
        Function1 function19;
        boolean z2;
        final Function1 function110;
        final Function1 function111;
        final Function1 function112;
        final Function1 function113;
        final T.k kVar3;
        final T.p pVar3;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(1840250294);
        if (c0585q.india(agVar)) {
            i5 = 4;
        } else {
            i5 = 2;
        }
        int i12 = i4 | i5;
        if (c0585q.golf(str)) {
            i10 = 32;
        } else {
            i10 = 16;
        }
        int i13 = i12 | i10 | 844852608;
        if (c0585q.india(function15)) {
            c3 = 4;
        } else {
            c3 = 2;
        }
        if ((306783379 & i13) == 306783378 && (c3 & 3) == 2 && c0585q.bronze()) {
            c0585q.ochre();
            pVar3 = pVar;
            kVar3 = kVar;
            function113 = function1;
            function112 = function12;
            function111 = function13;
            function110 = function14;
        } else {
            c0585q.orange();
            int i14 = i4 & 1;
            androidx.compose.runtime.as asVar = C0580l.alpha;
            if (i14 != 0 && !c0585q.beige()) {
                c0585q.ochre();
                i11 = i13 & (-264241153);
                pVar2 = pVar;
                kVar2 = kVar;
                function17 = function12;
                function16 = function13;
                function19 = function14;
                c4 = c3;
                function18 = function1;
            } else {
                pVar2 = T.p.alpha;
                kVar2 = T.d.alpha;
                Object jade = c0585q.jade();
                if (jade == asVar) {
                    jade = new X9.i(26);
                    c0585q.f(jade);
                }
                function16 = (Function1) jade;
                Object jade2 = c0585q.jade();
                if (jade2 == asVar) {
                    jade2 = new X9.i(27);
                    c0585q.f(jade2);
                }
                function17 = (Function1) jade2;
                i11 = i13 & (-264241153);
                c4 = c3;
                function18 = function16;
                function19 = function17;
            }
            c0585q.romeo();
            boolean z10 = true;
            if ((i11 & 112) == 32) {
                z2 = true;
            } else {
                z2 = false;
            }
            if ((c4 & 14) != 4) {
                z10 = false;
            }
            boolean z11 = z2 | z10;
            Object jade3 = c0585q.jade();
            if (z11 || jade3 == asVar) {
                Y1.ad adVar = new Y1.ad(agVar.bravo.sierra, str);
                function15.invoke(adVar);
                jade3 = adVar.alpha();
                c0585q.f(jade3);
            }
            T.k kVar4 = kVar2;
            Function1 function114 = function16;
            Function1 function115 = function17;
            alpha(agVar, (Y1.ac) jade3, pVar2, kVar4, function18, function115, function114, function19, null, c0585q, (i11 & 8078) | 100884480);
            function110 = function19;
            function111 = function114;
            function112 = function115;
            function113 = function18;
            kVar3 = kVar4;
            pVar3 = pVar2;
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new Xd.l(str, pVar3, kVar3, function113, function112, function111, function110, function15, i4) { // from class: a2.u

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ Function1 f2598a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ Function1 f2599b;
                public final /* synthetic */ String purple;
                public final /* synthetic */ T.p red;
                public final /* synthetic */ T.k silver;
                public final /* synthetic */ Function1 teal;
                public final /* synthetic */ Function1 white;
                public final /* synthetic */ Function1 yellow;

                @Override // Xd.l
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int cyan = C0564b.cyan(1);
                    Function1 function116 = this.f2598a;
                    Function1 function117 = this.f2599b;
                    Y2.charlie(ag.this, this.purple, this.red, this.silver, this.teal, this.white, this.yellow, function116, function117, (InterfaceC0581m) obj, cyan);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final long delta(long j5, boolean z2, int i4, float f5) {
        int hotel;
        if ((z2 || i4 == 2 || i4 == 4 || i4 == 5) && Q0.a.delta(j5)) {
            hotel = Q0.a.hotel(j5);
        } else {
            hotel = LottieConstants.IterateForever;
        }
        if (Q0.a.juliet(j5) != hotel) {
            hotel = J4.delta(n.at.oscar(f5), Q0.a.juliet(j5), hotel);
        }
        return X6.bravo(0, hotel, 0, Q0.a.golf(j5));
    }
}
