package t6;

import Yb.C0329s0;
import androidx.compose.foundation.layout.AbstractC0538d;
import androidx.compose.foundation.layout.AbstractC0542h;
import androidx.compose.foundation.layout.AbstractC0547m;
import androidx.compose.foundation.layout.AbstractC0553t;
import androidx.compose.foundation.layout.C0537c;
import androidx.compose.foundation.layout.C0554u;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import cb.EnumC0843h;
import com.app.network.network.models.Country;
import com.app.network.network.models.Currency;
import com.app.network.network.models.LanguageMetaData;
import com.app.network.network.models.Order;
import com.app.network.network.models.OrderAsset;
import com.app.network.network.models.OrderStatus;
import com.app.network.network.models.OrderTask;
import com.app.network.network.models.PaymentType;
import com.app.network.network.models.Platform;
import com.app.network.network.models.TaskStatus;
import com.app.network.network.models.TaskType;
import com.google.mlkit.vision.barcode.common.Barcode;
import delivery.samurai.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import k.C1990b;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import ob.AbstractC2213f;
import okhttp3.internal.http2.Http2;
import s0.C2549i;
import s0.C2550j;
import s0.C2551k;
import s0.InterfaceC2552l;
import s6.AbstractC2772t0;
import s6.J4;
import t6.AbstractC3050r2;

/* renamed from: t6.r2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3050r2 {
    public static final void alpha(androidx.compose.runtime.ax axVar, androidx.compose.runtime.ax axVar2, int i4, int i5, Integer num, String str, InterfaceC0581m interfaceC0581m, int i10) {
        androidx.compose.runtime.ax axVar3;
        int i11;
        androidx.compose.runtime.ax axVar4;
        boolean z2;
        C0585q c0585q;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        EnumC0843h enumC0843h = EnumC0843h.alpha;
        C0585q c0585q2 = (C0585q) interfaceC0581m;
        c0585q2.silver(1112314101);
        if ((i10 & 6) == 0) {
            axVar3 = axVar;
            if (c0585q2.golf(axVar3)) {
                i19 = 4;
            } else {
                i19 = 2;
            }
            i11 = i19 | i10;
        } else {
            axVar3 = axVar;
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            axVar4 = axVar2;
            if (c0585q2.golf(axVar4)) {
                i18 = 32;
            } else {
                i18 = 16;
            }
            i11 |= i18;
        } else {
            axVar4 = axVar2;
        }
        if ((i10 & 384) == 0) {
            if (c0585q2.echo(i4)) {
                i17 = Barcode.FORMAT_QR_CODE;
            } else {
                i17 = 128;
            }
            i11 |= i17;
        }
        if ((i10 & 3072) == 0) {
            if (c0585q2.echo(i5)) {
                i16 = 2048;
            } else {
                i16 = Barcode.FORMAT_UPC_E;
            }
            i11 |= i16;
        }
        if ((i10 & 24576) == 0) {
            if (c0585q2.golf(num)) {
                i15 = Http2.INITIAL_MAX_FRAME_SIZE;
            } else {
                i15 = 8192;
            }
            i11 |= i15;
        }
        if ((196608 & i10) == 0) {
            if (c0585q2.echo(1)) {
                i14 = 131072;
            } else {
                i14 = 65536;
            }
            i11 |= i14;
        }
        if ((1572864 & i10) == 0) {
            if (c0585q2.golf(str)) {
                i13 = 1048576;
            } else {
                i13 = 524288;
            }
            i11 |= i13;
        }
        if ((599187 & i11) != 599186) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q2.magenta(i11 & 1, z2)) {
            if (i5 < 1) {
                i12 = 1;
            } else {
                i12 = i5;
            }
            c0585q = c0585q2;
            eb.g.alpha(i4, i12, num, (String) axVar3.getValue(), (String) axVar4.getValue(), enumC0843h, null, str, c0585q, ((i11 >> 6) & 910) | (458752 & i11) | ((i11 << 6) & 234881024));
        } else {
            c0585q = c0585q2;
            c0585q.ochre();
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new Lb.ab(axVar3, axVar4, i4, i5, num, str, i10);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:200:0x045b, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r11.jade(), java.lang.Integer.valueOf(r8)) == false) goto L238;
     */
    /* JADX WARN: Code restructure failed: missing block: B:287:0x0652, code lost:
    
        if (r5.getTaskStatus() == r15) goto L308;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0392  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x03f4  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0434  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x044d  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0470  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x04f6  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0532  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x05c1  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x065b  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0673  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x067a  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x06b6  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x072e  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0756  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x06c0  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0689  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0660  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x0551  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x04fc  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0472  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x045e  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x0438  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x03fb  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x03ec A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:319:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x02d2  */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v16, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v50, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r82v1 */
    /* JADX WARN: Type inference failed for: r82v2 */
    /* JADX WARN: Type inference failed for: r82v3 */
    /* JADX WARN: Type inference failed for: r8v39, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v20, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void bravo(final Order order, final Map notesByTaskId, final Map expandedByTaskId, final Map map, final androidx.compose.runtime.ax timerTextState, final androidx.compose.runtime.ax timerLabelState, final int i4, final int i5, final Integer num, final C0329s0 c0329s0, final Function1 onCallCustomer, final String str, T.p pVar, final Set set, final Xd.l lVar, final Function1 function1, final Function1 function12, final androidx.compose.runtime.D0 d02, final int i10, final Function0 function0, final Function0 function02, final androidx.compose.runtime.D0 d03, final androidx.compose.runtime.D0 d04, final androidx.compose.runtime.D0 d05, Function1 function13, InterfaceC0581m interfaceC0581m, final int i11) {
        final T.p pVar2;
        final Function1 function14;
        C0585q c0585q;
        int i12;
        X9.i iVar;
        boolean z2;
        Integer valueOf;
        String bravo;
        Integer valueOf2;
        String str2;
        String bravo2;
        List<LanguageMetaData> currentLanguageMetaData;
        ?? emptyList;
        Iterator it;
        int i13;
        LanguageMetaData languageMetaData;
        C2549i c2549i;
        boolean bravo3;
        String str3;
        C0585q c0585q2;
        int i14;
        Function0 function03;
        boolean z10;
        boolean z11;
        int size;
        int i15;
        boolean india;
        androidx.compose.runtime.ax axVar;
        Object obj;
        Object jade;
        Object obj2;
        int i16;
        T.p pVar3;
        boolean z12;
        int i17;
        Country country;
        Currency currency;
        Map map2 = map;
        Intrinsics.echo(notesByTaskId, "notesByTaskId");
        Intrinsics.echo(expandedByTaskId, "expandedByTaskId");
        Intrinsics.echo(timerTextState, "timerTextState");
        Intrinsics.echo(timerLabelState, "timerLabelState");
        Intrinsics.echo(onCallCustomer, "onCallCustomer");
        C0585q c0585q3 = (C0585q) interfaceC0581m;
        c0585q3.silver(2121438303);
        boolean z13 = true;
        int i18 = i11 | (c0585q3.india(order) ? 4 : 2) | (c0585q3.india(notesByTaskId) ? 32 : 16) | (c0585q3.india(expandedByTaskId) ? 256 : 128);
        boolean india2 = c0585q3.india(map2);
        int i19 = Barcode.FORMAT_UPC_E;
        int i20 = i18 | (india2 ? 2048 : 1024) | (c0585q3.golf(timerTextState) ? 16384 : 8192) | (c0585q3.golf(timerLabelState) ? 131072 : 65536) | (c0585q3.echo(i4) ? 1048576 : 524288) | (c0585q3.echo(i5) ? 8388608 : 4194304) | (c0585q3.golf(num) ? 67108864 : 33554432) | (c0585q3.golf(c0329s0) ? 536870912 : 268435456);
        int i21 = (c0585q3.india(onCallCustomer) ? 4 : 2) | (c0585q3.golf(str) ? 32 : 16) | 384 | (c0585q3.india(set) ? 2048 : 1024) | (c0585q3.india(lVar) ? 16384 : 8192) | (c0585q3.india(function1) ? 131072 : 65536) | (c0585q3.india(function12) ? 1048576 : 524288) | (c0585q3.golf(d02) ? 8388608 : 4194304) | (c0585q3.echo(i10) ? 67108864 : 33554432) | (c0585q3.india(function0) ? 536870912 : 268435456);
        int i22 = (c0585q3.india(function02) ? 4 : 2) | (c0585q3.golf(d03) ? 32 : 16) | (c0585q3.golf(d04) ? 256 : 128);
        if (c0585q3.golf(d05)) {
            i19 = 2048;
        }
        int i23 = i22 | i19 | 24576;
        if (c0585q3.magenta(i20 & 1, ((i20 & 306783379) == 306783378 && (i21 & 306783379) == 306783378 && (i23 & 9363) == 9362) ? false : true)) {
            T.p pVar4 = T.p.alpha;
            androidx.compose.runtime.as asVar = C0580l.alpha;
            ?? jade2 = c0585q3.jade();
            if (jade2 == asVar) {
                i12 = i23;
                X9.i iVar2 = new X9.i(17);
                c0585q3.f(iVar2);
                iVar = iVar2;
            } else {
                i12 = i23;
                iVar = jade2;
            }
            X9.i iVar3 = iVar;
            Integer num2 = d02 != null ? (Integer) ((androidx.compose.runtime.t0) d02).getValue() : null;
            int i24 = 7;
            boolean booleanValue = d03 != null ? ((Boolean) ((androidx.compose.runtime.t0) d03).getValue()).booleanValue() : false;
            double doubleValue = d04 != null ? ((Number) ((androidx.compose.runtime.t0) d04).getValue()).doubleValue() : 0.0d;
            double doubleValue2 = d05 != null ? ((Number) ((androidx.compose.runtime.t0) d05).getValue()).doubleValue() : 0.0d;
            List<OrderTask> tasks = order.getTasks();
            if (tasks == null) {
                tasks = CollectionsKt.emptyList();
            }
            Function1 function15 = iVar3;
            List p4 = CollectionsKt.p(tasks, new Sb.k(i24));
            Object jade3 = c0585q3.jade();
            Object obj3 = jade3;
            if (jade3 == asVar) {
                androidx.compose.runtime.ax zulu = C0564b.zulu(null);
                c0585q3.f(zulu);
                obj3 = zulu;
            }
            androidx.compose.runtime.ax axVar2 = (androidx.compose.runtime.ax) obj3;
            int intValue = (num != null ? num.intValue() : 1) - 1;
            int size2 = p4.size() - 1;
            int delta = J4.delta(intValue, 0, size2 < 0 ? 0 : size2);
            OrderTask orderTask = (OrderTask) CollectionsKt.jade(delta, p4);
            if ((orderTask != null ? orderTask.getTaskType() : null) != TaskType.PICK_UP) {
                if ((orderTask != null ? orderTask.getTaskType() : null) != TaskType.ON_DEMAND_PICK_UP) {
                    z2 = false;
                    if (!p4.isEmpty()) {
                        Iterator it2 = p4.iterator();
                        while (it2.hasNext()) {
                            OrderTask orderTask2 = (OrderTask) it2.next();
                            Iterator it3 = it2;
                            if ((orderTask2.getTaskType() == TaskType.PICK_UP || orderTask2.getTaskType() == TaskType.ON_DEMAND_PICK_UP) && orderTask2.getTaskStatus() != TaskStatus.COMPLETED) {
                                break;
                            } else {
                                it2 = it3;
                            }
                        }
                    }
                    Float earnings = order.getEarnings();
                    String bravo4 = earnings == null ? Q2.bravo(earnings.floatValue()) : null;
                    Platform platform = order.getPlatform();
                    String symbol = (platform != null || (country = platform.getCountry()) == null || (currency = country.getCurrency()) == null) ? null : currency.getSymbol();
                    Double distanceInKm = order.getDistanceInKm();
                    String d4 = distanceInKm == null ? distanceInKm.toString() : null;
                    PaymentType paymentType = order.getPaymentType();
                    valueOf = paymentType == null ? Integer.valueOf(paymentType.getType()) : null;
                    if (valueOf != null) {
                        c0585q3.purple(-671894424);
                        c0585q3.quebec(false);
                        bravo = null;
                    } else {
                        c0585q3.purple(-671894423);
                        bravo = AbstractC3086y3.bravo(c0585q3, valueOf.intValue());
                        c0585q3.quebec(false);
                    }
                    String str4 = bravo != null ? "" : bravo;
                    OrderStatus orderStatusEnum = order.getOrderStatusEnum();
                    valueOf2 = orderStatusEnum == null ? Integer.valueOf(orderStatusEnum.getToString()) : null;
                    if (valueOf2 != null) {
                        c0585q3.purple(-671787288);
                        c0585q3.quebec(false);
                        str2 = symbol;
                        bravo2 = null;
                    } else {
                        str2 = symbol;
                        c0585q3.purple(-671787287);
                        bravo2 = AbstractC3086y3.bravo(c0585q3, valueOf2.intValue());
                        c0585q3.quebec(false);
                    }
                    String str5 = (bravo2 == null || (bravo2 = order.getStatus()) != null) ? bravo2 : "";
                    List<OrderAsset> assets = order.getAssets();
                    int size3 = assets == null ? assets.size() : 0;
                    currentLanguageMetaData = order.getCurrentLanguageMetaData();
                    if (currentLanguageMetaData == null) {
                        emptyList = new ArrayList();
                        for (Object obj4 : currentLanguageMetaData) {
                            if (((LanguageMetaData) obj4).getTaskId() == null) {
                                emptyList.add(obj4);
                            }
                        }
                    } else {
                        emptyList = CollectionsKt.emptyList();
                    }
                    List list = emptyList;
                    it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            i13 = delta;
                            languageMetaData = null;
                            break;
                        }
                        ?? next = it.next();
                        i13 = delta;
                        String label = ((LanguageMetaData) next).getLabel();
                        Iterator it4 = it;
                        if (label != null) {
                            boolean z14 = z13;
                            if (StringsKt.beige(label, "integration", z14) == z14) {
                                languageMetaData = next;
                                break;
                            }
                        }
                        it = it4;
                        delta = i13;
                        z13 = true;
                    }
                    LanguageMetaData languageMetaData2 = languageMetaData;
                    String data = languageMetaData2 == null ? languageMetaData2.getData() : null;
                    float f5 = 16;
                    T.s uniform = AbstractC0538d.uniform(androidx.compose.foundation.layout.V.charlie(pVar4, 1.0f), f5, 0.0f, 2);
                    C0537c c0537c = AbstractC0542h.charlie;
                    T.i iVar4 = T.d.f2062f;
                    C0554u alpha = AbstractC0553t.alpha(c0537c, iVar4, c0585q3, 0);
                    long j5 = c0585q3.magenta;
                    int i25 = (int) (j5 ^ (j5 >>> 32));
                    androidx.compose.runtime.I mike = c0585q3.mike();
                    T.s charlie = T.a.charlie(uniform, c0585q3);
                    InterfaceC2552l.maroon.getClass();
                    C2550j c2550j = C2551k.bravo;
                    c0585q3.white();
                    if (!c0585q3.lime) {
                        c0585q3.lima(c2550j);
                    } else {
                        c0585q3.i();
                    }
                    C2549i c2549i2 = C2551k.foxtrot;
                    C0564b.blue(c2549i2, c0585q3, alpha);
                    C2549i c2549i3 = C2551k.echo;
                    C0564b.blue(c2549i3, c0585q3, mike);
                    C2549i c2549i4 = C2551k.golf;
                    if (c0585q3.lime) {
                        c2549i = c2549i2;
                    } else {
                        c2549i = c2549i2;
                    }
                    ao.ad.blue(i25, c0585q3, i25, c2549i4);
                    C2549i c2549i5 = C2551k.delta;
                    C0564b.blue(c2549i5, c0585q3, charlie);
                    bravo3 = AbstractC2772t0.bravo(c0585q3);
                    int i26 = i5 >= 1 ? 1 : i5;
                    EnumC0843h enumC0843h = EnumC0843h.alpha;
                    if (!bravo3 && Intrinsics.areEqual(order.getIsHybrid(), Boolean.TRUE)) {
                        str3 = Q0.c.oscar(c0585q3, -661040541, R.string.multiple_store_pickups, c0585q3, false);
                    } else {
                        c0585q3.purple(-660951820);
                        c0585q3.quebec(false);
                        str3 = null;
                    }
                    int i27 = i20 >> 12;
                    int i28 = (i27 & 57344) | (i27 & 896) | (i27 & 14) | 196608 | (i27 & 112);
                    androidx.compose.runtime.ax axVar3 = axVar2;
                    c0585q2 = c0585q3;
                    C2549i c2549i6 = c2549i;
                    ?? r82 = 1;
                    int i29 = i13;
                    alpha(timerTextState, timerLabelState, i4, i26, num, str3, c0585q2, i28);
                    T.s charlie2 = androidx.compose.foundation.layout.V.charlie(pVar4, 1.0f);
                    C0554u alpha2 = AbstractC0553t.alpha(AbstractC0542h.golf(0), iVar4, c0585q2, 6);
                    long j6 = c0585q2.magenta;
                    i14 = (int) (j6 ^ (j6 >>> 32));
                    androidx.compose.runtime.I mike2 = c0585q2.mike();
                    T.s charlie3 = T.a.charlie(charlie2, c0585q2);
                    c0585q2.white();
                    if (!c0585q2.lime) {
                        c0585q2.lima(c2550j);
                    } else {
                        c0585q2.i();
                    }
                    C0564b.blue(c2549i6, c0585q2, alpha2);
                    C0564b.blue(c2549i3, c0585q2, mike2);
                    if (!c0585q2.lime || !Intrinsics.areEqual(c0585q2.jade(), Integer.valueOf(i14))) {
                        ao.ad.blue(i14, c0585q2, i14, c2549i4);
                    }
                    C0564b.blue(c2549i5, c0585q2, charlie3);
                    T.s hotel = com.google.android.material.datepicker.j.hotel(pVar4, f5, c0585q2, pVar4, 1.0f);
                    float f10 = 8;
                    if (function0 != null) {
                        c0585q2.purple(107805229);
                        ?? jade4 = c0585q2.jade();
                        Vc.i iVar5 = jade4;
                        if (jade4 == asVar) {
                            Vc.i iVar6 = new Vc.i(19);
                            c0585q2.f(iVar6);
                            iVar5 = iVar6;
                        }
                        c0585q2.quebec(false);
                        function03 = iVar5;
                    } else {
                        c0585q2.purple(1111855594);
                        c0585q2.quebec(false);
                        function03 = function0;
                    }
                    s6.F0.alpha(hotel, f10, bravo4, str2, d4, null, null, null, null, str4, null, str5, size3, function03, data, function02, null, booleanValue, c0585q2, 54, (i12 << 15) & 458752);
                    AbstractC0538d.echo(androidx.compose.foundation.layout.V.echo(pVar4, 6), c0585q2);
                    Long l10 = null;
                    boolean z15 = false;
                    Zb.d.golf(list, null, c0585q2, 0);
                    r.alpha(com.google.android.material.datepicker.j.juliet(pVar4, f5, c0585q2, R.string.tasks_list, c0585q2), androidx.compose.foundation.layout.V.charlie(pVar4, 1.0f), 0L, 0.0f, null, 0L, c0585q2, 48, 60);
                    AbstractC0538d.echo(androidx.compose.foundation.layout.V.echo(pVar4, 12), c0585q2);
                    c0585q2.purple(1111877587);
                    int i30 = 0;
                    C0585q c0585q4 = c0585q2;
                    for (Object obj5 : p4) {
                        int i31 = i30 + 1;
                        if (i30 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        OrderTask orderTask3 = (OrderTask) obj5;
                        boolean z16 = i30 == i29 ? r82 : z15 ? 1 : 0;
                        TaskStatus taskStatus = orderTask3.getTaskStatus();
                        TaskStatus taskStatus2 = TaskStatus.CANCELLED;
                        if (taskStatus == taskStatus2 || z16 == 0 || orderTask3.getTaskStatus() == TaskStatus.COMPLETED) {
                            z10 = z15 ? 1 : 0;
                            z11 = z15;
                        } else {
                            z10 = z15 ? 1 : 0;
                            z11 = r82;
                        }
                        boolean z17 = (orderTask3.getTaskType() == TaskType.DELIVERY || orderTask3.getTaskType() == TaskType.RETURNING || orderTask3.getTaskType() == TaskType.RETURN_TO_AREA) ? r82 : z10;
                        boolean z18 = (orderTask3.getTaskType() == TaskType.RETURNING || orderTask3.getTaskType() == TaskType.RETURN_TO_AREA) ? r82 : z10;
                        if (orderTask3.getTaskType() != TaskType.PICK_UP && orderTask3.getTaskType() != TaskType.ON_DEMAND_PICK_UP) {
                            TaskStatus taskStatus3 = orderTask3.getTaskStatus();
                            TaskStatus taskStatus4 = TaskStatus.COMPLETED;
                            if (taskStatus3 != taskStatus4 && orderTask3.getTaskStatus() != taskStatus2 && z18 == 0 && z17 != 0) {
                                if (z2) {
                                    z16 = z10;
                                }
                                Integer id2 = orderTask3.getId();
                                c0585q4.pink(81587410, Integer.valueOf(id2 == null ? id2.intValue() : i30));
                                size = p4.size();
                                i15 = r82;
                                if (size < i15) {
                                    size = i15;
                                }
                                Integer id3 = orderTask3.getId();
                                Long l11 = id3 == null ? (Long) map2.get(Integer.valueOf(id3.intValue())) : l10;
                                Integer num3 = (Integer) axVar3.getValue();
                                india = c0585q4.india(orderTask3);
                                Object jade5 = c0585q4.jade();
                                if (!india || jade5 == asVar) {
                                    axVar = axVar3;
                                    Yb.F f11 = new Yb.F(orderTask3, axVar);
                                    c0585q4.f(f11);
                                    obj = f11;
                                } else {
                                    axVar = axVar3;
                                    obj = jade5;
                                }
                                Function0 function04 = (Function0) obj;
                                jade = c0585q4.jade();
                                if (jade != asVar) {
                                    Cb.u uVar = new Cb.u(axVar, 7);
                                    c0585q4.f(uVar);
                                    obj2 = uVar;
                                } else {
                                    obj2 = jade;
                                }
                                int i32 = i20 << 9;
                                int i33 = i21 >> 3;
                                Function1 function16 = function15;
                                int i34 = i29;
                                i16 = i30;
                                T.p pVar5 = pVar4;
                                androidx.compose.runtime.as asVar2 = asVar;
                                Long l12 = l10;
                                C0585q c0585q5 = c0585q4;
                                androidx.compose.runtime.ax axVar4 = axVar;
                                double d9 = doubleValue;
                                double d10 = doubleValue2;
                                charlie(orderTask3, i16, order, size, notesByTaskId, expandedByTaskId, l11, z11, z16, c0329s0, onCallCustomer, str, set, lVar, function1, function12, num2, i10, d9, d10, num3, function04, (Function0) obj2, function16, c0585q5, ((i20 << 6) & 896) | (i32 & 57344) | (i32 & 458752) | (i20 & 1879048192), (i33 & 896) | (i21 & 126) | (i33 & 7168) | (i33 & 57344) | (i33 & 458752) | (i33 & 29360128), 3456);
                                C0585q c0585q6 = c0585q5;
                                if (i16 == CollectionsKt.ivory(p4)) {
                                    c0585q6.purple(-1764251294);
                                    i17 = 1;
                                    pVar3 = pVar5;
                                    z12 = false;
                                    delta(AbstractC0538d.whiskey(pVar3, ((AbstractC2213f.golf - 1) / 2) + AbstractC2213f.echo, 0.0f, 0.0f, 0.0f, 14), c0585q6, 0);
                                } else {
                                    pVar3 = pVar5;
                                    z12 = false;
                                    i17 = 1;
                                    c0585q6.purple(-1775694045);
                                }
                                c0585q6.quebec(z12);
                                c0585q6.quebec(z12);
                                map2 = map;
                                function15 = function16;
                                r82 = i17;
                                doubleValue = d9;
                                doubleValue2 = d10;
                                pVar4 = pVar3;
                                i30 = i31;
                                asVar = asVar2;
                                l10 = l12;
                                axVar3 = axVar4;
                                i29 = i34;
                                z15 = z12;
                                c0585q4 = c0585q6;
                            }
                        }
                        z16 = r82;
                        Integer id22 = orderTask3.getId();
                        c0585q4.pink(81587410, Integer.valueOf(id22 == null ? id22.intValue() : i30));
                        size = p4.size();
                        i15 = r82;
                        if (size < i15) {
                        }
                        Integer id32 = orderTask3.getId();
                        if (id32 == null) {
                        }
                        Integer num32 = (Integer) axVar3.getValue();
                        india = c0585q4.india(orderTask3);
                        Object jade52 = c0585q4.jade();
                        if (india) {
                        }
                        axVar = axVar3;
                        Yb.F f112 = new Yb.F(orderTask3, axVar);
                        c0585q4.f(f112);
                        obj = f112;
                        Function0 function042 = (Function0) obj;
                        jade = c0585q4.jade();
                        if (jade != asVar) {
                        }
                        int i322 = i20 << 9;
                        int i332 = i21 >> 3;
                        Function1 function162 = function15;
                        int i342 = i29;
                        i16 = i30;
                        T.p pVar52 = pVar4;
                        androidx.compose.runtime.as asVar22 = asVar;
                        Long l122 = l10;
                        C0585q c0585q52 = c0585q4;
                        androidx.compose.runtime.ax axVar42 = axVar;
                        double d92 = doubleValue;
                        double d102 = doubleValue2;
                        charlie(orderTask3, i16, order, size, notesByTaskId, expandedByTaskId, l11, z11, z16, c0329s0, onCallCustomer, str, set, lVar, function1, function12, num2, i10, d92, d102, num32, function042, (Function0) obj2, function162, c0585q52, ((i20 << 6) & 896) | (i322 & 57344) | (i322 & 458752) | (i20 & 1879048192), (i332 & 896) | (i21 & 126) | (i332 & 7168) | (i332 & 57344) | (i332 & 458752) | (i332 & 29360128), 3456);
                        C0585q c0585q62 = c0585q52;
                        if (i16 == CollectionsKt.ivory(p4)) {
                        }
                        c0585q62.quebec(z12);
                        c0585q62.quebec(z12);
                        map2 = map;
                        function15 = function162;
                        r82 = i17;
                        doubleValue = d92;
                        doubleValue2 = d102;
                        pVar4 = pVar3;
                        i30 = i31;
                        asVar = asVar22;
                        l10 = l122;
                        axVar3 = axVar42;
                        i29 = i342;
                        z15 = z12;
                        c0585q4 = c0585q62;
                    }
                    boolean z19 = r82;
                    A0.z.papa(c0585q4, z15, z19, z19);
                    function14 = function15;
                    pVar2 = pVar4;
                    c0585q = c0585q4;
                }
            }
            z2 = true;
            if (!p4.isEmpty()) {
            }
            Float earnings2 = order.getEarnings();
            if (earnings2 == null) {
            }
            Platform platform2 = order.getPlatform();
            if (platform2 != null) {
            }
            Double distanceInKm2 = order.getDistanceInKm();
            if (distanceInKm2 == null) {
            }
            PaymentType paymentType2 = order.getPaymentType();
            if (paymentType2 == null) {
            }
            if (valueOf != null) {
            }
            if (bravo != null) {
            }
            OrderStatus orderStatusEnum2 = order.getOrderStatusEnum();
            if (orderStatusEnum2 == null) {
            }
            if (valueOf2 != null) {
            }
            if (bravo2 == null) {
            }
            List<OrderAsset> assets2 = order.getAssets();
            if (assets2 == null) {
            }
            currentLanguageMetaData = order.getCurrentLanguageMetaData();
            if (currentLanguageMetaData == null) {
            }
            List list2 = emptyList;
            it = list2.iterator();
            while (true) {
                if (it.hasNext()) {
                }
                it = it4;
                delta = i13;
                z13 = true;
            }
            LanguageMetaData languageMetaData22 = languageMetaData;
            if (languageMetaData22 == null) {
            }
            float f52 = 16;
            T.s uniform2 = AbstractC0538d.uniform(androidx.compose.foundation.layout.V.charlie(pVar4, 1.0f), f52, 0.0f, 2);
            C0537c c0537c2 = AbstractC0542h.charlie;
            T.i iVar42 = T.d.f2062f;
            C0554u alpha3 = AbstractC0553t.alpha(c0537c2, iVar42, c0585q3, 0);
            long j52 = c0585q3.magenta;
            int i252 = (int) (j52 ^ (j52 >>> 32));
            androidx.compose.runtime.I mike3 = c0585q3.mike();
            T.s charlie4 = T.a.charlie(uniform2, c0585q3);
            InterfaceC2552l.maroon.getClass();
            C2550j c2550j2 = C2551k.bravo;
            c0585q3.white();
            if (!c0585q3.lime) {
            }
            C2549i c2549i22 = C2551k.foxtrot;
            C0564b.blue(c2549i22, c0585q3, alpha3);
            C2549i c2549i32 = C2551k.echo;
            C0564b.blue(c2549i32, c0585q3, mike3);
            C2549i c2549i42 = C2551k.golf;
            if (c0585q3.lime) {
            }
            ao.ad.blue(i252, c0585q3, i252, c2549i42);
            C2549i c2549i52 = C2551k.delta;
            C0564b.blue(c2549i52, c0585q3, charlie4);
            bravo3 = AbstractC2772t0.bravo(c0585q3);
            if (i5 >= 1) {
            }
            EnumC0843h enumC0843h2 = EnumC0843h.alpha;
            if (!bravo3) {
            }
            c0585q3.purple(-660951820);
            c0585q3.quebec(false);
            str3 = null;
            int i272 = i20 >> 12;
            int i282 = (i272 & 57344) | (i272 & 896) | (i272 & 14) | 196608 | (i272 & 112);
            androidx.compose.runtime.ax axVar32 = axVar2;
            c0585q2 = c0585q3;
            C2549i c2549i62 = c2549i;
            ?? r822 = 1;
            int i292 = i13;
            alpha(timerTextState, timerLabelState, i4, i26, num, str3, c0585q2, i282);
            T.s charlie22 = androidx.compose.foundation.layout.V.charlie(pVar4, 1.0f);
            C0554u alpha22 = AbstractC0553t.alpha(AbstractC0542h.golf(0), iVar42, c0585q2, 6);
            long j62 = c0585q2.magenta;
            i14 = (int) (j62 ^ (j62 >>> 32));
            androidx.compose.runtime.I mike22 = c0585q2.mike();
            T.s charlie32 = T.a.charlie(charlie22, c0585q2);
            c0585q2.white();
            if (!c0585q2.lime) {
            }
            C0564b.blue(c2549i62, c0585q2, alpha22);
            C0564b.blue(c2549i32, c0585q2, mike22);
            if (!c0585q2.lime) {
            }
            ao.ad.blue(i14, c0585q2, i14, c2549i42);
            C0564b.blue(c2549i52, c0585q2, charlie32);
            T.s hotel2 = com.google.android.material.datepicker.j.hotel(pVar4, f52, c0585q2, pVar4, 1.0f);
            float f102 = 8;
            if (function0 != null) {
            }
            s6.F0.alpha(hotel2, f102, bravo4, str2, d4, null, null, null, null, str4, null, str5, size3, function03, data, function02, null, booleanValue, c0585q2, 54, (i12 << 15) & 458752);
            AbstractC0538d.echo(androidx.compose.foundation.layout.V.echo(pVar4, 6), c0585q2);
            Long l102 = null;
            boolean z152 = false;
            Zb.d.golf(list2, null, c0585q2, 0);
            r.alpha(com.google.android.material.datepicker.j.juliet(pVar4, f52, c0585q2, R.string.tasks_list, c0585q2), androidx.compose.foundation.layout.V.charlie(pVar4, 1.0f), 0L, 0.0f, null, 0L, c0585q2, 48, 60);
            AbstractC0538d.echo(androidx.compose.foundation.layout.V.echo(pVar4, 12), c0585q2);
            c0585q2.purple(1111877587);
            int i302 = 0;
            C0585q c0585q42 = c0585q2;
            while (r30.hasNext()) {
            }
            boolean z192 = r822;
            A0.z.papa(c0585q42, z152, z192, z192);
            function14 = function15;
            pVar2 = pVar4;
            c0585q = c0585q42;
        } else {
            C0585q c0585q7 = c0585q3;
            c0585q7.ochre();
            pVar2 = pVar;
            function14 = function13;
            c0585q = c0585q7;
        }
        androidx.compose.runtime.Q uniform3 = c0585q.uniform();
        if (uniform3 != null) {
            uniform3.delta = new Xd.l(notesByTaskId, expandedByTaskId, map, timerTextState, timerLabelState, i4, i5, num, c0329s0, onCallCustomer, str, pVar2, set, lVar, function1, function12, d02, i10, function0, function02, d03, d04, d05, function14, i11) { // from class: Yb.C0

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ int f2288a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ Integer f2289b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ C0329s0 f2290c;

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ Function1 f2291d;
                public final /* synthetic */ String e;

                /* renamed from: f, reason: collision with root package name */
                public final /* synthetic */ T.p f2292f;

                /* renamed from: g, reason: collision with root package name */
                public final /* synthetic */ Set f2293g;

                /* renamed from: h, reason: collision with root package name */
                public final /* synthetic */ Xd.l f2294h;

                /* renamed from: i, reason: collision with root package name */
                public final /* synthetic */ Function1 f2295i;

                /* renamed from: j, reason: collision with root package name */
                public final /* synthetic */ Function1 f2296j;

                /* renamed from: k, reason: collision with root package name */
                public final /* synthetic */ androidx.compose.runtime.D0 f2297k;

                /* renamed from: l, reason: collision with root package name */
                public final /* synthetic */ int f2298l;

                /* renamed from: m, reason: collision with root package name */
                public final /* synthetic */ Function0 f2299m;

                /* renamed from: n, reason: collision with root package name */
                public final /* synthetic */ Function0 f2300n;

                /* renamed from: o, reason: collision with root package name */
                public final /* synthetic */ androidx.compose.runtime.D0 f2301o;

                /* renamed from: p, reason: collision with root package name */
                public final /* synthetic */ androidx.compose.runtime.D0 f2302p;
                public final /* synthetic */ Map purple;

                /* renamed from: q, reason: collision with root package name */
                public final /* synthetic */ androidx.compose.runtime.D0 f2303q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ Function1 f2304r;
                public final /* synthetic */ Map red;
                public final /* synthetic */ Map silver;
                public final /* synthetic */ androidx.compose.runtime.ax teal;
                public final /* synthetic */ androidx.compose.runtime.ax white;
                public final /* synthetic */ int yellow;

                @Override // Xd.l
                public final Object invoke(Object obj6, Object obj7) {
                    ((Integer) obj7).getClass();
                    int cyan = C0564b.cyan(1);
                    Order order2 = Order.this;
                    androidx.compose.runtime.D0 d06 = this.f2297k;
                    androidx.compose.runtime.D0 d07 = this.f2301o;
                    androidx.compose.runtime.D0 d08 = this.f2302p;
                    androidx.compose.runtime.D0 d09 = this.f2303q;
                    Function1 function17 = this.f2304r;
                    AbstractC3050r2.bravo(order2, this.purple, this.red, this.silver, this.teal, this.white, this.yellow, this.f2288a, this.f2289b, this.f2290c, this.f2291d, this.e, this.f2292f, this.f2293g, this.f2294h, this.f2295i, this.f2296j, d06, this.f2298l, this.f2299m, this.f2300n, d07, d08, d09, function17, (InterfaceC0581m) obj6, cyan);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void charlie(final OrderTask orderTask, final int i4, final Order order, final int i5, final Map map, final Map map2, final Long l10, final boolean z2, final boolean z10, final C0329s0 c0329s0, final Function1 function1, final String str, final Set set, final Xd.l lVar, final Function1 function12, final Function1 function13, final Integer num, final int i10, final double d4, final double d9, final Integer num2, final Function0 function0, final Function0 function02, final Function1 function14, InterfaceC0581m interfaceC0581m, final int i11, final int i12, final int i13) {
        int i14;
        int i15;
        C0585q c0585q;
        Object orDefault;
        int i16;
        Object e02;
        C1990b c1990b;
        boolean z11;
        boolean z12;
        Integer num3;
        C0585q c0585q2 = (C0585q) interfaceC0581m;
        c0585q2.silver(2095151204);
        int i17 = (c0585q2.india(orderTask) ? 4 : 2) | i11 | (c0585q2.echo(i4) ? 32 : 16);
        if ((i11 & 384) == 0) {
            i17 |= c0585q2.india(order) ? Barcode.FORMAT_QR_CODE : 128;
        }
        boolean echo = c0585q2.echo(i5);
        int i18 = Barcode.FORMAT_UPC_E;
        int i19 = i17 | (echo ? 2048 : 1024);
        if ((i11 & 24576) == 0) {
            i19 |= c0585q2.india(map) ? 16384 : 8192;
        }
        if ((i11 & 196608) == 0) {
            i19 |= c0585q2.india(map2) ? 131072 : 65536;
        }
        int i20 = i19 | (c0585q2.golf(l10) ? 1048576 : 524288) | (c0585q2.hotel(z2) ? 8388608 : 4194304) | (c0585q2.hotel(z10) ? 67108864 : 33554432);
        if ((i11 & 805306368) == 0) {
            i20 |= (i11 & 1073741824) == 0 ? c0585q2.golf(c0329s0) : c0585q2.india(c0329s0) ? 536870912 : 268435456;
        }
        if ((i12 & 6) == 0) {
            i14 = i12 | (c0585q2.india(function1) ? 4 : 2);
        } else {
            i14 = i12;
        }
        if ((i12 & 48) == 0) {
            i14 |= c0585q2.golf(str) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i14 |= c0585q2.india(set) ? Barcode.FORMAT_QR_CODE : 128;
        }
        if ((i12 & 3072) == 0) {
            if (c0585q2.india(lVar)) {
                i18 = 2048;
            }
            i14 |= i18;
        }
        if ((i12 & 24576) == 0) {
            i14 |= c0585q2.india(function12) ? 16384 : 8192;
        }
        if ((i12 & 196608) == 0) {
            i14 |= c0585q2.india(function13) ? 131072 : 65536;
        }
        if ((i12 & 1572864) == 0) {
            i14 |= c0585q2.golf(num) ? 1048576 : 524288;
        }
        if ((i12 & 12582912) == 0) {
            i14 |= c0585q2.echo(i10) ? 8388608 : 4194304;
        }
        if ((i12 & 100663296) == 0) {
            i14 |= c0585q2.charlie(d4) ? 67108864 : 33554432;
        }
        if ((i12 & 805306368) == 0) {
            i14 |= c0585q2.charlie(d9) ? 536870912 : 268435456;
        }
        if ((i13 & 6) == 0) {
            i15 = i13 | (c0585q2.golf(num2) ? 4 : 2);
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c0585q2.india(function0) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c0585q2.india(function02) ? Barcode.FORMAT_QR_CODE : 128;
        }
        int i21 = i15;
        if (c0585q2.magenta(i20 & 1, ((i20 & 306783379) == 306783378 && (i14 & 306783379) == 306783378 && (i21 & 147) == 146) ? false : true)) {
            Integer id2 = orderTask.getId();
            int intValue = id2 != null ? id2.intValue() : 0;
            orDefault = map2.getOrDefault(Integer.valueOf(intValue), Boolean.valueOf(z2));
            Boolean bool = (Boolean) orDefault;
            boolean booleanValue = bool.booleanValue();
            Object jade = c0585q2.jade();
            androidx.compose.runtime.as asVar = C0580l.alpha;
            if (jade == asVar) {
                jade = new C1990b();
                c0585q2.f(jade);
            }
            C1990b c1990b2 = (C1990b) jade;
            Integer valueOf = Integer.valueOf(intValue);
            int i22 = intValue;
            boolean hotel = ((i21 & 896) == 256) | c0585q2.hotel(booleanValue) | ((i21 & 14) == 4) | c0585q2.echo(intValue) | c0585q2.india(c1990b2);
            Object jade2 = c0585q2.jade();
            if (hotel || jade2 == asVar) {
                i16 = i20;
                c1990b = c1990b2;
                z11 = true;
                z12 = false;
                e02 = new Yb.E0(booleanValue, num2, i22, c1990b, function02, null);
                num3 = num2;
                c0585q2.f(e02);
            } else {
                i16 = i20;
                num3 = num2;
                c1990b = c1990b2;
                z11 = true;
                e02 = jade2;
                z12 = false;
            }
            C0564b.hotel(bool, num3, valueOf, (Xd.l) e02, c0585q2);
            T.s alpha = androidx.compose.foundation.relocation.a.alpha(T.p.alpha, c1990b);
            q0.ap delta = AbstractC0547m.delta(T.d.alpha, z12);
            long j5 = c0585q2.magenta;
            int i23 = (int) (j5 ^ (j5 >>> 32));
            androidx.compose.runtime.I mike = c0585q2.mike();
            T.s charlie = T.a.charlie(alpha, c0585q2);
            InterfaceC2552l.maroon.getClass();
            C2550j c2550j = C2551k.bravo;
            c0585q2.white();
            if (c0585q2.lime) {
                c0585q2.lima(c2550j);
            } else {
                c0585q2.i();
            }
            C0564b.blue(C2551k.foxtrot, c0585q2, delta);
            C0564b.blue(C2551k.echo, c0585q2, mike);
            C2549i c2549i = C2551k.golf;
            if (c0585q2.lime || !Intrinsics.areEqual(c0585q2.jade(), Integer.valueOf(i23))) {
                ao.ad.blue(i23, c0585q2, i23, c2549i);
            }
            C0564b.blue(C2551k.delta, c0585q2, charlie);
            if (orderTask.getTaskType() != TaskType.PICK_UP && orderTask.getTaskType() != TaskType.ON_DEMAND_PICK_UP) {
                if (orderTask.getTaskType() != TaskType.DELIVERY && orderTask.getTaskType() != TaskType.RETURNING && orderTask.getTaskType() != TaskType.RETURN_TO_AREA) {
                    c0585q2.purple(369220904);
                    AbstractC3065u2.alpha(orderTask, i4 == 0 ? str : null, null, c0585q2, i16 & 14);
                    c0585q2.quebec(z12);
                    c0585q = c0585q2;
                    c0585q.quebec(z11);
                } else {
                    c0585q2.purple(368264368);
                    Integer id3 = orderTask.getId();
                    List list = (List) map.get(Integer.valueOf(id3 != null ? id3.intValue() : -1));
                    if (list == null) {
                        list = CollectionsKt.emptyList();
                    }
                    int i24 = i16 >> 3;
                    int i25 = i14 >> 9;
                    AbstractC3041p2.bravo(orderTask, order, list, i4 + 1, i5, map2, z2, z10, c0329s0, function1, null, set, lVar, i10, l10, d4, d9, function0, c0585q2, (i16 & 14) | (i24 & 112) | ((i16 << 3) & 57344) | (i16 & 458752) | (i24 & 3670016) | (i24 & 29360128) | (i24 & 234881024) | ((i14 << 27) & 1879048192), ((i16 >> 6) & 57344) | ((i14 >> 3) & 1008) | ((i14 >> 12) & 7168) | (458752 & i25) | (i25 & 3670016) | ((i21 << 18) & 29360128));
                    c0585q = c0585q2;
                    c0585q.quebec(false);
                }
            } else {
                c0585q2.purple(367132744);
                int i26 = i16 >> 3;
                int i27 = (i16 & 14) | (i26 & 112) | (i16 & 7168) | (i26 & 57344);
                int i28 = i16 >> 6;
                int i29 = i14 >> 6;
                AbstractC3046q2.alpha(orderTask, order, i4 + 1, i5, map2, z2, z10, c0329s0, null, set, lVar, function12, function13, num, i10, l10, d4, d9, function0, c0585q2, (i28 & 29360128) | i27 | (i28 & 458752) | (i28 & 3670016) | ((i14 << 21) & 1879048192), ((i14 >> 9) & 65534) | (i26 & 458752) | (i29 & 3670016) | (i29 & 29360128) | ((i21 << 21) & 234881024));
                c0585q = c0585q2;
                c0585q.quebec(false);
            }
            z11 = true;
            c0585q.quebec(z11);
        } else {
            c0585q = c0585q2;
            c0585q.ochre();
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new Xd.l() { // from class: Yb.D0
                @Override // Xd.l
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int cyan = C0564b.cyan(i11 | 1);
                    int cyan2 = C0564b.cyan(i12);
                    int cyan3 = C0564b.cyan(i13);
                    OrderTask orderTask2 = OrderTask.this;
                    Order order2 = order;
                    Function0 function03 = function02;
                    Function1 function15 = function14;
                    AbstractC3050r2.charlie(orderTask2, i4, order2, i5, map, map2, l10, z2, z10, c0329s0, function1, str, set, lVar, function12, function13, num, i10, d4, d9, num2, function0, function03, function15, (InterfaceC0581m) obj, cyan, cyan2, cyan3);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void delta(T.s sVar, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        boolean z2;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-1346783755);
        if (c0585q.golf(sVar)) {
            i5 = 4;
        } else {
            i5 = 2;
        }
        int i10 = i5 | i4;
        if ((i10 & 3) != 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i10 & 1, z2)) {
            AbstractC0547m.alpha(androidx.compose.foundation.a.bravo(androidx.compose.foundation.layout.V.echo(androidx.compose.foundation.layout.V.oscar(AbstractC0538d.sierra(sVar, 0), 1), 16), Db.c.magenta, a0.ao.alpha), c0585q, 0);
        } else {
            c0585q.ochre();
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new Ec.u(sVar, i4, 2);
        }
    }

    public static final int echo(int i4, int i5) {
        return (i4 >> i5) & 31;
    }
}
