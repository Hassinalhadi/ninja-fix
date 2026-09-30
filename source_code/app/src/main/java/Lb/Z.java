package Lb;

import Jb.C0195c;
import Jb.C0206n;
import android.content.Context;
import androidx.compose.foundation.layout.AbstractC0538d;
import androidx.compose.foundation.layout.AbstractC0542h;
import androidx.compose.foundation.layout.AbstractC0547m;
import androidx.compose.foundation.layout.C0540f;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.app.network.network.models.ActiveShiftSummary;
import com.app.network.network.models.Captain;
import com.app.network.network.models.Order;
import com.app.network.network.models.UserInfo;
import com.google.mlkit.vision.barcode.common.Barcode;
import delivery.samurai.android.R;
import delivery.samurai.android.ui.allocation.OrdersViewModel;
import delivery.samurai.android.ui.homev2.HomeViewModelV2;
import delivery.samurai.android.ui.homev2.OrdersFragmentV2;
import i.AbstractC1876y;
import i.C1859h;
import i.C1860i;
import i.C1874w;
import i.InterfaceC1854c;
import i.InterfaceC1869r;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import qb.C2445l;
import r3.C2492a;
import s0.C2549i;
import s0.C2550j;
import s0.C2551k;
import s0.InterfaceC2552l;
import s6.A7;
import s6.AbstractC2616b5;
import s6.AbstractC2717m7;
import s6.AbstractC2833z7;
import s6.B7;
import s6.V6;
import t6.AbstractC3036o2;
import t6.AbstractC3086y3;

/* loaded from: classes2.dex */
public abstract class Z {
    public static final /* synthetic */ int alpha = 0;

    static {
        ActiveShiftSummary activeShiftSummary = new ActiveShiftSummary();
        activeShiftSummary.setOrdersDelivered(5);
        activeShiftSummary.setEarnedPoints(120);
        activeShiftSummary.setShiftFinishAt("2026-04-17T20:00:00.000+00:00");
        activeShiftSummary.setProgressPercentage(Double.valueOf(0.6d));
    }

    public static final void alpha(final UserInfo userInfo, final boolean z2, final boolean z10, final List orders, final boolean z11, final int i4, final int i5, final Sb.e eVar, final P.d dVar, final P.d dVar2, final Function0 onOfflineGoOnlineClick, final Function0 onAssetsClick, final Function0 onTransferClick, final Function1 onDisclaimerDeepLinkClick, final Function1 onOrderClick, final Function0 onRefresh, final Function0 onGoToWorkingAreaClick, final Function0 onGoToZonesClick, final Function0 onOpenWifiSettings, C1874w c1874w, InterfaceC0581m interfaceC0581m, final int i10, final int i11) {
        int i12;
        C0585q c0585q;
        final C1874w c1874w2;
        int i13;
        final C1874w alpha2;
        Captain captain;
        Intrinsics.echo(orders, "orders");
        Intrinsics.echo(onOfflineGoOnlineClick, "onOfflineGoOnlineClick");
        Intrinsics.echo(onAssetsClick, "onAssetsClick");
        Intrinsics.echo(onTransferClick, "onTransferClick");
        Intrinsics.echo(onDisclaimerDeepLinkClick, "onDisclaimerDeepLinkClick");
        Intrinsics.echo(onOrderClick, "onOrderClick");
        Intrinsics.echo(onRefresh, "onRefresh");
        Intrinsics.echo(onGoToWorkingAreaClick, "onGoToWorkingAreaClick");
        Intrinsics.echo(onGoToZonesClick, "onGoToZonesClick");
        Intrinsics.echo(onOpenWifiSettings, "onOpenWifiSettings");
        C0585q c0585q2 = (C0585q) interfaceC0581m;
        c0585q2.silver(1239881230);
        int i14 = i10 | (c0585q2.india(userInfo) ? 4 : 2) | (c0585q2.hotel(z2) ? 32 : 16) | (c0585q2.hotel(z10) ? 256 : 128);
        boolean india = c0585q2.india(orders);
        int i15 = Barcode.FORMAT_UPC_E;
        int i16 = i14 | (india ? 2048 : 1024) | (c0585q2.hotel(z11) ? 16384 : 8192) | (c0585q2.echo(i4) ? 131072 : 65536) | (c0585q2.echo(i5) ? 1048576 : 524288) | (c0585q2.golf(eVar) ? 8388608 : 4194304);
        if ((i11 & 6) == 0) {
            i12 = i11 | (c0585q2.india(onOfflineGoOnlineClick) ? 4 : 2);
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= c0585q2.india(onAssetsClick) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= c0585q2.india(onTransferClick) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            if (c0585q2.india(onDisclaimerDeepLinkClick)) {
                i15 = 2048;
            }
            i12 |= i15;
        }
        if ((i11 & 24576) == 0) {
            i12 |= c0585q2.india(onOrderClick) ? 16384 : 8192;
        }
        if ((196608 & i11) == 0) {
            i12 |= c0585q2.india(onRefresh) ? 131072 : 65536;
        }
        if ((1572864 & i11) == 0) {
            i12 |= c0585q2.india(onGoToWorkingAreaClick) ? 1048576 : 524288;
        }
        if ((12582912 & i11) == 0) {
            i12 |= c0585q2.india(onGoToZonesClick) ? 8388608 : 4194304;
        }
        if ((100663296 & i11) == 0) {
            i12 |= c0585q2.india(onOpenWifiSettings) ? 67108864 : 33554432;
        }
        if ((805306368 & i11) == 0) {
            i12 |= 268435456;
        }
        boolean z12 = false;
        if (c0585q2.magenta(i16 & 1, ((i16 & 306783379) == 306783378 && (i12 & 306783379) == 306783378) ? false : true)) {
            c0585q2.orange();
            if ((i10 & 1) != 0 && !c0585q2.beige()) {
                c0585q2.ochre();
                alpha2 = c1874w;
                i13 = i12 & (-1879048193);
            } else {
                i13 = (-1879048193) & i12;
                alpha2 = AbstractC1876y.alpha(c0585q2);
            }
            c0585q2.romeo();
            final Context context = (Context) c0585q2.kilo(AndroidCompositionLocals_androidKt.bravo);
            if (userInfo != null && (captain = userInfo.getCaptain()) != null) {
                z12 = Intrinsics.areEqual(captain.getSuspended(), Boolean.TRUE);
            }
            FillElement fillElement = androidx.compose.foundation.layout.V.charlie;
            final boolean z13 = z12;
            Xd.l lVar = new Xd.l() { // from class: Lb.S
                @Override // Xd.l
                public final Object invoke(Object obj, Object obj2) {
                    boolean z14;
                    InterfaceC0581m interfaceC0581m2 = (InterfaceC0581m) obj;
                    int intValue = ((Integer) obj2).intValue();
                    if ((intValue & 3) != 2) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    C0585q c0585q3 = (C0585q) interfaceC0581m2;
                    if (c0585q3.magenta(intValue & 1, z14)) {
                        FillElement fillElement2 = androidx.compose.foundation.layout.V.charlie;
                        float f5 = 4;
                        androidx.compose.foundation.layout.M delta = AbstractC0538d.delta(0.0f, 0.0f, 0.0f, f5, 7);
                        C0540f golf = AbstractC0542h.golf(f5);
                        final P.d dVar3 = dVar;
                        boolean golf2 = c0585q3.golf(dVar3);
                        final P.d dVar4 = dVar2;
                        boolean golf3 = golf2 | c0585q3.golf(dVar4);
                        final boolean z15 = z13;
                        boolean hotel = golf3 | c0585q3.hotel(z15);
                        final boolean z16 = z10;
                        boolean hotel2 = hotel | c0585q3.hotel(z16);
                        final Function0 function0 = onOfflineGoOnlineClick;
                        boolean golf4 = hotel2 | c0585q3.golf(function0);
                        final UserInfo userInfo2 = userInfo;
                        boolean india2 = golf4 | c0585q3.india(userInfo2);
                        final boolean z17 = z2;
                        boolean hotel3 = india2 | c0585q3.hotel(z17);
                        final int i17 = i4;
                        boolean echo = hotel3 | c0585q3.echo(i17);
                        final int i18 = i5;
                        boolean echo2 = echo | c0585q3.echo(i18);
                        final Sb.e eVar2 = eVar;
                        boolean golf5 = echo2 | c0585q3.golf(eVar2);
                        final Function0 function02 = onAssetsClick;
                        boolean golf6 = golf5 | c0585q3.golf(function02);
                        final Function0 function03 = onTransferClick;
                        boolean golf7 = golf6 | c0585q3.golf(function03);
                        final Function1 function1 = onDisclaimerDeepLinkClick;
                        boolean golf8 = golf7 | c0585q3.golf(function1);
                        final Function0 function04 = onOpenWifiSettings;
                        boolean golf9 = golf8 | c0585q3.golf(function04);
                        final Function0 function05 = onGoToWorkingAreaClick;
                        boolean golf10 = golf9 | c0585q3.golf(function05);
                        final Function0 function06 = onGoToZonesClick;
                        boolean golf11 = golf10 | c0585q3.golf(function06);
                        final boolean z18 = z11;
                        boolean hotel4 = golf11 | c0585q3.hotel(z18);
                        final List list = orders;
                        boolean india3 = hotel4 | c0585q3.india(list);
                        final Context context2 = context;
                        boolean india4 = india3 | c0585q3.india(context2);
                        final Function1 function12 = onOrderClick;
                        boolean golf12 = india4 | c0585q3.golf(function12);
                        Object jade = c0585q3.jade();
                        if (golf12 || jade == C0580l.alpha) {
                            Function1 function13 = new Function1() { // from class: Lb.U
                                /* JADX WARN: Code restructure failed: missing block: B:27:0x0124, code lost:
                                
                                    if (r6 != false) goto L32;
                                 */
                                /* JADX WARN: Code restructure failed: missing block: B:37:0x0157, code lost:
                                
                                    if (r6 != false) goto L45;
                                 */
                                @Override // kotlin.jvm.functions.Function1
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                */
                                public final Object invoke(Object obj3) {
                                    boolean z19;
                                    boolean z20;
                                    int hashCode;
                                    boolean z21;
                                    boolean z22;
                                    boolean z23;
                                    InterfaceC1869r LazyColumn = (InterfaceC1869r) obj3;
                                    Intrinsics.echo(LazyColumn, "$this$LazyColumn");
                                    com.google.android.material.datepicker.j.bravo(LazyColumn, "banners", new P.d(new V(dVar3, 0), -329801373, true), 2);
                                    P.d dVar5 = new P.d(new L0.c(1, dVar4), -1322081577, true);
                                    C1860i c1860i = (C1860i) LazyColumn;
                                    bv.z zVar = c1860i.charlie;
                                    if (zVar == null) {
                                        zVar = new bv.z();
                                        c1860i.charlie = zVar;
                                    }
                                    androidx.compose.foundation.lazy.layout.as asVar = c1860i.bravo;
                                    zVar.charlie(asVar.alpha);
                                    c1860i.papa("status_header", new P.d(new C1859h(dVar5, asVar.alpha), -1588696110, true));
                                    boolean z24 = z15;
                                    if (!z24 && !z16) {
                                        final Function0 function07 = function0;
                                        final int i19 = 0;
                                        com.google.android.material.datepicker.j.bravo(LazyColumn, "offline_card", new P.d(new Xd.m() { // from class: Lb.N
                                            @Override // Xd.m
                                            public final Object invoke(Object obj4, Object obj5, Object obj6) {
                                                boolean z25;
                                                boolean z26;
                                                boolean z27;
                                                boolean z28;
                                                switch (i19) {
                                                    case 0:
                                                        InterfaceC1854c item = (InterfaceC1854c) obj4;
                                                        InterfaceC0581m interfaceC0581m3 = (InterfaceC0581m) obj5;
                                                        int intValue2 = ((Integer) obj6).intValue();
                                                        Intrinsics.echo(item, "$this$item");
                                                        if ((intValue2 & 17) != 16) {
                                                            z25 = true;
                                                        } else {
                                                            z25 = false;
                                                        }
                                                        C0585q c0585q4 = (C0585q) interfaceC0581m3;
                                                        if (c0585q4.magenta(intValue2 & 1, z25)) {
                                                            T.p pVar = T.p.alpha;
                                                            A7.alpha(function07, AbstractC0538d.uniform(com.google.android.material.datepicker.j.hotel(pVar, 24, c0585q4, pVar, 1.0f), 16, 0.0f, 2), null, null, null, false, c0585q4, 48);
                                                        } else {
                                                            c0585q4.ochre();
                                                        }
                                                        return Unit.INSTANCE;
                                                    case 1:
                                                        InterfaceC1854c item2 = (InterfaceC1854c) obj4;
                                                        InterfaceC0581m interfaceC0581m4 = (InterfaceC0581m) obj5;
                                                        int intValue3 = ((Integer) obj6).intValue();
                                                        Intrinsics.echo(item2, "$this$item");
                                                        if ((intValue3 & 17) != 16) {
                                                            z26 = true;
                                                        } else {
                                                            z26 = false;
                                                        }
                                                        C0585q c0585q5 = (C0585q) interfaceC0581m4;
                                                        if (c0585q5.magenta(intValue3 & 1, z26)) {
                                                            T.p pVar2 = T.p.alpha;
                                                            AbstractC0538d.echo(androidx.compose.foundation.layout.V.echo(pVar2, 12), c0585q5);
                                                            AbstractC2833z7.alpha(new C2445l(AbstractC3086y3.bravo(c0585q5, R.string.status_header_internet_lost), AbstractC3086y3.bravo(c0585q5, R.string.reconnect_message), AbstractC3086y3.bravo(c0585q5, R.string.mobile_setting)), function07, AbstractC0538d.uniform(androidx.compose.foundation.layout.V.charlie(pVar2, 1.0f), 8, 0.0f, 2), null, 0L, 0L, 0L, 0L, false, c0585q5, 384);
                                                        } else {
                                                            c0585q5.ochre();
                                                        }
                                                        return Unit.INSTANCE;
                                                    case 2:
                                                        InterfaceC1854c item3 = (InterfaceC1854c) obj4;
                                                        InterfaceC0581m interfaceC0581m5 = (InterfaceC0581m) obj5;
                                                        int intValue4 = ((Integer) obj6).intValue();
                                                        Intrinsics.echo(item3, "$this$item");
                                                        if ((intValue4 & 17) != 16) {
                                                            z27 = true;
                                                        } else {
                                                            z27 = false;
                                                        }
                                                        C0585q c0585q6 = (C0585q) interfaceC0581m5;
                                                        if (c0585q6.magenta(intValue4 & 1, z27)) {
                                                            T.p pVar3 = T.p.alpha;
                                                            B7.bravo(function07, AbstractC0538d.uniform(com.google.android.material.datepicker.j.hotel(pVar3, 12, c0585q6, pVar3, 1.0f), 8, 0.0f, 2), null, null, null, false, c0585q6, 48);
                                                        } else {
                                                            c0585q6.ochre();
                                                        }
                                                        return Unit.INSTANCE;
                                                    default:
                                                        InterfaceC1854c item4 = (InterfaceC1854c) obj4;
                                                        InterfaceC0581m interfaceC0581m6 = (InterfaceC0581m) obj5;
                                                        int intValue5 = ((Integer) obj6).intValue();
                                                        Intrinsics.echo(item4, "$this$item");
                                                        if ((intValue5 & 17) != 16) {
                                                            z28 = true;
                                                        } else {
                                                            z28 = false;
                                                        }
                                                        C0585q c0585q7 = (C0585q) interfaceC0581m6;
                                                        if (c0585q7.magenta(intValue5 & 1, z28)) {
                                                            T.p pVar4 = T.p.alpha;
                                                            Sb.d.hotel(function07, com.google.android.material.datepicker.j.hotel(pVar4, 12, c0585q7, pVar4, 1.0f), 0L, c0585q7, 48);
                                                        } else {
                                                            c0585q7.ochre();
                                                        }
                                                        return Unit.INSTANCE;
                                                }
                                            }
                                        }, -1204195736, true), 2);
                                    }
                                    UserInfo userInfo3 = userInfo2;
                                    boolean z25 = z17;
                                    com.google.android.material.datepicker.j.bravo(LazyColumn, "my_shifts", new P.d(new H(userInfo3, z25), 354754572, true), 2);
                                    if (!z24 && z25) {
                                        final Function0 function08 = function03;
                                        final Function1 function14 = function1;
                                        final int i20 = i17;
                                        final int i21 = i18;
                                        final Sb.e eVar3 = eVar2;
                                        final Function0 function09 = function02;
                                        com.google.android.material.datepicker.j.bravo(LazyColumn, "pending", new P.d(new Xd.m() { // from class: Lb.O
                                            @Override // Xd.m
                                            public final Object invoke(Object obj4, Object obj5, Object obj6) {
                                                boolean z26;
                                                InterfaceC1854c item = (InterfaceC1854c) obj4;
                                                InterfaceC0581m interfaceC0581m3 = (InterfaceC0581m) obj5;
                                                int intValue2 = ((Integer) obj6).intValue();
                                                Intrinsics.echo(item, "$this$item");
                                                if ((intValue2 & 17) != 16) {
                                                    z26 = true;
                                                } else {
                                                    z26 = false;
                                                }
                                                C0585q c0585q4 = (C0585q) interfaceC0581m3;
                                                if (c0585q4.magenta(intValue2 & 1, z26)) {
                                                    T.s charlie = androidx.compose.foundation.layout.V.charlie(T.p.alpha, 1.0f);
                                                    q0.ap delta2 = AbstractC0547m.delta(T.d.alpha, false);
                                                    long j5 = c0585q4.magenta;
                                                    int i22 = (int) (j5 ^ (j5 >>> 32));
                                                    androidx.compose.runtime.I mike = c0585q4.mike();
                                                    T.s charlie2 = T.a.charlie(charlie, c0585q4);
                                                    InterfaceC2552l.maroon.getClass();
                                                    C2550j c2550j = C2551k.bravo;
                                                    c0585q4.white();
                                                    if (c0585q4.lime) {
                                                        c0585q4.lima(c2550j);
                                                    } else {
                                                        c0585q4.i();
                                                    }
                                                    C0564b.blue(C2551k.foxtrot, c0585q4, delta2);
                                                    C0564b.blue(C2551k.echo, c0585q4, mike);
                                                    C2549i c2549i = C2551k.golf;
                                                    if (c0585q4.lime || !Intrinsics.areEqual(c0585q4.jade(), Integer.valueOf(i22))) {
                                                        ao.ad.blue(i22, c0585q4, i22, c2549i);
                                                    }
                                                    C0564b.blue(C2551k.delta, c0585q4, charlie2);
                                                    AbstractC0220c.mike(i20, i21, eVar3, function09, function08, function14, c0585q4, 0);
                                                    c0585q4.quebec(true);
                                                } else {
                                                    c0585q4.ochre();
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        }, 1875361745, true), 2);
                                    }
                                    if (!z25) {
                                        final Function0 function010 = function04;
                                        final int i22 = 1;
                                        com.google.android.material.datepicker.j.bravo(LazyColumn, "internet_lost", new P.d(new Xd.m() { // from class: Lb.N
                                            @Override // Xd.m
                                            public final Object invoke(Object obj4, Object obj5, Object obj6) {
                                                boolean z252;
                                                boolean z26;
                                                boolean z27;
                                                boolean z28;
                                                switch (i22) {
                                                    case 0:
                                                        InterfaceC1854c item = (InterfaceC1854c) obj4;
                                                        InterfaceC0581m interfaceC0581m3 = (InterfaceC0581m) obj5;
                                                        int intValue2 = ((Integer) obj6).intValue();
                                                        Intrinsics.echo(item, "$this$item");
                                                        if ((intValue2 & 17) != 16) {
                                                            z252 = true;
                                                        } else {
                                                            z252 = false;
                                                        }
                                                        C0585q c0585q4 = (C0585q) interfaceC0581m3;
                                                        if (c0585q4.magenta(intValue2 & 1, z252)) {
                                                            T.p pVar = T.p.alpha;
                                                            A7.alpha(function010, AbstractC0538d.uniform(com.google.android.material.datepicker.j.hotel(pVar, 24, c0585q4, pVar, 1.0f), 16, 0.0f, 2), null, null, null, false, c0585q4, 48);
                                                        } else {
                                                            c0585q4.ochre();
                                                        }
                                                        return Unit.INSTANCE;
                                                    case 1:
                                                        InterfaceC1854c item2 = (InterfaceC1854c) obj4;
                                                        InterfaceC0581m interfaceC0581m4 = (InterfaceC0581m) obj5;
                                                        int intValue3 = ((Integer) obj6).intValue();
                                                        Intrinsics.echo(item2, "$this$item");
                                                        if ((intValue3 & 17) != 16) {
                                                            z26 = true;
                                                        } else {
                                                            z26 = false;
                                                        }
                                                        C0585q c0585q5 = (C0585q) interfaceC0581m4;
                                                        if (c0585q5.magenta(intValue3 & 1, z26)) {
                                                            T.p pVar2 = T.p.alpha;
                                                            AbstractC0538d.echo(androidx.compose.foundation.layout.V.echo(pVar2, 12), c0585q5);
                                                            AbstractC2833z7.alpha(new C2445l(AbstractC3086y3.bravo(c0585q5, R.string.status_header_internet_lost), AbstractC3086y3.bravo(c0585q5, R.string.reconnect_message), AbstractC3086y3.bravo(c0585q5, R.string.mobile_setting)), function010, AbstractC0538d.uniform(androidx.compose.foundation.layout.V.charlie(pVar2, 1.0f), 8, 0.0f, 2), null, 0L, 0L, 0L, 0L, false, c0585q5, 384);
                                                        } else {
                                                            c0585q5.ochre();
                                                        }
                                                        return Unit.INSTANCE;
                                                    case 2:
                                                        InterfaceC1854c item3 = (InterfaceC1854c) obj4;
                                                        InterfaceC0581m interfaceC0581m5 = (InterfaceC0581m) obj5;
                                                        int intValue4 = ((Integer) obj6).intValue();
                                                        Intrinsics.echo(item3, "$this$item");
                                                        if ((intValue4 & 17) != 16) {
                                                            z27 = true;
                                                        } else {
                                                            z27 = false;
                                                        }
                                                        C0585q c0585q6 = (C0585q) interfaceC0581m5;
                                                        if (c0585q6.magenta(intValue4 & 1, z27)) {
                                                            T.p pVar3 = T.p.alpha;
                                                            B7.bravo(function010, AbstractC0538d.uniform(com.google.android.material.datepicker.j.hotel(pVar3, 12, c0585q6, pVar3, 1.0f), 8, 0.0f, 2), null, null, null, false, c0585q6, 48);
                                                        } else {
                                                            c0585q6.ochre();
                                                        }
                                                        return Unit.INSTANCE;
                                                    default:
                                                        InterfaceC1854c item4 = (InterfaceC1854c) obj4;
                                                        InterfaceC0581m interfaceC0581m6 = (InterfaceC0581m) obj5;
                                                        int intValue5 = ((Integer) obj6).intValue();
                                                        Intrinsics.echo(item4, "$this$item");
                                                        if ((intValue5 & 17) != 16) {
                                                            z28 = true;
                                                        } else {
                                                            z28 = false;
                                                        }
                                                        C0585q c0585q7 = (C0585q) interfaceC0581m6;
                                                        if (c0585q7.magenta(intValue5 & 1, z28)) {
                                                            T.p pVar4 = T.p.alpha;
                                                            Sb.d.hotel(function010, com.google.android.material.datepicker.j.hotel(pVar4, 12, c0585q7, pVar4, 1.0f), 0L, c0585q7, 48);
                                                        } else {
                                                            c0585q7.ochre();
                                                        }
                                                        return Unit.INSTANCE;
                                                }
                                            }
                                        }, -677763856, true), 2);
                                    }
                                    boolean z26 = false;
                                    if (userInfo3 != null) {
                                        z19 = Intrinsics.areEqual(userInfo3.getOutsideWorkingArea(), Boolean.TRUE);
                                    } else {
                                        z19 = false;
                                    }
                                    if (z19) {
                                        final Function0 function011 = function05;
                                        final int i23 = 2;
                                        com.google.android.material.datepicker.j.bravo(LazyColumn, "outside_working_area", new P.d(new Xd.m() { // from class: Lb.N
                                            @Override // Xd.m
                                            public final Object invoke(Object obj4, Object obj5, Object obj6) {
                                                boolean z252;
                                                boolean z262;
                                                boolean z27;
                                                boolean z28;
                                                switch (i23) {
                                                    case 0:
                                                        InterfaceC1854c item = (InterfaceC1854c) obj4;
                                                        InterfaceC0581m interfaceC0581m3 = (InterfaceC0581m) obj5;
                                                        int intValue2 = ((Integer) obj6).intValue();
                                                        Intrinsics.echo(item, "$this$item");
                                                        if ((intValue2 & 17) != 16) {
                                                            z252 = true;
                                                        } else {
                                                            z252 = false;
                                                        }
                                                        C0585q c0585q4 = (C0585q) interfaceC0581m3;
                                                        if (c0585q4.magenta(intValue2 & 1, z252)) {
                                                            T.p pVar = T.p.alpha;
                                                            A7.alpha(function011, AbstractC0538d.uniform(com.google.android.material.datepicker.j.hotel(pVar, 24, c0585q4, pVar, 1.0f), 16, 0.0f, 2), null, null, null, false, c0585q4, 48);
                                                        } else {
                                                            c0585q4.ochre();
                                                        }
                                                        return Unit.INSTANCE;
                                                    case 1:
                                                        InterfaceC1854c item2 = (InterfaceC1854c) obj4;
                                                        InterfaceC0581m interfaceC0581m4 = (InterfaceC0581m) obj5;
                                                        int intValue3 = ((Integer) obj6).intValue();
                                                        Intrinsics.echo(item2, "$this$item");
                                                        if ((intValue3 & 17) != 16) {
                                                            z262 = true;
                                                        } else {
                                                            z262 = false;
                                                        }
                                                        C0585q c0585q5 = (C0585q) interfaceC0581m4;
                                                        if (c0585q5.magenta(intValue3 & 1, z262)) {
                                                            T.p pVar2 = T.p.alpha;
                                                            AbstractC0538d.echo(androidx.compose.foundation.layout.V.echo(pVar2, 12), c0585q5);
                                                            AbstractC2833z7.alpha(new C2445l(AbstractC3086y3.bravo(c0585q5, R.string.status_header_internet_lost), AbstractC3086y3.bravo(c0585q5, R.string.reconnect_message), AbstractC3086y3.bravo(c0585q5, R.string.mobile_setting)), function011, AbstractC0538d.uniform(androidx.compose.foundation.layout.V.charlie(pVar2, 1.0f), 8, 0.0f, 2), null, 0L, 0L, 0L, 0L, false, c0585q5, 384);
                                                        } else {
                                                            c0585q5.ochre();
                                                        }
                                                        return Unit.INSTANCE;
                                                    case 2:
                                                        InterfaceC1854c item3 = (InterfaceC1854c) obj4;
                                                        InterfaceC0581m interfaceC0581m5 = (InterfaceC0581m) obj5;
                                                        int intValue4 = ((Integer) obj6).intValue();
                                                        Intrinsics.echo(item3, "$this$item");
                                                        if ((intValue4 & 17) != 16) {
                                                            z27 = true;
                                                        } else {
                                                            z27 = false;
                                                        }
                                                        C0585q c0585q6 = (C0585q) interfaceC0581m5;
                                                        if (c0585q6.magenta(intValue4 & 1, z27)) {
                                                            T.p pVar3 = T.p.alpha;
                                                            B7.bravo(function011, AbstractC0538d.uniform(com.google.android.material.datepicker.j.hotel(pVar3, 12, c0585q6, pVar3, 1.0f), 8, 0.0f, 2), null, null, null, false, c0585q6, 48);
                                                        } else {
                                                            c0585q6.ochre();
                                                        }
                                                        return Unit.INSTANCE;
                                                    default:
                                                        InterfaceC1854c item4 = (InterfaceC1854c) obj4;
                                                        InterfaceC0581m interfaceC0581m6 = (InterfaceC0581m) obj5;
                                                        int intValue5 = ((Integer) obj6).intValue();
                                                        Intrinsics.echo(item4, "$this$item");
                                                        if ((intValue5 & 17) != 16) {
                                                            z28 = true;
                                                        } else {
                                                            z28 = false;
                                                        }
                                                        C0585q c0585q7 = (C0585q) interfaceC0581m6;
                                                        if (c0585q7.magenta(intValue5 & 1, z28)) {
                                                            T.p pVar4 = T.p.alpha;
                                                            Sb.d.hotel(function011, com.google.android.material.datepicker.j.hotel(pVar4, 12, c0585q7, pVar4, 1.0f), 0L, c0585q7, 48);
                                                        } else {
                                                            c0585q7.ochre();
                                                        }
                                                        return Unit.INSTANCE;
                                                }
                                            }
                                        }, 1064077839, true), 2);
                                    }
                                    if (userInfo3 != null) {
                                        z20 = Intrinsics.areEqual(userInfo3.getShowHeatMap(), Boolean.TRUE);
                                    } else {
                                        z20 = false;
                                    }
                                    if (z20) {
                                        final Function0 function012 = function06;
                                        final int i24 = 3;
                                        com.google.android.material.datepicker.j.bravo(LazyColumn, "heat_map", new P.d(new Xd.m() { // from class: Lb.N
                                            @Override // Xd.m
                                            public final Object invoke(Object obj4, Object obj5, Object obj6) {
                                                boolean z252;
                                                boolean z262;
                                                boolean z27;
                                                boolean z28;
                                                switch (i24) {
                                                    case 0:
                                                        InterfaceC1854c item = (InterfaceC1854c) obj4;
                                                        InterfaceC0581m interfaceC0581m3 = (InterfaceC0581m) obj5;
                                                        int intValue2 = ((Integer) obj6).intValue();
                                                        Intrinsics.echo(item, "$this$item");
                                                        if ((intValue2 & 17) != 16) {
                                                            z252 = true;
                                                        } else {
                                                            z252 = false;
                                                        }
                                                        C0585q c0585q4 = (C0585q) interfaceC0581m3;
                                                        if (c0585q4.magenta(intValue2 & 1, z252)) {
                                                            T.p pVar = T.p.alpha;
                                                            A7.alpha(function012, AbstractC0538d.uniform(com.google.android.material.datepicker.j.hotel(pVar, 24, c0585q4, pVar, 1.0f), 16, 0.0f, 2), null, null, null, false, c0585q4, 48);
                                                        } else {
                                                            c0585q4.ochre();
                                                        }
                                                        return Unit.INSTANCE;
                                                    case 1:
                                                        InterfaceC1854c item2 = (InterfaceC1854c) obj4;
                                                        InterfaceC0581m interfaceC0581m4 = (InterfaceC0581m) obj5;
                                                        int intValue3 = ((Integer) obj6).intValue();
                                                        Intrinsics.echo(item2, "$this$item");
                                                        if ((intValue3 & 17) != 16) {
                                                            z262 = true;
                                                        } else {
                                                            z262 = false;
                                                        }
                                                        C0585q c0585q5 = (C0585q) interfaceC0581m4;
                                                        if (c0585q5.magenta(intValue3 & 1, z262)) {
                                                            T.p pVar2 = T.p.alpha;
                                                            AbstractC0538d.echo(androidx.compose.foundation.layout.V.echo(pVar2, 12), c0585q5);
                                                            AbstractC2833z7.alpha(new C2445l(AbstractC3086y3.bravo(c0585q5, R.string.status_header_internet_lost), AbstractC3086y3.bravo(c0585q5, R.string.reconnect_message), AbstractC3086y3.bravo(c0585q5, R.string.mobile_setting)), function012, AbstractC0538d.uniform(androidx.compose.foundation.layout.V.charlie(pVar2, 1.0f), 8, 0.0f, 2), null, 0L, 0L, 0L, 0L, false, c0585q5, 384);
                                                        } else {
                                                            c0585q5.ochre();
                                                        }
                                                        return Unit.INSTANCE;
                                                    case 2:
                                                        InterfaceC1854c item3 = (InterfaceC1854c) obj4;
                                                        InterfaceC0581m interfaceC0581m5 = (InterfaceC0581m) obj5;
                                                        int intValue4 = ((Integer) obj6).intValue();
                                                        Intrinsics.echo(item3, "$this$item");
                                                        if ((intValue4 & 17) != 16) {
                                                            z27 = true;
                                                        } else {
                                                            z27 = false;
                                                        }
                                                        C0585q c0585q6 = (C0585q) interfaceC0581m5;
                                                        if (c0585q6.magenta(intValue4 & 1, z27)) {
                                                            T.p pVar3 = T.p.alpha;
                                                            B7.bravo(function012, AbstractC0538d.uniform(com.google.android.material.datepicker.j.hotel(pVar3, 12, c0585q6, pVar3, 1.0f), 8, 0.0f, 2), null, null, null, false, c0585q6, 48);
                                                        } else {
                                                            c0585q6.ochre();
                                                        }
                                                        return Unit.INSTANCE;
                                                    default:
                                                        InterfaceC1854c item4 = (InterfaceC1854c) obj4;
                                                        InterfaceC0581m interfaceC0581m6 = (InterfaceC0581m) obj5;
                                                        int intValue5 = ((Integer) obj6).intValue();
                                                        Intrinsics.echo(item4, "$this$item");
                                                        if ((intValue5 & 17) != 16) {
                                                            z28 = true;
                                                        } else {
                                                            z28 = false;
                                                        }
                                                        C0585q c0585q7 = (C0585q) interfaceC0581m6;
                                                        if (c0585q7.magenta(intValue5 & 1, z28)) {
                                                            T.p pVar4 = T.p.alpha;
                                                            Sb.d.hotel(function012, com.google.android.material.datepicker.j.hotel(pVar4, 12, c0585q7, pVar4, 1.0f), 0L, c0585q7, 48);
                                                        } else {
                                                            c0585q7.ochre();
                                                        }
                                                        return Unit.INSTANCE;
                                                }
                                            }
                                        }, -1489047762, true), 2);
                                    }
                                    if (z25) {
                                        if (userInfo3 != null) {
                                            z23 = Intrinsics.areEqual(userInfo3.getOutsideWorkingArea(), Boolean.TRUE);
                                        } else {
                                            z23 = false;
                                        }
                                    }
                                    com.google.android.material.datepicker.j.bravo(LazyColumn, "gap_after_alert", AbstractC0220c.india, 2);
                                    boolean z27 = z18;
                                    List list2 = list;
                                    if (!z27 && list2.isEmpty()) {
                                        if (userInfo3 != null) {
                                            z21 = Intrinsics.areEqual(userInfo3.getAwaitingOrders(), Boolean.TRUE);
                                        } else {
                                            z21 = false;
                                        }
                                        if (!z21) {
                                            if (userInfo3 != null) {
                                                z22 = Intrinsics.areEqual(userInfo3.getOutsideWorkingArea(), Boolean.TRUE);
                                            } else {
                                                z22 = false;
                                            }
                                        }
                                    }
                                    z26 = true;
                                    if (z26) {
                                        com.google.android.material.datepicker.j.bravo(LazyColumn, "orders_header", AbstractC0220c.juliet, 2);
                                    }
                                    com.google.android.material.datepicker.j.bravo(LazyColumn, "gap_before_list", AbstractC0220c.kilo, 2);
                                    com.google.android.material.datepicker.j.bravo(LazyColumn, "awaiting_orders", new P.d(new Cb.d(7, userInfo3), -456529334, true), 2);
                                    if (!list2.isEmpty()) {
                                        HashSet hashSet = new HashSet();
                                        ArrayList arrayList = new ArrayList();
                                        for (Object obj4 : list2) {
                                            Order order = (Order) obj4;
                                            Integer id2 = order.getId();
                                            if (id2 != null) {
                                                hashCode = id2.intValue();
                                            } else {
                                                hashCode = order.hashCode();
                                            }
                                            if (hashSet.add(Integer.valueOf(hashCode))) {
                                                arrayList.add(obj4);
                                            }
                                        }
                                        c1860i.quebec(arrayList.size(), new Cb.l(5, new am(7), arrayList), new W(0, arrayList), new P.d(new C0206n(arrayList, context2, function12, 1), 802480018, true));
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            c0585q3.f(function13);
                            jade = function13;
                        }
                        AbstractC2616b5.alpha(fillElement2, C1874w.this, delta, golf, null, null, false, null, (Function1) jade, c0585q3, 24966, 488);
                    } else {
                        c0585q3.ochre();
                    }
                    return Unit.INSTANCE;
                }
            };
            c0585q = c0585q2;
            AbstractC3036o2.alpha(z11, onRefresh, fillElement, P.e.echo(-878634600, lVar, c0585q), c0585q, ((i16 >> 12) & 14) | 3456 | ((i13 >> 12) & 112), 0);
            c1874w2 = alpha2;
        } else {
            c0585q = c0585q2;
            c0585q.ochre();
            c1874w2 = c1874w;
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new Xd.l(z2, z10, orders, z11, i4, i5, eVar, dVar, dVar2, onOfflineGoOnlineClick, onAssetsClick, onTransferClick, onDisclaimerDeepLinkClick, onOrderClick, onRefresh, onGoToWorkingAreaClick, onGoToZonesClick, onOpenWifiSettings, c1874w2, i10, i11) { // from class: Lb.T

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ Sb.e f1762a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ P.d f1763b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ P.d f1764c;

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ Function0 f1765d;
                public final /* synthetic */ Function0 e;

                /* renamed from: f, reason: collision with root package name */
                public final /* synthetic */ Function0 f1766f;

                /* renamed from: g, reason: collision with root package name */
                public final /* synthetic */ Function1 f1767g;

                /* renamed from: h, reason: collision with root package name */
                public final /* synthetic */ Function1 f1768h;

                /* renamed from: i, reason: collision with root package name */
                public final /* synthetic */ Function0 f1769i;

                /* renamed from: j, reason: collision with root package name */
                public final /* synthetic */ Function0 f1770j;

                /* renamed from: k, reason: collision with root package name */
                public final /* synthetic */ Function0 f1771k;

                /* renamed from: l, reason: collision with root package name */
                public final /* synthetic */ Function0 f1772l;

                /* renamed from: m, reason: collision with root package name */
                public final /* synthetic */ C1874w f1773m;

                /* renamed from: n, reason: collision with root package name */
                public final /* synthetic */ int f1774n;
                public final /* synthetic */ boolean purple;
                public final /* synthetic */ boolean red;
                public final /* synthetic */ List silver;
                public final /* synthetic */ boolean teal;
                public final /* synthetic */ int white;
                public final /* synthetic */ int yellow;

                {
                    this.f1774n = i11;
                }

                @Override // Xd.l
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int cyan = C0564b.cyan(905969665);
                    int cyan2 = C0564b.cyan(this.f1774n);
                    P.d dVar3 = this.f1763b;
                    P.d dVar4 = this.f1764c;
                    Function0 function0 = this.f1772l;
                    C1874w c1874w3 = this.f1773m;
                    Z.alpha(UserInfo.this, this.purple, this.red, this.silver, this.teal, this.white, this.yellow, this.f1762a, dVar3, dVar4, this.f1765d, this.e, this.f1766f, this.f1767g, this.f1768h, this.f1769i, this.f1770j, this.f1771k, function0, c1874w3, (InterfaceC0581m) obj, cyan, cyan2);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void bravo(final OrdersFragmentV2 ordersFragmentV2, final HomeViewModelV2 homeViewModel, final OrdersViewModel ordersViewModel, final Nb.h hVar, final yf.N assetsCountFlow, final yf.N transferCountFlow, final yf.N disclaimerUiFlow, final yf.N isSwitchCheckedFlow, final androidx.lifecycle.az azVar, final Function0 onInternetRecovered, final Function1 onToggleChange, final Function0 onOfflineGoOnlineClick, final Function0 onShowAccuracyInstructions, final Function0 onShowConnectionDiagnostics, final Function0 onAssetsClick, final Function0 onTransferClick, final Function1 onDisclaimerDeepLinkClick, final Function1 onOrderClick, final Function0 onRefresh, final Function0 onUpdateMe, final Function0 onGoToWorkingAreaClick, final Function0 onGoToZonesClick, final Function0 onOpenWifiSettings, final Function0 function0, InterfaceC0581m interfaceC0581m, final int i4) {
        C0585q c0585q;
        List emptyList;
        Intrinsics.echo(homeViewModel, "homeViewModel");
        Intrinsics.echo(ordersViewModel, "ordersViewModel");
        Intrinsics.echo(assetsCountFlow, "assetsCountFlow");
        Intrinsics.echo(transferCountFlow, "transferCountFlow");
        Intrinsics.echo(disclaimerUiFlow, "disclaimerUiFlow");
        Intrinsics.echo(isSwitchCheckedFlow, "isSwitchCheckedFlow");
        Intrinsics.echo(onInternetRecovered, "onInternetRecovered");
        Intrinsics.echo(onToggleChange, "onToggleChange");
        Intrinsics.echo(onOfflineGoOnlineClick, "onOfflineGoOnlineClick");
        Intrinsics.echo(onShowAccuracyInstructions, "onShowAccuracyInstructions");
        Intrinsics.echo(onShowConnectionDiagnostics, "onShowConnectionDiagnostics");
        Intrinsics.echo(onAssetsClick, "onAssetsClick");
        Intrinsics.echo(onTransferClick, "onTransferClick");
        Intrinsics.echo(onDisclaimerDeepLinkClick, "onDisclaimerDeepLinkClick");
        Intrinsics.echo(onOrderClick, "onOrderClick");
        Intrinsics.echo(onRefresh, "onRefresh");
        Intrinsics.echo(onUpdateMe, "onUpdateMe");
        Intrinsics.echo(onGoToWorkingAreaClick, "onGoToWorkingAreaClick");
        Intrinsics.echo(onGoToZonesClick, "onGoToZonesClick");
        Intrinsics.echo(onOpenWifiSettings, "onOpenWifiSettings");
        C0585q c0585q2 = (C0585q) interfaceC0581m;
        c0585q2.silver(1898069091);
        int i5 = i4 | (c0585q2.india(ordersFragmentV2) ? 4 : 2) | (c0585q2.india(homeViewModel) ? 32 : 16) | (c0585q2.india(ordersViewModel) ? 256 : 128);
        boolean india = c0585q2.india(hVar);
        int i10 = Barcode.FORMAT_UPC_E;
        int i11 = i5 | (india ? 2048 : 1024) | (c0585q2.india(assetsCountFlow) ? 16384 : 8192) | (c0585q2.india(transferCountFlow) ? 131072 : 65536) | (c0585q2.india(disclaimerUiFlow) ? 1048576 : 524288) | (c0585q2.india(isSwitchCheckedFlow) ? 8388608 : 4194304) | (c0585q2.india(azVar) ? 67108864 : 33554432) | (c0585q2.india(onInternetRecovered) ? 536870912 : 268435456);
        int i12 = (c0585q2.india(onToggleChange) ? 4 : 2) | (c0585q2.india(onOfflineGoOnlineClick) ? 32 : 16) | (c0585q2.india(onShowAccuracyInstructions) ? 256 : 128) | (c0585q2.india(onShowConnectionDiagnostics) ? 2048 : 1024) | (c0585q2.india(onAssetsClick) ? 16384 : 8192) | (c0585q2.india(onTransferClick) ? 131072 : 65536) | (c0585q2.india(onDisclaimerDeepLinkClick) ? 1048576 : 524288) | (c0585q2.india(onOrderClick) ? 8388608 : 4194304) | (c0585q2.india(onRefresh) ? 67108864 : 33554432) | (c0585q2.india(onUpdateMe) ? 536870912 : 268435456);
        int i13 = (c0585q2.india(onGoToWorkingAreaClick) ? 4 : 2) | (c0585q2.india(onGoToZonesClick) ? 32 : 16) | (c0585q2.india(onOpenWifiSettings) ? 256 : 128);
        if (c0585q2.india(function0)) {
            i10 = 2048;
        }
        int i14 = i13 | i10;
        if (c0585q2.magenta(i11 & 1, ((i11 & 306783379) == 306783378 && (i12 & 306783379) == 306783378 && (i14 & 1171) == 1170) ? false : true)) {
            androidx.compose.runtime.ax mike = C0564b.mike(assetsCountFlow, c0585q2, (i11 >> 12) & 14);
            androidx.compose.runtime.ax mike2 = C0564b.mike(transferCountFlow, c0585q2, (i11 >> 15) & 14);
            androidx.compose.runtime.ax mike3 = C0564b.mike(disclaimerUiFlow, c0585q2, (i11 >> 18) & 14);
            androidx.compose.runtime.ax charlie = AbstractC2717m7.charlie(hVar.charlie, Boolean.TRUE, c0585q2, 48);
            Object jade = c0585q2.jade();
            androidx.compose.runtime.as asVar = C0580l.alpha;
            if (jade == asVar) {
                Boolean bool = (Boolean) charlie.getValue();
                bool.getClass();
                jade = C0564b.zulu(bool);
                c0585q2.f(jade);
            }
            androidx.compose.runtime.ax axVar = (androidx.compose.runtime.ax) jade;
            Boolean bool2 = (Boolean) charlie.getValue();
            bool2.getClass();
            boolean golf = c0585q2.golf(charlie) | ((i11 & 1879048192) == 536870912);
            Object jade2 = c0585q2.jade();
            if (golf || jade2 == asVar) {
                jade2 = new X(onInternetRecovered, axVar, charlie, null);
                c0585q2.f(jade2);
            }
            C0564b.foxtrot((Xd.l) jade2, c0585q2, bool2);
            androidx.compose.runtime.ax bravo = AbstractC2717m7.bravo(isSwitchCheckedFlow, c0585q2, (i11 >> 21) & 14);
            androidx.compose.runtime.ax bravo2 = V6.bravo(azVar, azVar.getValue(), c0585q2, (i11 >> 24) & 14);
            androidx.compose.runtime.ax bravo3 = V6.bravo(ordersViewModel.golf, new C2492a(2, "loading"), c0585q2, 0);
            int i15 = ((C2492a) bravo3.getValue()).alpha;
            if (i15 != 0 && i15 != 1 && i15 != 2) {
                emptyList = CollectionsKt.emptyList();
            } else {
                na.f fVar = (na.f) ((C2492a) bravo3.getValue()).charlie;
                if (fVar == null || (emptyList = fVar.alpha) == null) {
                    emptyList = CollectionsKt.emptyList();
                }
            }
            List list = emptyList;
            boolean z2 = ((C2492a) bravo3.getValue()).alpha == 2;
            Integer valueOf = Integer.valueOf(((C2492a) bravo3.getValue()).alpha);
            boolean golf2 = c0585q2.golf(bravo3) | ((i12 & 1879048192) == 536870912);
            Object jade3 = c0585q2.jade();
            if (golf2 || jade3 == asVar) {
                jade3 = new Y(onUpdateMe, bravo3, null);
                c0585q2.f(jade3);
            }
            C0564b.foxtrot((Xd.l) jade3, c0585q2, valueOf);
            int i16 = i12 >> 9;
            int i17 = i14 << 18;
            c0585q = c0585q2;
            alpha((UserInfo) bravo2.getValue(), ((Boolean) charlie.getValue()).booleanValue(), ((Boolean) bravo.getValue()).booleanValue(), list, z2, ((Number) mike.getValue()).intValue(), ((Number) mike2.getValue()).intValue(), (Sb.e) mike3.getValue(), P.e.echo(1638446618, new C0195c(homeViewModel, isSwitchCheckedFlow, hVar, onShowAccuracyInstructions, onShowConnectionDiagnostics, ordersFragmentV2), c0585q2), P.e.echo(-856726501, new P(ordersFragmentV2, azVar, isSwitchCheckedFlow, hVar, onToggleChange, onShowAccuracyInstructions, onShowConnectionDiagnostics, function0), c0585q2), onOfflineGoOnlineClick, onAssetsClick, onTransferClick, onDisclaimerDeepLinkClick, onOrderClick, onRefresh, onGoToWorkingAreaClick, onGoToZonesClick, onOpenWifiSettings, null, c0585q, 905969664, ((i12 >> 3) & 14) | (i16 & 112) | (i16 & 896) | (i16 & 7168) | (57344 & i16) | (i16 & 458752) | (3670016 & i17) | (29360128 & i17) | (i17 & 234881024));
        } else {
            c0585q = c0585q2;
            c0585q.ochre();
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new Xd.l(homeViewModel, ordersViewModel, hVar, assetsCountFlow, transferCountFlow, disclaimerUiFlow, isSwitchCheckedFlow, azVar, onInternetRecovered, onToggleChange, onOfflineGoOnlineClick, onShowAccuracyInstructions, onShowConnectionDiagnostics, onAssetsClick, onTransferClick, onDisclaimerDeepLinkClick, onOrderClick, onRefresh, onUpdateMe, onGoToWorkingAreaClick, onGoToZonesClick, onOpenWifiSettings, function0, i4) { // from class: Lb.Q

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ yf.N f1733a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ androidx.lifecycle.az f1734b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ Function0 f1735c;

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ Function1 f1736d;
                public final /* synthetic */ Function0 e;

                /* renamed from: f, reason: collision with root package name */
                public final /* synthetic */ Function0 f1737f;

                /* renamed from: g, reason: collision with root package name */
                public final /* synthetic */ Function0 f1738g;

                /* renamed from: h, reason: collision with root package name */
                public final /* synthetic */ Function0 f1739h;

                /* renamed from: i, reason: collision with root package name */
                public final /* synthetic */ Function0 f1740i;

                /* renamed from: j, reason: collision with root package name */
                public final /* synthetic */ Function1 f1741j;

                /* renamed from: k, reason: collision with root package name */
                public final /* synthetic */ Function1 f1742k;

                /* renamed from: l, reason: collision with root package name */
                public final /* synthetic */ Function0 f1743l;

                /* renamed from: m, reason: collision with root package name */
                public final /* synthetic */ Function0 f1744m;

                /* renamed from: n, reason: collision with root package name */
                public final /* synthetic */ Function0 f1745n;

                /* renamed from: o, reason: collision with root package name */
                public final /* synthetic */ Function0 f1746o;

                /* renamed from: p, reason: collision with root package name */
                public final /* synthetic */ Function0 f1747p;
                public final /* synthetic */ HomeViewModelV2 purple;

                /* renamed from: q, reason: collision with root package name */
                public final /* synthetic */ Function0 f1748q;
                public final /* synthetic */ OrdersViewModel red;
                public final /* synthetic */ Nb.h silver;
                public final /* synthetic */ yf.N teal;
                public final /* synthetic */ yf.N white;
                public final /* synthetic */ yf.N yellow;

                @Override // Xd.l
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int cyan = C0564b.cyan(1);
                    OrdersFragmentV2 ordersFragmentV22 = OrdersFragmentV2.this;
                    Nb.h hVar2 = this.silver;
                    androidx.lifecycle.az azVar2 = this.f1734b;
                    Function0 function02 = this.f1747p;
                    Function0 function03 = this.f1748q;
                    Z.bravo(ordersFragmentV22, this.purple, this.red, hVar2, this.teal, this.white, this.yellow, this.f1733a, azVar2, this.f1735c, this.f1736d, this.e, this.f1737f, this.f1738g, this.f1739h, this.f1740i, this.f1741j, this.f1742k, this.f1743l, this.f1744m, this.f1745n, this.f1746o, function02, function03, (InterfaceC0581m) obj, cyan);
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
