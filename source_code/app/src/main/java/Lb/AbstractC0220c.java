package Lb;

import F.AbstractC0141o0;
import F.AbstractC0174x1;
import F.C0143o2;
import F.C0150q1;
import F.G1;
import F.G2;
import F.K1;
import F.S2;
import F.T2;
import a0.C0366t;
import android.content.Context;
import androidx.compose.foundation.layout.AbstractC0538d;
import androidx.compose.foundation.layout.AbstractC0542h;
import androidx.compose.foundation.layout.AbstractC0547m;
import androidx.compose.foundation.layout.AbstractC0553t;
import androidx.compose.foundation.layout.C0537c;
import androidx.compose.foundation.layout.C0540f;
import androidx.compose.foundation.layout.C0554u;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.d0;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.app.network.network.models.ActiveShiftSummary;
import com.app.network.network.models.Attribute;
import com.app.network.network.models.AttributeGroup;
import com.app.network.network.models.Captain;
import com.app.network.network.models.UpcomingBookedShift;
import com.app.network.network.models.UserInfo;
import com.app.network.network.models.WorkingStatus;
import com.checkout.components.kmp.rememberme.utils.Constants;
import com.google.mlkit.vision.barcode.common.Barcode;
import com.zendesk.service.HttpConstants;
import delivery.samurai.android.R;
import delivery.samurai.android.services.CaptainLocationMonitoringService;
import delivery.samurai.android.ui.homev2.HomeViewModelV2;
import delivery.samurai.android.ui.homev2.OrdersFragmentV2;
import f0.AbstractC1680b;
import h.AbstractC1797a;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import m.AbstractC2094g;
import m.C2093f;
import okhttp3.internal.http2.Http2;
import p3.EnumC2270b;
import q0.C2391j;
import q0.C2394m;
import s0.C2549i;
import s0.C2550j;
import s0.C2551k;
import s0.InterfaceC2552l;
import s6.A7;
import s6.AbstractC2636d7;
import s6.AbstractC2670h5;
import s6.AbstractC2717m7;
import s6.E7;
import s6.J4;
import s6.V6;
import t0.AbstractC2901T;
import t0.AbstractC2911e0;
import t0.C2932p;
import t0.InterfaceC2937r0;
import t6.AbstractC3071v3;
import t6.AbstractC3076w3;
import t6.AbstractC3086y3;
import t6.R3;
import t6.S3;
import t6.U3;
import t6.W3;
import zb.C3504g;

/* renamed from: Lb.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0220c {
    public static final P.d alpha = new P.d(new D0.y(26), -389374596, false);
    public static final P.d bravo = new P.d(new D0.y(27), -1826543648, false);
    public static final P.d charlie = new P.d(new Ac.a(29), 146090979, false);
    public static final P.d delta = new P.d(new C0221d(0), 883776501, false);
    public static final P.d echo = new P.d(new D0.y(28), 1962485239, false);
    public static final P.d foxtrot = new P.d(new D0.y(29), 406941562, false);
    public static final P.d golf = new P.d(new C0222e(10), -50638340, false);
    public static final P.d hotel = new P.d(new C0221d(1), 1608948416, false);
    public static final P.d india;
    public static final P.d juliet;
    public static final P.d kilo;
    public static final P.d lima;

    static {
        new P.d(new C0222e(1), 540086222, false);
        new P.d(new C0222e(2), 1750841375, false);
        new P.d(new C0222e(3), -2024116896, false);
        new P.d(new C0222e(4), 1239100690, false);
        new P.d(new C0222e(5), -1086040312, false);
        new P.d(new C0222e(6), -227923350, false);
        new P.d(new C0222e(7), -1332077603, false);
        new P.d(new C0222e(8), -1732512786, false);
        new P.d(new C0222e(9), -220046097, false);
        new P.d(new C0222e(11), -227870206, false);
        new P.d(new C0222e(12), -671581033, false);
        new P.d(new C0222e(13), -1859033030, false);
        new P.d(new C0222e(0), -527871881, false);
        india = new P.d(new C0221d(2), 252793933, false);
        juliet = new P.d(new C0221d(3), 1994635628, false);
        kilo = new P.d(new C0221d(4), 2096596267, false);
        new P.d(new C0222e(14), -255634847, false);
        new P.d(new C0222e(15), -742458796, false);
        lima = new P.d(new C0222e(16), -1604402889, false);
    }

    /* JADX WARN: Type inference failed for: r1v22, types: [java.lang.Object, java.util.Comparator] */
    /* JADX WARN: Type inference failed for: r2v21, types: [java.lang.Object, java.util.Comparator] */
    public static final void alpha(HomeViewModelV2 viewModel, yf.N isDriverOnlineFlow, yf.av hasInternetFlow, T.s sVar, Function0 function0, Function0 function02, Function1 function1, Function0 function03, InterfaceC0581m interfaceC0581m, int i4, int i5) {
        int i10;
        Function1 function12;
        char c3;
        int i11;
        boolean z2;
        T.s sVar2;
        Function1 function13;
        int i12;
        Function1 function14;
        boolean z10;
        androidx.compose.runtime.ax axVar;
        androidx.compose.runtime.ax axVar2;
        boolean z11;
        boolean z12;
        List p4;
        int i13;
        Function1 function15;
        Object obj;
        int i14;
        boolean z13;
        Object obj2;
        boolean z14;
        String actionText;
        boolean z15;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        Intrinsics.echo(viewModel, "viewModel");
        Intrinsics.echo(isDriverOnlineFlow, "isDriverOnlineFlow");
        Intrinsics.echo(hasInternetFlow, "hasInternetFlow");
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-922544603);
        if ((i4 & 6) == 0) {
            if (c0585q.india(viewModel)) {
                i20 = 4;
            } else {
                i20 = 2;
            }
            i10 = i20 | i4;
        } else {
            i10 = i4;
        }
        if ((i4 & 48) == 0) {
            if (c0585q.india(isDriverOnlineFlow)) {
                i19 = 32;
            } else {
                i19 = 16;
            }
            i10 |= i19;
        }
        if ((i4 & 384) == 0) {
            if (c0585q.india(hasInternetFlow)) {
                i18 = Barcode.FORMAT_QR_CODE;
            } else {
                i18 = 128;
            }
            i10 |= i18;
        }
        int i21 = i10 | 3072;
        if ((i4 & 24576) == 0) {
            if (c0585q.india(function0)) {
                i17 = Http2.INITIAL_MAX_FRAME_SIZE;
            } else {
                i17 = 8192;
            }
            i21 |= i17;
        }
        if ((196608 & i4) == 0) {
            if (c0585q.india(function02)) {
                i16 = 131072;
            } else {
                i16 = 65536;
            }
            i21 |= i16;
        }
        int i22 = i5 & 64;
        if (i22 != 0) {
            i21 |= 1572864;
            function12 = function1;
            c3 = ' ';
        } else {
            function12 = function1;
            c3 = ' ';
            if ((i4 & 1572864) == 0) {
                if (c0585q.india(function12)) {
                    i11 = 1048576;
                } else {
                    i11 = 524288;
                }
                i21 |= i11;
            }
        }
        if ((i4 & 12582912) == 0) {
            if (c0585q.india(function03)) {
                i15 = 8388608;
            } else {
                i15 = 4194304;
            }
            i21 |= i15;
        }
        if ((i21 & 4793491) != 4793490) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i21 & 1, z2)) {
            T.p pVar = T.p.alpha;
            Object obj3 = C0580l.alpha;
            if (i22 != 0) {
                Object jade = c0585q.jade();
                if (jade == obj3) {
                    i12 = 2;
                    jade = new Jb.aw(7);
                    c0585q.f(jade);
                } else {
                    i12 = 2;
                }
                function14 = (Function1) jade;
            } else {
                i12 = 2;
                function14 = function12;
            }
            androidx.compose.runtime.ax bravo2 = AbstractC2717m7.bravo(isDriverOnlineFlow, c0585q, (i21 >> 3) & 14);
            int i23 = 1;
            androidx.compose.runtime.ax bravo3 = AbstractC2717m7.bravo(CaptainLocationMonitoringService.f12067E, c0585q, 0);
            androidx.compose.runtime.ax bravo4 = AbstractC2717m7.bravo(CaptainLocationMonitoringService.f12068F, c0585q, 0);
            androidx.compose.runtime.ax charlie2 = AbstractC2717m7.charlie(hasInternetFlow, Boolean.TRUE, c0585q, ((i21 >> 6) & 14) | 48);
            androidx.compose.runtime.ax bravo5 = AbstractC2717m7.bravo(viewModel.juliet, c0585q, 0);
            androidx.compose.runtime.ax bravo6 = AbstractC2717m7.bravo(viewModel.echo, c0585q, 0);
            Object jade2 = c0585q.jade();
            if (jade2 == obj3) {
                jade2 = C0564b.zulu(Integer.valueOf(CaptainLocationMonitoringService.f12075M));
                c0585q.f(jade2);
            }
            androidx.compose.runtime.ax axVar3 = (androidx.compose.runtime.ax) jade2;
            p3.ah ahVar = (p3.ah) bravo3.getValue();
            Boolean bool = (Boolean) charlie2.getValue();
            bool.getClass();
            Object jade3 = c0585q.jade();
            if (jade3 == obj3) {
                jade3 = new C0218a(axVar3, null);
                c0585q.f(jade3);
            }
            C0564b.golf(ahVar, bool, (Xd.l) jade3, c0585q);
            boolean echo2 = c0585q.echo(((Number) axVar3.getValue()).intValue()) | c0585q.hotel(((Boolean) charlie2.getValue()).booleanValue());
            Object jade4 = c0585q.jade();
            if (echo2 || jade4 == obj3) {
                if (!((Boolean) charlie2.getValue()).booleanValue() || ((Number) axVar3.getValue()).intValue() < 10) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                jade4 = Boolean.valueOf(z10);
                c0585q.f(jade4);
            }
            Boolean bool2 = (Boolean) jade4;
            boolean booleanValue = bool2.booleanValue();
            Boolean bool3 = (Boolean) charlie2.getValue();
            bool3.getClass();
            Integer valueOf = Integer.valueOf(((Number) axVar3.getValue()).intValue());
            Boolean bool4 = (Boolean) bravo2.getValue();
            bool4.getClass();
            Object[] objArr = new Object[4];
            objArr[0] = bool2;
            objArr[1] = bool3;
            objArr[i12] = valueOf;
            objArr[3] = bool4;
            boolean hotel2 = c0585q.hotel(booleanValue) | c0585q.golf(charlie2) | c0585q.golf(bravo2);
            Object jade5 = c0585q.jade();
            if (!hotel2 && jade5 != obj3) {
                axVar = charlie2;
                axVar2 = bravo2;
            } else {
                axVar = charlie2;
                axVar2 = bravo2;
                jade5 = new C0219b(booleanValue, axVar, axVar3, axVar2, null);
                c0585q.f(jade5);
            }
            C0564b.india(objArr, (Xd.l) jade5, c0585q);
            boolean hotel3 = c0585q.hotel(((Boolean) axVar2.getValue()).booleanValue()) | c0585q.hotel(((Boolean) axVar.getValue()).booleanValue()) | c0585q.echo(((p3.ah) bravo3.getValue()).ordinal()) | c0585q.echo(((EnumC2270b) bravo4.getValue()).ordinal()) | c0585q.hotel(booleanValue) | c0585q.golf((List) bravo5.getValue()) | c0585q.hotel(((Boolean) bravo6.getValue()).booleanValue());
            Object jade6 = c0585q.jade();
            if (hotel3 || jade6 == obj3) {
                boolean booleanValue2 = ((Boolean) axVar2.getValue()).booleanValue();
                boolean booleanValue3 = ((Boolean) axVar.getValue()).booleanValue();
                p3.ah stompConnectionState = (p3.ah) bravo3.getValue();
                EnumC2270b gpsQuality = (EnumC2270b) bravo4.getValue();
                List<AttributeGroup> recommendedGroups = (List) bravo5.getValue();
                boolean booleanValue4 = ((Boolean) bravo6.getValue()).booleanValue();
                Intrinsics.echo(stompConnectionState, "stompConnectionState");
                Intrinsics.echo(gpsQuality, "gpsQuality");
                Intrinsics.echo(recommendedGroups, "recommendedGroups");
                EnumC2270b[] enumC2270bArr = new EnumC2270b[3];
                enumC2270bArr[0] = EnumC2270b.teal;
                enumC2270bArr[1] = EnumC2270b.white;
                enumC2270bArr[i12] = EnumC2270b.yellow;
                boolean contains = CollectionsKt.listOf(enumC2270bArr).contains(gpsQuality);
                if (stompConnectionState == p3.ah.alpha) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (stompConnectionState == p3.ah.red && booleanValue) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (!booleanValue3) {
                    p4 = kotlin.collections.ab.juliet(Nb.b.purple);
                } else {
                    ArrayList arrayList = new ArrayList();
                    if (booleanValue2 && z11) {
                        arrayList.add(Nb.b.red);
                    }
                    if (booleanValue2 && z12) {
                        arrayList.add(Nb.b.silver);
                    }
                    if (booleanValue2 && contains) {
                        arrayList.add(Nb.b.teal);
                    }
                    p4 = CollectionsKt.p(arrayList, new Object());
                }
                ArrayList B = CollectionsKt.B(p4);
                for (AttributeGroup attributeGroup : recommendedGroups) {
                    B.add(Nb.b.white);
                }
                if (booleanValue4) {
                    B.add(Nb.b.yellow);
                }
                jade6 = CollectionsKt.p(B, new Object());
                c0585q.f(jade6);
            }
            List list = (List) jade6;
            int i24 = i21 >> 9;
            C0554u alpha2 = AbstractC0553t.alpha(AbstractC0542h.charlie, T.d.f2062f, c0585q, 0);
            long j5 = c0585q.magenta;
            int i25 = (int) (j5 ^ (j5 >>> c3));
            androidx.compose.runtime.I mike = c0585q.mike();
            T.s charlie3 = T.a.charlie(pVar, c0585q);
            InterfaceC2552l.maroon.getClass();
            Function0 function04 = C2551k.bravo;
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(function04);
            } else {
                c0585q.i();
            }
            C0564b.blue(C2551k.foxtrot, c0585q, alpha2);
            C0564b.blue(C2551k.echo, c0585q, mike);
            C2549i c2549i = C2551k.golf;
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i25))) {
                ao.ad.blue(i25, c0585q, i25, c2549i);
            }
            C0564b.blue(C2551k.delta, c0585q, charlie3);
            c0585q.purple(-112994494);
            int i26 = 0;
            int i27 = 0;
            for (Object obj4 : list) {
                int i28 = i26 + 1;
                if (i26 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                int ordinal = ((Nb.b) obj4).ordinal();
                if (ordinal != 0) {
                    if (ordinal != i23) {
                        if (ordinal != i12) {
                            if (ordinal != 3) {
                                if (ordinal != 4) {
                                    if (ordinal == 5) {
                                        c0585q.purple(471110805);
                                        ad.alpha((i21 >> 21) & 14, null, c0585q, function03);
                                        c0585q.quebec(false);
                                        i13 = i24;
                                        function15 = function14;
                                        obj = obj3;
                                    } else {
                                        throw ao.ad.black(c0585q, -1785945182, false);
                                    }
                                } else {
                                    c0585q.purple(470630584);
                                    AttributeGroup attributeGroup2 = (AttributeGroup) CollectionsKt.jade(i27, (List) bravo5.getValue());
                                    i27++;
                                    if (attributeGroup2 != null && (actionText = attributeGroup2.getActionText()) != null && !StringsKt.gray(actionText)) {
                                        c0585q.purple(470817421);
                                        String actionText2 = attributeGroup2.getActionText();
                                        if (actionText2 == null) {
                                            actionText2 = "";
                                        }
                                        i13 = i24;
                                        if ((i21 & 3670016) == 1048576) {
                                            z15 = true;
                                        } else {
                                            z15 = false;
                                        }
                                        boolean india2 = z15 | c0585q.india(attributeGroup2);
                                        Object jade7 = c0585q.jade();
                                        if (india2 || jade7 == obj3) {
                                            jade7 = new Ac.g(12, function14, attributeGroup2);
                                            c0585q.f(jade7);
                                        }
                                        obj2 = null;
                                        z14 = false;
                                        a0.alpha(0, null, c0585q, actionText2, (Function0) jade7);
                                        c0585q.quebec(false);
                                    } else {
                                        i13 = i24;
                                        obj2 = null;
                                        z14 = false;
                                        c0585q.purple(465331382);
                                        c0585q.quebec(false);
                                    }
                                    c0585q.quebec(z14);
                                    function15 = function14;
                                    obj = obj3;
                                }
                            } else {
                                i13 = i24;
                                c0585q.purple(-1785937070);
                                obj = obj3;
                                function15 = function14;
                                bravo(null, function0, null, null, c0585q, i13 & 112, 13);
                                c0585q.quebec(false);
                            }
                        } else {
                            i13 = i24;
                            function15 = function14;
                            obj = obj3;
                            c0585q.purple(-1785939912);
                            oscar(null, function02, null, null, c0585q, (i21 >> 12) & 112, 13);
                            c0585q.quebec(false);
                        }
                    } else {
                        i13 = i24;
                        function15 = function14;
                        obj = obj3;
                        c0585q.purple(-1785942016);
                        november(null, c0585q, 0, 1);
                        c0585q.quebec(false);
                    }
                } else {
                    i13 = i24;
                    function15 = function14;
                    obj = obj3;
                    c0585q.purple(-1785944096);
                    charlie(null, null, c0585q, 0, 3);
                    c0585q.quebec(false);
                }
                if (i26 < CollectionsKt.ivory(list)) {
                    c0585q.purple(471264782);
                    i14 = 2;
                    AbstractC0538d.echo(androidx.compose.foundation.layout.V.echo(pVar, 2), c0585q);
                    z13 = false;
                } else {
                    i14 = 2;
                    z13 = false;
                    c0585q.purple(465331382);
                }
                c0585q.quebec(z13);
                i24 = i13;
                i12 = i14;
                function14 = function15;
                i26 = i28;
                obj3 = obj;
                i23 = 1;
            }
            c0585q.quebec(false);
            c0585q.quebec(true);
            sVar2 = pVar;
            function13 = function14;
        } else {
            c0585q.ochre();
            sVar2 = sVar;
            function13 = function12;
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new Gb.y(viewModel, isDriverOnlineFlow, hasInternetFlow, sVar2, function0, function02, function13, function03, i4, i5);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01f0, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r14.jade(), java.lang.Integer.valueOf(r2)) == false) goto L121;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void amber(final String title, final String description, final String sectionLabel, final String mobileHint, final String submitLabel, String dismissLabel, final String mobileValue, final String str, final Function1 onMobileChange, final Function1 onSubmit, final Function0 onDismiss, boolean z2, String str2, T.p pVar, InterfaceC0581m interfaceC0581m, final int i4, final int i5, final int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        String str3;
        C0585q c0585q;
        boolean z10;
        final String str4;
        final T.p pVar2;
        C2549i c2549i;
        C2550j c2550j;
        C2549i c2549i2;
        int i16;
        int i17;
        String str5;
        ?? r10;
        int i18;
        Intrinsics.echo(title, "title");
        Intrinsics.echo(description, "description");
        Intrinsics.echo(sectionLabel, "sectionLabel");
        Intrinsics.echo(mobileHint, "mobileHint");
        Intrinsics.echo(submitLabel, "submitLabel");
        Intrinsics.echo(dismissLabel, "dismissLabel");
        Intrinsics.echo(mobileValue, "mobileValue");
        Intrinsics.echo(onMobileChange, "onMobileChange");
        Intrinsics.echo(onSubmit, "onSubmit");
        Intrinsics.echo(onDismiss, "onDismiss");
        C0585q c0585q2 = (C0585q) interfaceC0581m;
        c0585q2.silver(-322089536);
        if ((i4 & 6) == 0) {
            i11 = i4 | (c0585q2.golf(title) ? 4 : 2);
        } else {
            i11 = i4;
        }
        if ((i4 & 48) == 0) {
            i11 |= c0585q2.golf(description) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i11 |= c0585q2.golf(sectionLabel) ? 256 : 128;
        }
        if ((i4 & 3072) == 0) {
            i11 |= c0585q2.golf(mobileHint) ? 2048 : Barcode.FORMAT_UPC_E;
        }
        if ((i4 & 24576) == 0) {
            i11 |= c0585q2.golf(submitLabel) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((196608 & i4) == 0) {
            i11 |= c0585q2.golf(dismissLabel) ? 131072 : 65536;
        }
        if ((1572864 & i4) == 0) {
            i11 |= c0585q2.golf(mobileValue) ? 1048576 : 524288;
        }
        if ((12582912 & i4) == 0) {
            i11 |= c0585q2.golf(str) ? 8388608 : 4194304;
        }
        if ((100663296 & i4) == 0) {
            i11 |= c0585q2.india(onMobileChange) ? 67108864 : 33554432;
        }
        if ((805306368 & i4) == 0) {
            i11 |= c0585q2.india(onSubmit) ? 536870912 : 268435456;
        }
        int i19 = i11;
        if ((i5 & 6) == 0) {
            i12 = i5 | (c0585q2.india(onDismiss) ? 4 : 2);
        } else {
            i12 = i5;
        }
        int i20 = 2048 & i10;
        if (i20 != 0) {
            i13 = i12 | 48;
        } else {
            i13 = i12 | (c0585q2.hotel(z2) ? 32 : 16);
        }
        int i21 = i10 & 4096;
        if (i21 != 0) {
            i15 = i13 | 384;
            i14 = i21;
        } else {
            i14 = i21;
            i15 = i13 | (c0585q2.golf(str2) ? 256 : 128);
        }
        int i22 = i15 | 3072;
        if (c0585q2.magenta(i19 & 1, ((i19 & 306783379) == 306783378 && (i22 & 1171) == 1170) ? false : true)) {
            boolean z11 = i20 != 0 ? false : z2;
            P.d dVar = null;
            String str6 = i14 != 0 ? null : str2;
            T.p pVar3 = T.p.alpha;
            boolean z12 = z11;
            T.s charlie2 = androidx.compose.foundation.layout.V.charlie(pVar3, 1.0f);
            float f5 = 16;
            T.s victor = AbstractC0538d.victor(charlie2, f5, f5, f5, f5);
            C0540f golf2 = AbstractC0542h.golf(f5);
            T.i iVar = T.d.f2062f;
            C0554u alpha2 = AbstractC0553t.alpha(golf2, iVar, c0585q2, 54);
            long j5 = c0585q2.magenta;
            int i23 = (int) (j5 ^ (j5 >>> 32));
            androidx.compose.runtime.I mike = c0585q2.mike();
            T.s charlie3 = T.a.charlie(victor, c0585q2);
            InterfaceC2552l.maroon.getClass();
            C2550j c2550j2 = C2551k.bravo;
            c0585q2.white();
            if (c0585q2.lime) {
                c0585q2.lima(c2550j2);
            } else {
                c0585q2.i();
            }
            C2549i c2549i3 = C2551k.foxtrot;
            C0564b.blue(c2549i3, c0585q2, alpha2);
            C2549i c2549i4 = C2551k.echo;
            C0564b.blue(c2549i4, c0585q2, mike);
            C2549i c2549i5 = C2551k.golf;
            if (c0585q2.lime) {
                c2549i = c2549i3;
            } else {
                c2549i = c2549i3;
            }
            ao.ad.blue(i23, c0585q2, i23, c2549i5);
            C2549i c2549i6 = C2551k.delta;
            C0564b.blue(c2549i6, c0585q2, charlie3);
            long charlie4 = AbstractC2636d7.charlie(18);
            H0.n nVar = Db.g.alpha;
            H0.v vVar = new H0.v(700);
            long j6 = ax.bravo;
            z10 = z12;
            C2549i c2549i7 = c2549i;
            G2.bravo(title, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, new D0.an(j6, charlie4, vVar, null, nVar, 0L, 0, 0L, 0, 16777176), c0585q2, i19 & 14, 0, 65534);
            yankee(description, c0585q2, (i19 >> 3) & 14);
            C0554u alpha3 = AbstractC0553t.alpha(AbstractC0542h.golf(f5), iVar, c0585q2, 54);
            long j7 = c0585q2.magenta;
            int i24 = (int) (j7 ^ (j7 >>> 32));
            androidx.compose.runtime.I mike2 = c0585q2.mike();
            T.s charlie5 = T.a.charlie(pVar3, c0585q2);
            c0585q2.white();
            if (c0585q2.lime) {
                c2550j = c2550j2;
                c0585q2.lima(c2550j);
            } else {
                c2550j = c2550j2;
                c0585q2.i();
            }
            C0564b.blue(c2549i7, c0585q2, alpha3);
            C0564b.blue(c2549i4, c0585q2, mike2);
            if (c0585q2.lime || !Intrinsics.areEqual(c0585q2.jade(), Integer.valueOf(i24))) {
                c2549i2 = c2549i5;
                ao.ad.blue(i24, c0585q2, i24, c2549i2);
            } else {
                c2549i2 = c2549i5;
            }
            C0564b.blue(c2549i6, c0585q2, charlie5);
            AbstractC0538d.echo(androidx.compose.foundation.layout.V.echo(pVar3, 6), c0585q2);
            C2549i c2549i8 = c2549i2;
            C2550j c2550j3 = c2550j;
            G2.bravo(sectionLabel, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, new D0.an(j6, AbstractC2636d7.charlie(16), new H0.v(700), null, nVar, 0L, 0, 0L, 0, 16777176), c0585q2, (i19 >> 6) & 14, 0, 65534);
            boolean z13 = str != null;
            if (str == null) {
                c0585q2.purple(-1245680410);
                i16 = 0;
                c0585q2.quebec(false);
                i17 = 8;
            } else {
                i16 = 0;
                c0585q2.purple(-1245680409);
                i17 = 8;
                dVar = P.e.echo(-540202825, new Ac.i(str, i17), c0585q2);
                c0585q2.quebec(false);
            }
            P.d dVar2 = dVar;
            n.aw awVar = new n.aw(4, i16, 123);
            T.s charlie6 = androidx.compose.foundation.layout.V.charlie(pVar3, 1.0f);
            C2093f bravo2 = AbstractC2094g.bravo(4);
            C0150q1 c0150q1 = C0150q1.alpha;
            long j10 = ax.india;
            long j11 = ax.hotel;
            long j12 = ax.kilo;
            AbstractC0174x1.alpha(mobileValue, onMobileChange, charlie6, false, null, foxtrot, P.e.echo(178151611, new Ac.i(mobileHint, 9), c0585q2), golf, null, dVar2, z13, null, awVar, null, true, 0, 0, bravo2, C0150q1.charlie(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, j10, j10, 0L, j11, j12, j12, 0L, 0L, 0L, 0L, c0585q2, 2122295295), c0585q2, ((i19 >> 18) & 14) | 114819456 | ((i19 >> 21) & 112), 12779520, 1920568);
            c0585q2.quebec(true);
            if (str6 != null && !StringsKt.gray(str6)) {
                c0585q2.purple(-2030266296);
                i18 = 6;
                str5 = str6;
                G2.bravo(str5, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, new D0.an(j11, AbstractC2636d7.charlie(13), null, null, nVar, 0L, 0, 0L, 0, 16777180), c0585q2, (i22 >> 6) & 14, 0, 65534);
                r10 = 0;
            } else {
                str5 = str6;
                r10 = 0;
                i18 = 6;
                c0585q2.purple(-2037508392);
            }
            c0585q2.quebec(r10);
            T.s charlie7 = androidx.compose.foundation.layout.V.charlie(pVar3, 1.0f);
            androidx.compose.foundation.layout.S alpha4 = androidx.compose.foundation.layout.Q.alpha(AbstractC0542h.golf(8), T.d.f2060c, c0585q2, i18);
            long j13 = c0585q2.magenta;
            int i25 = (int) (j13 ^ (j13 >>> 32));
            androidx.compose.runtime.I mike3 = c0585q2.mike();
            T.s charlie8 = T.a.charlie(charlie7, c0585q2);
            c0585q2.white();
            if (c0585q2.lime) {
                c0585q2.lima(c2550j3);
            } else {
                c0585q2.i();
            }
            C0564b.blue(c2549i7, c0585q2, alpha4);
            C0564b.blue(c2549i4, c0585q2, mike3);
            if (c0585q2.lime || !Intrinsics.areEqual(c0585q2.jade(), Integer.valueOf(i25))) {
                ao.ad.blue(i25, c0585q2, i25, c2549i8);
            }
            C0564b.blue(c2549i6, c0585q2, charlie8);
            boolean z14 = ((i19 & 1879048192) == 536870912 ? true : r10) | ((i19 & 3670016) == 1048576 ? true : r10);
            Object jade = c0585q2.jade();
            if (z14 || jade == C0580l.alpha) {
                jade = new G(mobileValue, onSubmit);
                c0585q2.f(jade);
            }
            Function0 function0 = (Function0) jade;
            if (1.0f <= 0.0d) {
                AbstractC1797a.alpha("invalid weight; must be greater than zero");
            }
            float f10 = 55;
            T.s echo2 = androidx.compose.foundation.layout.V.echo(new LayoutWeightElement(1.0f, true), f10);
            float f11 = 12;
            C2093f bravo3 = AbstractC2094g.bravo(f11);
            androidx.compose.foundation.layout.M m4 = F.al.alpha;
            K1.bravo(function0, echo2, false, bravo3, F.al.alpha(ax.charlie, 0L, a0.ao.delta(4283585115L), 0L, c0585q2, 10), null, null, new androidx.compose.foundation.layout.M(f5, f5, f5, f5), P.e.echo(-1214276042, new H(submitLabel, r10, z10), c0585q2), c0585q2, 817889280, 356);
            str3 = dismissLabel;
            K1.hotel(onDismiss, androidx.compose.foundation.layout.V.echo(androidx.compose.foundation.layout.V.oscar(pVar3, 136), f10), false, AbstractC2094g.bravo(f11), F.al.delta(ax.alpha, j6, 0L, 0L, c0585q2, 12), null, S3.alpha(1, ax.delta), new androidx.compose.foundation.layout.M(f5, f5, f5, f5), P.e.echo(331370100, new Ec.ai(str3, 4), c0585q2), c0585q2, 819462192 | (i22 & 14), 292);
            c0585q = c0585q2;
            c0585q.quebec(true);
            c0585q.quebec(true);
            pVar2 = pVar3;
            str4 = str5;
        } else {
            str3 = dismissLabel;
            c0585q = c0585q2;
            c0585q.ochre();
            z10 = z2;
            str4 = str2;
            pVar2 = pVar;
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            final String str7 = str3;
            final boolean z15 = z10;
            uniform.delta = new Xd.l() { // from class: Lb.I
                @Override // Xd.l
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int cyan = C0564b.cyan(i4 | 1);
                    int cyan2 = C0564b.cyan(i5);
                    T.p pVar4 = pVar2;
                    int i26 = i10;
                    AbstractC0220c.amber(title, description, sectionLabel, mobileHint, submitLabel, str7, mobileValue, str, onMobileChange, onSubmit, onDismiss, z15, str4, pVar4, (InterfaceC0581m) obj, cyan, cyan2, i26);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void azure(Function0 onOk, String str, T.p pVar, InterfaceC0581m interfaceC0581m, int i4, int i5) {
        int i10;
        String str2;
        int i11;
        int i12;
        boolean z2;
        T.p pVar2;
        String str3;
        androidx.compose.runtime.Q uniform;
        String str4;
        String str5;
        int i13;
        Intrinsics.echo(onOk, "onOk");
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(1817262054);
        if ((i4 & 6) == 0) {
            if (c0585q.india(onOk)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i10 = i4 | i13;
        } else {
            i10 = i4;
        }
        int i14 = i5 & 2;
        if (i14 != 0) {
            i10 |= 48;
        } else if ((i4 & 48) == 0) {
            str2 = str;
            if (c0585q.golf(str2)) {
                i11 = 32;
            } else {
                i11 = 16;
            }
            i10 |= i11;
            i12 = i10 | 384;
            if ((i12 & 147) == 146) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!c0585q.magenta(i12 & 1, z2)) {
                if (i14 != 0) {
                    str4 = null;
                } else {
                    str4 = str2;
                }
                T.p pVar3 = T.p.alpha;
                T.s sierra = AbstractC0538d.sierra(androidx.compose.foundation.layout.V.charlie(pVar3, 1.0f), 24);
                float f5 = 16;
                C0554u alpha2 = AbstractC0553t.alpha(AbstractC0542h.golf(f5), T.d.f2063g, c0585q, 54);
                long j5 = c0585q.magenta;
                int i15 = (int) (j5 ^ (j5 >>> 32));
                androidx.compose.runtime.I mike = c0585q.mike();
                T.s charlie2 = T.a.charlie(sierra, c0585q);
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
                if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i15))) {
                    ao.ad.blue(i15, c0585q, i15, c2549i);
                }
                C0564b.blue(C2551k.delta, c0585q, charlie2);
                AbstractC0141o0.alpha(AbstractC3076w3.charlie(R.drawable.done, c0585q, 6), null, androidx.compose.foundation.layout.V.kilo(pVar3, 56), a0.ao.delta(4279673674L), c0585q, 3504, 0);
                if (str4 == null) {
                    str5 = Q0.c.oscar(c0585q, -1426368868, R.string.stc_success_message, c0585q, false);
                } else {
                    c0585q.purple(-1426369426);
                    c0585q.quebec(false);
                    str5 = str4;
                }
                G2.bravo(str5, null, 0L, 0L, null, null, 0L, new O0.k(3), 0L, 0, false, 0, 0, null, new D0.an(ax.bravo, AbstractC2636d7.charlie(22), new H0.v(700), null, Db.g.alpha, 0L, 0, 0L, 0, 16777176), c0585q, 0, 0, 65022);
                T.s echo2 = androidx.compose.foundation.layout.V.echo(androidx.compose.foundation.layout.V.charlie(pVar3, 1.0f), 55);
                C2093f bravo2 = AbstractC2094g.bravo(12);
                androidx.compose.foundation.layout.M m4 = F.al.alpha;
                K1.bravo(onOk, echo2, false, bravo2, F.al.alpha(ax.charlie, 0L, 0L, 0L, c0585q, 14), null, null, new androidx.compose.foundation.layout.M(f5, f5, f5, f5), hotel, c0585q, (i12 & 14) | 817889328, 356);
                c0585q = c0585q;
                c0585q.quebec(true);
                pVar2 = pVar3;
                str3 = str4;
            } else {
                c0585q.ochre();
                pVar2 = pVar;
                str3 = str2;
            }
            uniform = c0585q.uniform();
            if (uniform == null) {
                uniform.delta = new F(onOk, str3, pVar2, i4, i5, 0);
                return;
            }
            return;
        }
        str2 = str;
        i12 = i10 | 384;
        if ((i12 & 147) == 146) {
        }
        if (!c0585q.magenta(i12 & 1, z2)) {
        }
        uniform = c0585q.uniform();
        if (uniform == null) {
        }
    }

    public static final void beige(int i4, T.p pVar, InterfaceC0581m interfaceC0581m, Function0 function0) {
        int i5;
        boolean z2;
        T.p pVar2;
        boolean z10;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-1203936658);
        int i10 = i4 | 6;
        if (c0585q.india(function0)) {
            i5 = 32;
        } else {
            i5 = 16;
        }
        int i11 = i10 | i5;
        if ((i11 & 19) != 18) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i11 & 1, z2)) {
            T.p pVar3 = T.p.alpha;
            androidx.compose.runtime.as asVar = C0580l.alpha;
            T.s bravo2 = androidx.compose.foundation.a.bravo(androidx.compose.foundation.layout.V.golf(androidx.compose.foundation.layout.V.charlie(pVar3, 1.0f), 48, 0.0f, 2), Db.c.ochre, a0.ao.alpha);
            if ((i11 & 112) == 32) {
                z10 = true;
            } else {
                z10 = false;
            }
            Object jade = c0585q.jade();
            if (z10 || jade == asVar) {
                jade = new Bb.a(function0, 7);
                c0585q.f(jade);
            }
            T.s echo2 = androidx.compose.foundation.a.echo(15, bravo2, null, (Function0) jade, false);
            float f5 = 10;
            float f10 = 12;
            T.s victor = AbstractC0538d.victor(echo2, f5, f10, f5, f10);
            J1.e eVar = AbstractC0542h.golf;
            T.j jVar = T.d.f2061d;
            androidx.compose.foundation.layout.S alpha2 = androidx.compose.foundation.layout.Q.alpha(eVar, jVar, c0585q, 54);
            long j5 = c0585q.magenta;
            int i12 = (int) (j5 ^ (j5 >>> 32));
            androidx.compose.runtime.I mike = c0585q.mike();
            T.s charlie2 = T.a.charlie(victor, c0585q);
            InterfaceC2552l.maroon.getClass();
            C2550j c2550j = C2551k.bravo;
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j);
            } else {
                c0585q.i();
            }
            C2549i c2549i = C2551k.foxtrot;
            C0564b.blue(c2549i, c0585q, alpha2);
            C2549i c2549i2 = C2551k.echo;
            C0564b.blue(c2549i2, c0585q, mike);
            C2549i c2549i3 = C2551k.golf;
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i12))) {
                ao.ad.blue(i12, c0585q, i12, c2549i3);
            }
            C2549i c2549i4 = C2551k.delta;
            C0564b.blue(c2549i4, c0585q, charlie2);
            C0540f golf2 = AbstractC0542h.golf(8);
            if (1.0f <= 0.0d) {
                AbstractC1797a.alpha("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, false);
            androidx.compose.foundation.layout.S alpha3 = androidx.compose.foundation.layout.Q.alpha(golf2, jVar, c0585q, 54);
            long j6 = c0585q.magenta;
            int i13 = (int) (j6 ^ (j6 >>> 32));
            androidx.compose.runtime.I mike2 = c0585q.mike();
            T.s charlie3 = T.a.charlie(layoutWeightElement, c0585q);
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j);
            } else {
                c0585q.i();
            }
            C0564b.blue(c2549i, c0585q, alpha3);
            C0564b.blue(c2549i2, c0585q, mike2);
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i13))) {
                ao.ad.blue(i13, c0585q, i13, c2549i3);
            }
            C0564b.blue(c2549i4, c0585q, charlie3);
            AbstractC1680b charlie4 = AbstractC3076w3.charlie(R.drawable.information_line, c0585q, 6);
            long j7 = C0366t.echo;
            float f11 = 20;
            AbstractC0141o0.alpha(charlie4, null, androidx.compose.foundation.layout.V.kilo(pVar3, f11), j7, c0585q, 3504, 0);
            String bravo3 = AbstractC3086y3.bravo(c0585q, R.string.suspended);
            long charlie5 = AbstractC2636d7.charlie(14);
            H0.n nVar = Db.g.alpha;
            G2.bravo(bravo3, null, j7, 0L, null, null, 0L, null, 0L, 0, false, 1, 0, null, new D0.an(0L, charlie5, H0.v.f1409c, null, nVar, 0L, 0, 0L, 0, 16777177), c0585q, 384, 3072, 57338);
            c0585q.quebec(true);
            androidx.compose.foundation.layout.S alpha4 = androidx.compose.foundation.layout.Q.alpha(AbstractC0542h.golf(Db.f.bravo), jVar, c0585q, 48);
            long j10 = c0585q.magenta;
            int i14 = (int) (j10 ^ (j10 >>> 32));
            androidx.compose.runtime.I mike3 = c0585q.mike();
            T.s charlie6 = T.a.charlie(pVar3, c0585q);
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j);
            } else {
                c0585q.i();
            }
            C0564b.blue(c2549i, c0585q, alpha4);
            C0564b.blue(c2549i2, c0585q, mike3);
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i14))) {
                ao.ad.blue(i14, c0585q, i14, c2549i3);
            }
            C0564b.blue(c2549i4, c0585q, charlie6);
            pVar2 = pVar3;
            G2.bravo(AbstractC3086y3.bravo(c0585q, R.string.see_why), null, j7, 0L, null, null, 0L, null, 0L, 0, false, 1, 0, null, new D0.an(0L, AbstractC2636d7.charlie(14), H0.v.f1407a, null, nVar, 0L, 0, 0L, 0, 16777177), c0585q, 384, 3072, 57338);
            c0585q = c0585q;
            AbstractC0141o0.bravo(B7.b.bravo(), null, androidx.compose.foundation.layout.V.kilo(pVar2, f11), j7, c0585q, 3504, 0);
            c0585q.quebec(true);
            c0585q.quebec(true);
        } else {
            c0585q.ochre();
            pVar2 = pVar;
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new ag(pVar2, function0, i4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void black(T.p pVar, String str, InterfaceC0581m interfaceC0581m, int i4, int i5) {
        String str2;
        int i10;
        boolean z2;
        T.p pVar2;
        String str3;
        androidx.compose.runtime.Q uniform;
        String str4;
        String oscar;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(1231366442);
        int i11 = i4 | 6;
        int i12 = i5 & 2;
        if (i12 != 0) {
            i11 = i4 | 54;
        } else if ((i4 & 48) == 0) {
            str2 = str;
            if (c0585q.golf(str2)) {
                i10 = 32;
            } else {
                i10 = 16;
            }
            i11 |= i10;
            if ((i11 & 19) == 18) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!c0585q.magenta(i11 & 1, z2)) {
                T.p pVar3 = T.p.alpha;
                if (i12 != 0) {
                    str4 = null;
                } else {
                    str4 = str2;
                }
                if (str4 != null && !StringsKt.gray(str4)) {
                    c0585q.purple(322195028);
                    oscar = AbstractC3086y3.alpha(R.string.status_header_suspended_cannot_work, new Object[]{str4}, c0585q);
                    c0585q.quebec(false);
                } else {
                    oscar = Q0.c.oscar(c0585q, 322299963, R.string.status_header_suspended_until_further_notice, c0585q, false);
                }
                kotlin.text.n.alpha(oscar, Db.c.olive, Db.c.ochre, new D0.an(0L, AbstractC2636d7.charlie(13), H0.v.e, null, Db.g.alpha, 0L, 0, 0L, 0, 16777177), echo, c0585q, 221184);
                pVar2 = pVar3;
                str3 = str4;
            } else {
                c0585q.ochre();
                pVar2 = pVar;
                str3 = str2;
            }
            uniform = c0585q.uniform();
            if (uniform == null) {
                uniform.delta = new af(i4, pVar2, str3, i5, 1);
                return;
            }
            return;
        }
        str2 = str;
        if ((i11 & 19) == 18) {
        }
        if (!c0585q.magenta(i11 & 1, z2)) {
        }
        uniform = c0585q.uniform();
        if (uniform == null) {
        }
    }

    public static final void blue(int i4, InterfaceC0581m interfaceC0581m, String str, String str2, Function0 onDismiss) {
        int i5;
        int i10;
        int i11;
        boolean z2;
        Function0 function0;
        Intrinsics.echo(onDismiss, "onDismiss");
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-1471343196);
        if (c0585q.india(onDismiss)) {
            i5 = 4;
        } else {
            i5 = 2;
        }
        int i12 = i5 | i4;
        if (c0585q.golf(str)) {
            i10 = 32;
        } else {
            i10 = 16;
        }
        int i13 = i12 | i10;
        if (c0585q.golf(str2)) {
            i11 = Barcode.FORMAT_QR_CODE;
        } else {
            i11 = 128;
        }
        int i14 = i13 | i11;
        if ((i14 & 147) != 146) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i14 & 1, z2)) {
            function0 = onDismiss;
            E7.alpha(function0, null, P.e.echo(-711575763, new b0(str, str2, onDismiss), c0585q), c0585q, (i14 & 14) | 384, 2);
        } else {
            function0 = onDismiss;
            c0585q.ochre();
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new b0(function0, str, str2, i4);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x010d, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r11.jade(), java.lang.Integer.valueOf(r6)) == false) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void bravo(T.s sVar, Function0 function0, String str, String str2, InterfaceC0581m interfaceC0581m, int i4, int i5) {
        T.s sVar2;
        int i10;
        int i11;
        boolean z2;
        String str3;
        T.s sVar3;
        String str4;
        int i12;
        String bravo2;
        String bravo3;
        int i13;
        T.s sVar4;
        T.j jVar;
        boolean z10;
        int i14;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(1744017333);
        int i15 = i5 & 1;
        if (i15 != 0) {
            i10 = i4 | 6;
            sVar2 = sVar;
        } else if ((i4 & 6) == 0) {
            sVar2 = sVar;
            if (c0585q.golf(sVar2)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i10 = i11 | i4;
        } else {
            sVar2 = sVar;
            i10 = i4;
        }
        if ((i4 & 48) == 0) {
            if (c0585q.india(function0)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i10 |= i14;
        }
        if ((i4 & 384) == 0) {
            i10 |= 128;
        }
        if ((i4 & 3072) == 0) {
            i10 |= Barcode.FORMAT_UPC_E;
        }
        if ((i10 & 1171) != 1170) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i10 & 1, z2)) {
            c0585q.orange();
            int i16 = i4 & 1;
            T.p pVar = T.p.alpha;
            androidx.compose.runtime.as asVar = C0580l.alpha;
            if (i16 != 0 && !c0585q.beige()) {
                c0585q.ochre();
                i12 = i10 & (-8065);
                i13 = 32;
                bravo2 = str;
                bravo3 = str2;
            } else {
                if (i15 != 0) {
                    sVar2 = pVar;
                }
                i12 = i10 & (-8065);
                bravo2 = AbstractC3086y3.bravo(c0585q, R.string.status_header_icon_gps_weak);
                bravo3 = AbstractC3086y3.bravo(c0585q, R.string.status_header_action_fix_gps);
                i13 = 32;
            }
            c0585q.romeo();
            int i17 = i13;
            float f5 = 8;
            float f10 = 12;
            T.s victor = AbstractC0538d.victor(androidx.compose.foundation.a.bravo(androidx.compose.foundation.layout.V.golf(androidx.compose.foundation.layout.V.charlie(sVar2, 1.0f), 48, 0.0f, 2), a0.ao.delta(4294626325L), a0.ao.alpha), f5, f10, f5, f10);
            J1.e eVar = AbstractC0542h.golf;
            T.j jVar2 = T.d.f2061d;
            androidx.compose.foundation.layout.S alpha2 = androidx.compose.foundation.layout.Q.alpha(eVar, jVar2, c0585q, 54);
            String str5 = bravo2;
            long j5 = c0585q.magenta;
            int i18 = (int) (j5 ^ (j5 >>> i17));
            androidx.compose.runtime.I mike = c0585q.mike();
            T.s charlie2 = T.a.charlie(victor, c0585q);
            InterfaceC2552l.maroon.getClass();
            C2550j c2550j = C2551k.bravo;
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j);
            } else {
                c0585q.i();
            }
            C2549i c2549i = C2551k.foxtrot;
            C0564b.blue(c2549i, c0585q, alpha2);
            C2549i c2549i2 = C2551k.echo;
            C0564b.blue(c2549i2, c0585q, mike);
            C2549i c2549i3 = C2551k.golf;
            if (!c0585q.lime) {
                sVar4 = sVar2;
            } else {
                sVar4 = sVar2;
            }
            ao.ad.blue(i18, c0585q, i18, c2549i3);
            C2549i c2549i4 = C2551k.delta;
            C0564b.blue(c2549i4, c0585q, charlie2);
            int i19 = i12;
            if (1.0f <= 0.0d) {
                AbstractC1797a.alpha("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, false);
            androidx.compose.foundation.layout.S alpha3 = androidx.compose.foundation.layout.Q.alpha(AbstractC0542h.golf(Db.d.charlie), jVar2, c0585q, 48);
            long j6 = c0585q.magenta;
            int i20 = (int) (j6 ^ (j6 >>> i17));
            androidx.compose.runtime.I mike2 = c0585q.mike();
            T.s charlie3 = T.a.charlie(layoutWeightElement, c0585q);
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j);
            } else {
                c0585q.i();
            }
            C0564b.blue(c2549i, c0585q, alpha3);
            C0564b.blue(c2549i2, c0585q, mike2);
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i20))) {
                ao.ad.blue(i20, c0585q, i20, c2549i3);
            }
            C0564b.blue(c2549i4, c0585q, charlie3);
            AbstractC1680b charlie4 = AbstractC3076w3.charlie(R.drawable.notification_icon, c0585q, 6);
            C2394m c2394m = C2391j.echo;
            T.s kilo2 = androidx.compose.foundation.layout.V.kilo(AbstractC0538d.sierra(pVar, 1), 18);
            boolean golf2 = c0585q.golf(str5);
            Object jade = c0585q.jade();
            if (!golf2 && jade != asVar) {
                jVar = jVar2;
            } else {
                jVar = jVar2;
                jade = new ae(str5, 0);
                c0585q.f(jade);
            }
            T.j jVar3 = jVar;
            W3.alpha(charlie4, str5, A0.o.bravo(kilo2, false, (Function1) jade), null, c2394m, 0.0f, null, c0585q, 24576, 104);
            String bravo4 = AbstractC3086y3.bravo(c0585q, R.string.status_header_gps_weak);
            long charlie5 = AbstractC2636d7.charlie(14);
            H0.n nVar = Db.g.alpha;
            H0.v vVar = H0.v.f1409c;
            long j7 = Db.c.lime;
            G2.bravo(bravo4, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 2, 0, null, new D0.an(j7, charlie5, vVar, null, nVar, 0L, 3, 0L, 0, 16744408), c0585q, 0, 3072, 57342);
            c0585q.quebec(true);
            if ((i19 & 112) == i17) {
                z10 = true;
            } else {
                z10 = false;
            }
            Object jade2 = c0585q.jade();
            if (z10 || jade2 == asVar) {
                jade2 = new Bb.a(function0, 8);
                c0585q.f(jade2);
            }
            T.s echo2 = androidx.compose.foundation.a.echo(15, pVar, null, (Function0) jade2, false);
            boolean golf3 = c0585q.golf(bravo3);
            Object jade3 = c0585q.jade();
            if (golf3 || jade3 == asVar) {
                jade3 = new ae(bravo3, 1);
                c0585q.f(jade3);
            }
            T.s bravo5 = A0.o.bravo(echo2, false, (Function1) jade3);
            androidx.compose.foundation.layout.S alpha4 = androidx.compose.foundation.layout.Q.alpha(AbstractC0542h.golf(Db.f.bravo), jVar3, c0585q, 48);
            long j10 = c0585q.magenta;
            int i21 = (int) (j10 ^ (j10 >>> i17));
            androidx.compose.runtime.I mike3 = c0585q.mike();
            T.s charlie6 = T.a.charlie(bravo5, c0585q);
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j);
            } else {
                c0585q.i();
            }
            C0564b.blue(c2549i, c0585q, alpha4);
            C0564b.blue(c2549i2, c0585q, mike3);
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i21))) {
                ao.ad.blue(i21, c0585q, i21, c2549i3);
            }
            C0564b.blue(c2549i4, c0585q, charlie6);
            G2.bravo(AbstractC3086y3.bravo(c0585q, R.string.status_header_how_to_fix), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 1, 0, null, new D0.an(j7, AbstractC2636d7.charlie(14), H0.v.f1407a, null, nVar, 0L, 0, 0L, 0, 16777176), c0585q, 0, 3072, 57342);
            c0585q = c0585q;
            AbstractC0141o0.bravo(B7.b.bravo(), null, androidx.compose.foundation.layout.V.kilo(pVar, 20), C0366t.bravo, c0585q, 3504, 0);
            c0585q.quebec(true);
            c0585q.quebec(true);
            str3 = bravo3;
            sVar3 = sVar4;
            str4 = str5;
        } else {
            c0585q.ochre();
            str3 = str2;
            sVar3 = sVar2;
            str4 = str;
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new ah(sVar3, function0, str4, str3, i4, i5, 0);
        }
    }

    public static final void charlie(T.s sVar, String str, InterfaceC0581m interfaceC0581m, int i4, int i5) {
        T.s sVar2;
        int i10;
        int i11;
        boolean z2;
        T.s sVar3;
        String str2;
        String bravo2;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-1193478589);
        int i12 = i5 & 1;
        if (i12 != 0) {
            i10 = i4 | 6;
            sVar2 = sVar;
        } else if ((i4 & 6) == 0) {
            sVar2 = sVar;
            if (c0585q.golf(sVar2)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i10 = i4 | i11;
        } else {
            sVar2 = sVar;
            i10 = i4;
        }
        int i13 = i10 | 16;
        if ((i13 & 19) != 18) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i13 & 1, z2)) {
            c0585q.orange();
            int i14 = i4 & 1;
            T.p pVar = T.p.alpha;
            if (i14 != 0 && !c0585q.beige()) {
                c0585q.ochre();
                bravo2 = str;
            } else {
                if (i12 != 0) {
                    sVar2 = pVar;
                }
                bravo2 = AbstractC3086y3.bravo(c0585q, R.string.status_header_icon_internet_lost);
            }
            T.s sVar4 = sVar2;
            c0585q.romeo();
            float f5 = 10;
            float f10 = 12;
            T.s victor = AbstractC0538d.victor(androidx.compose.foundation.a.bravo(androidx.compose.foundation.layout.V.golf(androidx.compose.foundation.layout.V.charlie(sVar4, 1.0f), 48, 0.0f, 2), AbstractC3071v3.alpha(c0585q, R.color.coolgray_500), a0.ao.alpha), f5, f10, f5, f10);
            androidx.compose.foundation.layout.S alpha2 = androidx.compose.foundation.layout.Q.alpha(AbstractC0542h.echo, T.d.f2061d, c0585q, 54);
            long j5 = c0585q.magenta;
            int i15 = (int) (j5 ^ (j5 >>> 32));
            androidx.compose.runtime.I mike = c0585q.mike();
            T.s charlie2 = T.a.charlie(victor, c0585q);
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
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i15))) {
                ao.ad.blue(i15, c0585q, i15, c2549i);
            }
            C0564b.blue(C2551k.delta, c0585q, charlie2);
            AbstractC1680b charlie3 = AbstractC3076w3.charlie(R.drawable.status_icon, c0585q, 6);
            C2394m c2394m = C2391j.echo;
            T.s kilo2 = androidx.compose.foundation.layout.V.kilo(AbstractC0538d.sierra(pVar, 4), 16);
            boolean golf2 = c0585q.golf(bravo2);
            Object jade = c0585q.jade();
            if (golf2 || jade == C0580l.alpha) {
                jade = new ae(bravo2, 4);
                c0585q.f(jade);
            }
            T.s bravo3 = A0.o.bravo(kilo2, false, (Function1) jade);
            String str3 = bravo2;
            W3.alpha(charlie3, str3, bravo3, null, c2394m, 0.0f, null, c0585q, 24576, 104);
            String bravo4 = AbstractC3086y3.bravo(c0585q, R.string.status_header_internet_lost);
            D0.an anVar = new D0.an(0L, AbstractC2636d7.charlie(14), H0.v.f1409c, null, Db.g.alpha, 0L, 0, 0L, 0, 16777177);
            long j6 = C0366t.echo;
            if (1.0f <= 0.0d) {
                AbstractC1797a.alpha("invalid weight; must be greater than zero");
            }
            G2.bravo(bravo4, new LayoutWeightElement(1.0f, false), j6, 0L, null, null, 0L, null, 0L, 0, false, 2, 0, null, anVar, c0585q, 384, 3072, 57336);
            c0585q = c0585q;
            c0585q.quebec(true);
            str2 = str3;
            sVar3 = sVar4;
        } else {
            c0585q.ochre();
            sVar3 = sVar2;
            str2 = str;
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new af(i4, sVar3, str2, i5, 0);
        }
    }

    public static final void delta(String str, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        boolean z2;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-1850882512);
        if (c0585q.golf(str)) {
            i5 = 4;
        } else {
            i5 = 2;
        }
        int i10 = i4 | i5;
        if ((i10 & 3) != 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i10 & 1, z2)) {
            T.p pVar = T.p.alpha;
            float f5 = 8;
            float f10 = 12;
            T.s sierra = AbstractC0538d.sierra(androidx.compose.foundation.a.bravo(R3.charlie(androidx.compose.foundation.layout.V.charlie(pVar, 1.0f), 1, AbstractC0225h.foxtrot, AbstractC2094g.bravo(f5)), AbstractC0225h.echo, AbstractC2094g.bravo(f5)), f10);
            androidx.compose.foundation.layout.S alpha2 = androidx.compose.foundation.layout.Q.alpha(AbstractC0542h.golf(f10), T.d.f2060c, c0585q, 54);
            long j5 = c0585q.magenta;
            int i11 = (int) (j5 ^ (j5 >>> 32));
            androidx.compose.runtime.I mike = c0585q.mike();
            T.s charlie2 = T.a.charlie(sierra, c0585q);
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
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i11))) {
                ao.ad.blue(i11, c0585q, i11, c2549i);
            }
            C0564b.blue(C2551k.delta, c0585q, charlie2);
            AbstractC1680b charlie3 = AbstractC3076w3.charlie(R.drawable.information_line, c0585q, 6);
            long j6 = AbstractC0225h.golf;
            AbstractC0141o0.alpha(charlie3, null, AbstractC0538d.whiskey(androidx.compose.foundation.layout.V.kilo(pVar, 16), 0.0f, 2, 0.0f, 0.0f, 13), j6, c0585q, 3504, 0);
            G2.bravo(str, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, new D0.an(j6, AbstractC2636d7.charlie(13), new H0.v(HttpConstants.HTTP_BAD_REQUEST), null, Db.g.alpha, 0L, 0, AbstractC2636d7.charlie(20), 0, 16646104), c0585q, i10 & 14, 0, 65534);
            c0585q = c0585q;
            c0585q.quebec(true);
        } else {
            c0585q.ochre();
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new Ac.i(str, i4, 6);
        }
    }

    public static final void echo(String str, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        boolean z2;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-189181331);
        if (c0585q.golf(str)) {
            i5 = 4;
        } else {
            i5 = 2;
        }
        int i10 = i4 | i5;
        if ((i10 & 3) != 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i10 & 1, z2)) {
            T.p pVar = T.p.alpha;
            float f5 = 8;
            float f10 = 12;
            T.s sierra = AbstractC0538d.sierra(androidx.compose.foundation.a.bravo(R3.charlie(androidx.compose.foundation.layout.V.charlie(pVar, 1.0f), 1, AbstractC0225h.india, AbstractC2094g.bravo(f5)), AbstractC0225h.hotel, AbstractC2094g.bravo(f5)), f10);
            androidx.compose.foundation.layout.S alpha2 = androidx.compose.foundation.layout.Q.alpha(AbstractC0542h.golf(f10), T.d.f2060c, c0585q, 54);
            long j5 = c0585q.magenta;
            int i11 = (int) (j5 ^ (j5 >>> 32));
            androidx.compose.runtime.I mike = c0585q.mike();
            T.s charlie2 = T.a.charlie(sierra, c0585q);
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
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i11))) {
                ao.ad.blue(i11, c0585q, i11, c2549i);
            }
            C0564b.blue(C2551k.delta, c0585q, charlie2);
            AbstractC1680b charlie3 = AbstractC3076w3.charlie(R.drawable.information_line, c0585q, 6);
            long j6 = AbstractC0225h.juliet;
            AbstractC0141o0.alpha(charlie3, null, androidx.compose.foundation.layout.V.kilo(pVar, 16), j6, c0585q, 3504, 0);
            G2.bravo(str, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, new D0.an(j6, AbstractC2636d7.charlie(13), new H0.v(HttpConstants.HTTP_BAD_REQUEST), null, Db.g.alpha, 0L, 0, AbstractC2636d7.charlie(18), 0, 16646104), c0585q, i10 & 14, 0, 65534);
            c0585q = c0585q;
            c0585q.quebec(true);
        } else {
            c0585q.ochre();
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new Ac.i(str, i4, 7);
        }
    }

    public static final void foxtrot(final String phoneNumber, final int i4, final String pin, final Function1 onPinChange, final Function1 onVerify, final String str, final String str2, final String str3, final boolean z2, final String str4, T.p pVar, InterfaceC0581m interfaceC0581m, final int i5) {
        final T.p pVar2;
        H0.n nVar;
        boolean z10;
        Intrinsics.echo(phoneNumber, "phoneNumber");
        Intrinsics.echo(pin, "pin");
        Intrinsics.echo(onPinChange, "onPinChange");
        Intrinsics.echo(onVerify, "onVerify");
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(736338093);
        int i10 = i5 | (c0585q.golf(phoneNumber) ? 4 : 2) | (c0585q.echo(i4) ? 32 : 16) | (c0585q.golf(pin) ? Barcode.FORMAT_QR_CODE : 128) | (c0585q.india(onPinChange) ? 2048 : Barcode.FORMAT_UPC_E) | (c0585q.india(onVerify) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192) | (c0585q.golf(str) ? 131072 : 65536) | (c0585q.golf(str2) ? 1048576 : 524288) | (c0585q.golf(str3) ? 8388608 : 4194304) | (c0585q.hotel(z2) ? 67108864 : 33554432) | (c0585q.golf(str4) ? 536870912 : 268435456);
        if (c0585q.magenta(i10 & 1, (i10 & 306783379) != 306783378)) {
            T.p pVar3 = T.p.alpha;
            Object jade = c0585q.jade();
            androidx.compose.runtime.as asVar = C0580l.alpha;
            if (jade == asVar) {
                jade = new Y.s();
                c0585q.f(jade);
            }
            Y.s sVar = (Y.s) jade;
            InterfaceC2937r0 interfaceC2937r0 = (InterfaceC2937r0) c0585q.kilo(AbstractC2901T.papa);
            int i11 = i10 & 896;
            boolean z11 = (i11 == 256) | ((i10 & 57344) == 16384);
            Object jade2 = c0585q.jade();
            if (z11 || jade2 == asVar) {
                jade2 = new C0239w(pin, onVerify, null);
                c0585q.f(jade2);
            }
            C0564b.foxtrot((Xd.l) jade2, c0585q, pin);
            boolean golf2 = (i11 == 256) | c0585q.golf(interfaceC2937r0);
            Object jade3 = c0585q.jade();
            if (golf2 || jade3 == asVar) {
                jade3 = new C0240x(pin, sVar, interfaceC2937r0, null);
                c0585q.f(jade3);
            }
            C0564b.foxtrot((Xd.l) jade3, c0585q, pin);
            float f5 = 16;
            float f10 = 24;
            T.s victor = AbstractC0538d.victor(androidx.compose.foundation.layout.V.charlie(pVar3, 1.0f), f5, f5, f5, f10);
            C2932p c2932p = AbstractC2911e0.alpha;
            T.s alpha2 = T.a.alpha(T.a.alpha(victor, c2932p, new d0(0)), c2932p, new d0(1));
            C0540f golf3 = AbstractC0542h.golf(f5);
            T.i iVar = T.d.f2063g;
            C0554u alpha3 = AbstractC0553t.alpha(golf3, iVar, c0585q, 54);
            long j5 = c0585q.magenta;
            int i12 = (int) (j5 ^ (j5 >>> 32));
            androidx.compose.runtime.I mike = c0585q.mike();
            T.s charlie2 = T.a.charlie(alpha2, c0585q);
            InterfaceC2552l.maroon.getClass();
            C2550j c2550j = C2551k.bravo;
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j);
            } else {
                c0585q.i();
            }
            C2549i c2549i = C2551k.foxtrot;
            C0564b.blue(c2549i, c0585q, alpha3);
            C2549i c2549i2 = C2551k.echo;
            C0564b.blue(c2549i2, c0585q, mike);
            C2549i c2549i3 = C2551k.golf;
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i12))) {
                ao.ad.blue(i12, c0585q, i12, c2549i3);
            }
            C2549i c2549i4 = C2551k.delta;
            C0564b.blue(c2549i4, c0585q, charlie2);
            String str5 = str == null ? "" : str;
            long charlie3 = AbstractC2636d7.charlie(22);
            H0.n nVar2 = Db.g.alpha;
            H0.v vVar = new H0.v(700);
            long j6 = AbstractC0225h.bravo;
            G2.bravo(str5, androidx.compose.foundation.layout.V.charlie(pVar3, 1.0f), 0L, 0L, null, null, 0L, new O0.k(3), 0L, 0, false, 0, 0, null, new D0.an(j6, charlie3, vVar, null, nVar2, 0L, 0, 0L, 0, 16777176), c0585q, 48, 0, 65020);
            T.s charlie4 = androidx.compose.foundation.layout.V.charlie(pVar3, 1.0f);
            float f11 = 4;
            C0554u alpha4 = AbstractC0553t.alpha(AbstractC0542h.golf(f11), iVar, c0585q, 54);
            long j7 = c0585q.magenta;
            int i13 = (int) (j7 ^ (j7 >>> 32));
            androidx.compose.runtime.I mike2 = c0585q.mike();
            T.s charlie5 = T.a.charlie(charlie4, c0585q);
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j);
            } else {
                c0585q.i();
            }
            C0564b.blue(c2549i, c0585q, alpha4);
            C0564b.blue(c2549i2, c0585q, mike2);
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i13))) {
                ao.ad.blue(i13, c0585q, i13, c2549i3);
            }
            C0564b.blue(c2549i4, c0585q, charlie5);
            G2.bravo(str2 == null ? "" : str2, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, new D0.an(j6, AbstractC2636d7.charlie(16), new H0.v(700), null, nVar2, 0L, 0, 0L, 0, 16777176), c0585q, 0, 0, 65534);
            String oscar = kotlin.text.r.oscar(str3 == null ? "" : str3, Constants.EMBOLDEN_PLACEHOLDER, phoneNumber);
            long charlie6 = AbstractC2636d7.charlie(14);
            H0.v vVar2 = new H0.v(HttpConstants.HTTP_BAD_REQUEST);
            long j10 = AbstractC0225h.mike;
            G2.bravo(oscar, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, new D0.an(j10, charlie6, vVar2, null, nVar2, 0L, 0, 0L, 0, 16777176), c0585q, 0, 0, 65534);
            if (str4 != null && !StringsKt.gray(str4)) {
                c0585q.purple(1129049226);
                nVar = nVar2;
                G2.bravo(str4, androidx.compose.foundation.layout.V.charlie(pVar3, 1.0f), 0L, 0L, null, null, 0L, new O0.k(3), 0L, 0, false, 0, 0, null, new D0.an(AbstractC0225h.juliet, AbstractC2636d7.charlie(13), null, null, nVar2, 0L, 0, 0L, 0, 16777180), c0585q, (14 & (i10 >> 27)) | 48, 0, 65020);
                z10 = false;
            } else {
                nVar = nVar2;
                z10 = false;
                c0585q.purple(1116025537);
            }
            c0585q.quebec(z10);
            c0585q.quebec(true);
            AbstractC0538d.echo(androidx.compose.foundation.layout.V.echo(pVar3, f11), c0585q);
            T.s alpha5 = androidx.compose.ui.focus.a.alpha(androidx.compose.foundation.layout.V.charlie(pVar3, 1.0f), sVar);
            int i14 = i10 >> 3;
            A7.echo(6, pin, onPinChange, alpha5, !z2, c0585q, (i14 & 112) | 6 | (i14 & 896), 0);
            G2.bravo(AbstractC3086y3.alpha(R.string.stc_otp_tries_left, new Object[]{Integer.valueOf(i4)}, c0585q), androidx.compose.foundation.layout.V.charlie(pVar3, 1.0f), 0L, 0L, null, null, 0L, new O0.k(3), 0L, 0, false, 0, 0, null, new D0.an(i4 <= 1 ? AbstractC0225h.juliet : j10, AbstractC2636d7.charlie(13), null, null, nVar, 0L, 0, 0L, 0, 16777180), c0585q, 48, 0, 65020);
            if (z2) {
                c0585q.purple(-473036250);
                T.s charlie7 = androidx.compose.foundation.layout.V.charlie(pVar3, 1.0f);
                q0.ap delta2 = AbstractC0547m.delta(T.d.teal, false);
                long j11 = c0585q.magenta;
                int i15 = (int) (j11 ^ (j11 >>> 32));
                androidx.compose.runtime.I mike3 = c0585q.mike();
                T.s charlie8 = T.a.charlie(charlie7, c0585q);
                c0585q.white();
                if (c0585q.lime) {
                    c0585q.lima(c2550j);
                } else {
                    c0585q.i();
                }
                C0564b.blue(c2549i, c0585q, delta2);
                C0564b.blue(c2549i2, c0585q, mike3);
                if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i15))) {
                    ao.ad.blue(i15, c0585q, i15, c2549i3);
                }
                C0564b.blue(c2549i4, c0585q, charlie8);
                G1.bravo(androidx.compose.foundation.layout.V.kilo(pVar3, f10), AbstractC0225h.charlie, 2, 0L, 0, c0585q, 438, 24);
                c0585q.quebec(true);
            } else {
                c0585q.purple(-487372789);
            }
            c0585q.quebec(false);
            c0585q.quebec(true);
            pVar2 = pVar3;
        } else {
            c0585q.ochre();
            pVar2 = pVar;
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new Xd.l(phoneNumber, i4, pin, onPinChange, onVerify, str, str2, str3, z2, str4, pVar2, i5) { // from class: Lb.v

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ String f1818a;
                public final /* synthetic */ String alpha;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ boolean f1819b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ String f1820c;

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ T.p f1821d;
                public final /* synthetic */ int purple;
                public final /* synthetic */ String red;
                public final /* synthetic */ Function1 silver;
                public final /* synthetic */ Function1 teal;
                public final /* synthetic */ String white;
                public final /* synthetic */ String yellow;

                @Override // Xd.l
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int cyan = C0564b.cyan(1);
                    String str6 = this.f1820c;
                    T.p pVar4 = this.f1821d;
                    AbstractC0220c.foxtrot(this.alpha, this.purple, this.red, this.silver, this.teal, this.white, this.yellow, this.f1818a, this.f1819b, str6, pVar4, (InterfaceC0581m) obj, cyan);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v9, types: [int] */
    public static final void golf(final AttributeGroup group, final Map fieldValues, final Map fieldErrors, final Xd.l onValueChange, final Function0 onSubmit, final Function0 function0, final boolean z2, final String str, T.p pVar, InterfaceC0581m interfaceC0581m, final int i4) {
        int i5;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        boolean z10;
        final T.p pVar2;
        boolean z11;
        int i16;
        boolean z12;
        C0585q c0585q;
        boolean z13;
        P.d echo2;
        int i17;
        boolean z14;
        C0585q c0585q2;
        boolean z15;
        boolean z16;
        T.p pVar3;
        float f5;
        C0585q c0585q3;
        ?? r72;
        boolean z17;
        String str2;
        String str3;
        int i18;
        Intrinsics.echo(group, "group");
        Intrinsics.echo(fieldValues, "fieldValues");
        Intrinsics.echo(fieldErrors, "fieldErrors");
        Intrinsics.echo(onValueChange, "onValueChange");
        Intrinsics.echo(onSubmit, "onSubmit");
        C0585q c0585q4 = (C0585q) interfaceC0581m;
        c0585q4.silver(-2023884694);
        if (c0585q4.india(group)) {
            i5 = 4;
        } else {
            i5 = 2;
        }
        int i19 = i4 | i5;
        if (c0585q4.india(fieldValues)) {
            i10 = 32;
        } else {
            i10 = 16;
        }
        int i20 = i19 | i10;
        if (c0585q4.india(fieldErrors)) {
            i11 = Barcode.FORMAT_QR_CODE;
        } else {
            i11 = 128;
        }
        int i21 = i20 | i11;
        if (c0585q4.india(onValueChange)) {
            i12 = 2048;
        } else {
            i12 = Barcode.FORMAT_UPC_E;
        }
        int i22 = i21 | i12;
        if (c0585q4.india(onSubmit)) {
            i13 = Http2.INITIAL_MAX_FRAME_SIZE;
        } else {
            i13 = 8192;
        }
        int i23 = i22 | i13;
        if ((i4 & 196608) == 0) {
            if (c0585q4.india(function0)) {
                i18 = 131072;
            } else {
                i18 = 65536;
            }
            i23 |= i18;
        }
        if (c0585q4.hotel(z2)) {
            i14 = 1048576;
        } else {
            i14 = 524288;
        }
        int i24 = i23 | i14;
        if (c0585q4.golf(str)) {
            i15 = 8388608;
        } else {
            i15 = 4194304;
        }
        int i25 = i24 | i15 | 100663296;
        if ((38347923 & i25) != 38347922) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (c0585q4.magenta(i25 & 1, z10)) {
            T.p pVar4 = T.p.alpha;
            float f10 = 16;
            T.s victor = AbstractC0538d.victor(androidx.compose.foundation.layout.V.charlie(pVar4, 1.0f), f10, f10, f10, f10);
            C2932p c2932p = AbstractC2911e0.alpha;
            T.s alpha2 = T.a.alpha(T.a.alpha(victor, c2932p, new d0(0)), c2932p, new d0(1));
            C0540f golf2 = AbstractC0542h.golf(f10);
            T.i iVar = T.d.f2062f;
            C0554u alpha3 = AbstractC0553t.alpha(golf2, iVar, c0585q4, 54);
            int i26 = i25;
            long j5 = c0585q4.magenta;
            int i27 = (int) (j5 ^ (j5 >>> 32));
            androidx.compose.runtime.I mike = c0585q4.mike();
            T.s charlie2 = T.a.charlie(alpha2, c0585q4);
            InterfaceC2552l.maroon.getClass();
            C2550j c2550j = C2551k.bravo;
            c0585q4.white();
            if (c0585q4.lime) {
                c0585q4.lima(c2550j);
            } else {
                c0585q4.i();
            }
            C2549i c2549i = C2551k.foxtrot;
            C0564b.blue(c2549i, c0585q4, alpha3);
            C2549i c2549i2 = C2551k.echo;
            C0564b.blue(c2549i2, c0585q4, mike);
            C2549i c2549i3 = C2551k.golf;
            if (c0585q4.lime || !Intrinsics.areEqual(c0585q4.jade(), Integer.valueOf(i27))) {
                ao.ad.blue(i27, c0585q4, i27, c2549i3);
            }
            C2549i c2549i4 = C2551k.delta;
            C0564b.blue(c2549i4, c0585q4, charlie2);
            String title = group.getTitle();
            if (title == null && (title = group.getActionText()) == null) {
                title = "";
            }
            long charlie3 = AbstractC2636d7.charlie(18);
            H0.n nVar = Db.g.alpha;
            H0.v vVar = new H0.v(700);
            long j6 = AbstractC0225h.bravo;
            G2.bravo(title, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, new D0.an(j6, charlie3, vVar, null, nVar, 0L, 0, 0L, 0, 16777176), c0585q4, 0, 0, 65534);
            C0585q c0585q5 = c0585q4;
            String actionDescription = group.getActionDescription();
            if (actionDescription == null || StringsKt.gray(actionDescription)) {
                z11 = false;
                c0585q5.purple(-2036767730);
            } else {
                c0585q5.purple(-2032935851);
                String actionDescription2 = group.getActionDescription();
                if (actionDescription2 == null) {
                    actionDescription2 = "";
                }
                z11 = false;
                delta(actionDescription2, c0585q5, 0);
            }
            c0585q5.quebec(z11);
            C0554u alpha4 = AbstractC0553t.alpha(AbstractC0542h.golf(f10), iVar, c0585q5, 54);
            long j7 = c0585q5.magenta;
            int i28 = (int) (j7 ^ (j7 >>> 32));
            androidx.compose.runtime.I mike2 = c0585q5.mike();
            T.s charlie4 = T.a.charlie(pVar4, c0585q5);
            c0585q5.white();
            if (c0585q5.lime) {
                c0585q5.lima(c2550j);
            } else {
                c0585q5.i();
            }
            C0564b.blue(c2549i, c0585q5, alpha4);
            C0564b.blue(c2549i2, c0585q5, mike2);
            if (c0585q5.lime || !Intrinsics.areEqual(c0585q5.jade(), Integer.valueOf(i28))) {
                ao.ad.blue(i28, c0585q5, i28, c2549i3);
            }
            C0564b.blue(c2549i4, c0585q5, charlie4);
            AbstractC0538d.echo(androidx.compose.foundation.layout.V.echo(pVar4, 6), c0585q5);
            String sectionLabel = group.getSectionLabel();
            if (sectionLabel == null || StringsKt.gray(sectionLabel)) {
                i16 = -2036767730;
                z12 = false;
                c0585q5.purple(880615556);
                c0585q = c0585q5;
            } else {
                c0585q5.purple(884782049);
                String sectionLabel2 = group.getSectionLabel();
                if (sectionLabel2 == null) {
                    str3 = "";
                } else {
                    str3 = sectionLabel2;
                }
                i16 = -2036767730;
                G2.bravo(str3, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, new D0.an(j6, AbstractC2636d7.charlie(16), new H0.v(700), null, nVar, 0L, 0, 0L, 0, 16777176), c0585q5, 0, 0, 65534);
                c0585q = c0585q5;
                z12 = false;
            }
            c0585q.quebec(z12);
            List<Attribute> attributes = group.getAttributes();
            if (attributes == null) {
                c0585q.purple(885275692);
                c0585q2 = c0585q;
            } else {
                c0585q.purple(885275693);
                C0585q c0585q6 = c0585q;
                for (final Attribute attribute : attributes) {
                    String str4 = (String) fieldValues.get(attribute.getKey());
                    if (str4 == null) {
                        str4 = "";
                    }
                    if (fieldErrors.get(attribute.getKey()) != null) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    String str5 = (String) fieldErrors.get(attribute.getKey());
                    if (str5 == null) {
                        c0585q6.purple(-1248115698);
                        c0585q6.quebec(false);
                        echo2 = null;
                    } else {
                        c0585q6.purple(-1248115697);
                        echo2 = P.e.echo(296029465, new Ac.i(str5, 5), c0585q6);
                        c0585q6.quebec(false);
                    }
                    if (Intrinsics.areEqual(attribute.getInputType(), "NUMBER")) {
                        i17 = 3;
                    } else {
                        i17 = 1;
                    }
                    n.aw awVar = new n.aw(i17, 0, 123);
                    T.s charlie5 = androidx.compose.foundation.layout.V.charlie(pVar4, 1.0f);
                    C2093f bravo2 = AbstractC2094g.bravo(4);
                    C0150q1 c0150q1 = C0150q1.alpha;
                    long j10 = AbstractC0225h.kilo;
                    long j11 = AbstractC0225h.juliet;
                    long j12 = AbstractC0225h.mike;
                    C0585q c0585q7 = c0585q6;
                    C0143o2 charlie6 = C0150q1.charlie(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, j10, j10, 0L, j11, j12, j12, 0L, 0L, 0L, 0L, c0585q7, 2122295295);
                    int i29 = i26;
                    if ((i29 & 7168) == 2048) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    boolean india2 = z14 | c0585q7.india(attribute);
                    Object jade = c0585q7.jade();
                    if (india2 || jade == C0580l.alpha) {
                        jade = new Cb.ad(14, onValueChange, attribute);
                        c0585q7.f(jade);
                    }
                    final int i30 = 0;
                    final int i31 = 1;
                    i26 = i29;
                    AbstractC0174x1.alpha(str4, (Function1) jade, charlie5, false, null, P.e.echo(-870617250, new Xd.l() { // from class: Lb.r
                        @Override // Xd.l
                        public final Object invoke(Object obj, Object obj2) {
                            boolean z18;
                            boolean z19;
                            switch (i30) {
                                case 0:
                                    InterfaceC0581m interfaceC0581m2 = (InterfaceC0581m) obj;
                                    int intValue = ((Integer) obj2).intValue();
                                    if ((intValue & 3) != 2) {
                                        z18 = true;
                                    } else {
                                        z18 = false;
                                    }
                                    C0585q c0585q8 = (C0585q) interfaceC0581m2;
                                    if (c0585q8.magenta(intValue & 1, z18)) {
                                        String displayName = attribute.getDisplayName();
                                        if (displayName == null) {
                                            displayName = "";
                                        }
                                        G2.bravo(displayName, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, new D0.an(AbstractC0225h.mike, AbstractC2636d7.charlie(13), null, null, Db.g.alpha, 0L, 0, 0L, 0, 16777180), c0585q8, 0, 0, 65534);
                                    } else {
                                        c0585q8.ochre();
                                    }
                                    return Unit.INSTANCE;
                                default:
                                    InterfaceC0581m interfaceC0581m3 = (InterfaceC0581m) obj;
                                    int intValue2 = ((Integer) obj2).intValue();
                                    if ((intValue2 & 3) != 2) {
                                        z19 = true;
                                    } else {
                                        z19 = false;
                                    }
                                    C0585q c0585q9 = (C0585q) interfaceC0581m3;
                                    if (c0585q9.magenta(intValue2 & 1, z19)) {
                                        String hint = attribute.getHint();
                                        if (hint == null) {
                                            hint = "";
                                        }
                                        G2.bravo(hint, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, new D0.an(AbstractC0225h.lima, AbstractC2636d7.charlie(13), null, null, Db.g.alpha, 0L, 0, 0L, 0, 16777180), c0585q9, 0, 0, 65534);
                                    } else {
                                        c0585q9.ochre();
                                    }
                                    return Unit.INSTANCE;
                            }
                        }
                    }, c0585q7), P.e.echo(-1348580449, new Xd.l() { // from class: Lb.r
                        @Override // Xd.l
                        public final Object invoke(Object obj, Object obj2) {
                            boolean z18;
                            boolean z19;
                            switch (i31) {
                                case 0:
                                    InterfaceC0581m interfaceC0581m2 = (InterfaceC0581m) obj;
                                    int intValue = ((Integer) obj2).intValue();
                                    if ((intValue & 3) != 2) {
                                        z18 = true;
                                    } else {
                                        z18 = false;
                                    }
                                    C0585q c0585q8 = (C0585q) interfaceC0581m2;
                                    if (c0585q8.magenta(intValue & 1, z18)) {
                                        String displayName = attribute.getDisplayName();
                                        if (displayName == null) {
                                            displayName = "";
                                        }
                                        G2.bravo(displayName, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, new D0.an(AbstractC0225h.mike, AbstractC2636d7.charlie(13), null, null, Db.g.alpha, 0L, 0, 0L, 0, 16777180), c0585q8, 0, 0, 65534);
                                    } else {
                                        c0585q8.ochre();
                                    }
                                    return Unit.INSTANCE;
                                default:
                                    InterfaceC0581m interfaceC0581m3 = (InterfaceC0581m) obj;
                                    int intValue2 = ((Integer) obj2).intValue();
                                    if ((intValue2 & 3) != 2) {
                                        z19 = true;
                                    } else {
                                        z19 = false;
                                    }
                                    C0585q c0585q9 = (C0585q) interfaceC0581m3;
                                    if (c0585q9.magenta(intValue2 & 1, z19)) {
                                        String hint = attribute.getHint();
                                        if (hint == null) {
                                            hint = "";
                                        }
                                        G2.bravo(hint, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, new D0.an(AbstractC0225h.lima, AbstractC2636d7.charlie(13), null, null, Db.g.alpha, 0L, 0, 0L, 0, 16777180), c0585q9, 0, 0, 65534);
                                    } else {
                                        c0585q9.ochre();
                                    }
                                    return Unit.INSTANCE;
                            }
                        }
                    }, c0585q7), bravo, null, echo2, z13, null, awVar, null, true, 0, 0, bravo2, charlie6, c0585q7, 114819456, 12582912, 1920568);
                    c0585q6 = c0585q7;
                }
                z12 = false;
                c0585q2 = c0585q6;
            }
            c0585q2.quebec(z12);
            c0585q2.quebec(true);
            String warningText = group.getWarningText();
            if (warningText == null || StringsKt.gray(warningText)) {
                z15 = false;
                c0585q2.purple(i16);
            } else {
                c0585q2.purple(-2029255903);
                String warningText2 = group.getWarningText();
                if (warningText2 == null) {
                    str2 = "";
                } else {
                    str2 = warningText2;
                }
                z15 = false;
                echo(str2, c0585q2, 0);
            }
            c0585q2.quebec(z15);
            if (str == null || StringsKt.gray(str)) {
                boolean z18 = z15;
                z16 = true;
                pVar3 = pVar4;
                f5 = 1.0f;
                c0585q2.purple(i16);
                c0585q2.quebec(z18);
                r72 = z18;
                c0585q3 = c0585q2;
            } else {
                c0585q2.purple(-2029130570);
                boolean z19 = z15;
                pVar3 = pVar4;
                C0585q c0585q8 = c0585q2;
                z16 = true;
                f5 = 1.0f;
                G2.bravo(str, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, new D0.an(AbstractC0225h.juliet, AbstractC2636d7.charlie(13), null, null, Db.g.alpha, 0L, 0, 0L, 0, 16777180), c0585q8, (i26 >> 21) & 14, 0, 65534);
                C0585q c0585q9 = c0585q8;
                c0585q9.quebec(z19);
                r72 = z19;
                c0585q3 = c0585q9;
            }
            T.s charlie7 = androidx.compose.foundation.layout.V.charlie(pVar3, f5);
            androidx.compose.foundation.layout.S alpha5 = androidx.compose.foundation.layout.Q.alpha(AbstractC0542h.golf(8), T.d.f2060c, c0585q3, 6);
            long j13 = c0585q3.magenta;
            int i32 = (int) (j13 ^ (j13 >>> 32));
            androidx.compose.runtime.I mike3 = c0585q3.mike();
            T.s charlie8 = T.a.charlie(charlie7, c0585q3);
            InterfaceC2552l.maroon.getClass();
            C2550j c2550j2 = C2551k.bravo;
            c0585q3.white();
            if (c0585q3.lime) {
                c0585q3.lima(c2550j2);
            } else {
                c0585q3.i();
            }
            C0564b.blue(C2551k.foxtrot, c0585q3, alpha5);
            C0564b.blue(C2551k.echo, c0585q3, mike3);
            C2549i c2549i5 = C2551k.golf;
            if (c0585q3.lime || !Intrinsics.areEqual(c0585q3.jade(), Integer.valueOf(i32))) {
                ao.ad.blue(i32, c0585q3, i32, c2549i5);
            }
            C0564b.blue(C2551k.delta, c0585q3, charlie8);
            boolean z20 = !z2;
            if (f5 <= 0.0d) {
                AbstractC1797a.alpha("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(f5, z16);
            float f11 = 55;
            T.s echo3 = androidx.compose.foundation.layout.V.echo(layoutWeightElement, f11);
            float f12 = 12;
            boolean z21 = z16;
            C2093f bravo3 = AbstractC2094g.bravo(f12);
            androidx.compose.foundation.layout.M m4 = F.al.alpha;
            C0585q c0585q10 = c0585q3;
            c0585q4 = c0585q10;
            K1.bravo(onSubmit, echo3, z20, bravo3, F.al.alpha(AbstractC0225h.charlie, 0L, a0.ao.delta(4283585115L), 0L, c0585q10, 10), null, null, new androidx.compose.foundation.layout.M(f10, f10, f10, f10), P.e.echo(-192372768, new C0235s(r72, z2), c0585q4), c0585q4, ((i26 >> 12) & 14) | 817889280, 352);
            if (function0 != null) {
                c0585q4.purple(-1955088919);
                T.s echo4 = androidx.compose.foundation.layout.V.echo(androidx.compose.foundation.layout.V.oscar(pVar3, 136), f11);
                C2093f bravo4 = AbstractC2094g.bravo(f12);
                b.ab alpha6 = S3.alpha(z21 ? 1.0f : 0.0f, AbstractC0225h.delta);
                F.ak delta2 = F.al.delta(AbstractC0225h.alpha, AbstractC0225h.bravo, 0L, 0L, c0585q4, 12);
                c0585q4 = c0585q4;
                K1.hotel(function0, echo4, false, bravo4, delta2, null, alpha6, new androidx.compose.foundation.layout.M(f10, f10, f10, f10), charlie, c0585q4, ((i26 >> 15) & 14) | 819462192, 292);
                z17 = false;
            } else {
                z17 = false;
                c0585q4.purple(-1964458638);
            }
            c0585q4.quebec(z17);
            c0585q4.quebec(z21);
            c0585q4.quebec(z21);
            pVar2 = pVar3;
        } else {
            c0585q4.ochre();
            pVar2 = pVar;
        }
        androidx.compose.runtime.Q uniform = c0585q4.uniform();
        if (uniform != null) {
            uniform.delta = new Xd.l() { // from class: Lb.t
                @Override // Xd.l
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int cyan = C0564b.cyan(i4 | 1);
                    String str6 = str;
                    T.p pVar5 = pVar2;
                    AbstractC0220c.golf(AttributeGroup.this, fieldValues, fieldErrors, onValueChange, onSubmit, function0, z2, str6, pVar5, (InterfaceC0581m) obj, cyan);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void hotel(int i4, T.p pVar, InterfaceC0581m interfaceC0581m, String str, Function0 onOk) {
        int i5;
        int i10;
        boolean z2;
        T.p pVar2;
        String str2;
        Intrinsics.echo(onOk, "onOk");
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-1340748657);
        if (c0585q.india(onOk)) {
            i5 = 4;
        } else {
            i5 = 2;
        }
        int i11 = i5 | i4;
        if (c0585q.golf(str)) {
            i10 = 32;
        } else {
            i10 = 16;
        }
        int i12 = i11 | i10 | 384;
        if ((i12 & 147) != 146) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i12 & 1, z2)) {
            T.p pVar3 = T.p.alpha;
            T.s sierra = AbstractC0538d.sierra(androidx.compose.foundation.layout.V.charlie(pVar3, 1.0f), 24);
            float f5 = 16;
            C0554u alpha2 = AbstractC0553t.alpha(AbstractC0542h.golf(f5), T.d.f2063g, c0585q, 54);
            long j5 = c0585q.magenta;
            int i13 = (int) (j5 ^ (j5 >>> 32));
            androidx.compose.runtime.I mike = c0585q.mike();
            T.s charlie2 = T.a.charlie(sierra, c0585q);
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
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i13))) {
                ao.ad.blue(i13, c0585q, i13, c2549i);
            }
            C0564b.blue(C2551k.delta, c0585q, charlie2);
            AbstractC0141o0.alpha(AbstractC3076w3.charlie(R.drawable.done, c0585q, 6), null, androidx.compose.foundation.layout.V.kilo(pVar3, 56), a0.ao.delta(4279673674L), c0585q, 3504, 0);
            if (str == null) {
                str2 = Q0.c.oscar(c0585q, 1424076913, R.string.stc_success_message, c0585q, false);
            } else {
                c0585q.purple(1424076355);
                c0585q.quebec(false);
                str2 = str;
            }
            String str3 = str2;
            G2.bravo(str3, null, 0L, 0L, null, null, 0L, new O0.k(3), 0L, 0, false, 0, 0, null, new D0.an(AbstractC0225h.bravo, AbstractC2636d7.charlie(22), new H0.v(700), null, Db.g.alpha, 0L, 0, 0L, 0, 16777176), c0585q, 0, 0, 65022);
            T.s echo2 = androidx.compose.foundation.layout.V.echo(androidx.compose.foundation.layout.V.charlie(pVar3, 1.0f), 55);
            C2093f bravo2 = AbstractC2094g.bravo(12);
            androidx.compose.foundation.layout.M m4 = F.al.alpha;
            F.ak alpha3 = F.al.alpha(AbstractC0225h.charlie, 0L, 0L, 0L, c0585q, 14);
            c0585q = c0585q;
            K1.bravo(onOk, echo2, false, bravo2, alpha3, null, null, new androidx.compose.foundation.layout.M(f5, f5, f5, f5), delta, c0585q, (i12 & 14) | 817889328, 356);
            c0585q.quebec(true);
            pVar2 = pVar3;
        } else {
            c0585q.ochre();
            pVar2 = pVar;
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new C0237u(onOk, str, pVar2, i4);
        }
    }

    public static final void india(final UserInfo userInfo, final boolean z2, InterfaceC0581m interfaceC0581m, final int i4) {
        int i5;
        int i10;
        boolean z10;
        final UserInfo userInfo2;
        ActiveShiftSummary activeShiftSummary;
        boolean z11;
        int i11;
        int i12;
        String str;
        String str2;
        float f5;
        C3504g c3504g;
        UpcomingBookedShift upcomingBookedShift;
        String str3;
        boolean z12;
        T.p pVar;
        boolean z13;
        String str4;
        Captain captain;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(682385131);
        if (c0585q.india(userInfo)) {
            i5 = 4;
        } else {
            i5 = 2;
        }
        int i13 = i5 | i4;
        if (c0585q.hotel(z2)) {
            i10 = 32;
        } else {
            i10 = 16;
        }
        int i14 = i13 | i10;
        if ((i14 & 19) != 18) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (c0585q.magenta(i14 & 1, z10)) {
            Context context = (Context) c0585q.kilo(AndroidCompositionLocals_androidKt.bravo);
            if (userInfo != null) {
                activeShiftSummary = userInfo.getActiveShiftSummary();
            } else {
                activeShiftSummary = null;
            }
            if (userInfo != null && (captain = userInfo.getCaptain()) != null) {
                z11 = Intrinsics.areEqual(captain.getSuspended(), Boolean.TRUE);
            } else {
                z11 = false;
            }
            if (!z11 && z2) {
                T.p pVar2 = T.p.alpha;
                AbstractC0538d.echo(androidx.compose.foundation.layout.V.echo(pVar2, 24), c0585q);
                D0.an anVar = ((S2) c0585q.kilo(T2.alpha)).golf;
                long j5 = Db.c.maroon;
                String string = context.getString(R.string.orders_delivered);
                Intrinsics.delta(string, "getString(...)");
                String string2 = context.getString(R.string.earned_points);
                Intrinsics.delta(string2, "getString(...)");
                String string3 = context.getString(R.string.shift_ends);
                Intrinsics.delta(string3, "getString(...)");
                if (activeShiftSummary == null) {
                    str2 = "getString(...)";
                    c3504g = null;
                } else {
                    Integer ordersDelivered = activeShiftSummary.getOrdersDelivered();
                    if (ordersDelivered != null) {
                        i11 = ordersDelivered.intValue();
                    } else {
                        i11 = 0;
                    }
                    String valueOf = String.valueOf(i11);
                    Integer earnedPoints = activeShiftSummary.getEarnedPoints();
                    if (earnedPoints != null) {
                        i12 = earnedPoints.intValue();
                    } else {
                        i12 = 0;
                    }
                    String valueOf2 = String.valueOf(i12);
                    String shiftFinishAt = activeShiftSummary.getShiftFinishAt();
                    if (shiftFinishAt != null) {
                        str = AbstractC2670h5.delta(shiftFinishAt);
                    } else {
                        str = "-";
                    }
                    String str5 = str;
                    Double progressPercentage = activeShiftSummary.getProgressPercentage();
                    str2 = "getString(...)";
                    if (progressPercentage != null) {
                        f5 = (float) progressPercentage.doubleValue();
                    } else {
                        f5 = 0.0f;
                    }
                    c3504g = new C3504g(valueOf, string, valueOf2, string2, str5, string3, J4.charlie(f5, 0.0f, 1.0f));
                }
                if (userInfo != null) {
                    upcomingBookedShift = userInfo.getUpcomingBookedShift();
                } else {
                    upcomingBookedShift = null;
                }
                if (c3504g != null) {
                    c0585q.purple(856336602);
                    String string4 = context.getString(R.string.my_shifts);
                    Intrinsics.delta(string4, str2);
                    U3.alpha(string4, c3504g, AbstractC0538d.uniform(androidx.compose.foundation.layout.V.charlie(pVar2, 1.0f), 16, 0.0f, 2), null, C0366t.echo, 0L, anVar, j5, 0L, 0L, 0L, 0.0f, 0L, c0585q, 24960, 7976);
                    c0585q = c0585q;
                    c0585q.quebec(false);
                    pVar = pVar2;
                } else {
                    String str6 = str2;
                    if (upcomingBookedShift != null) {
                        str3 = upcomingBookedShift.getShiftStartAt();
                    } else {
                        str3 = null;
                    }
                    if (str3 != null && !StringsKt.gray(str3)) {
                        z12 = false;
                    } else {
                        z12 = true;
                    }
                    if (!z12) {
                        c0585q.purple(856829874);
                        if (upcomingBookedShift != null) {
                            str4 = upcomingBookedShift.getShiftStartAt();
                        } else {
                            str4 = null;
                        }
                        if (str4 == null) {
                            str4 = "";
                        }
                        String delta2 = AbstractC2670h5.delta(str4);
                        String upperCase = AbstractC2670h5.charlie(str4).toUpperCase(Locale.ROOT);
                        Intrinsics.delta(upperCase, "toUpperCase(...)");
                        String string5 = context.getString(R.string.my_shifts);
                        Intrinsics.delta(string5, str6);
                        pVar = pVar2;
                        U3.bravo(string5, AbstractC0538d.uniform(androidx.compose.foundation.layout.V.charlie(pVar, 1.0f), 16, 0.0f, 2), ((F.O) c0585q.kilo(F.Q.alpha)).azure, anVar, j5, 0.0f, P.e.echo(-632136206, new Bb.d(delta2, upperCase, 3), c0585q), c0585q, 1572912);
                        c0585q.quebec(false);
                    } else {
                        pVar = pVar2;
                        if (userInfo != null) {
                            z13 = Intrinsics.areEqual(userInfo.getShowBookShifts(), Boolean.TRUE);
                        } else {
                            z13 = false;
                        }
                        if (z13) {
                            c0585q.purple(857985399);
                            String string6 = context.getString(R.string.my_shifts);
                            Intrinsics.delta(string6, str6);
                            U3.bravo(string6, AbstractC0538d.uniform(androidx.compose.foundation.layout.V.charlie(pVar, 1.0f), 16, 0.0f, 2), ((F.O) c0585q.kilo(F.Q.alpha)).azure, anVar, j5, 0.0f, P.e.echo(-487726511, new Ac.k(11, context), c0585q), c0585q, 1572912);
                        } else {
                            c0585q.purple(853590839);
                        }
                        c0585q.quebec(false);
                    }
                }
                AbstractC0538d.echo(androidx.compose.foundation.layout.V.echo(pVar, 8), c0585q);
                userInfo2 = userInfo;
            } else {
                androidx.compose.runtime.Q uniform = c0585q.uniform();
                if (uniform != null) {
                    final int i15 = 0;
                    uniform.delta = new Xd.l(userInfo, z2, i4, i15) { // from class: Lb.y
                        public final /* synthetic */ int alpha;
                        public final /* synthetic */ UserInfo purple;
                        public final /* synthetic */ boolean red;

                        {
                            this.alpha = i15;
                        }

                        @Override // Xd.l
                        public final Object invoke(Object obj, Object obj2) {
                            int i16 = this.alpha;
                            InterfaceC0581m interfaceC0581m2 = (InterfaceC0581m) obj;
                            ((Integer) obj2).getClass();
                            switch (i16) {
                                case 0:
                                    AbstractC0220c.india(this.purple, this.red, interfaceC0581m2, C0564b.cyan(1));
                                    return Unit.INSTANCE;
                                default:
                                    AbstractC0220c.india(this.purple, this.red, interfaceC0581m2, C0564b.cyan(1));
                                    return Unit.INSTANCE;
                            }
                        }
                    };
                    return;
                }
                return;
            }
        } else {
            userInfo2 = userInfo;
            c0585q.ochre();
        }
        androidx.compose.runtime.Q uniform2 = c0585q.uniform();
        if (uniform2 != null) {
            final int i16 = 1;
            uniform2.delta = new Xd.l(userInfo2, z2, i4, i16) { // from class: Lb.y
                public final /* synthetic */ int alpha;
                public final /* synthetic */ UserInfo purple;
                public final /* synthetic */ boolean red;

                {
                    this.alpha = i16;
                }

                @Override // Xd.l
                public final Object invoke(Object obj, Object obj2) {
                    int i162 = this.alpha;
                    InterfaceC0581m interfaceC0581m2 = (InterfaceC0581m) obj;
                    ((Integer) obj2).getClass();
                    switch (i162) {
                        case 0:
                            AbstractC0220c.india(this.purple, this.red, interfaceC0581m2, C0564b.cyan(1));
                            return Unit.INSTANCE;
                        default:
                            AbstractC0220c.india(this.purple, this.red, interfaceC0581m2, C0564b.cyan(1));
                            return Unit.INSTANCE;
                    }
                }
            };
        }
    }

    public static final void juliet(T.p pVar, boolean z2, boolean z10, boolean z11, Function1 function1, InterfaceC0581m interfaceC0581m, int i4, int i5) {
        boolean z12;
        int i10;
        int i11;
        boolean z13;
        int i12;
        int i13;
        Function1 function12;
        int i14;
        int i15;
        boolean z14;
        T.p pVar2;
        boolean z15;
        boolean z16;
        Function1 function13;
        boolean z17;
        boolean z18;
        Function1 function14;
        int i16;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-81672504);
        int i17 = i4 | 6;
        if ((i4 & 48) == 0) {
            if (c0585q.hotel(z2)) {
                i16 = 32;
            } else {
                i16 = 16;
            }
            i17 |= i16;
        }
        int i18 = i5 & 4;
        if (i18 != 0) {
            i11 = i17 | 384;
            z12 = z10;
        } else {
            z12 = z10;
            if (c0585q.hotel(z12)) {
                i10 = Barcode.FORMAT_QR_CODE;
            } else {
                i10 = 128;
            }
            i11 = i17 | i10;
        }
        int i19 = i5 & 8;
        if (i19 != 0) {
            i13 = i11 | 3072;
            z13 = z11;
        } else {
            z13 = z11;
            if (c0585q.hotel(z13)) {
                i12 = 2048;
            } else {
                i12 = Barcode.FORMAT_UPC_E;
            }
            i13 = i11 | i12;
        }
        int i20 = i5 & 16;
        if (i20 != 0) {
            i15 = i13 | 24576;
            function12 = function1;
        } else {
            function12 = function1;
            if (c0585q.india(function12)) {
                i14 = Http2.INITIAL_MAX_FRAME_SIZE;
            } else {
                i14 = 8192;
            }
            i15 = i13 | i14;
        }
        if ((i15 & 9363) != 9362) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (c0585q.magenta(i15 & 1, z14)) {
            T.p pVar3 = T.p.alpha;
            if (i18 != 0) {
                z17 = true;
            } else {
                z17 = z12;
            }
            if (i19 != 0) {
                z18 = false;
            } else {
                z18 = z13;
            }
            if (i20 != 0) {
                Object jade = c0585q.jade();
                if (jade == C0580l.alpha) {
                    jade = new am(5);
                    c0585q.f(jade);
                }
                function14 = (Function1) jade;
            } else {
                function14 = function12;
            }
            kotlin.text.n.alpha(AbstractC3086y3.bravo(c0585q, R.string.status_header_offline_go_online), Db.c.whiskey, Db.c.xray, new D0.an(0L, AbstractC2636d7.charlie(14), H0.v.yellow, null, Db.g.alpha, 0L, 0, 0L, 0, 16777177), P.e.echo(1405672091, new av(0, function14, z2, z17, z18), c0585q), c0585q, 221184);
            z15 = z17;
            z16 = z18;
            pVar2 = pVar3;
            function13 = function14;
        } else {
            c0585q.ochre();
            pVar2 = pVar;
            z15 = z12;
            z16 = z13;
            function13 = function12;
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new aw(pVar2, z2, z15, z16, function13, i4, i5, 0);
        }
    }

    public static final void kilo(T.p pVar, boolean z2, boolean z10, boolean z11, Function1 function1, InterfaceC0581m interfaceC0581m, int i4, int i5) {
        boolean z12;
        int i10;
        int i11;
        boolean z13;
        int i12;
        int i13;
        Function1 function12;
        int i14;
        int i15;
        boolean z14;
        T.p pVar2;
        boolean z15;
        boolean z16;
        Function1 function13;
        boolean z17;
        boolean z18;
        Function1 function14;
        int i16;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(2043906260);
        int i17 = i4 | 6;
        if ((i4 & 48) == 0) {
            if (c0585q.hotel(z2)) {
                i16 = 32;
            } else {
                i16 = 16;
            }
            i17 |= i16;
        }
        int i18 = i5 & 4;
        if (i18 != 0) {
            i11 = i17 | 384;
            z12 = z10;
        } else {
            z12 = z10;
            if (c0585q.hotel(z12)) {
                i10 = Barcode.FORMAT_QR_CODE;
            } else {
                i10 = 128;
            }
            i11 = i17 | i10;
        }
        int i19 = i5 & 8;
        if (i19 != 0) {
            i13 = i11 | 3072;
            z13 = z11;
        } else {
            z13 = z11;
            if (c0585q.hotel(z13)) {
                i12 = 2048;
            } else {
                i12 = Barcode.FORMAT_UPC_E;
            }
            i13 = i11 | i12;
        }
        int i20 = i5 & 16;
        if (i20 != 0) {
            i15 = i13 | 24576;
            function12 = function1;
        } else {
            function12 = function1;
            if (c0585q.india(function12)) {
                i14 = Http2.INITIAL_MAX_FRAME_SIZE;
            } else {
                i14 = 8192;
            }
            i15 = i13 | i14;
        }
        if ((i15 & 9363) != 9362) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (c0585q.magenta(i15 & 1, z14)) {
            T.p pVar3 = T.p.alpha;
            if (i18 != 0) {
                z17 = true;
            } else {
                z17 = z12;
            }
            if (i19 != 0) {
                z18 = false;
            } else {
                z18 = z13;
            }
            if (i20 != 0) {
                Object jade = c0585q.jade();
                if (jade == C0580l.alpha) {
                    jade = new am(6);
                    c0585q.f(jade);
                }
                function14 = (Function1) jade;
            } else {
                function14 = function12;
            }
            kotlin.text.n.alpha(AbstractC3086y3.bravo(c0585q, R.string.status_header_online_ready), Db.c.uniform, Db.c.victor, new D0.an(0L, AbstractC2636d7.charlie(14), H0.v.e, null, Db.g.alpha, 0L, 0, 0L, 0, 16777177), P.e.echo(1122053793, new av(1, function14, z2, z17, z18), c0585q), c0585q, 221184);
            z15 = z17;
            z16 = z18;
            pVar2 = pVar3;
            function13 = function14;
        } else {
            c0585q.ochre();
            pVar2 = pVar;
            z15 = z12;
            z16 = z13;
            function13 = function12;
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new aw(pVar2, z2, z15, z16, function13, i4, i5, 1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v19 */
    public static final void lima(final OrdersFragmentV2 ordersFragmentV2, final HomeViewModelV2 viewModel, final Nb.h hVar, final yf.N assetsCountFlow, final yf.N transferCountFlow, final yf.N disclaimerUiFlow, final yf.N isSwitchCheckedFlow, final androidx.lifecycle.az azVar, final Function0 onInternetRecovered, Function1 onToggleChange, final Function0 onShowAccuracyInstructions, final Function0 onShowConnectionDiagnostics, final Function0 onAssetsClick, final Function0 onTransferClick, final Function1 onDisclaimerDeepLinkClick, final Function0 function0, final Function0 function02, InterfaceC0581m interfaceC0581m, final int i4) {
        final Function1 function1;
        C0585q c0585q;
        ?? r92;
        Captain captain;
        Intrinsics.echo(viewModel, "viewModel");
        Intrinsics.echo(assetsCountFlow, "assetsCountFlow");
        Intrinsics.echo(transferCountFlow, "transferCountFlow");
        Intrinsics.echo(disclaimerUiFlow, "disclaimerUiFlow");
        Intrinsics.echo(isSwitchCheckedFlow, "isSwitchCheckedFlow");
        Intrinsics.echo(onInternetRecovered, "onInternetRecovered");
        Intrinsics.echo(onToggleChange, "onToggleChange");
        Intrinsics.echo(onShowAccuracyInstructions, "onShowAccuracyInstructions");
        Intrinsics.echo(onShowConnectionDiagnostics, "onShowConnectionDiagnostics");
        Intrinsics.echo(onAssetsClick, "onAssetsClick");
        Intrinsics.echo(onTransferClick, "onTransferClick");
        Intrinsics.echo(onDisclaimerDeepLinkClick, "onDisclaimerDeepLinkClick");
        C0585q c0585q2 = (C0585q) interfaceC0581m;
        c0585q2.silver(-1258752929);
        int i5 = i4 | (c0585q2.india(ordersFragmentV2) ? 4 : 2) | (c0585q2.india(viewModel) ? 32 : 16) | (c0585q2.india(hVar) ? 256 : 128);
        boolean india2 = c0585q2.india(assetsCountFlow);
        int i10 = Barcode.FORMAT_UPC_E;
        int i11 = i5 | (india2 ? 2048 : 1024) | (c0585q2.india(transferCountFlow) ? 16384 : 8192) | (c0585q2.india(disclaimerUiFlow) ? 131072 : 65536) | (c0585q2.india(isSwitchCheckedFlow) ? 1048576 : 524288) | (c0585q2.india(azVar) ? 8388608 : 4194304) | (c0585q2.india(onInternetRecovered) ? 67108864 : 33554432) | (c0585q2.india(onToggleChange) ? 536870912 : 268435456);
        int i12 = (c0585q2.india(onShowAccuracyInstructions) ? 4 : 2) | (c0585q2.india(onShowConnectionDiagnostics) ? 32 : 16) | (c0585q2.india(onAssetsClick) ? 256 : 128);
        if (c0585q2.india(onTransferClick)) {
            i10 = 2048;
        }
        int i13 = i12 | i10 | (c0585q2.india(onDisclaimerDeepLinkClick) ? 16384 : 8192) | (c0585q2.india(function0) ? 131072 : 65536) | (c0585q2.india(function02) ? 1048576 : 524288);
        if (c0585q2.magenta(i11 & 1, ((i11 & 306783379) == 306783378 && (i13 & 599187) == 599186) ? false : true)) {
            Object obj = C0580l.alpha;
            androidx.compose.runtime.ax mike = C0564b.mike(assetsCountFlow, c0585q2, (i11 >> 9) & 14);
            int i14 = i11 >> 12;
            androidx.compose.runtime.ax mike2 = C0564b.mike(transferCountFlow, c0585q2, i14 & 14);
            int i15 = i11 >> 15;
            androidx.compose.runtime.ax mike3 = C0564b.mike(disclaimerUiFlow, c0585q2, i15 & 14);
            Boolean bool = Boolean.TRUE;
            yf.av avVar = hVar.charlie;
            androidx.compose.runtime.ax charlie2 = AbstractC2717m7.charlie(avVar, bool, c0585q2, 48);
            Object jade = c0585q2.jade();
            if (jade == obj) {
                Boolean bool2 = (Boolean) charlie2.getValue();
                bool2.getClass();
                jade = C0564b.zulu(bool2);
                c0585q2.f(jade);
            }
            androidx.compose.runtime.ax axVar = (androidx.compose.runtime.ax) jade;
            Boolean bool3 = (Boolean) charlie2.getValue();
            bool3.getClass();
            boolean golf2 = c0585q2.golf(charlie2) | ((i11 & 234881024) == 67108864);
            Object jade2 = c0585q2.jade();
            if (golf2 || jade2 == obj) {
                jade2 = new aa(onInternetRecovered, axVar, charlie2, null);
                c0585q2.f(jade2);
            }
            C0564b.foxtrot((Xd.l) jade2, c0585q2, bool3);
            int i16 = i11 >> 18;
            androidx.compose.runtime.ax bravo2 = AbstractC2717m7.bravo(isSwitchCheckedFlow, c0585q2, i16 & 14);
            androidx.compose.runtime.ax bravo3 = V6.bravo(azVar, azVar.getValue(), c0585q2, (i11 >> 21) & 14);
            UserInfo userInfo = (UserInfo) bravo3.getValue();
            boolean areEqual = (userInfo == null || (captain = userInfo.getCaptain()) == null) ? false : Intrinsics.areEqual(captain.getSuspended(), bool);
            T.p pVar = T.p.alpha;
            T.s charlie3 = androidx.compose.foundation.layout.V.charlie(pVar, 1.0f);
            C0554u alpha2 = AbstractC0553t.alpha(AbstractC0542h.charlie, T.d.f2062f, c0585q2, 0);
            long j5 = c0585q2.magenta;
            int i17 = (int) (j5 ^ (j5 >>> 32));
            androidx.compose.runtime.I mike4 = c0585q2.mike();
            T.s charlie4 = T.a.charlie(charlie3, c0585q2);
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
            C0564b.blue(c2549i2, c0585q2, mike4);
            C2549i c2549i3 = C2551k.golf;
            if (c0585q2.lime || !Intrinsics.areEqual(c0585q2.jade(), Integer.valueOf(i17))) {
                ao.ad.blue(i17, c0585q2, i17, c2549i3);
            }
            C2549i c2549i4 = C2551k.delta;
            C0564b.blue(c2549i4, c0585q2, charlie4);
            int i18 = i13 << 12;
            int i19 = i13 << 6;
            alpha(viewModel, isSwitchCheckedFlow, avVar, null, onShowAccuracyInstructions, onShowConnectionDiagnostics, null, function0, c0585q2, ((i11 >> 3) & 14) | (i15 & 112) | (57344 & i18) | (i18 & 458752) | (i19 & 29360128), 72);
            int i20 = i13 << 18;
            quebec(ordersFragmentV2, azVar, isSwitchCheckedFlow, avVar, null, onToggleChange, onShowAccuracyInstructions, onShowConnectionDiagnostics, function02, c0585q2, (i11 & 14) | (i16 & 112) | (i14 & 896) | (i14 & 458752) | (3670016 & i20) | (i20 & 29360128) | (i19 & 234881024));
            function1 = onToggleChange;
            C0585q c0585q3 = c0585q2;
            if (!areEqual && !((Boolean) bravo2.getValue()).booleanValue()) {
                c0585q3.purple(-179514385);
                AbstractC0538d.echo(androidx.compose.foundation.layout.V.echo(pVar, 24), c0585q3);
                boolean z2 = (i11 & 1879048192) == 536870912;
                Object jade3 = c0585q3.jade();
                if (z2 || jade3 == obj) {
                    jade3 = new Cb.j(1, function1);
                    c0585q3.f(jade3);
                }
                A7.alpha((Function0) jade3, AbstractC0538d.uniform(androidx.compose.foundation.layout.V.charlie(pVar, 1.0f), 16, 0.0f, 2), null, null, null, false, c0585q3, 48);
                r92 = 0;
            } else {
                r92 = 0;
                c0585q3.purple(-183668819);
            }
            c0585q3.quebec(r92);
            india((UserInfo) bravo3.getValue(), ((Boolean) charlie2.getValue()).booleanValue(), c0585q3, r92);
            if (!areEqual && ((Boolean) charlie2.getValue()).booleanValue()) {
                c0585q3.purple(-178979418);
                T.s charlie5 = androidx.compose.foundation.layout.V.charlie(pVar, 1.0f);
                q0.ap delta2 = AbstractC0547m.delta(T.d.alpha, r92);
                long j6 = c0585q3.magenta;
                int i21 = (int) (j6 ^ (j6 >>> 32));
                androidx.compose.runtime.I mike5 = c0585q3.mike();
                T.s charlie6 = T.a.charlie(charlie5, c0585q3);
                c0585q3.white();
                if (c0585q3.lime) {
                    c0585q3.lima(c2550j);
                } else {
                    c0585q3.i();
                }
                C0564b.blue(c2549i, c0585q3, delta2);
                C0564b.blue(c2549i2, c0585q3, mike5);
                if (c0585q3.lime || !Intrinsics.areEqual(c0585q3.jade(), Integer.valueOf(i21))) {
                    ao.ad.blue(i21, c0585q3, i21, c2549i3);
                }
                C0564b.blue(c2549i4, c0585q3, charlie6);
                mike(((Number) mike.getValue()).intValue(), ((Number) mike2.getValue()).intValue(), (Sb.e) mike3.getValue(), onAssetsClick, onTransferClick, onDisclaimerDeepLinkClick, c0585q3, (i13 << 3) & 523264);
                c0585q3.quebec(true);
            } else {
                c0585q3.purple(-183668819);
            }
            c0585q3.quebec(r92);
            c0585q3.quebec(true);
            c0585q = c0585q3;
        } else {
            function1 = onToggleChange;
            C0585q c0585q4 = c0585q2;
            c0585q4.ochre();
            c0585q = c0585q4;
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new Xd.l(viewModel, hVar, assetsCountFlow, transferCountFlow, disclaimerUiFlow, isSwitchCheckedFlow, azVar, onInternetRecovered, function1, onShowAccuracyInstructions, onShowConnectionDiagnostics, onAssetsClick, onTransferClick, onDisclaimerDeepLinkClick, function0, function02, i4) { // from class: Lb.z

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ androidx.lifecycle.az f1822a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ Function0 f1823b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ Function1 f1824c;

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ Function0 f1825d;
                public final /* synthetic */ Function0 e;

                /* renamed from: f, reason: collision with root package name */
                public final /* synthetic */ Function0 f1826f;

                /* renamed from: g, reason: collision with root package name */
                public final /* synthetic */ Function0 f1827g;

                /* renamed from: h, reason: collision with root package name */
                public final /* synthetic */ Function1 f1828h;

                /* renamed from: i, reason: collision with root package name */
                public final /* synthetic */ Function0 f1829i;

                /* renamed from: j, reason: collision with root package name */
                public final /* synthetic */ Function0 f1830j;
                public final /* synthetic */ HomeViewModelV2 purple;
                public final /* synthetic */ Nb.h red;
                public final /* synthetic */ yf.N silver;
                public final /* synthetic */ yf.N teal;
                public final /* synthetic */ yf.N white;
                public final /* synthetic */ yf.N yellow;

                @Override // Xd.l
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int cyan = C0564b.cyan(1);
                    OrdersFragmentV2 ordersFragmentV22 = OrdersFragmentV2.this;
                    Nb.h hVar2 = this.red;
                    androidx.lifecycle.az azVar2 = this.f1822a;
                    Function0 function03 = this.f1829i;
                    Function0 function04 = this.f1830j;
                    AbstractC0220c.lima(ordersFragmentV22, this.purple, hVar2, this.silver, this.teal, this.white, this.yellow, azVar2, this.f1823b, this.f1824c, this.f1825d, this.e, this.f1826f, this.f1827g, this.f1828h, function03, function04, (InterfaceC0581m) obj2, cyan);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void mike(int i4, int i5, Sb.e eVar, Function0 onAssetsClick, Function0 function0, Function1 onDisclaimerDeepLinkClick, InterfaceC0581m interfaceC0581m, int i10) {
        int i11;
        boolean z2;
        Function1 function1;
        boolean z10;
        int i12;
        boolean z11;
        boolean z12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19 = i5;
        Sb.e eVar2 = eVar;
        Function0 onTransferClick = function0;
        Intrinsics.echo(onAssetsClick, "onAssetsClick");
        Intrinsics.echo(onTransferClick, "onTransferClick");
        Intrinsics.echo(onDisclaimerDeepLinkClick, "onDisclaimerDeepLinkClick");
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(1987806098);
        if ((i10 & 6) == 0) {
            if (c0585q.echo(i4)) {
                i18 = 4;
            } else {
                i18 = 2;
            }
            i11 = i18 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (c0585q.echo(i19)) {
                i17 = 32;
            } else {
                i17 = 16;
            }
            i11 |= i17;
        }
        if ((i10 & 384) == 0) {
            if (c0585q.golf(eVar2)) {
                i16 = Barcode.FORMAT_QR_CODE;
            } else {
                i16 = 128;
            }
            i11 |= i16;
        }
        if ((i10 & 3072) == 0) {
            if (c0585q.india(onAssetsClick)) {
                i15 = 2048;
            } else {
                i15 = Barcode.FORMAT_UPC_E;
            }
            i11 |= i15;
        }
        if ((i10 & 24576) == 0) {
            if (c0585q.india(onTransferClick)) {
                i14 = Http2.INITIAL_MAX_FRAME_SIZE;
            } else {
                i14 = 8192;
            }
            i11 |= i14;
        }
        if ((196608 & i10) == 0) {
            if (c0585q.india(onDisclaimerDeepLinkClick)) {
                i13 = 131072;
            } else {
                i13 = 65536;
            }
            i11 |= i13;
        }
        if ((74899 & i11) != 74898) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i11 & 1, z2)) {
            T.p pVar = T.p.alpha;
            T.s charlie2 = androidx.compose.foundation.layout.V.charlie(pVar, 1.0f);
            C0537c c0537c = AbstractC0542h.charlie;
            T.i iVar = T.d.f2062f;
            C0554u alpha2 = AbstractC0553t.alpha(c0537c, iVar, c0585q, 0);
            long j5 = c0585q.magenta;
            int i20 = (int) (j5 ^ (j5 >>> 32));
            androidx.compose.runtime.I mike = c0585q.mike();
            T.s charlie3 = T.a.charlie(charlie2, c0585q);
            InterfaceC2552l.maroon.getClass();
            C2550j c2550j = C2551k.bravo;
            c0585q.white();
            int i21 = i11;
            if (c0585q.lime) {
                c0585q.lima(c2550j);
            } else {
                c0585q.i();
            }
            C2549i c2549i = C2551k.foxtrot;
            C0564b.blue(c2549i, c0585q, alpha2);
            C2549i c2549i2 = C2551k.echo;
            C0564b.blue(c2549i2, c0585q, mike);
            C2549i c2549i3 = C2551k.golf;
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i20))) {
                ao.ad.blue(i20, c0585q, i20, c2549i3);
            }
            C2549i c2549i4 = C2551k.delta;
            C0564b.blue(c2549i4, c0585q, charlie3);
            if (i4 <= 0 && i19 <= 0) {
                c0585q.purple(2115479866);
                c0585q.quebec(false);
                z11 = false;
            } else {
                c0585q.purple(2116793460);
                float f5 = 8;
                T.s sierra = AbstractC0538d.sierra(androidx.compose.foundation.a.bravo(androidx.compose.foundation.layout.V.charlie(pVar, 1.0f), a0.ao.delta(4294375158L), AbstractC2094g.bravo(12)), f5);
                C0554u alpha3 = AbstractC0553t.alpha(c0537c, iVar, c0585q, 0);
                long j6 = c0585q.magenta;
                int i22 = (int) (j6 ^ (j6 >>> 32));
                androidx.compose.runtime.I mike2 = c0585q.mike();
                T.s charlie4 = T.a.charlie(sierra, c0585q);
                c0585q.white();
                if (c0585q.lime) {
                    c0585q.lima(c2550j);
                } else {
                    c0585q.i();
                }
                C0564b.blue(c2549i, c0585q, alpha3);
                C0564b.blue(c2549i2, c0585q, mike2);
                if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i22))) {
                    ao.ad.blue(i22, c0585q, i22, c2549i3);
                }
                C0564b.blue(c2549i4, c0585q, charlie4);
                if (i4 > 0) {
                    c0585q.purple(463635986);
                    i12 = i4;
                    Sb.d.echo(onAssetsClick, i12, c0585q, (i21 & 14) | ((i21 >> 6) & 112));
                    z10 = false;
                } else {
                    z10 = false;
                    i12 = i4;
                    c0585q.purple(462084777);
                }
                c0585q.quebec(z10);
                if (i12 > 0 && i5 > 0) {
                    c0585q.purple(463873849);
                    AbstractC0538d.echo(androidx.compose.foundation.layout.V.echo(pVar, f5), c0585q);
                } else {
                    c0585q.purple(462084777);
                }
                c0585q.quebec(z10);
                if (i5 > 0) {
                    c0585q.purple(463997291);
                    i19 = i5;
                    onTransferClick = function0;
                    Sb.d.juliet(onTransferClick, i19, c0585q, ((i21 >> 3) & 14) | ((i21 >> 9) & 112));
                    z11 = false;
                } else {
                    i19 = i5;
                    onTransferClick = function0;
                    z11 = false;
                    c0585q.purple(462084777);
                }
                c0585q.quebec(z11);
                c0585q.quebec(true);
                c0585q.quebec(z11);
            }
            if (eVar == null) {
                c0585q.purple(2117626925);
                c0585q.quebec(z11);
                eVar2 = eVar;
                function1 = onDisclaimerDeepLinkClick;
            } else {
                c0585q.purple(2117626926);
                eVar2 = eVar;
                boolean golf2 = c0585q.golf(eVar2);
                if ((i21 & 458752) == 131072) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                boolean z13 = golf2 | z12;
                Object jade = c0585q.jade();
                if (!z13 && jade != C0580l.alpha) {
                    function1 = onDisclaimerDeepLinkClick;
                } else {
                    function1 = onDisclaimerDeepLinkClick;
                    jade = new Ac.g(eVar2, function1);
                    c0585q.f(jade);
                }
                Sb.d.golf(eVar2, (Function0) jade, c0585q, 0);
                c0585q.quebec(false);
            }
            c0585q.quebec(true);
        } else {
            function1 = onDisclaimerDeepLinkClick;
            c0585q.ochre();
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new ab(i4, i19, eVar2, onAssetsClick, onTransferClick, function1, i10);
        }
    }

    public static final void november(T.s sVar, InterfaceC0581m interfaceC0581m, int i4, int i5) {
        T.s sVar2;
        int i10;
        int i11;
        boolean z2;
        T.s sVar3;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(323929062);
        int i12 = i5 & 1;
        if (i12 != 0) {
            i10 = i4 | 6;
            sVar2 = sVar;
        } else if ((i4 & 6) == 0) {
            sVar2 = sVar;
            if (c0585q.golf(sVar2)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i10 = i11 | i4;
        } else {
            sVar2 = sVar;
            i10 = i4;
        }
        if ((i10 & 3) != 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i10 & 1, z2)) {
            T.p pVar = T.p.alpha;
            if (i12 != 0) {
                sVar3 = pVar;
            } else {
                sVar3 = sVar2;
            }
            float f5 = 10;
            float f10 = 12;
            T.s victor = AbstractC0538d.victor(androidx.compose.foundation.a.bravo(androidx.compose.foundation.layout.V.golf(androidx.compose.foundation.layout.V.charlie(sVar3, 1.0f), 48, 0.0f, 2), Db.c.navy, a0.ao.alpha), f5, f10, f5, f10);
            C0537c c0537c = AbstractC0542h.alpha;
            androidx.compose.foundation.layout.S alpha2 = androidx.compose.foundation.layout.Q.alpha(AbstractC0542h.hotel(f5, T.d.f2063g), T.d.f2061d, c0585q, 54);
            long j5 = c0585q.magenta;
            int i13 = (int) (j5 ^ (j5 >>> 32));
            androidx.compose.runtime.I mike = c0585q.mike();
            T.s charlie2 = T.a.charlie(victor, c0585q);
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
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i13))) {
                ao.ad.blue(i13, c0585q, i13, c2549i);
            }
            C0564b.blue(C2551k.delta, c0585q, charlie2);
            W3.alpha(AbstractC3076w3.charlie(R.drawable.reconnecting_icon, c0585q, 6), null, androidx.compose.foundation.layout.V.kilo(pVar, 24), null, C2391j.echo, 0.0f, null, c0585q, 25008, 104);
            String bravo2 = AbstractC3086y3.bravo(c0585q, R.string.status_header_reconnecting);
            D0.an anVar = new D0.an(C0366t.echo, AbstractC2636d7.charlie(14), H0.v.f1407a, null, Db.g.alpha, 0L, 0, 0L, 0, 16777176);
            if (1.0f <= 0.0d) {
                AbstractC1797a.alpha("invalid weight; must be greater than zero");
            }
            G2.bravo(bravo2, new LayoutWeightElement(1.0f, false), 0L, 0L, null, null, 0L, null, 0L, 0, false, 2, 0, null, anVar, c0585q, 0, 3072, 57340);
            c0585q = c0585q;
            c0585q.quebec(true);
            sVar2 = sVar3;
        } else {
            c0585q.ochre();
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new ai(sVar2, i4, i5);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00f6, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r11.jade(), java.lang.Integer.valueOf(r10)) == false) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void oscar(T.s sVar, Function0 function0, String str, String str2, InterfaceC0581m interfaceC0581m, int i4, int i5) {
        T.s sVar2;
        int i10;
        int i11;
        boolean z2;
        String str3;
        T.s sVar3;
        String str4;
        int i12;
        String bravo2;
        String bravo3;
        int i13;
        T.s sVar4;
        boolean z10;
        int i14;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-1585427311);
        int i15 = i5 & 1;
        if (i15 != 0) {
            i10 = i4 | 6;
            sVar2 = sVar;
        } else if ((i4 & 6) == 0) {
            sVar2 = sVar;
            if (c0585q.golf(sVar2)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i10 = i11 | i4;
        } else {
            sVar2 = sVar;
            i10 = i4;
        }
        if ((i4 & 48) == 0) {
            if (c0585q.india(function0)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i10 |= i14;
        }
        if ((i4 & 384) == 0) {
            i10 |= 128;
        }
        if ((i4 & 3072) == 0) {
            i10 |= Barcode.FORMAT_UPC_E;
        }
        if ((i10 & 1171) != 1170) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i10 & 1, z2)) {
            c0585q.orange();
            int i16 = i4 & 1;
            T.p pVar = T.p.alpha;
            androidx.compose.runtime.as asVar = C0580l.alpha;
            if (i16 != 0 && !c0585q.beige()) {
                c0585q.ochre();
                i12 = i10 & (-8065);
                i13 = 32;
                bravo2 = str;
                bravo3 = str2;
            } else {
                if (i15 != 0) {
                    sVar2 = pVar;
                }
                i12 = i10 & (-8065);
                bravo2 = AbstractC3086y3.bravo(c0585q, R.string.status_header_icon_server_timeout);
                bravo3 = AbstractC3086y3.bravo(c0585q, R.string.status_header_action_why_timeout);
                i13 = 32;
            }
            c0585q.romeo();
            int i17 = i13;
            T.s bravo4 = androidx.compose.foundation.a.bravo(androidx.compose.foundation.layout.V.golf(androidx.compose.foundation.layout.V.charlie(sVar2, 1.0f), 48, 0.0f, 2), Db.c.ochre, a0.ao.alpha);
            q0.ap delta2 = AbstractC0547m.delta(T.d.alpha, false);
            long j5 = c0585q.magenta;
            int i18 = (int) (j5 ^ (j5 >>> i17));
            androidx.compose.runtime.I mike = c0585q.mike();
            T.s charlie2 = T.a.charlie(bravo4, c0585q);
            InterfaceC2552l.maroon.getClass();
            C2550j c2550j = C2551k.bravo;
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j);
            } else {
                c0585q.i();
            }
            C2549i c2549i = C2551k.foxtrot;
            C0564b.blue(c2549i, c0585q, delta2);
            C2549i c2549i2 = C2551k.echo;
            C0564b.blue(c2549i2, c0585q, mike);
            C2549i c2549i3 = C2551k.golf;
            if (!c0585q.lime) {
                sVar4 = sVar2;
            } else {
                sVar4 = sVar2;
            }
            ao.ad.blue(i18, c0585q, i18, c2549i3);
            C2549i c2549i4 = C2551k.delta;
            C0564b.blue(c2549i4, c0585q, charlie2);
            float f5 = 10;
            float f10 = 12;
            T.s victor = AbstractC0538d.victor(androidx.compose.foundation.layout.V.charlie(pVar, 1.0f), f5, f10, f5, f10);
            T.j jVar = T.d.f2061d;
            int i19 = i12;
            androidx.compose.foundation.layout.S alpha2 = androidx.compose.foundation.layout.Q.alpha(AbstractC0542h.alpha, jVar, c0585q, 48);
            long j6 = c0585q.magenta;
            int i20 = (int) (j6 ^ (j6 >>> i17));
            androidx.compose.runtime.I mike2 = c0585q.mike();
            T.s charlie3 = T.a.charlie(victor, c0585q);
            c0585q.white();
            String str5 = bravo3;
            if (c0585q.lime) {
                c0585q.lima(c2550j);
            } else {
                c0585q.i();
            }
            C0564b.blue(c2549i, c0585q, alpha2);
            C0564b.blue(c2549i2, c0585q, mike2);
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i20))) {
                ao.ad.blue(i20, c0585q, i20, c2549i3);
            }
            C0564b.blue(c2549i4, c0585q, charlie3);
            if (1.0f <= 0.0d) {
                AbstractC1797a.alpha("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
            androidx.compose.foundation.layout.S alpha3 = androidx.compose.foundation.layout.Q.alpha(AbstractC0542h.golf(8), jVar, c0585q, 54);
            long j7 = c0585q.magenta;
            int i21 = (int) (j7 ^ (j7 >>> i17));
            androidx.compose.runtime.I mike3 = c0585q.mike();
            T.s charlie4 = T.a.charlie(layoutWeightElement, c0585q);
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j);
            } else {
                c0585q.i();
            }
            C0564b.blue(c2549i, c0585q, alpha3);
            C0564b.blue(c2549i2, c0585q, mike3);
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i21))) {
                ao.ad.blue(i21, c0585q, i21, c2549i3);
            }
            C0564b.blue(c2549i4, c0585q, charlie4);
            AbstractC1680b charlie5 = AbstractC3076w3.charlie(R.drawable.server_timeout_icon, c0585q, 6);
            C2394m c2394m = C2391j.echo;
            T.s kilo2 = androidx.compose.foundation.layout.V.kilo(pVar, 24);
            boolean golf2 = c0585q.golf(bravo2);
            Object jade = c0585q.jade();
            if (golf2 || jade == asVar) {
                jade = new ae(bravo2, 2);
                c0585q.f(jade);
            }
            W3.alpha(charlie5, bravo2, A0.o.bravo(kilo2, false, (Function1) jade), null, c2394m, 0.0f, null, c0585q, 24576, 104);
            String str6 = bravo2;
            String bravo5 = AbstractC3086y3.bravo(c0585q, R.string.status_header_server_timeout);
            long charlie6 = AbstractC2636d7.charlie(14);
            H0.n nVar = Db.g.alpha;
            D0.an anVar = new D0.an(0L, charlie6, H0.v.f1409c, null, nVar, 0L, 0, 0L, 0, 16777177);
            long j10 = C0366t.echo;
            G2.bravo(bravo5, null, j10, 0L, null, null, 0L, null, 0L, 0, false, 2, 0, null, anVar, c0585q, 384, 3072, 57338);
            c0585q.quebec(true);
            if ((i19 & 112) == i17) {
                z10 = true;
            } else {
                z10 = false;
            }
            Object jade2 = c0585q.jade();
            if (z10 || jade2 == asVar) {
                jade2 = new Bb.a(function0, 9);
                c0585q.f(jade2);
            }
            T.s echo2 = androidx.compose.foundation.a.echo(15, pVar, null, (Function0) jade2, false);
            boolean golf3 = c0585q.golf(str5);
            Object jade3 = c0585q.jade();
            if (golf3 || jade3 == asVar) {
                jade3 = new ae(str5, 3);
                c0585q.f(jade3);
            }
            T.s bravo6 = A0.o.bravo(echo2, false, (Function1) jade3);
            androidx.compose.foundation.layout.S alpha4 = androidx.compose.foundation.layout.Q.alpha(AbstractC0542h.golf(Db.f.bravo), jVar, c0585q, 48);
            long j11 = c0585q.magenta;
            int i22 = (int) (j11 ^ (j11 >>> i17));
            androidx.compose.runtime.I mike4 = c0585q.mike();
            T.s charlie7 = T.a.charlie(bravo6, c0585q);
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j);
            } else {
                c0585q.i();
            }
            C0564b.blue(c2549i, c0585q, alpha4);
            C0564b.blue(c2549i2, c0585q, mike4);
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i22))) {
                ao.ad.blue(i22, c0585q, i22, c2549i3);
            }
            C0564b.blue(c2549i4, c0585q, charlie7);
            G2.bravo(AbstractC3086y3.bravo(c0585q, R.string.status_header_why), null, j10, 0L, null, null, 0L, null, 0L, 0, false, 1, 0, null, new D0.an(0L, AbstractC2636d7.charlie(14), H0.v.f1407a, null, nVar, 0L, 0, 0L, 0, 16777177), c0585q, 384, 3072, 57338);
            c0585q = c0585q;
            AbstractC0141o0.bravo(B7.b.bravo(), null, androidx.compose.foundation.layout.V.kilo(pVar, 20), j10, c0585q, 3504, 0);
            A0.z.papa(c0585q, true, true, true);
            sVar3 = sVar4;
            str3 = str5;
            str4 = str6;
        } else {
            c0585q.ochre();
            str3 = str2;
            sVar3 = sVar2;
            str4 = str;
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new ah(sVar3, function0, str4, str3, i4, i5, 1);
        }
    }

    public static final void papa(aj ajVar, Function1 function1, Function0 function0, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        boolean z2;
        au auVar;
        int i10;
        int i11;
        int i12;
        int i13;
        T.p pVar = T.p.alpha;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-1803619876);
        if ((i4 & 6) == 0) {
            if (c0585q.golf(ajVar)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i5 = i13 | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            if (c0585q.golf(pVar)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i5 |= i12;
        }
        if ((i4 & 384) == 0) {
            if (c0585q.india(function1)) {
                i11 = Barcode.FORMAT_QR_CODE;
            } else {
                i11 = 128;
            }
            i5 |= i11;
        }
        if ((i4 & 3072) == 0) {
            if (c0585q.india(function0)) {
                i10 = 2048;
            } else {
                i10 = Barcode.FORMAT_UPC_E;
            }
            i5 |= i10;
        }
        if ((i5 & 1171) != 1170) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i5 & 1, z2)) {
            boolean z10 = ajVar.alpha;
            boolean z11 = ajVar.hotel;
            if (z10) {
                auVar = au.alpha;
            } else if (!z11) {
                auVar = au.purple;
            } else {
                auVar = au.red;
            }
            switch (auVar.ordinal()) {
                case 0:
                    c0585q.purple(-1598527206);
                    xray((i5 >> 3) & 910, 0, pVar, c0585q, ajVar.lima, function0);
                    c0585q = c0585q;
                    c0585q.quebec(false);
                    break;
                case 1:
                case 2:
                case 3:
                case 4:
                    c0585q.purple(-1597376176);
                    if (z11) {
                        c0585q.purple(-1597286152);
                        uniform(pVar, ajVar.hotel, ajVar.india, ajVar.juliet, function1, c0585q, ((i5 >> 3) & 14) | ((i5 << 6) & 57344), 0);
                        c0585q.quebec(false);
                    } else {
                        c0585q.purple(-1596948841);
                        tango(pVar, ajVar.hotel, ajVar.india, ajVar.juliet, function1, c0585q, ((i5 >> 3) & 14) | ((i5 << 6) & 57344), 0);
                        c0585q.quebec(false);
                    }
                    c0585q.quebec(false);
                    break;
                case 5:
                    c0585q.purple(-1598281097);
                    tango(pVar, ajVar.hotel, ajVar.india, ajVar.juliet, function1, c0585q, ((i5 >> 3) & 14) | ((i5 << 6) & 57344), 0);
                    c0585q.quebec(false);
                    break;
                case 6:
                    c0585q.purple(-1597940872);
                    uniform(pVar, ajVar.hotel, ajVar.india, ajVar.juliet, function1, c0585q, ((i5 >> 3) & 14) | ((i5 << 6) & 57344), 0);
                    c0585q.quebec(false);
                    break;
                default:
                    throw ao.ad.black(c0585q, 1888097130, false);
            }
        } else {
            c0585q.ochre();
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new Ec.al(ajVar, function1, function0, i4, 1);
        }
    }

    public static final void quebec(OrdersFragmentV2 ordersFragmentV2, androidx.lifecycle.az azVar, yf.N isSwitchCheckedFlow, yf.av hasInternetFlow, T.p pVar, Function1 function1, Function0 function0, Function0 function02, Function0 function03, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        int i10;
        boolean z2;
        T.p pVar2;
        Captain captain;
        String str;
        boolean z10;
        boolean z11;
        boolean z12;
        String str2;
        WorkingStatus workingStatus;
        String str3;
        Date parse;
        String str4;
        p3.ah ahVar;
        EnumC2270b enumC2270b;
        Boolean readyToWork;
        au auVar;
        au auVar2;
        int i11;
        int i12;
        int i13;
        int i14;
        Intrinsics.echo(isSwitchCheckedFlow, "isSwitchCheckedFlow");
        Intrinsics.echo(hasInternetFlow, "hasInternetFlow");
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-154455115);
        if (c0585q.india(ordersFragmentV2)) {
            i5 = 4;
        } else {
            i5 = 2;
        }
        int i15 = i5 | i4;
        if ((i4 & 48) == 0) {
            if (c0585q.india(azVar)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i15 |= i14;
        }
        if ((i4 & 384) == 0) {
            if (c0585q.india(isSwitchCheckedFlow)) {
                i13 = Barcode.FORMAT_QR_CODE;
            } else {
                i13 = 128;
            }
            i15 |= i13;
        }
        if (c0585q.india(hasInternetFlow)) {
            i10 = 2048;
        } else {
            i10 = Barcode.FORMAT_UPC_E;
        }
        int i16 = i15 | i10 | 24576;
        if ((196608 & i4) == 0) {
            if (c0585q.india(function1)) {
                i12 = 131072;
            } else {
                i12 = 65536;
            }
            i16 |= i12;
        }
        if ((100663296 & i4) == 0) {
            if (c0585q.india(function03)) {
                i11 = 67108864;
            } else {
                i11 = 33554432;
            }
            i16 |= i11;
        }
        if ((33629331 & i16) != 33629330) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i16 & 1, z2)) {
            T.p pVar3 = T.p.alpha;
            androidx.compose.runtime.as asVar = C0580l.alpha;
            Object jade = c0585q.jade();
            if (jade == asVar) {
                jade = C0564b.zulu(azVar.getValue());
                c0585q.f(jade);
            }
            androidx.compose.runtime.ax axVar = (androidx.compose.runtime.ax) jade;
            UserInfo userInfo = (UserInfo) axVar.getValue();
            if (userInfo != null) {
                captain = userInfo.getCaptain();
            } else {
                captain = null;
            }
            UserInfo userInfo2 = (UserInfo) axVar.getValue();
            if (userInfo2 != null) {
                str = userInfo2.getSuspensionEndDate();
            } else {
                str = null;
            }
            boolean india2 = c0585q.india(azVar) | c0585q.india(ordersFragmentV2);
            Object jade2 = c0585q.jade();
            if (india2 || jade2 == asVar) {
                jade2 = new Cb.ac(azVar, ordersFragmentV2, axVar, 4);
                c0585q.f(jade2);
            }
            C0564b.delta(azVar, (Function1) jade2, c0585q);
            androidx.compose.runtime.ax bravo2 = AbstractC2717m7.bravo(CaptainLocationMonitoringService.f12067E, c0585q, 0);
            androidx.compose.runtime.ax bravo3 = AbstractC2717m7.bravo(CaptainLocationMonitoringService.f12068F, c0585q, 0);
            androidx.compose.runtime.ax bravo4 = AbstractC2717m7.bravo(isSwitchCheckedFlow, c0585q, (i16 >> 6) & 14);
            androidx.compose.runtime.ax charlie2 = AbstractC2717m7.charlie(ordersFragmentV2.f12315w, Boolean.FALSE, c0585q, 48);
            Boolean bool = Boolean.TRUE;
            int i17 = i16 >> 9;
            androidx.compose.runtime.ax charlie3 = AbstractC2717m7.charlie(hasInternetFlow, bool, c0585q, (i17 & 14) | 48);
            int i18 = i16;
            boolean hotel2 = c0585q.hotel(((Boolean) charlie3.getValue()).booleanValue()) | c0585q.golf(captain) | c0585q.golf(str) | c0585q.echo(((p3.ah) bravo2.getValue()).ordinal()) | c0585q.echo(((EnumC2270b) bravo3.getValue()).ordinal()) | c0585q.hotel(((Boolean) bravo4.getValue()).booleanValue()) | c0585q.hotel(((Boolean) charlie2.getValue()).booleanValue());
            Object jade3 = c0585q.jade();
            if (hotel2 || jade3 == asVar) {
                p3.ah stompState = (p3.ah) bravo2.getValue();
                EnumC2270b gpsQuality = (EnumC2270b) bravo3.getValue();
                boolean booleanValue = ((Boolean) charlie3.getValue()).booleanValue();
                boolean booleanValue2 = ((Boolean) bravo4.getValue()).booleanValue();
                boolean booleanValue3 = ((Boolean) charlie2.getValue()).booleanValue();
                Intrinsics.echo(stompState, "stompState");
                Intrinsics.echo(gpsQuality, "gpsQuality");
                if (CaptainLocationMonitoringService.f12074L == null && (CaptainLocationMonitoringService.f12073K == null || booleanValue)) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (captain != null) {
                    z11 = Intrinsics.areEqual(captain.getSuspended(), bool);
                } else {
                    z11 = false;
                }
                if (captain != null && (readyToWork = captain.getReadyToWork()) != null) {
                    z12 = readyToWork.booleanValue();
                } else {
                    z12 = false;
                }
                if (captain != null) {
                    str2 = captain.getLocationStatus();
                } else {
                    str2 = null;
                }
                if (captain != null) {
                    workingStatus = captain.getWorkingStatus();
                } else {
                    workingStatus = null;
                }
                boolean z13 = !booleanValue3;
                if (str != null) {
                    str3 = StringsKt.b(str).toString();
                } else {
                    str3 = null;
                }
                if (str3 == null) {
                    str3 = "";
                }
                if (str3.length() == 0) {
                    ahVar = stompState;
                    enumC2270b = gpsQuality;
                    str4 = null;
                } else {
                    try {
                        try {
                            parse = new SimpleDateFormat(com.checkout.components.insight.common.Constants.DATE_TIME_PATTERN_ISO_8601, Locale.US).parse(str3);
                        } catch (ParseException unused) {
                            parse = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssXXX", Locale.US).parse(str3);
                        }
                        if (parse != null) {
                            str3 = new SimpleDateFormat("dd MMM - HH:mm", Locale.getDefault()).format(parse);
                        }
                    } catch (Exception unused2) {
                    }
                    str4 = str3;
                    ahVar = stompState;
                    enumC2270b = gpsQuality;
                }
                jade3 = new aj(z11, z12, str2, workingStatus, ahVar, booleanValue, enumC2270b, booleanValue2, z13, booleanValue3, z10, str4);
                c0585q.f(jade3);
            }
            aj state = (aj) jade3;
            Intrinsics.echo(state, "state");
            if (state.alpha) {
                auVar = au.alpha;
            } else if (!state.hotel) {
                auVar = au.purple;
            } else {
                auVar = au.red;
            }
            au auVar3 = auVar;
            Boolean bool2 = (Boolean) bravo4.getValue();
            bool2.getClass();
            p3.ah ahVar2 = (p3.ah) bravo2.getValue();
            boolean golf2 = c0585q.golf(bravo4) | c0585q.golf(bravo2) | c0585q.golf(charlie3) | c0585q.golf(bravo3) | c0585q.golf(state) | c0585q.echo(auVar3.ordinal());
            Object jade4 = c0585q.jade();
            if (!golf2 && jade4 != asVar) {
                auVar2 = auVar3;
            } else {
                al alVar = new al(state, auVar3, bravo4, bravo2, charlie3, bravo3, null);
                auVar2 = auVar3;
                c0585q.f(alVar);
                jade4 = alVar;
            }
            C0564b.hotel(auVar2, bool2, ahVar2, (Xd.l) jade4, c0585q);
            papa(state, function1, function03, c0585q, (i17 & 1008) | ((i18 >> 15) & 7168));
            pVar2 = pVar3;
        } else {
            c0585q.ochre();
            pVar2 = pVar;
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new ak(ordersFragmentV2, azVar, isSwitchCheckedFlow, hasInternetFlow, pVar2, function1, function0, function02, function03, i4);
        }
    }

    public static final void romeo(T.p pVar, boolean z2, Function1 function1, Function0 function0, InterfaceC0581m interfaceC0581m, int i4) {
        boolean z10;
        Function1 function12;
        Function0 function02;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-799711095);
        int i5 = i4 | 3510;
        boolean z11 = true;
        if ((i5 & 1171) != 1170) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (c0585q.magenta(i5 & 1, z10)) {
            pVar = T.p.alpha;
            Object obj = C0580l.alpha;
            Object jade = c0585q.jade();
            if (jade == obj) {
                jade = new am(0);
                c0585q.f(jade);
            }
            function12 = (Function1) jade;
            Object jade2 = c0585q.jade();
            if (jade2 == obj) {
                jade2 = new F4.h(22);
                c0585q.f(jade2);
            }
            Function0 function03 = (Function0) jade2;
            K1.charlie(androidx.compose.foundation.layout.V.charlie(pVar, 1.0f), Db.a.bravo, null, K1.mike(0, 62), null, P.e.echo(1209227387, new ap(1, function03, function12), c0585q), c0585q, 196608, 20);
            function02 = function03;
        } else {
            c0585q.ochre();
            z11 = z2;
            function12 = function1;
            function02 = function0;
        }
        T.p pVar2 = pVar;
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new aq(pVar2, z11, function12, function02, i4, 1);
        }
    }

    public static final void sierra(T.p pVar, boolean z2, Function1 function1, InterfaceC0581m interfaceC0581m, int i4) {
        boolean z10;
        boolean z11;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-2116578666);
        int i5 = i4 | 438;
        if ((i5 & 147) != 146) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (c0585q.magenta(i5 & 1, z10)) {
            pVar = T.p.alpha;
            Object jade = c0585q.jade();
            if (jade == C0580l.alpha) {
                jade = new am(3);
                c0585q.f(jade);
            }
            function1 = (Function1) jade;
            K1.charlie(androidx.compose.foundation.layout.V.charlie(pVar, 1.0f), Db.a.bravo, null, K1.mike(0, 62), null, P.e.echo(1064758116, new an(1, function1), c0585q), c0585q, 196608, 20);
            z11 = true;
        } else {
            c0585q.ochre();
            z11 = z2;
        }
        T.p pVar2 = pVar;
        Function1 function12 = function1;
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new ao(pVar2, z11, function12, i4, 1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void tango(T.s sVar, boolean z2, boolean z10, boolean z11, Function1 function1, InterfaceC0581m interfaceC0581m, int i4, int i5) {
        T.s sVar2;
        int i10;
        int i11;
        boolean z12;
        int i12;
        int i13;
        boolean z13;
        int i14;
        int i15;
        boolean z14;
        int i16;
        int i17;
        Function1 function12;
        int i18;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        Function1 function13;
        androidx.compose.runtime.Q uniform;
        T.s sVar3;
        boolean z19;
        boolean z20;
        boolean z21;
        Function1 function14;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(1191646004);
        int i19 = i5 & 1;
        if (i19 != 0) {
            i10 = i4 | 6;
            sVar2 = sVar;
        } else if ((i4 & 6) == 0) {
            sVar2 = sVar;
            if (c0585q.golf(sVar2)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i10 = i11 | i4;
        } else {
            sVar2 = sVar;
            i10 = i4;
        }
        int i20 = i5 & 2;
        if (i20 != 0) {
            i10 |= 48;
        } else if ((i4 & 48) == 0) {
            z12 = z2;
            if (c0585q.hotel(z12)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i10 |= i12;
            i13 = i5 & 4;
            if (i13 == 0) {
                i10 |= 384;
            } else if ((i4 & 384) == 0) {
                z13 = z10;
                if (c0585q.hotel(z13)) {
                    i14 = Barcode.FORMAT_QR_CODE;
                } else {
                    i14 = 128;
                }
                i10 |= i14;
                i15 = i5 & 8;
                if (i15 != 0) {
                    i10 |= 3072;
                } else if ((i4 & 3072) == 0) {
                    z14 = z11;
                    if (c0585q.hotel(z14)) {
                        i16 = 2048;
                    } else {
                        i16 = Barcode.FORMAT_UPC_E;
                    }
                    i10 |= i16;
                    i17 = i5 & 16;
                    if (i17 == 0) {
                        i10 |= 24576;
                    } else if ((i4 & 24576) == 0) {
                        function12 = function1;
                        if (c0585q.india(function12)) {
                            i18 = Http2.INITIAL_MAX_FRAME_SIZE;
                        } else {
                            i18 = 8192;
                        }
                        i10 |= i18;
                        if ((i10 & 9363) != 9362) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        if (c0585q.magenta(i10 & 1, z15)) {
                            if (i19 != 0) {
                                sVar3 = T.p.alpha;
                            } else {
                                sVar3 = sVar2;
                            }
                            if (i20 != 0) {
                                z19 = false;
                            } else {
                                z19 = z12;
                            }
                            if (i13 != 0) {
                                z20 = true;
                            } else {
                                z20 = z13;
                            }
                            if (i15 != 0) {
                                z21 = false;
                            } else {
                                z21 = z14;
                            }
                            if (i17 != 0) {
                                Object jade = c0585q.jade();
                                if (jade == C0580l.alpha) {
                                    jade = new am(4);
                                    c0585q.f(jade);
                                }
                                function14 = (Function1) jade;
                            } else {
                                function14 = function12;
                            }
                            K1.charlie(androidx.compose.foundation.layout.V.charlie(sVar3, 1.0f), Db.a.bravo, null, K1.mike(0, 62), null, P.e.echo(1641270694, new ar(1, function14, z19, z20, z21), c0585q), c0585q, 196608, 20);
                            sVar2 = sVar3;
                            function13 = function14;
                            z16 = z19;
                            z17 = z20;
                            z18 = z21;
                        } else {
                            c0585q.ochre();
                            z16 = z12;
                            z17 = z13;
                            z18 = z14;
                            function13 = function12;
                        }
                        uniform = c0585q.uniform();
                        if (uniform != null) {
                            uniform.delta = new as(sVar2, z16, z17, z18, function13, i4, i5, 1);
                            return;
                        }
                        return;
                    }
                    function12 = function1;
                    if ((i10 & 9363) != 9362) {
                    }
                    if (c0585q.magenta(i10 & 1, z15)) {
                    }
                    uniform = c0585q.uniform();
                    if (uniform != null) {
                    }
                }
                z14 = z11;
                i17 = i5 & 16;
                if (i17 == 0) {
                }
                function12 = function1;
                if ((i10 & 9363) != 9362) {
                }
                if (c0585q.magenta(i10 & 1, z15)) {
                }
                uniform = c0585q.uniform();
                if (uniform != null) {
                }
            }
            z13 = z10;
            i15 = i5 & 8;
            if (i15 != 0) {
            }
            z14 = z11;
            i17 = i5 & 16;
            if (i17 == 0) {
            }
            function12 = function1;
            if ((i10 & 9363) != 9362) {
            }
            if (c0585q.magenta(i10 & 1, z15)) {
            }
            uniform = c0585q.uniform();
            if (uniform != null) {
            }
        }
        z12 = z2;
        i13 = i5 & 4;
        if (i13 == 0) {
        }
        z13 = z10;
        i15 = i5 & 8;
        if (i15 != 0) {
        }
        z14 = z11;
        i17 = i5 & 16;
        if (i17 == 0) {
        }
        function12 = function1;
        if ((i10 & 9363) != 9362) {
        }
        if (c0585q.magenta(i10 & 1, z15)) {
        }
        uniform = c0585q.uniform();
        if (uniform != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void uniform(T.s sVar, boolean z2, boolean z10, boolean z11, Function1 function1, InterfaceC0581m interfaceC0581m, int i4, int i5) {
        int i10;
        boolean z12;
        int i11;
        int i12;
        boolean z13;
        int i13;
        boolean z14;
        androidx.compose.runtime.Q uniform;
        boolean z15;
        int i14;
        int i15;
        int i16;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-84582592);
        if ((i4 & 6) == 0) {
            if (c0585q.golf(sVar)) {
                i16 = 4;
            } else {
                i16 = 2;
            }
            i10 = i16 | i4;
        } else {
            i10 = i4;
        }
        if ((i4 & 48) == 0) {
            if (c0585q.hotel(z2)) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i10 |= i15;
        }
        int i17 = i5 & 4;
        if (i17 != 0) {
            i10 |= 384;
        } else if ((i4 & 384) == 0) {
            z12 = z10;
            if (c0585q.hotel(z12)) {
                i11 = Barcode.FORMAT_QR_CODE;
            } else {
                i11 = 128;
            }
            i10 |= i11;
            i12 = i5 & 8;
            if (i12 == 0) {
                i10 |= 3072;
            } else if ((i4 & 3072) == 0) {
                z13 = z11;
                if (c0585q.hotel(z13)) {
                    i13 = 2048;
                } else {
                    i13 = Barcode.FORMAT_UPC_E;
                }
                i10 |= i13;
                if ((i4 & 24576) == 0) {
                    if (c0585q.india(function1)) {
                        i14 = Http2.INITIAL_MAX_FRAME_SIZE;
                    } else {
                        i14 = 8192;
                    }
                    i10 |= i14;
                }
                boolean z16 = true;
                if ((i10 & 9363) != 9362) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c0585q.magenta(i10 & 1, z14)) {
                    if (i17 == 0) {
                        z16 = z12;
                    }
                    z12 = z16;
                    if (i12 != 0) {
                        z15 = false;
                    } else {
                        z15 = z13;
                    }
                    z13 = z15;
                    K1.charlie(androidx.compose.foundation.layout.V.charlie(sVar, 1.0f), Db.a.bravo, null, K1.mike(0, 62), null, P.e.echo(-347173234, new ar(0, function1, z2, z12, z15), c0585q), c0585q, 196608, 20);
                } else {
                    c0585q.ochre();
                }
                boolean z17 = z13;
                uniform = c0585q.uniform();
                if (uniform != null) {
                    uniform.delta = new as(sVar, z2, z12, z17, function1, i4, i5, 0);
                    return;
                }
                return;
            }
            z13 = z11;
            if ((i4 & 24576) == 0) {
            }
            boolean z162 = true;
            if ((i10 & 9363) != 9362) {
            }
            if (c0585q.magenta(i10 & 1, z14)) {
            }
            boolean z172 = z13;
            uniform = c0585q.uniform();
            if (uniform != null) {
            }
        }
        z12 = z10;
        i12 = i5 & 8;
        if (i12 == 0) {
        }
        z13 = z11;
        if ((i4 & 24576) == 0) {
        }
        boolean z1622 = true;
        if ((i10 & 9363) != 9362) {
        }
        if (c0585q.magenta(i10 & 1, z14)) {
        }
        boolean z1722 = z13;
        uniform = c0585q.uniform();
        if (uniform != null) {
        }
    }

    public static final void victor(T.p pVar, boolean z2, Function1 function1, InterfaceC0581m interfaceC0581m, int i4) {
        boolean z10;
        boolean z11;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(697179184);
        int i5 = i4 | 438;
        if ((i5 & 147) != 146) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (c0585q.magenta(i5 & 1, z10)) {
            pVar = T.p.alpha;
            Object jade = c0585q.jade();
            if (jade == C0580l.alpha) {
                jade = new am(1);
                c0585q.f(jade);
            }
            function1 = (Function1) jade;
            K1.charlie(androidx.compose.foundation.layout.V.charlie(pVar, 1.0f), Db.a.bravo, null, K1.mike(0, 62), null, P.e.echo(-416451330, new an(0, function1), c0585q), c0585q, 196608, 20);
            z11 = true;
        } else {
            c0585q.ochre();
            z11 = z2;
        }
        T.p pVar2 = pVar;
        Function1 function12 = function1;
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new ao(pVar2, z11, function12, i4, 0);
        }
    }

    public static final void whiskey(T.p pVar, boolean z2, Function1 function1, Function0 function0, InterfaceC0581m interfaceC0581m, int i4) {
        boolean z10;
        Function1 function12;
        Function0 function02;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-897662931);
        int i5 = i4 | 3510;
        boolean z11 = true;
        if ((i5 & 1171) != 1170) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (c0585q.magenta(i5 & 1, z10)) {
            pVar = T.p.alpha;
            Object obj = C0580l.alpha;
            Object jade = c0585q.jade();
            if (jade == obj) {
                jade = new am(2);
                c0585q.f(jade);
            }
            function12 = (Function1) jade;
            Object jade2 = c0585q.jade();
            if (jade2 == obj) {
                jade2 = new F4.h(21);
                c0585q.f(jade2);
            }
            Function0 function03 = (Function0) jade2;
            K1.charlie(androidx.compose.foundation.layout.V.charlie(pVar, 1.0f), Db.a.bravo, null, K1.mike(0, 62), null, P.e.echo(-448038241, new ap(0, function03, function12), c0585q), c0585q, 196608, 20);
            function02 = function03;
        } else {
            c0585q.ochre();
            z11 = z2;
            function12 = function1;
            function02 = function0;
        }
        T.p pVar2 = pVar;
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new aq(pVar2, z11, function12, function02, i4, 0);
        }
    }

    public static final void xray(int i4, int i5, T.s sVar, InterfaceC0581m interfaceC0581m, String str, Function0 function0) {
        int i10;
        int i11;
        int i12;
        boolean z2;
        int i13;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(313083000);
        int i14 = i5 & 1;
        if (i14 != 0) {
            i10 = i4 | 6;
        } else if ((i4 & 6) == 0) {
            if (c0585q.golf(sVar)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i10 = i11 | i4;
        } else {
            i10 = i4;
        }
        if ((i4 & 48) == 0) {
            if (c0585q.golf(str)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i10 |= i13;
        }
        int i15 = i5 & 4;
        if (i15 != 0) {
            i10 |= 384;
        } else if ((i4 & 384) == 0) {
            if (c0585q.india(function0)) {
                i12 = Barcode.FORMAT_QR_CODE;
            } else {
                i12 = 128;
            }
            i10 |= i12;
        }
        if ((i10 & 147) != 146) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i10 & 1, z2)) {
            if (i14 != 0) {
                sVar = T.p.alpha;
            }
            if (i15 != 0) {
                Object jade = c0585q.jade();
                if (jade == C0580l.alpha) {
                    jade = new F4.h(23);
                    c0585q.f(jade);
                }
                function0 = (Function0) jade;
            }
            K1.charlie(androidx.compose.foundation.layout.V.charlie(sVar, 1.0f), Db.a.bravo, null, K1.mike(0, 62), null, P.e.echo(1619080262, new Ec.q(function0, str), c0585q), c0585q, 196608, 20);
        } else {
            c0585q.ochre();
        }
        T.s sVar2 = sVar;
        Function0 function02 = function0;
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new at(sVar2, str, function02, i4, i5);
        }
    }

    public static final void yankee(String str, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        boolean z2;
        int i10;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(1855937024);
        if ((i4 & 6) == 0) {
            if (c0585q.golf(str)) {
                i10 = 4;
            } else {
                i10 = 2;
            }
            i5 = i4 | i10;
        } else {
            i5 = i4;
        }
        if ((i5 & 3) != 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i5 & 1, z2)) {
            T.p pVar = T.p.alpha;
            float f5 = 8;
            float f10 = 12;
            T.s sierra = AbstractC0538d.sierra(androidx.compose.foundation.a.bravo(R3.charlie(androidx.compose.foundation.layout.V.charlie(pVar, 1.0f), 1, ax.foxtrot, AbstractC2094g.bravo(f5)), ax.echo, AbstractC2094g.bravo(f5)), f10);
            androidx.compose.foundation.layout.S alpha2 = androidx.compose.foundation.layout.Q.alpha(AbstractC0542h.golf(f10), T.d.f2060c, c0585q, 54);
            long j5 = c0585q.magenta;
            int i11 = (int) (j5 ^ (j5 >>> 32));
            androidx.compose.runtime.I mike = c0585q.mike();
            T.s charlie2 = T.a.charlie(sierra, c0585q);
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
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i11))) {
                ao.ad.blue(i11, c0585q, i11, c2549i);
            }
            C0564b.blue(C2551k.delta, c0585q, charlie2);
            AbstractC1680b charlie3 = AbstractC3076w3.charlie(R.drawable.information_line, c0585q, 6);
            long j6 = ax.golf;
            AbstractC0141o0.alpha(charlie3, null, AbstractC0538d.whiskey(androidx.compose.foundation.layout.V.kilo(pVar, 16), 0.0f, 2, 0.0f, 0.0f, 13), j6, c0585q, 3504, 0);
            G2.bravo(str, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, new D0.an(j6, AbstractC2636d7.charlie(13), new H0.v(HttpConstants.HTTP_BAD_REQUEST), null, Db.g.alpha, 0L, 0, AbstractC2636d7.charlie(20), 0, 16646104), c0585q, i5 & 14, 0, 65534);
            c0585q = c0585q;
            c0585q.quebec(true);
        } else {
            c0585q.ochre();
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new K(str, i4, 0);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:92:0x0234, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r8.jade(), java.lang.Integer.valueOf(r0)) == false) goto L144;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void zulu(final String phoneNumber, final Integer num, final String pin, final Function1 onPinChange, final Function1 onVerify, final Function0 onDismiss, String str, String str2, String str3, boolean z2, String str4, T.p pVar, InterfaceC0581m interfaceC0581m, final int i4, final int i5, final int i10) {
        int i11;
        String str5;
        String str6;
        String str7;
        int i12;
        int i13;
        final String str8;
        final String str9;
        final String str10;
        final T.p pVar2;
        C0585q c0585q;
        final String str11;
        final boolean z10;
        float f5;
        String str12;
        H0.n nVar;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        Intrinsics.echo(phoneNumber, "phoneNumber");
        Intrinsics.echo(pin, "pin");
        Intrinsics.echo(onPinChange, "onPinChange");
        Intrinsics.echo(onVerify, "onVerify");
        Intrinsics.echo(onDismiss, "onDismiss");
        C0585q c0585q2 = (C0585q) interfaceC0581m;
        c0585q2.silver(-648474852);
        if ((i4 & 6) == 0) {
            i11 = i4 | (c0585q2.golf(phoneNumber) ? 4 : 2);
        } else {
            i11 = i4;
        }
        if ((i4 & 48) == 0) {
            i11 |= c0585q2.golf(num) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i11 |= c0585q2.golf(pin) ? 256 : 128;
        }
        if ((i4 & 3072) == 0) {
            i11 |= c0585q2.india(onPinChange) ? 2048 : Barcode.FORMAT_UPC_E;
        }
        if ((i4 & 24576) == 0) {
            i11 |= c0585q2.india(onVerify) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        int i14 = i10 & 64;
        if (i14 != 0) {
            i11 |= 1572864;
            str5 = str;
        } else {
            str5 = str;
            if ((i4 & 1572864) == 0) {
                i11 |= c0585q2.golf(str5) ? 1048576 : 524288;
            }
        }
        int i15 = 128 & i10;
        if (i15 != 0) {
            i11 |= 12582912;
            str6 = str2;
        } else {
            str6 = str2;
            if ((i4 & 12582912) == 0) {
                i11 |= c0585q2.golf(str6) ? 8388608 : 4194304;
            }
        }
        int i16 = i10 & Barcode.FORMAT_QR_CODE;
        if (i16 != 0) {
            i11 |= 100663296;
            str7 = str3;
        } else {
            str7 = str3;
            if ((i4 & 100663296) == 0) {
                i11 |= c0585q2.golf(str7) ? 67108864 : 33554432;
            }
        }
        int i17 = i10 & 512;
        int i18 = i11 | (i17 != 0 ? 805306368 : c0585q2.hotel(z2) ? 536870912 : 268435456);
        int i19 = 1024 & i10;
        if (i19 != 0) {
            i12 = i19;
            i13 = 6;
        } else if ((i5 & 6) == 0) {
            i12 = i19;
            i13 = i5 | (c0585q2.golf(str4) ? 4 : 2);
        } else {
            i12 = i19;
            i13 = i5;
        }
        int i20 = i13 | 48;
        if (c0585q2.magenta(i18 & 1, ((i18 & 306717843) == 306717842 && (i20 & 19) == 18) ? false : true)) {
            String str13 = i14 != 0 ? null : str5;
            String str14 = i15 != 0 ? null : str6;
            String str15 = i16 != 0 ? null : str7;
            boolean z15 = i17 != 0 ? false : z2;
            String str16 = i12 != 0 ? null : str4;
            T.p pVar3 = T.p.alpha;
            Object jade = c0585q2.jade();
            androidx.compose.runtime.as asVar = C0580l.alpha;
            if (jade == asVar) {
                jade = new Y.s();
                c0585q2.f(jade);
            }
            Y.s sVar = (Y.s) jade;
            int i21 = i18 & 896;
            boolean z16 = (i21 == 256) | ((i18 & 57344) == 16384);
            Object jade2 = c0585q2.jade();
            if (z16 || jade2 == asVar) {
                jade2 = new L(pin, onVerify, null);
                c0585q2.f(jade2);
            }
            C0564b.foxtrot((Xd.l) jade2, c0585q2, pin);
            boolean z17 = i21 == 256;
            Object jade3 = c0585q2.jade();
            if (z17 || jade3 == asVar) {
                jade3 = new M(pin, sVar, null);
                c0585q2.f(jade3);
            }
            C0564b.foxtrot((Xd.l) jade3, c0585q2, pin);
            float f10 = 16;
            float f11 = 24;
            T.s victor = AbstractC0538d.victor(androidx.compose.foundation.layout.V.charlie(pVar3, 1.0f), f10, f10, f10, f11);
            C0554u alpha2 = AbstractC0553t.alpha(AbstractC0542h.golf(f10), T.d.f2062f, c0585q2, 54);
            long j5 = c0585q2.magenta;
            int i22 = (int) (j5 ^ (j5 >>> 32));
            androidx.compose.runtime.I mike = c0585q2.mike();
            T.s charlie2 = T.a.charlie(victor, c0585q2);
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
            String str17 = str16;
            if (c0585q2.lime) {
                f5 = f11;
            } else {
                f5 = f11;
            }
            ao.ad.blue(i22, c0585q2, i22, c2549i3);
            C2549i c2549i4 = C2551k.delta;
            C0564b.blue(c2549i4, c0585q2, charlie2);
            String str18 = str13 == null ? "" : str13;
            long charlie3 = AbstractC2636d7.charlie(22);
            H0.n nVar2 = Db.g.alpha;
            H0.v vVar = new H0.v(700);
            long j6 = ax.bravo;
            G2.bravo(str18, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, new D0.an(j6, charlie3, vVar, null, nVar2, 0L, 0, 0L, 0, 16777176), c0585q2, 0, 0, 65534);
            T.s charlie4 = androidx.compose.foundation.layout.V.charlie(pVar3, 1.0f);
            String str19 = str15;
            C0554u alpha3 = AbstractC0553t.alpha(AbstractC0542h.golf(4), T.d.f2063g, c0585q2, 54);
            String str20 = str13;
            long j7 = c0585q2.magenta;
            int i23 = (int) (j7 ^ (j7 >>> 32));
            androidx.compose.runtime.I mike2 = c0585q2.mike();
            T.s charlie5 = T.a.charlie(charlie4, c0585q2);
            c0585q2.white();
            if (c0585q2.lime) {
                c0585q2.lima(c2550j);
            } else {
                c0585q2.i();
            }
            C0564b.blue(c2549i, c0585q2, alpha3);
            C0564b.blue(c2549i2, c0585q2, mike2);
            if (c0585q2.lime || !Intrinsics.areEqual(c0585q2.jade(), Integer.valueOf(i23))) {
                ao.ad.blue(i23, c0585q2, i23, c2549i3);
            }
            C0564b.blue(c2549i4, c0585q2, charlie5);
            G2.bravo(str14 == null ? "" : str14, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, new D0.an(j6, AbstractC2636d7.charlie(16), new H0.v(700), null, nVar2, 0L, 0, 0L, 0, 16777176), c0585q2, 0, 0, 65534);
            String oscar = kotlin.text.r.oscar(str19 == null ? "" : str19, Constants.EMBOLDEN_PLACEHOLDER, phoneNumber);
            long charlie6 = AbstractC2636d7.charlie(14);
            H0.v vVar2 = new H0.v(HttpConstants.HTTP_BAD_REQUEST);
            long j10 = ax.kilo;
            G2.bravo(oscar, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, new D0.an(j10, charlie6, vVar2, null, nVar2, 0L, 0, 0L, 0, 16777176), c0585q2, 0, 0, 65534);
            if (str17 != null && !StringsKt.gray(str17)) {
                c0585q2.purple(673108701);
                nVar = nVar2;
                G2.bravo(str17, androidx.compose.foundation.layout.V.charlie(pVar3, 1.0f), 0L, 0L, null, null, 0L, new O0.k(3), 0L, 0, false, 0, 0, null, new D0.an(ax.hotel, AbstractC2636d7.charlie(13), null, null, nVar2, 0L, 0, 0L, 0, 16777180), c0585q2, (i20 & 14) | 48, 0, 65020);
                str12 = str17;
                z11 = false;
            } else {
                str12 = str17;
                nVar = nVar2;
                z11 = false;
                c0585q2.purple(660511386);
            }
            c0585q2.quebec(z11);
            c0585q2.quebec(true);
            T.s alpha4 = androidx.compose.ui.focus.a.alpha(androidx.compose.foundation.layout.V.charlie(pVar3, 1.0f), sVar);
            int i24 = i18 >> 3;
            float f12 = f5;
            pVar2 = pVar3;
            A7.echo(6, pin, onPinChange, alpha4, !z15, c0585q2, (i24 & 112) | 6 | (i24 & 896), 0);
            if (num != null) {
                c0585q2.purple(411387751);
                G2.bravo(AbstractC3086y3.alpha(R.string.stc_otp_tries_left, new Object[]{num}, c0585q2), androidx.compose.foundation.layout.V.charlie(pVar2, 1.0f), 0L, 0L, null, null, 0L, new O0.k(3), 0L, 0, false, 0, 0, null, new D0.an(num.intValue() <= 1 ? ax.hotel : j10, AbstractC2636d7.charlie(13), null, null, nVar, 0L, 0, 0L, 0, 16777180), c0585q2, 48, 0, 65020);
                z12 = false;
            } else {
                z12 = false;
                c0585q2.purple(397971664);
            }
            c0585q2.quebec(z12);
            if (z15) {
                c0585q2.purple(411893764);
                T.s charlie7 = androidx.compose.foundation.layout.V.charlie(pVar2, 1.0f);
                q0.ap delta2 = AbstractC0547m.delta(T.d.teal, z12);
                long j11 = c0585q2.magenta;
                int i25 = (int) (j11 ^ (j11 >>> 32));
                androidx.compose.runtime.I mike3 = c0585q2.mike();
                T.s charlie8 = T.a.charlie(charlie7, c0585q2);
                c0585q2.white();
                if (c0585q2.lime) {
                    c0585q2.lima(c2550j);
                } else {
                    c0585q2.i();
                }
                C0564b.blue(c2549i, c0585q2, delta2);
                C0564b.blue(c2549i2, c0585q2, mike3);
                if (c0585q2.lime || !Intrinsics.areEqual(c0585q2.jade(), Integer.valueOf(i25))) {
                    ao.ad.blue(i25, c0585q2, i25, c2549i3);
                }
                C0564b.blue(c2549i4, c0585q2, charlie8);
                G1.bravo(androidx.compose.foundation.layout.V.kilo(pVar2, f12), ax.charlie, 2, 0L, 0, c0585q2, 438, 24);
                z14 = true;
                c0585q2.quebec(true);
                z13 = false;
            } else {
                z13 = z12;
                z14 = true;
                c0585q2.purple(397971664);
            }
            c0585q2.quebec(z13);
            c0585q2.quebec(z14);
            c0585q = c0585q2;
            str8 = str19;
            str10 = str12;
            str11 = str14;
            z10 = z15;
            str9 = str20;
        } else {
            c0585q2.ochre();
            String str21 = str5;
            str8 = str7;
            str9 = str21;
            str10 = str4;
            pVar2 = pVar;
            c0585q = c0585q2;
            str11 = str6;
            z10 = z2;
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new Xd.l() { // from class: Lb.J
                @Override // Xd.l
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int cyan = C0564b.cyan(i4 | 1);
                    int cyan2 = C0564b.cyan(i5);
                    T.p pVar4 = pVar2;
                    int i26 = i10;
                    AbstractC0220c.zulu(phoneNumber, num, pin, onPinChange, onVerify, onDismiss, str9, str11, str8, z10, str10, pVar4, (InterfaceC0581m) obj, cyan, cyan2, i26);
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
