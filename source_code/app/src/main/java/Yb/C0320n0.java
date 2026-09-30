package Yb;

import android.content.Context;
import android.content.Intent;
import android.location.Location;
import com.app.base.BaseViewModel;
import com.app.feature.location.store.LastSentLocationStore;
import com.app.network.network.models.Captain;
import com.app.network.network.models.Order;
import com.app.network.network.models.OrderAddress;
import com.app.network.network.models.OrderTask;
import com.app.network.network.models.TaskStatus;
import com.app.network.network.models.TaskType;
import com.app.network.network.models.UserInfo;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.tasks.Task;
import com.incognia.EventProperties;
import delivery.samurai.android.services.CaptainLocationMonitoringService;
import delivery.samurai.android.ui.allocation.OrdersViewModel;
import delivery.samurai.android.ui.orders.v2.ProcessOrderActivityV2;
import delivery.samurai.android.ui.scanner.ScannerActivity;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p3.ah;
import r3.C2492a;
import s6.AbstractC2680i6;
import s6.AbstractC2681i7;
import s6.AbstractC2744p7;
import t6.AbstractC3016k2;
import z3.C3462a;

/* renamed from: Yb.n0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0320n0 implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ File f2429a;
    public final /* synthetic */ int alpha;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f2430b;
    public final /* synthetic */ ProcessOrderActivityV2 purple;
    public final /* synthetic */ int red;
    public final /* synthetic */ TaskStatus silver;
    public final /* synthetic */ String teal;
    public final /* synthetic */ String white;
    public final /* synthetic */ String yellow;

    public /* synthetic */ C0320n0(ProcessOrderActivityV2 processOrderActivityV2, int i4, TaskStatus taskStatus, String str, String str2, String str3, File file, String str4, int i5) {
        this.alpha = i5;
        this.purple = processOrderActivityV2;
        this.red = i4;
        this.silver = taskStatus;
        this.teal = str;
        this.white = str2;
        this.yellow = str3;
        this.f2429a = file;
        this.f2430b = str4;
    }

    /* JADX WARN: Removed duplicated region for block: B:237:0x04d6  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0500  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x05ed  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x061a  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0630  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0644  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0661  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x065a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:296:0x05fe  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x05f4  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x04dd  */
    /* JADX WARN: Type inference failed for: r11v2, types: [androidx.lifecycle.au, androidx.lifecycle.az] */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        File file;
        List<OrderTask> tasks;
        Object obj2;
        String generateImageId;
        File file2;
        String str;
        String str2;
        String str3;
        File file3;
        String str4;
        Pair pair;
        Integer num;
        String str5;
        File file4;
        String str6;
        String str7;
        Order order;
        List<OrderTask> tasks2;
        Iterator<T> it;
        Object obj3;
        OrderTask orderTask;
        Integer num2;
        List<OrderTask> tasks3;
        Object obj4;
        OrderAddress address;
        Float latitude;
        double d4;
        double d9;
        double d10;
        long j5;
        long j6;
        ProcessOrderActivityV2 processOrderActivityV2;
        TaskStatus taskStatus;
        String str8;
        double d11;
        final String str9;
        boolean z2;
        double d12;
        UserInfo sierra;
        Captain captain;
        Object m206constructorimpl;
        double d13;
        long j7;
        TaskType taskType;
        String str10;
        Integer id2;
        String num3;
        OrderTask orderTask2;
        TaskStatus taskStatus2;
        TaskType taskType2;
        TaskType taskType3;
        List<OrderTask> tasks4;
        int i4;
        Integer id3;
        int i5;
        Integer num4;
        String str11;
        Double d14;
        Double d15;
        Double d16;
        Double d17;
        Float longitude;
        Float latitude2;
        Captain captain2;
        Integer id4;
        List<OrderTask> tasks5;
        OrderTask orderTask3;
        TaskStatus taskStatus3;
        List<OrderTask> tasks6;
        Object obj5;
        String juliet;
        Integer num5 = null;
        switch (this.alpha) {
            case 0:
                ProcessOrderActivityV2 processOrderActivityV22 = this.purple;
                int i10 = this.red;
                TaskStatus status = this.silver;
                String str12 = this.teal;
                String str13 = this.white;
                String str14 = this.yellow;
                File file5 = this.f2429a;
                String str15 = this.f2430b;
                Location location = (Location) obj;
                int i11 = ProcessOrderActivityV2.f12378N0;
                if (!processOrderActivityV22.isDestroyed() && !processOrderActivityV22.isFinishing()) {
                    OrdersViewModel ivory = processOrderActivityV22.ivory();
                    Order order2 = processOrderActivityV22.f12418i0;
                    if (order2 != null && (tasks = order2.getTasks()) != null) {
                        Iterator<T> it2 = tasks.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                obj2 = it2.next();
                                Integer id5 = ((OrderTask) obj2).getId();
                                if (id5 != null && id5.intValue() == i10) {
                                }
                            } else {
                                obj2 = null;
                            }
                        }
                        OrderTask orderTask4 = (OrderTask) obj2;
                        if (orderTask4 != null && (generateImageId = orderTask4.generateImageId()) != null) {
                            String juliet2 = L9.d.juliet(processOrderActivityV22, generateImageId);
                            if (juliet2 != null) {
                                file2 = new File(juliet2);
                            } else {
                                file2 = null;
                            }
                            file = file2;
                            Intrinsics.echo(status, "status");
                            ?? auVar = new androidx.lifecycle.au(new C2492a(2, "loading"));
                            ivory.india = null;
                            BaseViewModel.launchApi$default(ivory, null, new na.t(ivory, file, file5, auVar, i10, status, location, str12, str15, str13, str14, null), 1, null);
                            auVar.observe(processOrderActivityV22, new Dc.t(14, new C0320n0(processOrderActivityV22, i10, status, str12, str13, str14, file5, str15, 1)));
                            return Unit.INSTANCE;
                        }
                    }
                    file = null;
                    Intrinsics.echo(status, "status");
                    ?? auVar2 = new androidx.lifecycle.au(new C2492a(2, "loading"));
                    ivory.india = null;
                    BaseViewModel.launchApi$default(ivory, null, new na.t(ivory, file, file5, auVar2, i10, status, location, str12, str15, str13, str14, null), 1, null);
                    auVar2.observe(processOrderActivityV22, new Dc.t(14, new C0320n0(processOrderActivityV22, i10, status, str12, str13, str14, file5, str15, 1)));
                    return Unit.INSTANCE;
                }
                return Unit.INSTANCE;
            default:
                ProcessOrderActivityV2 processOrderActivityV23 = this.purple;
                final int i12 = this.red;
                TaskStatus taskStatus4 = this.silver;
                String str16 = this.teal;
                String str17 = this.white;
                String str18 = this.yellow;
                File file6 = this.f2429a;
                String str19 = this.f2430b;
                C2492a c2492a = (C2492a) obj;
                int i13 = ProcessOrderActivityV2.f12378N0;
                Intrinsics.checkNotNull(c2492a);
                processOrderActivityV23.getClass();
                int i14 = c2492a.alpha;
                if (i14 != 0) {
                    if (i14 != 1) {
                        if (i14 == 2) {
                            processOrderActivityV23.bronze();
                        }
                    } else {
                        processOrderActivityV23.tango();
                        ((androidx.compose.runtime.t0) processOrderActivityV23.f12407X).setValue(null);
                        String str20 = processOrderActivityV23.f12420k0;
                        if (str20 != null && (juliet = L9.d.juliet(processOrderActivityV23, str20)) != null) {
                            new File(juliet).delete();
                        }
                        Order order3 = processOrderActivityV23.f12418i0;
                        if (order3 != null && (tasks6 = order3.getTasks()) != null) {
                            Iterator<T> it3 = tasks6.iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    obj5 = it3.next();
                                    Integer id6 = ((OrderTask) obj5).getId();
                                    if (id6 != null && id6.intValue() == i12) {
                                    }
                                } else {
                                    obj5 = null;
                                }
                            }
                            orderTask2 = (OrderTask) obj5;
                        } else {
                            orderTask2 = null;
                        }
                        if (orderTask2 != null) {
                            OrderTask orderTask5 = (OrderTask) c2492a.charlie;
                            if (orderTask5 != null) {
                                taskStatus3 = orderTask5.getTaskStatus();
                            } else {
                                taskStatus3 = null;
                            }
                            orderTask2.setTaskStatus(taskStatus3);
                        }
                        if (orderTask2 != null) {
                            if ((orderTask2.getTaskType() == TaskType.PICK_UP || orderTask2.getTaskType() == TaskType.ON_DEMAND_PICK_UP) && orderTask2.getTaskStatus() == TaskStatus.COMPLETED) {
                                orderTask3 = orderTask2;
                            } else {
                                orderTask3 = null;
                            }
                            if (orderTask3 != null) {
                                String taskImageId = orderTask3.generateImageId();
                                AtomicInteger atomicInteger = L9.d.alpha;
                                Intrinsics.echo(taskImageId, "taskImageId");
                                L9.k.golf(processOrderActivityV23).edit().remove(taskImageId.concat("_proof")).apply();
                            }
                        }
                        if (orderTask2 != null) {
                            taskStatus2 = orderTask2.getTaskStatus();
                        } else {
                            taskStatus2 = null;
                        }
                        if (taskStatus2 == TaskStatus.COMPLETED) {
                            Integer id7 = orderTask2.getId();
                            if (id7 != null) {
                                int intValue = id7.intValue();
                                processOrderActivityV23.getSharedPreferences("on_demand_invoice_qr", 0).edit().remove("qr_for_task_" + intValue).apply();
                                processOrderActivityV23.getSharedPreferences("on_demand_entered_amount", 0).edit().remove("entered_amount_for_task_" + intValue).apply();
                            }
                            Order order4 = processOrderActivityV23.f12418i0;
                            if (order4 != null && (id4 = order4.getId()) != null) {
                                int intValue2 = id4.intValue();
                                Order order5 = processOrderActivityV23.f12418i0;
                                if (order5 != null && (tasks5 = order5.getTasks()) != null) {
                                    if (!tasks5.isEmpty()) {
                                        for (OrderTask orderTask6 : tasks5) {
                                            if (orderTask6.getTaskStatus() == TaskStatus.COMPLETED || orderTask6.getTaskStatus() == TaskStatus.CANCELLED) {
                                            }
                                        }
                                    }
                                    processOrderActivityV23.getSharedPreferences("on_demand_amounts", 0).edit().remove("amount_for_order_" + intValue2).apply();
                                    processOrderActivityV23.getSharedPreferences("on_demand_intro", 0).edit().remove("shown_window_for_order_" + intValue2).apply();
                                }
                            }
                        }
                        ((androidx.compose.runtime.t0) processOrderActivityV23.f12431w0).setValue(processOrderActivityV23.f12418i0);
                        if (orderTask2 != null) {
                            taskType2 = orderTask2.getTaskType();
                        } else {
                            taskType2 = null;
                        }
                        if (taskType2 == TaskType.DELIVERY && orderTask2.getTaskStatus() == TaskStatus.COMPLETED) {
                            Context lima = processOrderActivityV23.lima();
                            Integer id8 = orderTask2.getId();
                            if (id8 != null) {
                                i5 = id8.intValue();
                            } else {
                                i5 = -1;
                            }
                            AtomicInteger atomicInteger2 = L9.d.alpha;
                            Intrinsics.echo(lima, "<this>");
                            if (!lima.getSharedPreferences("AddressNotesPrefShown", 0).getBoolean("order_complete_dialog_shown_" + i5, false)) {
                                boolean lima2 = L9.d.lima(processOrderActivityV23.lima());
                                UserInfo sierra2 = L9.d.sierra(processOrderActivityV23.lima());
                                if (sierra2 != null && (captain2 = sierra2.getCaptain()) != null) {
                                    num4 = captain2.getId();
                                } else {
                                    num4 = null;
                                }
                                String valueOf = String.valueOf(num4);
                                String kilo = L9.d.kilo(processOrderActivityV23.lima());
                                Integer orderId = orderTask2.getOrderId();
                                if (orderId != null) {
                                    str11 = orderId.toString();
                                } else {
                                    str11 = null;
                                }
                                if (str11 != null && lima2) {
                                    LastSentLocationStore lastSentLocationStore = processOrderActivityV23.f12394L;
                                    if (lastSentLocationStore != null) {
                                        Location location2 = lastSentLocationStore.get();
                                        O9.a aVar = O9.a.alpha;
                                        if (location2 != null) {
                                            d14 = Double.valueOf(location2.getLatitude());
                                        } else {
                                            d14 = null;
                                        }
                                        if (location2 != null) {
                                            d15 = Double.valueOf(location2.getLongitude());
                                        } else {
                                            d15 = null;
                                        }
                                        OrderAddress address2 = orderTask2.getAddress();
                                        if (address2 != null && (latitude2 = address2.getLatitude()) != null) {
                                            d16 = Double.valueOf(latitude2.floatValue());
                                        } else {
                                            d16 = null;
                                        }
                                        OrderAddress address3 = orderTask2.getAddress();
                                        if (address3 != null && (longitude = address3.getLongitude()) != null) {
                                            d17 = Double.valueOf(longitude.floatValue());
                                        } else {
                                            d17 = null;
                                        }
                                        EventProperties alpha = O9.e.alpha(d14, d15, kilo);
                                        alpha.set("order_id", str11);
                                        if (d16 != null) {
                                            alpha.set("delivery_lat", String.valueOf(d16.doubleValue()));
                                        }
                                        if (d17 != null) {
                                            alpha.set("delivery_long", String.valueOf(d17.doubleValue()));
                                        }
                                        O9.e.delta("delivery-confirmed", valueOf, aVar, alpha);
                                    } else {
                                        Intrinsics.lima("lastSentLocationStore");
                                        throw null;
                                    }
                                }
                                OrderTask orderTask7 = (OrderTask) c2492a.charlie;
                                if (orderTask7 != null) {
                                    num5 = orderTask7.getRemainingAddressNoteInputSeconds();
                                }
                                Ac.l lVar = new Ac.l(processOrderActivityV23, orderTask2, num5, 7);
                                W w4 = new W();
                                w4.f2343u = lVar;
                                w4.f14101q = true;
                                w4.romeo(processOrderActivityV23.getSupportFragmentManager(), "");
                            }
                        }
                        if (orderTask2 != null) {
                            taskType3 = orderTask2.getTaskType();
                        } else {
                            taskType3 = null;
                        }
                        if (taskType3 == TaskType.RETURN_TO_AREA && orderTask2.getTaskStatus() == TaskStatus.COMPLETED) {
                            C3462a.alpha("ProcessOrderV2", 12, av.q.delta(i12, "evt=RETURN_TO_AREA_TASK_SUCCESS taskId=", " calling onRefresh"), null);
                            Order order6 = processOrderActivityV23.f12418i0;
                            if (order6 != null && (id3 = order6.getId()) != null) {
                                L9.d.delta(id3.intValue(), processOrderActivityV23.lima());
                            }
                            Order order7 = processOrderActivityV23.f12418i0;
                            if (order7 != null && (tasks4 = order7.getTasks()) != null) {
                                ArrayList arrayList = new ArrayList();
                                for (Object obj6 : tasks4) {
                                    if (((OrderTask) obj6).getTaskType() == TaskType.RETURN_TO_AREA) {
                                        arrayList.add(obj6);
                                    }
                                }
                                Iterator it4 = arrayList.iterator();
                                while (it4.hasNext()) {
                                    OrderTask orderTask8 = (OrderTask) it4.next();
                                    Context lima3 = processOrderActivityV23.lima();
                                    Integer id9 = orderTask8.getId();
                                    if (id9 != null) {
                                        i4 = id9.intValue();
                                    } else {
                                        i4 = -1;
                                    }
                                    AtomicInteger atomicInteger3 = L9.d.alpha;
                                    Intrinsics.echo(lima3, "<this>");
                                    lima3.getSharedPreferences("AddressNotesPrefShown", 0).edit().remove("order_complete_dialog_shown_" + i4).apply();
                                }
                            }
                            processOrderActivityV23.amber(false);
                        } else {
                            processOrderActivityV23.amber(false);
                        }
                    }
                } else {
                    processOrderActivityV23.tango();
                    ((androidx.compose.runtime.t0) processOrderActivityV23.f12407X).setValue(null);
                    L9.d.pink(processOrderActivityV23, String.valueOf(c2492a.bravo));
                    String name = taskStatus4.name();
                    String str21 = c2492a.bravo;
                    StringBuilder lima4 = A0.z.lima("POST_ERROR taskId=", " status=", name, " msg=", i12);
                    lima4.append(str21);
                    String sb2 = lima4.toString();
                    LastSentLocationStore lastSentLocationStore2 = processOrderActivityV23.f12394L;
                    if (lastSentLocationStore2 != null) {
                        AbstractC2744p7.bravo(processOrderActivityV23, sb2, lastSentLocationStore2);
                        if (taskStatus4 == TaskStatus.COMPLETED && (num2 = processOrderActivityV23.ivory().india) != null && num2.intValue() == 403) {
                            Order order8 = processOrderActivityV23.f12418i0;
                            LastSentLocationStore lastSentLocationStore3 = processOrderActivityV23.f12394L;
                            if (lastSentLocationStore3 != null) {
                                if (order8 != null && (tasks3 = order8.getTasks()) != null) {
                                    Iterator<T> it5 = tasks3.iterator();
                                    while (true) {
                                        if (it5.hasNext()) {
                                            obj4 = it5.next();
                                            Integer id10 = ((OrderTask) obj4).getId();
                                            if (id10 != null && id10.intValue() == i12) {
                                            }
                                        } else {
                                            obj4 = null;
                                        }
                                    }
                                    OrderTask orderTask9 = (OrderTask) obj4;
                                    if (orderTask9 != null && (address = orderTask9.getAddress()) != null && (latitude = address.getLatitude()) != null) {
                                        float floatValue = latitude.floatValue();
                                        Float longitude2 = address.getLongitude();
                                        if (longitude2 != null) {
                                            final double d18 = floatValue;
                                            double floatValue2 = longitude2.floatValue();
                                            Location location3 = lastSentLocationStore3.get();
                                            if (location3 != null) {
                                                d4 = location3.getLatitude();
                                            } else {
                                                d4 = 0.0d;
                                            }
                                            if (location3 != null) {
                                                d9 = location3.getLongitude();
                                            } else {
                                                d9 = 0.0d;
                                            }
                                            if (location3 != null) {
                                                d10 = floatValue2;
                                                j5 = location3.getTime();
                                            } else {
                                                d10 = floatValue2;
                                                j5 = 0;
                                            }
                                            long currentTimeMillis = System.currentTimeMillis();
                                            if (j5 > 0) {
                                                j6 = currentTimeMillis - j5;
                                            } else {
                                                j6 = -1;
                                            }
                                            str = str16;
                                            str2 = str17;
                                            final long j10 = j6;
                                            if (j5 > 0) {
                                                try {
                                                    processOrderActivityV2 = processOrderActivityV23;
                                                    taskStatus = taskStatus4;
                                                    try {
                                                        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
                                                        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
                                                        str8 = simpleDateFormat.format(new Date(j5));
                                                    } catch (Exception unused) {
                                                        str8 = "";
                                                        d11 = d10;
                                                        str9 = str8;
                                                        if (d4 != 0.0d) {
                                                        }
                                                        z2 = false;
                                                        final double d19 = d4;
                                                        d12 = d9;
                                                        final float charlie = AbstractC2680i6.charlie(d19, d12, d18, d11);
                                                        final boolean z10 = z2;
                                                        final double d20 = d11;
                                                        sierra = L9.d.sierra(processOrderActivityV2.lima());
                                                        if (sierra == null) {
                                                        }
                                                        Result.Companion companion = Result.INSTANCE;
                                                        m206constructorimpl = Result.m206constructorimpl((p3.ah) CaptainLocationMonitoringService.f12067E.getValue());
                                                        if (m206constructorimpl instanceof kotlin.k) {
                                                        }
                                                        final p3.ah ahVar = (p3.ah) m206constructorimpl;
                                                        boolean z11 = CaptainLocationMonitoringService.f12066D;
                                                        boolean bravo = AbstractC3016k2.bravo(processOrderActivityV2);
                                                        j7 = currentTimeMillis;
                                                        boolean xray = L9.d.xray(processOrderActivityV2);
                                                        K7.b alpha2 = K7.b.alpha();
                                                        StringBuilder sb3 = new StringBuilder();
                                                        d13 = d12;
                                                        sb3.append("ProximityRisk taskId=");
                                                        sb3.append(i12);
                                                        sb3.append(" lastSentAgeMs=");
                                                        sb3.append(j10);
                                                        sb3.append(" serviceEnabled=");
                                                        sb3.append(bravo);
                                                        sb3.append(" stompState=");
                                                        sb3.append(ahVar);
                                                        sb3.append(" serviceRunning=");
                                                        sb3.append(xray);
                                                        alpha2.bravo(sb3.toString());
                                                        taskType = orderTask9.getTaskType();
                                                        if (taskType != null) {
                                                        }
                                                        String str22 = "";
                                                        if (captain != null) {
                                                        }
                                                        str10 = "";
                                                        final String str23 = d18 + Constants.SEPARATOR_COMMA + d20;
                                                        StringBuilder sb4 = new StringBuilder();
                                                        sb4.append(d19);
                                                        sb4.append(Constants.SEPARATOR_COMMA);
                                                        final String str24 = str22;
                                                        final double d21 = d13;
                                                        sb4.append(d21);
                                                        final String sb5 = sb4.toString();
                                                        FusedLocationProviderClient fusedLocationProviderClient = LocationServices.getFusedLocationProviderClient((Context) processOrderActivityV2);
                                                        Intrinsics.delta(fusedLocationProviderClient, "getFusedLocationProviderClient(...)");
                                                        Task lastLocation = fusedLocationProviderClient.getLastLocation();
                                                        final long j11 = j7;
                                                        final String str25 = str10;
                                                        str4 = str19;
                                                        final TaskStatus taskStatus5 = taskStatus;
                                                        str3 = str18;
                                                        file3 = file6;
                                                        final ProcessOrderActivityV2 processOrderActivityV24 = processOrderActivityV2;
                                                        G6.e eVar = new G6.e() { // from class: Qb.v
                                                            /* JADX WARN: Multi-variable type inference failed */
                                                            /* JADX WARN: Type inference failed for: r16v0, types: [double] */
                                                            /* JADX WARN: Type inference failed for: r16v1 */
                                                            /* JADX WARN: Type inference failed for: r16v2, types: [boolean] */
                                                            /* JADX WARN: Type inference failed for: r16v4 */
                                                            /* JADX WARN: Type inference failed for: r16v5 */
                                                            /* JADX WARN: Type inference failed for: r16v6 */
                                                            /* JADX WARN: Type inference failed for: r16v7 */
                                                            /* JADX WARN: Type inference failed for: r16v8 */
                                                            /* JADX WARN: Type inference failed for: r18v0, types: [boolean] */
                                                            /* JADX WARN: Type inference failed for: r18v1 */
                                                            /* JADX WARN: Type inference failed for: r18v2, types: [java.lang.String] */
                                                            /* JADX WARN: Type inference failed for: r18v4 */
                                                            /* JADX WARN: Type inference failed for: r18v5 */
                                                            /* JADX WARN: Type inference failed for: r18v6 */
                                                            /* JADX WARN: Type inference failed for: r18v7 */
                                                            /* JADX WARN: Type inference failed for: r18v8 */
                                                            @Override // G6.e
                                                            public final void onComplete(Task locationTask) {
                                                                Context context;
                                                                int i15;
                                                                long j12;
                                                                long j13;
                                                                Location location4;
                                                                double latitude3;
                                                                String str26;
                                                                long time;
                                                                double d22 = d18;
                                                                double d23 = d20;
                                                                double d24 = d19;
                                                                double d25 = d21;
                                                                long j14 = j11;
                                                                float f5 = charlie;
                                                                boolean z12 = z10;
                                                                Context context2 = processOrderActivityV24;
                                                                String str27 = str24;
                                                                int i16 = i12;
                                                                ?? r16 = d25;
                                                                String str28 = str25;
                                                                ah ahVar2 = ahVar;
                                                                TaskStatus taskStatus6 = taskStatus5;
                                                                String str29 = str23;
                                                                String str30 = sb5;
                                                                String str31 = str9;
                                                                long j15 = j10;
                                                                ?? r18 = z12;
                                                                Intrinsics.echo(locationTask, "locationTask");
                                                                try {
                                                                    if (locationTask.juliet()) {
                                                                        location4 = (Location) locationTask.hotel();
                                                                    } else {
                                                                        location4 = null;
                                                                    }
                                                                    try {
                                                                        if (location4 != null) {
                                                                            try {
                                                                                latitude3 = location4.getLatitude();
                                                                            } catch (Exception unused2) {
                                                                                r16 = r18;
                                                                                context = context2;
                                                                                r18 = str27;
                                                                                i15 = i16;
                                                                            }
                                                                            try {
                                                                                double longitude3 = location4.getLongitude();
                                                                                float charlie2 = AbstractC2680i6.charlie(latitude3, longitude3, d22, d23);
                                                                                j12 = j15;
                                                                                try {
                                                                                    float charlie3 = AbstractC2680i6.charlie(latitude3, longitude3, d24, r16);
                                                                                    try {
                                                                                        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
                                                                                        simpleDateFormat2.setTimeZone(TimeZone.getTimeZone("UTC"));
                                                                                        str26 = simpleDateFormat2.format(new Date(location4.getTime()));
                                                                                    } catch (Exception unused3) {
                                                                                        str26 = "";
                                                                                    }
                                                                                    String str32 = str26;
                                                                                    if (location4.getTime() > 0) {
                                                                                        try {
                                                                                            time = j14 - location4.getTime();
                                                                                        } catch (Exception unused4) {
                                                                                            f5 = f5;
                                                                                            r16 = r18;
                                                                                            context = context2;
                                                                                            r18 = str27;
                                                                                            i15 = i16;
                                                                                            j13 = j14;
                                                                                            AbstractC2681i7.alpha(f5, r16, context, r18, i15, str28, ahVar2, j13, taskStatus6, str29, str30, str31, j12, null, Float.NaN, Float.NaN, "", -1L, false);
                                                                                        }
                                                                                    } else {
                                                                                        time = -1;
                                                                                    }
                                                                                    long j16 = time;
                                                                                    String str33 = latitude3 + Constants.SEPARATOR_COMMA + longitude3;
                                                                                    Intrinsics.checkNotNull(str32);
                                                                                    AbstractC2681i7.alpha(f5, r18, context2, str27, i16, str28, ahVar2, j14, taskStatus6, str29, str30, str31, j12, str33, charlie2, charlie3, str32, j16, true);
                                                                                } catch (Exception unused5) {
                                                                                    r16 = r18;
                                                                                    context = context2;
                                                                                    r18 = str27;
                                                                                    i15 = i16;
                                                                                    j13 = j14;
                                                                                    f5 = f5;
                                                                                }
                                                                            } catch (Exception unused6) {
                                                                                r16 = r18;
                                                                                context = context2;
                                                                                r18 = str27;
                                                                                i15 = i16;
                                                                                j12 = j15;
                                                                                j13 = j14;
                                                                                AbstractC2681i7.alpha(f5, r16, context, r18, i15, str28, ahVar2, j13, taskStatus6, str29, str30, str31, j12, null, Float.NaN, Float.NaN, "", -1L, false);
                                                                            }
                                                                        } else {
                                                                            AbstractC2681i7.alpha(f5, r18, context2, str27, i16, str28, ahVar2, j14, taskStatus6, str29, str30, str31, j15, null, Float.NaN, Float.NaN, "", -1L, false);
                                                                        }
                                                                    } catch (Exception unused7) {
                                                                    }
                                                                } catch (Exception unused8) {
                                                                    context = context2;
                                                                    i15 = i16;
                                                                    j12 = j15;
                                                                    j13 = j14;
                                                                    r16 = r18;
                                                                    r18 = str27;
                                                                }
                                                            }
                                                        };
                                                        processOrderActivityV23 = processOrderActivityV24;
                                                        i12 = i12;
                                                        taskStatus4 = taskStatus5;
                                                        lastLocation.bravo(eVar);
                                                        pair = (Pair) processOrderActivityV23.ivory().getErrorObserver().getValue();
                                                        if (pair != null) {
                                                        }
                                                        if (num == null) {
                                                        }
                                                        str5 = str3;
                                                        file4 = file3;
                                                        str6 = str4;
                                                        str7 = str;
                                                        if (num != null) {
                                                        }
                                                        if (str5 != null) {
                                                        }
                                                        return Unit.INSTANCE;
                                                    }
                                                } catch (Exception unused2) {
                                                    processOrderActivityV2 = processOrderActivityV23;
                                                    taskStatus = taskStatus4;
                                                }
                                                d11 = d10;
                                                str9 = str8;
                                            } else {
                                                processOrderActivityV2 = processOrderActivityV23;
                                                taskStatus = taskStatus4;
                                                d11 = d10;
                                                str9 = "";
                                            }
                                            if (d4 != 0.0d && d9 == 0.0d) {
                                                z2 = true;
                                            } else {
                                                z2 = false;
                                            }
                                            final double d192 = d4;
                                            d12 = d9;
                                            final float charlie2 = AbstractC2680i6.charlie(d192, d12, d18, d11);
                                            final boolean z102 = z2;
                                            final double d202 = d11;
                                            sierra = L9.d.sierra(processOrderActivityV2.lima());
                                            if (sierra == null) {
                                                captain = sierra.getCaptain();
                                            } else {
                                                captain = null;
                                            }
                                            try {
                                                Result.Companion companion2 = Result.INSTANCE;
                                                m206constructorimpl = Result.m206constructorimpl((p3.ah) CaptainLocationMonitoringService.f12067E.getValue());
                                            } catch (Throwable th) {
                                                Result.Companion companion3 = Result.INSTANCE;
                                                m206constructorimpl = Result.m206constructorimpl(ResultKt.createFailure(th));
                                            }
                                            if (m206constructorimpl instanceof kotlin.k) {
                                                m206constructorimpl = null;
                                            }
                                            final p3.ah ahVar2 = (p3.ah) m206constructorimpl;
                                            try {
                                                boolean z112 = CaptainLocationMonitoringService.f12066D;
                                                boolean bravo2 = AbstractC3016k2.bravo(processOrderActivityV2);
                                                j7 = currentTimeMillis;
                                                try {
                                                    boolean xray2 = L9.d.xray(processOrderActivityV2);
                                                    K7.b alpha22 = K7.b.alpha();
                                                    StringBuilder sb32 = new StringBuilder();
                                                    d13 = d12;
                                                    try {
                                                        sb32.append("ProximityRisk taskId=");
                                                        sb32.append(i12);
                                                        sb32.append(" lastSentAgeMs=");
                                                        sb32.append(j10);
                                                        sb32.append(" serviceEnabled=");
                                                        sb32.append(bravo2);
                                                        sb32.append(" stompState=");
                                                        sb32.append(ahVar2);
                                                        sb32.append(" serviceRunning=");
                                                        sb32.append(xray2);
                                                        alpha22.bravo(sb32.toString());
                                                    } catch (Exception unused3) {
                                                    }
                                                } catch (Exception unused4) {
                                                    d13 = d12;
                                                }
                                            } catch (Exception unused5) {
                                                d13 = d12;
                                                j7 = currentTimeMillis;
                                            }
                                            taskType = orderTask9.getTaskType();
                                            if (taskType != null || (str22 = taskType.name()) == null) {
                                                String str222 = "";
                                            }
                                            if (captain != null || (id2 = captain.getId()) == null || (num3 = id2.toString()) == null) {
                                                str10 = "";
                                            } else {
                                                str10 = num3;
                                            }
                                            final String str232 = d18 + Constants.SEPARATOR_COMMA + d202;
                                            StringBuilder sb42 = new StringBuilder();
                                            sb42.append(d192);
                                            sb42.append(Constants.SEPARATOR_COMMA);
                                            final String str242 = str222;
                                            final double d212 = d13;
                                            sb42.append(d212);
                                            final String sb52 = sb42.toString();
                                            FusedLocationProviderClient fusedLocationProviderClient2 = LocationServices.getFusedLocationProviderClient((Context) processOrderActivityV2);
                                            Intrinsics.delta(fusedLocationProviderClient2, "getFusedLocationProviderClient(...)");
                                            Task lastLocation2 = fusedLocationProviderClient2.getLastLocation();
                                            final long j112 = j7;
                                            final String str252 = str10;
                                            str4 = str19;
                                            final TaskStatus taskStatus52 = taskStatus;
                                            str3 = str18;
                                            file3 = file6;
                                            final Context processOrderActivityV242 = processOrderActivityV2;
                                            G6.e eVar2 = new G6.e() { // from class: Qb.v
                                                /* JADX WARN: Multi-variable type inference failed */
                                                /* JADX WARN: Type inference failed for: r16v0, types: [double] */
                                                /* JADX WARN: Type inference failed for: r16v1 */
                                                /* JADX WARN: Type inference failed for: r16v2, types: [boolean] */
                                                /* JADX WARN: Type inference failed for: r16v4 */
                                                /* JADX WARN: Type inference failed for: r16v5 */
                                                /* JADX WARN: Type inference failed for: r16v6 */
                                                /* JADX WARN: Type inference failed for: r16v7 */
                                                /* JADX WARN: Type inference failed for: r16v8 */
                                                /* JADX WARN: Type inference failed for: r18v0, types: [boolean] */
                                                /* JADX WARN: Type inference failed for: r18v1 */
                                                /* JADX WARN: Type inference failed for: r18v2, types: [java.lang.String] */
                                                /* JADX WARN: Type inference failed for: r18v4 */
                                                /* JADX WARN: Type inference failed for: r18v5 */
                                                /* JADX WARN: Type inference failed for: r18v6 */
                                                /* JADX WARN: Type inference failed for: r18v7 */
                                                /* JADX WARN: Type inference failed for: r18v8 */
                                                @Override // G6.e
                                                public final void onComplete(Task locationTask) {
                                                    Context context;
                                                    int i15;
                                                    long j12;
                                                    long j13;
                                                    Location location4;
                                                    double latitude3;
                                                    String str26;
                                                    long time;
                                                    double d22 = d18;
                                                    double d23 = d202;
                                                    double d24 = d192;
                                                    double d25 = d212;
                                                    long j14 = j112;
                                                    float f5 = charlie2;
                                                    boolean z12 = z102;
                                                    Context context2 = processOrderActivityV242;
                                                    String str27 = str242;
                                                    int i16 = i12;
                                                    ?? r16 = d25;
                                                    String str28 = str252;
                                                    ah ahVar22 = ahVar2;
                                                    TaskStatus taskStatus6 = taskStatus52;
                                                    String str29 = str232;
                                                    String str30 = sb52;
                                                    String str31 = str9;
                                                    long j15 = j10;
                                                    ?? r18 = z12;
                                                    Intrinsics.echo(locationTask, "locationTask");
                                                    try {
                                                        if (locationTask.juliet()) {
                                                            location4 = (Location) locationTask.hotel();
                                                        } else {
                                                            location4 = null;
                                                        }
                                                        try {
                                                            if (location4 != null) {
                                                                try {
                                                                    latitude3 = location4.getLatitude();
                                                                } catch (Exception unused22) {
                                                                    r16 = r18;
                                                                    context = context2;
                                                                    r18 = str27;
                                                                    i15 = i16;
                                                                }
                                                                try {
                                                                    double longitude3 = location4.getLongitude();
                                                                    float charlie22 = AbstractC2680i6.charlie(latitude3, longitude3, d22, d23);
                                                                    j12 = j15;
                                                                    try {
                                                                        float charlie3 = AbstractC2680i6.charlie(latitude3, longitude3, d24, r16);
                                                                        try {
                                                                            SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
                                                                            simpleDateFormat2.setTimeZone(TimeZone.getTimeZone("UTC"));
                                                                            str26 = simpleDateFormat2.format(new Date(location4.getTime()));
                                                                        } catch (Exception unused32) {
                                                                            str26 = "";
                                                                        }
                                                                        String str32 = str26;
                                                                        if (location4.getTime() > 0) {
                                                                            try {
                                                                                time = j14 - location4.getTime();
                                                                            } catch (Exception unused42) {
                                                                                f5 = f5;
                                                                                r16 = r18;
                                                                                context = context2;
                                                                                r18 = str27;
                                                                                i15 = i16;
                                                                                j13 = j14;
                                                                                AbstractC2681i7.alpha(f5, r16, context, r18, i15, str28, ahVar22, j13, taskStatus6, str29, str30, str31, j12, null, Float.NaN, Float.NaN, "", -1L, false);
                                                                            }
                                                                        } else {
                                                                            time = -1;
                                                                        }
                                                                        long j16 = time;
                                                                        String str33 = latitude3 + Constants.SEPARATOR_COMMA + longitude3;
                                                                        Intrinsics.checkNotNull(str32);
                                                                        AbstractC2681i7.alpha(f5, r18, context2, str27, i16, str28, ahVar22, j14, taskStatus6, str29, str30, str31, j12, str33, charlie22, charlie3, str32, j16, true);
                                                                    } catch (Exception unused52) {
                                                                        r16 = r18;
                                                                        context = context2;
                                                                        r18 = str27;
                                                                        i15 = i16;
                                                                        j13 = j14;
                                                                        f5 = f5;
                                                                    }
                                                                } catch (Exception unused6) {
                                                                    r16 = r18;
                                                                    context = context2;
                                                                    r18 = str27;
                                                                    i15 = i16;
                                                                    j12 = j15;
                                                                    j13 = j14;
                                                                    AbstractC2681i7.alpha(f5, r16, context, r18, i15, str28, ahVar22, j13, taskStatus6, str29, str30, str31, j12, null, Float.NaN, Float.NaN, "", -1L, false);
                                                                }
                                                            } else {
                                                                AbstractC2681i7.alpha(f5, r18, context2, str27, i16, str28, ahVar22, j14, taskStatus6, str29, str30, str31, j15, null, Float.NaN, Float.NaN, "", -1L, false);
                                                            }
                                                        } catch (Exception unused7) {
                                                        }
                                                    } catch (Exception unused8) {
                                                        context = context2;
                                                        i15 = i16;
                                                        j12 = j15;
                                                        j13 = j14;
                                                        r16 = r18;
                                                        r18 = str27;
                                                    }
                                                }
                                            };
                                            processOrderActivityV23 = processOrderActivityV242;
                                            i12 = i12;
                                            taskStatus4 = taskStatus52;
                                            lastLocation2.bravo(eVar2);
                                            pair = (Pair) processOrderActivityV23.ivory().getErrorObserver().getValue();
                                            if (pair != null) {
                                                num = (Integer) pair.getFirst();
                                            } else {
                                                num = null;
                                            }
                                            if (num == null || num.intValue() != 902) {
                                                str5 = str3;
                                                file4 = file3;
                                                str6 = str4;
                                                str7 = str;
                                                if (num != null && num.intValue() == 901) {
                                                    processOrderActivityV23.crimson(new C0316l0(processOrderActivityV23, i12, taskStatus4, str7, str2, str5, file4, str6, 3));
                                                } else if (str5 != null && (order = processOrderActivityV23.f12418i0) != null && (tasks2 = order.getTasks()) != null) {
                                                    it = tasks2.iterator();
                                                    while (true) {
                                                        if (!it.hasNext()) {
                                                            Object next = it.next();
                                                            Integer id11 = ((OrderTask) next).getId();
                                                            if (id11 != null && id11.intValue() == i12) {
                                                                obj3 = next;
                                                            }
                                                        } else {
                                                            obj3 = null;
                                                        }
                                                    }
                                                    orderTask = (OrderTask) obj3;
                                                    if (orderTask != null) {
                                                        processOrderActivityV23.f12409Z = orderTask;
                                                        processOrderActivityV23.f12417h0.alpha(new Intent(processOrderActivityV23, (Class<?>) ScannerActivity.class));
                                                    }
                                                }
                                            } else {
                                                processOrderActivityV23.coral(new C0316l0(processOrderActivityV23, i12, taskStatus4, str, str2, str3, file3, str4, 2));
                                            }
                                        }
                                    }
                                }
                            } else {
                                Intrinsics.lima("lastSentLocationStore");
                                throw null;
                            }
                        }
                        str = str16;
                        str2 = str17;
                        str3 = str18;
                        file3 = file6;
                        str4 = str19;
                        pair = (Pair) processOrderActivityV23.ivory().getErrorObserver().getValue();
                        if (pair != null) {
                        }
                        if (num == null) {
                            processOrderActivityV23.coral(new C0316l0(processOrderActivityV23, i12, taskStatus4, str, str2, str3, file3, str4, 2));
                        }
                        str5 = str3;
                        file4 = file3;
                        str6 = str4;
                        str7 = str;
                        if (num != null) {
                            processOrderActivityV23.crimson(new C0316l0(processOrderActivityV23, i12, taskStatus4, str7, str2, str5, file4, str6, 3));
                        }
                        if (str5 != null) {
                            it = tasks2.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                }
                            }
                            orderTask = (OrderTask) obj3;
                            if (orderTask != null) {
                            }
                        }
                    } else {
                        Intrinsics.lima("lastSentLocationStore");
                        throw null;
                    }
                }
                return Unit.INSTANCE;
        }
    }
}
