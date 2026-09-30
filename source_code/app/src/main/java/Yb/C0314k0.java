package Yb;

import android.app.AlertDialog;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import com.app.network.network.models.Order;
import com.app.network.network.models.OrderTask;
import com.app.network.network.models.UserInfo;
import com.app.network.network.models.ZenDeskCredentials;
import com.canhub.cropper.CropImageOptions;
import delivery.samurai.android.R;
import delivery.samurai.android.ui.orders.v2.ProcessOrderActivityV2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: Yb.k0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0314k0 implements Xd.l {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ ProcessOrderActivityV2 purple;

    public /* synthetic */ C0314k0(ProcessOrderActivityV2 processOrderActivityV2, int i4) {
        this.alpha = i4;
        this.purple = processOrderActivityV2;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        boolean z2;
        boolean z10;
        ZenDeskCredentials zenDeskCredentials;
        boolean z11;
        List<OrderTask> list;
        String str;
        Function0 function0;
        int intValue;
        Integer id2;
        Iterator<OrderTask> it;
        int i4;
        ProcessOrderActivityV2 processOrderActivityV2 = this.purple;
        switch (this.alpha) {
            case 0:
                InterfaceC0581m interfaceC0581m = (InterfaceC0581m) obj;
                int intValue2 = ((Integer) obj2).intValue();
                int i5 = ProcessOrderActivityV2.f12378N0;
                if ((intValue2 & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                int i10 = 1;
                C0585q c0585q = (C0585q) interfaceC0581m;
                if (c0585q.magenta(intValue2 & 1, z2)) {
                    s6.I0.alpha(P.e.echo(-1607425360, new C0314k0(processOrderActivityV2, i10), c0585q), c0585q, 48);
                } else {
                    c0585q.ochre();
                }
                return Unit.INSTANCE;
            case 1:
                InterfaceC0581m interfaceC0581m2 = (InterfaceC0581m) obj;
                int intValue3 = ((Integer) obj2).intValue();
                int i11 = ProcessOrderActivityV2.f12378N0;
                if ((intValue3 & 3) != 2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                C0585q c0585q2 = (C0585q) interfaceC0581m2;
                if (c0585q2.magenta(intValue3 & 1, z10)) {
                    androidx.compose.runtime.ax axVar = processOrderActivityV2.f12431w0;
                    androidx.compose.runtime.ax axVar2 = processOrderActivityV2.f12432x0;
                    boolean india = c0585q2.india(processOrderActivityV2);
                    Object jade = c0585q2.jade();
                    androidx.compose.runtime.as asVar = C0580l.alpha;
                    if (india || jade == asVar) {
                        jade = new C0322o0(processOrderActivityV2, 0);
                        c0585q2.f(jade);
                    }
                    Function0 function02 = (Function0) jade;
                    boolean india2 = c0585q2.india(processOrderActivityV2);
                    Object jade2 = c0585q2.jade();
                    if (india2 || jade2 == asVar) {
                        jade2 = new C0322o0(processOrderActivityV2, 5);
                        c0585q2.f(jade2);
                    }
                    Function0 function03 = (Function0) jade2;
                    UserInfo userInfo = (UserInfo) processOrderActivityV2.oscar().getValue();
                    if (userInfo != null) {
                        zenDeskCredentials = userInfo.getZendesk();
                    } else {
                        zenDeskCredentials = null;
                    }
                    if (zenDeskCredentials != null) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    boolean india3 = c0585q2.india(processOrderActivityV2);
                    Object jade3 = c0585q2.jade();
                    if (india3 || jade3 == asVar) {
                        jade3 = new C0322o0(processOrderActivityV2, 6);
                        c0585q2.f(jade3);
                    }
                    Function0 function04 = (Function0) jade3;
                    androidx.compose.runtime.t0 t0Var = (androidx.compose.runtime.t0) axVar;
                    Order order = (Order) t0Var.getValue();
                    if (order != null) {
                        list = order.getTasks();
                    } else {
                        list = null;
                    }
                    if (list == null) {
                        list = CollectionsKt.emptyList();
                    }
                    ArrayList arrayList = new ArrayList();
                    Iterator<T> it2 = list.iterator();
                    while (it2.hasNext()) {
                        Integer id3 = ((OrderTask) it2.next()).getId();
                        if (id3 != null) {
                            arrayList.add(id3);
                        }
                    }
                    Set D10 = CollectionsKt.D(arrayList);
                    LinkedHashMap linkedHashMap = processOrderActivityV2.f12383E0;
                    List z12 = CollectionsKt.z(linkedHashMap.keySet());
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj3 : z12) {
                        if (!D10.contains(Integer.valueOf(((Number) obj3).intValue()))) {
                            arrayList2.add(obj3);
                        }
                    }
                    Iterator it3 = arrayList2.iterator();
                    while (it3.hasNext()) {
                        linkedHashMap.remove(Integer.valueOf(((Number) it3.next()).intValue()));
                    }
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    Iterator<OrderTask> it4 = list.iterator();
                    while (it4.hasNext()) {
                        OrderTask next = it4.next();
                        Integer remainingHandShakeSeconds = next.getRemainingHandShakeSeconds();
                        if (remainingHandShakeSeconds != null && (intValue = remainingHandShakeSeconds.intValue()) > 0 && (id2 = next.getId()) != null) {
                            Pair pair = (Pair) linkedHashMap.get(id2);
                            if (pair != null) {
                                it = it4;
                                if (((Number) pair.getFirst()).intValue() == intValue) {
                                    linkedHashMap2.put(id2, pair.getSecond());
                                    it4 = it;
                                }
                            } else {
                                it = it4;
                            }
                            androidx.compose.runtime.ax axVar3 = axVar;
                            long currentTimeMillis = (intValue * 1000) + System.currentTimeMillis();
                            linkedHashMap.put(id2, new Pair(remainingHandShakeSeconds, Long.valueOf(currentTimeMillis)));
                            linkedHashMap2.put(id2, Long.valueOf(currentTimeMillis));
                            it4 = it;
                            axVar = axVar3;
                            axVar2 = axVar2;
                        }
                    }
                    androidx.compose.runtime.ax axVar4 = axVar;
                    androidx.compose.runtime.ax axVar5 = axVar2;
                    androidx.compose.runtime.ax axVar6 = processOrderActivityV2.f12422m0;
                    androidx.compose.runtime.ax axVar7 = processOrderActivityV2.f12423n0;
                    boolean india4 = c0585q2.india(processOrderActivityV2);
                    Object jade4 = c0585q2.jade();
                    if (india4 || jade4 == asVar) {
                        jade4 = new C0324p0(processOrderActivityV2, 0);
                        c0585q2.f(jade4);
                    }
                    Function1 function1 = (Function1) jade4;
                    boolean india5 = c0585q2.india(processOrderActivityV2);
                    Object jade5 = c0585q2.jade();
                    if (india5 || jade5 == asVar) {
                        jade5 = new C0314k0(processOrderActivityV2, 3);
                        c0585q2.f(jade5);
                    }
                    Xd.l lVar = (Xd.l) jade5;
                    boolean india6 = c0585q2.india(processOrderActivityV2);
                    Object jade6 = c0585q2.jade();
                    if (india6 || jade6 == asVar) {
                        jade6 = new C0324p0(processOrderActivityV2, 1);
                        c0585q2.f(jade6);
                    }
                    Function1 function12 = (Function1) jade6;
                    boolean india7 = c0585q2.india(processOrderActivityV2);
                    Object jade7 = c0585q2.jade();
                    if (india7 || jade7 == asVar) {
                        jade7 = new C0324p0(processOrderActivityV2, 2);
                        c0585q2.f(jade7);
                    }
                    Function1 function13 = (Function1) jade7;
                    androidx.compose.runtime.ax axVar8 = processOrderActivityV2.f12407X;
                    androidx.compose.runtime.ax axVar9 = processOrderActivityV2.f12428s0;
                    boolean india8 = c0585q2.india(processOrderActivityV2);
                    Object jade8 = c0585q2.jade();
                    if (india8 || jade8 == asVar) {
                        jade8 = new C0322o0(processOrderActivityV2, 8);
                        c0585q2.f(jade8);
                    }
                    Function0 function05 = (Function0) jade8;
                    Order order2 = (Order) t0Var.getValue();
                    if (order2 != null) {
                        str = order2.getChatUrl();
                    } else {
                        str = null;
                    }
                    if (str != null) {
                        c0585q2.purple(2078291267);
                        boolean india9 = c0585q2.india(processOrderActivityV2);
                        Object jade9 = c0585q2.jade();
                        if (india9 || jade9 == asVar) {
                            jade9 = new C0322o0(processOrderActivityV2, 9);
                            c0585q2.f(jade9);
                        }
                        c0585q2.quebec(false);
                        function0 = (Function0) jade9;
                    } else {
                        c0585q2.purple(2078650029);
                        c0585q2.quebec(false);
                        function0 = null;
                    }
                    Zb.d.foxtrot(axVar4, axVar5, function02, function03, z11, function04, processOrderActivityV2.f12381C0, processOrderActivityV2.f12382D0, linkedHashMap2, axVar6, axVar7, processOrderActivityV2.f12384F0, function1, processOrderActivityV2.f12427r0, lVar, function12, function13, axVar8, axVar9, function05, function0, processOrderActivityV2.f12429t0, processOrderActivityV2.f12424o0, processOrderActivityV2.f12425p0, c0585q2, 0, 0, 0, 0);
                    boolean booleanValue = ((Boolean) ((androidx.compose.runtime.t0) processOrderActivityV2.f12402S).getValue()).booleanValue();
                    boolean india10 = c0585q2.india(processOrderActivityV2);
                    Object jade10 = c0585q2.jade();
                    if (india10 || jade10 == asVar) {
                        jade10 = new C0322o0(processOrderActivityV2, 10);
                        c0585q2.f(jade10);
                    }
                    Function0 function06 = (Function0) jade10;
                    boolean india11 = c0585q2.india(processOrderActivityV2);
                    Object jade11 = c0585q2.jade();
                    if (india11 || jade11 == asVar) {
                        jade11 = new C0322o0(processOrderActivityV2, 2);
                        c0585q2.f(jade11);
                    }
                    Zb.g.delta(booleanValue, function06, (Function0) jade11, c0585q2, 0);
                    boolean booleanValue2 = ((Boolean) ((androidx.compose.runtime.t0) processOrderActivityV2.f12403T).getValue()).booleanValue();
                    boolean india12 = c0585q2.india(processOrderActivityV2);
                    Object jade12 = c0585q2.jade();
                    if (india12 || jade12 == asVar) {
                        jade12 = new C0322o0(processOrderActivityV2, 3);
                        c0585q2.f(jade12);
                    }
                    Function0 function07 = (Function0) jade12;
                    boolean india13 = c0585q2.india(processOrderActivityV2);
                    Object jade13 = c0585q2.jade();
                    if (india13 || jade13 == asVar) {
                        jade13 = new C0322o0(processOrderActivityV2, 4);
                        c0585q2.f(jade13);
                    }
                    Zb.d.echo(booleanValue2, function07, (Function0) jade13, c0585q2, 0);
                    androidx.compose.runtime.ax axVar10 = processOrderActivityV2.f12433y0;
                    androidx.compose.runtime.ax axVar11 = processOrderActivityV2.f12379A0;
                    androidx.compose.runtime.ax axVar12 = processOrderActivityV2.f12380B0;
                    androidx.compose.runtime.ax axVar13 = processOrderActivityV2.f12434z0;
                    boolean india14 = c0585q2.india(processOrderActivityV2);
                    Object jade14 = c0585q2.jade();
                    if (india14 || jade14 == asVar) {
                        jade14 = new C0314k0(processOrderActivityV2, 2);
                        c0585q2.f(jade14);
                    }
                    s6.I0.bravo(axVar4, axVar10, axVar11, axVar12, axVar13, (Xd.l) jade14, c0585q2, 0);
                } else {
                    c0585q2.ochre();
                }
                return Unit.INSTANCE;
            case 2:
                OrderTask task = (OrderTask) obj;
                String amount = (String) obj2;
                int i12 = ProcessOrderActivityV2.f12378N0;
                Intrinsics.echo(task, "task");
                Intrinsics.echo(amount, "amount");
                processOrderActivityV2.getClass();
                Integer id4 = task.getId();
                if (id4 != null) {
                    int intValue4 = id4.intValue();
                    processOrderActivityV2.getSharedPreferences("on_demand_entered_amount", 0).edit().putString("entered_amount_for_task_" + intValue4, amount).apply();
                    androidx.compose.runtime.t0 t0Var2 = (androidx.compose.runtime.t0) processOrderActivityV2.f12428s0;
                    t0Var2.setValue(Integer.valueOf(((Number) t0Var2.getValue()).intValue() + 1));
                }
                return Unit.INSTANCE;
            case 3:
                String itemId = (String) obj;
                boolean booleanValue3 = ((Boolean) obj2).booleanValue();
                int i13 = ProcessOrderActivityV2.f12378N0;
                Intrinsics.echo(itemId, "itemId");
                if (booleanValue3) {
                    processOrderActivityV2.f12427r0.add(itemId);
                } else {
                    processOrderActivityV2.f12427r0.remove(itemId);
                }
                return Unit.INSTANCE;
            case 4:
                boolean booleanValue4 = ((Boolean) obj).booleanValue();
                boolean booleanValue5 = ((Boolean) obj2).booleanValue();
                int i14 = ProcessOrderActivityV2.f12378N0;
                CropImageOptions cropImageOptions = new CropImageOptions(null, null, 0.0f, 0.0f, 0.0f, a4.y.purple, null, false, false, false, false, false, false, 0, 0.0f, false, 0, 0, 0.0f, 0, 0.0f, 0.0f, 0.0f, 0, 0, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, false, 0.0f, 0, null, -129, -1);
                cropImageOptions.purple = booleanValue4;
                cropImageOptions.alpha = booleanValue5;
                processOrderActivityV2.f12389I0.alpha(new a4.t(cropImageOptions));
                return Unit.INSTANCE;
            default:
                String which = (String) obj;
                Function0 onOpen = (Function0) obj2;
                int i15 = ProcessOrderActivityV2.f12378N0;
                Intrinsics.echo(which, "which");
                Intrinsics.echo(onOpen, "onOpen");
                if (Intrinsics.areEqual(which, "android.permission.CAMERA")) {
                    i4 = R.string.permission_required_msg_camera;
                } else {
                    i4 = R.string.permission_required_msg_gallery;
                }
                new AlertDialog.Builder(processOrderActivityV2).setTitle(R.string.permission_required_title).setMessage(i4).setPositiveButton(R.string.open_settings, new Da.l(onOpen, 3)).setNegativeButton(R.string.cancel, new DialogInterfaceOnClickListenerC0318m0(processOrderActivityV2, 2)).show();
                return Unit.INSTANCE;
        }
    }
}
