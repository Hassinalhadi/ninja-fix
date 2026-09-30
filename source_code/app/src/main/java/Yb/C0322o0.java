package Yb;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import com.app.network.network.models.Order;
import com.app.network.network.models.OrderAsset;
import com.app.network.network.models.OrderTask;
import delivery.samurai.android.R;
import delivery.samurai.android.ui.chat.ChatActivity;
import delivery.samurai.android.ui.orders.v2.ProcessOrderActivityV2;
import delivery.samurai.android.ui.scanner.ScannerActivity;
import delivery.samurai.android.ui.support.AddSupportTicketActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* renamed from: Yb.o0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0322o0 implements Function0 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ ProcessOrderActivityV2 purple;

    public /* synthetic */ C0322o0(ProcessOrderActivityV2 processOrderActivityV2, int i4) {
        this.alpha = i4;
        this.purple = processOrderActivityV2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:78:0x0167, code lost:
    
        if (r6 == null) goto L76;
     */
    @Override // kotlin.jvm.functions.Function0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        Pair pair;
        List<OrderAsset> assets;
        Integer id2;
        String chatUrl;
        String str;
        Integer num = null;
        List<OrderAsset> list = null;
        ProcessOrderActivityV2 processOrderActivityV2 = this.purple;
        switch (this.alpha) {
            case 0:
                ((androidx.compose.runtime.t0) processOrderActivityV2.f12432x0).setValue(Boolean.TRUE);
                processOrderActivityV2.gray();
                return Unit.INSTANCE;
            case 1:
                int i4 = ProcessOrderActivityV2.f12378N0;
                processOrderActivityV2.gray();
                return Unit.INSTANCE;
            case 2:
                ((androidx.compose.runtime.t0) processOrderActivityV2.f12402S).setValue(Boolean.FALSE);
                Order order = (Order) ((androidx.compose.runtime.t0) processOrderActivityV2.f12431w0).getValue();
                if (order != null) {
                    processOrderActivityV2.lavender(order);
                }
                return Unit.INSTANCE;
            case 3:
                ((androidx.compose.runtime.t0) processOrderActivityV2.f12403T).setValue(Boolean.FALSE);
                ((androidx.compose.runtime.t0) processOrderActivityV2.f12402S).setValue(Boolean.TRUE);
                return Unit.INSTANCE;
            case 4:
                ((androidx.compose.runtime.t0) processOrderActivityV2.f12403T).setValue(Boolean.FALSE);
                ((androidx.compose.runtime.t0) processOrderActivityV2.f12402S).setValue(Boolean.TRUE);
                return Unit.INSTANCE;
            case 5:
                int i5 = ProcessOrderActivityV2.f12378N0;
                processOrderActivityV2.getOnBackPressedDispatcher().delta();
                return Unit.INSTANCE;
            case 6:
                Order order2 = (Order) ((androidx.compose.runtime.t0) processOrderActivityV2.f12431w0).getValue();
                if (order2 != null) {
                    List<OrderTask> tasks = order2.getTasks();
                    if (tasks == null) {
                        tasks = CollectionsKt.emptyList();
                    }
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : tasks) {
                        if (Intrinsics.areEqual(((OrderTask) obj).getEligibleForSupport(), Boolean.TRUE)) {
                            arrayList.add(obj);
                        }
                    }
                    if (arrayList.size() > 1) {
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            OrderTask orderTask = (OrderTask) it.next();
                            Integer orderId = orderTask.getOrderId();
                            if (orderId != null) {
                                int intValue = orderId.intValue();
                                String orderDisplayId = orderTask.getOrderDisplayId();
                                if (orderDisplayId != null) {
                                    if (StringsKt.gray(orderDisplayId)) {
                                        orderDisplayId = null;
                                        break;
                                    }
                                }
                                orderDisplayId = processOrderActivityV2.getString(R.string.order_number_s, String.valueOf(intValue));
                                Intrinsics.delta(orderDisplayId, "getString(...)");
                                pair = new Pair(orderId, orderDisplayId);
                            } else {
                                pair = null;
                            }
                            if (pair != null) {
                                arrayList2.add(pair);
                            }
                        }
                        Map yankee = kotlin.collections.y.yankee(arrayList2);
                        List orderIds = CollectionsKt.z(yankee.keySet());
                        C0324p0 c0324p0 = new C0324p0(processOrderActivityV2, 3);
                        Intrinsics.echo(orderIds, "orderIds");
                        Zb.b bVar = new Zb.b();
                        Bundle bundle = new Bundle();
                        bundle.putIntArray("ARG_ORDER_IDS", CollectionsKt.y(orderIds));
                        bundle.putIntArray("ARG_DISPLAY_KEYS", CollectionsKt.y(yankee.keySet()));
                        bundle.putStringArray("ARG_DISPLAY_VALS", (String[]) yankee.values().toArray(new String[0]));
                        bVar.setArguments(bundle);
                        bVar.f2527u = c0324p0;
                        bVar.romeo(processOrderActivityV2.getSupportFragmentManager(), "ChooseOrderSheet");
                    } else {
                        OrderTask orderTask2 = (OrderTask) CollectionsKt.green(arrayList);
                        if (orderTask2 != null) {
                            num = orderTask2.getOrderId();
                        }
                        if (num == null) {
                            num = order2.getId();
                        }
                        Intent intent = new Intent(processOrderActivityV2, (Class<?>) AddSupportTicketActivity.class);
                        if (num != null) {
                            intent.putExtra("ORDER_ID", num.intValue());
                        }
                        processOrderActivityV2.startActivity(intent);
                    }
                }
                return Unit.INSTANCE;
            case 7:
                int i10 = ProcessOrderActivityV2.f12378N0;
                processOrderActivityV2.gray();
                return Unit.INSTANCE;
            case 8:
                Order order3 = (Order) ((androidx.compose.runtime.t0) processOrderActivityV2.f12431w0).getValue();
                if (order3 != null && (assets = order3.getAssets()) != null) {
                    if (!assets.isEmpty()) {
                        list = assets;
                    }
                    if (list != null) {
                        C0313k c0313k = new C0313k();
                        c0313k.f2423u = list;
                        c0313k.f14101q = true;
                        c0313k.romeo(processOrderActivityV2.getSupportFragmentManager(), "");
                    }
                }
                return Unit.INSTANCE;
            case 9:
                Order order4 = (Order) ((androidx.compose.runtime.t0) processOrderActivityV2.f12431w0).getValue();
                if (order4 != null && (chatUrl = order4.getChatUrl()) != null) {
                    AtomicInteger atomicInteger = L9.d.alpha;
                    Intent putExtra = new Intent(processOrderActivityV2, (Class<?>) ChatActivity.class).putExtra("CHAT_URL", chatUrl);
                    Intrinsics.delta(putExtra, "putExtra(...)");
                    processOrderActivityV2.startActivity(putExtra);
                }
                Order order5 = (Order) ((androidx.compose.runtime.t0) processOrderActivityV2.f12431w0).getValue();
                if (order5 != null && (id2 = order5.getId()) != null) {
                    L9.d.uniform(processOrderActivityV2, id2.intValue(), false);
                    ((androidx.compose.runtime.t0) processOrderActivityV2.f12429t0).setValue(Boolean.FALSE);
                }
                return Unit.INSTANCE;
            case 10:
                ((androidx.compose.runtime.t0) processOrderActivityV2.f12402S).setValue(Boolean.FALSE);
                Order order6 = (Order) ((androidx.compose.runtime.t0) processOrderActivityV2.f12431w0).getValue();
                if (order6 != null) {
                    processOrderActivityV2.lavender(order6);
                }
                return Unit.INSTANCE;
            case 11:
                processOrderActivityV2.f12413d0.alpha("android.permission.CAMERA");
                return Unit.INSTANCE;
            case 12:
                int i11 = ProcessOrderActivityV2.f12378N0;
                return new ag(new w.o(processOrderActivityV2));
            case 13:
                ah.b bVar2 = processOrderActivityV2.f12414e0;
                if (Build.VERSION.SDK_INT >= 33) {
                    str = "android.permission.READ_MEDIA_IMAGES";
                } else {
                    str = "android.permission.READ_EXTERNAL_STORAGE";
                }
                bVar2.alpha(str);
                return Unit.INSTANCE;
            case 14:
                int i12 = ProcessOrderActivityV2.f12378N0;
                return new S(new J2.c(processOrderActivityV2));
            case 15:
                processOrderActivityV2.f12417h0.alpha(new Intent(processOrderActivityV2, (Class<?>) ScannerActivity.class));
                return Unit.INSTANCE;
            default:
                processOrderActivityV2.f12409Z = null;
                return Unit.INSTANCE;
        }
    }
}
