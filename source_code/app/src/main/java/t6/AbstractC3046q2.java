package t6;

import Yb.C0294a0;
import Yb.C0300d0;
import Yb.C0329s0;
import android.content.Context;
import android.content.SharedPreferences;
import androidx.compose.foundation.layout.AbstractC0538d;
import androidx.compose.foundation.layout.AbstractC0542h;
import androidx.compose.foundation.layout.AbstractC0553t;
import androidx.compose.foundation.layout.C0537c;
import androidx.compose.foundation.layout.C0554u;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import cb.C0838c;
import cb.EnumC0839d;
import com.app.network.network.models.Order;
import com.app.network.network.models.OrderAddress;
import com.app.network.network.models.OrderTask;
import com.app.network.network.models.Receipt;
import com.app.network.network.models.TaskStatus;
import com.google.mlkit.vision.barcode.common.Barcode;
import dagger.hilt.android.EntryPointAccessors;
import delivery.samurai.android.R;
import ec.AbstractC1650c;
import fc.C1706a;
import fc.C1708c;
import fc.InterfaceC1707b;
import g0.C1726f;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ob.AbstractC2213f;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.http2.Http2Connection;
import q3.C2407a;
import s0.C2549i;
import s0.C2550j;
import s0.C2551k;
import s0.InterfaceC2552l;
import s6.AbstractC2672h7;
import s6.AbstractC2717m7;
import s6.AbstractC2772t0;
import s6.X4;
import t0.AbstractC2913f0;
import t6.AbstractC3046q2;
import t6.T2;

/* renamed from: t6.q2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3046q2 {
    public static final /* synthetic */ int alpha = 0;

    /* JADX WARN: Code restructure failed: missing block: B:164:0x0466, code lost:
    
        if ((r0 != null ? r0.getUrl() : null) != null) goto L199;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x04f4, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r10.jade(), java.lang.Integer.valueOf(r0)) == false) goto L223;
     */
    /* JADX WARN: Code restructure failed: missing block: B:427:0x0494, code lost:
    
        if ((r0 != null ? r0.getUrl() : null) != null) goto L199;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0678  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x06d3  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x06e0  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x071a  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0732  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x073c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0763  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x07c0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0811 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0871  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x087a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:284:0x08be  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x08e1  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x08ec A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:301:0x091c  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0925  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x0964  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x0978  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x09a9  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x09be A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:327:0x09d2  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x09ec  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x09f6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:340:0x0a14  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x0a22 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:355:0x0a16  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x09ee  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x0992  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x0953  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x0921  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x0876  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x0777  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x0734  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x071c  */
    /* JADX WARN: Removed duplicated region for block: B:392:0x06f4  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x06d6  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x067f  */
    /* JADX WARN: Type inference failed for: r18v13 */
    /* JADX WARN: Type inference failed for: r18v14, types: [kotlin.jvm.functions.Function0] */
    /* JADX WARN: Type inference failed for: r18v15 */
    /* JADX WARN: Type inference failed for: r19v5 */
    /* JADX WARN: Type inference failed for: r19v6, types: [kotlin.jvm.functions.Function0] */
    /* JADX WARN: Type inference failed for: r19v7 */
    /* JADX WARN: Type inference failed for: r1v53, types: [P.d] */
    /* JADX WARN: Type inference failed for: r27v7, types: [P.d] */
    /* JADX WARN: Type inference failed for: r28v5, types: [P.d] */
    /* JADX WARN: Type inference failed for: r29v5, types: [P.d] */
    /* JADX WARN: Type inference failed for: r31v0 */
    /* JADX WARN: Type inference failed for: r31v1, types: [b.ab] */
    /* JADX WARN: Type inference failed for: r31v2 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11, types: [P.d] */
    /* JADX WARN: Type inference failed for: r7v20 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void alpha(final OrderTask orderTask, final Order order, final int i4, final int i5, final Map expandedByTaskId, final boolean z2, final boolean z10, final C0329s0 c0329s0, T.s sVar, final Set set, final Xd.l lVar, final Function1 function1, final Function1 function12, final Integer num, final int i10, final Long l10, final double d4, final double d9, final Function0 function0, InterfaceC0581m interfaceC0581m, final int i11, final int i12) {
        int i13;
        int i14;
        C0585q c0585q;
        final T.s sVar2;
        boolean z11;
        C1708c c1708c;
        C1708c c1708c2;
        boolean z12;
        C0585q c0585q2;
        int i15;
        String str;
        int i16;
        boolean z13;
        TaskStatus taskStatus;
        androidx.compose.runtime.as asVar;
        Context context;
        int i17;
        boolean z14;
        int i18;
        Object charlie;
        C1708c c1708c3;
        int i19;
        Boolean bool;
        int i20;
        Context context2;
        boolean z15;
        boolean z16;
        T.i iVar;
        C2549i c2549i;
        String str2;
        TaskStatus taskStatus2;
        boolean z17;
        androidx.compose.runtime.as asVar2;
        C2549i c2549i2;
        float f5;
        C2549i c2549i3;
        T.p pVar;
        boolean z18;
        boolean z19;
        boolean z20;
        boolean z21;
        boolean z22;
        boolean echo;
        androidx.compose.runtime.as asVar3;
        boolean z23;
        boolean z24;
        Context context3;
        String str3;
        String str4;
        Object obj;
        boolean echo2;
        Object jade;
        Object obj2;
        boolean z25;
        int i21;
        Context context4;
        androidx.compose.runtime.as asVar4;
        Object obj3;
        C0329s0 c0329s02;
        T.p pVar2;
        boolean z26;
        Context context5;
        final ?? r72;
        OrderTask orderTask2;
        Object obj4;
        ?? r18;
        TaskStatus taskStatus3;
        boolean z27;
        boolean z28;
        boolean z29;
        Object obj5;
        OrderAddress address;
        boolean z30;
        ?? r19;
        int i22;
        boolean india;
        Object jade2;
        boolean hotel;
        Object jade3;
        boolean india2;
        Object jade4;
        Object orDefault;
        Intrinsics.echo(expandedByTaskId, "expandedByTaskId");
        C0585q c0585q3 = (C0585q) interfaceC0581m;
        c0585q3.silver(-1699674735);
        if ((i11 & 6) == 0) {
            i13 = (c0585q3.india(orderTask) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            i13 |= c0585q3.india(order) ? 32 : 16;
        }
        int i23 = i13 | (c0585q3.echo(i4) ? Barcode.FORMAT_QR_CODE : 128);
        int i24 = i11 & 3072;
        int i25 = Barcode.FORMAT_UPC_E;
        if (i24 == 0) {
            i23 |= c0585q3.echo(i5) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            i23 |= c0585q3.india(expandedByTaskId) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((i11 & 196608) == 0) {
            i23 |= c0585q3.hotel(z2) ? 131072 : 65536;
        }
        if ((i11 & 1572864) == 0) {
            i23 |= c0585q3.hotel(z10) ? 1048576 : 524288;
        }
        if ((i11 & 12582912) == 0) {
            i23 |= (i11 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) == 0 ? c0585q3.golf(c0329s0) : c0585q3.india(c0329s0) ? 8388608 : 4194304;
        }
        int i26 = i23 | 100663296;
        if ((i11 & 805306368) == 0) {
            i26 |= c0585q3.india(set) ? 536870912 : 268435456;
        }
        if ((i12 & 6) == 0) {
            i14 = i12 | (c0585q3.india(lVar) ? 4 : 2);
        } else {
            i14 = i12;
        }
        if ((i12 & 48) == 0) {
            i14 |= c0585q3.india(function1) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i14 |= c0585q3.india(function12) ? Barcode.FORMAT_QR_CODE : 128;
        }
        if ((i12 & 3072) == 0) {
            if (c0585q3.golf(num)) {
                i25 = 2048;
            }
            i14 |= i25;
        }
        if ((i12 & 24576) == 0) {
            i14 |= c0585q3.echo(i10) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((i12 & 196608) == 0) {
            i14 |= c0585q3.golf(l10) ? 131072 : 65536;
        }
        if ((i12 & 1572864) == 0) {
            i14 |= c0585q3.charlie(d4) ? 1048576 : 524288;
        }
        if ((i12 & 12582912) == 0) {
            i14 |= c0585q3.charlie(d9) ? 8388608 : 4194304;
        }
        if ((i12 & 100663296) == 0) {
            i14 |= c0585q3.india(function0) ? 67108864 : 33554432;
        }
        int i27 = i14;
        int i28 = i26;
        if (c0585q3.magenta(i28 & 1, ((i26 & 306783379) == 306783378 && (38347923 & i27) == 38347922) ? false : true)) {
            T.p pVar3 = T.p.alpha;
            androidx.compose.runtime.as asVar5 = C0580l.alpha;
            androidx.compose.runtime.E0 e02 = AndroidCompositionLocals_androidKt.bravo;
            Context context6 = (Context) c0585q3.kilo(e02);
            androidx.compose.runtime.E0 e03 = AbstractC2913f0.alpha;
            boolean booleanValue = ((Boolean) c0585q3.kilo(e03)).booleanValue();
            Integer id2 = orderTask.getId();
            if (id2 != null) {
                int intValue = id2.intValue();
                if (z10) {
                    orDefault = expandedByTaskId.getOrDefault(id2, Boolean.valueOf(z2));
                    z11 = ((Boolean) orDefault).booleanValue();
                } else {
                    z11 = false;
                }
                TaskStatus taskStatus4 = orderTask.getTaskStatus();
                TaskStatus taskStatus5 = TaskStatus.STARTED;
                boolean z31 = taskStatus4 == taskStatus5 || orderTask.getTaskStatus() == TaskStatus.AT_DESTINATION || orderTask.getTaskStatus() == TaskStatus.COMPLETED;
                boolean bravo = AbstractC2772t0.bravo(c0585q3);
                c0585q3.purple(-862485021);
                if (((Boolean) c0585q3.kilo(e03)).booleanValue()) {
                    c1708c = new C1708c(true, true);
                    c0585q3.quebec(false);
                } else {
                    Context context7 = (Context) c0585q3.kilo(e02);
                    boolean golf = c0585q3.golf(context7);
                    Object jade5 = c0585q3.jade();
                    Object obj6 = jade5;
                    if (golf || jade5 == asVar5) {
                        Intrinsics.echo(context7, "context");
                        Context applicationContext = context7.getApplicationContext();
                        Intrinsics.delta(applicationContext, "getApplicationContext(...)");
                        C1706a c1706a = (C1706a) ((w9.p) ((InterfaceC1707b) EntryPointAccessors.fromApplication(applicationContext, InterfaceC1707b.class))).romeo.get();
                        c0585q3.f(c1706a);
                        obj6 = c1706a;
                    }
                    C1706a c1706a2 = (C1706a) obj6;
                    c1706a2.getClass();
                    C2407a c2407a = N9.a.charlie;
                    N9.i iVar2 = (N9.i) c1706a2.alpha;
                    androidx.compose.runtime.ax bravo2 = AbstractC2717m7.bravo(iVar2.charlie(c2407a), c0585q3, 0);
                    androidx.compose.runtime.ax bravo3 = AbstractC2717m7.bravo(iVar2.charlie(N9.a.delta), c0585q3, 0);
                    boolean hotel2 = c0585q3.hotel(((Boolean) bravo3.getValue()).booleanValue()) | c0585q3.hotel(((Boolean) bravo2.getValue()).booleanValue());
                    Object jade6 = c0585q3.jade();
                    Object obj7 = jade6;
                    if (hotel2 || jade6 == asVar5) {
                        C1708c c1708c4 = new C1708c(((Boolean) bravo2.getValue()).booleanValue(), ((Boolean) bravo3.getValue()).booleanValue());
                        c0585q3.f(c1708c4);
                        obj7 = c1708c4;
                    }
                    c1708c = (C1708c) obj7;
                    c0585q3.quebec(false);
                }
                int i29 = 57344 & i27;
                boolean golf2 = c0585q3.golf(CollectionsKt.D(set)) | c0585q3.golf(orderTask) | c0585q3.golf(order) | (i29 == 16384) | c0585q3.hotel(bravo) | c0585q3.golf(c1708c);
                Object jade7 = c0585q3.jade();
                if (golf2 || jade7 == asVar5) {
                    c1708c2 = c1708c;
                    z12 = bravo;
                    c0585q2 = c0585q3;
                    i15 = i27;
                    str = "context";
                    i16 = i28;
                    z13 = true;
                    taskStatus = taskStatus5;
                    asVar = asVar5;
                    context = context6;
                    i17 = i29;
                    z14 = z11;
                    i18 = 32;
                    charlie = AbstractC3055s2.charlie(context, orderTask, order, set, z12, c1708c2);
                    c0585q2.f(charlie);
                } else {
                    c1708c2 = c1708c;
                    z12 = bravo;
                    i15 = i27;
                    str = "context";
                    i16 = i28;
                    z13 = true;
                    charlie = jade7;
                    taskStatus = taskStatus5;
                    asVar = asVar5;
                    c0585q2 = c0585q3;
                    context = context6;
                    i17 = i29;
                    z14 = z11;
                    i18 = 32;
                }
                final C0838c c0838c = (C0838c) charlie;
                boolean z32 = (z12 && AbstractC3060t2.bravo(order, orderTask)) ? z13 : false;
                Boolean valueOf = Boolean.valueOf(z32);
                boolean hotel3 = c0585q2.hotel(z32) | c0585q2.india(order) | c0585q2.echo(intValue) | c0585q2.india(orderTask);
                Context context8 = context;
                Object jade8 = c0585q2.jade();
                if (hotel3 || jade8 == asVar) {
                    c1708c3 = c1708c2;
                    i19 = i16;
                    bool = valueOf;
                    boolean z33 = z32;
                    i20 = intValue;
                    context2 = context8;
                    jade8 = new C0300d0(z33, order, i20, orderTask, null);
                    z15 = z33;
                    c0585q2.f(jade8);
                } else {
                    z15 = z32;
                    i20 = intValue;
                    context2 = context8;
                    c1708c3 = c1708c2;
                    i19 = i16;
                    bool = valueOf;
                }
                C0564b.golf(id2, bool, (Xd.l) jade8, c0585q2);
                boolean golf3 = c0585q2.golf(c0838c) | c0585q2.hotel(z31);
                Object jade9 = c0585q2.jade();
                if (golf3 || jade9 == asVar) {
                    if (z31) {
                        jade9 = c0838c;
                    } else {
                        String title = c0838c.alpha;
                        Intrinsics.echo(title, "title");
                        String locationLabel = c0838c.charlie;
                        Intrinsics.echo(locationLabel, "locationLabel");
                        EnumC0839d state = c0838c.delta;
                        Intrinsics.echo(state, "state");
                        List items = c0838c.golf;
                        Intrinsics.echo(items, "items");
                        List cabinets = c0838c.hotel;
                        Intrinsics.echo(cabinets, "cabinets");
                        C1726f taskIcon = c0838c.papa;
                        Intrinsics.echo(taskIcon, "taskIcon");
                        List orderItems = c0838c.quebec;
                        Intrinsics.echo(orderItems, "orderItems");
                        List deliveryProofImagePaths = c0838c.black;
                        Intrinsics.echo(deliveryProofImagePaths, "deliveryProofImagePaths");
                        jade9 = new C0838c(title, "", locationLabel, state, null, null, items, cabinets, c0838c.india, c0838c.juliet, c0838c.kilo, null, c0838c.mike, c0838c.november, c0838c.oscar, taskIcon, orderItems, null, c0838c.sierra, c0838c.tango, c0838c.uniform, c0838c.victor, c0838c.whiskey, c0838c.xray, c0838c.yankee, c0838c.zulu, c0838c.amber, c0838c.azure, c0838c.beige, deliveryProofImagePaths);
                    }
                    c0585q2.f(jade9);
                }
                C0838c c0838c2 = (C0838c) jade9;
                if (booleanValue) {
                    if (orderTask.getTaskStatus() == TaskStatus.COMPLETED) {
                        Receipt receipt = orderTask.getReceipt();
                    }
                    z16 = false;
                } else {
                    if (L9.d.juliet(context2, orderTask.generateImageId()) == null || orderTask.getTaskStatus() == TaskStatus.COMPLETED) {
                        if (orderTask.getTaskStatus() == TaskStatus.COMPLETED) {
                            Receipt receipt2 = orderTask.getReceipt();
                        }
                        z16 = false;
                    }
                    z16 = z13;
                }
                float f10 = AbstractC2213f.charlie;
                T.s charlie2 = androidx.compose.foundation.layout.V.charlie(pVar3, 1.0f);
                C0537c c0537c = AbstractC0542h.charlie;
                T.i iVar3 = T.d.f2062f;
                C0554u alpha2 = AbstractC0553t.alpha(c0537c, iVar3, c0585q2, 0);
                long j5 = c0585q2.magenta;
                int i30 = (int) (j5 ^ (j5 >>> i18));
                androidx.compose.runtime.I mike = c0585q2.mike();
                T.s charlie3 = T.a.charlie(charlie2, c0585q2);
                InterfaceC2552l.maroon.getClass();
                C2550j c2550j = C2551k.bravo;
                c0585q2.white();
                if (c0585q2.lime) {
                    c0585q2.lima(c2550j);
                } else {
                    c0585q2.i();
                }
                C2549i c2549i4 = C2551k.foxtrot;
                C0564b.blue(c2549i4, c0585q2, alpha2);
                C2549i c2549i5 = C2551k.echo;
                C0564b.blue(c2549i5, c0585q2, mike);
                C2549i c2549i6 = C2551k.golf;
                if (c0585q2.lime) {
                    iVar = iVar3;
                } else {
                    iVar = iVar3;
                }
                ao.ad.blue(i30, c0585q2, i30, c2549i6);
                C2549i c2549i7 = C2551k.delta;
                C0564b.blue(c2549i7, c0585q2, charlie3);
                Za.c cVar = Za.c.alpha;
                boolean z34 = orderTask.getTaskStatus() == TaskStatus.COMPLETED ? z13 : false;
                TaskStatus taskStatus6 = orderTask.getTaskStatus();
                TaskStatus taskStatus7 = TaskStatus.CANCELLED;
                boolean z35 = taskStatus6 == taskStatus7 ? z13 : false;
                if (orderTask.getTaskStatus() == taskStatus7) {
                    c2549i = c2549i7;
                    str2 = Q0.c.oscar(c0585q2, -945651204, R.string.canceled, c0585q2, false);
                } else {
                    c2549i = c2549i7;
                    c0585q2.purple(749621538);
                    c0585q2.quebec(false);
                    str2 = null;
                }
                T.s charlie4 = androidx.compose.foundation.layout.V.charlie(pVar3, 1.0f);
                boolean india3 = ((i19 & 3670016) == 1048576 ? z13 : false) | c0585q2.india(expandedByTaskId) | c0585q2.echo(i20) | c0585q2.hotel(z14) | ((i15 & 234881024) == 67108864 ? z13 : false);
                Object jade10 = c0585q2.jade();
                if (india3 || jade10 == asVar) {
                    taskStatus2 = taskStatus7;
                    z17 = z14;
                    asVar2 = asVar;
                    c2549i2 = c2549i;
                    f5 = 1.0f;
                    c2549i3 = c2549i6;
                    Yb.an anVar = new Yb.an(z10, expandedByTaskId, i20, z17, function0, 1);
                    c0585q2.f(anVar);
                    jade10 = anVar;
                } else {
                    taskStatus2 = taskStatus7;
                    z17 = z14;
                    asVar2 = asVar;
                    c2549i2 = c2549i;
                    f5 = 1.0f;
                    c2549i3 = c2549i6;
                }
                int i31 = i19;
                int i32 = i20;
                Context context9 = context2;
                boolean z36 = z31;
                C2549i c2549i8 = c2549i3;
                int i33 = i17;
                float f11 = f5;
                T.i iVar4 = iVar;
                P2.bravo((Function0) jade10, cVar, i4, i5, z17, charlie4, z34, z35, str2, z10, c0585q2, (i31 & 896) | 196656 | (i31 & 7168) | ((i31 << 9) & 1879048192));
                C0585q c0585q4 = c0585q2;
                if (z17) {
                    c0585q4.purple(750199069);
                    T.s whiskey = AbstractC0538d.whiskey(androidx.compose.foundation.layout.V.charlie(pVar3, f11), 0.0f, AbstractC2213f.foxtrot, 0.0f, 0.0f, 13);
                    C0554u alpha3 = AbstractC0553t.alpha(c0537c, iVar4, c0585q4, 0);
                    long j6 = c0585q4.magenta;
                    int i34 = (int) (j6 ^ (j6 >>> i18));
                    androidx.compose.runtime.I mike2 = c0585q4.mike();
                    T.s charlie5 = T.a.charlie(whiskey, c0585q4);
                    c0585q4.white();
                    if (c0585q4.lime) {
                        c0585q4.lima(c2550j);
                    } else {
                        c0585q4.i();
                    }
                    C0564b.blue(c2549i4, c0585q4, alpha3);
                    C0564b.blue(c2549i5, c0585q4, mike2);
                    if (c0585q4.lime || !Intrinsics.areEqual(c0585q4.jade(), Integer.valueOf(i34))) {
                        ao.ad.blue(i34, c0585q4, i34, c2549i8);
                    }
                    C0564b.blue(c2549i2, c0585q4, charlie5);
                    boolean z37 = z16 && !c0838c.sierra;
                    boolean z38 = orderTask.getMetaData() != null;
                    OrderAddress address2 = orderTask.getAddress();
                    if ((address2 != null ? address2.getLatitude() : null) != null) {
                        OrderAddress address3 = orderTask.getAddress();
                        if ((address3 != null ? address3.getLongitude() : null) != null) {
                            z20 = true;
                            z21 = orderTask.getTaskStatus() != taskStatus2;
                            z22 = (s6.H0.charlie(order, orderTask) || !z36 || z21) ? false : true;
                            boolean z39 = !z22 && Intrinsics.areEqual(orderTask.getRequiresAmountInput(), Boolean.TRUE);
                            boolean z40 = (z22 || z39 || !Intrinsics.areEqual(orderTask.getRequiresInvoiceQrCode(), Boolean.TRUE)) ? false : true;
                            boolean z41 = !z22 && Intrinsics.areEqual(orderTask.getRequiresInvoice(), Boolean.TRUE);
                            echo = c0585q4.echo(i32) | (i33 != 16384);
                            Object jade11 = c0585q4.jade();
                            if (echo) {
                                asVar3 = asVar2;
                                if (jade11 != asVar3) {
                                    z24 = z37;
                                    z23 = z38;
                                    obj = jade11;
                                    str3 = str;
                                    context3 = context9;
                                    str4 = null;
                                    final boolean booleanValue2 = ((Boolean) obj).booleanValue();
                                    echo2 = c0585q4.echo(i32) | (i33 == 16384);
                                    jade = c0585q4.jade();
                                    if (!echo2 || jade == asVar3) {
                                        Intrinsics.echo(context3, str3);
                                        jade = context3.getSharedPreferences("on_demand_entered_amount", 0).getString("entered_amount_for_task_" + i32, str4);
                                        c0585q4.f(jade);
                                    }
                                    final String str5 = (String) jade;
                                    if (z21) {
                                        c0585q4.purple(464424787);
                                        c0585q4.quebec(false);
                                        obj3 = str4;
                                        obj2 = obj3;
                                        z25 = z20;
                                        i21 = i32;
                                        context4 = context3;
                                        asVar4 = asVar3;
                                    } else if (z36 && (z24 || z23)) {
                                        c0585q4.purple(464642842);
                                        obj2 = str4;
                                        Context context10 = context3;
                                        asVar4 = asVar3;
                                        z25 = z20;
                                        i21 = i32;
                                        context4 = context10;
                                        Object echo3 = P.e.echo(1289930584, new Yb.Y(z24, c0329s0, orderTask, z23, context10, 1), c0585q4);
                                        c0585q4.quebec(false);
                                        obj3 = echo3;
                                    } else {
                                        obj2 = str4;
                                        z25 = z20;
                                        i21 = i32;
                                        context4 = context3;
                                        asVar4 = asVar3;
                                        c0585q4.purple(469128851);
                                        c0585q4.quebec(false);
                                        obj3 = obj2;
                                    }
                                    if (!z22 && (z40 || z39 || z41)) {
                                        c0585q4.purple(469684372);
                                        final boolean z42 = z41;
                                        final boolean z43 = z39;
                                        final boolean z44 = z39;
                                        final boolean z45 = z40;
                                        pVar2 = pVar3;
                                        final boolean z46 = z16;
                                        c0585q = c0585q4;
                                        context5 = context4;
                                        Xd.l lVar2 = new Xd.l() { // from class: Yb.c0
                                            /* JADX WARN: Code restructure failed: missing block: B:12:0x007b, code lost:
                                            
                                                if (kotlin.jvm.internal.Intrinsics.areEqual(r9.jade(), java.lang.Integer.valueOf(r11)) == false) goto L18;
                                             */
                                            @Override // Xd.l
                                            /*
                                                Code decompiled incorrectly, please refer to instructions dump.
                                            */
                                            public final Object invoke(Object obj8, Object obj9) {
                                                boolean z47;
                                                char c3;
                                                InterfaceC0581m interfaceC0581m2 = (InterfaceC0581m) obj8;
                                                int intValue2 = ((Integer) obj9).intValue();
                                                if ((intValue2 & 3) != 2) {
                                                    z47 = true;
                                                } else {
                                                    z47 = false;
                                                }
                                                C0585q c0585q5 = (C0585q) interfaceC0581m2;
                                                if (c0585q5.magenta(intValue2 & 1, z47)) {
                                                    T.p pVar4 = T.p.alpha;
                                                    T.s charlie6 = androidx.compose.foundation.layout.V.charlie(pVar4, 1.0f);
                                                    float f12 = 12;
                                                    C0554u alpha4 = AbstractC0553t.alpha(AbstractC0542h.golf(f12), T.d.f2062f, c0585q5, 6);
                                                    long j7 = c0585q5.magenta;
                                                    int i35 = (int) (j7 ^ (j7 >>> 32));
                                                    androidx.compose.runtime.I mike3 = c0585q5.mike();
                                                    T.s charlie7 = T.a.charlie(charlie6, c0585q5);
                                                    InterfaceC2552l.maroon.getClass();
                                                    C2550j c2550j2 = C2551k.bravo;
                                                    c0585q5.white();
                                                    if (c0585q5.lime) {
                                                        c0585q5.lima(c2550j2);
                                                    } else {
                                                        c0585q5.i();
                                                    }
                                                    C2549i c2549i9 = C2551k.foxtrot;
                                                    C0564b.blue(c2549i9, c0585q5, alpha4);
                                                    C2549i c2549i10 = C2551k.echo;
                                                    C0564b.blue(c2549i10, c0585q5, mike3);
                                                    C2549i c2549i11 = C2551k.golf;
                                                    if (!c0585q5.lime) {
                                                        c3 = ' ';
                                                    } else {
                                                        c3 = ' ';
                                                    }
                                                    ao.ad.blue(i35, c0585q5, i35, c2549i11);
                                                    C2549i c2549i12 = C2551k.delta;
                                                    C0564b.blue(c2549i12, c0585q5, charlie7);
                                                    db.n.echo(null, c0585q5, 0);
                                                    T.s charlie8 = androidx.compose.foundation.layout.V.charlie(pVar4, 1.0f);
                                                    androidx.compose.foundation.layout.S alpha5 = androidx.compose.foundation.layout.Q.alpha(AbstractC0542h.golf(f12), T.d.f2060c, c0585q5, 6);
                                                    long j10 = c0585q5.magenta;
                                                    int i36 = (int) (j10 ^ (j10 >>> c3));
                                                    androidx.compose.runtime.I mike4 = c0585q5.mike();
                                                    T.s charlie9 = T.a.charlie(charlie8, c0585q5);
                                                    c0585q5.white();
                                                    if (c0585q5.lime) {
                                                        c0585q5.lima(c2550j2);
                                                    } else {
                                                        c0585q5.i();
                                                    }
                                                    C0564b.blue(c2549i9, c0585q5, alpha5);
                                                    C0564b.blue(c2549i10, c0585q5, mike4);
                                                    if (c0585q5.lime || !Intrinsics.areEqual(c0585q5.jade(), Integer.valueOf(i36))) {
                                                        ao.ad.blue(i36, c0585q5, i36, c2549i11);
                                                    }
                                                    C0564b.blue(c2549i12, c0585q5, charlie9);
                                                    androidx.compose.runtime.as asVar6 = C0580l.alpha;
                                                    OrderTask orderTask3 = orderTask;
                                                    boolean z48 = z44;
                                                    C0329s0 c0329s03 = c0329s0;
                                                    if (z48) {
                                                        c0585q5.purple(-2100092638);
                                                        T.s maroon = androidx.appcompat.widget.P0.maroon(1.0f);
                                                        boolean india4 = c0585q5.india(c0329s03) | c0585q5.india(orderTask3);
                                                        Object jade12 = c0585q5.jade();
                                                        if (india4 || jade12 == asVar6) {
                                                            jade12 = new ai(c0329s03, orderTask3, 6);
                                                            c0585q5.f(jade12);
                                                        }
                                                        db.o.bravo(0, maroon, c0585q5, str5, (Function0) jade12);
                                                    } else {
                                                        c0585q5.purple(-2115878179);
                                                    }
                                                    c0585q5.quebec(false);
                                                    if (z45) {
                                                        c0585q5.purple(-2099657026);
                                                        T.s maroon2 = androidx.appcompat.widget.P0.maroon(1.0f);
                                                        boolean india5 = c0585q5.india(c0329s03) | c0585q5.india(orderTask3);
                                                        Object jade13 = c0585q5.jade();
                                                        if (india5 || jade13 == asVar6) {
                                                            jade13 = new ai(c0329s03, orderTask3, 7);
                                                            c0585q5.f(jade13);
                                                        }
                                                        db.n.foxtrot(0, maroon2, c0585q5, (Function0) jade13, booleanValue2);
                                                    } else {
                                                        c0585q5.purple(-2115878179);
                                                    }
                                                    c0585q5.quebec(false);
                                                    if (z42) {
                                                        c0585q5.purple(-2099170853);
                                                        boolean z49 = z46;
                                                        boolean hotel4 = c0585q5.hotel(z49) | c0585q5.india(c0329s03) | c0585q5.india(orderTask3);
                                                        Function1 function13 = function1;
                                                        boolean golf4 = hotel4 | c0585q5.golf(function13);
                                                        Object jade14 = c0585q5.jade();
                                                        if (golf4 || jade14 == asVar6) {
                                                            C0294a0 c0294a0 = new C0294a0(z49, c0329s03, orderTask3, function13, 1);
                                                            c0585q5.f(c0294a0);
                                                            jade14 = c0294a0;
                                                        }
                                                        Function0 function02 = (Function0) jade14;
                                                        boolean z50 = z43;
                                                        C0838c c0838c3 = c0838c;
                                                        if (z50) {
                                                            c0585q5.purple(-2098599244);
                                                            db.s.alpha(0, androidx.appcompat.widget.P0.maroon(1.0f), c0585q5, c0838c3.xray, function02, c0838c3.whiskey);
                                                            c0585q5.quebec(false);
                                                        } else {
                                                            c0585q5.purple(-2098108204);
                                                            T2.charlie(0, androidx.appcompat.widget.P0.maroon(1.0f), c0585q5, c0838c3.xray, function02, c0838c3.whiskey);
                                                            c0585q5.quebec(false);
                                                        }
                                                    } else {
                                                        c0585q5.purple(-2115878179);
                                                    }
                                                    c0585q5.quebec(false);
                                                    c0585q5.quebec(true);
                                                    c0585q5.quebec(true);
                                                } else {
                                                    c0585q5.ochre();
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        z26 = z46;
                                        c0329s02 = c0329s0;
                                        P.d echo4 = P.e.echo(73639403, lVar2, c0585q);
                                        c0585q.quebec(false);
                                        r72 = echo4;
                                    } else {
                                        c0329s02 = c0329s0;
                                        c0585q = c0585q4;
                                        pVar2 = pVar3;
                                        z26 = z16;
                                        context5 = context4;
                                        c0585q.purple(472823059);
                                        c0585q.quebec(false);
                                        r72 = obj2;
                                    }
                                    if (!z21 || !z36) {
                                        orderTask2 = orderTask;
                                        c0585q.purple(473070067);
                                        c0585q.quebec(false);
                                        obj4 = obj2;
                                    } else if (z25) {
                                        c0585q.purple(473166447);
                                        final ?? r12 = obj3;
                                        Xd.l lVar3 = new Xd.l() { // from class: Yb.Z
                                            @Override // Xd.l
                                            public final Object invoke(Object obj8, Object obj9) {
                                                boolean z47;
                                                InterfaceC0581m interfaceC0581m2 = (InterfaceC0581m) obj8;
                                                int intValue2 = ((Integer) obj9).intValue();
                                                if ((intValue2 & 3) != 2) {
                                                    z47 = true;
                                                } else {
                                                    z47 = false;
                                                }
                                                C0585q c0585q5 = (C0585q) interfaceC0581m2;
                                                if (c0585q5.magenta(intValue2 & 1, z47)) {
                                                    T.s charlie6 = androidx.compose.foundation.layout.V.charlie(T.p.alpha, 1.0f);
                                                    C0554u alpha4 = AbstractC0553t.alpha(AbstractC0542h.charlie, T.d.f2062f, c0585q5, 0);
                                                    long j7 = c0585q5.magenta;
                                                    int i35 = (int) (j7 ^ (j7 >>> 32));
                                                    androidx.compose.runtime.I mike3 = c0585q5.mike();
                                                    T.s charlie7 = T.a.charlie(charlie6, c0585q5);
                                                    InterfaceC2552l.maroon.getClass();
                                                    C2550j c2550j2 = C2551k.bravo;
                                                    c0585q5.white();
                                                    if (c0585q5.lime) {
                                                        c0585q5.lima(c2550j2);
                                                    } else {
                                                        c0585q5.i();
                                                    }
                                                    C0564b.blue(C2551k.foxtrot, c0585q5, alpha4);
                                                    C0564b.blue(C2551k.echo, c0585q5, mike3);
                                                    C2549i c2549i9 = C2551k.golf;
                                                    if (c0585q5.lime || !Intrinsics.areEqual(c0585q5.jade(), Integer.valueOf(i35))) {
                                                        ao.ad.blue(i35, c0585q5, i35, c2549i9);
                                                    }
                                                    C0564b.blue(C2551k.delta, c0585q5, charlie7);
                                                    P.d dVar = P.d.this;
                                                    if (dVar == null) {
                                                        c0585q5.purple(148228116);
                                                    } else {
                                                        c0585q5.purple(974612877);
                                                        dVar.invoke(c0585q5, 0);
                                                    }
                                                    c0585q5.quebec(false);
                                                    OrderTask orderTask3 = orderTask;
                                                    OrderAddress address4 = orderTask3.getAddress();
                                                    Intrinsics.checkNotNull(address4);
                                                    Float latitude = address4.getLatitude();
                                                    Intrinsics.checkNotNull(latitude);
                                                    double floatValue = latitude.floatValue();
                                                    OrderAddress address5 = orderTask3.getAddress();
                                                    Intrinsics.checkNotNull(address5);
                                                    Intrinsics.checkNotNull(address5.getLongitude());
                                                    AbstractC2672h7.alpha(d4, d9, floatValue, r2.floatValue(), null, c0585q5, 0);
                                                    P.d dVar2 = r72;
                                                    if (dVar2 == null) {
                                                        c0585q5.purple(148669556);
                                                    } else {
                                                        c0585q5.purple(974627117);
                                                        dVar2.invoke(c0585q5, 0);
                                                    }
                                                    c0585q5.quebec(false);
                                                    c0585q5.quebec(true);
                                                } else {
                                                    c0585q5.ochre();
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        orderTask2 = orderTask;
                                        Object echo5 = P.e.echo(-408355429, lVar3, c0585q);
                                        c0585q.quebec(false);
                                        obj4 = echo5;
                                    } else {
                                        orderTask2 = orderTask;
                                        Object obj8 = r72;
                                        Object obj9 = obj3;
                                        if (obj8 != null) {
                                            c0585q.purple(473880439);
                                            Object echo6 = P.e.echo(-886318628, new Cb.a(17, obj9, obj8), c0585q);
                                            c0585q.quebec(false);
                                            obj4 = echo6;
                                        } else {
                                            c0585q.purple(1400769689);
                                            c0585q.quebec(false);
                                            obj4 = obj9;
                                        }
                                    }
                                    ?? r31 = z22 ? AbstractC1650c.alpha : obj2;
                                    if (!z36 && z25) {
                                        c0585q.purple(474979699);
                                        boolean india4 = c0585q.india(orderTask2) | c0585q.india(context5);
                                        Object jade12 = c0585q.jade();
                                        if (india4 || jade12 == asVar4) {
                                            z18 = true;
                                            jade12 = new Yb.ah(orderTask2, context5, 1);
                                            c0585q.f(jade12);
                                        } else {
                                            z18 = true;
                                        }
                                        c0585q.quebec(false);
                                        r18 = (Function0) jade12;
                                    } else {
                                        z18 = true;
                                        c0585q.purple(475236595);
                                        c0585q.quebec(false);
                                        r18 = obj2;
                                    }
                                    c0585q.purple(1400806801);
                                    if (z36 || !Intrinsics.areEqual(orderTask2.getRequiresQrScan(), Boolean.TRUE)) {
                                        taskStatus3 = taskStatus;
                                    } else {
                                        taskStatus3 = taskStatus;
                                        if (orderTask2.getTaskStatus() == taskStatus3 && (c1708c3.alpha || !z15)) {
                                            z27 = z18 ? 1 : 0;
                                            z28 = (z22 || orderTask2.getTaskStatus() != taskStatus3) ? false : z18 ? 1 : 0;
                                            if (z27 && !z28) {
                                                c0585q.purple(1674479146);
                                                z29 = false;
                                                c0585q.quebec(false);
                                                obj5 = obj2;
                                            } else {
                                                z29 = false;
                                                c0585q.purple(1673651416);
                                                Object echo7 = P.e.echo(1344325681, new Mb.c(z27, c0329s02, orderTask2, z28), c0585q);
                                                c0585q.quebec(false);
                                                obj5 = echo7;
                                            }
                                            c0585q.quebec(z29);
                                            address = orderTask2.getAddress();
                                            if ((address == null ? address.getPhone() : obj2) == null) {
                                                c0585q.purple(476892399);
                                                boolean india5 = c0585q.india(orderTask2) | c0585q.india(context5);
                                                Object jade13 = c0585q.jade();
                                                if (india5 || jade13 == asVar4) {
                                                    jade13 = new Yb.ah(orderTask2, context5, 2);
                                                    c0585q.f(jade13);
                                                }
                                                c0585q.quebec(false);
                                                r19 = (Function0) jade13;
                                                z30 = z36;
                                            } else {
                                                c0585q.purple(476999379);
                                                c0585q.quebec(false);
                                                z30 = z36;
                                                r19 = obj2;
                                            }
                                            boolean z47 = (num != null && num.intValue() == i21) ? z18 ? 1 : 0 : false;
                                            pVar = pVar2;
                                            T.s charlie6 = androidx.compose.foundation.layout.V.charlie(pVar, 1.0f);
                                            if (z30) {
                                                c0585q.purple(477929411);
                                                i22 = 3;
                                                Object echo8 = P.e.echo(141747903, new Yb.ak(orderTask2, i22), c0585q);
                                                c0585q.quebec(false);
                                                obj2 = echo8;
                                            } else {
                                                i22 = 3;
                                                c0585q.purple(478539955);
                                                c0585q.quebec(false);
                                            }
                                            int i35 = i19 & 29360128;
                                            india = c0585q.india(orderTask2) | ((i35 != 8388608 || ((i19 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 && c0585q.india(c0329s02))) ? z18 ? 1 : 0 : false);
                                            jade2 = c0585q.jade();
                                            if (!india || jade2 == asVar4) {
                                                jade2 = new Yb.ai(orderTask2, c0329s02, i22);
                                                c0585q.f(jade2);
                                            }
                                            Function0 function02 = (Function0) jade2;
                                            hotel = c0585q.hotel(z26) | ((i35 != 8388608 || ((i19 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 && c0585q.india(c0329s02))) ? z18 ? 1 : 0 : false) | c0585q.india(orderTask2) | ((i15 & 112) == i18 ? z18 ? 1 : 0 : false);
                                            jade3 = c0585q.jade();
                                            if (!hotel || jade3 == asVar4) {
                                                OrderTask orderTask3 = orderTask2;
                                                C0294a0 c0294a0 = new C0294a0(z26, c0329s02, orderTask3, function1, 0);
                                                orderTask2 = orderTask3;
                                                c0585q.f(c0294a0);
                                                jade3 = c0294a0;
                                            }
                                            Function0 function03 = (Function0) jade3;
                                            int i36 = i15;
                                            india2 = ((i36 & 896) == 256 ? z18 ? 1 : 0 : false) | c0585q.india(orderTask2);
                                            jade4 = c0585q.jade();
                                            if (!india2 || jade4 == asVar4) {
                                                jade4 = new Yb.aq(function12, orderTask2, z18 ? 1 : 0);
                                                c0585q.f(jade4);
                                            }
                                            X4.alpha(c0838c2, function02, r18, r19, charlie6, lVar, function03, (Function0) jade4, null, P.e.echo(-971347984, new Yb.aj(orderTask2, l10, z18 ? 1 : 0), c0585q), z47, obj4, obj5, obj2, z21, r31, c0585q, 24584 | ((i36 << 21) & 29360128), 48, 33888);
                                            c0585q.quebec(z18);
                                            z19 = false;
                                        }
                                    }
                                    z27 = false;
                                    if (z22) {
                                    }
                                    if (z27) {
                                    }
                                    z29 = false;
                                    c0585q.purple(1673651416);
                                    Object echo72 = P.e.echo(1344325681, new Mb.c(z27, c0329s02, orderTask2, z28), c0585q);
                                    c0585q.quebec(false);
                                    obj5 = echo72;
                                    c0585q.quebec(z29);
                                    address = orderTask2.getAddress();
                                    if ((address == null ? address.getPhone() : obj2) == null) {
                                    }
                                    if (num != null) {
                                        pVar = pVar2;
                                        T.s charlie62 = androidx.compose.foundation.layout.V.charlie(pVar, 1.0f);
                                        if (z30) {
                                        }
                                        int i352 = i19 & 29360128;
                                        india = c0585q.india(orderTask2) | ((i352 != 8388608 || ((i19 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 && c0585q.india(c0329s02))) ? z18 ? 1 : 0 : false);
                                        jade2 = c0585q.jade();
                                        if (!india) {
                                        }
                                        jade2 = new Yb.ai(orderTask2, c0329s02, i22);
                                        c0585q.f(jade2);
                                        Function0 function022 = (Function0) jade2;
                                        hotel = c0585q.hotel(z26) | ((i352 != 8388608 || ((i19 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 && c0585q.india(c0329s02))) ? z18 ? 1 : 0 : false) | c0585q.india(orderTask2) | ((i15 & 112) == i18 ? z18 ? 1 : 0 : false);
                                        jade3 = c0585q.jade();
                                        if (!hotel) {
                                        }
                                        OrderTask orderTask32 = orderTask2;
                                        C0294a0 c0294a02 = new C0294a0(z26, c0329s02, orderTask32, function1, 0);
                                        orderTask2 = orderTask32;
                                        c0585q.f(c0294a02);
                                        jade3 = c0294a02;
                                        Function0 function032 = (Function0) jade3;
                                        int i362 = i15;
                                        india2 = ((i362 & 896) == 256 ? z18 ? 1 : 0 : false) | c0585q.india(orderTask2);
                                        jade4 = c0585q.jade();
                                        if (!india2) {
                                        }
                                        jade4 = new Yb.aq(function12, orderTask2, z18 ? 1 : 0);
                                        c0585q.f(jade4);
                                        X4.alpha(c0838c2, function022, r18, r19, charlie62, lVar, function032, (Function0) jade4, null, P.e.echo(-971347984, new Yb.aj(orderTask2, l10, z18 ? 1 : 0), c0585q), z47, obj4, obj5, obj2, z21, r31, c0585q, 24584 | ((i362 << 21) & 29360128), 48, 33888);
                                        c0585q.quebec(z18);
                                        z19 = false;
                                    }
                                    pVar = pVar2;
                                    T.s charlie622 = androidx.compose.foundation.layout.V.charlie(pVar, 1.0f);
                                    if (z30) {
                                    }
                                    int i3522 = i19 & 29360128;
                                    india = c0585q.india(orderTask2) | ((i3522 != 8388608 || ((i19 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 && c0585q.india(c0329s02))) ? z18 ? 1 : 0 : false);
                                    jade2 = c0585q.jade();
                                    if (!india) {
                                    }
                                    jade2 = new Yb.ai(orderTask2, c0329s02, i22);
                                    c0585q.f(jade2);
                                    Function0 function0222 = (Function0) jade2;
                                    hotel = c0585q.hotel(z26) | ((i3522 != 8388608 || ((i19 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 && c0585q.india(c0329s02))) ? z18 ? 1 : 0 : false) | c0585q.india(orderTask2) | ((i15 & 112) == i18 ? z18 ? 1 : 0 : false);
                                    jade3 = c0585q.jade();
                                    if (!hotel) {
                                    }
                                    OrderTask orderTask322 = orderTask2;
                                    C0294a0 c0294a022 = new C0294a0(z26, c0329s02, orderTask322, function1, 0);
                                    orderTask2 = orderTask322;
                                    c0585q.f(c0294a022);
                                    jade3 = c0294a022;
                                    Function0 function0322 = (Function0) jade3;
                                    int i3622 = i15;
                                    india2 = ((i3622 & 896) == 256 ? z18 ? 1 : 0 : false) | c0585q.india(orderTask2);
                                    jade4 = c0585q.jade();
                                    if (!india2) {
                                    }
                                    jade4 = new Yb.aq(function12, orderTask2, z18 ? 1 : 0);
                                    c0585q.f(jade4);
                                    X4.alpha(c0838c2, function0222, r18, r19, charlie622, lVar, function0322, (Function0) jade4, null, P.e.echo(-971347984, new Yb.aj(orderTask2, l10, z18 ? 1 : 0), c0585q), z47, obj4, obj5, obj2, z21, r31, c0585q, 24584 | ((i3622 << 21) & 29360128), 48, 33888);
                                    c0585q.quebec(z18);
                                    z19 = false;
                                }
                            } else {
                                asVar3 = asVar2;
                            }
                            str3 = str;
                            context3 = context9;
                            Intrinsics.echo(context3, str3);
                            z24 = z37;
                            SharedPreferences sharedPreferences = context3.getSharedPreferences("on_demand_invoice_qr", 0);
                            z23 = z38;
                            StringBuilder sb2 = new StringBuilder("qr_for_task_");
                            sb2.append(i32);
                            str4 = null;
                            obj = Boolean.valueOf(sharedPreferences.getString(sb2.toString(), null) == null);
                            c0585q4.f(obj);
                            final boolean booleanValue22 = ((Boolean) obj).booleanValue();
                            echo2 = c0585q4.echo(i32) | (i33 == 16384);
                            jade = c0585q4.jade();
                            if (!echo2) {
                            }
                            Intrinsics.echo(context3, str3);
                            jade = context3.getSharedPreferences("on_demand_entered_amount", 0).getString("entered_amount_for_task_" + i32, str4);
                            c0585q4.f(jade);
                            final String str52 = (String) jade;
                            if (z21) {
                            }
                            if (!z22) {
                            }
                            c0329s02 = c0329s0;
                            c0585q = c0585q4;
                            pVar2 = pVar3;
                            z26 = z16;
                            context5 = context4;
                            c0585q.purple(472823059);
                            c0585q.quebec(false);
                            r72 = obj2;
                            if (!z21) {
                            }
                            orderTask2 = orderTask;
                            c0585q.purple(473070067);
                            c0585q.quebec(false);
                            obj4 = obj2;
                            if (z22) {
                            }
                            if (!z36) {
                            }
                            z18 = true;
                            c0585q.purple(475236595);
                            c0585q.quebec(false);
                            r18 = obj2;
                            c0585q.purple(1400806801);
                            if (z36) {
                            }
                            taskStatus3 = taskStatus;
                            z27 = false;
                            if (z22) {
                            }
                            if (z27) {
                            }
                            z29 = false;
                            c0585q.purple(1673651416);
                            Object echo722 = P.e.echo(1344325681, new Mb.c(z27, c0329s02, orderTask2, z28), c0585q);
                            c0585q.quebec(false);
                            obj5 = echo722;
                            c0585q.quebec(z29);
                            address = orderTask2.getAddress();
                            if ((address == null ? address.getPhone() : obj2) == null) {
                            }
                            if (num != null) {
                            }
                            pVar = pVar2;
                            T.s charlie6222 = androidx.compose.foundation.layout.V.charlie(pVar, 1.0f);
                            if (z30) {
                            }
                            int i35222 = i19 & 29360128;
                            india = c0585q.india(orderTask2) | ((i35222 != 8388608 || ((i19 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 && c0585q.india(c0329s02))) ? z18 ? 1 : 0 : false);
                            jade2 = c0585q.jade();
                            if (!india) {
                            }
                            jade2 = new Yb.ai(orderTask2, c0329s02, i22);
                            c0585q.f(jade2);
                            Function0 function02222 = (Function0) jade2;
                            hotel = c0585q.hotel(z26) | ((i35222 != 8388608 || ((i19 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 && c0585q.india(c0329s02))) ? z18 ? 1 : 0 : false) | c0585q.india(orderTask2) | ((i15 & 112) == i18 ? z18 ? 1 : 0 : false);
                            jade3 = c0585q.jade();
                            if (!hotel) {
                            }
                            OrderTask orderTask3222 = orderTask2;
                            C0294a0 c0294a0222 = new C0294a0(z26, c0329s02, orderTask3222, function1, 0);
                            orderTask2 = orderTask3222;
                            c0585q.f(c0294a0222);
                            jade3 = c0294a0222;
                            Function0 function03222 = (Function0) jade3;
                            int i36222 = i15;
                            india2 = ((i36222 & 896) == 256 ? z18 ? 1 : 0 : false) | c0585q.india(orderTask2);
                            jade4 = c0585q.jade();
                            if (!india2) {
                            }
                            jade4 = new Yb.aq(function12, orderTask2, z18 ? 1 : 0);
                            c0585q.f(jade4);
                            X4.alpha(c0838c2, function02222, r18, r19, charlie6222, lVar, function03222, (Function0) jade4, null, P.e.echo(-971347984, new Yb.aj(orderTask2, l10, z18 ? 1 : 0), c0585q), z47, obj4, obj5, obj2, z21, r31, c0585q, 24584 | ((i36222 << 21) & 29360128), 48, 33888);
                            c0585q.quebec(z18);
                            z19 = false;
                        }
                    }
                    z20 = false;
                    if (orderTask.getTaskStatus() != taskStatus2) {
                    }
                    if (s6.H0.charlie(order, orderTask)) {
                    }
                    if (z22) {
                    }
                    if (z22) {
                    }
                    if (z22) {
                    }
                    echo = c0585q4.echo(i32) | (i33 != 16384);
                    Object jade112 = c0585q4.jade();
                    if (echo) {
                    }
                    str3 = str;
                    context3 = context9;
                    Intrinsics.echo(context3, str3);
                    z24 = z37;
                    SharedPreferences sharedPreferences2 = context3.getSharedPreferences("on_demand_invoice_qr", 0);
                    z23 = z38;
                    StringBuilder sb22 = new StringBuilder("qr_for_task_");
                    sb22.append(i32);
                    str4 = null;
                    obj = Boolean.valueOf(sharedPreferences2.getString(sb22.toString(), null) == null);
                    c0585q4.f(obj);
                    final boolean booleanValue222 = ((Boolean) obj).booleanValue();
                    echo2 = c0585q4.echo(i32) | (i33 == 16384);
                    jade = c0585q4.jade();
                    if (!echo2) {
                    }
                    Intrinsics.echo(context3, str3);
                    jade = context3.getSharedPreferences("on_demand_entered_amount", 0).getString("entered_amount_for_task_" + i32, str4);
                    c0585q4.f(jade);
                    final String str522 = (String) jade;
                    if (z21) {
                    }
                    if (!z22) {
                    }
                    c0329s02 = c0329s0;
                    c0585q = c0585q4;
                    pVar2 = pVar3;
                    z26 = z16;
                    context5 = context4;
                    c0585q.purple(472823059);
                    c0585q.quebec(false);
                    r72 = obj2;
                    if (!z21) {
                    }
                    orderTask2 = orderTask;
                    c0585q.purple(473070067);
                    c0585q.quebec(false);
                    obj4 = obj2;
                    if (z22) {
                    }
                    if (!z36) {
                    }
                    z18 = true;
                    c0585q.purple(475236595);
                    c0585q.quebec(false);
                    r18 = obj2;
                    c0585q.purple(1400806801);
                    if (z36) {
                    }
                    taskStatus3 = taskStatus;
                    z27 = false;
                    if (z22) {
                    }
                    if (z27) {
                    }
                    z29 = false;
                    c0585q.purple(1673651416);
                    Object echo7222 = P.e.echo(1344325681, new Mb.c(z27, c0329s02, orderTask2, z28), c0585q);
                    c0585q.quebec(false);
                    obj5 = echo7222;
                    c0585q.quebec(z29);
                    address = orderTask2.getAddress();
                    if ((address == null ? address.getPhone() : obj2) == null) {
                    }
                    if (num != null) {
                    }
                    pVar = pVar2;
                    T.s charlie62222 = androidx.compose.foundation.layout.V.charlie(pVar, 1.0f);
                    if (z30) {
                    }
                    int i352222 = i19 & 29360128;
                    india = c0585q.india(orderTask2) | ((i352222 != 8388608 || ((i19 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 && c0585q.india(c0329s02))) ? z18 ? 1 : 0 : false);
                    jade2 = c0585q.jade();
                    if (!india) {
                    }
                    jade2 = new Yb.ai(orderTask2, c0329s02, i22);
                    c0585q.f(jade2);
                    Function0 function022222 = (Function0) jade2;
                    hotel = c0585q.hotel(z26) | ((i352222 != 8388608 || ((i19 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 && c0585q.india(c0329s02))) ? z18 ? 1 : 0 : false) | c0585q.india(orderTask2) | ((i15 & 112) == i18 ? z18 ? 1 : 0 : false);
                    jade3 = c0585q.jade();
                    if (!hotel) {
                    }
                    OrderTask orderTask32222 = orderTask2;
                    C0294a0 c0294a02222 = new C0294a0(z26, c0329s02, orderTask32222, function1, 0);
                    orderTask2 = orderTask32222;
                    c0585q.f(c0294a02222);
                    jade3 = c0294a02222;
                    Function0 function032222 = (Function0) jade3;
                    int i362222 = i15;
                    india2 = ((i362222 & 896) == 256 ? z18 ? 1 : 0 : false) | c0585q.india(orderTask2);
                    jade4 = c0585q.jade();
                    if (!india2) {
                    }
                    jade4 = new Yb.aq(function12, orderTask2, z18 ? 1 : 0);
                    c0585q.f(jade4);
                    X4.alpha(c0838c2, function022222, r18, r19, charlie62222, lVar, function032222, (Function0) jade4, null, P.e.echo(-971347984, new Yb.aj(orderTask2, l10, z18 ? 1 : 0), c0585q), z47, obj4, obj5, obj2, z21, r31, c0585q, 24584 | ((i362222 << 21) & 29360128), 48, 33888);
                    c0585q.quebec(z18);
                    z19 = false;
                } else {
                    c0585q = c0585q4;
                    pVar = pVar3;
                    z18 = true;
                    z19 = false;
                    c0585q.purple(741281671);
                }
                c0585q.quebec(z19);
                c0585q.quebec(z18);
                sVar2 = pVar;
            } else {
                androidx.compose.runtime.Q uniform = c0585q3.uniform();
                if (uniform != null) {
                    uniform.delta = new Yb.al(orderTask, order, i4, i5, expandedByTaskId, z2, z10, c0329s0, set, lVar, function1, function12, num, i10, l10, d4, d9, function0, i11, i12);
                    return;
                }
                return;
            }
        } else {
            c0585q = c0585q3;
            c0585q.ochre();
            sVar2 = sVar;
        }
        androidx.compose.runtime.Q uniform2 = c0585q.uniform();
        if (uniform2 != null) {
            uniform2.delta = new Xd.l() { // from class: Yb.b0
                @Override // Xd.l
                public final Object invoke(Object obj10, Object obj11) {
                    ((Integer) obj11).getClass();
                    int cyan = C0564b.cyan(i11 | 1);
                    int cyan2 = C0564b.cyan(i12);
                    OrderTask orderTask4 = OrderTask.this;
                    Order order2 = order;
                    double d10 = d9;
                    Function0 function04 = function0;
                    AbstractC3046q2.alpha(orderTask4, order2, i4, i5, expandedByTaskId, z2, z10, c0329s0, sVar2, set, lVar, function1, function12, num, i10, l10, d4, d10, function04, (InterfaceC0581m) obj10, cyan, cyan2);
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
