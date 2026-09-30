package Yb;

import android.content.SharedPreferences;
import com.app.network.network.models.Order;
import com.app.network.network.models.OrderTask;
import com.app.network.network.models.Platform;
import com.app.network.network.models.PlatformSettings;
import com.app.network.network.models.TaskStatus;
import com.app.network.network.models.TaskType;
import delivery.samurai.android.R;
import delivery.samurai.android.ui.orders.v2.ProcessOrderActivityV2;
import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import s6.W4;

/* renamed from: Yb.s0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0329s0 {
    public final /* synthetic */ ProcessOrderActivityV2 alpha;

    public /* synthetic */ C0329s0(ProcessOrderActivityV2 processOrderActivityV2) {
        this.alpha = processOrderActivityV2;
    }

    public void alpha(OrderTask orderTask) {
        O0 o02 = new O0();
        o02.f2338u = orderTask;
        o02.f14101q = true;
        o02.romeo(this.alpha.getSupportFragmentManager(), null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:164:0x029c, code lost:
    
        if (r0.exists() != false) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x01fe, code lost:
    
        if (r4.exists() != false) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x022a, code lost:
    
        if (r4.exists() != false) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x011e, code lost:
    
        if (r4.doubleValue() > 0.0d) goto L56;
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0124  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void bravo(final OrderTask orderTask, final TaskStatus targetStatus) {
        boolean z2;
        boolean z10;
        boolean z11;
        boolean z12;
        File file;
        File file2;
        PlatformSettings settings;
        PlatformSettings settings2;
        PlatformSettings settings3;
        boolean z13;
        File file3;
        PlatformSettings settings4;
        boolean z14;
        Platform platform;
        PlatformSettings settings5;
        String str;
        Double d4;
        Integer id2;
        String str2;
        final int i4 = 0;
        final int i5 = 1;
        Intrinsics.echo(targetStatus, "targetStatus");
        int i10 = ProcessOrderActivityV2.f12378N0;
        final C0333u0 callbacks = this.alpha.f12387H0;
        Intrinsics.echo(callbacks, "callbacks");
        ProcessOrderActivityV2 processOrderActivityV2 = callbacks.alpha;
        final Order order = processOrderActivityV2.f12418i0;
        if (order != null) {
            String str3 = null;
            if (s6.H0.charlie(order, orderTask) && targetStatus == TaskStatus.COMPLETED) {
                Boolean requiresInvoice = orderTask.getRequiresInvoice();
                Boolean bool = Boolean.TRUE;
                if (Intrinsics.areEqual(requiresInvoice, bool) && !callbacks.echo(orderTask)) {
                    L9.d.pink(processOrderActivityV2, callbacks.delta(R.string.attach_receipt_msg));
                    return;
                }
                boolean areEqual = Intrinsics.areEqual(orderTask.getRequiresAmountInput(), bool);
                if (!areEqual && Intrinsics.areEqual(orderTask.getRequiresInvoiceQrCode(), bool)) {
                    Integer id3 = orderTask.getId();
                    if (id3 != null) {
                        int intValue = id3.intValue();
                        str2 = processOrderActivityV2.getSharedPreferences("on_demand_invoice_qr", 0).getString("qr_for_task_" + intValue, null);
                    } else {
                        str2 = null;
                    }
                    if (str2 == null) {
                        L9.d.pink(processOrderActivityV2, callbacks.delta(R.string.scan_invoice_qr_required));
                        return;
                    }
                    str = str2;
                } else {
                    str = null;
                }
                if (areEqual) {
                    Integer id4 = orderTask.getId();
                    if (id4 != null) {
                        int intValue2 = id4.intValue();
                        String string = processOrderActivityV2.getSharedPreferences("on_demand_entered_amount", 0).getString("entered_amount_for_task_" + intValue2, null);
                        if (string != null) {
                            str3 = string;
                        } else {
                            Float payAtPickup = orderTask.getPayAtPickup();
                            if (payAtPickup != null) {
                                if (payAtPickup.floatValue() <= 0.0f) {
                                    payAtPickup = null;
                                }
                                if (payAtPickup != null) {
                                    d4 = Double.valueOf(payAtPickup.floatValue());
                                    if (d4 != null) {
                                        str3 = String.format(Locale.US, "%.2f", Arrays.copyOf(new Object[]{Double.valueOf(d4.doubleValue())}, 1));
                                    }
                                }
                            }
                            Order order2 = processOrderActivityV2.f12418i0;
                            if (order2 != null && (id2 = order2.getId()) != null) {
                                int intValue3 = id2.intValue();
                                SharedPreferences sharedPreferences = processOrderActivityV2.getSharedPreferences("on_demand_amounts", 0);
                                if (!sharedPreferences.contains("amount_for_order_" + intValue3)) {
                                    d4 = null;
                                } else {
                                    d4 = Double.valueOf(Double.longBitsToDouble(sharedPreferences.getLong("amount_for_order_" + intValue3, 0L)));
                                }
                                if (d4 != null) {
                                }
                            }
                            d4 = null;
                            if (d4 != null) {
                            }
                        }
                    }
                    if (str3 == null) {
                        L9.d.pink(processOrderActivityV2, callbacks.delta(R.string.enter_invoice_total_price_required));
                        return;
                    }
                } else {
                    Float payAtPickup2 = orderTask.getPayAtPickup();
                    if (payAtPickup2 != null) {
                        if (payAtPickup2.floatValue() <= 0.0f) {
                            payAtPickup2 = null;
                        }
                        if (payAtPickup2 != null) {
                            str3 = payAtPickup2.toString();
                        }
                    }
                }
                String str4 = str3;
                Integer id5 = orderTask.getId();
                if (id5 != null) {
                    Q0.c.bronze(callbacks, id5.intValue(), targetStatus, str4, null, null, str, 56);
                    return;
                }
                return;
            }
            TaskType taskType = orderTask.getTaskType();
            TaskType taskType2 = TaskType.PICK_UP;
            if ((taskType == taskType2 || orderTask.getTaskType() == TaskType.ON_DEMAND_PICK_UP) && targetStatus == TaskStatus.COMPLETED) {
                Platform platform2 = order.getPlatform();
                if (platform2 != null && (settings3 = platform2.getSettings()) != null) {
                    z2 = Intrinsics.areEqual(settings3.getCaptainReceiptRequired(), Boolean.TRUE);
                } else {
                    z2 = false;
                }
                if (z2) {
                    Platform platform3 = order.getPlatform();
                    if (platform3 != null && (settings2 = platform3.getSettings()) != null) {
                        z10 = Intrinsics.areEqual(settings2.getCaptainReceiptRequired(), Boolean.TRUE);
                    } else {
                        z10 = false;
                    }
                    if (z10 && !callbacks.echo(orderTask)) {
                        L9.d.pink(processOrderActivityV2, callbacks.delta(R.string.attach_receipt_msg));
                        return;
                    }
                    Platform platform4 = order.getPlatform();
                    if (platform4 != null && (settings = platform4.getSettings()) != null) {
                        z11 = Intrinsics.areEqual(settings.getPickupTaskConfirmationImageRequired(), Boolean.TRUE);
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        String quebec = L9.d.quebec(processOrderActivityV2, orderTask.generateImageId());
                        if (quebec != null) {
                            file2 = new File(quebec);
                        }
                        file2 = null;
                        if (file2 == null) {
                            L9.d.pink(processOrderActivityV2, callbacks.delta(R.string.take_proof_description));
                            return;
                        }
                    }
                    if (orderTask.getTaskType() == TaskType.ON_DEMAND_PICK_UP) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    String juliet = L9.d.juliet(processOrderActivityV2, orderTask.generateImageId());
                    if (juliet != null) {
                        file = new File(juliet);
                    }
                    file = null;
                    if (z12) {
                        final int i11 = 0;
                        callbacks.foxtrot(orderTask, order, new Function1() { // from class: Yb.y0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                String amount = (String) obj;
                                switch (i11) {
                                    case 0:
                                        Intrinsics.echo(amount, "amount");
                                        td.h.bravo(callbacks, orderTask, order, targetStatus, amount);
                                        return Unit.INSTANCE;
                                    default:
                                        Intrinsics.echo(amount, "amount");
                                        td.h.bravo(callbacks, orderTask, order, targetStatus, amount);
                                        return Unit.INSTANCE;
                                }
                            }
                        }, new Function1() { // from class: Yb.z0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                OrderTask it = (OrderTask) obj;
                                switch (i4) {
                                    case 0:
                                        Intrinsics.echo(it, "it");
                                        C0333u0 c0333u0 = callbacks;
                                        c0333u0.getClass();
                                        c0333u0.alpha.gold(it);
                                        return Unit.INSTANCE;
                                    default:
                                        Intrinsics.echo(it, "it");
                                        C0333u0 c0333u02 = callbacks;
                                        c0333u02.getClass();
                                        c0333u02.alpha.gold(it);
                                        return Unit.INSTANCE;
                                }
                            }
                        });
                        return;
                    } else if (file != null) {
                        td.h.bravo(callbacks, orderTask, order, targetStatus, null);
                        return;
                    } else {
                        final int i12 = 1;
                        callbacks.foxtrot(orderTask, order, new Function1() { // from class: Yb.y0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                String amount = (String) obj;
                                switch (i12) {
                                    case 0:
                                        Intrinsics.echo(amount, "amount");
                                        td.h.bravo(callbacks, orderTask, order, targetStatus, amount);
                                        return Unit.INSTANCE;
                                    default:
                                        Intrinsics.echo(amount, "amount");
                                        td.h.bravo(callbacks, orderTask, order, targetStatus, amount);
                                        return Unit.INSTANCE;
                                }
                            }
                        }, new Function1() { // from class: Yb.z0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                OrderTask it = (OrderTask) obj;
                                switch (i5) {
                                    case 0:
                                        Intrinsics.echo(it, "it");
                                        C0333u0 c0333u0 = callbacks;
                                        c0333u0.getClass();
                                        c0333u0.alpha.gold(it);
                                        return Unit.INSTANCE;
                                    default:
                                        Intrinsics.echo(it, "it");
                                        C0333u0 c0333u02 = callbacks;
                                        c0333u02.getClass();
                                        c0333u02.alpha.gold(it);
                                        return Unit.INSTANCE;
                                }
                            }
                        });
                        return;
                    }
                }
            }
            if ((orderTask.getTaskType() == taskType2 || orderTask.getTaskType() == TaskType.ON_DEMAND_PICK_UP) && targetStatus == TaskStatus.COMPLETED) {
                Platform platform5 = order.getPlatform();
                if (platform5 != null && (settings4 = platform5.getSettings()) != null) {
                    z13 = Intrinsics.areEqual(settings4.getPickupTaskConfirmationImageRequired(), Boolean.TRUE);
                } else {
                    z13 = false;
                }
                if (z13) {
                    String quebec2 = L9.d.quebec(processOrderActivityV2, orderTask.generateImageId());
                    if (quebec2 != null) {
                        file3 = new File(quebec2);
                    }
                    file3 = null;
                    if (file3 == null) {
                        L9.d.pink(processOrderActivityV2, callbacks.delta(R.string.take_proof_description));
                        return;
                    } else {
                        td.h.alpha(callbacks, orderTask, targetStatus, null, file3);
                        return;
                    }
                }
            }
            if (orderTask.getTaskType() == TaskType.DELIVERY && targetStatus == TaskStatus.COMPLETED) {
                Order order3 = processOrderActivityV2.f12418i0;
                if (order3 != null && (platform = order3.getPlatform()) != null && (settings5 = platform.getSettings()) != null) {
                    z14 = Intrinsics.areEqual(settings5.getDeliveryTaskConfirmationImageRequired(), Boolean.TRUE);
                } else {
                    z14 = false;
                }
                List<String> deliveryProofImages = orderTask.getDeliveryProofImages();
                if (deliveryProofImages == null || deliveryProofImages.isEmpty()) {
                    i4 = 1;
                }
                if (z14 && i4 != 0) {
                    String string2 = processOrderActivityV2.getString(R.string.take_proof_description);
                    Intrinsics.delta(string2, "getString(...)");
                    L9.d.pink(processOrderActivityV2, string2);
                    return;
                }
                if (z14 && i4 == 0) {
                    List<String> deliveryProofImages2 = orderTask.getDeliveryProofImages();
                    Intrinsics.checkNotNull(deliveryProofImages2);
                    String str5 = (String) CollectionsKt.olive(deliveryProofImages2);
                    if (str5 == null) {
                        L9.d.pink(processOrderActivityV2, W4.alpha(processOrderActivityV2, H9.c.alpha));
                        return;
                    }
                    File file4 = new File(str5);
                    E9.d dVar = processOrderActivityV2.f12390J;
                    if (dVar != null) {
                        H9.m bravo = ((F9.j) dVar).bravo(file4);
                        if (bravo instanceof H9.k) {
                            L9.d.pink(processOrderActivityV2, W4.alpha(processOrderActivityV2, ((H9.k) bravo).alpha));
                            return;
                        } else {
                            processOrderActivityV2.ochre(orderTask, targetStatus, file4);
                            return;
                        }
                    }
                    Intrinsics.lima("imageValidator");
                    throw null;
                }
                processOrderActivityV2.ochre(orderTask, targetStatus, null);
                return;
            }
            if (orderTask.getTaskType() == TaskType.RETURNING && targetStatus == TaskStatus.COMPLETED && Intrinsics.areEqual(orderTask.getDeliveryConfirmationCodeRequired(), Boolean.TRUE)) {
                Integer deliveryConfirmationCodeLength = orderTask.getDeliveryConfirmationCodeLength();
                if (deliveryConfirmationCodeLength == null) {
                    L9.d.pink(processOrderActivityV2, callbacks.delta(R.string.invalid_code_length));
                    return;
                } else {
                    new C0304f0(deliveryConfirmationCodeLength.intValue(), new Function1() { // from class: Yb.A0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            switch (i4) {
                                case 0:
                                    String it = (String) obj;
                                    Intrinsics.echo(it, "it");
                                    Integer id6 = orderTask.getId();
                                    if (id6 != null) {
                                        Q0.c.bronze(callbacks, id6.intValue(), targetStatus, null, it, null, null, 116);
                                        return Unit.INSTANCE;
                                    }
                                    return Unit.INSTANCE;
                                default:
                                    String imagePath = (String) obj;
                                    Intrinsics.echo(imagePath, "imagePath");
                                    Integer id7 = orderTask.getId();
                                    if (id7 != null) {
                                        Q0.c.bronze(callbacks, id7.intValue(), targetStatus, null, null, new File(imagePath), null, 92);
                                        return Unit.INSTANCE;
                                    }
                                    return Unit.INSTANCE;
                            }
                        }
                    }).romeo(processOrderActivityV2.getSupportFragmentManager(), "PinVerificationDialog");
                    return;
                }
            }
            TaskType taskType3 = orderTask.getTaskType();
            TaskType taskType4 = TaskType.RETURN_TO_AREA;
            if (taskType3 == taskType4 && order.getEnableAttendanceForReturnToAreaTask() && targetStatus == TaskStatus.COMPLETED && !Intrinsics.areEqual(orderTask.getReturnableItemsRequired(), Boolean.TRUE)) {
                processOrderActivityV2.f12419j0 = orderTask;
                callbacks.golf();
                return;
            }
            if (orderTask.getTaskType() == taskType4 && Intrinsics.areEqual(orderTask.getReturnableItemsRequired(), Boolean.TRUE) && targetStatus == TaskStatus.COMPLETED) {
                Function1 function1 = new Function1() { // from class: Yb.A0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        switch (i5) {
                            case 0:
                                String it = (String) obj;
                                Intrinsics.echo(it, "it");
                                Integer id6 = orderTask.getId();
                                if (id6 != null) {
                                    Q0.c.bronze(callbacks, id6.intValue(), targetStatus, null, it, null, null, 116);
                                    return Unit.INSTANCE;
                                }
                                return Unit.INSTANCE;
                            default:
                                String imagePath = (String) obj;
                                Intrinsics.echo(imagePath, "imagePath");
                                Integer id7 = orderTask.getId();
                                if (id7 != null) {
                                    Q0.c.bronze(callbacks, id7.intValue(), targetStatus, null, null, new File(imagePath), null, 92);
                                    return Unit.INSTANCE;
                                }
                                return Unit.INSTANCE;
                        }
                    }
                };
                C0307h c0307h = new C0307h();
                c0307h.f2418v = function1;
                c0307h.romeo(processOrderActivityV2.getSupportFragmentManager(), null);
                return;
            }
            Integer id6 = orderTask.getId();
            if (id6 != null) {
                Q0.c.bronze(callbacks, id6.intValue(), targetStatus, null, null, null, null, 124);
            }
        }
    }
}
